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
// source: google/cloud/networkmanagement/v1/reachability.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkmanagement.v1;

public interface ListConnectivityTestsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.ListConnectivityTestsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of Connectivity Tests.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.ConnectivityTest resources = 1;</code>
   */
  java.util.List<com.google.cloud.networkmanagement.v1.ConnectivityTest> getResourcesList();
  /**
   *
   *
   * <pre>
   * List of Connectivity Tests.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.ConnectivityTest resources = 1;</code>
   */
  com.google.cloud.networkmanagement.v1.ConnectivityTest getResources(int index);
  /**
   *
   *
   * <pre>
   * List of Connectivity Tests.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.ConnectivityTest resources = 1;</code>
   */
  int getResourcesCount();
  /**
   *
   *
   * <pre>
   * List of Connectivity Tests.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.ConnectivityTest resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.networkmanagement.v1.ConnectivityTestOrBuilder>
      getResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Connectivity Tests.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.ConnectivityTest resources = 1;</code>
   */
  com.google.cloud.networkmanagement.v1.ConnectivityTestOrBuilder getResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of Connectivity Tests.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of Connectivity Tests.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Locations that could not be reached (when querying all locations with `-`).
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached (when querying all locations with `-`).
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached (when querying all locations with `-`).
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Locations that could not be reached (when querying all locations with `-`).
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
