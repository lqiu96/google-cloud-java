/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import com.google.api.gax.paging.Page;
import com.google.auto.value.AutoValue;
import com.google.cloud.bigquery.JobStatistics.QueryStatistics;
import com.google.cloud.bigquery.JobStatistics.QueryStatistics.StatementType;
import com.google.cloud.bigquery.JobStatistics.SessionInfo;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/**
 * A page of rows returned by a BigQuery query or table-data read.
 *
 * <p>Use {@link #iterateAll()} to read all rows across every page automatically, or pair {@link
 * #getValues()} with {@link #hasNextPage()} and {@link #getNextPage()} for manual page-by-page
 * pagination. Do not call {@link #iterateAll()} inside a {@link #hasNextPage()} loop, as that
 * re-reads subsequent pages and produces duplicate rows.
 *
 * <p>{@link #getJobId()} may be {@code null} when results were not produced by a job (such as
 * {@link BigQuery#listTableData} or stateless fast-path queries). {@link #getSchema()} may also be
 * {@code null} if no schema was supplied; pass a {@link Schema} to {@link
 * BigQuery#listTableData(TableId, Schema, BigQuery.TableDataListOption...)} or {@link
 * Table#list(Schema, BigQuery.TableDataListOption...)} when by-name lookup on {@link
 * FieldValueList} is required.
 *
 * @see <a href="https://docs.cloud.google.com/bigquery/docs/paging-results">Paging through table
 *     data</a>
 */
@AutoValue
public abstract class TableResult implements Page<FieldValueList>, Serializable {

  private static final long serialVersionUID = 1L;

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract TableResult.Builder setSchema(Schema schema);

    /**
     * Sets the total number of rows in the complete result set, which can be more than the number
     * of rows in the first page of results returned by {@link #getValues()}.
     */
    public abstract TableResult.Builder setTotalRows(Long totalRows);

    public abstract TableResult.Builder setJobId(JobId jobId);

    public abstract TableResult.Builder setPageNoSchema(Page<FieldValueList> pageNoSchema);

    public abstract TableResult.Builder setQueryId(String queryId);

    public abstract TableResult.Builder setJobCreationReason(JobCreationReason jobCreationReason);

    abstract TableResult.Builder setRowsInPage(Long rowsInPage);

    abstract TableResult.Builder setStatementType(@Nullable StatementType statementType);

    abstract TableResult.Builder setTotalBytesBilled(@Nullable Long totalBytesBilled);

    abstract TableResult.Builder setTotalBytesProcessed(@Nullable Long totalBytesProcessed);

    abstract TableResult.Builder setTotalSlotMs(@Nullable Long totalSlotMs);

    abstract TableResult.Builder setNumDmlAffectedRows(@Nullable Long numDmlAffectedRows);

    abstract TableResult.Builder setSessionInfo(@Nullable SessionInfo sessionInfo);

    abstract TableResult.Builder setCacheHit(@Nullable Boolean cacheHit);

    /** Creates a {@code TableResult} object. */
    public abstract TableResult build();
  }

  public abstract Builder toBuilder();

  public static Builder newBuilder() {
    return new AutoValue_TableResult.Builder();
  }

  /** Returns the schema of the results. Null if the schema is not supplied. */
  public abstract @Nullable Schema getSchema();

  /**
   * Returns the total number of rows in the complete result set, which can be more than the number
   * of rows in the first page of results. If no rows are returned, this value can still be greater
   * than 0 if any rows were affected by the query, such as INSERT, UPDATE, or DELETE queries.
   */
  public abstract long getTotalRows();

  public abstract Page<FieldValueList> getPageNoSchema();

  /**
   * Returns the {@link JobId} of the query job that produced this result, or {@code null} if no job
   * was associated with the result (for example, {@link BigQuery#listTableData}, {@link
   * Table#list}, or stateless queries executed with {@link
   * QueryJobConfiguration.JobCreationMode#JOB_CREATION_OPTIONAL}).
   */
  public abstract @Nullable JobId getJobId();

  public abstract @Nullable String getQueryId();

  public abstract @Nullable JobCreationReason getJobCreationReason();

  /** Returns the number of rows in the current page of results. */
  public abstract @Nullable Long getRowsInPage();

  /**
   * Returns the statement type of the query (e.g. SELECT, INSERT, UPDATE, DDL, SCRIPT).
   *
   * @return statement type, or {@code null} if not populated by the service
   */
  public abstract @Nullable StatementType getStatementType();

  /**
   * Returns the total number of bytes billed for the query.
   *
   * @return total bytes billed, or {@code null} if not populated by the service
   */
  public abstract @Nullable Long getTotalBytesBilled();

  /**
   * Returns the total number of bytes processed by the query.
   *
   * @return total bytes processed, or {@code null} if not populated by the service
   */
  public abstract @Nullable Long getTotalBytesProcessed();

  /**
   * Returns the total slot milliseconds consumed by the query.
   *
   * @return total slot milliseconds, or {@code null} if not populated by the service
   */
  public abstract @Nullable Long getTotalSlotMs();

  /**
   * Returns the number of rows affected by a DML statement (INSERT, UPDATE, DELETE, MERGE).
   *
   * @return number of affected rows for DML queries, or {@code null} if not populated by the
   *     service
   */
  public abstract @Nullable Long getNumDmlAffectedRows();

  /**
   * Returns information about the BigQuery session if this query was executed within or created a
   * session.
   *
   * @return session information, or {@code null} if not populated by the service
   */
  public abstract @Nullable SessionInfo getSessionInfo();

  /**
   * Returns whether the query result was fetched from the query cache.
   *
   * @return {@code true} if the query result was fetched from the cache, {@code false} otherwise,
   *     or {@code null} if not populated by the service
   */
  public abstract @Nullable Boolean getCacheHit();

  /**
   * Extracts a {@link QueryStatistics} instance populated with the execution statistics available
   * on this {@code TableResult}.
   *
   * @return query statistics populated from this result
   */
  public QueryStatistics extractQueryStatistics() {
    return QueryStatistics.newBuilder()
        .setStatementType(getStatementType())
        .setTotalBytesBilled(getTotalBytesBilled())
        .setTotalBytesProcessed(getTotalBytesProcessed())
        .setTotalSlotMs(getTotalSlotMs())
        .setNumDmlAffectedRows(getNumDmlAffectedRows())
        .setCacheHit(getCacheHit())
        .setSessionInfo(getSessionInfo())
        .setSchema(getSchema())
        .build();
  }

  @Override
  public boolean hasNextPage() {
    return getPageNoSchema().hasNextPage();
  }

  @Override
  public String getNextPageToken() {
    return getPageNoSchema().getNextPageToken();
  }

  /**
   * Fetches and returns the next page of results, or {@code null} if {@link #hasNextPage()} is
   * {@code false}.
   *
   * <p>When manually paging with this method, read each page's rows via {@link #getValues()} rather
   * than {@link #iterateAll()}.
   */
  @Override
  public TableResult getNextPage() {
    if (getPageNoSchema().hasNextPage()) {
      Page<FieldValueList> nextPageNoSchema = getPageNoSchema().getNextPage();
      long nextRows = (long) Iterables.size(nextPageNoSchema.getValues());
      return TableResult.newBuilder()
          .setSchema(getSchema())
          .setTotalRows(getTotalRows())
          .setJobId(getJobId())
          .setPageNoSchema(nextPageNoSchema)
          .setQueryId(getQueryId())
          .setJobCreationReason(getJobCreationReason())
          .setRowsInPage(nextRows)
          .setStatementType(getStatementType())
          .setTotalBytesBilled(getTotalBytesBilled())
          .setTotalBytesProcessed(getTotalBytesProcessed())
          .setTotalSlotMs(getTotalSlotMs())
          .setNumDmlAffectedRows(getNumDmlAffectedRows())
          .setSessionInfo(getSessionInfo())
          .setCacheHit(getCacheHit())
          .build();
    }
    return null;
  }

  /**
   * Returns an iterable over all rows across all pages starting from this page, fetching subsequent
   * pages automatically as needed.
   *
   * <p>Do not call this method inside a {@link #hasNextPage()} / {@link #getNextPage()} loop, as
   * doing so re-fetches remaining pages and produces duplicate rows; use {@link #getValues()} for
   * manual page-by-page iteration.
   */
  @Override
  public Iterable<FieldValueList> iterateAll() {
    return addSchema(getPageNoSchema().iterateAll());
  }

  /**
   * Returns the rows in the current page only.
   *
   * <p>Use {@link #iterateAll()} to read all pages automatically, or pair this method with {@link
   * #hasNextPage()} and {@link #getNextPage()} for manual pagination.
   */
  @Override
  public Iterable<FieldValueList> getValues() {
    return addSchema(getPageNoSchema().getValues());
  }

  private Iterable<FieldValueList> addSchema(Iterable<FieldValueList> iter) {
    if (getSchema() == null) {
      return iter;
    }
    return Iterables.transform(
        iter,
        new Function<FieldValueList, FieldValueList>() {
          @Override
          public FieldValueList apply(FieldValueList list) {
            return list.withSchema(getSchema().getFields());
          }
        });
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("rows", getValues())
        .add("schema", getSchema())
        .add("totalRows", getTotalRows())
        .add("cursor", getNextPageToken())
        .add("queryId", getQueryId())
        .add("rowsInPage", getRowsInPage())
        .add("statementType", getStatementType())
        .add("totalBytesBilled", getTotalBytesBilled())
        .add("totalBytesProcessed", getTotalBytesProcessed())
        .add("totalSlotMs", getTotalSlotMs())
        .add("numDmlAffectedRows", getNumDmlAffectedRows())
        .add("sessionInfo", getSessionInfo())
        .add("cacheHit", getCacheHit())
        .toString();
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        getPageNoSchema(),
        getSchema(),
        getTotalRows(),
        getQueryId(),
        getRowsInPage(),
        getStatementType(),
        getTotalBytesBilled(),
        getTotalBytesProcessed(),
        getTotalSlotMs(),
        getNumDmlAffectedRows(),
        getSessionInfo(),
        getCacheHit());
  }

  @Override
  public final boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || !obj.getClass().equals(AutoValue_TableResult.class)) {
      return false;
    }
    TableResult response = (TableResult) obj;
    return Objects.equals(getNextPageToken(), response.getNextPageToken())
        && Iterators.elementsEqual(getValues().iterator(), response.getValues().iterator())
        && Objects.equals(getSchema(), response.getSchema())
        && getTotalRows() == response.getTotalRows()
        && Objects.equals(getQueryId(), response.getQueryId())
        && Objects.equals(getRowsInPage(), response.getRowsInPage())
        && Objects.equals(getStatementType(), response.getStatementType())
        && Objects.equals(getTotalBytesBilled(), response.getTotalBytesBilled())
        && Objects.equals(getTotalBytesProcessed(), response.getTotalBytesProcessed())
        && Objects.equals(getTotalSlotMs(), response.getTotalSlotMs())
        && Objects.equals(getNumDmlAffectedRows(), response.getNumDmlAffectedRows())
        && Objects.equals(getSessionInfo(), response.getSessionInfo())
        && Objects.equals(getCacheHit(), response.getCacheHit());
  }
}
