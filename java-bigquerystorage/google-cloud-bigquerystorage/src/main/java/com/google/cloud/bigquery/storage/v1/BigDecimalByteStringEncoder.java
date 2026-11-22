/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This code was ported from ZetaSQL and can be found here:
 * https://github.com/google/zetasql/blob/c55f967a5ae35b476437210c529691d8a73f5507/java/com/google/zetasql/Value.java
 */

package com.google.cloud.bigquery.storage.v1;

import com.google.common.primitives.Bytes;
import com.google.protobuf.ByteString;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Encodes and decodes {@link BigDecimal} values to and from the little-endian two's-complement
 * {@link ByteString} wire format used by BigQuery {@code NUMERIC} and {@code BIGNUMERIC} columns.
 */
public class BigDecimalByteStringEncoder {
  private static int NUMERIC_SCALE = 9;
  private static final BigDecimal MAX_NUMERIC_VALUE =
      new BigDecimal("99999999999999999999999999999.999999999");
  private static final BigDecimal MIN_NUMERIC_VALUE =
      new BigDecimal("-99999999999999999999999999999.999999999");

  // Number of digits after the decimal point supported by the BIGNUMERIC data type.
  private static final int BIGNUMERIC_SCALE = 38;
  // Maximum and minimum allowed values for the BIGNUMERIC data type.
  private static final BigDecimal MAX_BIGNUMERIC_VALUE =
      new BigDecimal(
          "578960446186580977117854925043439539266.34992332820282019728792003956564819967");
  private static final BigDecimal MIN_BIGNUMERIC_VALUE =
      new BigDecimal(
          "-578960446186580977117854925043439539266.34992332820282019728792003956564819968");

  /**
   * Encodes a {@link BigDecimal} into a little-endian two's-complement {@link ByteString} for a
   * BigQuery {@code NUMERIC} column (scale up to 9).
   *
   * @param bigDecimal the decimal value to encode
   * @return the encoded {@link ByteString}
   * @throws IllegalArgumentException if the scale exceeds 9 or the value overflows {@code NUMERIC}
   *     bounds
   */
  public static ByteString encodeToNumericByteString(BigDecimal bigDecimal) {
    ByteString byteString =
        serializeBigDecimal(
            bigDecimal, NUMERIC_SCALE, MAX_NUMERIC_VALUE, MIN_NUMERIC_VALUE, "ByteString");
    return byteString;
  }

  /**
   * Encodes a {@link BigDecimal} into a little-endian two's-complement {@link ByteString} for a
   * BigQuery {@code BIGNUMERIC} column (scale up to 38).
   *
   * @param bigDecimal the decimal value to encode
   * @return the encoded {@link ByteString}
   * @throws IllegalArgumentException if the scale exceeds 38 or the value overflows {@code
   *     BIGNUMERIC} bounds
   */
  public static ByteString encodeToBigNumericByteString(BigDecimal bigDecimal) {
    ByteString byteString =
        serializeBigDecimal(
            bigDecimal, BIGNUMERIC_SCALE, MAX_BIGNUMERIC_VALUE, MIN_BIGNUMERIC_VALUE, "ByteString");
    return byteString;
  }

  /**
   * Decodes a BigQuery {@code NUMERIC} little-endian two's-complement {@link ByteString} into a
   * {@link BigDecimal} with scale 9.
   *
   * @param byteString the encoded {@code NUMERIC} value
   * @return the decoded {@link BigDecimal}
   * @throws IllegalArgumentException if the decoded value overflows {@code NUMERIC} bounds
   */
  public static BigDecimal decodeNumericByteString(ByteString byteString) {
    BigDecimal bigDecimal =
        deserializeBigDecimal(
            byteString, NUMERIC_SCALE, MAX_NUMERIC_VALUE, MIN_NUMERIC_VALUE, "BigDecimal");
    return bigDecimal;
  }

  /**
   * Decodes a BigQuery {@code BIGNUMERIC} little-endian two's-complement {@link ByteString} into a
   * {@link BigDecimal} with scale 38.
   *
   * @param byteString the encoded {@code BIGNUMERIC} value
   * @return the decoded {@link BigDecimal}
   * @throws IllegalArgumentException if the decoded value overflows {@code BIGNUMERIC} bounds
   */
  public static BigDecimal decodeBigNumericByteString(ByteString byteString) {
    BigDecimal bigDecimal =
        deserializeBigDecimal(
            byteString, BIGNUMERIC_SCALE, MAX_BIGNUMERIC_VALUE, MIN_BIGNUMERIC_VALUE, "BigDecimal");
    return bigDecimal;
  }

  // Make these private and make public wrapper that internalizes these min/max/scale/type
  private static BigDecimal deserializeBigDecimal(
      ByteString serializedValue,
      int scale,
      BigDecimal maxValue,
      BigDecimal minValue,
      String typeName) {
    byte[] bytes = serializedValue.toByteArray();
    // NUMERIC/BIGNUMERIC values are serialized as scaled integers in two's complement form in
    // little endian order. BigInteger requires the same encoding but in big endian order,
    // therefore we must reverse the bytes that come from the proto.
    Bytes.reverse(bytes);
    BigInteger scaledValue = new BigInteger(bytes);
    BigDecimal decimalValue = new BigDecimal(scaledValue, scale);
    if (decimalValue.compareTo(maxValue) > 0 || decimalValue.compareTo(minValue) < 0) {
      throw new IllegalArgumentException(typeName + " overflow: " + decimalValue.toPlainString());
    }
    return decimalValue;
  }

  /** Returns a numeric Value that equals to {@code v}. */
  private static ByteString serializeBigDecimal(
      BigDecimal v, int scale, BigDecimal maxValue, BigDecimal minValue, String typeName) {
    if (v.scale() > scale) {
      throw new IllegalArgumentException(
          typeName + " scale cannot exceed " + scale + ": " + v.toPlainString());
    }
    if (v.compareTo(maxValue) > 0 || v.compareTo(minValue) < 0) {
      throw new IllegalArgumentException(typeName + " overflow: " + v.toPlainString());
    }
    byte[] bytes = v.setScale(scale).unscaledValue().toByteArray();
    // NUMERIC/BIGNUMERIC values are serialized as scaled integers in two's complement form in
    // little endian
    // order. BigInteger requires the same encoding but in big endian order, therefore we must
    // reverse the bytes that come from the proto.
    Bytes.reverse(bytes);
    return ByteString.copyFrom(bytes);
  }
}
