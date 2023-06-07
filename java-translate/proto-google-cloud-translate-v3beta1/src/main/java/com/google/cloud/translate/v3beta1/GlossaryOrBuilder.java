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
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface GlossaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.Glossary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the glossary. Glossary names have the form
   * `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the glossary. Glossary names have the form
   * `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Used with unidirectional glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodePair language_pair = 3;</code>
   *
   * @return Whether the languagePair field is set.
   */
  boolean hasLanguagePair();
  /**
   *
   *
   * <pre>
   * Used with unidirectional glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodePair language_pair = 3;</code>
   *
   * @return The languagePair.
   */
  com.google.cloud.translate.v3beta1.Glossary.LanguageCodePair getLanguagePair();
  /**
   *
   *
   * <pre>
   * Used with unidirectional glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodePair language_pair = 3;</code>
   */
  com.google.cloud.translate.v3beta1.Glossary.LanguageCodePairOrBuilder getLanguagePairOrBuilder();

  /**
   *
   *
   * <pre>
   * Used with equivalent term set glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodesSet language_codes_set = 4;
   * </code>
   *
   * @return Whether the languageCodesSet field is set.
   */
  boolean hasLanguageCodesSet();
  /**
   *
   *
   * <pre>
   * Used with equivalent term set glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodesSet language_codes_set = 4;
   * </code>
   *
   * @return The languageCodesSet.
   */
  com.google.cloud.translate.v3beta1.Glossary.LanguageCodesSet getLanguageCodesSet();
  /**
   *
   *
   * <pre>
   * Used with equivalent term set glossaries.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary.LanguageCodesSet language_codes_set = 4;
   * </code>
   */
  com.google.cloud.translate.v3beta1.Glossary.LanguageCodesSetOrBuilder
      getLanguageCodesSetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Provides examples to build the glossary from.
   * Total glossary must not exceed 10M Unicode codepoints.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GlossaryInputConfig input_config = 5;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Provides examples to build the glossary from.
   * Total glossary must not exceed 10M Unicode codepoints.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GlossaryInputConfig input_config = 5;</code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.translate.v3beta1.GlossaryInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Provides examples to build the glossary from.
   * Total glossary must not exceed 10M Unicode codepoints.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GlossaryInputConfig input_config = 5;</code>
   */
  com.google.cloud.translate.v3beta1.GlossaryInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of entries defined in the glossary.
   * </pre>
   *
   * <code>int32 entry_count = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The entryCount.
   */
  int getEntryCount();

  /**
   *
   *
   * <pre>
   * Output only. When CreateGlossary was called.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();
  /**
   *
   *
   * <pre>
   * Output only. When CreateGlossary was called.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   *
   *
   * <pre>
   * Output only. When CreateGlossary was called.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the glossary creation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. When the glossary creation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. When the glossary creation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  com.google.cloud.translate.v3beta1.Glossary.LanguagesCase getLanguagesCase();
}
