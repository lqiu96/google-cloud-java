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

public interface MachineDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.MachineDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Machine unique identifier.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   *
   *
   * <pre>
   * Machine unique identifier.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * Machine name.
   * </pre>
   *
   * <code>string machine_name = 2;</code>
   *
   * @return The machineName.
   */
  java.lang.String getMachineName();
  /**
   *
   *
   * <pre>
   * Machine name.
   * </pre>
   *
   * <code>string machine_name = 2;</code>
   *
   * @return The bytes for machineName.
   */
  com.google.protobuf.ByteString getMachineNameBytes();

  /**
   *
   *
   * <pre>
   * Machine creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Machine creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Machine creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of CPU cores in the machine. Must be non-negative.
   * </pre>
   *
   * <code>int32 core_count = 4;</code>
   *
   * @return The coreCount.
   */
  int getCoreCount();

  /**
   *
   *
   * <pre>
   * The amount of memory in the machine. Must be non-negative.
   * </pre>
   *
   * <code>int32 memory_mb = 5;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * Power state of the machine.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineDetails.PowerState power_state = 6;</code>
   *
   * @return The enum numeric value on the wire for powerState.
   */
  int getPowerStateValue();
  /**
   *
   *
   * <pre>
   * Power state of the machine.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineDetails.PowerState power_state = 6;</code>
   *
   * @return The powerState.
   */
  com.google.cloud.migrationcenter.v1.MachineDetails.PowerState getPowerState();

  /**
   *
   *
   * <pre>
   * Architecture details (vendor, CPU architecture).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineArchitectureDetails architecture = 7;</code>
   *
   * @return Whether the architecture field is set.
   */
  boolean hasArchitecture();
  /**
   *
   *
   * <pre>
   * Architecture details (vendor, CPU architecture).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineArchitectureDetails architecture = 7;</code>
   *
   * @return The architecture.
   */
  com.google.cloud.migrationcenter.v1.MachineArchitectureDetails getArchitecture();
  /**
   *
   *
   * <pre>
   * Architecture details (vendor, CPU architecture).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineArchitectureDetails architecture = 7;</code>
   */
  com.google.cloud.migrationcenter.v1.MachineArchitectureDetailsOrBuilder
      getArchitectureOrBuilder();

  /**
   *
   *
   * <pre>
   * Guest OS information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestOsDetails guest_os = 8;</code>
   *
   * @return Whether the guestOs field is set.
   */
  boolean hasGuestOs();
  /**
   *
   *
   * <pre>
   * Guest OS information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestOsDetails guest_os = 8;</code>
   *
   * @return The guestOs.
   */
  com.google.cloud.migrationcenter.v1.GuestOsDetails getGuestOs();
  /**
   *
   *
   * <pre>
   * Guest OS information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestOsDetails guest_os = 8;</code>
   */
  com.google.cloud.migrationcenter.v1.GuestOsDetailsOrBuilder getGuestOsOrBuilder();

  /**
   *
   *
   * <pre>
   * Network details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineNetworkDetails network = 9;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * Network details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineNetworkDetails network = 9;</code>
   *
   * @return The network.
   */
  com.google.cloud.migrationcenter.v1.MachineNetworkDetails getNetwork();
  /**
   *
   *
   * <pre>
   * Network details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineNetworkDetails network = 9;</code>
   */
  com.google.cloud.migrationcenter.v1.MachineNetworkDetailsOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * Disk details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineDiskDetails disks = 10;</code>
   *
   * @return Whether the disks field is set.
   */
  boolean hasDisks();
  /**
   *
   *
   * <pre>
   * Disk details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineDiskDetails disks = 10;</code>
   *
   * @return The disks.
   */
  com.google.cloud.migrationcenter.v1.MachineDiskDetails getDisks();
  /**
   *
   *
   * <pre>
   * Disk details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.MachineDiskDetails disks = 10;</code>
   */
  com.google.cloud.migrationcenter.v1.MachineDiskDetailsOrBuilder getDisksOrBuilder();

  /**
   *
   *
   * <pre>
   * Platform specific information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.PlatformDetails platform = 11;</code>
   *
   * @return Whether the platform field is set.
   */
  boolean hasPlatform();
  /**
   *
   *
   * <pre>
   * Platform specific information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.PlatformDetails platform = 11;</code>
   *
   * @return The platform.
   */
  com.google.cloud.migrationcenter.v1.PlatformDetails getPlatform();
  /**
   *
   *
   * <pre>
   * Platform specific information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.PlatformDetails platform = 11;</code>
   */
  com.google.cloud.migrationcenter.v1.PlatformDetailsOrBuilder getPlatformOrBuilder();
}
