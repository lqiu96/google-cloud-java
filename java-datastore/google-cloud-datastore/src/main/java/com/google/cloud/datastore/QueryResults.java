/*
 * Copyright 2015 Google LLC
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

package com.google.cloud.datastore;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalExtensionOnly;
import com.google.cloud.datastore.models.ExplainMetrics;
import com.google.datastore.v1.QueryResultBatch;
import java.util.Iterator;
import java.util.Optional;

/**
 * The result of a Google Cloud Datastore query submission. When the result is not typed it is
 * possible to cast it to its appropriate type according to the {@link #getResultClass} value.
 * Results are loaded lazily in batches, where batch size is set by Cloud Datastore. As a result, it
 * is possible to get a {@code DatastoreException} upon {@link Iterator#hasNext hasNext} or {@link
 * Iterator#next next} calls.
 *
 * <p>For cursor-based pagination, exhaust the iterator ({@link #hasNext()} returns {@code false})
 * before checking {@link #getMoreResults()}. When {@link #getMoreResults()} equals {@link
 * QueryResultBatch.MoreResultsType#MORE_RESULTS_AFTER_LIMIT} (or {@link
 * QueryResultBatch.MoreResultsType#MORE_RESULTS_AFTER_CURSOR}), pass {@link #getCursorAfter()} to
 * {@link StructuredQuery.Builder#setStartCursor(Cursor)} on the next query.
 *
 * @param <V> the type of the results value.
 * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/queries">Datastore
 *     Queries</a>
 */
@InternalExtensionOnly
public interface QueryResults<V> extends Iterator<V> {

  /** Returns the actual class of the result's values. */
  Class<?> getResultClass();

  /**
   * Returns the {@link Cursor} for the point immediately after the last fetched result (or the
   * final batch's end cursor once the iterator is exhausted, or the initial skipped/start cursor
   * before any {@link #hasNext()} or {@link #next()} call). This cursor can be used to issue
   * subsequent queries (with the same constraints) that may return additional results.
   *
   * <p><strong>Note on {@link #hasNext()} prefetching:</strong> Calling {@link #hasNext()}
   * prefetches the next result and immediately advances this cursor before {@link #next()} is
   * called. If you stop iterating early, read {@code getCursorAfter()} immediately after {@link
   * #next()} and before calling {@link #hasNext()} again (or exhaust the iterator until {@link
   * #hasNext()} returns {@code false} to obtain the final batch's end cursor).
   *
   * <p>A simple use case:
   *
   * <pre>{@code
   * EntityQuery query = Query.newEntityQueryBuilder()
   *     .setKind("Person")
   *     .setFilter(PropertyFilter.eq("favoriteFood", "pizza"))
   *     .build();
   * QueryResults<Entity> results = datastore.run(query);
   * // Consume some results (using results.next()) and do any other actions as necessary.
   * query = query.toBuilder().setStartCursor(results.getCursorAfter()).build();
   * results = datastore.run(query); // now we will iterate over all entities not yet consumed
   * }</pre>
   */
  Cursor getCursorAfter();

  /**
   * Returns the number of results skipped in the most recently fetched batch (not a cumulative
   * total across multiple batches), typically because of an offset.
   *
   * <p>Example of checking skipped results with an offset:
   *
   * <pre>{@code
   * Query<Entity> query = Query.newEntityQueryBuilder()
   *     .setKind("Person")
   *     .setOffset(10)
   *     .build();
   * QueryResults<Entity> results = datastore.run(query);
   * int skipped = results.getSkippedResults();
   * }</pre>
   *
   * <p>To count matching entities without scanning or skipping them, use an {@link
   * AggregationQuery} with {@link com.google.cloud.datastore.aggregation.Aggregation#count()}.
   */
  int getSkippedResults();

  /**
   * Returns the {@link QueryResultBatch.MoreResultsType} state of the query after the most recently
   * fetched batch.
   *
   * <p>Because batches are fetched lazily, exhaust this iterator ({@link #hasNext()} returns {@code
   * false}) before inspecting {@code getMoreResults()} to determine whether another page exists.
   * Check for {@link QueryResultBatch.MoreResultsType#MORE_RESULTS_AFTER_LIMIT} (or {@link
   * QueryResultBatch.MoreResultsType#MORE_RESULTS_AFTER_CURSOR}) to continue paginating; {@link
   * QueryResultBatch.MoreResultsType#NOT_FINISHED} only indicates additional batches remain within
   * the current query execution.
   */
  QueryResultBatch.MoreResultsType getMoreResults();

  /**
   * Returns an {@link Optional} containing {@link ExplainMetrics} when {@link
   * com.google.cloud.datastore.models.ExplainOptions} were supplied, or {@link Optional#empty()}
   * otherwise.
   *
   * <p>When {@link com.google.cloud.datastore.models.ExplainOptions#shouldAnalyze()} is {@code
   * true}, Datastore returns {@link ExplainMetrics} only on the final response batch, so exhaust
   * this iterator ({@link #hasNext()} returns {@code false}) before calling {@code
   * getExplainMetrics()}.
   */
  @BetaApi
  Optional<ExplainMetrics> getExplainMetrics();
}
