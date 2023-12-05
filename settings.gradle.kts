enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

rootProject.name = "antlr-kotlin"

include("antlr-kotlin-runtime")
include("antlr-kotlin-target")
include("antlr-kotlin-tests")
