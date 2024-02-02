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
// source: google/cloud/kms/inventory/v1/key_tracking_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.kms.inventory.v1;

public interface ProtectedResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.inventory.v1.ProtectedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of the resource.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full resource name of the resource.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Format: `projects/{PROJECT_NUMBER}`.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Format: `projects/{PROJECT_NUMBER}`.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The ID of the project that owns the resource.
   * </pre>
   *
   * <code>string project_id = 9;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The ID of the project that owns the resource.
   * </pre>
   *
   * <code>string project_id = 9;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The Cloud product that owns the resource.
   * Example: `compute`
   * </pre>
   *
   * <code>string cloud_product = 8;</code>
   *
   * @return The cloudProduct.
   */
  java.lang.String getCloudProduct();
  /**
   *
   *
   * <pre>
   * The Cloud product that owns the resource.
   * Example: `compute`
   * </pre>
   *
   * <code>string cloud_product = 8;</code>
   *
   * @return The bytes for cloudProduct.
   */
  com.google.protobuf.ByteString getCloudProductBytes();

  /**
   *
   *
   * <pre>
   * Example: `compute.googleapis.com/Disk`
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * Example: `compute.googleapis.com/Disk`
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();

  /**
   *
   *
   * <pre>
   * Location can be `global`, regional like `us-east1`, or zonal like
   * `us-west1-b`.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Location can be `global`, regional like `us-east1`, or zonal like
   * `us-west1-b`.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * A key-value pair of the resource's labels (v1) to their values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * A key-value pair of the resource's labels (v1) to their values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * A key-value pair of the resource's labels (v1) to their values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * A key-value pair of the resource's labels (v1) to their values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A key-value pair of the resource's labels (v1) to their values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key version data
   * to Asset Inventory. If there are multiple key versions protecting the
   * resource, then this is same value as the first element of
   * crypto_key_versions.
   * </pre>
   *
   * <code>string crypto_key_version = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The cryptoKeyVersion.
   */
  java.lang.String getCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * The name of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key version data
   * to Asset Inventory. If there are multiple key versions protecting the
   * resource, then this is same value as the first element of
   * crypto_key_versions.
   * </pre>
   *
   * <code>string crypto_key_version = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for cryptoKeyVersion.
   */
  com.google.protobuf.ByteString getCryptoKeyVersionBytes();

  /**
   *
   *
   * <pre>
   * The names of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key versions data
   * to Asset Inventory. The first element of this field is stored in
   * crypto_key_version.
   * </pre>
   *
   * <code>repeated string crypto_key_versions = 10 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the cryptoKeyVersions.
   */
  java.util.List<java.lang.String> getCryptoKeyVersionsList();
  /**
   *
   *
   * <pre>
   * The names of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key versions data
   * to Asset Inventory. The first element of this field is stored in
   * crypto_key_version.
   * </pre>
   *
   * <code>repeated string crypto_key_versions = 10 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of cryptoKeyVersions.
   */
  int getCryptoKeyVersionsCount();
  /**
   *
   *
   * <pre>
   * The names of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key versions data
   * to Asset Inventory. The first element of this field is stored in
   * crypto_key_version.
   * </pre>
   *
   * <code>repeated string crypto_key_versions = 10 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The cryptoKeyVersions at the given index.
   */
  java.lang.String getCryptoKeyVersions(int index);
  /**
   *
   *
   * <pre>
   * The names of the Cloud KMS
   * [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions?hl=en)
   * used to protect this resource via CMEK. This field is empty if the
   * Google Cloud product owning the resource does not provide key versions data
   * to Asset Inventory. The first element of this field is stored in
   * crypto_key_version.
   * </pre>
   *
   * <code>repeated string crypto_key_versions = 10 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cryptoKeyVersions at the given index.
   */
  com.google.protobuf.ByteString getCryptoKeyVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was created. The granularity
   * is in seconds. Timestamp.nanos will always be 0.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was created. The granularity
   * is in seconds. Timestamp.nanos will always be 0.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was created. The granularity
   * is in seconds. Timestamp.nanos will always be 0.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
