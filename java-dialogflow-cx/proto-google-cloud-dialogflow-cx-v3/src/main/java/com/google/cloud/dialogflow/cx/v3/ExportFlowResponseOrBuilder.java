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
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ExportFlowResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportFlowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return Whether the flowUri field is set.
   */
  boolean hasFlowUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return The flowUri.
   */
  java.lang.String getFlowUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return The bytes for flowUri.
   */
  com.google.protobuf.ByteString getFlowUriBytes();

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for flow.
   * </pre>
   *
   * <code>bytes flow_content = 2;</code>
   *
   * @return Whether the flowContent field is set.
   */
  boolean hasFlowContent();
  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for flow.
   * </pre>
   *
   * <code>bytes flow_content = 2;</code>
   *
   * @return The flowContent.
   */
  com.google.protobuf.ByteString getFlowContent();

  public com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.FlowCase getFlowCase();
}
