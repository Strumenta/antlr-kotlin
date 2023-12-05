@file:Suppress("UnstableApiUsage")

import com.strumenta.kotlinmultiplatform.gradle.targetsNative
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  kotlin("multiplatform")
}

kotlin {
  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  compilerOptions {
    apiVersion = KotlinVersion.KOTLIN_1_9
    languageVersion = KotlinVersion.KOTLIN_1_9
    freeCompilerArgs.add("-Xexpect-actual-classes")
  }

  jvm {
    compilations.configureEach {
      compilerOptions.configure {
        jvmTarget.set(JvmTarget.JVM_1_8)
        freeCompilerArgs.addAll(
          "-Xjvm-default=all",
          // TODO(Edoardo): verify the performance impact of null assertions
          // "-Xno-call-assertions",
          // "-Xno-receiver-assertions",
          // "-Xno-param-assertions",
        )
      }
    }

    testRuns.configureEach {
      executionTask.configure {
        useJUnitPlatform()
        filter.isFailOnNoMatchingTests = true
      }
    }
  }

  js {
    nodejs()
    browser()
  }

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    // Tier 1
    macosX64()
    macosArm64()

    // Tier 2
    linuxX64()
    linuxArm64()

    // Tier 3
    mingwX64()
  }

  sourceSets {
    commonMain {
      dependencies {
        implementation(kotlin("reflect"))
      }
    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
      }
    }
  }
}
