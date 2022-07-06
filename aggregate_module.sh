#!/bin/bash

PREFIX="google-cloud"
VERSION="${1:-1.0.0}"
OUTPUT_FOLDER="aggregate_docs"

#mvn clean install -T 1C -DskipTests -Dcheckstyle.skip -B -q
rm -rf $OUTPUT_FOLDER
mkdir $OUTPUT_FOLDER

echo "Creating docs for version: ${VERSION}"

while IFS= read -r line; do
  module=$line

  echo "Generating docs for ${module}"
  cd $module
  mvn javadoc:aggregate -B -q
  cd ..
  mv output "${OUTPUT_FOLDER}/${module}"
  cd "${OUTPUT_FOLDER}/${module}"

  # Module Name is with the 'java-' portion removed
  # cut separates based on the '-' delimiter and selects from index 2 onwards (1 indexed)
  module_name=$(echo "${module}" | cut -d'-' -f2-)
  # tarball is named {language}-{name}-{version}
  # i.e. java-google-cloud-aiplatform-100.0.0
  docuploader create-metadata \
   --name "${PREFIX}-${module_name}" \
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

