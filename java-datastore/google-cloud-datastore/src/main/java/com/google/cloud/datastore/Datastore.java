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
import com.google.cloud.Service;
import com.google.cloud.datastore.models.ExplainOptions;
import com.google.datastore.v1.TransactionOptions;
import java.util.Iterator;
import java.util.List;

/**
 * An interface for Google Cloud Datastore.
 *
 * <p>Provides synchronous operations to look up entities ({@link #get}, {@link #fetch}), write
 * entities ({@link #add}, {@link #put}, {@link #update}, {@link #delete}), run queries and
 * aggregations ({@link #run}, {@link #runAggregation}), execute atomic transactions ({@link
 * #runInTransaction}, {@link #newTransaction}), submit non-atomic write batches ({@link
 * #newBatch}), and allocate or reserve keys ({@link #allocateId}, {@link #reserveIds}).
 *
 * <p>Typically, create one {@code Datastore} instance per application via {@link
 * DatastoreOptions#getService()} and reuse it across threads. Call {@link #close()} on application
 * shutdown to close underlying gRPC channels and release background resources. Operations on {@code
 * Datastore} are thread-safe, except for stateful helpers returned by this client such as {@link
 * KeyFactory}, {@link Transaction}, and {@link Batch}.
 *
 * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/overview">Google Cloud
 *     Datastore</a>
 */
@InternalExtensionOnly
public interface Datastore extends Service<DatastoreOptions>, DatastoreReaderWriter, AutoCloseable {

  /**
   * Begins and returns a new explicit Datastore transaction configured with {@code options}.
   *
   * <p>Unlike {@link #runInTransaction(TransactionCallable, TransactionOptions)}, explicit
   * transactions do not automatically retry on contention ({@code ABORTED}), and {@link
   * Transaction} is not {@link AutoCloseable}. Always execute transactional reads and writes on the
   * returned {@link Transaction} (not on this {@code Datastore} instance), and ensure uncommitted
   * transactions are rolled back in a {@code finally} block checking {@link Transaction#isActive()}
   * before calling {@link Transaction#rollback()}.
   *
   * @param options transaction options indicating read-only or read-write mode (and optional {@code
   *     previousTransaction} ID when manually retrying a read-write transaction)
   * @throws DatastoreException upon failure
   * @see Transaction
   * @see #runInTransaction(TransactionCallable, TransactionOptions)
   */
  Transaction newTransaction(TransactionOptions options);

  /**
   * Begins and returns a new explicit Datastore transaction.
   *
   * <p>Unlike {@link #runInTransaction(TransactionCallable)}, explicit transactions do not
   * automatically retry on contention ({@code ABORTED}), and {@link Transaction} is not {@link
   * AutoCloseable}. Always wrap usage in a {@code try}/{@code finally} block that rolls back if
   * {@link Transaction#isActive()} is still {@code true}, and invoke transactional reads and writes
   * on the returned {@link Transaction} rather than on this {@code Datastore} instance.
   *
   * @throws DatastoreException upon failure
   * @see Transaction
   * @see #runInTransaction(TransactionCallable)
   */
  Transaction newTransaction();

  /**
   * Begins and returns a new explicit Datastore transaction with specified {@link
   * DatastoreExecutionOptions}.
   *
   * <p>Explicit transactions do not automatically retry on contention ({@code ABORTED}) and are not
   * {@link AutoCloseable}; roll back in a {@code finally} block if {@link Transaction#isActive()}.
   *
   * @throws DatastoreException upon failure
   * @see #newTransaction()
   */
  @BetaApi
  Transaction newTransaction(DatastoreExecutionOptions executionOptions);

  /**
   * Begins and returns a new explicit Datastore transaction with specified {@link
   * TransactionOptions} and {@link DatastoreExecutionOptions}.
   *
   * <p>Explicit transactions do not automatically retry on contention ({@code ABORTED}) and are not
   * {@link AutoCloseable}; roll back in a {@code finally} block if {@link Transaction#isActive()}.
   *
   * @throws DatastoreException upon failure
   * @see #newTransaction(TransactionOptions)
   */
  @BetaApi
  Transaction newTransaction(
      TransactionOptions options, DatastoreExecutionOptions executionOptions);

  /**
   * A callback for running with a transactional {@link
   * com.google.cloud.datastore.DatastoreReaderWriter}. The associated transaction is committed
   * after a successful return from {@link #run(DatastoreReaderWriter)}, and rolled back if an
   * exception is thrown.
   *
   * <p>All reads and writes that must participate in the transaction must be executed on the {@link
   * DatastoreReaderWriter} passed to {@link #run(DatastoreReaderWriter)}, not on the standalone
   * {@link Datastore} instance. Because {@link Datastore#runInTransaction} automatically retries
   * the callback on contention ({@code ABORTED}) or other retryable errors, implementations must be
   * idempotent and avoid non-idempotent side effects before the transaction commits.
   *
   * @param <T> the type of the return value
   * @see Datastore#runInTransaction(TransactionCallable)
   * @see Datastore#runInTransaction(TransactionCallable, TransactionOptions)
   */
  interface TransactionCallable<T> {
    /**
     * Executes transactional work using the provided {@link DatastoreReaderWriter}.
     *
     * <p>Use {@code readerWriter} (not the standalone {@link Datastore} client) for all reads and
     * writes that belong to this transaction. Writes buffered on {@code readerWriter} are not
     * visible to subsequent reads in the same transaction; they are applied only on commit.
     *
     * @param readerWriter {@link DatastoreReaderWriter} associated with the active transaction
     * @return the transaction result
     * @throws Exception upon failure (triggers rollback and is propagated wrapped in a {@link
     *     DatastoreException})
     */
    T run(DatastoreReaderWriter readerWriter) throws Exception;
  }

  /**
   * Invokes the callback's {@link Datastore.TransactionCallable#run} method with a {@link
   * DatastoreReaderWriter} associated with a new transaction, commits upon normal return, and rolls
   * back if an exception is thrown.
   *
   * <p>Important behavioral contracts:
   *
   * <ul>
   *   <li><b>Use {@code readerWriter}, not {@code datastore}:</b> Execute all transactional reads
   *       and writes on the callback's {@link DatastoreReaderWriter}. Calls made directly on the
   *       {@link Datastore} client run outside the transaction and are not atomic with it.
   *   <li><b>Automatic retries and idempotency:</b> The entire callback is automatically retried on
   *       contention ({@code ABORTED}) and other retryable failures according to the client's retry
   *       settings. Keep callbacks idempotent and avoid non-idempotent side effects until {@code
   *       runInTransaction} returns.
   *   <li><b>Explicit {@link TransactionOptions}:</b> To explicitly control read-write vs.
   *       read-only mode or guarantee {@code previousTransaction} retry priority across library
   *       versions, use {@link #runInTransaction(TransactionCallable, TransactionOptions)} with
   *       explicit {@link TransactionOptions.ReadWrite} options.
   *   <li><b>Wrapped exceptions:</b> Exceptions thrown from the callback or {@code commit()} are
   *       wrapped in a {@link DatastoreException} (with code {@code 0} and {@code null} reason)
   *       whose {@link Throwable#getCause()} holds the original exception or inner {@link
   *       DatastoreException}. Unwrap {@code getCause()} to inspect the underlying failure.
   * </ul>
   *
   * <p>Example of running in a transaction:
   *
   * <pre>{@code
   * String callableResult = "my_callable_result";
   * TransactionCallable<String> callable =
   *     readerWriter -> {
   *       // Use readerWriter (not datastore) for all transactional reads and writes.
   *       return callableResult;
   *     };
   * String result = datastore.runInTransaction(callable);
   * }</pre>
   *
   * @param callable the callback to invoke with a newly created transactional {@code readerWriter}
   * @throws DatastoreException upon failure (unwrap {@link Throwable#getCause()} for the original
   *     callback or commit exception)
   * @see #runInTransaction(TransactionCallable, TransactionOptions)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/transactions">Google Cloud
   *     Datastore transactions</a>
   */
  <T> T runInTransaction(TransactionCallable<T> callable);

  /**
   * Invokes the callback's {@link Datastore.TransactionCallable#run} method with a {@link
   * DatastoreReaderWriter} associated with a new transaction configured by {@code options}, commits
   * upon normal return, and rolls back if an exception is thrown.
   *
   * <p>All reads and writes participating in the transaction must be executed on the callback's
   * {@link DatastoreReaderWriter}, not on {@link Datastore}. The callback must be idempotent
   * because it is automatically retried on contention ({@code ABORTED}) and other retryable
   * failures according to the client's retry settings. When {@code options} specifies read-write
   * mode ({@link TransactionOptions.ReadWrite}), the previous transaction ID is automatically
   * populated on retries so Datastore prioritizes the retried transaction under contention.
   *
   * <p>Exceptions thrown from the callback or {@code commit()} are rolled back and propagated
   * wrapped in a {@link DatastoreException} (with code {@code 0} and {@code null} reason); unwrap
   * {@link Throwable#getCause()} to inspect the original user exception or inner {@link
   * DatastoreException}.
   *
   * <p>Example of running in a read-write transaction with explicit options:
   *
   * <pre>{@code
   * String callableResult = "my_callable_result";
   * TransactionCallable<String> callable =
   *     readerWriter -> {
   *       // Use readerWriter (not datastore) for all transactional reads and writes.
   *       return callableResult;
   *     };
   *
   * TransactionOptions options = TransactionOptions.newBuilder()
   *     .setReadWrite(TransactionOptions.ReadWrite.getDefaultInstance())
   *     .build();
   *
   * String result = datastore.runInTransaction(callable, options);
   * }</pre>
   *
   * @param callable the callback to invoke with a newly created transactional {@code readerWriter}
   * @param options the transaction options indicating read-only or read-write mode
   * @throws DatastoreException upon failure (unwrap {@link Throwable#getCause()} for the original
   *     callback or commit exception)
   * @see #runInTransaction(TransactionCallable)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/transactions">Google Cloud
   *     Datastore transactions</a>
   */
  <T> T runInTransaction(TransactionCallable<T> callable, TransactionOptions options);

  /**
   * Returns a new {@link Batch} for sending multiple write operations in one RPC request.
   *
   * <p><b>Not atomic:</b> Unlike a Firestore {@code WriteBatch} or a Datastore {@link Transaction},
   * {@link Batch#submit()} commits in {@link
   * com.google.datastore.v1.CommitRequest.Mode#NON_TRANSACTIONAL} mode. Mutations are not atomic
   * across entities, so partial writes may persist even if another mutation in the same batch
   * fails. Use {@link #runInTransaction(TransactionCallable)} or {@link #newTransaction()} when
   * all-or-nothing atomicity is required.
   *
   * <p>The returned {@link Batch} is stateful and not thread-safe.
   *
   * <p>Example of starting a new batch:
   *
   * <pre>{@code
   * String keyName1 = "my_key_name_1";
   * String keyName2 = "my_key_name_2";
   * Key key1 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName1);
   * Key key2 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName2);
   * Batch batch = datastore.newBatch();
   * Entity entity1 = Entity.newBuilder(key1).set("name", "John").build();
   * Entity entity2 = Entity.newBuilder(key2).set("title", "title").build();
   * batch.add(entity1);
   * batch.add(entity2);
   * batch.submit();
   * }</pre>
   *
   * @see Batch
   * @see #runInTransaction(TransactionCallable)
   */
  Batch newBatch();

  /**
   * Allocate a unique id for the given key. The returned key will have the same information
   * (projectId, kind, namespace and ancestors) as the given key and will have a newly assigned id.
   *
   * <p>Example of allocating an id.
   *
   * <pre>{@code
   * KeyFactory keyFactory = datastore.newKeyFactory().setKind("MyKind");
   * IncompleteKey incompleteKey = keyFactory.newKey();
   *
   * // let cloud datastore automatically assign an id
   * Key key = datastore.allocateId(incompleteKey);
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  Key allocateId(IncompleteKey key);

  /**
   * Returns a list of keys using the allocated ids ordered by the input.
   *
   * <p>Example of allocating multiple ids in a single batch.
   *
   * <pre>{@code
   * KeyFactory keyFactory = datastore.newKeyFactory().setKind("MyKind");
   * IncompleteKey incompleteKey1 = keyFactory.newKey();
   * IncompleteKey incompleteKey2 = keyFactory.newKey();
   *
   * // let cloud datastore automatically assign the ids
   * List<Key> keys = datastore.allocateId(incompleteKey1, incompleteKey2);
   * }</pre>
   *
   * @throws DatastoreException upon failure
   * @see #allocateId(IncompleteKey)
   */
  List<Key> allocateId(IncompleteKey... keys);

  /**
   * Returns a list of keys using the allocated ids with specified {@link
   * DatastoreExecutionOptions}.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  List<Key> allocateId(List<IncompleteKey> keys, DatastoreExecutionOptions executionOptions);

  /**
   * Reserve one or more keys, preventing them from being automatically allocated by Datastore.
   *
   * <p>Example of reserving multiple ids in a single batch.
   *
   * <pre>{@code
   * KeyFactory keyFactory = datastore.newKeyFactory().setKind("MyKind");
   * Key key1 = keyFactory.newKey(10);
   * Key key2 = keyFactory.newKey("name");
   * List<Key> keys = datastore.reserveIds(key1, key2);
   *
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  List<Key> reserveIds(Key... keys);

  /**
   * Reserve one or more keys with specified {@link DatastoreExecutionOptions}.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  List<Key> reserveIds(List<Key> keys, DatastoreExecutionOptions executionOptions);

  /**
   * {@inheritDoc}
   *
   * <p>If an entity for {@code entity.getKey()} does not exist, {@code entity} is inserted.
   * Otherwise, a {@link DatastoreException} is thrown with {@link DatastoreException#getReason()}
   * equal to {@code "ALREADY_EXISTS"}.
   *
   * <p>Example of adding a single entity.
   *
   * <pre>{@code
   * String keyName = "my_key_name";
   * Key key = datastore.newKeyFactory().setKind("MyKind").newKey(keyName);
   * Entity.Builder entityBuilder = Entity.newBuilder(key);
   * entityBuilder.set("propertyName", "value");
   * Entity entity = entityBuilder.build();
   * try {
   *   datastore.add(entity);
   * } catch (DatastoreException ex) {
   *   if ("ALREADY_EXISTS".equals(ex.getReason())) {
   *     // entity.getKey() already exists
   *   }
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure or if an entity for {@code entity.getKey()} already
   *     exists
   */
  @Override
  Entity add(FullEntity<?> entity);

  /**
   * Datastore add operation: inserts the provided entity with specified {@link
   * DatastoreExecutionOptions}. This method will automatically allocate an id if necessary.
   *
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if the given entity is missing a key
   */
  @BetaApi
  Entity add(FullEntity<?> entity, DatastoreExecutionOptions executionOptions);

  /**
   * {@inheritDoc}
   *
   * <p>If none of entities' keys exist, all entities are inserted. If any of entities' keys already
   * exists the method throws a {@link DatastoreException} with {@link
   * DatastoreException#getReason()} equal to {@code "ALREADY_EXISTS"}. All entities in {@code
   * entities} whose key did not exist are inserted. To achieve a transactional behavior, use {@link
   * Transaction}.
   *
   * <p>Example of adding multiple entities.
   *
   * <pre>{@code
   * String keyName1 = "my_key_name1";
   * String keyName2 = "my_key_name2";
   * Key key1 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName1);
   * Entity.Builder entityBuilder1 = Entity.newBuilder(key1);
   * entityBuilder1.set("propertyName", "value1");
   * Entity entity1 = entityBuilder1.build();
   *
   * Key key2 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName2);
   * Entity.Builder entityBuilder2 = Entity.newBuilder(key2);
   * entityBuilder2.set("propertyName", "value2");
   * Entity entity2 = entityBuilder2.build();
   *
   * try {
   *   datastore.add(entity1, entity2);
   * } catch (DatastoreException ex) {
   *   if ("ALREADY_EXISTS".equals(ex.getReason())) {
   *     // at least one of entity1.getKey() and entity2.getKey() already exists
   *   }
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure or if any of entities' keys already exists
   */
  @Override
  List<Entity> add(FullEntity<?>... entities);

  /**
   * Datastore add operation: inserts the provided entities with specified {@link
   * DatastoreExecutionOptions}. This method will automatically allocate id for any entity with an
   * incomplete key.
   *
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if any of the given entities is missing a key
   */
  @BetaApi
  List<Entity> add(List<FullEntity<?>> entities, DatastoreExecutionOptions executionOptions);

  /**
   * {@inheritDoc}
   *
   * <p>Example of updating multiple entities.
   *
   * <pre>{@code
   * String keyName1 = "my_key_name_1";
   * String keyName2 = "my_key_name_2";
   * Key key1 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName1);
   * Entity.Builder entityBuilder1 = Entity.newBuilder(key1);
   * entityBuilder1.set("propertyName", "updatedValue1");
   * Entity entity1 = entityBuilder1.build();
   *
   * Key key2 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName2);
   * Entity.Builder entityBuilder2 = Entity.newBuilder(key2);
   * entityBuilder2.set("propertyName", "updatedValue2");
   * Entity entity2 = entityBuilder2.build();
   *
   * datastore.update(entity1, entity2);
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  @Override
  void update(Entity... entities);

  /**
   * A Datastore update operation with specified {@link DatastoreExecutionOptions}. The operation
   * will fail if an entity with the same key does not already exist.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  void update(List<Entity> entities, DatastoreExecutionOptions executionOptions);

  /**
   * {@inheritDoc}
   *
   * <p>Example of putting a single entity.
   *
   * <pre>{@code
   * String keyName = "my_key_name";
   * Key key = datastore.newKeyFactory().setKind("MyKind").newKey(keyName);
   * Entity.Builder entityBuilder = Entity.newBuilder(key);
   * entityBuilder.set("propertyName", "value");
   * Entity entity = entityBuilder.build();
   * datastore.put(entity);
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  @Override
  Entity put(FullEntity<?> entity);

  @Override
  List<Entity> put(FullEntity<?>... entities);

  /**
   * A Datastore put operation with specified {@link DatastoreExecutionOptions}. This method will
   * also allocate an id for any entity with an incomplete key.
   *
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if any of the given entities is missing a key
   */
  @BetaApi
  List<Entity> put(List<FullEntity<?>> entities, DatastoreExecutionOptions executionOptions);

  /**
   * {@inheritDoc}
   *
   * <p>Example of deleting multiple entities.
   *
   * <pre>{@code
   * String keyName1 = "my_key_name1";
   * String keyName2 = "my_key_name2";
   * Key key1 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName1);
   * Key key2 = datastore.newKeyFactory().setKind("MyKind").newKey(keyName2);
   * datastore.delete(key1, key2);
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  @Override
  void delete(Key... keys);

  /**
   * A datastore delete operation with specified {@link DatastoreExecutionOptions}.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  void delete(List<Key> keys, DatastoreExecutionOptions executionOptions);

  /**
   * Returns a new KeyFactory for this service
   *
   * <p>Example of creating a {@code KeyFactory}.
   *
   * <pre>{@code
   * KeyFactory keyFactory = datastore.newKeyFactory();
   * }</pre>
   */
  KeyFactory newKeyFactory();

  /**
   * Returns an {@link Entity} for the given {@link Key} or {@code null} if it doesn't exist. {@link
   * ReadOption}s can be specified if desired.
   *
   * <p>Example of getting an entity.
   *
   * <pre>{@code
   * String keyName = "my_key_name";
   * Key key = datastore.newKeyFactory().setKind("MyKind").newKey(keyName);
   * Entity entity = datastore.get(key);
   * // Do something with the entity
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  Entity get(Key key, ReadOption... options);

  /**
   * Returns an {@link Entity} for the given {@link Key} with specified {@link
   * DatastoreExecutionOptions}.
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  Entity get(Key key, DatastoreExecutionOptions executionOptions);

  /**
   * Returns an iterator over the {@link Entity} objects that exist in Datastore for the given keys.
   * {@link ReadOption}s can be specified if desired.
   *
   * <p>Input keys are deduplicated, nonexistent keys are silently omitted, and result order is
   * unspecified (it does not necessarily match the input order). Any keys deferred by Datastore are
   * fetched lazily during {@link Iterator#hasNext hasNext} or {@link Iterator#next next}, which may
   * throw {@link DatastoreException}. Cloud Datastore limits a single lookup request to at most
   * 1,000 keys; split larger key sets into batches.
   *
   * <p>Use {@link #fetch(Iterable, ReadOption...)} instead if you need results in input order with
   * {@code null} placeholders for missing keys.
   *
   * <p>Example of getting multiple entity objects:
   *
   * <pre>{@code
   * String firstKeyName = "my_first_key_name";
   * String secondKeyName = "my_second_key_name";
   * KeyFactory keyFactory = datastore.newKeyFactory().setKind("MyKind");
   * Key firstKey = keyFactory.newKey(firstKeyName);
   * Key secondKey = keyFactory.newKey(secondKeyName);
   * Iterator<Entity> entitiesIterator = datastore.get(Lists.newArrayList(firstKey, secondKey));
   * List<Entity> entities = Lists.newArrayList();
   * while (entitiesIterator.hasNext()) {
   *   Entity entity = entitiesIterator.next();
   *   // do something with the entity
   *   entities.add(entity);
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure
   * @see #get(Key, ReadOption...)
   * @see #fetch(Iterable, ReadOption...)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/limits">Cloud Datastore
   *     limits</a>
   */
  Iterator<Entity> get(Iterable<Key> keys, ReadOption... options);

  /**
   * Returns an iterator over the {@link Entity} objects that exist in Datastore for the given keys
   * with specified {@link DatastoreExecutionOptions}.
   *
   * <p>Input keys are deduplicated, nonexistent keys are omitted, result order is unspecified, and
   * deferred keys are fetched lazily during iteration. Cloud Datastore limits a single lookup
   * request to at most 1,000 keys.
   *
   * @throws DatastoreException upon failure
   * @see #get(Iterable, ReadOption...)
   */
  @BetaApi
  Iterator<Entity> get(Iterable<Key> keys, DatastoreExecutionOptions executionOptions);

  /**
   * Eagerly fetches entities for the given keys and returns a list aligned 1:1 with the input
   * (preserving input order and duplicate keys). {@code null} placeholders are returned at the
   * corresponding indices for nonexistent keys. {@link ReadOption}s can be specified if desired.
   *
   * <p>All results, including any deferred lookup batches, are loaded into memory before returning.
   * Prefer {@link #get(Iterable, ReadOption...)} when input ordering and missing-key placeholders
   * are not needed. Cloud Datastore limits a single lookup request to at most 1,000 keys; split
   * larger key sets into batches.
   *
   * <p>Example of fetching a list of Entity objects:
   *
   * <pre>{@code
   * String firstKeyName = "my_first_key_name";
   * String secondKeyName = "my_second_key_name";
   * KeyFactory keyFactory = datastore.newKeyFactory().setKind("MyKind");
   * Key firstKey = keyFactory.newKey(firstKeyName);
   * Key secondKey = keyFactory.newKey(secondKeyName);
   * List<Entity> entities = datastore.fetch(Lists.newArrayList(firstKey, secondKey));
   * for (Entity entity : entities) {
   *   if (entity != null) {
   *     // do something with the entity
   *   }
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure
   * @see #get(Iterable, ReadOption...)
   * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/limits">Cloud Datastore
   *     limits</a>
   */
  List<Entity> fetch(Iterable<Key> keys, ReadOption... options);

  /**
   * Eagerly fetches entities for the given keys with specified {@link DatastoreExecutionOptions},
   * preserving input order and duplicates with {@code null} placeholders for nonexistent keys.
   *
   * <p>Cloud Datastore limits a single lookup request to at most 1,000 keys.
   *
   * @throws DatastoreException upon failure
   * @see #fetch(Iterable, ReadOption...)
   */
  @BetaApi
  List<Entity> fetch(Iterable<Key> keys, DatastoreExecutionOptions executionOptions);

  /**
   * Submits a {@link Query} and returns its result. {@link ReadOption}s can be specified if
   * desired.
   *
   * <p>Example of running a query to find all entities of one kind.
   *
   * <pre>{@code
   * String kind = "my_kind";
   * StructuredQuery<Entity> query = Query.newEntityQueryBuilder()
   *     .setKind(kind)
   *     .build();
   * QueryResults<Entity> results = datastore.run(query);
   * List<Entity> entities = Lists.newArrayList();
   * while (results.hasNext()) {
   *   Entity result = results.next();
   *   // do something with result
   *   entities.add(result);
   * }
   * }</pre>
   *
   * <p>Example of running a query to find all entities with a matching property value.
   *
   * <pre>{@code
   * String kind = "my_kind";
   * String property = "my_property";
   * String value = "my_value";
   * StructuredQuery<Entity> query = Query.newEntityQueryBuilder()
   *     .setKind(kind)
   *     .setFilter(PropertyFilter.eq(property, value))
   *     .build();
   * QueryResults<Entity> results = datastore.run(query);
   * List<Entity> entities = Lists.newArrayList();
   * while (results.hasNext()) {
   *   Entity result = results.next();
   *   // do something with result
   *   entities.add(result);
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  <T> QueryResults<T> run(Query<T> query, ReadOption... options);

  /**
   * Submits a {@link Query} with specified {@link com.google.cloud.datastore.models.ExplainOptions}
   * and returns its result. {@link ReadOption}s can be specified if desired.
   *
   * <p>Example of running a query to find all entities of one kind.
   *
   * <pre>{@code
   * String kind = "my_kind";
   * StructuredQuery<Entity> query = Query.newEntityQueryBuilder()
   *     .setKind(kind)
   *     .build();
   * QueryResults<Entity> results = datastore.run(query, ExplainOptions.newBuilder().setAnalyze(true).build());
   * }</pre>
   *
   * @throws DatastoreException upon failure
   */
  @BetaApi
  <T> QueryResults<T> run(Query<T> query, ExplainOptions explainOptions, ReadOption... options);

  /**
   * Submits a {@link Query} with specified {@link DatastoreExecutionOptions} and returns its
   * result.
   */
  @BetaApi
  <T> QueryResults<T> run(Query<T> query, DatastoreExecutionOptions executionOptions);

  /**
   * Submits a {@link AggregationQuery} and returns {@link AggregationResults}. {@link ReadOption}s
   * can be specified if desired.
   *
   * <p>Example of running an {@link AggregationQuery} to find the count of entities of one kind.
   *
   * <p>{@link StructuredQuery} example:
   *
   * <pre>{@code
   * EntityQuery selectAllQuery = Query.newEntityQueryBuilder()
   *    .setKind("Task")
   *    .build();
   * AggregationQuery aggregationQuery = Query.newAggregationQueryBuilder()
   *    .addAggregation(count().as("total_count"))
   *    .over(selectAllQuery)
   *    .build();
   * AggregationResults aggregationResults = datastore.runAggregation(aggregationQuery);
   * for (AggregationResult aggregationResult : aggregationResults) {
   *   System.out.println(aggregationResult.getLong("total_count"));
   * }
   * }</pre>
   *
   * <p>{@link GqlQuery} example:
   *
   * <pre>{@code
   * GqlQuery<?> selectAllGqlQuery = Query.newGqlQueryBuilder(
   *         "AGGREGATE COUNT(*) AS total_count, COUNT_UP_TO(100) AS count_upto_100 OVER(SELECT * FROM Task)"
   *     )
   *     .setAllowLiteral(true)
   *     .build();
   * AggregationQuery aggregationQuery = Query.newAggregationQueryBuilder()
   *     .over(selectAllGqlQuery)
   *     .build();
   * AggregationResults aggregationResults = datastore.runAggregation(aggregationQuery);
   * for (AggregationResult aggregationResult : aggregationResults) {
   *   System.out.println(aggregationResult.getLong("total_count"));
   *   System.out.println(aggregationResult.getLong("count_upto_100"));
   * }
   * }</pre>
   *
   * @throws DatastoreException upon failure
   * @return {@link AggregationResults}
   */
  AggregationResults runAggregation(AggregationQuery query, ReadOption... options);

  /**
   * Submits a {@link AggregationQuery} with specified {@link
   * com.google.cloud.datastore.models.ExplainOptions} and returns {@link AggregationResults}.
   * {@link ReadOption}s can be specified if desired.
   *
   * <p>Example of running an {@link AggregationQuery} to find the count of entities of one kind.
   *
   * <p>{@link StructuredQuery} example:
   *
   * <pre>{@code
   * EntityQuery selectAllQuery = Query.newEntityQueryBuilder()
   *    .setKind("Task")
   *    .build();
   * AggregationQuery aggregationQuery = Query.newAggregationQueryBuilder()
   *    .addAggregation(count().as("total_count"))
   *    .over(selectAllQuery)
   *    .build();
   * AggregationResults aggregationResults = datastore.runAggregation(aggregationQuery, ExplainOptions.newBuilder().setAnalyze(true).build());
   * }</pre>
   *
   * @throws DatastoreException upon failure
   * @return {@link AggregationResults}
   */
  @BetaApi
  AggregationResults runAggregation(
      AggregationQuery query, ExplainOptions explainOptions, ReadOption... options);

  /**
   * Submits an {@link AggregationQuery} with specified {@link DatastoreExecutionOptions} and
   * returns {@link AggregationResults}.
   */
  @BetaApi
  AggregationResults runAggregation(
      AggregationQuery query, DatastoreExecutionOptions executionOptions);

  /**
   * Closes the underlying RPC channels (such as gRPC channels) and built-in telemetry resources
   * associated with this instance, blocking until shutdown completes.
   *
   * <p>Call this method once during application shutdown rather than per request. Once closed, this
   * {@code Datastore} client is no longer usable.
   */
  @Override
  void close() throws Exception;

  /**
   * Returns {@code true} if the underlying gRPC transport resources for this client have been shut
   * down via {@link #close()}.
   *
   * <p>This check is supported for the default gRPC transport ({@link
   * com.google.cloud.grpc.GrpcTransportOptions}) and throws {@link UnsupportedOperationException}
   * when configured with {@link com.google.cloud.http.HttpTransportOptions}.
   */
  boolean isClosed();
}
