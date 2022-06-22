#!/bin/bash

mkdir -p aggregate-output

while IFS= read -r line; do
  module=$line
  cd $module
  pwd
  # mvn javadoc:aggregate -P docFX
  cd ..
  # mv output aggregate-output
done < module_list.txt

