import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.kotlin.multiplatform)
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
          // TODO: verify the performance impact of null assertions
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
