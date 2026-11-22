/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import com.google.api.core.BetaApi;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;

/**
 * A {@code @BetaApi} query-execution connection between a Java application and BigQuery (not a
 * standard {@code java.sql.Connection}).
 *
 * <p>Each {@code Connection} is stateful, single-use, and not thread-safe: its internal background
 * executor shuts down once query streaming completes or {@link #close()} is called, and it does not
 * implement {@link AutoCloseable}. Create a new instance per query via {@link
 * BigQuery#createConnection()} or {@link BigQuery#createConnection(ConnectionSettings)} and call
 * {@link #close()} when finished to release local buffers, background threads, and any local
 * Storage Read API client. {@link #close()} does not send a server-side {@code jobs.cancel} RPC;
 * use {@link BigQuery#cancel(JobId)} to cancel a running query job on the server.
 *
 * <p>The {@link java.sql.ResultSet} exposed by {@link BigQueryResult#getResultSet()} is
 * forward-only, read-only, non-thread-safe, and provides only partial JDBC compliance: column-index
 * getters ({@code get*(int)}) use 0-based indexing rather than JDBC's 1-based convention (prefer
 * column-name getters such as {@code getString(String)}), and unimplemented operations (such as
 * {@code close}, {@code getMetaData}, {@code findColumn}, {@code getByte}/{@code getShort}/{@code
 * getFloat}, and scrollable, stream, or updatable APIs) throw {@link
 * java.sql.SQLFeatureNotSupportedException} or {@link RuntimeException}. For production
 * high-throughput reads, prefer the BigQuery Storage Read API ({@code google-cloud-bigquerystorage}
 * / {@code BigQueryReadClient}) directly, or use {@link BigQuery#query(QueryJobConfiguration,
 * BigQuery.JobOption...)} for general SQL queries.
 *
 * @see <a href="https://docs.cloud.google.com/bigquery/docs/reference/storage">BigQuery Storage
 *     Read API</a>
 */
public interface Connection {

  /**
   * Releases local resources held by this connection by signaling end-of-stream on local row
   * buffers, shutting down background fetch threads, and closing any underlying local Storage Read
   * API client (awaiting termination).
   *
   * <p>This method does not send a server-side {@code jobs.cancel} RPC to cancel a running BigQuery
   * query job; use {@link BigQuery#cancel(JobId)} to cancel a job on the server.
   *
   * @return {@code true} if the local background executor and read client terminated cleanly
   * @throws BigQuerySQLException upon failure
   */
  @BetaApi
  boolean close() throws BigQuerySQLException;

  /**
   * Execute a query dry run that returns information on the schema and query parameters of the
   * query results.
   *
   * @param sql typically a static SQL SELECT statement
   * @exception BigQuerySQLException if a database access error occurs
   */
  @BetaApi
  BigQueryDryRunResult dryRun(String sql) throws BigQuerySQLException;

  /**
   * Execute a SQL statement that returns a single ResultSet.
   *
   * <p>Example of running a query.
   *
   * <pre>{@code
   * ConnectionSettings connectionSettings =
   *     ConnectionSettings.newBuilder()
   *         .setRequestTimeout(10000L)
   *         .setMaxResults(100L)
   *         .setUseQueryCache(true)
   *         .build();
   * Connection connection = bigquery.createConnection(connectionSettings);
   * try {
   *   String selectQuery =
   *       "SELECT corpus FROM `bigquery-public-data.samples.shakespeare` GROUP BY corpus;";
   *   BigQueryResult bqResultSet = connection.executeSelect(selectQuery);
   *   ResultSet rs = bqResultSet.getResultSet();
   *   while (rs.next()) {
   *     System.out.printf("%s,", rs.getString("corpus"));
   *   }
   * } finally {
   *   connection.close();
   * }
   * }</pre>
   *
   * @param sql a static SQL SELECT statement
   * @return a ResultSet that contains the data produced by the query
   * @exception BigQuerySQLException if a database access error occurs
   */
  @BetaApi
  BigQueryResult executeSelect(String sql) throws BigQuerySQLException;

  /**
   * This method executes a SQL SELECT query
   *
   * @param sql SQL SELECT query
   * @param parameters named or positional parameters. The set of query parameters must either be
   *     all positional or all named parameters.
   * @param labels (optional) the labels associated with this query. You can use these to organize
   *     and group your query jobs. Label keys and values can be no longer than 63 characters, can
   *     only contain lowercase letters, numeric characters, underscores and dashes. International
   *     characters are allowed. Label values are optional and Label is a Varargs. You should pass
   *     all the Labels in a single Map .Label keys must start with a letter and each label in the
   *     list must have a different key.
   * @return BigQueryResult containing the output of the query
   * @throws BigQuerySQLException
   */
  @BetaApi
  BigQueryResult executeSelect(
      String sql, List<Parameter> parameters, Map<String, String>... labels)
      throws BigQuerySQLException;

  /**
   * Execute a SQL statement that returns a single ResultSet and returns a ListenableFuture to
   * process the response asynchronously.
   *
   * <p>Example of running a query.
   *
   * <pre>{@code
   * ConnectionSettings connectionSettings =
   *     ConnectionSettings.newBuilder()
   *         .setUseReadAPI(true)
   *         .build();
   * Connection connection = bigquery.createConnection(connectionSettings);
   * try {
   *   String selectQuery =
   *       "SELECT corpus FROM `bigquery-public-data.samples.shakespeare` GROUP BY corpus;";
   *   ListenableFuture<ExecuteSelectResponse> executeSelectFuture =
   *       connection.executeSelectAsync(selectQuery);
   *   ExecuteSelectResponse executeSelectRes = executeSelectFuture.get();
   *
   *   if (!executeSelectRes.getIsSuccessful()) {
   *     throw executeSelectRes.getBigQuerySQLException();
   *   }
   *
   *   BigQueryResult bigQueryResult = executeSelectRes.getResultSet();
   *   ResultSet rs = bigQueryResult.getResultSet();
   *   while (rs.next()) {
   *     System.out.println(rs.getString("corpus"));
   *   }
   * } finally {
   *   connection.close();
   * }
   * }</pre>
   *
   * @param sql a static SQL SELECT statement
   * @return a ListenableFuture that is used to get the data produced by the query
   * @throws BigQuerySQLException upon failure
   */
  @BetaApi
  ListenableFuture<ExecuteSelectResponse> executeSelectAsync(String sql)
      throws BigQuerySQLException;

  /**
   * Execute a SQL statement that returns a single ResultSet and returns a ListenableFuture to
   * process the response asynchronously.
   *
   * <p>Example of running a query.
   *
   * <pre>{@code
   * ConnectionSettings connectionSettings =
   *     ConnectionSettings.newBuilder()
   *         .setUseReadAPI(true)
   *         .build();
   * Connection connection = bigquery.createConnection(connectionSettings);
   * try {
   *   String selectQuery =
   *       "SELECT TimestampField, StringField, BooleanField FROM "
   *           + MY_TABLE
   *           + " WHERE StringField = @stringParam"
   *           + " AND IntegerField IN UNNEST(@integerList)";
   *   QueryParameterValue stringParameter = QueryParameterValue.string("stringValue");
   *   QueryParameterValue intArrayParameter =
   *       QueryParameterValue.array(new Integer[] {3, 4}, Integer.class);
   *   Parameter stringParam =
   *       Parameter.newBuilder().setName("stringParam").setValue(stringParameter).build();
   *   Parameter intArrayParam =
   *       Parameter.newBuilder().setName("integerList").setValue(intArrayParameter).build();
   *   List<Parameter> parameters = ImmutableList.of(stringParam, intArrayParam);
   *
   *   ListenableFuture<ExecuteSelectResponse> executeSelectFuture =
   *       connection.executeSelectAsync(selectQuery, parameters);
   *   ExecuteSelectResponse executeSelectRes = executeSelectFuture.get();
   *
   *   if (!executeSelectRes.getIsSuccessful()) {
   *     throw executeSelectRes.getBigQuerySQLException();
   *   }
   *
   *   BigQueryResult bigQueryResult = executeSelectRes.getResultSet();
   *   ResultSet rs = bigQueryResult.getResultSet();
   *   while (rs.next()) {
   *     System.out.println(rs.getString("StringField"));
   *   }
   * } finally {
   *   connection.close();
   * }
   * }</pre>
   *
   * @param sql SQL SELECT query
   * @param parameters named or positional parameters. The set of query parameters must either be
   *     all positional or all named parameters.
   * @param labels (optional) the labels associated with this query. You can use these to organize
   *     and group your query jobs. Label keys and values can be no longer than 63 characters, can
   *     only contain lowercase letters, numeric characters, underscores and dashes. International
   *     characters are allowed. Label values are optional and Label is a Varargs. You should pass
   *     all the Labels in a single Map .Label keys must start with a letter and each label in the
   *     list must have a different key.
   * @return a ListenableFuture that is used to get the data produced by the query
   * @throws BigQuerySQLException upon failure
   */
  @BetaApi
  ListenableFuture<ExecuteSelectResponse> executeSelectAsync(
      String sql, List<Parameter> parameters, Map<String, String>... labels)
      throws BigQuerySQLException;
}
