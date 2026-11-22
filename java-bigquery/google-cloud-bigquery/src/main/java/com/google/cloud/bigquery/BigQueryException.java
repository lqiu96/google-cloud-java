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

import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper.RetryHelperException;
import com.google.cloud.http.BaseHttpServiceException;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * BigQuery service exception.
 *
 * <p>BigQuery often indicates whether a failure is transient or permanent through a structured
 * error reason ({@link #getReason()}, {@link #getError()}, or {@link #getErrors()}) rather than the
 * HTTP status code alone. For example, rate-limit errors may arrive with HTTP 403. Job-execution
 * errors surfaced from {@link JobStatus} (such as via {@link Job#reload(BigQuery.JobOption...)} or
 * non-query {@link Job#waitFor(com.google.cloud.RetryOption...)}) have {@link #getCode()} equal to
 * {@code 0}, whereas query execution errors surfaced through {@code jobs.getQueryResults} (such as
 * via {@link BigQuery#query(QueryJobConfiguration, BigQuery.JobOption...)} or query {@link
 * Job#waitFor(com.google.cloud.RetryOption...)}) carry the HTTP status code returned by that RPC.
 * Synthesized not-found exceptions thrown by {@code get*} methods when {@link
 * BigQueryOptions#getThrowNotFound()} is enabled carry {@link #getCode()} equal to {@code 404} with
 * {@code null} {@link #getReason()} and {@link #getError()}.
 *
 * <p>{@link #isRetryable()} returns {@code true} only for HTTP 500, 502, 503, 504, and specific
 * transient socket or SSL {@link IOException} failures (such as {@link
 * java.net.SocketTimeoutException} and {@link java.net.SocketException}). It returns {@code false}
 * for HTTP 4xx errors (including 403 rate limits and 429), {@link JobStatus} errors with code
 * {@code 0}, and other {@link IOException} types such as {@link java.io.EOFException}. When
 * deciding whether to retry, inspect the structured error reason alongside the HTTP status code and
 * consult the BigQuery error codes reference. Transient asynchronous job failures cannot be
 * recovered by polling the failed job again. Resubmit the work as a new job with a new {@link
 * JobId}.
 *
 * @see <a href="https://docs.cloud.google.com/bigquery/docs/errors">BigQuery API HTTP status and
 *     error codes</a>
 * @see <a href="https://docs.cloud.google.com/bigquery/docs/error-messages">BigQuery client and
 *     connectivity error messages</a>
 */
public final class BigQueryException extends BaseHttpServiceException {

  // see: https://docs.cloud.google.com/bigquery/docs/errors
  private static final Set<Error> RETRYABLE_ERRORS =
      ImmutableSet.of(
          new Error(500, null), new Error(502, null), new Error(503, null), new Error(504, null));
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
