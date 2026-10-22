/*
 * Copyright 2021 Google LLC
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

import com.google.cloud.BaseService;
import com.google.cloud.ExceptionHandler;
import com.google.cloud.ServiceOptions;
import java.io.EOFException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

abstract class BigQueryBaseService<OptionsT extends ServiceOptions<?, OptionsT>>
    extends BaseService {

  protected BigQueryBaseService(ServiceOptions options) {
    super(options);
  }

  // DEFAULT_BIGQUERY_EXCEPTION_HANDLER retries low-level transport exceptions that occur
  // before or during HTTP framing.
  // SocketTimeoutException covers HTTP read and connect timeouts where the BigQuery backend
  // or intermediary proxy failed to return response bytes within the configured socket timeout.
  // EOFException covers truncated HTTP response bodies or stream terminations (such as chunked
  // transfer encoding failures or dropped TCP connections mid-payload), matching behavior in
  // other BigQuery client libraries (Go's io.ErrUnexpectedEOF and Python's ChunkedEncodingError).
  public static final ExceptionHandler DEFAULT_BIGQUERY_EXCEPTION_HANDLER =
      ExceptionHandler.newBuilder()
          .abortOn(RuntimeException.class)
          .retryOn(ConnectException.class)
          .retryOn(UnknownHostException.class)
          .retryOn(SocketException.class)
          .retryOn(SocketTimeoutException.class)
          .retryOn(EOFException.class)
          .addInterceptors(EXCEPTION_HANDLER_INTERCEPTOR)
          .build();
}
