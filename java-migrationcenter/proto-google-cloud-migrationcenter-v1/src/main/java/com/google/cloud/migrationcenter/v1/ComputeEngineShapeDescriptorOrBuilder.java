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

public interface ComputeEngineShapeDescriptorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Memory in mebibytes.
   * </pre>
   *
   * <code>int32 memory_mb = 1;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * Number of physical cores.
   * </pre>
   *
   * <code>int32 physical_core_count = 2;</code>
   *
   * @return The physicalCoreCount.
   */
  int getPhysicalCoreCount();

  /**
   *
   *
   * <pre>
   * Number of logical cores.
   * </pre>
   *
   * <code>int32 logical_core_count = 3;</code>
   *
   * @return The logicalCoreCount.
   */
  int getLogicalCoreCount();

  /**
   *
   *
   * <pre>
   * Compute Engine machine series.
   * </pre>
   *
   * <code>string series = 4;</code>
   *
   * @return The series.
   */
  java.lang.String getSeries();
  /**
   *
   *
   * <pre>
   * Compute Engine machine series.
   * </pre>
   *
   * <code>string series = 4;</code>
   *
   * @return The bytes for series.
   */
  com.google.protobuf.ByteString getSeriesBytes();

  /**
   *
   *
   * <pre>
   * Compute Engine machine type.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Compute Engine machine type.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Compute Engine storage. Never empty.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ComputeStorageDescriptor storage = 6;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ComputeStorageDescriptor> getStorageList();
  /**
   *
   *
   * <pre>
   * Compute Engine storage. Never empty.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ComputeStorageDescriptor storage = 6;</code>
   */
  com.google.cloud.migrationcenter.v1.ComputeStorageDescriptor getStorage(int index);
  /**
   *
   *
   * <pre>
   * Compute Engine storage. Never empty.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ComputeStorageDescriptor storage = 6;</code>
   */
  int getStorageCount();
  /**
   *
   *
   * <pre>
   * Compute Engine storage. Never empty.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ComputeStorageDescriptor storage = 6;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ComputeStorageDescriptorOrBuilder>
      getStorageOrBuilderList();
  /**
   *
   *
   * <pre>
   * Compute Engine storage. Never empty.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ComputeStorageDescriptor storage = 6;</code>
   */
  com.google.cloud.migrationcenter.v1.ComputeStorageDescriptorOrBuilder getStorageOrBuilder(
      int index);
}
