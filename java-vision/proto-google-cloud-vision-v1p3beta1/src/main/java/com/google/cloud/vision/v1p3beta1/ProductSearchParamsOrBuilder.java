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
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

public interface ProductSearchParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ProductSearchParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 9;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 9;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1p3beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the area of interest in the image.
   * If it is not specified, system discretion will be applied.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 9;</code>
   */
  com.google.cloud.vision.v1p3beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of a [ProductSet][google.cloud.vision.v1p3beta1.ProductSet] to be searched for similar images.
   *
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * </pre>
   *
   * <code>string product_set = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The productSet.
   */
  java.lang.String getProductSet();
  /**
   *
   *
   * <pre>
   * The resource name of a [ProductSet][google.cloud.vision.v1p3beta1.ProductSet] to be searched for similar images.
   *
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * </pre>
   *
   * <code>string product_set = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for productSet.
   */
  com.google.protobuf.ByteString getProductSetBytes();

  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods-v2", "apparel-v2", "toys-v2",
   * "packagedgoods-v1", or "general-v1" should be specified. The legacy
   * categories "homegoods", "apparel", and "toys" are still supported but will
   * be deprecated. For new products, please use "homegoods-v2", "apparel-v2",
   * or "toys-v2" for better product search accuracy. It is recommended to
   * migrate existing products to these categories as well.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   *
   * @return A list containing the productCategories.
   */
  java.util.List<java.lang.String> getProductCategoriesList();
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods-v2", "apparel-v2", "toys-v2",
   * "packagedgoods-v1", or "general-v1" should be specified. The legacy
   * categories "homegoods", "apparel", and "toys" are still supported but will
   * be deprecated. For new products, please use "homegoods-v2", "apparel-v2",
   * or "toys-v2" for better product search accuracy. It is recommended to
   * migrate existing products to these categories as well.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   *
   * @return The count of productCategories.
   */
  int getProductCategoriesCount();
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods-v2", "apparel-v2", "toys-v2",
   * "packagedgoods-v1", or "general-v1" should be specified. The legacy
   * categories "homegoods", "apparel", and "toys" are still supported but will
   * be deprecated. For new products, please use "homegoods-v2", "apparel-v2",
   * or "toys-v2" for better product search accuracy. It is recommended to
   * migrate existing products to these categories as well.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The productCategories at the given index.
   */
  java.lang.String getProductCategories(int index);
  /**
   *
   *
   * <pre>
   * The list of product categories to search in. Currently, we only consider
   * the first category, and either "homegoods-v2", "apparel-v2", "toys-v2",
   * "packagedgoods-v1", or "general-v1" should be specified. The legacy
   * categories "homegoods", "apparel", and "toys" are still supported but will
   * be deprecated. For new products, please use "homegoods-v2", "apparel-v2",
   * or "toys-v2" for better product search accuracy. It is recommended to
   * migrate existing products to these categories as well.
   * </pre>
   *
   * <code>repeated string product_categories = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the productCategories at the given index.
   */
  com.google.protobuf.ByteString getProductCategoriesBytes(int index);

  /**
   *
   *
   * <pre>
   * The filtering expression. This can be used to restrict search results based
   * on Product labels. We currently support an AND of OR of key-value
   * expressions, where each expression within an OR must have the same key. An
   * '=' should be used to connect the key and value.
   *
   * For example, "(color = red OR color = blue) AND brand = Google" is
   * acceptable, but "(color = red OR brand = Google)" is not acceptable.
   * "color: red" is not acceptable because it uses a ':' instead of an '='.
   * </pre>
   *
   * <code>string filter = 8;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filtering expression. This can be used to restrict search results based
   * on Product labels. We currently support an AND of OR of key-value
   * expressions, where each expression within an OR must have the same key. An
   * '=' should be used to connect the key and value.
   *
   * For example, "(color = red OR color = blue) AND brand = Google" is
   * acceptable, but "(color = red OR brand = Google)" is not acceptable.
   * "color: red" is not acceptable because it uses a ':' instead of an '='.
   * </pre>
   *
   * <code>string filter = 8;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
