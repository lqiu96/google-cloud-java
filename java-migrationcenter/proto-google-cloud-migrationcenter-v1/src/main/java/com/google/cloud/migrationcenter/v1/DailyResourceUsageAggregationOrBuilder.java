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

public interface DailyResourceUsageAggregationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.DailyResourceUsageAggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Aggregation date. Day boundaries are at midnight UTC.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Aggregation date. Day boundaries are at midnight UTC.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return The date.
   */
  com.google.type.Date getDate();
  /**
   *
   *
   * <pre>
   * Aggregation date. Day boundaries are at midnight UTC.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   */
  com.google.type.DateOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * CPU usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.CPU cpu = 2;</code>
   *
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   *
   *
   * <pre>
   * CPU usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.CPU cpu = 2;</code>
   *
   * @return The cpu.
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.CPU getCpu();
  /**
   *
   *
   * <pre>
   * CPU usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.CPU cpu = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.CPUOrBuilder getCpuOrBuilder();

  /**
   *
   *
   * <pre>
   * Memory usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Memory memory = 3;</code>
   *
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   *
   *
   * <pre>
   * Memory usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Memory memory = 3;</code>
   *
   * @return The memory.
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Memory getMemory();
  /**
   *
   *
   * <pre>
   * Memory usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Memory memory = 3;</code>
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.MemoryOrBuilder
      getMemoryOrBuilder();

  /**
   *
   *
   * <pre>
   * Network usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Network network = 4;
   * </code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * Network usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Network network = 4;
   * </code>
   *
   * @return The network.
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Network getNetwork();
  /**
   *
   *
   * <pre>
   * Network usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Network network = 4;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.NetworkOrBuilder
      getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * Disk usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Disk disk = 5;</code>
   *
   * @return Whether the disk field is set.
   */
  boolean hasDisk();
  /**
   *
   *
   * <pre>
   * Disk usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Disk disk = 5;</code>
   *
   * @return The disk.
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Disk getDisk();
  /**
   *
   *
   * <pre>
   * Disk usage.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.Disk disk = 5;</code>
   */
  com.google.cloud.migrationcenter.v1.DailyResourceUsageAggregation.DiskOrBuilder
      getDiskOrBuilder();
}
