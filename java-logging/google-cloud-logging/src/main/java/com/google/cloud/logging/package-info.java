/*
 * Copyright 2016 Google LLC
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

/**
 * A client for Cloud Logging - Real-time log management and analysis.
 *
 * <p>Here is a simple usage example that writes and lists log entries. Create a single {@link
 * Logging} instance, reuse it across requests, and close it once during application shutdown. For
 * complete examples see <a
 * href="https://github.com/googleapis/google-cloud-java/tree/main/java-logging/samples">java-logging
 * samples</a> (including <a
 * href="https://github.com/googleapis/google-cloud-java/blob/main/java-logging/samples/snippets/src/main/java/com/example/logging/QuickstartSample.java">
 * QuickstartSample.java</a>).
 *
 * <pre>{@code
 * LoggingOptions options = LoggingOptions.getDefaultInstance();
 * Logging logging = options.getService();
 * try {
 *   LogEntry firstEntry =
 *       LogEntry.newBuilder(StringPayload.of("message"))
 *           .setLogName("test-log")
 *           .setResource(
 *               MonitoredResource.newBuilder("global")
 *                   .addLabel("project_id", options.getProjectId())
 *                   .build())
 *           .build();
 *   logging.write(Collections.singleton(firstEntry));
 *   logging.flush();
 *
 *   Page<LogEntry> entries =
 *       logging.listLogEntries(
 *           EntryListOption.filter(
 *               "logName=projects/" + options.getProjectId() + "/logs/test-log"));
 *   for (LogEntry entry : entries.iterateAll()) {
 *     System.out.println(entry);
 *   }
 * } finally {
 *   logging.close();
 * }
 * }</pre>
 *
 * <p>This second example shows how to use a {@link java.util.logging.Logger} to write log entries
 * to Cloud Logging. The snippet installs a Cloud Logging handler using {@link
 * LoggingHandler#addHandler(java.util.logging.Logger, LoggingHandler)}. Notice that this can also
 * be configured through a {@code logging.properties} file by adding:
 *
 * <pre>{@code
 * com.example.logging.jul.Quickstart.handlers=com.google.cloud.logging.LoggingHandler
 * }</pre>
 *
 * <p>For a complete {@code java.util.logging} example see <a
 * href="https://github.com/googleapis/google-cloud-java/blob/main/java-logging/samples/snippets/src/main/java/com/example/logging/jul/Quickstart.java">
 * jul/Quickstart.java</a>.
 *
 * <pre>{@code
 * Logger logger = Logger.getLogger(Quickstart.class.getName());
 * LoggingHandler.addHandler(logger, new LoggingHandler());
 * logger.warning("test warning");
 * }</pre>
 *
 * @see <a href="https://docs.cloud.google.com/logging/docs">Cloud Logging Documentation</a>
 */
package com.google.cloud.logging;
