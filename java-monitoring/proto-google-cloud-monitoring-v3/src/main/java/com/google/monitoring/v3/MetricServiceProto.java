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

public final class MetricServiceProto {
  private MetricServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryErrorList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/metric_service.pr"
          + "oto\022\024google.monitoring.v3\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\027googl"
          + "e/api/metric.proto\032#google/api/monitored"
          + "_resource.proto\032\031google/api/resource.pro"
          + "to\032!google/monitoring/v3/common.proto\032!g"
          + "oogle/monitoring/v3/metric.proto\032\033google"
          + "/protobuf/empty.proto\032\027google/rpc/status"
          + ".proto\"\256\001\n\'ListMonitoredResourceDescript"
          + "orsRequest\022L\n\004name\030\005 \001(\tB>\342A\001\002\372A7\0225monit"
          + "oring.googleapis.com/MonitoredResourceDe"
          + "scriptor\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 "
          + "\001(\005\022\022\n\npage_token\030\004 \001(\t\"\212\001\n(ListMonitore"
          + "dResourceDescriptorsResponse\022E\n\024resource"
          + "_descriptors\030\001 \003(\0132\'.google.api.Monitore"
          + "dResourceDescriptor\022\027\n\017next_page_token\030\002"
          + " \001(\t\"u\n%GetMonitoredResourceDescriptorRe"
          + "quest\022L\n\004name\030\003 \001(\tB>\342A\001\002\372A7\n5monitoring"
          + ".googleapis.com/MonitoredResourceDescrip"
          + "tor\"\230\001\n\034ListMetricDescriptorsRequest\022A\n\004"
          + "name\030\005 \001(\tB3\342A\001\002\372A,\022*monitoring.googleap"
          + "is.com/MetricDescriptor\022\016\n\006filter\030\002 \001(\t\022"
          + "\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"r"
          + "\n\035ListMetricDescriptorsResponse\0228\n\022metri"
          + "c_descriptors\030\001 \003(\0132\034.google.api.MetricD"
          + "escriptor\022\027\n\017next_page_token\030\002 \001(\t\"_\n\032Ge"
          + "tMetricDescriptorRequest\022A\n\004name\030\003 \001(\tB3"
          + "\342A\001\002\372A,\n*monitoring.googleapis.com/Metri"
          + "cDescriptor\"\241\001\n\035CreateMetricDescriptorRe"
          + "quest\022A\n\004name\030\003 \001(\tB3\342A\001\002\372A,\022*monitoring"
          + ".googleapis.com/MetricDescriptor\022=\n\021metr"
          + "ic_descriptor\030\002 \001(\0132\034.google.api.MetricD"
          + "escriptorB\004\342A\001\002\"b\n\035DeleteMetricDescripto"
          + "rRequest\022A\n\004name\030\003 \001(\tB3\342A\001\002\372A,\n*monitor"
          + "ing.googleapis.com/MetricDescriptor\"\322\003\n\025"
          + "ListTimeSeriesRequest\022;\n\004name\030\n \001(\tB-\342A\001"
          + "\002\372A&\022$monitoring.googleapis.com/TimeSeri"
          + "es\022\024\n\006filter\030\002 \001(\tB\004\342A\001\002\022:\n\010interval\030\004 \001"
          + "(\0132\".google.monitoring.v3.TimeIntervalB\004"
          + "\342A\001\002\0226\n\013aggregation\030\005 \001(\0132!.google.monit"
          + "oring.v3.Aggregation\022@\n\025secondary_aggreg"
          + "ation\030\013 \001(\0132!.google.monitoring.v3.Aggre"
          + "gation\022\020\n\010order_by\030\006 \001(\t\022N\n\004view\030\007 \001(\0162:"
          + ".google.monitoring.v3.ListTimeSeriesRequ"
          + "est.TimeSeriesViewB\004\342A\001\002\022\021\n\tpage_size\030\010 "
          + "\001(\005\022\022\n\npage_token\030\t \001(\t\"\'\n\016TimeSeriesVie"
          + "w\022\010\n\004FULL\020\000\022\013\n\007HEADERS\020\001\"\244\001\n\026ListTimeSer"
          + "iesResponse\0225\n\013time_series\030\001 \003(\0132 .googl"
          + "e.monitoring.v3.TimeSeries\022\027\n\017next_page_"
          + "token\030\002 \001(\t\022,\n\020execution_errors\030\003 \003(\0132\022."
          + "google.rpc.Status\022\014\n\004unit\030\005 \001(\t\"\232\001\n\027Crea"
          + "teTimeSeriesRequest\022B\n\004name\030\003 \001(\tB4\342A\001\002\372"
          + "A-\n+cloudresourcemanager.googleapis.com/"
          + "Project\022;\n\013time_series\030\002 \003(\0132 .google.mo"
          + "nitoring.v3.TimeSeriesB\004\342A\001\002\"z\n\025CreateTi"
          + "meSeriesError\0229\n\013time_series\030\001 \001(\0132 .goo"
          + "gle.monitoring.v3.TimeSeriesB\002\030\001\022&\n\006stat"
          + "us\030\002 \001(\0132\022.google.rpc.StatusB\002\030\001\"\330\001\n\027Cre"
          + "ateTimeSeriesSummary\022\031\n\021total_point_coun"
          + "t\030\001 \001(\005\022\033\n\023success_point_count\030\002 \001(\005\022C\n\006"
          + "errors\030\003 \003(\01323.google.monitoring.v3.Crea"
          + "teTimeSeriesSummary.Error\032@\n\005Error\022\"\n\006st"
          + "atus\030\001 \001(\0132\022.google.rpc.Status\022\023\n\013point_"
          + "count\030\002 \001(\005\"h\n\026QueryTimeSeriesRequest\022\022\n"
          + "\004name\030\001 \001(\tB\004\342A\001\002\022\023\n\005query\030\007 \001(\tB\004\342A\001\002\022\021"
          + "\n\tpage_size\030\t \001(\005\022\022\n\npage_token\030\n \001(\t\"\352\001"
          + "\n\027QueryTimeSeriesResponse\022J\n\026time_series"
          + "_descriptor\030\010 \001(\0132*.google.monitoring.v3"
          + ".TimeSeriesDescriptor\022>\n\020time_series_dat"
          + "a\030\t \003(\0132$.google.monitoring.v3.TimeSerie"
          + "sData\022\027\n\017next_page_token\030\n \001(\t\022*\n\016partia"
          + "l_errors\030\013 \003(\0132\022.google.rpc.Status\"Y\n\016Qu"
          + "eryErrorList\0220\n\006errors\030\001 \003(\0132 .google.mo"
          + "nitoring.v3.QueryError\022\025\n\rerror_summary\030"
          + "\002 \001(\t2\274\017\n\rMetricService\022\344\001\n ListMonitore"
          + "dResourceDescriptors\022=.google.monitoring"
          + ".v3.ListMonitoredResourceDescriptorsRequ"
          + "est\032>.google.monitoring.v3.ListMonitored"
          + "ResourceDescriptorsResponse\"A\332A\004name\202\323\344\223"
          + "\0024\0222/v3/{name=projects/*}/monitoredResou"
          + "rceDescriptors\022\314\001\n\036GetMonitoredResourceD"
          + "escriptor\022;.google.monitoring.v3.GetMoni"
          + "toredResourceDescriptorRequest\032\'.google."
          + "api.MonitoredResourceDescriptor\"D\332A\004name"
          + "\202\323\344\223\0027\0225/v3/{name=projects/*/monitoredRe"
          + "sourceDescriptors/**}\022\270\001\n\025ListMetricDesc"
          + "riptors\0222.google.monitoring.v3.ListMetri"
          + "cDescriptorsRequest\0323.google.monitoring."
          + "v3.ListMetricDescriptorsResponse\"6\332A\004nam"
          + "e\202\323\344\223\002)\022\'/v3/{name=projects/*}/metricDes"
          + "criptors\022\240\001\n\023GetMetricDescriptor\0220.googl"
          + "e.monitoring.v3.GetMetricDescriptorReque"
          + "st\032\034.google.api.MetricDescriptor\"9\332A\004nam"
          + "e\202\323\344\223\002,\022*/v3/{name=projects/*/metricDesc"
          + "riptors/**}\022\310\001\n\026CreateMetricDescriptor\0223"
          + ".google.monitoring.v3.CreateMetricDescri"
          + "ptorRequest\032\034.google.api.MetricDescripto"
          + "r\"[\332A\026name,metric_descriptor\202\323\344\223\002<\"\'/v3/"
          + "{name=projects/*}/metricDescriptors:\021met"
          + "ric_descriptor\022\240\001\n\026DeleteMetricDescripto"
          + "r\0223.google.monitoring.v3.DeleteMetricDes"
          + "criptorRequest\032\026.google.protobuf.Empty\"9"
          + "\332A\004name\202\323\344\223\002,**/v3/{name=projects/*/metr"
          + "icDescriptors/**}\022\376\001\n\016ListTimeSeries\022+.g"
          + "oogle.monitoring.v3.ListTimeSeriesReques"
          + "t\032,.google.monitoring.v3.ListTimeSeriesR"
          + "esponse\"\220\001\332A\031name,filter,interval,view\202\323"
          + "\344\223\002n\022 /v3/{name=projects/*}/timeSeriesZ\'"
          + "\022%/v3/{name=organizations/*}/timeSeriesZ"
          + "!\022\037/v3/{name=folders/*}/timeSeries\022\231\001\n\020C"
          + "reateTimeSeries\022-.google.monitoring.v3.C"
          + "reateTimeSeriesRequest\032\026.google.protobuf"
          + ".Empty\">\332A\020name,time_series\202\323\344\223\002%\" /v3/{"
          + "name=projects/*}/timeSeries:\001*\022\256\001\n\027Creat"
          + "eServiceTimeSeries\022-.google.monitoring.v"
          + "3.CreateTimeSeriesRequest\032\026.google.proto"
          + "buf.Empty\"L\332A\020name,time_series\202\323\344\223\0023\"./v"
          + "3/{name=projects/*}/timeSeries:createSer"
          + "vice:\001*\032\332\001\312A\031monitoring.googleapis.com\322A"
          + "\272\001https://www.googleapis.com/auth/cloud-"
          + "platform,https://www.googleapis.com/auth"
          + "/monitoring,https://www.googleapis.com/a"
          + "uth/monitoring.read,https://www.googleap"
          + "is.com/auth/monitoring.writeB\211\010\n\030com.goo"
          + "gle.monitoring.v3B\022MetricServiceProtoP\001Z"
          + "Acloud.google.com/go/monitoring/apiv3/v2"
          + "/monitoringpb;monitoringpb\252\002\032Google.Clou"
          + "d.Monitoring.V3\312\002\032Google\\Cloud\\Monitorin"
          + "g\\V3\352\002\035Google::Cloud::Monitoring::V3\352A\360\001"
          + "\n*monitoring.googleapis.com/MetricDescri"
          + "ptor\022;projects/{project}/metricDescripto"
          + "rs/{metric_descriptor=**}\022Eorganizations"
          + "/{organization}/metricDescriptors/{metri"
          + "c_descriptor=**}\0229folders/{folder}/metri"
          + "cDescriptors/{metric_descriptor=**}\022\001* \001"
          + "\352A\267\002\n5monitoring.googleapis.com/Monitore"
          + "dResourceDescriptor\022Oprojects/{project}/"
          + "monitoredResourceDescriptors/{monitored_"
          + "resource_descriptor}\022Yorganizations/{org"
          + "anization}/monitoredResourceDescriptors/"
          + "{monitored_resource_descriptor}\022Mfolders"
          + "/{folder}/monitoredResourceDescriptors/{"
          + "monitored_resource_descriptor}\022\001* \001\352AQ\n#"
          + "monitoring.googleapis.com/Workspace\022\022pro"
          + "jects/{project}\022\026workspaces/{workspace}\352"
          + "A\265\001\n$monitoring.googleapis.com/TimeSerie"
          + "s\022+projects/{project}/timeSeries/{time_s"
          + "eries}\0225organizations/{organization}/tim"
          + "eSeries/{time_series}\022)folders/{folder}/"
          + "timeSeries/{time_series}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.MetricProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ResourceDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "MetricDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name", "MetricDescriptor",
            });
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Filter",
              "Interval",
              "Aggregation",
              "SecondaryAggregation",
              "OrderBy",
              "View",
              "PageSize",
              "PageToken",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor,
            new java.lang.String[] {
              "TimeSeries", "NextPageToken", "ExecutionErrors", "Unit",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name", "TimeSeries",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor,
            new java.lang.String[] {
              "TimeSeries", "Status",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor,
            new java.lang.String[] {
              "TotalPointCount", "SuccessPointCount", "Errors",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor =
        internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor,
            new java.lang.String[] {
              "Status", "PointCount",
            });
    internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_monitoring_v3_QueryTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name", "Query", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_monitoring_v3_QueryTimeSeriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor,
            new java.lang.String[] {
              "TimeSeriesDescriptor", "TimeSeriesData", "NextPageToken", "PartialErrors",
            });
    internal_static_google_monitoring_v3_QueryErrorList_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryErrorList_descriptor,
            new java.lang.String[] {
              "Errors", "ErrorSummary",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MetricProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
