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
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface CategoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.Category)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The display name of the service this SKU belongs to.
   * </pre>
   *
   * <code>string service_display_name = 1;</code>
   *
   * @return The serviceDisplayName.
   */
  java.lang.String getServiceDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the service this SKU belongs to.
   * </pre>
   *
   * <code>string service_display_name = 1;</code>
   *
   * @return The bytes for serviceDisplayName.
   */
  com.google.protobuf.ByteString getServiceDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The type of product the SKU refers to.
   * Example: "Compute", "Storage", "Network", "ApplicationServices" etc.
   * </pre>
   *
   * <code>string resource_family = 2;</code>
   *
   * @return The resourceFamily.
   */
  java.lang.String getResourceFamily();
  /**
   *
   *
   * <pre>
   * The type of product the SKU refers to.
   * Example: "Compute", "Storage", "Network", "ApplicationServices" etc.
   * </pre>
   *
   * <code>string resource_family = 2;</code>
   *
   * @return The bytes for resourceFamily.
   */
  com.google.protobuf.ByteString getResourceFamilyBytes();

  /**
   *
   *
   * <pre>
   * A group classification for related SKUs.
   * Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc.
   * </pre>
   *
   * <code>string resource_group = 3;</code>
   *
   * @return The resourceGroup.
   */
  java.lang.String getResourceGroup();
  /**
   *
   *
   * <pre>
   * A group classification for related SKUs.
   * Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc.
   * </pre>
   *
   * <code>string resource_group = 3;</code>
   *
   * @return The bytes for resourceGroup.
   */
  com.google.protobuf.ByteString getResourceGroupBytes();

  /**
   *
   *
   * <pre>
   * Represents how the SKU is consumed.
   * Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc.
   * </pre>
   *
   * <code>string usage_type = 4;</code>
   *
   * @return The usageType.
   */
  java.lang.String getUsageType();
  /**
   *
   *
   * <pre>
   * Represents how the SKU is consumed.
   * Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc.
   * </pre>
   *
   * <code>string usage_type = 4;</code>
   *
   * @return The bytes for usageType.
   */
  com.google.protobuf.ByteString getUsageTypeBytes();
}
