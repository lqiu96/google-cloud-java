/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

public interface CreateWorkloadRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.CreateWorkloadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the new Workload's parent.
   * Must be of the form `organizations/{org_id}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the new Workload's parent.
   * Must be of the form `organizations/{org_id}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workload field is set.
   */
  boolean hasWorkload();
  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workload.
   */
  com.google.cloud.assuredworkloads.v1.Workload getWorkload();
  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.WorkloadOrBuilder getWorkloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A identifier associated with the workload and underlying projects which
   * allows for the break down of billing costs for a workload. The value
   * provided for the identifier will add a label to the workload and contained
   * projects with the identifier as the value.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   *
   *
   * <pre>
   * Optional. A identifier associated with the workload and underlying projects which
   * allows for the break down of billing costs for a workload. The value
   * provided for the identifier will add a label to the workload and contained
   * projects with the identifier as the value.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString getExternalIdBytes();
}
