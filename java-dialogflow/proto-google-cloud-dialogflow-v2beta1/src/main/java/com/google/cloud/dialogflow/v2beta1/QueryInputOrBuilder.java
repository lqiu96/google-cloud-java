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
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface QueryInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.QueryInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 1;</code>
   *
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 1;</code>
   *
   * @return The audioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfig getAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder getAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text = 2;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text = 2;</code>
   *
   * @return The text.
   */
  com.google.cloud.dialogflow.v2beta1.TextInput getText();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.TextInputOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event = 3;</code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event = 3;</code>
   *
   * @return The event.
   */
  com.google.cloud.dialogflow.v2beta1.EventInput getEvent();
  /**
   *
   *
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EventInputOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents dtmf = 4;</code>
   *
   * @return Whether the dtmf field is set.
   */
  boolean hasDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents dtmf = 4;</code>
   *
   * @return The dtmf.
   */
  com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents getDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents dtmf = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEventsOrBuilder getDtmfOrBuilder();

  public com.google.cloud.dialogflow.v2beta1.QueryInput.InputCase getInputCase();
}
