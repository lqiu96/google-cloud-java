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
// source: google/monitoring/v3/notification_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface VerifyNotificationChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.VerifyNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The notification channel to verify.
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
   * Required. The notification channel to verify.
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
   * Required. The verification code that was delivered to the channel as
   * a result of invoking the `SendNotificationChannelVerificationCode` API
   * method or that was retrieved from a verified channel via
   * `GetNotificationChannelVerificationCode`. For example, one might have
   * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
   * guaranteed that the code is valid UTF-8; one should not
   * make any assumptions regarding the structure or format of the code).
   * </pre>
   *
   * <code>string code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * Required. The verification code that was delivered to the channel as
   * a result of invoking the `SendNotificationChannelVerificationCode` API
   * method or that was retrieved from a verified channel via
   * `GetNotificationChannelVerificationCode`. For example, one might have
   * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
   * guaranteed that the code is valid UTF-8; one should not
   * make any assumptions regarding the structure or format of the code).
   * </pre>
   *
   * <code>string code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();
}
