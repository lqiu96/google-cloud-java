#!/bin/bash

VERSION="${1:-1.0.0}"
OUTPUT_FOLDER="aggregate_docs"

mvn clean install -T 1C -DskipTests -Dcheckstyle.skip -B -q
rm -rf $OUTPUT_FOLDER
mkdir $OUTPUT_FOLDER

echo "Creating docs for version: ${VERSION}"

while IFS= read -r line; do
  module=$(echo "${line}" | cut -d "," -f 1)
  bucket_module_name=$(echo "${line}" | cut -d "," -f 2)

  echo "Module: ${module}, Bucket Module Name: ${bucket_module_name}"
  echo "Generating docs for ${module}"
  cd $module
  mvn javadoc:aggregate -B -q
  cd ..
  mv output "${OUTPUT_FOLDER}/${module}"
  cd "${OUTPUT_FOLDER}/${module}"

  docuploader create-metadata \
   --name "${bucket_module_name}" \
   --version "${VERSION}" \
   --xrefs devsite://java/gax \
   --xrefs devsite://java/google-cloud-core \
   --xrefs devsite://java/api-common \
   --xrefs devsite://java/proto-google-common-protos \
   --xrefs devsite://java/google-api-client \
   --xrefs devsite://java/google-http-client \
   --xrefs devsite://java/protobuf \
   --language java
  docuploader upload --staging-bucket docs-staging-v2-dev --destination-prefix docfx .
  cd ../..
  echo "Finished generating docs for ${module}"
done < module_list.txt

