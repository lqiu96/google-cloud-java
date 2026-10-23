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

  /**
   * The default exception handler for BigQuery operations.
   *
   * <p>Retries low-level transport exceptions that occur before or during HTTP framing:
   * <ul>
   *   <li>{@link ConnectException} and {@link UnknownHostException}: TCP handshake or DNS resolution failures.
   *   <li>{@link SocketException}: OS-level TCP connection resets or broken pipes.
   *   <li>{@link SocketTimeoutException}: Connect or read timeouts where the BigQuery backend or
   *       intermediate proxy did not return response bytes within the configured socket timeout.
   *   <li>{@link EOFException}: Premature connection closures or HTTP/2 stream resets mid-response.
   * </ul>
   */
  // HttpBigQueryRpc SkipExceptionTranslation methods throw raw IOExceptions directly to
  // DEFAULT_BIGQUERY_EXCEPTION_HANDLER during retries rather than wrapping them into
  // BigQueryException upfront.
  //
  // SocketException only catches TCP connection resets and broken pipes. SocketTimeoutException
  // (which extends InterruptedIOException, not SocketException) must be explicitly listed so
  // connectTimeout (20s) and readTimeout (60s) expirations trigger retries.
  //
  // EOFException covers truncated HTTP response bodies where a proxy or backend closes the TCP
  // stream mid-payload.
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
