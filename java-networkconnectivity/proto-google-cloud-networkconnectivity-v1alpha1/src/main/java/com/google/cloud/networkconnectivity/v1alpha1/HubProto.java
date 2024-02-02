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
// source: google/cloud/networkconnectivity/v1alpha1/hub.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkconnectivity.v1alpha1;

public final class HubProto {
  private HubProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_GetHubRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_GetHubRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_CreateHubRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_CreateHubRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateHubRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateHubRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteHubRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteHubRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_GetSpokeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_GetSpokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_CreateSpokeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_CreateSpokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateSpokeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateSpokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteSpokeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteSpokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/networkconnectivity/v1alp"
          + "ha1/hub.proto\022)google.cloud.networkconne"
          + "ctivity.v1alpha1\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032#google/longrunning/operatio"
          + "ns.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\213\004\n\003"
          + "Hub\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022/\n\013create_time\030\002"
          + " \001(\0132\032.google.protobuf.Timestamp\022/\n\013upda"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "p\022J\n\006labels\030\004 \003(\0132:.google.cloud.network"
          + "connectivity.v1alpha1.Hub.LabelsEntry\022\023\n"
          + "\013description\030\005 \001(\t\022A\n\006spokes\030\006 \003(\tB1\342A\001\003"
          + "\372A*\n(networkconnectivity.googleapis.com/"
          + "Spoke\022\027\n\tunique_id\030\010 \001(\tB\004\342A\001\003\022E\n\005state\030"
          + "\t \001(\01620.google.cloud.networkconnectivity"
          + ".v1alpha1.StateB\004\342A\001\003\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:[\352AX\n&netwo"
          + "rkconnectivity.googleapis.com/Hub\022.proje"
          + "cts/{project}/locations/global/hubs/{hub"
          + "}\"\237\006\n\005Spoke\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022/\n\013creat"
          + "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "\022/\n\013update_time\030\003 \001(\0132\032.google.protobuf."
          + "Timestamp\022L\n\006labels\030\004 \003(\0132<.google.cloud"
          + ".networkconnectivity.v1alpha1.Spoke.Labe"
          + "lsEntry\022\023\n\013description\030\005 \001(\t\0228\n\003hub\030\006 \001("
          + "\tB+\372A(\n&networkconnectivity.googleapis.c"
          + "om/Hub\022A\n\022linked_vpn_tunnels\030\014 \003(\tB%\372A\"\n"
          + " compute.googleapis.com/VpnTunnel\022[\n\037lin"
          + "ked_interconnect_attachments\030\r \003(\tB2\372A/\n"
          + "-compute.googleapis.com/InterconnectAtta"
          + "chment\022m\n!linked_router_appliance_instan"
          + "ces\030\016 \003(\0132B.google.cloud.networkconnecti"
          + "vity.v1alpha1.RouterApplianceInstance\022\027\n"
          + "\tunique_id\030\013 \001(\tB\004\342A\001\003\022E\n\005state\030\017 \001(\01620."
          + "google.cloud.networkconnectivity.v1alpha"
          + "1.StateB\004\342A\001\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001:e\352Ab\n(networkconnec"
          + "tivity.googleapis.com/Spoke\0226projects/{p"
          + "roject}/locations/{location}/spokes/{spo"
          + "ke}\"\226\001\n\017ListHubsRequest\022:\n\006parent\030\001 \001(\tB"
          + "*\342A\001\002\372A#\n!locations.googleapis.com/Locat"
          + "ion\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"~\n\020"
          + "ListHubsResponse\022<\n\004hubs\030\001 \003(\0132..google."
          + "cloud.networkconnectivity.v1alpha1.Hub\022\027"
          + "\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003"
          + " \003(\t\"N\n\rGetHubRequest\022=\n\004name\030\001 \001(\tB/\342A\001"
          + "\002\372A(\n&networkconnectivity.googleapis.com"
          + "/Hub\"\301\001\n\020CreateHubRequest\022:\n\006parent\030\001 \001("
          + "\tB*\342A\001\002\372A#\n!locations.googleapis.com/Loc"
          + "ation\022\024\n\006hub_id\030\002 \001(\tB\004\342A\001\001\022A\n\003hub\030\003 \001(\013"
          + "2..google.cloud.networkconnectivity.v1al"
          + "pha1.HubB\004\342A\001\002\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001"
          + "\"\246\001\n\020UpdateHubRequest\0225\n\013update_mask\030\001 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\004\342A\001\001\022A\n\003"
          + "hub\030\002 \001(\0132..google.cloud.networkconnecti"
          + "vity.v1alpha1.HubB\004\342A\001\002\022\030\n\nrequest_id\030\003 "
          + "\001(\tB\004\342A\001\001\"k\n\020DeleteHubRequest\022=\n\004name\030\001 "
          + "\001(\tB/\342A\001\002\372A(\n&networkconnectivity.google"
          + "apis.com/Hub\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\"\230"
          + "\001\n\021ListSpokesRequest\022:\n\006parent\030\001 \001(\tB*\342A"
          + "\001\002\372A#\n!locations.googleapis.com/Location"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022"
          + "\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"\204\001\n\022Li"
          + "stSpokesResponse\022@\n\006spokes\030\001 \003(\01320.googl"
          + "e.cloud.networkconnectivity.v1alpha1.Spo"
          + "ke\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachab"
          + "le\030\003 \003(\t\"R\n\017GetSpokeRequest\022?\n\004name\030\001 \001("
          + "\tB1\342A\001\002\372A*\n(networkconnectivity.googleap"
          + "is.com/Spoke\"\311\001\n\022CreateSpokeRequest\022:\n\006p"
          + "arent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleap"
          + "is.com/Location\022\026\n\010spoke_id\030\002 \001(\tB\004\342A\001\001\022"
          + "E\n\005spoke\030\003 \001(\01320.google.cloud.networkcon"
          + "nectivity.v1alpha1.SpokeB\004\342A\001\002\022\030\n\nreques"
          + "t_id\030\004 \001(\tB\004\342A\001\001\"\254\001\n\022UpdateSpokeRequest\022"
          + "5\n\013update_mask\030\001 \001(\0132\032.google.protobuf.F"
          + "ieldMaskB\004\342A\001\001\022E\n\005spoke\030\002 \001(\01320.google.c"
          + "loud.networkconnectivity.v1alpha1.SpokeB"
          + "\004\342A\001\002\022\030\n\nrequest_id\030\003 \001(\tB\004\342A\001\001\"o\n\022Delet"
          + "eSpokeRequest\022?\n\004name\030\001 \001(\tB1\342A\001\002\372A*\n(ne"
          + "tworkconnectivity.googleapis.com/Spoke\022\030"
          + "\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\"\213\001\n\027RouterAppli"
          + "anceInstance\022=\n\017virtual_machine\030\001 \001(\tB$\372"
          + "A!\n\037compute.googleapis.com/Instance\022\022\n\ni"
          + "p_address\030\003 \001(\t\022\035\n\021network_interface\030\002 \001"
          + "(\tB\002\030\001*F\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014"
          + "\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010DELETING\020\0032\255"
          + "\021\n\nHubService\022\311\001\n\010ListHubs\022:.google.clou"
          + "d.networkconnectivity.v1alpha1.ListHubsR"
          + "equest\032;.google.cloud.networkconnectivit"
          + "y.v1alpha1.ListHubsResponse\"D\332A\006parent\202\323"
          + "\344\223\0025\0223/v1alpha1/{parent=projects/*/locat"
          + "ions/global}/hubs\022\266\001\n\006GetHub\0228.google.cl"
          + "oud.networkconnectivity.v1alpha1.GetHubR"
          + "equest\032..google.cloud.networkconnectivit"
          + "y.v1alpha1.Hub\"B\332A\004name\202\323\344\223\0025\0223/v1alpha1"
          + "/{name=projects/*/locations/global/hubs/"
          + "*}\022\330\001\n\tCreateHub\022;.google.cloud.networkc"
          + "onnectivity.v1alpha1.CreateHubRequest\032\035."
          + "google.longrunning.Operation\"o\312A\030\n\003Hub\022\021"
          + "OperationMetadata\332A\021parent,hub,hub_id\202\323\344"
          + "\223\002:\"3/v1alpha1/{parent=projects/*/locati"
          + "ons/global}/hubs:\003hub\022\332\001\n\tUpdateHub\022;.go"
          + "ogle.cloud.networkconnectivity.v1alpha1."
          + "UpdateHubRequest\032\035.google.longrunning.Op"
          + "eration\"q\312A\030\n\003Hub\022\021OperationMetadata\332A\017h"
          + "ub,update_mask\202\323\344\223\002>27/v1alpha1/{hub.nam"
          + "e=projects/*/locations/global/hubs/*}:\003h"
          + "ub\022\330\001\n\tDeleteHub\022;.google.cloud.networkc"
          + "onnectivity.v1alpha1.DeleteHubRequest\032\035."
          + "google.longrunning.Operation\"o\312A*\n\025googl"
          + "e.protobuf.Empty\022\021OperationMetadata\332A\004na"
          + "me\202\323\344\223\0025*3/v1alpha1/{name=projects/*/loc"
          + "ations/global/hubs/*}\022\314\001\n\nListSpokes\022<.g"
          + "oogle.cloud.networkconnectivity.v1alpha1"
          + ".ListSpokesRequest\032=.google.cloud.networ"
          + "kconnectivity.v1alpha1.ListSpokesRespons"
          + "e\"A\332A\006parent\202\323\344\223\0022\0220/v1alpha1/{parent=pr"
          + "ojects/*/locations/*}/spokes\022\271\001\n\010GetSpok"
          + "e\022:.google.cloud.networkconnectivity.v1a"
          + "lpha1.GetSpokeRequest\0320.google.cloud.net"
          + "workconnectivity.v1alpha1.Spoke\"?\332A\004name"
          + "\202\323\344\223\0022\0220/v1alpha1/{name=projects/*/locat"
          + "ions/*/spokes/*}\022\341\001\n\013CreateSpoke\022=.googl"
          + "e.cloud.networkconnectivity.v1alpha1.Cre"
          + "ateSpokeRequest\032\035.google.longrunning.Ope"
          + "ration\"t\312A\032\n\005Spoke\022\021OperationMetadata\332A\025"
          + "parent,spoke,spoke_id\202\323\344\223\0029\"0/v1alpha1/{"
          + "parent=projects/*/locations/*}/spokes:\005s"
          + "poke\022\343\001\n\013UpdateSpoke\022=.google.cloud.netw"
          + "orkconnectivity.v1alpha1.UpdateSpokeRequ"
          + "est\032\035.google.longrunning.Operation\"v\312A\032\n"
          + "\005Spoke\022\021OperationMetadata\332A\021spoke,update"
          + "_mask\202\323\344\223\002?26/v1alpha1/{spoke.name=proje"
          + "cts/*/locations/*/spokes/*}:\005spoke\022\331\001\n\013D"
          + "eleteSpoke\022=.google.cloud.networkconnect"
          + "ivity.v1alpha1.DeleteSpokeRequest\032\035.goog"
          + "le.longrunning.Operation\"l\312A*\n\025google.pr"
          + "otobuf.Empty\022\021OperationMetadata\332A\004name\202\323"
          + "\344\223\0022*0/v1alpha1/{name=projects/*/locatio"
          + "ns/*/spokes/*}\032V\312A\"networkconnectivity.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\335\004\n-com.google.cl"
          + "oud.networkconnectivity.v1alpha1B\010HubPro"
          + "toP\001Z_cloud.google.com/go/networkconnect"
          + "ivity/apiv1alpha1/networkconnectivitypb;"
          + "networkconnectivitypb\252\002)Google.Cloud.Net"
          + "workConnectivity.V1Alpha1\312\002)Google\\Cloud"
          + "\\NetworkConnectivity\\V1alpha1\352\002,Google::"
          + "Cloud::NetworkConnectivity::V1alpha1\352A`\n"
          + " compute.googleapis.com/VpnTunnel\022<proje"
          + "cts/{project}/regions/{region}/vpnTunnel"
          + "s/{resource_id}\352Az\n-compute.googleapis.c"
          + "om/InterconnectAttachment\022Iprojects/{pro"
          + "ject}/regions/{region}/interconnectAttac"
          + "hments/{resource_id}\352AW\n\037compute.googlea"
          + "pis.com/Instance\0224projects/{project}/zon"
          + "es/{zone}/instances/{instance}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Description",
              "Spokes",
              "UniqueId",
              "State",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_LabelsEntry_descriptor =
        internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_Hub_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Description",
              "Hub",
              "LinkedVpnTunnels",
              "LinkedInterconnectAttachments",
              "LinkedRouterApplianceInstances",
              "UniqueId",
              "State",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_LabelsEntry_descriptor =
        internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_Spoke_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_ListHubsResponse_descriptor,
            new java.lang.String[] {
              "Hubs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_GetHubRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkconnectivity_v1alpha1_GetHubRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_GetHubRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_CreateHubRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkconnectivity_v1alpha1_CreateHubRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_CreateHubRequest_descriptor,
            new java.lang.String[] {
              "Parent", "HubId", "Hub", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateHubRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateHubRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateHubRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Hub", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteHubRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteHubRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteHubRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_ListSpokesResponse_descriptor,
            new java.lang.String[] {
              "Spokes", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_GetSpokeRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_networkconnectivity_v1alpha1_GetSpokeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_GetSpokeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_CreateSpokeRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_networkconnectivity_v1alpha1_CreateSpokeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_CreateSpokeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SpokeId", "Spoke", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateSpokeRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateSpokeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_UpdateSpokeRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Spoke", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteSpokeRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteSpokeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_DeleteSpokeRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor,
            new java.lang.String[] {
              "VirtualMachine", "IpAddress", "NetworkInterface",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
