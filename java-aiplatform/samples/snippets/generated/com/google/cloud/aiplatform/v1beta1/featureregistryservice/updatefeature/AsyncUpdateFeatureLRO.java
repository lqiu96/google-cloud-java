/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_FeatureRegistryService_UpdateFeature_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.Feature;
import com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceClient;
import com.google.cloud.aiplatform.v1beta1.UpdateFeatureOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateFeatureRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateFeatureLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateFeatureLRO();
  }

  public static void asyncUpdateFeatureLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FeatureRegistryServiceClient featureRegistryServiceClient =
        FeatureRegistryServiceClient.create()) {
      UpdateFeatureRequest request =
          UpdateFeatureRequest.newBuilder()
              .setFeature(Feature.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      OperationFuture<Feature, UpdateFeatureOperationMetadata> future =
          featureRegistryServiceClient.updateFeatureOperationCallable().futureCall(request);
      // Do something.
      Feature response = future.get();
    }
  }
}
// [END aiplatform_v1beta1_generated_FeatureRegistryService_UpdateFeature_LRO_async]
