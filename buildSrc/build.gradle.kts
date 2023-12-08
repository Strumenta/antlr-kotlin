plugins {
  `kotlin-dsl`
}

dependencies {
  // The Kotlin Gradle Plugin dependency propagates to the entire workspace
  implementation(libs.kotlin.plugin)
  implementation("com.vanniktech:gradle-maven-publish-plugin:0.25.3")
}

gradlePlugin {
  plugins {
    register("strumentaJvmLibrary") {
      id = "strumenta.jvm.library"
      implementationClass = "com.strumenta.kotlinmultiplatform.gradle.plugins.StrumentaJvmLibraryModulePlugin"
    }

    register("strumentaMultiplatform") {
      id = "strumenta.multiplatform"
      implementationClass = "com.strumenta.kotlinmultiplatform.gradle.plugins.StrumentaMultiplatformModulePlugin"
    }
  }
}
