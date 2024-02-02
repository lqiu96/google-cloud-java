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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkmanagement.v1beta1;

public interface CloudSQLInstanceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.CloudSQLInstanceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a Cloud SQL instance.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a Cloud SQL instance.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a Cloud SQL instance.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a Cloud SQL instance.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * URI of a Cloud SQL instance network or empty string if the instance does
   * not have one.
   * </pre>
   *
   * <code>string network_uri = 4;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of a Cloud SQL instance network or empty string if the instance does
   * not have one.
   * </pre>
   *
   * <code>string network_uri = 4;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * Internal IP address of a Cloud SQL instance.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The internalIp.
   */
  java.lang.String getInternalIp();
  /**
   *
   *
   * <pre>
   * Internal IP address of a Cloud SQL instance.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The bytes for internalIp.
   */
  com.google.protobuf.ByteString getInternalIpBytes();

  /**
   *
   *
   * <pre>
   * External IP address of a Cloud SQL instance.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The externalIp.
   */
  java.lang.String getExternalIp();
  /**
   *
   *
   * <pre>
   * External IP address of a Cloud SQL instance.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The bytes for externalIp.
   */
  com.google.protobuf.ByteString getExternalIpBytes();

  /**
   *
   *
   * <pre>
   * Region in which the Cloud SQL instance is running.
   * </pre>
   *
   * <code>string region = 7;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Region in which the Cloud SQL instance is running.
   * </pre>
   *
   * <code>string region = 7;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();
}
