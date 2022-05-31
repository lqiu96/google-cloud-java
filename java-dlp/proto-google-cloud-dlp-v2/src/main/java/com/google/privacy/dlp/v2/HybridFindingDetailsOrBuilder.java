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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface HybridFindingDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.HybridFindingDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details about the container where the content being inspected is from.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Container container_details = 1;</code>
   *
   * @return Whether the containerDetails field is set.
   */
  boolean hasContainerDetails();
  /**
   *
   *
   * <pre>
   * Details about the container where the content being inspected is from.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Container container_details = 1;</code>
   *
   * @return The containerDetails.
   */
  com.google.privacy.dlp.v2.Container getContainerDetails();
  /**
   *
   *
   * <pre>
   * Details about the container where the content being inspected is from.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Container container_details = 1;</code>
   */
  com.google.privacy.dlp.v2.ContainerOrBuilder getContainerDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Offset in bytes of the line, from the beginning of the file, where the
   * finding  is located. Populate if the item being scanned is only part of a
   * bigger item, such as a shard of a file and you want to track the absolute
   * position of the finding.
   * </pre>
   *
   * <code>int64 file_offset = 2;</code>
   *
   * @return The fileOffset.
   */
  long getFileOffset();

  /**
   *
   *
   * <pre>
   * Offset of the row for tables. Populate if the row(s) being scanned are
   * part of a bigger dataset and you want to keep track of their absolute
   * position.
   * </pre>
   *
   * <code>int64 row_offset = 3;</code>
   *
   * @return The rowOffset.
   */
  long getRowOffset();

  /**
   *
   *
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys. If not known ahead
   * of time, can also be set within each inspect hybrid call and the two
   * will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   *
   * @return Whether the tableOptions field is set.
   */
  boolean hasTableOptions();
  /**
   *
   *
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys. If not known ahead
   * of time, can also be set within each inspect hybrid call and the two
   * will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   *
   * @return The tableOptions.
   */
  com.google.privacy.dlp.v2.TableOptions getTableOptions();
  /**
   *
   *
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys. If not known ahead
   * of time, can also be set within each inspect hybrid call and the two
   * will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   */
  com.google.privacy.dlp.v2.TableOptionsOrBuilder getTableOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels to represent user provided metadata about the data being inspected.
   * If configured by the job, some key values may be required.
   * The labels associated with `Finding`'s produced by hybrid
   * inspection.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding.
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to represent user provided metadata about the data being inspected.
   * If configured by the job, some key values may be required.
   * The labels associated with `Finding`'s produced by hybrid
   * inspection.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding.
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
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
   * Labels to represent user provided metadata about the data being inspected.
   * If configured by the job, some key values may be required.
   * The labels associated with `Finding`'s produced by hybrid
   * inspection.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding.
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to represent user provided metadata about the data being inspected.
   * If configured by the job, some key values may be required.
   * The labels associated with `Finding`'s produced by hybrid
   * inspection.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding.
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
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
   * Labels to represent user provided metadata about the data being inspected.
   * If configured by the job, some key values may be required.
   * The labels associated with `Finding`'s produced by hybrid
   * inspection.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding.
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
