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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface QueryTimeSeriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.QueryTimeSeriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The descriptor for the time series data.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesDescriptor time_series_descriptor = 8;</code>
   *
   * @return Whether the timeSeriesDescriptor field is set.
   */
  boolean hasTimeSeriesDescriptor();
  /**
   *
   *
   * <pre>
   * The descriptor for the time series data.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesDescriptor time_series_descriptor = 8;</code>
   *
   * @return The timeSeriesDescriptor.
   */
  com.google.monitoring.v3.TimeSeriesDescriptor getTimeSeriesDescriptor();
  /**
   *
   *
   * <pre>
   * The descriptor for the time series data.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesDescriptor time_series_descriptor = 8;</code>
   */
  com.google.monitoring.v3.TimeSeriesDescriptorOrBuilder getTimeSeriesDescriptorOrBuilder();

  /**
   *
   *
   * <pre>
   * The time series data.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData time_series_data = 9;</code>
   */
  java.util.List<com.google.monitoring.v3.TimeSeriesData> getTimeSeriesDataList();
  /**
   *
   *
   * <pre>
   * The time series data.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData time_series_data = 9;</code>
   */
  com.google.monitoring.v3.TimeSeriesData getTimeSeriesData(int index);
  /**
   *
   *
   * <pre>
   * The time series data.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData time_series_data = 9;</code>
   */
  int getTimeSeriesDataCount();
  /**
   *
   *
   * <pre>
   * The time series data.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData time_series_data = 9;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.TimeSeriesDataOrBuilder>
      getTimeSeriesDataOrBuilderList();
  /**
   *
   *
   * <pre>
   * The time series data.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeriesData time_series_data = 9;</code>
   */
  com.google.monitoring.v3.TimeSeriesDataOrBuilder getTimeSeriesDataOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 10;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 10;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete. The available data will be available in the
   * response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 11;</code>
   */
  java.util.List<com.google.rpc.Status> getPartialErrorsList();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete. The available data will be available in the
   * response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 11;</code>
   */
  com.google.rpc.Status getPartialErrors(int index);
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete. The available data will be available in the
   * response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 11;</code>
   */
  int getPartialErrorsCount();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete. The available data will be available in the
   * response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 11;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete. The available data will be available in the
   * response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 11;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialErrorsOrBuilder(int index);
}
