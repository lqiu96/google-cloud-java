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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

public interface CreateImportJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.CreateImportJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
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
   * Required. Value for parent.
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
   * Required. ID of the import job.
   * </pre>
   *
   * <code>string import_job_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The importJobId.
   */
  java.lang.String getImportJobId();
  /**
   *
   *
   * <pre>
   * Required. ID of the import job.
   * </pre>
   *
   * <code>string import_job_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for importJobId.
   */
  com.google.protobuf.ByteString getImportJobIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the importJob field is set.
   */
  boolean hasImportJob();
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The importJob.
   */
  com.google.cloud.migrationcenter.v1.ImportJob getImportJob();
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.ImportJobOrBuilder getImportJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
