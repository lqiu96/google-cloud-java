/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.bigquery;

// [START bigquery_table_insert_rows_explicit_none_insert_ids]
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryError;
import com.google.cloud.bigquery.BigQueryException;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.InsertAllRequest;
import com.google.cloud.bigquery.InsertAllResponse;
import com.google.cloud.bigquery.TableId;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Sample to insert rows without insert IDs using the Storage Write API (REST).
// For new streaming workloads that need lower cost, higher throughput, or exactly-once delivery,
// consider the Storage Write API (gRPC):
// https://docs.cloud.google.com/bigquery/docs/write-api-grpc
public class TableInsertRowsWithoutRowIds {

  public static void main(String[] args) {
    // TODO(developer): Replace these variables before running the sample.
    String datasetName = "MY_DATASET_NAME";
    String tableName = "MY_TABLE_NAME";
    tableInsertRowsWithoutRowIds(datasetName, tableName);
  }

  public static void tableInsertRowsWithoutRowIds(String datasetName, String tableName) {
    try {
      // Initialize client that will be used to send requests. This client only needs to be created
      // once, and can be reused for multiple requests.
      final BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
      // Create rows to insert
      Map<String, Object> rowContent1 = new HashMap<>();
      rowContent1.put("stringField", "Phred Phlyntstone");
      rowContent1.put("numericField", 32);
      Map<String, Object> rowContent2 = new HashMap<>();
      rowContent2.put("stringField", "Wylma Phlyntstone");
      rowContent2.put("numericField", 29);
      InsertAllResponse response =
          bigquery.insertAll(
              InsertAllRequest.newBuilder(TableId.of(datasetName, tableName))
                  // Omitting insert IDs disables best-effort deduplication and automatic client
                  // retries in the Java library. See:
                  // https://docs.cloud.google.com/bigquery/docs/write-api-rest#dataconsistency
                  .setRows(
                      ImmutableList.of(
                          InsertAllRequest.RowToInsert.of(rowContent1),
                          InsertAllRequest.RowToInsert.of(rowContent2)))
                  .build());

      // Row-level insert failures return HTTP 200 without throwing BigQueryException, so always
      // check hasErrors(). By default (skipInvalidRows=false), any invalid row aborts the entire
      // batch. See: https://docs.cloud.google.com/bigquery/docs/write-api-rest#streaming-success
      if (response.hasErrors()) {
        // If any of the insertions failed, this lets you inspect the errors
        for (Map.Entry<Long, List<BigQueryError>> entry : response.getInsertErrors().entrySet()) {
          System.out.println("Response error: \n" + entry.getValue());
        }
        return;
      }
      System.out.println("Rows successfully inserted into table without row ids");
    } catch (BigQueryException e) {
      System.out.println("Insert operation not performed \n" + e.toString());
    }
  }
}
// [END bigquery_table_insert_rows_explicit_none_insert_ids]
