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
// source: google/monitoring/v3/metric.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface TimeSeriesDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.TimeSeriesData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The values of the labels in the time series identifier, given in the same
   * order as the `label_descriptors` field of the TimeSeriesDescriptor
   * associated with this object. Each value must have a value of the type
   * given in the corresponding entry of `label_descriptors`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.LabelValue label_values = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.LabelValue> getLabelValuesList();
  /**
   *
   *
   * <pre>
   * The values of the labels in the time series identifier, given in the same
   * order as the `label_descriptors` field of the TimeSeriesDescriptor
   * associated with this object. Each value must have a value of the type
   * given in the corresponding entry of `label_descriptors`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.LabelValue label_values = 1;</code>
   */
  com.google.monitoring.v3.LabelValue getLabelValues(int index);
  /**
   *
   *
   * <pre>
   * The values of the labels in the time series identifier, given in the same
   * order as the `label_descriptors` field of the TimeSeriesDescriptor
   * associated with this object. Each value must have a value of the type
   * given in the corresponding entry of `label_descriptors`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.LabelValue label_values = 1;</code>
   */
  int getLabelValuesCount();
  /**
   *
   *
   * <pre>
   * The values of the labels in the time series identifier, given in the same
   * order as the `label_descriptors` field of the TimeSeriesDescriptor
   * associated with this object. Each value must have a value of the type
   * given in the corresponding entry of `label_descriptors`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.LabelValue label_values = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.LabelValueOrBuilder>
      getLabelValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The values of the labels in the time series identifier, given in the same
   * order as the `label_descriptors` field of the TimeSeriesDescriptor
   * associated with this object. Each value must have a value of the type
   * given in the corresponding entry of `label_descriptors`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.LabelValue label_values = 1;</code>
   */
  com.google.monitoring.v3.LabelValueOrBuilder getLabelValuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The points in the time series.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData.PointData point_data = 2;</code>
   */
  java.util.List<com.google.monitoring.v3.TimeSeriesData.PointData> getPointDataList();
  /**
   *
   *
   * <pre>
   * The points in the time series.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData.PointData point_data = 2;</code>
   */
  com.google.monitoring.v3.TimeSeriesData.PointData getPointData(int index);
  /**
   *
   *
   * <pre>
   * The points in the time series.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData.PointData point_data = 2;</code>
   */
  int getPointDataCount();
  /**
   *
   *
   * <pre>
   * The points in the time series.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData.PointData point_data = 2;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.TimeSeriesData.PointDataOrBuilder>
      getPointDataOrBuilderList();
  /**
   *
   *
   * <pre>
   * The points in the time series.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData.PointData point_data = 2;</code>
   */
  com.google.monitoring.v3.TimeSeriesData.PointDataOrBuilder getPointDataOrBuilder(int index);
}
