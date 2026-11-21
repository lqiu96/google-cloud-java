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

import com.google.api.core.ObsoleteApi;
import com.google.api.gax.retrying.ResultRetryAlgorithm;
import com.google.cloud.ServiceDefaults;
import com.google.cloud.ServiceOptions;
import com.google.cloud.ServiceRpc;
import com.google.cloud.TransportOptions;
import com.google.cloud.bigquery.QueryJobConfiguration.JobCreationMode;
import com.google.cloud.bigquery.spi.BigQueryRpcFactory;
import com.google.cloud.bigquery.spi.v2.HttpBigQueryRpc;
import com.google.cloud.http.HttpTransportOptions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import io.opentelemetry.api.trace.Tracer;
import java.util.Objects;
import java.util.Set;

/**
 * Configuration options for creating a {@link BigQuery} client.
 *
 * <p>Configure overall retry bounds (such as maximum attempts, retry delays, and total timeout) via
 * {@link Builder#setRetrySettings(com.google.api.gax.retrying.RetrySettings)}. Configure
 * per-attempt HTTP connect and read timeouts via {@link
 * Builder#setTransportOptions(TransportOptions)} with {@link HttpTransportOptions} (by default,
 * {@link #getDefaultHttpTransportOptions()} sets a 60-second read timeout).
 *
 * <p>For message-based retries on job creation and query job status polling, see {@link
 * BigQueryRetryConfig}.
 */
public class BigQueryOptions extends ServiceOptions<BigQuery, BigQueryOptions> {

  private static final String API_SHORT_NAME = "BigQuery";
  private static final int DEFAULT_READ_API_TIME_OUT = 60000;
  private static final String BIGQUERY_SCOPE = "https://www.googleapis.com/auth/bigquery";
  private static final Set<String> SCOPES = ImmutableSet.of(BIGQUERY_SCOPE);
  private static final long serialVersionUID = -2437598817433266048L;
  private final String location;
  // set the option ThrowNotFound when you want to throw the exception when the value not found
  private volatile boolean setThrowNotFound;
  private volatile boolean useInt64Timestamps;
  private volatile DataFormatOptions dataFormatOptions;
  private volatile JobCreationMode defaultJobCreationMode =
      JobCreationMode.JOB_CREATION_MODE_UNSPECIFIED;
  private final boolean enableOpenTelemetryTracing;
  private final Tracer openTelemetryTracer;
  private final ResultRetryAlgorithm<?> resultRetryAlgorithm;

  public static class DefaultBigQueryFactory implements BigQueryFactory {

    private static final BigQueryFactory INSTANCE = new DefaultBigQueryFactory();

    @Override
    public BigQuery create(BigQueryOptions options) {
      return new BigQueryImpl(options);
    }
  }

  public static class DefaultBigQueryRpcFactory implements BigQueryRpcFactory {

    private static final BigQueryRpcFactory INSTANCE = new DefaultBigQueryRpcFactory();

    @Override
    public ServiceRpc create(BigQueryOptions options) {
      return new HttpBigQueryRpc(options);
    }
  }

  public static class Builder extends ServiceOptions.Builder<BigQuery, BigQueryOptions, Builder> {

    private String location;
    private boolean throwNotFound;
    private boolean useInt64Timestamps;
    private boolean useInt64TimestampsExplicitlySet;
    private DataFormatOptions dataFormatOptions;
    private boolean dataFormatOptionsExplicitlySet;
    private JobCreationMode defaultJobCreationMode = JobCreationMode.JOB_CREATION_MODE_UNSPECIFIED;
    private boolean enableOpenTelemetryTracing;
    private Tracer openTelemetryTracer;
    private ResultRetryAlgorithm<?> resultRetryAlgorithm;

    private Builder() {
      setUseJwtAccessWithScope(false);
    }

    private Builder(BigQueryOptions options) {
      super(options);
      this.location = options.location;
      this.throwNotFound = options.setThrowNotFound;
      this.useInt64Timestamps = options.useInt64Timestamps;
      this.dataFormatOptions = options.dataFormatOptions;
      this.defaultJobCreationMode = options.defaultJobCreationMode;
      this.enableOpenTelemetryTracing = options.enableOpenTelemetryTracing;
      this.openTelemetryTracer = options.openTelemetryTracer;
      this.resultRetryAlgorithm = options.resultRetryAlgorithm;
    }

    /**
     * Sets the HTTP transport options, including per-attempt connect and read timeouts.
     *
     * <p>BigQuery supports only {@link HttpTransportOptions}. Passing any other {@link
     * TransportOptions} implementation throws {@link IllegalArgumentException}.
     */
    @Override
    public Builder setTransportOptions(TransportOptions transportOptions) {
      if (!(transportOptions instanceof HttpTransportOptions)) {
        throw new IllegalArgumentException(
            "Only http transport is allowed for " + API_SHORT_NAME + ".");
      }
      return super.setTransportOptions(transportOptions);
    }

    /**
     * Sets the client-wide default geographic processing location (for example, {@code "US"},
     * {@code "EU"}, or {@code "asia-northeast1"}) used by job and query operations when {@link
     * JobId} does not specify a location (such as {@link BigQuery#query(QueryJobConfiguration,
     * BigQuery.JobOption...)}, {@link BigQuery#create(JobInfo, BigQuery.JobOption...)} with an
     * auto-generated job ID, {@link BigQuery#getJob(JobId, BigQuery.JobOption...)}, and {@link
     * BigQuery#cancel(JobId)}).
     *
     * <p>Use with caution: this default applies across requests made with this client, even when a
     * query references tables in another region, which can cause queries against datasets in a
     * different location to fail with a not-found error. When working across multiple regions, omit
     * this client-wide setting and specify the location per request via {@link
     * JobId.Builder#setLocation(String)} (or let BigQuery infer the location from referenced
     * datasets).
     *
     * @see <a href="https://docs.cloud.google.com/bigquery/docs/locations#specify_locations">
     *     Specify locations</a>
     */
    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    /**
     * Sets whether {@code get*} methods throw {@link BigQueryException} instead of returning {@code
     * null} when a resource is not found.
     */
    public Builder setThrowNotFound(boolean throwNotFound) {
      this.throwNotFound = throwNotFound;
      return this;
    }

    /** Sets the default {@link JobCreationMode} used when not specified on a query. */
    public Builder setDefaultJobCreationMode(JobCreationMode defaultJobCreationMode) {
      this.defaultJobCreationMode = defaultJobCreationMode;
      return this;
    }

    /**
     * This setter is marked as Obsolete. Prefer {@link #setDataFormatOptions(DataFormatOptions)} to
     * set the int64timestamp configuration instead.
     *
     * <p>If useInt64Timestamps value is set in here and via DataFormatOptions, the
     * DataFormatOptions configuration value is used.
     *
     * <p>{@code DataFormatOptions.newBuilder().setUseInt64Timestamp(...).build()}
     */
    @ObsoleteApi("Use setDataFormatOptions(DataFormatOptions) instead")
    public Builder setUseInt64Timestamps(boolean useInt64Timestamps) {
      this.useInt64Timestamps = useInt64Timestamps;
      this.useInt64TimestampsExplicitlySet = true;
      return this;
    }

    /**
     * Set the format options for the BigQuery data types
     *
     * @param dataFormatOptions Configuration of the formatting options
     */
    public Builder setDataFormatOptions(DataFormatOptions dataFormatOptions) {
      Preconditions.checkNotNull(dataFormatOptions, "DataFormatOptions cannot be null");
      this.dataFormatOptions = dataFormatOptions;
      this.dataFormatOptionsExplicitlySet = true;
      return this;
    }

    /**
     * Enables OpenTelemetry tracing functionality for this BigQuery instance
     *
     * <p><div class="warning"> Traces may contain sensitive data such as resource names, full URLs,
     * and error messages.
     *
     * <p>Before configuring subscribers or exporters for traces, review the contents of the spans
     * and consult the <a
     * href="https://opentelemetry.io/docs/security/handling-sensitive-data/">OpenTelemetry
     * documentation</a> to set up filters and formatters to prevent leaking sensitive information,
     * depending on your intended use case.
     *
     * <p>See also: <a
     * href="https://opentelemetry.io/docs/concepts/semantic-conventions/">OpenTelemetry Semantic
     * Conventions</a> </div>
     *
     * @param enableOpenTelemetryTracing enables OpenTelemetry tracing if true
     */
    public Builder setEnableOpenTelemetryTracing(boolean enableOpenTelemetryTracing) {
      this.enableOpenTelemetryTracing = enableOpenTelemetryTracing;
      return this;
    }

    /**
     * Sets the OpenTelemetry tracer for this BigQuery instance to be tracer.
     *
     * @param tracer OpenTelemetry tracer to be used
     */
    public Builder setOpenTelemetryTracer(Tracer tracer) {
      this.openTelemetryTracer = tracer;
      return this;
    }

    /**
     * Sets a custom {@link ResultRetryAlgorithm} to determine which exceptions or responses are
     * retried on eligible RPCs.
     *
     * <p>If not set, {@code BigQueryOptions} uses the default BigQuery retry handler, which retries
     * transient network exceptions and retryable errors (see {@link
     * BigQueryException#isRetryable()}). Supplying a custom algorithm replaces that default
     * behavior.
     */
    public Builder setResultRetryAlgorithm(ResultRetryAlgorithm<?> resultRetryAlgorithm) {
      this.resultRetryAlgorithm = resultRetryAlgorithm;
      return this;
    }

    @Override
    public BigQueryOptions build() {
      return new BigQueryOptions(this);
    }
  }

  private BigQueryOptions(Builder builder) {
    super(BigQueryFactory.class, BigQueryRpcFactory.class, builder, new BigQueryDefaults());
    this.location = builder.location;
    this.setThrowNotFound = builder.throwNotFound;
    this.defaultJobCreationMode = builder.defaultJobCreationMode;
    this.enableOpenTelemetryTracing = builder.enableOpenTelemetryTracing;
    this.openTelemetryTracer = builder.openTelemetryTracer;
    if (builder.resultRetryAlgorithm != null
        && builder.resultRetryAlgorithm != BigQueryBaseService.DEFAULT_BIGQUERY_EXCEPTION_HANDLER) {
      this.resultRetryAlgorithm = builder.resultRetryAlgorithm;
    } else {
      this.resultRetryAlgorithm = null;
    }

    // If dataFormatOptions is not set, then create a new instance and set it with the
    // useInt64Timestamps configured in BigQueryOptions
    if (builder.dataFormatOptions == null) {
      this.dataFormatOptions =
          DataFormatOptions.newBuilder().useInt64Timestamp(builder.useInt64Timestamps).build();
    } else if (!builder.dataFormatOptionsExplicitlySet && builder.useInt64TimestampsExplicitlySet) {
      this.dataFormatOptions =
          builder.dataFormatOptions.toBuilder()
              .useInt64Timestamp(builder.useInt64Timestamps)
              .build();
    } else {
      this.dataFormatOptions = builder.dataFormatOptions;
    }
    this.useInt64Timestamps = this.dataFormatOptions.useInt64Timestamp();
  }

  private static class BigQueryDefaults implements ServiceDefaults<BigQuery, BigQueryOptions> {

    private static final long serialVersionUID = -4551722608999107711L;

    @Override
    public BigQueryFactory getDefaultServiceFactory() {
      return DefaultBigQueryFactory.INSTANCE;
    }

    @Override
    public BigQueryRpcFactory getDefaultRpcFactory() {
      return DefaultBigQueryRpcFactory.INSTANCE;
    }

    @Override
    public TransportOptions getDefaultTransportOptions() {
      return getDefaultHttpTransportOptions();
    }
  }

  /** Returns the default {@link HttpTransportOptions} with a 60-second read timeout. */
  public static HttpTransportOptions getDefaultHttpTransportOptions() {
    return HttpTransportOptions.newBuilder().setReadTimeout(DEFAULT_READ_API_TIME_OUT).build();
  }

  @Override
  protected Set<String> getScopes() {
    return SCOPES;
  }

  protected HttpBigQueryRpc getBigQueryRpcV2() {
    return (HttpBigQueryRpc) getRpc();
  }

  /**
   * Returns the client-wide default geographic processing location used by job and query operations
   * when no location is specified on {@link JobId}, or {@code null} if unset. See {@link
   * Builder#setLocation(String)}.
   */
  public String getLocation() {
    return location;
  }

  @Deprecated
  public boolean isQueryPreviewEnabled() {
    return false;
  }

  public void setThrowNotFound(boolean setThrowNotFound) {
    this.setThrowNotFound = setThrowNotFound;
  }

  /**
   * This setter is marked as Obsolete. Prefer {@link
   * Builder#setDataFormatOptions(DataFormatOptions)} to set the int64timestamp configuration
   * instead.
   *
   * <p>If useInt64Timestamps is set via DataFormatOptions, then the value in DataFormatOptions will
   * be used. Otherwise, this value will be passed to DataFormatOptions.
   *
   * <p>Alternative: {@code DataFormatOptions.newBuilder().setUseInt64Timestamp(...).build()}
   */
  @ObsoleteApi("Use Builder#setDataFormatOptions(DataFormatOptions) instead")
  public synchronized void setUseInt64Timestamps(boolean useInt64Timestamps) {
    this.useInt64Timestamps = useInt64Timestamps;
    // Because this setter exists outside the Builder, DataFormatOptions needs be rebuilt to
    // account for this setting.
    this.dataFormatOptions =
        dataFormatOptions.toBuilder().useInt64Timestamp(useInt64Timestamps).build();
  }

  @Deprecated
  public void setQueryPreviewEnabled(String queryPreviewEnabled) {}

  public void setDefaultJobCreationMode(JobCreationMode jobCreationMode) {
    this.defaultJobCreationMode = jobCreationMode;
  }

  public boolean getThrowNotFound() {
    return setThrowNotFound;
  }

  /**
   * This getter is marked as Obsolete. Prefer {@link
   * DataFormatOptions.Builder#useInt64Timestamp(boolean)} to set the int64timestamp configuration
   * instead.
   *
   * <p>Warning: DataFormatOptions values have precedence. Use {@link
   * DataFormatOptions#useInt64Timestamp()} to get `useInt64Timestamp` value used by the BigQuery
   * client.
   */
  @ObsoleteApi("Use getDataFormatOptions().isUseInt64Timestamp() instead")
  public boolean getUseInt64Timestamps() {
    return dataFormatOptions.useInt64Timestamp();
  }

  public DataFormatOptions getDataFormatOptions() {
    return dataFormatOptions;
  }

  public JobCreationMode getDefaultJobCreationMode() {
    return defaultJobCreationMode;
  }

  /**
   * Returns whether this BigQuery instance has OpenTelemetry tracing enabled
   *
   * @return true if tracing is enabled, false if not
   */
  public boolean isOpenTelemetryTracingEnabled() {
    return enableOpenTelemetryTracing;
  }

  /**
   * Returns the OpenTelemetry tracer used by this BigQuery instance
   *
   * @return OpenTelemetry tracer object or {@code null} if not set
   */
  public Tracer getOpenTelemetryTracer() {
    return openTelemetryTracer;
  }

  public ResultRetryAlgorithm<?> getResultRetryAlgorithm() {
    return resultRetryAlgorithm != null
        ? resultRetryAlgorithm
        : BigQueryBaseService.DEFAULT_BIGQUERY_EXCEPTION_HANDLER;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseHashCode(),
        location,
        setThrowNotFound,
        dataFormatOptions,
        defaultJobCreationMode,
        enableOpenTelemetryTracing,
        openTelemetryTracer,
        resultRetryAlgorithm);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof BigQueryOptions)) {
      return false;
    }
    BigQueryOptions other = (BigQueryOptions) obj;
    return baseEquals(other)
        && Objects.equals(location, other.location)
        && setThrowNotFound == other.setThrowNotFound
        && Objects.equals(dataFormatOptions, other.dataFormatOptions)
        && Objects.equals(defaultJobCreationMode, other.defaultJobCreationMode)
        && enableOpenTelemetryTracing == other.enableOpenTelemetryTracing
        && Objects.equals(openTelemetryTracer, other.openTelemetryTracer)
        && Objects.equals(resultRetryAlgorithm, other.resultRetryAlgorithm);
  }

  public static BigQueryOptions getDefaultInstance() {
    return newBuilder().build();
  }

  public static Builder newBuilder() {
    return new Builder();
  }
}
