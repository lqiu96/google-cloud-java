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
// source: google/cloud/memcache/v1/cloud_memcache.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.memcache.v1;

public interface WeeklyMaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memcache.v1.WeeklyMaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Allows to define schedule that runs specified day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The enum numeric value on the wire for day.
   */
  int getDayValue();
  /**
   *
   *
   * <pre>
   * Required. Allows to define schedule that runs specified day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The day.
   */
  com.google.type.DayOfWeek getDay();

  /**
   *
   *
   * <pre>
   * Required. Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Required. Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The startTime.
   */
  com.google.type.TimeOfDay getStartTime();
  /**
   *
   *
   * <pre>
   * Required. Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.TimeOfDayOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Duration of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * Required. Duration of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * Required. Duration of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}
