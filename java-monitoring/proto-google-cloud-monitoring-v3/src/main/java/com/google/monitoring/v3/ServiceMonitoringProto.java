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
// source: google/monitoring/v3/service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public final class ServiceMonitoringProto {
  private ServiceMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_Custom_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_Custom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_AppEngine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_AppEngine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_CloudEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_ClusterIstio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_MeshIstio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_MeshIstio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_IstioCanonicalService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_Telemetry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_Telemetry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelObjective_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelIndicator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Range_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_RequestBasedSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DistributionCut_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/monitoring/v3/service.proto\022\024go"
          + "ogle.monitoring.v3\032\031google/api/resource."
          + "proto\032\036google/protobuf/duration.proto\032!g"
          + "oogle/type/calendar_period.proto\"\311\t\n\007Ser"
          + "vice\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t"
          + "\0226\n\006custom\030\006 \001(\0132$.google.monitoring.v3."
          + "Service.CustomH\000\022=\n\napp_engine\030\007 \001(\0132\'.g"
          + "oogle.monitoring.v3.Service.AppEngineH\000\022"
          + "G\n\017cloud_endpoints\030\010 \001(\0132,.google.monito"
          + "ring.v3.Service.CloudEndpointsH\000\022C\n\rclus"
          + "ter_istio\030\t \001(\0132*.google.monitoring.v3.S"
          + "ervice.ClusterIstioH\000\022=\n\nmesh_istio\030\n \001("
          + "\0132\'.google.monitoring.v3.Service.MeshIst"
          + "ioH\000\022V\n\027istio_canonical_service\030\013 \001(\01323."
          + "google.monitoring.v3.Service.IstioCanoni"
          + "calServiceH\000\022:\n\ttelemetry\030\r \001(\0132\'.google"
          + ".monitoring.v3.Service.Telemetry\022B\n\013user"
          + "_labels\030\016 \003(\0132-.google.monitoring.v3.Ser"
          + "vice.UserLabelsEntry\032\010\n\006Custom\032\036\n\tAppEng"
          + "ine\022\021\n\tmodule_id\030\001 \001(\t\032!\n\016CloudEndpoints"
          + "\022\017\n\007service\030\001 \001(\t\032g\n\014ClusterIstio\022\020\n\010loc"
          + "ation\030\001 \001(\t\022\024\n\014cluster_name\030\002 \001(\t\022\031\n\021ser"
          + "vice_namespace\030\003 \001(\t\022\024\n\014service_name\030\004 \001"
          + "(\t\032N\n\tMeshIstio\022\020\n\010mesh_uid\030\001 \001(\t\022\031\n\021ser"
          + "vice_namespace\030\003 \001(\t\022\024\n\014service_name\030\004 \001"
          + "(\t\032i\n\025IstioCanonicalService\022\020\n\010mesh_uid\030"
          + "\001 \001(\t\022#\n\033canonical_service_namespace\030\003 \001"
          + "(\t\022\031\n\021canonical_service\030\004 \001(\t\032\"\n\tTelemet"
          + "ry\022\025\n\rresource_name\030\001 \001(\t\0321\n\017UserLabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\247\001\352"
          + "A\243\001\n!monitoring.googleapis.com/Service\022%"
          + "projects/{project}/services/{service}\022/o"
          + "rganizations/{organization}/services/{se"
          + "rvice}\022#folders/{folder}/services/{servi"
          + "ce}\022\001*B\014\n\nidentifier\"\226\006\n\025ServiceLevelObj"
          + "ective\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\013 \001"
          + "(\t\022L\n\027service_level_indicator\030\003 \001(\0132+.go"
          + "ogle.monitoring.v3.ServiceLevelIndicator"
          + "\022\014\n\004goal\030\004 \001(\001\0223\n\016rolling_period\030\005 \001(\0132\031"
          + ".google.protobuf.DurationH\000\0226\n\017calendar_"
          + "period\030\006 \001(\0162\033.google.type.CalendarPerio"
          + "dH\000\022P\n\013user_labels\030\014 \003(\0132;.google.monito"
          + "ring.v3.ServiceLevelObjective.UserLabels"
          + "Entry\0321\n\017UserLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"4\n\004View\022\024\n\020VIEW_UNSPECI"
          + "FIED\020\000\022\010\n\004FULL\020\002\022\014\n\010EXPLICIT\020\001:\312\002\352A\306\002\n/m"
          + "onitoring.googleapis.com/ServiceLevelObj"
          + "ective\022Vprojects/{project}/services/{ser"
          + "vice}/serviceLevelObjectives/{service_le"
          + "vel_objective}\022`organizations/{organizat"
          + "ion}/services/{service}/serviceLevelObje"
          + "ctives/{service_level_objective}\022Tfolder"
          + "s/{folder}/services/{service}/serviceLev"
          + "elObjectives/{service_level_objective}\022\001"
          + "* \001B\010\n\006period\"\324\001\n\025ServiceLevelIndicator\022"
          + "3\n\tbasic_sli\030\004 \001(\0132\036.google.monitoring.v"
          + "3.BasicSliH\000\022>\n\rrequest_based\030\001 \001(\0132%.go"
          + "ogle.monitoring.v3.RequestBasedSliH\000\022>\n\r"
          + "windows_based\030\002 \001(\0132%.google.monitoring."
          + "v3.WindowsBasedSliH\000B\006\n\004type\"\266\002\n\010BasicSl"
          + "i\022\016\n\006method\030\007 \003(\t\022\020\n\010location\030\010 \003(\t\022\017\n\007v"
          + "ersion\030\t \003(\t\022K\n\014availability\030\002 \001(\01323.goo"
          + "gle.monitoring.v3.BasicSli.AvailabilityC"
          + "riteriaH\000\022A\n\007latency\030\003 \001(\0132..google.moni"
          + "toring.v3.BasicSli.LatencyCriteriaH\000\032\026\n\024"
          + "AvailabilityCriteria\032?\n\017LatencyCriteria\022"
          + ",\n\tthreshold\030\003 \001(\0132\031.google.protobuf.Dur"
          + "ationB\016\n\014sli_criteria\"!\n\005Range\022\013\n\003min\030\001 "
          + "\001(\001\022\013\n\003max\030\002 \001(\001\"\241\001\n\017RequestBasedSli\022A\n\020"
          + "good_total_ratio\030\001 \001(\0132%.google.monitori"
          + "ng.v3.TimeSeriesRatioH\000\022A\n\020distribution_"
          + "cut\030\003 \001(\0132%.google.monitoring.v3.Distrib"
          + "utionCutH\000B\010\n\006method\"h\n\017TimeSeriesRatio\022"
          + "\033\n\023good_service_filter\030\004 \001(\t\022\032\n\022bad_serv"
          + "ice_filter\030\005 \001(\t\022\034\n\024total_service_filter"
          + "\030\006 \001(\t\"Z\n\017DistributionCut\022\033\n\023distributio"
          + "n_filter\030\004 \001(\t\022*\n\005range\030\005 \001(\0132\033.google.m"
          + "onitoring.v3.Range\"\203\005\n\017WindowsBasedSli\022 "
          + "\n\026good_bad_metric_filter\030\005 \001(\tH\000\022`\n\032good"
          + "_total_ratio_threshold\030\002 \001(\0132:.google.mo"
          + "nitoring.v3.WindowsBasedSli.PerformanceT"
          + "hresholdH\000\022Q\n\024metric_mean_in_range\030\006 \001(\013"
          + "21.google.monitoring.v3.WindowsBasedSli."
          + "MetricRangeH\000\022P\n\023metric_sum_in_range\030\007 \001"
          + "(\01321.google.monitoring.v3.WindowsBasedSl"
          + "i.MetricRangeH\000\0220\n\rwindow_period\030\004 \001(\0132\031"
          + ".google.protobuf.Duration\032\260\001\n\024Performanc"
          + "eThreshold\022<\n\013performance\030\001 \001(\0132%.google"
          + ".monitoring.v3.RequestBasedSliH\000\022?\n\025basi"
          + "c_sli_performance\030\003 \001(\0132\036.google.monitor"
          + "ing.v3.BasicSliH\000\022\021\n\tthreshold\030\002 \001(\001B\006\n\004"
          + "type\032N\n\013MetricRange\022\023\n\013time_series\030\001 \001(\t"
          + "\022*\n\005range\030\004 \001(\0132\033.google.monitoring.v3.R"
          + "angeB\022\n\020window_criterionB\321\001\n\030com.google."
          + "monitoring.v3B\026ServiceMonitoringProtoP\001Z"
          + "Acloud.google.com/go/monitoring/apiv3/v2"
          + "/monitoringpb;monitoringpb\252\002\032Google.Clou"
          + "d.Monitoring.V3\312\002\032Google\\Cloud\\Monitorin"
          + "g\\V3\352\002\035Google::Cloud::Monitoring::V3b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.CalendarPeriodProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Custom",
              "AppEngine",
              "CloudEndpoints",
              "ClusterIstio",
              "MeshIstio",
              "IstioCanonicalService",
              "Telemetry",
              "UserLabels",
              "Identifier",
            });
    internal_static_google_monitoring_v3_Service_Custom_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_Service_Custom_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_Custom_descriptor,
            new java.lang.String[] {});
    internal_static_google_monitoring_v3_Service_AppEngine_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_Service_AppEngine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_AppEngine_descriptor,
            new java.lang.String[] {
              "ModuleId",
            });
    internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_Service_CloudEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor,
            new java.lang.String[] {
              "Service",
            });
    internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_Service_ClusterIstio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor,
            new java.lang.String[] {
              "Location", "ClusterName", "ServiceNamespace", "ServiceName",
            });
    internal_static_google_monitoring_v3_Service_MeshIstio_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(4);
    internal_static_google_monitoring_v3_Service_MeshIstio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_MeshIstio_descriptor,
            new java.lang.String[] {
              "MeshUid", "ServiceNamespace", "ServiceName",
            });
    internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(5);
    internal_static_google_monitoring_v3_Service_IstioCanonicalService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor,
            new java.lang.String[] {
              "MeshUid", "CanonicalServiceNamespace", "CanonicalService",
            });
    internal_static_google_monitoring_v3_Service_Telemetry_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(6);
    internal_static_google_monitoring_v3_Service_Telemetry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_Telemetry_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(7);
    internal_static_google_monitoring_v3_Service_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ServiceLevelObjective_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ServiceLevelIndicator",
              "Goal",
              "RollingPeriod",
              "CalendarPeriod",
              "UserLabels",
              "Period",
            });
    internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ServiceLevelIndicator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor,
            new java.lang.String[] {
              "BasicSli", "RequestBased", "WindowsBased", "Type",
            });
    internal_static_google_monitoring_v3_BasicSli_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_BasicSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_descriptor,
            new java.lang.String[] {
              "Method", "Location", "Version", "Availability", "Latency", "SliCriteria",
            });
    internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor =
        internal_static_google_monitoring_v3_BasicSli_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor,
            new java.lang.String[] {});
    internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor =
        internal_static_google_monitoring_v3_BasicSli_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor,
            new java.lang.String[] {
              "Threshold",
            });
    internal_static_google_monitoring_v3_Range_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_Range_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Range_descriptor,
            new java.lang.String[] {
              "Min", "Max",
            });
    internal_static_google_monitoring_v3_RequestBasedSli_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_RequestBasedSli_descriptor,
            new java.lang.String[] {
              "GoodTotalRatio", "DistributionCut", "Method",
            });
    internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor,
            new java.lang.String[] {
              "GoodServiceFilter", "BadServiceFilter", "TotalServiceFilter",
            });
    internal_static_google_monitoring_v3_DistributionCut_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DistributionCut_descriptor,
            new java.lang.String[] {
              "DistributionFilter", "Range",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_WindowsBasedSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_descriptor,
            new java.lang.String[] {
              "GoodBadMetricFilter",
              "GoodTotalRatioThreshold",
              "MetricMeanInRange",
              "MetricSumInRange",
              "WindowPeriod",
              "WindowCriterion",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor =
        internal_static_google_monitoring_v3_WindowsBasedSli_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor,
            new java.lang.String[] {
              "Performance", "BasicSliPerformance", "Threshold", "Type",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor =
        internal_static_google_monitoring_v3_WindowsBasedSli_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor,
            new java.lang.String[] {
              "TimeSeries", "Range",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.CalendarPeriodProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
