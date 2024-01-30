enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
  @Suppress("UnstableApiUsage")
  repositories {
    mavenCentral()
  }
}

rootProject.name = "antlr-kotlin"

include("antlr-kotlin-target")
include("antlr-kotlin-runtime")
include("antlr-kotlin-benchmarks")
include("antlr-kotlin-tests")
include("antlr-kotlin-gradle-plugin")
