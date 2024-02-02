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

public final class TestOuterClass {
  private TestOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudFunctionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudFunctionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_AppEngineVersionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_AppEngineVersionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudRunRevisionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudRunRevisionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ReachabilityDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ReachabilityDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_EdgeLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_EdgeLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/networkmanagement/v1beta1"
          + "/connectivity_test.proto\022&google.cloud.n"
          + "etworkmanagement.v1beta1\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\0322google/cloud/networkmanagement/v1b"
          + "eta1/trace.proto\032\037google/protobuf/timest"
          + "amp.proto\032\027google/rpc/status.proto\"\271\006\n\020C"
          + "onnectivityTest\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\023\n\013d"
          + "escription\030\002 \001(\t\022F\n\006source\030\003 \001(\01320.googl"
          + "e.cloud.networkmanagement.v1beta1.Endpoi"
          + "ntB\004\342A\001\002\022K\n\013destination\030\004 \001(\01320.google.c"
          + "loud.networkmanagement.v1beta1.EndpointB"
          + "\004\342A\001\002\022\020\n\010protocol\030\005 \001(\t\022\030\n\020related_proje"
          + "cts\030\006 \003(\t\022\032\n\014display_name\030\007 \001(\tB\004\342A\001\003\022T\n"
          + "\006labels\030\010 \003(\0132D.google.cloud.networkmana"
          + "gement.v1beta1.ConnectivityTest.LabelsEn"
          + "try\0225\n\013create_time\030\n \001(\0132\032.google.protob"
          + "uf.TimestampB\004\342A\001\003\0225\n\013update_time\030\013 \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\022_\n\024rea"
          + "chability_details\030\014 \001(\0132;.google.cloud.n"
          + "etworkmanagement.v1beta1.ReachabilityDet"
          + "ailsB\004\342A\001\003\022U\n\017probing_details\030\016 \001(\01326.go"
          + "ogle.cloud.networkmanagement.v1beta1.Pro"
          + "bingDetailsB\004\342A\001\003\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:t\352Aq\n1networkma"
          + "nagement.googleapis.com/ConnectivityTest"
          + "\022<projects/{project}/locations/global/co"
          + "nnectivityTests/{test}\"\273\t\n\010Endpoint\022\022\n\ni"
          + "p_address\030\001 \001(\t\022\014\n\004port\030\002 \001(\005\022\020\n\010instanc"
          + "e\030\003 \001(\t\022\027\n\017forwarding_rule\030\r \001(\t\022p\n\026forw"
          + "arding_rule_target\030\016 \001(\0162E.google.cloud."
          + "networkmanagement.v1beta1.Endpoint.Forwa"
          + "rdingRuleTargetB\004\342A\001\003H\000\210\001\001\022#\n\020load_balan"
          + "cer_id\030\017 \001(\tB\004\342A\001\003H\001\210\001\001\022_\n\022load_balancer"
          + "_type\030\020 \001(\01628.google.cloud.networkmanage"
          + "ment.v1beta1.LoadBalancerTypeB\004\342A\001\003H\002\210\001\001"
          + "\022\032\n\022gke_master_cluster\030\007 \001(\t\022\032\n\022cloud_sq"
          + "l_instance\030\010 \001(\t\022^\n\016cloud_function\030\n \001(\013"
          + "2F.google.cloud.networkmanagement.v1beta"
          + "1.Endpoint.CloudFunctionEndpoint\022e\n\022app_"
          + "engine_version\030\013 \001(\0132I.google.cloud.netw"
          + "orkmanagement.v1beta1.Endpoint.AppEngine"
          + "VersionEndpoint\022e\n\022cloud_run_revision\030\014 "
          + "\001(\0132I.google.cloud.networkmanagement.v1b"
          + "eta1.Endpoint.CloudRunRevisionEndpoint\022\017"
          + "\n\007network\030\004 \001(\t\022R\n\014network_type\030\005 \001(\0162<."
          + "google.cloud.networkmanagement.v1beta1.E"
          + "ndpoint.NetworkType\022\022\n\nproject_id\030\006 \001(\t\032"
          + "$\n\025CloudFunctionEndpoint\022\013\n\003uri\030\001 \001(\t\032\'\n"
          + "\030AppEngineVersionEndpoint\022\013\n\003uri\030\001 \001(\t\032\'"
          + "\n\030CloudRunRevisionEndpoint\022\013\n\003uri\030\001 \001(\t\""
          + "Q\n\013NetworkType\022\034\n\030NETWORK_TYPE_UNSPECIFI"
          + "ED\020\000\022\017\n\013GCP_NETWORK\020\001\022\023\n\017NON_GCP_NETWORK"
          + "\020\002\"y\n\024ForwardingRuleTarget\022&\n\"FORWARDING"
          + "_RULE_TARGET_UNSPECIFIED\020\000\022\014\n\010INSTANCE\020\001"
          + "\022\021\n\rLOAD_BALANCER\020\002\022\017\n\013VPN_GATEWAY\020\003\022\007\n\003"
          + "PSC\020\004B\031\n\027_forwarding_rule_targetB\023\n\021_loa"
          + "d_balancer_idB\025\n\023_load_balancer_type\"\337\002\n"
          + "\023ReachabilityDetails\022R\n\006result\030\001 \001(\0162B.g"
          + "oogle.cloud.networkmanagement.v1beta1.Re"
          + "achabilityDetails.Result\022/\n\013verify_time\030"
          + "\002 \001(\0132\032.google.protobuf.Timestamp\022!\n\005err"
          + "or\030\003 \001(\0132\022.google.rpc.Status\022=\n\006traces\030\005"
          + " \003(\0132-.google.cloud.networkmanagement.v1"
          + "beta1.Trace\"a\n\006Result\022\026\n\022RESULT_UNSPECIF"
          + "IED\020\000\022\r\n\tREACHABLE\020\001\022\017\n\013UNREACHABLE\020\002\022\r\n"
          + "\tAMBIGUOUS\020\004\022\020\n\014UNDETERMINED\020\005\"<\n\021Latenc"
          + "yPercentile\022\017\n\007percent\030\001 \001(\005\022\026\n\016latency_"
          + "micros\030\002 \001(\003\"m\n\023LatencyDistribution\022V\n\023l"
          + "atency_percentiles\030\001 \003(\01329.google.cloud."
          + "networkmanagement.v1beta1.LatencyPercent"
          + "ile\"\367\006\n\016ProbingDetails\022T\n\006result\030\001 \001(\0162D"
          + ".google.cloud.networkmanagement.v1beta1."
          + "ProbingDetails.ProbingResult\022/\n\013verify_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\022!\n"
          + "\005error\030\003 \001(\0132\022.google.rpc.Status\022]\n\013abor"
          + "t_cause\030\004 \001(\0162H.google.cloud.networkmana"
          + "gement.v1beta1.ProbingDetails.ProbingAbo"
          + "rtCause\022\030\n\020sent_probe_count\030\005 \001(\005\022\036\n\026suc"
          + "cessful_probe_count\030\006 \001(\005\022K\n\rendpoint_in"
          + "fo\030\007 \001(\01324.google.cloud.networkmanagemen"
          + "t.v1beta1.EndpointInfo\022T\n\017probing_latenc"
          + "y\030\010 \001(\0132;.google.cloud.networkmanagement"
          + ".v1beta1.LatencyDistribution\022h\n\033destinat"
          + "ion_egress_location\030\t \001(\0132C.google.cloud"
          + ".networkmanagement.v1beta1.ProbingDetail"
          + "s.EdgeLocation\032)\n\014EdgeLocation\022\031\n\021metrop"
          + "olitan_area\030\001 \001(\t\"\200\001\n\rProbingResult\022\036\n\032P"
          + "ROBING_RESULT_UNSPECIFIED\020\000\022\r\n\tREACHABLE"
          + "\020\001\022\017\n\013UNREACHABLE\020\002\022\035\n\031REACHABILITY_INCO"
          + "NSISTENT\020\003\022\020\n\014UNDETERMINED\020\004\"g\n\021ProbingA"
          + "bortCause\022#\n\037PROBING_ABORT_CAUSE_UNSPECI"
          + "FIED\020\000\022\025\n\021PERMISSION_DENIED\020\001\022\026\n\022NO_SOUR"
          + "CE_LOCATION\020\002B\226\002\n*com.google.cloud.netwo"
          + "rkmanagement.v1beta1B\016TestOuterClassP\001ZX"
          + "cloud.google.com/go/networkmanagement/ap"
          + "iv1beta1/networkmanagementpb;networkmana"
          + "gementpb\252\002&Google.Cloud.NetworkManagemen"
          + "t.V1Beta1\312\002&Google\\Cloud\\NetworkManageme"
          + "nt\\V1beta1\352\002)Google::Cloud::NetworkManag"
          + "ement::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networkmanagement.v1beta1.TraceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Source",
              "Destination",
              "Protocol",
              "RelatedProjects",
              "DisplayName",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "ReachabilityDetails",
              "ProbingDetails",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_LabelsEntry_descriptor =
        internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ConnectivityTest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor,
            new java.lang.String[] {
              "IpAddress",
              "Port",
              "Instance",
              "ForwardingRule",
              "ForwardingRuleTarget",
              "LoadBalancerId",
              "LoadBalancerType",
              "GkeMasterCluster",
              "CloudSqlInstance",
              "CloudFunction",
              "AppEngineVersion",
              "CloudRunRevision",
              "Network",
              "NetworkType",
              "ProjectId",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudFunctionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudFunctionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudFunctionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_AppEngineVersionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_AppEngineVersionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_AppEngineVersionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudRunRevisionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudRunRevisionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Endpoint_CloudRunRevisionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ReachabilityDetails_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1beta1_ReachabilityDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ReachabilityDetails_descriptor,
            new java.lang.String[] {
              "Result", "VerifyTime", "Error", "Traces",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor,
            new java.lang.String[] {
              "Percent", "LatencyMicros",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor,
            new java.lang.String[] {
              "LatencyPercentiles",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_descriptor,
            new java.lang.String[] {
              "Result",
              "VerifyTime",
              "Error",
              "AbortCause",
              "SentProbeCount",
              "SuccessfulProbeCount",
              "EndpointInfo",
              "ProbingLatency",
              "DestinationEgressLocation",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_EdgeLocation_descriptor =
        internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_EdgeLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ProbingDetails_EdgeLocation_descriptor,
            new java.lang.String[] {
              "MetropolitanArea",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkmanagement.v1beta1.TraceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
