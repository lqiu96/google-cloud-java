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
// source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkmanagement.v1beta1;

public interface EndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IP address of the endpoint, which can be an external or internal IP.
   * An IPv6 address is only allowed when the test's destination is a
   * [global load balancer
   * VIP](https://cloud.google.com/load-balancing/docs/load-balancing-overview).
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * The IP address of the endpoint, which can be an external or internal IP.
   * An IPv6 address is only allowed when the test's destination is a
   * [global load balancer
   * VIP](https://cloud.google.com/load-balancing/docs/load-balancing-overview).
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * The IP protocol port of the endpoint.
   * Only applicable when protocol is TCP or UDP.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * A Compute Engine instance URI.
   * </pre>
   *
   * <code>string instance = 3;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * A Compute Engine instance URI.
   * </pre>
   *
   * <code>string instance = 3;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * A forwarding rule and its corresponding IP address represent the frontend
   * configuration of a Google Cloud load balancer. Forwarding rules are also
   * used for protocol forwarding, Private Service Connect and other network
   * services to provide forwarding information in the control plane. Format:
   *  projects/{project}/global/forwardingRules/{id} or
   *  projects/{project}/regions/{region}/forwardingRules/{id}
   * </pre>
   *
   * <code>string forwarding_rule = 13;</code>
   *
   * @return The forwardingRule.
   */
  java.lang.String getForwardingRule();
  /**
   *
   *
   * <pre>
   * A forwarding rule and its corresponding IP address represent the frontend
   * configuration of a Google Cloud load balancer. Forwarding rules are also
   * used for protocol forwarding, Private Service Connect and other network
   * services to provide forwarding information in the control plane. Format:
   *  projects/{project}/global/forwardingRules/{id} or
   *  projects/{project}/regions/{region}/forwardingRules/{id}
   * </pre>
   *
   * <code>string forwarding_rule = 13;</code>
   *
   * @return The bytes for forwardingRule.
   */
  com.google.protobuf.ByteString getForwardingRuleBytes();

  /**
   *
   *
   * <pre>
   * Output only. Specifies the type of the target of the forwarding rule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.Endpoint.ForwardingRuleTarget forwarding_rule_target = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the forwardingRuleTarget field is set.
   */
  boolean hasForwardingRuleTarget();
  /**
   *
   *
   * <pre>
   * Output only. Specifies the type of the target of the forwarding rule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.Endpoint.ForwardingRuleTarget forwarding_rule_target = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for forwardingRuleTarget.
   */
  int getForwardingRuleTargetValue();
  /**
   *
   *
   * <pre>
   * Output only. Specifies the type of the target of the forwarding rule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.Endpoint.ForwardingRuleTarget forwarding_rule_target = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The forwardingRuleTarget.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.ForwardingRuleTarget
      getForwardingRuleTarget();

  /**
   *
   *
   * <pre>
   * Output only. ID of the load balancer the forwarding rule points to. Empty
   * for forwarding rules not related to load balancers.
   * </pre>
   *
   * <code>optional string load_balancer_id = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the loadBalancerId field is set.
   */
  boolean hasLoadBalancerId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the load balancer the forwarding rule points to. Empty
   * for forwarding rules not related to load balancers.
   * </pre>
   *
   * <code>optional string load_balancer_id = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The loadBalancerId.
   */
  java.lang.String getLoadBalancerId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the load balancer the forwarding rule points to. Empty
   * for forwarding rules not related to load balancers.
   * </pre>
   *
   * <code>optional string load_balancer_id = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for loadBalancerId.
   */
  com.google.protobuf.ByteString getLoadBalancerIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of the load balancer the forwarding rule points to.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.LoadBalancerType load_balancer_type = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the loadBalancerType field is set.
   */
  boolean hasLoadBalancerType();
  /**
   *
   *
   * <pre>
   * Output only. Type of the load balancer the forwarding rule points to.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.LoadBalancerType load_balancer_type = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for loadBalancerType.
   */
  int getLoadBalancerTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of the load balancer the forwarding rule points to.
   * </pre>
   *
   * <code>
   * optional .google.cloud.networkmanagement.v1beta1.LoadBalancerType load_balancer_type = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The loadBalancerType.
   */
  com.google.cloud.networkmanagement.v1beta1.LoadBalancerType getLoadBalancerType();

  /**
   *
   *
   * <pre>
   * A cluster URI for [Google Kubernetes Engine
   * master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
   * </pre>
   *
   * <code>string gke_master_cluster = 7;</code>
   *
   * @return The gkeMasterCluster.
   */
  java.lang.String getGkeMasterCluster();
  /**
   *
   *
   * <pre>
   * A cluster URI for [Google Kubernetes Engine
   * master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
   * </pre>
   *
   * <code>string gke_master_cluster = 7;</code>
   *
   * @return The bytes for gkeMasterCluster.
   */
  com.google.protobuf.ByteString getGkeMasterClusterBytes();

  /**
   *
   *
   * <pre>
   * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
   * </pre>
   *
   * <code>string cloud_sql_instance = 8;</code>
   *
   * @return The cloudSqlInstance.
   */
  java.lang.String getCloudSqlInstance();
  /**
   *
   *
   * <pre>
   * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
   * </pre>
   *
   * <code>string cloud_sql_instance = 8;</code>
   *
   * @return The bytes for cloudSqlInstance.
   */
  com.google.protobuf.ByteString getCloudSqlInstanceBytes();

  /**
   *
   *
   * <pre>
   * A [Cloud Function](https://cloud.google.com/functions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpoint cloud_function = 10;
   * </code>
   *
   * @return Whether the cloudFunction field is set.
   */
  boolean hasCloudFunction();
  /**
   *
   *
   * <pre>
   * A [Cloud Function](https://cloud.google.com/functions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpoint cloud_function = 10;
   * </code>
   *
   * @return The cloudFunction.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpoint getCloudFunction();
  /**
   *
   *
   * <pre>
   * A [Cloud Function](https://cloud.google.com/functions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpoint cloud_function = 10;
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpointOrBuilder
      getCloudFunctionOrBuilder();

  /**
   *
   *
   * <pre>
   * An [App Engine](https://cloud.google.com/appengine) [service
   * version](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.AppEngineVersionEndpoint app_engine_version = 11;
   * </code>
   *
   * @return Whether the appEngineVersion field is set.
   */
  boolean hasAppEngineVersion();
  /**
   *
   *
   * <pre>
   * An [App Engine](https://cloud.google.com/appengine) [service
   * version](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.AppEngineVersionEndpoint app_engine_version = 11;
   * </code>
   *
   * @return The appEngineVersion.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.AppEngineVersionEndpoint
      getAppEngineVersion();
  /**
   *
   *
   * <pre>
   * An [App Engine](https://cloud.google.com/appengine) [service
   * version](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions).
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.AppEngineVersionEndpoint app_engine_version = 11;
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.AppEngineVersionEndpointOrBuilder
      getAppEngineVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * A [Cloud Run](https://cloud.google.com/run)
   * [revision](https://cloud.google.com/run/docs/reference/rest/v1/namespaces.revisions/get)
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudRunRevisionEndpoint cloud_run_revision = 12;
   * </code>
   *
   * @return Whether the cloudRunRevision field is set.
   */
  boolean hasCloudRunRevision();
  /**
   *
   *
   * <pre>
   * A [Cloud Run](https://cloud.google.com/run)
   * [revision](https://cloud.google.com/run/docs/reference/rest/v1/namespaces.revisions/get)
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudRunRevisionEndpoint cloud_run_revision = 12;
   * </code>
   *
   * @return The cloudRunRevision.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.CloudRunRevisionEndpoint
      getCloudRunRevision();
  /**
   *
   *
   * <pre>
   * A [Cloud Run](https://cloud.google.com/run)
   * [revision](https://cloud.google.com/run/docs/reference/rest/v1/namespaces.revisions/get)
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint.CloudRunRevisionEndpoint cloud_run_revision = 12;
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.CloudRunRevisionEndpointOrBuilder
      getCloudRunRevisionOrBuilder();

  /**
   *
   *
   * <pre>
   * A Compute Engine network URI.
   * </pre>
   *
   * <code>string network = 4;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * A Compute Engine network URI.
   * </pre>
   *
   * <code>string network = 4;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Type of the network where the endpoint is located.
   * Applicable only to source endpoint, as destination network type can be
   * inferred from the source.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType network_type = 5;</code>
   *
   * @return The enum numeric value on the wire for networkType.
   */
  int getNetworkTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the network where the endpoint is located.
   * Applicable only to source endpoint, as destination network type can be
   * inferred from the source.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType network_type = 5;</code>
   *
   * @return The networkType.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType getNetworkType();

  /**
   *
   *
   * <pre>
   * Project ID where the endpoint is located.
   * The Project ID can be derived from the URI if you provide a VM instance or
   * network URI.
   * The following are two cases where you must provide the project ID:
   * 1. Only the IP address is specified, and the IP address is within a Google
   * Cloud project.
   * 2. When you are using Shared VPC and the IP address that you provide is
   * from the service project. In this case, the network that the IP address
   * resides in is defined in the host project.
   * </pre>
   *
   * <code>string project_id = 6;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID where the endpoint is located.
   * The Project ID can be derived from the URI if you provide a VM instance or
   * network URI.
   * The following are two cases where you must provide the project ID:
   * 1. Only the IP address is specified, and the IP address is within a Google
   * Cloud project.
   * 2. When you are using Shared VPC and the IP address that you provide is
   * from the service project. In this case, the network that the IP address
   * resides in is defined in the host project.
   * </pre>
   *
   * <code>string project_id = 6;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();
}
