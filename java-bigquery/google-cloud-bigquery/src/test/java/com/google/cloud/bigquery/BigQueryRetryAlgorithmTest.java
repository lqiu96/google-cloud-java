/*
 * Copyright 2026 Google LLC
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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponseException;
import com.google.api.core.NanoClock;
import com.google.api.gax.retrying.BasicResultRetryAlgorithm;
import com.google.api.gax.retrying.ExponentialRetryAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.retrying.TimedAttemptSettings;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.threeten.bp.Duration;

class BigQueryRetryAlgorithmTest {

  private static final String MULTILINE_RATE_LIMIT_MESSAGE =
      "403 Forbidden\n"
          + "POST https://bigquery.googleapis.com/bigquery/v2/projects/test-project/jobs\n"
          + "{\n"
          + "  \"code\": 403,\n"
          + "  \"errors\": [\n"
          + "    {\n"
          + "      \"domain\": \"global\",\n"
          + "      \"message\": \"Exceeded rate limits: too many api requests per user per"
          + " method.\",\n"
          + "      \"reason\": \"rateLimitExceeded\"\n"
          + "    }\n"
          + "  ],\n"
          + "  \"message\": \"Exceeded rate limits: too many api requests per user per method.\"\n"
          + "}";

  private static final String MULTILINE_ACCESS_DENIED_MESSAGE =
      "403 Forbidden\n"
          + "POST https://bigquery.googleapis.com/bigquery/v2/projects/test-project/jobs\n"
          + "{\n"
          + "  \"code\": 403,\n"
          + "  \"errors\": [\n"
          + "    {\n"
          + "      \"domain\": \"global\",\n"
          + "      \"message\": \"Access Denied: Project test-project\",\n"
          + "      \"reason\": \"accessDenied\"\n"
          + "    }\n"
          + "  ],\n"
          + "  \"message\": \"Access Denied: Project test-project\"\n"
          + "}";

  @Test
  void testMatchRegExMatchesMultilineGoogleJsonResponseMessage() {
    assertTrue(
        BigQueryRetryAlgorithm.matchRegEx(
            BigQueryErrorMessages.RetryRegExPatterns.RATE_LIMIT_EXCEEDED_REGEX,
            MULTILINE_RATE_LIMIT_MESSAGE));
    assertFalse(
        BigQueryRetryAlgorithm.matchRegEx(
            BigQueryErrorMessages.RetryRegExPatterns.RATE_LIMIT_EXCEEDED_REGEX,
            MULTILINE_ACCESS_DENIED_MESSAGE));
  }

  @Test
  void testShouldRetryMatchesMultilineGoogleJsonResponseException() {
    BigQueryRetryConfig retryConfig =
        BigQueryRetryConfig.newBuilder()
            .retryOnRegEx(BigQueryErrorMessages.RetryRegExPatterns.RATE_LIMIT_EXCEEDED_REGEX)
            .build();
    RetrySettings retrySettings =
        RetrySettings.newBuilder()
            .setMaxAttempts(3)
            .setInitialRetryDelay(Duration.ofMillis(10))
            .setMaxRetryDelay(Duration.ofMillis(100))
            .setRetryDelayMultiplier(2.0)
            .setTotalTimeout(Duration.ofSeconds(10))
            .build();
    ExponentialRetryAlgorithm timedAlgorithm =
        new ExponentialRetryAlgorithm(retrySettings, NanoClock.getDefaultClock());
    BigQueryRetryAlgorithm<Object> retryAlgorithm =
        new BigQueryRetryAlgorithm<>(
            new BasicResultRetryAlgorithm<Object>() {
              @Override
              public boolean shouldRetry(Throwable previousThrowable, Object previousResponse) {
                return false;
              }
            },
            timedAlgorithm,
            retryConfig);

    GoogleJsonError.ErrorInfo errorInfo = new GoogleJsonError.ErrorInfo();
    errorInfo.setDomain("global");
    errorInfo.setReason("rateLimitExceeded");
    errorInfo.setMessage("Exceeded rate limits: too many api requests per user per method.");
    GoogleJsonError rateLimitDetails = new GoogleJsonError();
    rateLimitDetails.setCode(403);
    rateLimitDetails.setMessage("Exceeded rate limits: too many api requests per user per method.");
    rateLimitDetails.setErrors(Collections.singletonList(errorInfo));
    GoogleJsonResponseException rateLimitException =
        new GoogleJsonResponseException(
            new HttpResponseException.Builder(403, "Forbidden", new HttpHeaders())
                .setMessage(MULTILINE_RATE_LIMIT_MESSAGE),
            rateLimitDetails);

    TimedAttemptSettings firstAttempt = retryAlgorithm.createFirstAttempt(null);
    TimedAttemptSettings nextAttempt =
        retryAlgorithm.createNextAttempt(null, rateLimitException, null, firstAttempt);
    assertNotNull(nextAttempt);
    assertTrue(retryAlgorithm.shouldRetry(null, rateLimitException, null, nextAttempt));

    GoogleJsonError accessDeniedDetails = new GoogleJsonError();
    accessDeniedDetails.setCode(403);
    accessDeniedDetails.setMessage("Access Denied");
    GoogleJsonResponseException accessDeniedException =
        new GoogleJsonResponseException(
            new HttpResponseException.Builder(403, "Forbidden", new HttpHeaders())
                .setMessage(MULTILINE_ACCESS_DENIED_MESSAGE),
            accessDeniedDetails);
    assertNull(retryAlgorithm.createNextAttempt(null, accessDeniedException, null, firstAttempt));
    assertFalse(retryAlgorithm.shouldRetry(null, accessDeniedException, null, nextAttempt));
  }
}
