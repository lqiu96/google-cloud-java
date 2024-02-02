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

public interface NetworkConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.NetworkConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Connection protocol (e.g. TCP/UDP).
   * </pre>
   *
   * <code>string protocol = 1;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   *
   *
   * <pre>
   * Connection protocol (e.g. TCP/UDP).
   * </pre>
   *
   * <code>string protocol = 1;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();

  /**
   *
   *
   * <pre>
   * Local IP address.
   * </pre>
   *
   * <code>string local_ip_address = 2;</code>
   *
   * @return The localIpAddress.
   */
  java.lang.String getLocalIpAddress();
  /**
   *
   *
   * <pre>
   * Local IP address.
   * </pre>
   *
   * <code>string local_ip_address = 2;</code>
   *
   * @return The bytes for localIpAddress.
   */
  com.google.protobuf.ByteString getLocalIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Local port.
   * </pre>
   *
   * <code>int32 local_port = 3;</code>
   *
   * @return The localPort.
   */
  int getLocalPort();

  /**
   *
   *
   * <pre>
   * Remote IP address.
   * </pre>
   *
   * <code>string remote_ip_address = 4;</code>
   *
   * @return The remoteIpAddress.
   */
  java.lang.String getRemoteIpAddress();
  /**
   *
   *
   * <pre>
   * Remote IP address.
   * </pre>
   *
   * <code>string remote_ip_address = 4;</code>
   *
   * @return The bytes for remoteIpAddress.
   */
  com.google.protobuf.ByteString getRemoteIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Remote port.
   * </pre>
   *
   * <code>int32 remote_port = 5;</code>
   *
   * @return The remotePort.
   */
  int getRemotePort();

  /**
   *
   *
   * <pre>
   * Network connection state.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkConnection.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Network connection state.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkConnection.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.cloud.migrationcenter.v1.NetworkConnection.State getState();

  /**
   *
   *
   * <pre>
   * Process ID.
   * </pre>
   *
   * <code>int64 pid = 7;</code>
   *
   * @return The pid.
   */
  long getPid();

  /**
   *
   *
   * <pre>
   * Process or service name.
   * </pre>
   *
   * <code>string process_name = 8;</code>
   *
   * @return The processName.
   */
  java.lang.String getProcessName();
  /**
   *
   *
   * <pre>
   * Process or service name.
   * </pre>
   *
   * <code>string process_name = 8;</code>
   *
   * @return The bytes for processName.
   */
  com.google.protobuf.ByteString getProcessNameBytes();
}
