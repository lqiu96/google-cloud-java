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
// source: google/cloud/automl/v1/translation.proto

package com.google.cloud.automl.v1;

public final class TranslationProto {
  private TranslationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TranslationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TranslationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TranslationEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TranslationEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TranslationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TranslationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TranslationAnnotation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/automl/v1/translation.pro"
          + "to\022\026google.cloud.automl.v1\032\034google/api/a"
          + "nnotations.proto\032\037google/api/field_behav"
          + "ior.proto\032\'google/cloud/automl/v1/data_i"
          + "tems.proto\"b\n\032TranslationDatasetMetadata"
          + "\022!\n\024source_language_code\030\001 \001(\tB\003\340A\002\022!\n\024t"
          + "arget_language_code\030\002 \001(\tB\003\340A\002\"K\n\034Transl"
          + "ationEvaluationMetrics\022\022\n\nbleu_score\030\001 \001"
          + "(\001\022\027\n\017base_bleu_score\030\002 \001(\001\"j\n\030Translati"
          + "onModelMetadata\022\022\n\nbase_model\030\001 \001(\t\022\034\n\024s"
          + "ource_language_code\030\002 \001(\t\022\034\n\024target_lang"
          + "uage_code\030\003 \001(\t\"X\n\025TranslationAnnotation"
          + "\022?\n\022translated_content\030\001 \001(\0132#.google.cl"
          + "oud.automl.v1.TextSnippetB\274\001\n\032com.google"
          + ".cloud.automl.v1B\020TranslationProtoP\001Z<go"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/automl/v1;automl\252\002\026Google.Cloud.AutoML"
          + ".V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::C"
          + "loud::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.automl.v1.DataItems.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_TranslationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_TranslationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TranslationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "SourceLanguageCode", "TargetLanguageCode",
            });
    internal_static_google_cloud_automl_v1_TranslationEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_TranslationEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TranslationEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "BleuScore", "BaseBleuScore",
            });
    internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_TranslationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor,
            new java.lang.String[] {
              "BaseModel", "SourceLanguageCode", "TargetLanguageCode",
            });
    internal_static_google_cloud_automl_v1_TranslationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_TranslationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TranslationAnnotation_descriptor,
            new java.lang.String[] {
              "TranslatedContent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.automl.v1.DataItems.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
