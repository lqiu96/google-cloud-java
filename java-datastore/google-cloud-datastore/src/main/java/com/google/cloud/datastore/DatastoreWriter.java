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

import com.google.api.core.InternalExtensionOnly;
import java.util.List;

/**
 * An interface to represent Google Cloud Datastore write operations.
 *
 * <p>Write method semantics:
 *
 * <ul>
 *   <li>{@link #add(FullEntity)} / {@link #add(FullEntity...)}: insert-only; fails with {@code
 *       ALREADY_EXISTS} if an entity with the key already exists.
 *   <li>{@link #put(FullEntity)} / {@link #put(FullEntity...)}: upsert; inserts if missing or
 *       completely replaces the existing entity.
 *   <li>{@link #update(Entity...)}: update-only; fails with {@code NOT_FOUND} if the key does not
 *       exist, and completely replaces the existing entity.
 *   <li>{@link #delete(Key...)}: idempotent delete; succeeds without error if the key does not
 *       exist.
 * </ul>
 *
 * <p><b>Full-entity replacement:</b> Both {@code put} and {@code update} replace the entire stored
 * entity rather than performing a field-level patch; any existing properties omitted from the
 * provided entity are removed. To modify only selected properties, read the existing entity first
 * and copy it with {@link Entity#newBuilder(Entity)} (inside a {@link Transaction} if concurrent
 * writes are possible).
 *
 * <p><b>Atomicity:</b> Multi-entity calls directly on {@link Datastore} (or via {@link Batch})
 * commit in {@link com.google.datastore.v1.CommitRequest.Mode#NON_TRANSACTIONAL} mode and are not
 * atomic across entities. Use {@link Datastore#runInTransaction(Datastore.TransactionCallable)} or
 * {@link Datastore#newTransaction()} for atomic multi-entity writes.
 */
@InternalExtensionOnly
public interface DatastoreWriter {

  /**
   * Datastore insert-only add operation: creates the provided entity if it does not already exist,
   * and fails with {@link DatastoreException} ({@code ALREADY_EXISTS}) if an entity with the same
   * key already exists. Automatically allocates an ID if the entity has an {@link IncompleteKey}.
   *
   * @param entity the entity to insert
   * @return an {@code Entity} with the same properties and a key that is either newly allocated or
   *     the same one if the key is already complete
   * @throws DatastoreException upon failure or if the key already exists
   * @throws IllegalArgumentException if the given entity is missing a key
   */
  Entity add(FullEntity<?> entity);

  /**
   * Datastore insert-only add operation: inserts the provided entities, automatically allocating
   * IDs for any entities with an {@link IncompleteKey}.
   *
   * <p>Fails with {@link DatastoreException} ({@code ALREADY_EXISTS}) if any entity's key already
   * exists, or {@code FAILED_PRECONDITION} if duplicate complete keys are passed. When called
   * directly on {@link Datastore} or {@link Batch}, this operation is non-transactional and not
   * atomic across entities; use a {@link Transaction} for all-or-nothing inserts.
   *
   * @return a list of {@code Entity} ordered by input with the same properties and a key that is
   *     either newly allocated or the same one if already complete
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if any of the given entities is missing a key
   * @see #add(FullEntity)
   */
  List<Entity> add(FullEntity<?>... entities);

  /**
   * Datastore update operation: replaces each existing entity in full. Fails with {@link
   * DatastoreException} ({@code NOT_FOUND}) if an entity with the given key does not already exist.
   *
   * <p>This is a full-entity replacement, not a field-level patch: any existing properties omitted
   * from the provided {@link Entity} are removed. To preserve unmodified properties, read the
   * entity first and build from {@link Entity#newBuilder(Entity)}. When called directly on {@link
   * Datastore} or {@link Batch}, updating multiple entities is non-transactional and not atomic.
   *
   * @throws DatastoreException upon failure or if a key does not exist
   */
  void update(Entity... entities);

  /**
   * Datastore put (upsert) operation: inserts the entity if it does not exist, or replaces the
   * entire existing entity if it does. Automatically allocates an ID if the entity has an {@link
   * IncompleteKey}.
   *
   * <p>Updating an existing key via {@code put} performs a full-entity replacement, not a
   * field-level patch: any existing properties omitted from {@code entity} are removed.
   *
   * @param entity the entity to insert or replace
   * @return an {@code Entity} with the same properties and a key that is either newly allocated or
   *     the same one if the key is already complete
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if the given entity is missing a key
   */
  Entity put(FullEntity<?> entity);

  /**
   * Datastore put (upsert) operation: inserts each entity if it does not exist, or replaces the
   * entire existing entity if it does. Automatically allocates IDs for any entities with an {@link
   * IncompleteKey}.
   *
   * <p>Each upsert performs a full-entity replacement rather than a field-level patch. When called
   * directly on {@link Datastore} or {@link Batch}, writing multiple entities commits in
   * non-transactional mode and is not atomic across entities; use a {@link Transaction} for atomic
   * multi-entity writes.
   *
   * @return a list of updated or inserted {@code Entity}, ordered by input. Returned keys are
   *     either newly allocated or the same one if already complete.
   * @throws DatastoreException upon failure
   * @throws IllegalArgumentException if any of the given entities is missing a key
   */
  List<Entity> put(FullEntity<?>... entities);

  /**
   * Datastore idempotent delete operation: deletes the entities for the given keys if they exist.
   * Deleting a nonexistent key succeeds without error.
   *
   * <p>When called directly on {@link Datastore} or {@link Batch}, deleting multiple keys is
   * non-transactional and not atomic across entities; use a {@link Transaction} for atomic deletes.
   */
  void delete(Key... keys);
}
