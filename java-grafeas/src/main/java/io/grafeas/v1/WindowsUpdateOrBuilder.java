/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/upgrade.proto

package io.grafeas.v1;

public interface WindowsUpdateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.WindowsUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required - The unique identifier for the update.
   * </pre>
   *
   * <code>.grafeas.v1.WindowsUpdate.Identity identity = 1;</code>
   *
   * @return Whether the identity field is set.
   */
  boolean hasIdentity();
  /**
   *
   *
   * <pre>
   * Required - The unique identifier for the update.
   * </pre>
   *
   * <code>.grafeas.v1.WindowsUpdate.Identity identity = 1;</code>
   *
   * @return The identity.
   */
  io.grafeas.v1.WindowsUpdate.Identity getIdentity();
  /**
   *
   *
   * <pre>
   * Required - The unique identifier for the update.
   * </pre>
   *
   * <code>.grafeas.v1.WindowsUpdate.Identity identity = 1;</code>
   */
  io.grafeas.v1.WindowsUpdate.IdentityOrBuilder getIdentityOrBuilder();

  /**
   *
   *
   * <pre>
   * The localized title of the update.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * The localized title of the update.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The localized description of the update.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The localized description of the update.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The list of categories to which the update belongs.
   * </pre>
   *
   * <code>repeated .grafeas.v1.WindowsUpdate.Category categories = 4;</code>
   */
  java.util.List<io.grafeas.v1.WindowsUpdate.Category> getCategoriesList();
  /**
   *
   *
   * <pre>
   * The list of categories to which the update belongs.
   * </pre>
   *
   * <code>repeated .grafeas.v1.WindowsUpdate.Category categories = 4;</code>
   */
  io.grafeas.v1.WindowsUpdate.Category getCategories(int index);
  /**
   *
   *
   * <pre>
   * The list of categories to which the update belongs.
   * </pre>
   *
   * <code>repeated .grafeas.v1.WindowsUpdate.Category categories = 4;</code>
   */
  int getCategoriesCount();
  /**
   *
   *
   * <pre>
   * The list of categories to which the update belongs.
   * </pre>
   *
   * <code>repeated .grafeas.v1.WindowsUpdate.Category categories = 4;</code>
   */
  java.util.List<? extends io.grafeas.v1.WindowsUpdate.CategoryOrBuilder>
      getCategoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of categories to which the update belongs.
   * </pre>
   *
   * <code>repeated .grafeas.v1.WindowsUpdate.Category categories = 4;</code>
   */
  io.grafeas.v1.WindowsUpdate.CategoryOrBuilder getCategoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The Microsoft Knowledge Base article IDs that are associated with the
   * update.
   * </pre>
   *
   * <code>repeated string kb_article_ids = 5;</code>
   *
   * @return A list containing the kbArticleIds.
   */
  java.util.List<java.lang.String> getKbArticleIdsList();
  /**
   *
   *
   * <pre>
   * The Microsoft Knowledge Base article IDs that are associated with the
   * update.
   * </pre>
   *
   * <code>repeated string kb_article_ids = 5;</code>
   *
   * @return The count of kbArticleIds.
   */
  int getKbArticleIdsCount();
  /**
   *
   *
   * <pre>
   * The Microsoft Knowledge Base article IDs that are associated with the
   * update.
   * </pre>
   *
   * <code>repeated string kb_article_ids = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The kbArticleIds at the given index.
   */
  java.lang.String getKbArticleIds(int index);
  /**
   *
   *
   * <pre>
   * The Microsoft Knowledge Base article IDs that are associated with the
   * update.
   * </pre>
   *
   * <code>repeated string kb_article_ids = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kbArticleIds at the given index.
   */
  com.google.protobuf.ByteString getKbArticleIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The hyperlink to the support information for the update.
   * </pre>
   *
   * <code>string support_url = 6;</code>
   *
   * @return The supportUrl.
   */
  java.lang.String getSupportUrl();
  /**
   *
   *
   * <pre>
   * The hyperlink to the support information for the update.
   * </pre>
   *
   * <code>string support_url = 6;</code>
   *
   * @return The bytes for supportUrl.
   */
  com.google.protobuf.ByteString getSupportUrlBytes();

  /**
   *
   *
   * <pre>
   * The last published timestamp of the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_published_timestamp = 7;</code>
   *
   * @return Whether the lastPublishedTimestamp field is set.
   */
  boolean hasLastPublishedTimestamp();
  /**
   *
   *
   * <pre>
   * The last published timestamp of the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_published_timestamp = 7;</code>
   *
   * @return The lastPublishedTimestamp.
   */
  com.google.protobuf.Timestamp getLastPublishedTimestamp();
  /**
   *
   *
   * <pre>
   * The last published timestamp of the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_published_timestamp = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastPublishedTimestampOrBuilder();
}
