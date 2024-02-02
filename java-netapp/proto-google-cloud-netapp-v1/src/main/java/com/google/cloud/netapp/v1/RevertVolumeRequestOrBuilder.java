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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

public interface RevertVolumeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.RevertVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the volume, in the format of
   * projects/{project_id}/locations/{location}/volumes/{volume_id}.
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
   * Required. The resource name of the volume, in the format of
   * projects/{project_id}/locations/{location}/volumes/{volume_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The snapshot resource ID, in the format 'my-snapshot', where the
   * specified ID is the {snapshot_id} of the fully qualified name like
   * projects/{project_id}/locations/{location_id}/volumes/{volume_id}/snapshots/{snapshot_id}
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   *
   *
   * <pre>
   * Required. The snapshot resource ID, in the format 'my-snapshot', where the
   * specified ID is the {snapshot_id} of the fully qualified name like
   * projects/{project_id}/locations/{location_id}/volumes/{volume_id}/snapshots/{snapshot_id}
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString getSnapshotIdBytes();
}
