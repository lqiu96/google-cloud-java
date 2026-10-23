/*
 * Copyright 2015 Google LLC
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

import com.google.api.client.http.HttpResponseException;
import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper.RetryHelperException;
import com.google.cloud.http.BaseHttpServiceException;
import com.google.common.collect.ImmutableSet;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * BigQuery service exception.
 *
 * @see <a href="https://cloud.google.com/bigquery/troubleshooting-errors">Google Cloud BigQuery
 *     error codes</a>
 */
public final class BigQueryException extends BaseHttpServiceException {

  // BigQuery structured error reason codes and HTTP status codes defined in the BigQuery
  // troubleshooting error catalog: https://cloud.google.com/bigquery/docs/error-messages
  //
  // HTTP status codes 429, 500, 502, 503, and 504 correspond to transient rate limits, backend
  // unavailability, or gateway errors across Google APIs.
  //
  // The six structured error reasons represent transient conditions on individual RPC requests:
  // - "rateLimitExceeded": Project-level or API rate limits (HTTP 403).
  // - "userRateLimitExceeded": Per-user quota limits (HTTP 403).
  // - "jobRateLimitExceeded": Job creation quota limits (HTTP 400 or HTTP 200 ErrorProto on
  //   jobs.insert / jobs.query).
  // - "backendError": Transient server-side failures (HTTP 500/503).
  // - "internalError": Transient internal BigQuery errors (HTTP 500).
  // - "badGateway": Transient proxy/gateway errors (HTTP 502).
  //
  // Job-level execution errors such as "jobBackendError" and "jobInternalError" (HTTP 400 on
  // jobs.query / jobs.getQueryResults) are intentionally excluded from per-RPC retries. They
  // indicate that an asynchronous job terminated in a failed state on the backend, where retrying
  // the status check on the same JobId would repeatedly return the same terminal failure.
  static final Set<Error> RETRYABLE_ERRORS =
      ImmutableSet.of(
          // HTTP status codes
          new Error(429, null, true),
          new Error(500, null, true),
          new Error(502, null, true),
          new Error(503, null, true),
          new Error(504, null, true),
          // Structured BigQuery error reasons
          new Error(null, "rateLimitExceeded", true),
          new Error(null, "userRateLimitExceeded", true),
          new Error(null, "jobRateLimitExceeded", true),
          new Error(null, "backendError", true),
          new Error(null, "internalError", true),
          new Error(null, "badGateway", true));
  private static final long serialVersionUID = -5006625989225438209L;

  private final List<BigQueryError> errors;

  public BigQueryException(int code, String message) {
    this(code, message, (Throwable) null);
  }

  public BigQueryException(int code, String message, Throwable cause) {
    super(code, message, null, true, RETRYABLE_ERRORS, cause);
    this.errors = null;
  }

  public BigQueryException(int code, String message, BigQueryError error) {
    super(code, message, error != null ? error.getReason() : null, true, RETRYABLE_ERRORS);
    this.errors = Arrays.asList(error);
  }

  public BigQueryException(List<BigQueryError> errors) {
    super(
        0,
        errors != null ? errors.get(0).getMessage() : null,
        errors != null ? errors.get(0).getReason() : null,
        true,
        RETRYABLE_ERRORS);
    this.errors = errors;
  }

  public BigQueryException(IOException exception) {
    super(exception, true, RETRYABLE_ERRORS);
    List<BigQueryError> errors = null;
    if (getReason() != null) {
      errors =
          Arrays.asList(
              new BigQueryError(getReason(), getLocation(), getMessage(), getDebugInfo()));
    }
    this.errors = errors;
  }

  /**
   * Returns the {@link BigQueryError} that caused this exception. Returns {@code null} if none
   * exists.
   */
  public BigQueryError getError() {
    return errors == null || errors.isEmpty() || errors.size() == 0 ? null : errors.get(0);
  }

  /**
   * Returns a list of {@link BigQueryError}s that caused this exception. Returns {@code null} if
   * none exists.
   */
  public List<BigQueryError> getErrors() {
    return errors;
  }

  /**
   * Returns {@code true} if this exception is retryable, {@code false} otherwise.
   *
   * <p>An exception is considered retryable if its HTTP status code or structured BigQuery error
   * reason matches {@link #RETRYABLE_ERRORS}, if its underlying {@link IOException} is recognized
   * as retryable by {@link BaseServiceException}, or if its cause is a {@link
   * SocketTimeoutException} or {@link EOFException}.
   *
   * @return {@code true} if the operation can be retried, {@code false} otherwise
   */
  @Override
  public boolean isRetryable() {
    // Check getCause() directly for SocketTimeoutException and EOFException in addition to the
    // superclass checks. When an IOException is translated through translateAndThrow with UNKNOWN_CODE
    // (0), super.isRetryable() might not match HTTP status codes, so inspecting the cause ensures
    // socket read/connect timeouts and mid-stream EOF drops are consistently retryable.
    // If the cause is an HttpResponseException, also check its HTTP status code against RETRYABLE_ERRORS
    // in case the error was constructed with code 0.
    if (super.isRetryable()
        || getCause() instanceof SocketTimeoutException
        || getCause() instanceof EOFException) {
      return true;
    }
    if (getCode() == UNKNOWN_CODE && getCause() instanceof HttpResponseException) {
      return BaseServiceException.isRetryable(
          ((HttpResponseException) getCause()).getStatusCode(), getReason(), true, RETRYABLE_ERRORS);
    }
    return false;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof BigQueryException)) {
      return false;
    }
    BigQueryException other = (BigQueryException) obj;
    return super.equals(other) && Objects.equals(errors, other.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), errors);
  }

  /**
   * Translate RetryHelperException to the BigQueryException that caused the error. This method will
   * always throw an exception.
   *
   * @throws BigQueryException when {@code ex} was caused by a {@code BigQueryException}
   */
  static BaseServiceException translateAndThrow(RetryHelperException ex) {
    BaseServiceException.translate(ex);
    throw new BigQueryException(UNKNOWN_CODE, ex.getMessage(), ex.getCause());
  }

  static BaseServiceException translateAndThrow(
      BigQueryRetryHelper.BigQueryRetryHelperException ex) {
    if (ex.getCause() instanceof BaseServiceException) {
      throw (BaseServiceException) ex.getCause();
    }
    throw new BigQueryException(UNKNOWN_CODE, ex.getMessage(), ex.getCause());
  }

  static BaseServiceException translateAndThrow(ExecutionException ex) {
    BaseServiceException.translate(ex);
    throw new BigQueryException(UNKNOWN_CODE, ex.getMessage(), ex.getCause());
  }

  static BaseServiceException translateAndThrow(Exception ex) {
    throw new BigQueryException(UNKNOWN_CODE, ex.getMessage(), ex.getCause());
  }

  static BaseServiceException translateAndThrowBigQuerySQLException(BigQueryException e)
      throws BigQuerySQLException {
    throw new BigQuerySQLException(e.getMessage(), e, e.getErrors());
  }
}
