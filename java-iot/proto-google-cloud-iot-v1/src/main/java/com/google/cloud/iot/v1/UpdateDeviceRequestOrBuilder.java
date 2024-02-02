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
// source: google/cloud/iot/v1/device_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.iot.v1;

public interface UpdateDeviceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.UpdateDeviceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new values for the device. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   *
   *
   * <pre>
   * Required. The new values for the device. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The device.
   */
  com.google.cloud.iot.v1.Device getDevice();
  /**
   *
   *
   * <pre>
   * Required. The new values for the device. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.iot.v1.DeviceOrBuilder getDeviceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
