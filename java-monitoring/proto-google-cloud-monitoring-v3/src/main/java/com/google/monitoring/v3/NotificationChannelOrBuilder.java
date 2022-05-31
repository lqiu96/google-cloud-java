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
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public interface NotificationChannelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.NotificationChannel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of the notification channel. This field matches the
   * value of the [NotificationChannelDescriptor.type][google.monitoring.v3.NotificationChannelDescriptor.type] field.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of the notification channel. This field matches the
   * value of the [NotificationChannelDescriptor.type][google.monitoring.v3.NotificationChannelDescriptor.type] field.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The full REST resource name for this channel. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * The `[CHANNEL_ID]` is automatically assigned by the server on creation.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full REST resource name for this channel. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * The `[CHANNEL_ID]` is automatically assigned by the server on creation.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * An optional human-readable name for this notification channel. It is
   * recommended that you specify a non-empty and unique name in order to
   * make it easier to identify the channels in your project, though this is
   * not enforced. The display name is limited to 512 Unicode characters.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * An optional human-readable name for this notification channel. It is
   * recommended that you specify a non-empty and unique name in order to
   * make it easier to identify the channels in your project, though this is
   * not enforced. The display name is limited to 512 Unicode characters.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * An optional human-readable description of this notification channel. This
   * description may provide additional details, beyond the display
   * name, for the channel. This may not exceed 1024 Unicode characters.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional human-readable description of this notification channel. This
   * description may provide additional details, beyond the display
   * name, for the channel. This may not exceed 1024 Unicode characters.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Configuration fields that define the channel and its behavior. The
   * permissible and required labels are specified in the
   * [NotificationChannelDescriptor.labels][google.monitoring.v3.NotificationChannelDescriptor.labels] of the
   * `NotificationChannelDescriptor` corresponding to the `type` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Configuration fields that define the channel and its behavior. The
   * permissible and required labels are specified in the
   * [NotificationChannelDescriptor.labels][google.monitoring.v3.NotificationChannelDescriptor.labels] of the
   * `NotificationChannelDescriptor` corresponding to the `type` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Configuration fields that define the channel and its behavior. The
   * permissible and required labels are specified in the
   * [NotificationChannelDescriptor.labels][google.monitoring.v3.NotificationChannelDescriptor.labels] of the
   * `NotificationChannelDescriptor` corresponding to the `type` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Configuration fields that define the channel and its behavior. The
   * permissible and required labels are specified in the
   * [NotificationChannelDescriptor.labels][google.monitoring.v3.NotificationChannelDescriptor.labels] of the
   * `NotificationChannelDescriptor` corresponding to the `type` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Configuration fields that define the channel and its behavior. The
   * permissible and required labels are specified in the
   * [NotificationChannelDescriptor.labels][google.monitoring.v3.NotificationChannelDescriptor.labels] of the
   * `NotificationChannelDescriptor` corresponding to the `type` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * User-supplied key/value data that does not need to conform to
   * the corresponding `NotificationChannelDescriptor`'s schema, unlike
   * the `labels` field. This field is intended to be used for organizing
   * and identifying the `NotificationChannel` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data that does not need to conform to
   * the corresponding `NotificationChannelDescriptor`'s schema, unlike
   * the `labels` field. This field is intended to be used for organizing
   * and identifying the `NotificationChannel` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data that does not need to conform to
   * the corresponding `NotificationChannelDescriptor`'s schema, unlike
   * the `labels` field. This field is intended to be used for organizing
   * and identifying the `NotificationChannel` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data that does not need to conform to
   * the corresponding `NotificationChannelDescriptor`'s schema, unlike
   * the `labels` field. This field is intended to be used for organizing
   * and identifying the `NotificationChannel` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */

  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-supplied key/value data that does not need to conform to
   * the corresponding `NotificationChannelDescriptor`'s schema, unlike
   * the `labels` field. This field is intended to be used for organizing
   * and identifying the `NotificationChannel` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Indicates whether this channel has been verified or not. On a
   * [`ListNotificationChannels`][google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * or
   * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel]
   * operation, this field is expected to be populated.
   * If the value is `UNVERIFIED`, then it indicates that the channel is
   * non-functioning (it both requires verification and lacks verification);
   * otherwise, it is assumed that the channel works.
   * If the channel is neither `VERIFIED` nor `UNVERIFIED`, it implies that
   * the channel is of a type that does not require verification or that
   * this specific channel has been exempted from verification because it was
   * created prior to verification being required for channels of this type.
   * This field cannot be modified using a standard
   * [`UpdateNotificationChannel`][google.monitoring.v3.NotificationChannelService.UpdateNotificationChannel]
   * operation. To change the value of this field, you must call
   * [`VerifyNotificationChannel`][google.monitoring.v3.NotificationChannelService.VerifyNotificationChannel].
   * </pre>
   *
   * <code>.google.monitoring.v3.NotificationChannel.VerificationStatus verification_status = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for verificationStatus.
   */
  int getVerificationStatusValue();
  /**
   *
   *
   * <pre>
   * Indicates whether this channel has been verified or not. On a
   * [`ListNotificationChannels`][google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * or
   * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel]
   * operation, this field is expected to be populated.
   * If the value is `UNVERIFIED`, then it indicates that the channel is
   * non-functioning (it both requires verification and lacks verification);
   * otherwise, it is assumed that the channel works.
   * If the channel is neither `VERIFIED` nor `UNVERIFIED`, it implies that
   * the channel is of a type that does not require verification or that
   * this specific channel has been exempted from verification because it was
   * created prior to verification being required for channels of this type.
   * This field cannot be modified using a standard
   * [`UpdateNotificationChannel`][google.monitoring.v3.NotificationChannelService.UpdateNotificationChannel]
   * operation. To change the value of this field, you must call
   * [`VerifyNotificationChannel`][google.monitoring.v3.NotificationChannelService.VerifyNotificationChannel].
   * </pre>
   *
   * <code>.google.monitoring.v3.NotificationChannel.VerificationStatus verification_status = 9;
   * </code>
   *
   * @return The verificationStatus.
   */
  com.google.monitoring.v3.NotificationChannel.VerificationStatus getVerificationStatus();

  /**
   *
   *
   * <pre>
   * Whether notifications are forwarded to the described channel. This makes
   * it possible to disable delivery of notifications to a particular channel
   * without removing the channel from all alerting policies that reference
   * the channel. This is a more convenient approach when the change is
   * temporary and you want to receive notifications from the same set
   * of alerting policies on the channel at some point in the future.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 11;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Whether notifications are forwarded to the described channel. This makes
   * it possible to disable delivery of notifications to a particular channel
   * without removing the channel from all alerting policies that reference
   * the channel. This is a more convenient approach when the change is
   * temporary and you want to receive notifications from the same set
   * of alerting policies on the channel at some point in the future.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 11;</code>
   *
   * @return The enabled.
   */
  com.google.protobuf.BoolValue getEnabled();
  /**
   *
   *
   * <pre>
   * Whether notifications are forwarded to the described channel. This makes
   * it possible to disable delivery of notifications to a particular channel
   * without removing the channel from all alerting policies that reference
   * the channel. This is a more convenient approach when the change is
   * temporary and you want to receive notifications from the same set
   * of alerting policies on the channel at some point in the future.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 11;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Record of the creation of this channel.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 12;</code>
   *
   * @return Whether the creationRecord field is set.
   */
  boolean hasCreationRecord();
  /**
   *
   *
   * <pre>
   * Record of the creation of this channel.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 12;</code>
   *
   * @return The creationRecord.
   */
  com.google.monitoring.v3.MutationRecord getCreationRecord();
  /**
   *
   *
   * <pre>
   * Record of the creation of this channel.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 12;</code>
   */
  com.google.monitoring.v3.MutationRecordOrBuilder getCreationRecordOrBuilder();

  /**
   *
   *
   * <pre>
   * Records of the modification of this channel.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.MutationRecord mutation_records = 13;</code>
   */
  java.util.List<com.google.monitoring.v3.MutationRecord> getMutationRecordsList();
  /**
   *
   *
   * <pre>
   * Records of the modification of this channel.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.MutationRecord mutation_records = 13;</code>
   */
  com.google.monitoring.v3.MutationRecord getMutationRecords(int index);
  /**
   *
   *
   * <pre>
   * Records of the modification of this channel.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.MutationRecord mutation_records = 13;</code>
   */
  int getMutationRecordsCount();
  /**
   *
   *
   * <pre>
   * Records of the modification of this channel.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.MutationRecord mutation_records = 13;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.MutationRecordOrBuilder>
      getMutationRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Records of the modification of this channel.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.MutationRecord mutation_records = 13;</code>
   */
  com.google.monitoring.v3.MutationRecordOrBuilder getMutationRecordsOrBuilder(int index);
}
