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
// source: google/cloud/documentai/v1/processor.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1;

public final class DocumentAiProcessor {
  private DocumentAiProcessor() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_ProcessorVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_ProcessorVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_ProcessorVersion_DeprecationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_ProcessorVersion_DeprecationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_ProcessorVersionAlias_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_ProcessorVersionAlias_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_Processor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_Processor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/documentai/v1/processor.p"
          + "roto\022\032google.cloud.documentai.v1\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\0320google/cloud/documentai/v1"
          + "/document_schema.proto\032+google/cloud/doc"
          + "umentai/v1/evaluation.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\341\010\n\020ProcessorVersio"
          + "n\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022C\n"
          + "\017document_schema\030\014 \001(\0132*.google.cloud.do"
          + "cumentai.v1.DocumentSchema\022A\n\005state\030\006 \001("
          + "\01622.google.cloud.documentai.v1.Processor"
          + "Version.State\022/\n\013create_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\022J\n\021latest_evaluat"
          + "ion\030\010 \001(\0132/.google.cloud.documentai.v1.E"
          + "valuationReference\022\024\n\014kms_key_name\030\t \001(\t"
          + "\022\034\n\024kms_key_version_name\030\n \001(\t\022\033\n\016google"
          + "_managed\030\013 \001(\010B\003\340A\003\022V\n\020deprecation_info\030"
          + "\r \001(\0132<.google.cloud.documentai.v1.Proce"
          + "ssorVersion.DeprecationInfo\022O\n\nmodel_typ"
          + "e\030\017 \001(\01626.google.cloud.documentai.v1.Pro"
          + "cessorVersion.ModelTypeB\003\340A\003\032\237\001\n\017Depreca"
          + "tionInfo\0224\n\020deprecation_time\030\001 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\022V\n\035replacement_pr"
          + "ocessor_version\030\002 \001(\tB/\372A,\n*documentai.g"
          + "oogleapis.com/ProcessorVersion\"\223\001\n\005State"
          + "\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010DEPLOYED\020\001\022\r\n"
          + "\tDEPLOYING\020\002\022\016\n\nUNDEPLOYED\020\003\022\017\n\013UNDEPLOY"
          + "ING\020\004\022\014\n\010CREATING\020\005\022\014\n\010DELETING\020\006\022\n\n\006FAI"
          + "LED\020\007\022\r\n\tIMPORTING\020\010\"Y\n\tModelType\022\032\n\026MOD"
          + "EL_TYPE_UNSPECIFIED\020\000\022\031\n\025MODEL_TYPE_GENE"
          + "RATIVE\020\001\022\025\n\021MODEL_TYPE_CUSTOM\020\002:\226\001\352A\222\001\n*"
          + "documentai.googleapis.com/ProcessorVersi"
          + "on\022dprojects/{project}/locations/{locati"
          + "on}/processors/{processor}/processorVers"
          + "ions/{processor_version}\"r\n\025ProcessorVer"
          + "sionAlias\022\r\n\005alias\030\001 \001(\t\022J\n\021processor_ve"
          + "rsion\030\002 \001(\tB/\372A,\n*documentai.googleapis."
          + "com/ProcessorVersion\"\210\005\n\tProcessor\022\024\n\004na"
          + "me\030\001 \001(\tB\006\340A\005\340A\003\022\014\n\004type\030\002 \001(\t\022\024\n\014displa"
          + "y_name\030\003 \001(\t\022?\n\005state\030\004 \001(\0162+.google.clo"
          + "ud.documentai.v1.Processor.StateB\003\340A\003\022R\n"
          + "\031default_processor_version\030\t \001(\tB/\372A,\n*d"
          + "ocumentai.googleapis.com/ProcessorVersio"
          + "n\022Y\n\031processor_version_aliases\030\n \003(\01321.g"
          + "oogle.cloud.documentai.v1.ProcessorVersi"
          + "onAliasB\003\340A\003\022 \n\020process_endpoint\030\006 \001(\tB\006"
          + "\340A\003\340A\005\022/\n\013create_time\030\007 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022\024\n\014kms_key_name\030\010 \001(\t\"~\n"
          + "\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007ENABLED"
          + "\020\001\022\014\n\010DISABLED\020\002\022\014\n\010ENABLING\020\003\022\r\n\tDISABL"
          + "ING\020\004\022\014\n\010CREATING\020\005\022\n\n\006FAILED\020\006\022\014\n\010DELET"
          + "ING\020\007:h\352Ae\n#documentai.googleapis.com/Pr"
          + "ocessor\022>projects/{project}/locations/{l"
          + "ocation}/processors/{processor}B\321\001\n\036com."
          + "google.cloud.documentai.v1B\023DocumentAiPr"
          + "ocessorP\001Z>cloud.google.com/go/documenta"
          + "i/apiv1/documentaipb;documentaipb\252\002\032Goog"
          + "le.Cloud.DocumentAI.V1\312\002\032Google\\Cloud\\Do"
          + "cumentAI\\V1\352\002\035Google::Cloud::DocumentAI:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.documentai.v1.DocumentAiDocumentSchema.getDescriptor(),
              com.google.cloud.documentai.v1.DocumentAiEvaluation.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1_ProcessorVersion_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_ProcessorVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_ProcessorVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DocumentSchema",
              "State",
              "CreateTime",
              "LatestEvaluation",
              "KmsKeyName",
              "KmsKeyVersionName",
              "GoogleManaged",
              "DeprecationInfo",
              "ModelType",
            });
    internal_static_google_cloud_documentai_v1_ProcessorVersion_DeprecationInfo_descriptor =
        internal_static_google_cloud_documentai_v1_ProcessorVersion_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1_ProcessorVersion_DeprecationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_ProcessorVersion_DeprecationInfo_descriptor,
            new java.lang.String[] {
              "DeprecationTime", "ReplacementProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1_ProcessorVersionAlias_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1_ProcessorVersionAlias_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_ProcessorVersionAlias_descriptor,
            new java.lang.String[] {
              "Alias", "ProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1_Processor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1_Processor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_Processor_descriptor,
            new java.lang.String[] {
              "Name",
              "Type",
              "DisplayName",
              "State",
              "DefaultProcessorVersion",
              "ProcessorVersionAliases",
              "ProcessEndpoint",
              "CreateTime",
              "KmsKeyName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1.DocumentAiDocumentSchema.getDescriptor();
    com.google.cloud.documentai.v1.DocumentAiEvaluation.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
