plugins {
  `kotlin-dsl`
}

dependencies {
  // The Kotlin Gradle Plugin dependency propagates to the entire workspace
  implementation(libs.kotlin.plugin)
  implementation(libs.maven.publish.plugin)
  implementation(libs.dokka.plugin)
  implementation(libs.gradle.plugin.publish.plugin)
}

gradlePlugin {
  plugins {
    register("strumentaJvmLibrary") {
      id = "strumenta.jvm.library"
      implementationClass = "com.strumenta.antlrkotlin.gradle.plugins.StrumentaJvmLibraryModulePlugin"
    }

    register("strumentaMultiplatform") {
      id = "strumenta.multiplatform"
      implementationClass = "com.strumenta.antlrkotlin.gradle.plugins.StrumentaMultiplatformModulePlugin"
    }

    register("strumentaGradlePlugin") {
      id = "strumenta.gradle.plugin"
      implementationClass = "com.strumenta.antlrkotlin.gradle.plugins.StrumentaGradlePluginModulePlugin"
    }
  }
}
