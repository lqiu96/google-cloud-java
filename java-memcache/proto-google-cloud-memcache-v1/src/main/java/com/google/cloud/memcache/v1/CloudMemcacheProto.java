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

public final class CloudMemcacheProto {
  private CloudMemcacheProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_NodeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_Node_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MaintenancePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MaintenancePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_WeeklyMaintenanceWindow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_WeeklyMaintenanceWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MaintenanceSchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MaintenanceSchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_RescheduleMaintenanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_RescheduleMaintenanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_UpdateParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MemcacheParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_LocationMetadata_AvailableZonesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ZoneMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ZoneMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/memcache/v1/cloud_memcach"
          + "e.proto\022\030google.cloud.memcache.v1\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032#google/lon"
          + "grunning/operations.proto\032\036google/protob"
          + "uf/duration.proto\032 google/protobuf/field"
          + "_mask.proto\032\037google/protobuf/timestamp.p"
          + "roto\032\033google/type/dayofweek.proto\032\033googl"
          + "e/type/timeofday.proto\"\335\r\n\010Instance\022\022\n\004n"
          + "ame\030\001 \001(\tB\004\342A\001\002\022\024\n\014display_name\030\002 \001(\t\022>\n"
          + "\006labels\030\003 \003(\0132..google.cloud.memcache.v1"
          + ".Instance.LabelsEntry\022\032\n\022authorized_netw"
          + "ork\030\004 \001(\t\022\r\n\005zones\030\005 \003(\t\022\030\n\nnode_count\030\006"
          + " \001(\005B\004\342A\001\002\022H\n\013node_config\030\007 \001(\0132-.google"
          + ".cloud.memcache.v1.Instance.NodeConfigB\004"
          + "\342A\001\002\022C\n\020memcache_version\030\t \001(\0162).google."
          + "cloud.memcache.v1.MemcacheVersion\022@\n\npar"
          + "ameters\030\013 \001(\0132,.google.cloud.memcache.v1"
          + ".MemcacheParameters\022E\n\016memcache_nodes\030\014 "
          + "\003(\0132\'.google.cloud.memcache.v1.Instance."
          + "NodeB\004\342A\001\003\0225\n\013create_time\030\r \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\0225\n\013update_time"
          + "\030\016 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\022=\n\005state\030\017 \001(\0162(.google.cloud.memcache."
          + "v1.Instance.StateB\004\342A\001\003\022#\n\025memcache_full"
          + "_version\030\022 \001(\tB\004\342A\001\003\022M\n\021instance_message"
          + "s\030\023 \003(\01322.google.cloud.memcache.v1.Insta"
          + "nce.InstanceMessage\022 \n\022discovery_endpoin"
          + "t\030\024 \001(\tB\004\342A\001\003\022G\n\022maintenance_policy\030\025 \001("
          + "\0132+.google.cloud.memcache.v1.Maintenance"
          + "Policy\022Q\n\024maintenance_schedule\030\026 \001(\0132-.g"
          + "oogle.cloud.memcache.v1.MaintenanceSched"
          + "uleB\004\342A\001\003\032C\n\nNodeConfig\022\027\n\tcpu_count\030\001 \001"
          + "(\005B\004\342A\001\002\022\034\n\016memory_size_mb\030\002 \001(\005B\004\342A\001\002\032\264"
          + "\002\n\004Node\022\025\n\007node_id\030\001 \001(\tB\004\342A\001\003\022\022\n\004zone\030\002"
          + " \001(\tB\004\342A\001\003\022B\n\005state\030\003 \001(\0162-.google.cloud"
          + ".memcache.v1.Instance.Node.StateB\004\342A\001\003\022\022"
          + "\n\004host\030\004 \001(\tB\004\342A\001\003\022\022\n\004port\030\005 \001(\005B\004\342A\001\003\022@"
          + "\n\nparameters\030\006 \001(\0132,.google.cloud.memcac"
          + "he.v1.MemcacheParameters\"S\n\005State\022\025\n\021STA"
          + "TE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020"
          + "\002\022\014\n\010DELETING\020\003\022\014\n\010UPDATING\020\004\032\251\001\n\017Instan"
          + "ceMessage\022E\n\004code\030\001 \001(\01627.google.cloud.m"
          + "emcache.v1.Instance.InstanceMessage.Code"
          + "\022\017\n\007message\030\002 \001(\t\">\n\004Code\022\024\n\020CODE_UNSPEC"
          + "IFIED\020\000\022 \n\034ZONE_DISTRIBUTION_UNBALANCED\020"
          + "\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"o\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000"
          + "\022\014\n\010CREATING\020\001\022\t\n\005READY\020\002\022\014\n\010UPDATING\020\003\022"
          + "\014\n\010DELETING\020\004\022\032\n\026PERFORMING_MAINTENANCE\020"
          + "\005:c\352A`\n memcache.googleapis.com/Instance"
          + "\022<projects/{project}/locations/{location"
          + "}/instances/{instance}\"\362\001\n\021MaintenancePo"
          + "licy\0225\n\013create_time\030\001 \001(\0132\032.google.proto"
          + "buf.TimestampB\004\342A\001\003\0225\n\013update_time\030\002 \001(\013"
          + "2\032.google.protobuf.TimestampB\004\342A\001\003\022\023\n\013de"
          + "scription\030\003 \001(\t\022Z\n\031weekly_maintenance_wi"
          + "ndow\030\004 \003(\01321.google.cloud.memcache.v1.We"
          + "eklyMaintenanceWindowB\004\342A\001\002\"\251\001\n\027WeeklyMa"
          + "intenanceWindow\022)\n\003day\030\001 \001(\0162\026.google.ty"
          + "pe.DayOfWeekB\004\342A\001\002\0220\n\nstart_time\030\002 \001(\0132\026"
          + ".google.type.TimeOfDayB\004\342A\001\002\0221\n\010duration"
          + "\030\003 \001(\0132\031.google.protobuf.DurationB\004\342A\001\002\""
          + "\301\001\n\023MaintenanceSchedule\0224\n\nstart_time\030\001 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\022@\n\026schedule_deadline_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\"\344\002\n\034"
          + "RescheduleMaintenanceRequest\022;\n\010instance"
          + "\030\001 \001(\tB)\342A\001\002\372A\"\n memcache.googleapis.com"
          + "/Instance\022d\n\017reschedule_type\030\002 \001(\0162E.goo"
          + "gle.cloud.memcache.v1.RescheduleMaintena"
          + "nceRequest.RescheduleTypeB\004\342A\001\002\0221\n\rsched"
          + "ule_time\030\003 \001(\0132\032.google.protobuf.Timesta"
          + "mp\"n\n\016RescheduleType\022\037\n\033RESCHEDULE_TYPE_"
          + "UNSPECIFIED\020\000\022\r\n\tIMMEDIATE\020\001\022\031\n\025NEXT_AVA"
          + "ILABLE_WINDOW\020\002\022\021\n\rSPECIFIC_TIME\020\003\"\233\001\n\024L"
          + "istInstancesRequest\022:\n\006parent\030\001 \001(\tB*\342A\001"
          + "\002\372A#\n!locations.googleapis.com/Location\022"
          + "\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016"
          + "\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"|\n\025List"
          + "InstancesResponse\0225\n\tinstances\030\001 \003(\0132\".g"
          + "oogle.cloud.memcache.v1.Instance\022\027\n\017next"
          + "_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"M"
          + "\n\022GetInstanceRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002"
          + "\372A\"\n memcache.googleapis.com/Instance\"\252\001"
          + "\n\025CreateInstanceRequest\022:\n\006parent\030\001 \001(\tB"
          + "*\342A\001\002\372A#\n!locations.googleapis.com/Locat"
          + "ion\022\031\n\013instance_id\030\002 \001(\tB\004\342A\001\002\022:\n\010instan"
          + "ce\030\003 \001(\0132\".google.cloud.memcache.v1.Inst"
          + "anceB\004\342A\001\002\"\212\001\n\025UpdateInstanceRequest\0225\n\013"
          + "update_mask\030\001 \001(\0132\032.google.protobuf.Fiel"
          + "dMaskB\004\342A\001\002\022:\n\010instance\030\002 \001(\0132\".google.c"
          + "loud.memcache.v1.InstanceB\004\342A\001\002\"P\n\025Delet"
          + "eInstanceRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n"
          + " memcache.googleapis.com/Instance\"v\n\026App"
          + "lyParametersRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372"
          + "A\"\n memcache.googleapis.com/Instance\022\020\n\010"
          + "node_ids\030\002 \003(\t\022\021\n\tapply_all\030\003 \001(\010\"\313\001\n\027Up"
          + "dateParametersRequest\0227\n\004name\030\001 \001(\tB)\342A\001"
          + "\002\372A\"\n memcache.googleapis.com/Instance\0225"
          + "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi"
          + "eldMaskB\004\342A\001\002\022@\n\nparameters\030\003 \001(\0132,.goog"
          + "le.cloud.memcache.v1.MemcacheParameters\""
          + "\237\001\n\022MemcacheParameters\022\020\n\002id\030\001 \001(\tB\004\342A\001\003"
          + "\022H\n\006params\030\003 \003(\01328.google.cloud.memcache"
          + ".v1.MemcacheParameters.ParamsEntry\032-\n\013Pa"
          + "ramsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"\200\002\n\021OperationMetadata\0225\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222"
          + "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004verb"
          + "\030\004 \001(\tB\004\342A\001\003\022\033\n\rstatus_detail\030\005 \001(\tB\004\342A\001"
          + "\003\022\036\n\020cancel_requested\030\006 \001(\010B\004\342A\001\003\022\031\n\013api"
          + "_version\030\007 \001(\tB\004\342A\001\003\"\320\001\n\020LocationMetadat"
          + "a\022]\n\017available_zones\030\001 \003(\0132>.google.clou"
          + "d.memcache.v1.LocationMetadata.Available"
          + "ZonesEntryB\004\342A\001\003\032]\n\023AvailableZonesEntry\022"
          + "\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.google.clo"
          + "ud.memcache.v1.ZoneMetadata:\0028\001\"\016\n\014ZoneM"
          + "etadata*E\n\017MemcacheVersion\022 \n\034MEMCACHE_V"
          + "ERSION_UNSPECIFIED\020\000\022\020\n\014MEMCACHE_1_5\020\0012\305"
          + "\020\n\rCloudMemcache\022\260\001\n\rListInstances\022..goo"
          + "gle.cloud.memcache.v1.ListInstancesReque"
          + "st\032/.google.cloud.memcache.v1.ListInstan"
          + "cesResponse\">\332A\006parent\202\323\344\223\002/\022-/v1/{paren"
          + "t=projects/*/locations/*}/instances\022\235\001\n\013"
          + "GetInstance\022,.google.cloud.memcache.v1.G"
          + "etInstanceRequest\032\".google.cloud.memcach"
          + "e.v1.Instance\"<\332A\004name\202\323\344\223\002/\022-/v1/{name="
          + "projects/*/locations/*/instances/*}\022\222\002\n\016"
          + "CreateInstance\022/.google.cloud.memcache.v"
          + "1.CreateInstanceRequest\032\035.google.longrun"
          + "ning.Operation\"\257\001\312AO\n!google.cloud.memca"
          + "che.v1.Instance\022*google.cloud.memcache.v"
          + "1.OperationMetadata\332A\033parent,instance,in"
          + "stance_id\202\323\344\223\0029\"-/v1/{parent=projects/*/"
          + "locations/*}/instances:\010instance\022\224\002\n\016Upd"
          + "ateInstance\022/.google.cloud.memcache.v1.U"
          + "pdateInstanceRequest\032\035.google.longrunnin"
          + "g.Operation\"\261\001\312AO\n!google.cloud.memcache"
          + ".v1.Instance\022*google.cloud.memcache.v1.O"
          + "perationMetadata\332A\024instance,update_mask\202"
          + "\323\344\223\002B26/v1/{instance.name=projects/*/loc"
          + "ations/*/instances/*}:\010instance\022\240\002\n\020Upda"
          + "teParameters\0221.google.cloud.memcache.v1."
          + "UpdateParametersRequest\032\035.google.longrun"
          + "ning.Operation\"\271\001\312AO\n!google.cloud.memca"
          + "che.v1.Instance\022*google.cloud.memcache.v"
          + "1.OperationMetadata\332A\033name,update_mask,p"
          + "arameters\202\323\344\223\002C2>/v1/{name=projects/*/lo"
          + "cations/*/instances/*}:updateParameters:"
          + "\001*\022\345\001\n\016DeleteInstance\022/.google.cloud.mem"
          + "cache.v1.DeleteInstanceRequest\032\035.google."
          + "longrunning.Operation\"\202\001\312AC\n\025google.prot"
          + "obuf.Empty\022*google.cloud.memcache.v1.Ope"
          + "rationMetadata\332A\004name\202\323\344\223\002/*-/v1/{name=p"
          + "rojects/*/locations/*/instances/*}\022\231\002\n\017A"
          + "pplyParameters\0220.google.cloud.memcache.v"
          + "1.ApplyParametersRequest\032\035.google.longru"
          + "nning.Operation\"\264\001\312AO\n!google.cloud.memc"
          + "ache.v1.Instance\022*google.cloud.memcache."
          + "v1.OperationMetadata\332A\027name,node_ids,app"
          + "ly_all\202\323\344\223\002B\"=/v1/{name=projects/*/locat"
          + "ions/*/instances/*}:applyParameters:\001*\022\300"
          + "\002\n\025RescheduleMaintenance\0226.google.cloud."
          + "memcache.v1.RescheduleMaintenanceRequest"
          + "\032\035.google.longrunning.Operation\"\317\001\312AO\n!g"
          + "oogle.cloud.memcache.v1.Instance\022*google"
          + ".cloud.memcache.v1.OperationMetadata\332A(i"
          + "nstance, reschedule_type, schedule_time\202"
          + "\323\344\223\002L\"G/v1/{instance=projects/*/location"
          + "s/*/instances/*}:rescheduleMaintenance:\001"
          + "*\032K\312A\027memcache.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformBn"
          + "\n\034com.google.cloud.memcache.v1B\022CloudMem"
          + "cacheProtoP\001Z8cloud.google.com/go/memcac"
          + "he/apiv1/memcachepb;memcachepbb\006proto3"
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
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DayOfWeekProto.getDescriptor(),
              com.google.type.TimeOfDayProto.getDescriptor(),
            });
    internal_static_google_cloud_memcache_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_memcache_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Labels",
              "AuthorizedNetwork",
              "Zones",
              "NodeCount",
              "NodeConfig",
              "MemcacheVersion",
              "Parameters",
              "MemcacheNodes",
              "CreateTime",
              "UpdateTime",
              "State",
              "MemcacheFullVersion",
              "InstanceMessages",
              "DiscoveryEndpoint",
              "MaintenancePolicy",
              "MaintenanceSchedule",
            });
    internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_memcache_v1_Instance_NodeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor,
            new java.lang.String[] {
              "CpuCount", "MemorySizeMb",
            });
    internal_static_google_cloud_memcache_v1_Instance_Node_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_memcache_v1_Instance_Node_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_Node_descriptor,
            new java.lang.String[] {
              "NodeId", "Zone", "State", "Host", "Port", "Parameters",
            });
    internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor,
            new java.lang.String[] {
              "Code", "Message",
            });
    internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_memcache_v1_MaintenancePolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_memcache_v1_MaintenancePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MaintenancePolicy_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "Description", "WeeklyMaintenanceWindow",
            });
    internal_static_google_cloud_memcache_v1_WeeklyMaintenanceWindow_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_memcache_v1_WeeklyMaintenanceWindow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_WeeklyMaintenanceWindow_descriptor,
            new java.lang.String[] {
              "Day", "StartTime", "Duration",
            });
    internal_static_google_cloud_memcache_v1_MaintenanceSchedule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_memcache_v1_MaintenanceSchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MaintenanceSchedule_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "ScheduleDeadlineTime",
            });
    internal_static_google_cloud_memcache_v1_RescheduleMaintenanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_memcache_v1_RescheduleMaintenanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_RescheduleMaintenanceRequest_descriptor,
            new java.lang.String[] {
              "Instance", "RescheduleType", "ScheduleTime",
            });
    internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_memcache_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_memcache_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_memcache_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_memcache_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor,
            new java.lang.String[] {
              "Name", "NodeIds", "ApplyAll",
            });
    internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_memcache_v1_UpdateParametersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Parameters",
            });
    internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_memcache_v1_MemcacheParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor,
            new java.lang.String[] {
              "Id", "Params",
            });
    internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor =
        internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_memcache_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    internal_static_google_cloud_memcache_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_memcache_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "AvailableZones",
            });
    internal_static_google_cloud_memcache_v1_LocationMetadata_AvailableZonesEntry_descriptor =
        internal_static_google_cloud_memcache_v1_LocationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_memcache_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_LocationMetadata_AvailableZonesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_memcache_v1_ZoneMetadata_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_memcache_v1_ZoneMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ZoneMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DayOfWeekProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
