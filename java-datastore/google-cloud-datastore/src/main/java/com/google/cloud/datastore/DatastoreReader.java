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
import com.google.cloud.datastore.models.ExplainOptions;
import java.util.Iterator;
import java.util.List;

/**
 * An interface to represent Google Cloud Datastore read operations.
 *
 * <p>For multi-key lookups, choose between {@link #get(Key...)} and {@link #fetch(Key...)} based on
 * ordering, missing-key, and memory requirements:
 *
 * <ul>
 *   <li>{@link #get(Key)} looks up a single key and returns {@code null} if the entity does not
 *       exist.
 *   <li>{@link #get(Key...)} deduplicates input keys, omits missing keys, returns entities in
 *       unspecified order, and lazily fetches any deferred keys during iteration.
 *   <li>{@link #fetch(Key...)} eagerly loads all results into a {@link List} that preserves input
 *       key order and duplicates, inserting {@code null} placeholders for nonexistent keys.
 * </ul>
 *
 * <p>Cloud Datastore limits a single lookup request to at most 1,000 keys; split larger key sets
 * into batches.
 *
 * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/limits">Cloud Datastore
 *     limits</a>
 */
@InternalExtensionOnly
public interface DatastoreReader {

  /**
   * Returns an {@link Entity} for the given {@link Key}, or {@code null} if no entity exists for
   * the key.
   *
   * @throws DatastoreException upon failure
   */
  Entity get(Key key);

  /**
   * Returns an iterator over the {@link Entity} objects that exist in Datastore for the given keys.
   *
   * <p>Input keys are deduplicated, nonexistent keys are silently omitted, and iteration order is
   * unspecified (it does not necessarily match the input order). While the initial lookup executes
   * immediately, any keys deferred by Datastore are fetched lazily during {@link Iterator#hasNext}
   * or {@link Iterator#next}, which may throw {@link DatastoreException}. Cloud Datastore limits a
   * single lookup request to at most 1,000 keys; chunk larger inputs.
   *
   * <p>Use {@link #fetch(Key...)} instead if you need results aligned to the input key order with
   * {@code null} placeholders for missing keys.
   *
   * @throws DatastoreException upon failure
   * @see #get(Key)
   * @see #fetch(Key...)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/limits">Cloud Datastore
   *     limits</a>
   */
  Iterator<Entity> get(Key... keys);

  /**
   * Eagerly fetches entities for the given keys and returns a list aligned 1:1 with the input.
   *
   * <p>Unlike {@link #get(Key...)}, this method preserves input order and duplicate keys (a
   * repeated key produces the same entity at each corresponding index) and inserts {@code null} for
   * any nonexistent key. All results, including any deferred lookup batches, are loaded into memory
   * before returning. Prefer {@link #get(Key...)} when input ordering and missing-key placeholders
   * are not needed. Cloud Datastore limits a single lookup request to at most 1,000 keys; chunk
   * larger inputs.
   *
   * @throws DatastoreException upon failure
   * @see #get(Key...)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/limits">Cloud Datastore
   *     limits</a>
   */
  List<Entity> fetch(Key... keys);

  /**
   * Submits a {@link Query} and returns its result.
   *
   * @throws DatastoreException upon failure
   */
  <T> QueryResults<T> run(Query<T> query);

  /**
   * Submits a {@link AggregationQuery} and returns {@link AggregationResults}.
   *
   * @throws DatastoreException upon failure
   */
  AggregationResults runAggregation(AggregationQuery query);

  /**
   * Submits a {@link AggregationQuery} with a specified {@link
   * com.google.cloud.datastore.models.ExplainOptions} and returns {@link AggregationResults}.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  AggregationResults runAggregation(AggregationQuery query, ExplainOptions explainOptions);
}
