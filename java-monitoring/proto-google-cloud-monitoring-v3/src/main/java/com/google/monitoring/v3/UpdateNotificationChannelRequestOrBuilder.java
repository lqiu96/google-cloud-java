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
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface UpdateNotificationChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notificationChannel field is set.
   */
  boolean hasNotificationChannel();
  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notificationChannel.
   */
  com.google.monitoring.v3.NotificationChannel getNotificationChannel();
  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder();
}
