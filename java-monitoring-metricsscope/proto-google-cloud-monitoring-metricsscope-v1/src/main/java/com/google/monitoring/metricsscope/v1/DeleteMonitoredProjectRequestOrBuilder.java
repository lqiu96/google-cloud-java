/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/metricsscope/v1/metrics_scopes.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.metricsscope.v1;

public interface DeleteMonitoredProjectRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.metricsscope.v1.DeleteMonitoredProjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the `MonitoredProject`.
   * Example:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
   *
   * Authorization requires the following [Google
   * IAM](https://cloud.google.com/iam) permissions on both the `Metrics Scope`
   * and on the `MonitoredProject`: `monitoring.metricsScopes.link`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the `MonitoredProject`.
   * Example:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
   *
   * Authorization requires the following [Google
   * IAM](https://cloud.google.com/iam) permissions on both the `Metrics Scope`
   * and on the `MonitoredProject`: `monitoring.metricsScopes.link`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
