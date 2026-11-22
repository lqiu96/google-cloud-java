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

/**
 * A client for Google Cloud Datastore – a highly scalable NoSQL document database for web and
 * mobile applications.
 *
 * <p>Use {@link com.google.cloud.datastore.Datastore} in this package as the idiomatic high-level
 * client to look up and write entities, run structured, GQL, and aggregation queries, and execute
 * transactions and write batches. Do not mix types from this package with the low-level generated
 * GAPIC client ({@link com.google.cloud.datastore.v1.DatastoreClient}) or protobuf package ({@code
 * com.google.datastore.v1}), which define identically named types such as {@code Key}, {@code
 * Entity}, and {@code Query}.
 *
 * <p>A simple usage example showing how to save and retrieve a Datastore entity. For the complete
 * source code, see <a
 * href="https://github.com/googleapis/google-cloud-java/blob/main/java-datastore/samples/snippets/src/main/java/com/example/datastore/QuickstartSample.java">
 * QuickstartSample.java</a>. For additional examples, see <a
 * href="https://docs.cloud.google.com/datastore/docs/samples?language=java">Datastore Java code
 * samples</a>.
 *
 * <pre>{@code
 * // Reuse a single client across requests and call close() on shutdown to release resources.
 * Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
 * Key taskKey = datastore.newKeyFactory().setKind("Task").newKey("sampletask1");
 * Entity task = Entity.newBuilder(taskKey)
 *     .set("description", "Buy milk")
 *     .build();
 * datastore.put(task);
 * Entity retrieved = datastore.get(taskKey);
 * }</pre>
 *
 * @see com.google.cloud.datastore.Datastore
 * @see <a href="https://docs.cloud.google.com/datastore/docs">Google Cloud Datastore
 *     documentation</a>
 */
package com.google.cloud.datastore;
