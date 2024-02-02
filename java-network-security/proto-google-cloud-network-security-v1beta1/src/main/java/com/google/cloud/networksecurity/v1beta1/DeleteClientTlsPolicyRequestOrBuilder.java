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
// source: google/cloud/networksecurity/v1beta1/client_tls_policy.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networksecurity.v1beta1;

public interface DeleteClientTlsPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.DeleteClientTlsPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A name of the ClientTlsPolicy to delete. Must be in
   * the format `projects/&#42;&#47;locations/{location}/clientTlsPolicies/&#42;`.
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
   * Required. A name of the ClientTlsPolicy to delete. Must be in
   * the format `projects/&#42;&#47;locations/{location}/clientTlsPolicies/&#42;`.
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
