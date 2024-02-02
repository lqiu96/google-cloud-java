/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.lifesciences.v2beta;

public interface VirtualMachineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.VirtualMachine)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The machine type of the virtual machine to create. Must be the
   * short name of a standard machine type (such as "n1-standard-1") or a custom
   * machine type (such as "custom-1-4096", where "1" indicates the number of
   * vCPUs and "4096" indicates the memory in MB). See [Creating an instance
   * with a custom machine
   * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create)
   * for more specifications on creating a custom machine type.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Required. The machine type of the virtual machine to create. Must be the
   * short name of a standard machine type (such as "n1-standard-1") or a custom
   * machine type (such as "custom-1-4096", where "1" indicates the number of
   * vCPUs and "4096" indicates the memory in MB). See [Creating an instance
   * with a custom machine
   * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create)
   * for more specifications on creating a custom machine type.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * If true, allocate a preemptible VM.
   * </pre>
   *
   * <code>bool preemptible = 2;</code>
   *
   * @return The preemptible.
   */
  boolean getPreemptible();

  /**
   *
   *
   * <pre>
   * Optional set of labels to apply to the VM and any attached disk resources.
   * These labels must adhere to the [name and value
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources) on
   * VM labels imposed by Compute Engine.
   *
   * Labels keys with the prefix 'google-' are reserved for use by Google.
   *
   * Labels applied at creation time to the VM. Applied on a best-effort basis
   * to attached disk resources shortly after VM creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional set of labels to apply to the VM and any attached disk resources.
   * These labels must adhere to the [name and value
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources) on
   * VM labels imposed by Compute Engine.
   *
   * Labels keys with the prefix 'google-' are reserved for use by Google.
   *
   * Labels applied at creation time to the VM. Applied on a best-effort basis
   * to attached disk resources shortly after VM creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional set of labels to apply to the VM and any attached disk resources.
   * These labels must adhere to the [name and value
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources) on
   * VM labels imposed by Compute Engine.
   *
   * Labels keys with the prefix 'google-' are reserved for use by Google.
   *
   * Labels applied at creation time to the VM. Applied on a best-effort basis
   * to attached disk resources shortly after VM creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional set of labels to apply to the VM and any attached disk resources.
   * These labels must adhere to the [name and value
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources) on
   * VM labels imposed by Compute Engine.
   *
   * Labels keys with the prefix 'google-' are reserved for use by Google.
   *
   * Labels applied at creation time to the VM. Applied on a best-effort basis
   * to attached disk resources shortly after VM creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional set of labels to apply to the VM and any attached disk resources.
   * These labels must adhere to the [name and value
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources) on
   * VM labels imposed by Compute Engine.
   *
   * Labels keys with the prefix 'google-' are reserved for use by Google.
   *
   * Labels applied at creation time to the VM. Applied on a best-effort basis
   * to attached disk resources shortly after VM creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The list of disks to create and attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Disk disks = 4;</code>
   */
  java.util.List<com.google.cloud.lifesciences.v2beta.Disk> getDisksList();
  /**
   *
   *
   * <pre>
   * The list of disks to create and attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Disk disks = 4;</code>
   */
  com.google.cloud.lifesciences.v2beta.Disk getDisks(int index);
  /**
   *
   *
   * <pre>
   * The list of disks to create and attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Disk disks = 4;</code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * The list of disks to create and attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Disk disks = 4;</code>
   */
  java.util.List<? extends com.google.cloud.lifesciences.v2beta.DiskOrBuilder>
      getDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of disks to create and attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Disk disks = 4;</code>
   */
  com.google.cloud.lifesciences.v2beta.DiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The VM network configuration.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Network network = 5;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * The VM network configuration.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Network network = 5;</code>
   *
   * @return The network.
   */
  com.google.cloud.lifesciences.v2beta.Network getNetwork();
  /**
   *
   *
   * <pre>
   * The VM network configuration.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Network network = 5;</code>
   */
  com.google.cloud.lifesciences.v2beta.NetworkOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of accelerators to attach to the VM.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Accelerator accelerators = 6;</code>
   */
  java.util.List<com.google.cloud.lifesciences.v2beta.Accelerator> getAcceleratorsList();
  /**
   *
   *
   * <pre>
   * The list of accelerators to attach to the VM.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Accelerator accelerators = 6;</code>
   */
  com.google.cloud.lifesciences.v2beta.Accelerator getAccelerators(int index);
  /**
   *
   *
   * <pre>
   * The list of accelerators to attach to the VM.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Accelerator accelerators = 6;</code>
   */
  int getAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * The list of accelerators to attach to the VM.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Accelerator accelerators = 6;</code>
   */
  java.util.List<? extends com.google.cloud.lifesciences.v2beta.AcceleratorOrBuilder>
      getAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of accelerators to attach to the VM.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Accelerator accelerators = 6;</code>
   */
  com.google.cloud.lifesciences.v2beta.AcceleratorOrBuilder getAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The service account to install on the VM. This account does not need
   * any permissions other than those required by the pipeline.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ServiceAccount service_account = 7;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account to install on the VM. This account does not need
   * any permissions other than those required by the pipeline.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ServiceAccount service_account = 7;</code>
   *
   * @return The serviceAccount.
   */
  com.google.cloud.lifesciences.v2beta.ServiceAccount getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account to install on the VM. This account does not need
   * any permissions other than those required by the pipeline.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ServiceAccount service_account = 7;</code>
   */
  com.google.cloud.lifesciences.v2beta.ServiceAccountOrBuilder getServiceAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * The size of the boot disk, in GB. The boot disk must be large
   * enough to accommodate all of the Docker images from each action in the
   * pipeline at the same time. If not specified, a small but reasonable
   * default value is used.
   * </pre>
   *
   * <code>int32 boot_disk_size_gb = 8;</code>
   *
   * @return The bootDiskSizeGb.
   */
  int getBootDiskSizeGb();

  /**
   *
   *
   * <pre>
   * The CPU platform to request. An instance based on a newer platform can be
   * allocated, but never one with fewer capabilities. The value of this
   * parameter must be a valid Compute Engine CPU platform name (such as "Intel
   * Skylake"). This parameter is only useful for carefully optimized work
   * loads where the CPU platform has a significant impact.
   *
   * For more information about the effect of this parameter, see
   * https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
   * </pre>
   *
   * <code>string cpu_platform = 9;</code>
   *
   * @return The cpuPlatform.
   */
  java.lang.String getCpuPlatform();
  /**
   *
   *
   * <pre>
   * The CPU platform to request. An instance based on a newer platform can be
   * allocated, but never one with fewer capabilities. The value of this
   * parameter must be a valid Compute Engine CPU platform name (such as "Intel
   * Skylake"). This parameter is only useful for carefully optimized work
   * loads where the CPU platform has a significant impact.
   *
   * For more information about the effect of this parameter, see
   * https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
   * </pre>
   *
   * <code>string cpu_platform = 9;</code>
   *
   * @return The bytes for cpuPlatform.
   */
  com.google.protobuf.ByteString getCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * The host operating system image to use.
   *
   * Currently, only Container-Optimized OS images can be used.
   *
   * The default value is `projects/cos-cloud/global/images/family/cos-stable`,
   * which selects the latest stable release of Container-Optimized OS.
   *
   * This option is provided to allow testing against the beta release of the
   * operating system to ensure that the new version does not interact
   * negatively with production pipelines.
   *
   * To test a pipeline against the beta release of Container-Optimized OS,
   * use the value `projects/cos-cloud/global/images/family/cos-beta`.
   * </pre>
   *
   * <code>string boot_image = 10;</code>
   *
   * @return The bootImage.
   */
  java.lang.String getBootImage();
  /**
   *
   *
   * <pre>
   * The host operating system image to use.
   *
   * Currently, only Container-Optimized OS images can be used.
   *
   * The default value is `projects/cos-cloud/global/images/family/cos-stable`,
   * which selects the latest stable release of Container-Optimized OS.
   *
   * This option is provided to allow testing against the beta release of the
   * operating system to ensure that the new version does not interact
   * negatively with production pipelines.
   *
   * To test a pipeline against the beta release of Container-Optimized OS,
   * use the value `projects/cos-cloud/global/images/family/cos-beta`.
   * </pre>
   *
   * <code>string boot_image = 10;</code>
   *
   * @return The bytes for bootImage.
   */
  com.google.protobuf.ByteString getBootImageBytes();

  /**
   *
   *
   * <pre>
   * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator.
   * The version specified here must be compatible with the GPU libraries
   * contained in the container being executed, and must be one of the drivers
   * hosted in the `nvidia-drivers-us-public` bucket on Google Cloud Storage.
   * </pre>
   *
   * <code>string nvidia_driver_version = 11 [deprecated = true];</code>
   *
   * @deprecated google.cloud.lifesciences.v2beta.VirtualMachine.nvidia_driver_version is
   *     deprecated. See google/cloud/lifesciences/v2beta/workflows.proto;l=411
   * @return The nvidiaDriverVersion.
   */
  @java.lang.Deprecated
  java.lang.String getNvidiaDriverVersion();
  /**
   *
   *
   * <pre>
   * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator.
   * The version specified here must be compatible with the GPU libraries
   * contained in the container being executed, and must be one of the drivers
   * hosted in the `nvidia-drivers-us-public` bucket on Google Cloud Storage.
   * </pre>
   *
   * <code>string nvidia_driver_version = 11 [deprecated = true];</code>
   *
   * @deprecated google.cloud.lifesciences.v2beta.VirtualMachine.nvidia_driver_version is
   *     deprecated. See google/cloud/lifesciences/v2beta/workflows.proto;l=411
   * @return The bytes for nvidiaDriverVersion.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNvidiaDriverVersionBytes();

  /**
   *
   *
   * <pre>
   * Whether Stackdriver monitoring should be enabled on the VM.
   * </pre>
   *
   * <code>bool enable_stackdriver_monitoring = 12;</code>
   *
   * @return The enableStackdriverMonitoring.
   */
  boolean getEnableStackdriverMonitoring();

  /**
   *
   *
   * <pre>
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be
   * mounted into the Docker folder in a way that the images present in the
   * cache will not need to be pulled. The digests of the cached images must
   * match those of the tags used or the latest version will still be pulled.
   * The root directory of the ext4 image must contain `image` and `overlay2`
   * directories copied from the Docker directory of a VM where the desired
   * Docker images have already been pulled. Any images pulled that are not
   * cached will be stored on the first cache disk instead of the boot disk.
   * Only a single image is supported.
   * </pre>
   *
   * <code>repeated string docker_cache_images = 13;</code>
   *
   * @return A list containing the dockerCacheImages.
   */
  java.util.List<java.lang.String> getDockerCacheImagesList();
  /**
   *
   *
   * <pre>
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be
   * mounted into the Docker folder in a way that the images present in the
   * cache will not need to be pulled. The digests of the cached images must
   * match those of the tags used or the latest version will still be pulled.
   * The root directory of the ext4 image must contain `image` and `overlay2`
   * directories copied from the Docker directory of a VM where the desired
   * Docker images have already been pulled. Any images pulled that are not
   * cached will be stored on the first cache disk instead of the boot disk.
   * Only a single image is supported.
   * </pre>
   *
   * <code>repeated string docker_cache_images = 13;</code>
   *
   * @return The count of dockerCacheImages.
   */
  int getDockerCacheImagesCount();
  /**
   *
   *
   * <pre>
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be
   * mounted into the Docker folder in a way that the images present in the
   * cache will not need to be pulled. The digests of the cached images must
   * match those of the tags used or the latest version will still be pulled.
   * The root directory of the ext4 image must contain `image` and `overlay2`
   * directories copied from the Docker directory of a VM where the desired
   * Docker images have already been pulled. Any images pulled that are not
   * cached will be stored on the first cache disk instead of the boot disk.
   * Only a single image is supported.
   * </pre>
   *
   * <code>repeated string docker_cache_images = 13;</code>
   *
   * @param index The index of the element to return.
   * @return The dockerCacheImages at the given index.
   */
  java.lang.String getDockerCacheImages(int index);
  /**
   *
   *
   * <pre>
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be
   * mounted into the Docker folder in a way that the images present in the
   * cache will not need to be pulled. The digests of the cached images must
   * match those of the tags used or the latest version will still be pulled.
   * The root directory of the ext4 image must contain `image` and `overlay2`
   * directories copied from the Docker directory of a VM where the desired
   * Docker images have already been pulled. Any images pulled that are not
   * cached will be stored on the first cache disk instead of the boot disk.
   * Only a single image is supported.
   * </pre>
   *
   * <code>repeated string docker_cache_images = 13;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dockerCacheImages at the given index.
   */
  com.google.protobuf.ByteString getDockerCacheImagesBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of disks and other storage to create or attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Volume volumes = 14;</code>
   */
  java.util.List<com.google.cloud.lifesciences.v2beta.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * The list of disks and other storage to create or attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Volume volumes = 14;</code>
   */
  com.google.cloud.lifesciences.v2beta.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * The list of disks and other storage to create or attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Volume volumes = 14;</code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * The list of disks and other storage to create or attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Volume volumes = 14;</code>
   */
  java.util.List<? extends com.google.cloud.lifesciences.v2beta.VolumeOrBuilder>
      getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of disks and other storage to create or attach to the VM.
   *
   * Specify either the `volumes[]` field or the `disks[]` field, but not both.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Volume volumes = 14;</code>
   */
  com.google.cloud.lifesciences.v2beta.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If specified, the VM will only be allocated inside the matching
   * reservation. It will fail if the VM parameters don't match the reservation.
   * </pre>
   *
   * <code>string reservation = 15;</code>
   *
   * @return The reservation.
   */
  java.lang.String getReservation();
  /**
   *
   *
   * <pre>
   * If specified, the VM will only be allocated inside the matching
   * reservation. It will fail if the VM parameters don't match the reservation.
   * </pre>
   *
   * <code>string reservation = 15;</code>
   *
   * @return The bytes for reservation.
   */
  com.google.protobuf.ByteString getReservationBytes();
}
