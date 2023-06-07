/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/texttospeech/v1beta1/cloud_tts_lrs.proto

package com.google.cloud.texttospeech.v1beta1;

public final class TextToSpeechLongAudioSynthesisProto {
  private TextToSpeechLongAudioSynthesisProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/texttospeech/v1beta1/clou"
          + "d_tts_lrs.proto\022!google.cloud.texttospee"
          + "ch.v1beta1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\0321google/cloud/texttos"
          + "peech/v1beta1/cloud_tts.proto\032#google/lo"
          + "ngrunning/operations.proto\032\037google/proto"
          + "buf/timestamp.proto\"\254\002\n\032SynthesizeLongAu"
          + "dioRequest\022\016\n\006parent\030\001 \001(\t\022F\n\005input\030\002 \001("
          + "\01321.google.cloud.texttospeech.v1beta1.Sy"
          + "nthesisInputB\004\342A\001\002\022J\n\014audio_config\030\003 \001(\013"
          + "2..google.cloud.texttospeech.v1beta1.Aud"
          + "ioConfigB\004\342A\001\002\022\034\n\016output_gcs_uri\030\004 \001(\tB\004"
          + "\342A\001\002\022L\n\005voice\030\005 \001(\01327.google.cloud.textt"
          + "ospeech.v1beta1.VoiceSelectionParamsB\004\342A"
          + "\001\002\"\035\n\033SynthesizeLongAudioResponse\"\240\001\n\033Sy"
          + "nthesizeLongAudioMetadata\022.\n\nstart_time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\0224\n\020las"
          + "t_update_time\030\002 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022\033\n\023progress_percentage\030\003 \001(\0012\370\002\n"
          + "\037TextToSpeechLongAudioSynthesize\022\203\002\n\023Syn"
          + "thesizeLongAudio\022=.google.cloud.texttosp"
          + "eech.v1beta1.SynthesizeLongAudioRequest\032"
          + "\035.google.longrunning.Operation\"\215\001\312A:\n\033Sy"
          + "nthesizeLongAudioResponse\022\033SynthesizeLon"
          + "gAudioMetadata\202\323\344\223\002J\"E/v1beta1/{parent=p"
          + "rojects/*/locations/*/voices/*}:Synthesi"
          + "zeLongAudio:\001*\032O\312A\033texttospeech.googleap"
          + "is.com\322A.https://www.googleapis.com/auth"
          + "/cloud-platformB\213\002\n%com.google.cloud.tex"
          + "ttospeech.v1beta1B#TextToSpeechLongAudio"
          + "SynthesisProtoP\001ZIcloud.google.com/go/te"
          + "xttospeech/apiv1beta1/texttospeechpb;tex"
          + "ttospeechpb\370\001\001\252\002!Google.Cloud.TextToSpee"
          + "ch.V1Beta1\312\002!Google\\Cloud\\TextToSpeech\\V"
          + "1beta1\352\002$Google::Cloud::TextToSpeech::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Input", "AudioConfig", "OutputGcsUri", "Voice",
            });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesizeLongAudioMetadata_descriptor,
            new java.lang.String[] {
              "StartTime", "LastUpdateTime", "ProgressPercentage",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
