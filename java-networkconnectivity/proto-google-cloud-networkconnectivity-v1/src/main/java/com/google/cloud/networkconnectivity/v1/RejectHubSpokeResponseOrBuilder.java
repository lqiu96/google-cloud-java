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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkconnectivity.v1;

public interface RejectHubSpokeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.RejectHubSpokeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   *
   * @return Whether the spoke field is set.
   */
  boolean hasSpoke();
  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   *
   * @return The spoke.
   */
  com.google.cloud.networkconnectivity.v1.Spoke getSpoke();
  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeOrBuilder getSpokeOrBuilder();
}
