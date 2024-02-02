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

public interface EndpointInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.EndpointInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 1;</code>
   *
   * @return The sourceIp.
   */
  java.lang.String getSourceIp();
  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 1;</code>
   *
   * @return The bytes for sourceIp.
   */
  com.google.protobuf.ByteString getSourceIpBytes();

  /**
   *
   *
   * <pre>
   * Destination IP address.
   * </pre>
   *
   * <code>string destination_ip = 2;</code>
   *
   * @return The destinationIp.
   */
  java.lang.String getDestinationIp();
  /**
   *
   *
   * <pre>
   * Destination IP address.
   * </pre>
   *
   * <code>string destination_ip = 2;</code>
   *
   * @return The bytes for destinationIp.
   */
  com.google.protobuf.ByteString getDestinationIpBytes();

  /**
   *
   *
   * <pre>
   * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
   * </pre>
   *
   * <code>string protocol = 3;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   *
   *
   * <pre>
   * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
   * </pre>
   *
   * <code>string protocol = 3;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();

  /**
   *
   *
   * <pre>
   * Source port. Only valid when protocol is TCP or UDP.
   * </pre>
   *
   * <code>int32 source_port = 4;</code>
   *
   * @return The sourcePort.
   */
  int getSourcePort();

  /**
   *
   *
   * <pre>
   * Destination port. Only valid when protocol is TCP or UDP.
   * </pre>
   *
   * <code>int32 destination_port = 5;</code>
   *
   * @return The destinationPort.
   */
  int getDestinationPort();

  /**
   *
   *
   * <pre>
   * URI of the network where this packet originates from.
   * </pre>
   *
   * <code>string source_network_uri = 6;</code>
   *
   * @return The sourceNetworkUri.
   */
  java.lang.String getSourceNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of the network where this packet originates from.
   * </pre>
   *
   * <code>string source_network_uri = 6;</code>
   *
   * @return The bytes for sourceNetworkUri.
   */
  com.google.protobuf.ByteString getSourceNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * URI of the network where this packet is sent to.
   * </pre>
   *
   * <code>string destination_network_uri = 7;</code>
   *
   * @return The destinationNetworkUri.
   */
  java.lang.String getDestinationNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of the network where this packet is sent to.
   * </pre>
   *
   * <code>string destination_network_uri = 7;</code>
   *
   * @return The bytes for destinationNetworkUri.
   */
  com.google.protobuf.ByteString getDestinationNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * URI of the source telemetry agent this packet originates from.
   * </pre>
   *
   * <code>string source_agent_uri = 8;</code>
   *
   * @return The sourceAgentUri.
   */
  java.lang.String getSourceAgentUri();
  /**
   *
   *
   * <pre>
   * URI of the source telemetry agent this packet originates from.
   * </pre>
   *
   * <code>string source_agent_uri = 8;</code>
   *
   * @return The bytes for sourceAgentUri.
   */
  com.google.protobuf.ByteString getSourceAgentUriBytes();
}
