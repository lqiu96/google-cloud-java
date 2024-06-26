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
// source: google/cloud/discoveryengine/v1alpha/chunk.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface ChunkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Chunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of the chunk.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document_id}/chunks/{chunk_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full resource name of the chunk.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document_id}/chunks/{chunk_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Unique chunk id of the current chunk.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Unique chunk id of the current chunk.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Content is a string from a document (parsed content).
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Content is a string from a document (parsed content).
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Metadata of the document from the current chunk.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Chunk.DocumentMetadata document_metadata = 5;
   * </code>
   *
   * @return Whether the documentMetadata field is set.
   */
  boolean hasDocumentMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the document from the current chunk.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Chunk.DocumentMetadata document_metadata = 5;
   * </code>
   *
   * @return The documentMetadata.
   */
  com.google.cloud.discoveryengine.v1alpha.Chunk.DocumentMetadata getDocumentMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the document from the current chunk.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Chunk.DocumentMetadata document_metadata = 5;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Chunk.DocumentMetadataOrBuilder
      getDocumentMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the derivedStructData field is set.
   */
  boolean hasDerivedStructData();
  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The derivedStructData.
   */
  com.google.protobuf.Struct getDerivedStructData();
  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.StructOrBuilder getDerivedStructDataOrBuilder();
}
