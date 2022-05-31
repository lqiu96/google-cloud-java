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
// source: google/cloud/securitycenter/v1/indicator.proto

package com.google.cloud.securitycenter.v1;

public interface IndicatorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Indicator)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   *
   * @return A list containing the ipAddresses.
   */
  java.util.List<java.lang.String> getIpAddressesList();
  /**
   *
   *
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   *
   * @return The count of ipAddresses.
   */
  int getIpAddressesCount();
  /**
   *
   *
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The ipAddresses at the given index.
   */
  java.lang.String getIpAddresses(int index);
  /**
   *
   *
   * <pre>
   * List of ip addresses associated to the Finding.
   * </pre>
   *
   * <code>repeated string ip_addresses = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ipAddresses at the given index.
   */
  com.google.protobuf.ByteString getIpAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   *
   * @return A list containing the domains.
   */
  java.util.List<java.lang.String> getDomainsList();
  /**
   *
   *
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   *
   * @return The count of domains.
   */
  int getDomainsCount();
  /**
   *
   *
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The domains at the given index.
   */
  java.lang.String getDomains(int index);
  /**
   *
   *
   * <pre>
   * List of domains associated to the Finding.
   * </pre>
   *
   * <code>repeated string domains = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the domains at the given index.
   */
  com.google.protobuf.ByteString getDomainsBytes(int index);
}
