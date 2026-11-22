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

import com.google.common.collect.ImmutableList;

/**
 * A mutable helper for creating keys for a specific {@link Datastore}, preconfigured with its
 * project ID, database ID, and namespace.
 *
 * <p>{@code KeyFactory} is stateful and <strong>not thread-safe</strong>. Calling {@link
 * #setKind(String)}, {@link #addAncestor(PathElement)}, or {@link #addAncestors(Iterable)} mutates
 * this instance, and configured kind and ancestors persist and accumulate across {@link #newKey()},
 * {@link #newKey(String)}, and {@link #newKey(long)} calls until {@link #reset()} is called.
 *
 * <p>Prefer creating a fresh instance via {@link Datastore#newKeyFactory()} for each operation (it
 * is lightweight and inherits the client's project ID, database ID, and namespace), or call {@link
 * #reset()} between unrelated keys on a single thread. Do not share a {@code KeyFactory} instance
 * across threads.
 */
public final class KeyFactory extends BaseKey.Builder<KeyFactory> {

  private final String initialProjectId;
  private final String initialNamespace;
  private final String initialDatabaseId;

  public KeyFactory(String projectId) {
    this(projectId, "");
  }

  public KeyFactory(String projectId, String namespace) {
    this(projectId, namespace, "");
  }

  public KeyFactory(String projectId, String namespace, String databaseId) {
    super(projectId);
    setNamespace(namespace);
    setDatabaseId(databaseId);
    this.initialProjectId = projectId;
    this.initialNamespace = namespace;
    this.initialDatabaseId = databaseId;
  }

  /**
   * Creates an {@link IncompleteKey} using the currently configured kind and accumulated ancestors.
   * Does not clear the factory's kind or ancestors; call {@link #reset()} to start over.
   */
  public IncompleteKey newKey() {
    ImmutableList<PathElement> path =
        ImmutableList.<PathElement>builder().addAll(ancestors).add(PathElement.of(kind)).build();
    return new IncompleteKey(projectId, namespace, databaseId, path);
  }

  /**
   * Creates a complete {@link Key} with the given string name using the currently configured kind
   * and accumulated ancestors. Does not clear the factory's kind or ancestors; call {@link
   * #reset()} to start over.
   */
  public Key newKey(String name) {
    ImmutableList<PathElement> path =
        ImmutableList.<PathElement>builder()
            .addAll(ancestors)
            .add(PathElement.of(kind, name))
            .build();
    return new Key(projectId, namespace, databaseId, path);
  }

  /**
   * Creates a complete {@link Key} with the given numeric ID using the currently configured kind
   * and accumulated ancestors. Does not clear the factory's kind or ancestors; call {@link
   * #reset()} to start over.
   */
  public Key newKey(long id) {
    ImmutableList<PathElement> path =
        ImmutableList.<PathElement>builder()
            .addAll(ancestors)
            .add(PathElement.of(kind, id))
            .build();
    return new Key(projectId, namespace, databaseId, path);
  }

  /**
   * Resets this {@code KeyFactory} to its initial state, clearing the configured kind and all
   * accumulated ancestors and restoring the initial project ID, namespace, and database ID.
   *
   * @return {@code this} for chaining
   */
  public KeyFactory reset() {
    setProjectId(initialProjectId);
    setNamespace(initialNamespace);
    setDatabaseId(initialDatabaseId);
    kind = null;
    ancestors.clear();
    return this;
  }

  @Override
  protected IncompleteKey build() {
    return newKey();
  }
}
