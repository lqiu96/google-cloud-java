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

/**
 * <a href="https://logback.qos.ch/">Logback</a> appender for Google Cloud Logging.
 *
 * <p>Choose the right ingestion path for your workload:
 *
 * <ul>
 *   <li><b>Managed Google Cloud runtimes (Cloud Run, GKE, App Engine, Cloud Functions)</b>: Prefer
 *       writing structured JSON logs to {@code stdout} so the platform logging agent handles
 *       buffering, retries, and crash resilience (either by setting {@code
 *       <redirectToStdout>true</redirectToStdout>} on {@link
 *       com.google.cloud.logging.logback.LoggingAppender} or by using a native JSON Logback
 *       encoder).
 *   <li><b>Direct Cloud Logging API ingestion from Logback / SLF4J</b>: Configure {@link
 *       com.google.cloud.logging.logback.LoggingAppender} in {@code logback.xml}. This artifact
 *       transitively depends on Logback 1.2 / SLF4J 1.7. If your classpath includes {@code
 *       slf4j-api} 2.x (for example via {@code google-cloud-bigquerystorage} or Spring Boot 3+),
 *       upgrade {@code logback-classic} and {@code logback-core} to 1.5.x (or pin {@code slf4j-api}
 *       1.7.x); mixing {@code slf4j-api} 2.x with {@code logback-classic} 1.2.x causes SLF4J to
 *       bind {@code NOPLoggerFactory} and silently drop all logs.
 *   <li><b>Other Java logging surfaces</b>: Use {@link com.google.cloud.logging.LoggingHandler} for
 *       {@link java.util.logging}, {@link com.google.cloud.logging.Logging} for programmatic veneer
 *       access, or {@link com.google.cloud.logging.v2.LoggingClient} for full v2 GAPIC access.
 * </ul>
 *
 * <p><b>Quickstart ({@code logback.xml})</b>: Register {@link
 * com.google.cloud.logging.logback.LoggingAppender} and a shutdown hook so buffered asynchronous
 * entries are flushed when the JVM exits (use {@code ch.qos.logback.core.hook.DelayingShutdownHook}
 * on Logback 1.2, or {@code ch.qos.logback.core.hook.DefaultShutdownHook} on Logback 1.3+):
 *
 * <pre>{@code
 * <configuration>
 *   <!-- Logback 1.2: DelayingShutdownHook (use DefaultShutdownHook on Logback 1.3+/1.5+) -->
 *   <shutdownHook class="ch.qos.logback.core.hook.DelayingShutdownHook" />
 *
 *   <appender name="CLOUD" class="com.google.cloud.logging.logback.LoggingAppender">
 *     <log>application.log</log>
 *     <!-- Optional: defaults to ASYNC; flushLevel defaults to OFF -->
 *     <writeSynchronicity>ASYNC</writeSynchronicity>
 *     <flushLevel>ERROR</flushLevel>
 *   </appender>
 *
 *   <root level="INFO">
 *     <appender-ref ref="CLOUD" />
 *   </root>
 * </configuration>
 * }</pre>
 *
 * @see com.google.cloud.logging.logback.LoggingAppender
 * @see com.google.cloud.logging.logback.LoggingEventEnhancer
 * @see <a href="https://docs.cloud.google.com/logging/docs/setup/java#logback_appender">Setting Up
 *     Cloud Logging for Java (Logback)</a>
 */
package com.google.cloud.logging.logback;
