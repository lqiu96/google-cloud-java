/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import com.google.api.core.BetaApi;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/**
 * Google BigQuery Table Field Values class, which represents a row in returned query result (table
 * row). Tables rows can be retrieved as a result of a query or when listing table data.
 *
 * <p>Depending on how a corresponding query was executed, each row (an instance of {@code
 * FieldValueList}) may or may not contain related schema. If schema is not provided, the individual
 * cells of the row will still be accessible by index but not by name.
 */
public class FieldValueList extends AbstractList<FieldValue> implements Serializable {

  private static final long serialVersionUID = 2103346761764976902L;

  private final FieldList schema;
  private final List<FieldValue> row;

  private FieldValueList(List<FieldValue> row, FieldList schema) {
    this(row, schema, false);
  }

  /**
   * Internal constructor that optionally skips the defensive {@link ImmutableList#copyOf} copy when
   * {@code trusted} is {@code true} (used by {@link #fromPb} and {@link #withSchema}, where the
   * backing list is already newly allocated and unmodifiable). Public factory methods ({@link #of})
   * pass {@code trusted = false} to defensively copy caller-supplied lists.
   */
  private FieldValueList(List<FieldValue> row, FieldList schema, boolean trusted) {
    if (schema != null && row.size() != schema.size()) {
      throw new IllegalArgumentException("Row size and fields schema sizes should match");
    }
    this.row = trusted ? row : ImmutableList.copyOf(row);
    this.schema = schema;
  }

  /**
   * Gets field value by index.
   *
   * @param index field value index
   */
  @Override
  public FieldValue get(int index) {
    return row.get(index);
  }

  /**
   * Gets field value by index.
   *
   * @param name field name (defined in schema)
   * @throws IllegalArgumentException if schema is not provided or if {@code name} was not found in
   *     the schema
   */
  public FieldValue get(String name) {
    if (schema == null) {
      throw new UnsupportedOperationException(
          "Retrieving field value by name is not supported when there is no fields schema"
              + " provided");
    }
    return get(schema.getIndex(name));
  }

  /** Returns {@code true} if schema is provided, {@code false} otherwise. */
  public boolean hasSchema() {
    return schema != null;
  }

  /** Returns the total number of field values in the row. */
  @Override
  public int size() {
    return row.size();
  }

  /**
   * Creates an instance of {@code FieldValueList}, useful for testing.
   *
   * <p>This method is unstable. See <a
   * href="https://github.com/googleapis/google-cloud-java/pull/2891">this discussion</a> for more
   * context.
   */
  @BetaApi
  public static FieldValueList of(List<FieldValue> row, FieldList schema) {
    return new FieldValueList(row, schema);
  }

  /**
   * Creates an instance of {@code FieldValueList}, useful for testing.
   *
   * <p>This method is unstable. See <a
   * href="https://github.com/googleapis/google-cloud-java/pull/2891">this discussion</a> for more
   * context.
   */
  @BetaApi
  public static FieldValueList of(List<FieldValue> row, Field... schema) {
    return of(row, schema.length > 0 ? FieldList.of(schema) : null);
  }

  FieldValueList withSchema(FieldList schema) {
    // Reuse `this.row` directly since it is already owned by FieldValueList and never mutated.
    return new FieldValueList(this.row, schema, true);
  }

  static FieldValueList fromPb(List<?> rowPb, FieldList schema) {
    return fromPb(rowPb, schema, false);
  }

  static FieldValueList fromPb(List<?> rowPb, FieldList schema, Boolean useInt64Timestamps) {
    int size = rowPb.size();
    if (schema != null && schema.size() != size) {
      throw new IllegalArgumentException("Row size and fields schema sizes should match");
    }
    if (size == 0) {
      return new FieldValueList(ImmutableList.of(), schema, true);
    }
    // 1. Allocate the backing FieldValue[] once and wrap it with Arrays.asList instead of
    //    populating an intermediate ArrayList and copying it a second time via
    //    ImmutableList.copyOf. Because `this.row` is private and only accessed via `get(int)` and
    //    `size()`, and `FieldValueList` extends `AbstractList` without overriding `set`, `add`, or
    //    `remove`, all mutation attempts (including via `iterator().remove()`, `listIterator()`,
    //    and `subList()`) throw `UnsupportedOperationException`, while `Arrays$ArrayList`
    //    preserves `RandomAccess` and `Serializable`.
    // 2. Use an indexed loop (`rowPb.get(i)` and `schema.get(i)`) rather than `rowPb.iterator()`
    //    and `schema.iterator()` to avoid allocating two Iterator instances per row.
    FieldValue[] row = new FieldValue[size];
    for (int i = 0; i < size; i++) {
      Field fieldSchema = (schema != null) ? schema.get(i) : null;
      row[i] = FieldValue.fromPb(rowPb.get(i), fieldSchema, useInt64Timestamps);
    }

    return new FieldValueList(Arrays.asList(row), schema, true);
  }
}
