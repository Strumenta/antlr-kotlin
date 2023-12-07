enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
  val dokkaVersion: String by settings

  repositories {
    mavenCentral()
    gradlePluginPortal()
  }

  plugins {
    id("org.jetbrains.dokka") version dokkaVersion
  }
}

rootProject.name = "antlr-kotlin"

include("antlr-kotlin-runtime")
include("antlr-kotlin-target")
include("antlr-kotlin-tests")
