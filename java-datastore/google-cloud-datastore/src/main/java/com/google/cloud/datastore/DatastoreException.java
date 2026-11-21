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

package com.google.cloud.datastore;

import com.google.api.core.InternalApi;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper.RetryHelperException;
import com.google.cloud.http.BaseHttpServiceException;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.rpc.Code;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Set;

/**
 * Datastore service exception.
 *
 * <p>Although this class extends {@link BaseHttpServiceException}, {@link #getCode()} returns
 * canonical gRPC ({@link com.google.rpc.Code}) integer values for server errors (for example,
 * {@code 10} for {@code ABORTED}, {@code 14} for {@code UNAVAILABLE}, {@code 4} for {@code
 * DEADLINE_EXCEEDED}, and {@code 6} for {@code ALREADY_EXISTS}) rather than HTTP status codes.
 * {@link #getReason()} carries the structured {@link com.google.rpc.ErrorInfo} reason when provided
 * by the server, or otherwise the canonical status code name.
 *
 * <p>Client-side validation errors, low-level I/O failures, and exceptions propagated from {@link
 * Datastore#runInTransaction(Datastore.TransactionCallable)} callbacks carry {@link #getCode()}
 * equal to {@code 0} ({@link #UNKNOWN_CODE}); inspect {@link #getCause()} alongside {@link
 * #getReason()} to identify the underlying error. {@link #isRetryable()} classifies {@code
 * ABORTED}, {@code DEADLINE_EXCEEDED}, {@code UNAVAILABLE}, and low-level transport {@link
 * IOException} failures as retryable, subject to operation idempotency.
 *
 * @see <a href="https://docs.cloud.google.com/datastore/docs/concepts/errors">Google Cloud
 *     Datastore error codes</a>
 */
public final class DatastoreException extends BaseHttpServiceException {

  // see https://docs.cloud.google.com/datastore/docs/concepts/errors#error_codes
  private static final Set<Error> RETRYABLE_ERRORS =
      ImmutableSet.of(
          new Error(10, null, false), new Error(4, null, false), new Error(14, null, true));
  private static final long serialVersionUID = 2663750991205874435L;

  public DatastoreException(int code, String message, String reason) {
    this(code, message, reason, true, null);
  }

  public DatastoreException(int code, String message, Throwable cause) {
    super(code, message, null, true, RETRYABLE_ERRORS, cause);
  }

  public DatastoreException(int code, String message, String reason, Throwable cause) {
    super(code, message, reason, true, RETRYABLE_ERRORS, cause);
  }

  public DatastoreException(
      int code, String message, String reason, boolean idempotent, Throwable cause) {
    super(code, message, reason, idempotent, RETRYABLE_ERRORS, cause);
  }

  public DatastoreException(IOException exception) {
    super(exception, true, RETRYABLE_ERRORS);
  }

  /**
   * Translate RetryHelperException to the DatastoreException that caused the error. This method
   * will always throw an exception.
   *
   * @throws DatastoreException when {@code ex} was caused by a {@code DatastoreException}
   */
  static DatastoreException translateAndThrow(RetryHelperException ex) {
    BaseServiceException.translate(ex);
    throw transformThrowable(ex);
  }

  static BaseServiceException transformThrowable(Throwable t) {
    if (t instanceof BaseServiceException) {
      return (BaseServiceException) t;
    }
    if (t.getCause() instanceof BaseServiceException) {
      return (BaseServiceException) t.getCause();
    }
    if (t instanceof ApiException) {
      return asDatastoreException((ApiException) t);
    }
    if (t.getCause() instanceof ApiException) {
      return asDatastoreException((ApiException) t.getCause());
    }
    return getDatastoreException(t);
  }

  private static DatastoreException getDatastoreException(Throwable t) {
    // unwrap a RetryHelperException if that is what is being translated
    if (t instanceof RetryHelperException) {
      return new DatastoreException(UNKNOWN_CODE, t.getMessage(), null, t.getCause());
    }
    return new DatastoreException(UNKNOWN_CODE, t.getMessage(), t);
  }

  static DatastoreException asDatastoreException(ApiException apiEx) {
    int datastoreStatusCode = 0;
    StatusCode statusCode = apiEx.getStatusCode();
    if (statusCode instanceof GrpcStatusCode) {
      GrpcStatusCode gsc = (GrpcStatusCode) statusCode;
      datastoreStatusCode =
          GrpcToDatastoreCodeTranslation.grpcCodeToDatastoreStatusCode(gsc.getTransportCode());
    }

    // If there is a gRPC exception in our cause, pull its error message up to be our
    // message otherwise, create a generic error message with the status code.
    String statusCodeName = statusCode.getCode().name();
    String statusExceptionMessage = getStatusExceptionMessage(apiEx);

    String message;
    if (statusExceptionMessage != null) {
      message = statusCodeName + ": " + statusExceptionMessage;
    } else {
      message = "Error: " + statusCodeName;
    }

    String reason = apiEx.getReason();
    if (Strings.isNullOrEmpty(reason)) {
      reason = statusCodeName;
    }
    // It'd be better to use ExceptionData and BaseServiceException#<init>(ExceptionData) but,
    // BaseHttpServiceException does not pass that through so we're stuck using this for now.
    // TODO: When we can break the coupling to BaseHttpServiceException replace this
    return new DatastoreException(datastoreStatusCode, message, reason, apiEx);
  }

  private static String getStatusExceptionMessage(Exception apiEx) {
    if (apiEx.getMessage() != null) {
      return apiEx.getMessage();
    } else {
      Throwable cause = apiEx.getCause();
      if (cause instanceof StatusRuntimeException || cause instanceof StatusException) {
        return cause.getMessage();
      }
      return null;
    }
  }

  /**
   * Throw a DatastoreException with {@code FAILED_PRECONDITION} reason and the {@code message} in a
   * nested exception.
   *
   * @throws DatastoreException every time
   */
  static DatastoreException throwInvalidRequest(String massage, Object... params) {
    throw new DatastoreException(
        UNKNOWN_CODE, String.format(massage, params), "FAILED_PRECONDITION");
  }

  static DatastoreException propagateUserException(Exception ex) {
    throw new DatastoreException(BaseServiceException.UNKNOWN_CODE, ex.getMessage(), null, ex);
  }

  /**
   * Extracts the canonical status code name from the given throwable. Walks the exception cause
   * chain looking for a {@link DatastoreException} and resolves its canonical {@link
   * com.google.api.gax.rpc.StatusCode.Code} name from an underlying {@link ApiException} cause or
   * canonical gRPC status code (so structured {@code ErrorInfo} reason tokens are not emitted as
   * status labels), falling back to {@link #getReason()} when non-empty, or {@code "UNKNOWN"} if
   * the status cannot be determined.
   *
   * @param throwable the throwable to extract the status code from
   * @return the canonical status code name, or {@code "UNKNOWN"} if not determinable
   */
  @InternalApi
  public static String extractStatusCode(Throwable throwable) {
    Throwable current = throwable;
    while (current != null) {
      if (current instanceof DatastoreException) {
        DatastoreException dsEx = (DatastoreException) current;
        if (dsEx.getCause() instanceof ApiException) {
          StatusCode statusCode = ((ApiException) dsEx.getCause()).getStatusCode();
          if (statusCode != null && statusCode.getCode() != null) {
            return statusCode.getCode().name();
          }
        }
        if (dsEx.getCode() > UNKNOWN_CODE) {
          Code rpcCode = Code.forNumber(dsEx.getCode());
          if (rpcCode != null) {
            return rpcCode.name();
          }
        }
        String reason = dsEx.getReason();
        if (!Strings.isNullOrEmpty(reason)) {
          return reason;
        }
      }
      current = current.getCause();
    }
    return StatusCode.Code.UNKNOWN.toString();
  }
}
