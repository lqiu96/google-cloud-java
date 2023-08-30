/*
 * Copyright 2023 Google LLC
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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface EventMappingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.EventMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the GA4 event. It must always be set.
   * The max allowed display name length is 40 UTF-16 code units.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventName.
   */
  java.lang.String getEventName();
  /**
   *
   *
   * <pre>
   * Required. Name of the GA4 event. It must always be set.
   * The max allowed display name length is 40 UTF-16 code units.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString getEventNameBytes();

  /**
   *
   *
   * <pre>
   * At least one of the following four min/max values must be set. The
   * values set will be ANDed together to qualify an event.
   * The minimum number of times the event occurred. If not set, minimum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 min_event_count = 2;</code>
   *
   * @return Whether the minEventCount field is set.
   */
  boolean hasMinEventCount();
  /**
   *
   *
   * <pre>
   * At least one of the following four min/max values must be set. The
   * values set will be ANDed together to qualify an event.
   * The minimum number of times the event occurred. If not set, minimum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 min_event_count = 2;</code>
   *
   * @return The minEventCount.
   */
  long getMinEventCount();

  /**
   *
   *
   * <pre>
   * The maximum number of times the event occurred. If not set, maximum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 max_event_count = 3;</code>
   *
   * @return Whether the maxEventCount field is set.
   */
  boolean hasMaxEventCount();
  /**
   *
   *
   * <pre>
   * The maximum number of times the event occurred. If not set, maximum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 max_event_count = 3;</code>
   *
   * @return The maxEventCount.
   */
  long getMaxEventCount();

  /**
   *
   *
   * <pre>
   * The minimum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, minimum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double min_event_value = 4;</code>
   *
   * @return Whether the minEventValue field is set.
   */
  boolean hasMinEventValue();
  /**
   *
   *
   * <pre>
   * The minimum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, minimum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double min_event_value = 4;</code>
   *
   * @return The minEventValue.
   */
  double getMinEventValue();

  /**
   *
   *
   * <pre>
   * The maximum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, maximum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double max_event_value = 5;</code>
   *
   * @return Whether the maxEventValue field is set.
   */
  boolean hasMaxEventValue();
  /**
   *
   *
   * <pre>
   * The maximum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, maximum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double max_event_value = 5;</code>
   *
   * @return The maxEventValue.
   */
  double getMaxEventValue();
}
