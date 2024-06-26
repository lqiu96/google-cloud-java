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
// source: google/cloud/discoveryengine/v1alpha/site_search_engine.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public final class SiteSearchEngineProto {
  private SiteSearchEngineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_SiteSearchEngine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_SiteSearchEngine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_QuotaFailure_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_QuotaFailure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/discoveryengine/v1alpha/s"
          + "ite_search_engine.proto\022$google.cloud.di"
          + "scoveryengine.v1alpha\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\225\002\n\020S"
          + "iteSearchEngine\022\014\n\004name\030\001 \001(\t:\362\001\352A\356\001\n/di"
          + "scoveryengine.googleapis.com/SiteSearchE"
          + "ngine\022Pprojects/{project}/locations/{loc"
          + "ation}/dataStores/{data_store}/siteSearc"
          + "hEngine\022iprojects/{project}/locations/{l"
          + "ocation}/collections/{collection}/dataSt"
          + "ores/{data_store}/siteSearchEngine\"\221\t\n\nT"
          + "argetSite\022\021\n\004name\030\001 \001(\tB\003\340A\003\022$\n\024provided"
          + "_uri_pattern\030\002 \001(\tB\006\340A\002\340A\004\022C\n\004type\030\003 \001(\016"
          + "25.google.cloud.discoveryengine.v1alpha."
          + "TargetSite.Type\022\030\n\013exact_match\030\006 \001(\010B\003\340A"
          + "\004\022\"\n\025generated_uri_pattern\030\004 \001(\tB\003\340A\003\022_\n"
          + "\026site_verification_info\030\007 \001(\0132:.google.c"
          + "loud.discoveryengine.v1alpha.SiteVerific"
          + "ationInfoB\003\340A\003\022]\n\017indexing_status\030\010 \001(\0162"
          + "?.google.cloud.discoveryengine.v1alpha.T"
          + "argetSite.IndexingStatusB\003\340A\003\0224\n\013update_"
          + "time\030\005 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022[\n\016failure_reason\030\t \001(\0132>.google.clo"
          + "ud.discoveryengine.v1alpha.TargetSite.Fa"
          + "ilureReasonB\003\340A\003\032\256\001\n\rFailureReason\022d\n\rqu"
          + "ota_failure\030\001 \001(\0132K.google.cloud.discove"
          + "ryengine.v1alpha.TargetSite.FailureReaso"
          + "n.QuotaFailureH\000\032,\n\014QuotaFailure\022\034\n\024tota"
          + "l_required_quota\030\001 \001(\003B\t\n\007failure\"6\n\004Typ"
          + "e\022\024\n\020TYPE_UNSPECIFIED\020\000\022\013\n\007INCLUDE\020\001\022\013\n\007"
          + "EXCLUDE\020\002\"g\n\016IndexingStatus\022\037\n\033INDEXING_"
          + "STATUS_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\n\n\006FAI"
          + "LED\020\002\022\r\n\tSUCCEEDED\020\003\022\014\n\010DELETING\020\004:\241\002\352A\235"
          + "\002\n)discoveryengine.googleapis.com/Target"
          + "Site\022jprojects/{project}/locations/{loca"
          + "tion}/dataStores/{data_store}/siteSearch"
          + "Engine/targetSites/{target_site}\022\203\001proje"
          + "cts/{project}/locations/{location}/colle"
          + "ctions/{collection}/dataStores/{data_sto"
          + "re}/siteSearchEngine/targetSites/{target"
          + "_site}\"\250\002\n\024SiteVerificationInfo\022q\n\027site_"
          + "verification_state\030\001 \001(\0162P.google.cloud."
          + "discoveryengine.v1alpha.SiteVerification"
          + "Info.SiteVerificationState\022/\n\013verify_tim"
          + "e\030\002 \001(\0132\032.google.protobuf.Timestamp\"l\n\025S"
          + "iteVerificationState\022\'\n#SITE_VERIFICATIO"
          + "N_STATE_UNSPECIFIED\020\000\022\014\n\010VERIFIED\020\001\022\016\n\nU"
          + "NVERIFIED\020\002\022\014\n\010EXEMPTED\020\003B\241\002\n(com.google"
          + ".cloud.discoveryengine.v1alphaB\025SiteSear"
          + "chEngineProtoP\001ZRcloud.google.com/go/dis"
          + "coveryengine/apiv1alpha/discoveryenginep"
          + "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002$"
          + "Google.Cloud.DiscoveryEngine.V1Alpha\312\002$G"
          + "oogle\\Cloud\\DiscoveryEngine\\V1alpha\352\002\'Go"
          + "ogle::Cloud::DiscoveryEngine::V1alphab\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_SiteSearchEngine_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_SiteSearchEngine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_SiteSearchEngine_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_descriptor,
            new java.lang.String[] {
              "Name",
              "ProvidedUriPattern",
              "Type",
              "ExactMatch",
              "GeneratedUriPattern",
              "SiteVerificationInfo",
              "IndexingStatus",
              "UpdateTime",
              "FailureReason",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_descriptor,
            new java.lang.String[] {
              "QuotaFailure", "Failure",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_QuotaFailure_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_QuotaFailure_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TargetSite_FailureReason_QuotaFailure_descriptor,
            new java.lang.String[] {
              "TotalRequiredQuota",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor,
            new java.lang.String[] {
              "SiteVerificationState", "VerifyTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
