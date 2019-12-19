/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Platform project ID that the cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Platform project ID that the cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The cluster name. Cluster names within a project must be
   * unique. Names of deleted clusters can be reused.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Required. The cluster name. Cluster names within a project must be
   * unique. Names of deleted clusters can be reused.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The cluster config. Note that Dataproc may set
   * default values, and values may change when clusters are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. The cluster config. Note that Dataproc may set
   * default values, and values may change when clusters are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.dataproc.v1.ClusterConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. The cluster config. Note that Dataproc may set
   * default values, and values may change when clusters are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Cluster status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. Cluster status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dataproc.v1.ClusterStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. Cluster status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The previous cluster status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterStatus status_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.ClusterStatus> getStatusHistoryList();
  /**
   *
   *
   * <pre>
   * Output only. The previous cluster status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterStatus status_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterStatus getStatusHistory(int index);
  /**
   *
   *
   * <pre>
   * Output only. The previous cluster status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterStatus status_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStatusHistoryCount();
  /**
   *
   *
   * <pre>
   * Output only. The previous cluster status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterStatus status_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.ClusterStatusOrBuilder>
      getStatusHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The previous cluster status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterStatus status_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterStatusOrBuilder getStatusHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A cluster UUID (Unique Universal Identifier). Dataproc
   * generates this value when it creates the cluster.
   * </pre>
   *
   * <code>string cluster_uuid = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   *
   *
   * <pre>
   * Output only. A cluster UUID (Unique Universal Identifier). Dataproc
   * generates this value when it creates the cluster.
   * </pre>
   *
   * <code>string cluster_uuid = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString getClusterUuidBytes();

  /**
   *
   *
   * <pre>
   * Contains cluster daemon metrics such as HDFS and YARN stats.
   * **Beta Feature**: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterMetrics metrics = 9;</code>
   *
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   *
   *
   * <pre>
   * Contains cluster daemon metrics such as HDFS and YARN stats.
   * **Beta Feature**: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterMetrics metrics = 9;</code>
   *
   * @return The metrics.
   */
  com.google.cloud.dataproc.v1.ClusterMetrics getMetrics();
  /**
   *
   *
   * <pre>
   * Contains cluster daemon metrics such as HDFS and YARN stats.
   * **Beta Feature**: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterMetrics metrics = 9;</code>
   */
  com.google.cloud.dataproc.v1.ClusterMetricsOrBuilder getMetricsOrBuilder();
}
