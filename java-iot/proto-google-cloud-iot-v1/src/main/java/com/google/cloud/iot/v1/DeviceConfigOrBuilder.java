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
// source: google/cloud/iot/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.iot.v1;

public interface DeviceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.DeviceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] The version of this update. The version number is assigned by
   * the server, and is always greater than 0 after device creation. The
   * version must be 0 on the `CreateDevice` request if a `config` is
   * specified; the response of `CreateDevice` will always have a value of 1.
   * </pre>
   *
   * <code>int64 version = 1;</code>
   *
   * @return The version.
   */
  long getVersion();

  /**
   *
   *
   * <pre>
   * [Output only] The time at which this configuration version was updated in
   * Cloud IoT Core. This timestamp is set by the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cloud_update_time = 2;</code>
   *
   * @return Whether the cloudUpdateTime field is set.
   */
  boolean hasCloudUpdateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this configuration version was updated in
   * Cloud IoT Core. This timestamp is set by the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cloud_update_time = 2;</code>
   *
   * @return The cloudUpdateTime.
   */
  com.google.protobuf.Timestamp getCloudUpdateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this configuration version was updated in
   * Cloud IoT Core. This timestamp is set by the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cloud_update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCloudUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The time at which Cloud IoT Core received the
   * acknowledgment from the device, indicating that the device has received
   * this configuration version. If this field is not present, the device has
   * not yet acknowledged that it received this version. Note that when
   * the config was sent to the device, many config versions may have been
   * available in Cloud IoT Core while the device was disconnected, and on
   * connection, only the latest version is sent to the device. Some
   * versions may never be sent to the device, and therefore are never
   * acknowledged. This timestamp is set by Cloud IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_ack_time = 3;</code>
   *
   * @return Whether the deviceAckTime field is set.
   */
  boolean hasDeviceAckTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which Cloud IoT Core received the
   * acknowledgment from the device, indicating that the device has received
   * this configuration version. If this field is not present, the device has
   * not yet acknowledged that it received this version. Note that when
   * the config was sent to the device, many config versions may have been
   * available in Cloud IoT Core while the device was disconnected, and on
   * connection, only the latest version is sent to the device. Some
   * versions may never be sent to the device, and therefore are never
   * acknowledged. This timestamp is set by Cloud IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_ack_time = 3;</code>
   *
   * @return The deviceAckTime.
   */
  com.google.protobuf.Timestamp getDeviceAckTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which Cloud IoT Core received the
   * acknowledgment from the device, indicating that the device has received
   * this configuration version. If this field is not present, the device has
   * not yet acknowledged that it received this version. Note that when
   * the config was sent to the device, many config versions may have been
   * available in Cloud IoT Core while the device was disconnected, and on
   * connection, only the latest version is sent to the device. Some
   * versions may never be sent to the device, and therefore are never
   * acknowledged. This timestamp is set by Cloud IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_ack_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeviceAckTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The device configuration data.
   * </pre>
   *
   * <code>bytes binary_data = 4;</code>
   *
   * @return The binaryData.
   */
  com.google.protobuf.ByteString getBinaryData();
}
