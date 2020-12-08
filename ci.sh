#!/bin/bash

set -eu

# JS tests will fail because no headless chrome can be found, so we skip tests
extra="-x jsIrBrowserTest -x jsLegacyBrowserTest"
if [ -n "$*" ]; then
  extra="$extra $*"
fi

echo "INFO: $(date) running clean"
./gradlew clean

echo "INFO: $(date) running test"
./gradlew test $extra

echo "INFO: $(date) running publishToMavenLocal"
./gradlew publishToMavenLocal $extra

echo "INFO: $(date) running check for antlr-kotlin-examples-jvm"
cd antlr-kotlin-examples-jvm
../gradlew --info clean check $extra
cd ..

echo "INFO: $(date) running check for antlr-kotlin-examples-mpp"
cd antlr-kotlin-examples-mpp
../gradlew --info clean check $extra
cd ..

#  - cd antlr-kotlin-examples-js && ../gradlew --info clean check $extra && cd ..
