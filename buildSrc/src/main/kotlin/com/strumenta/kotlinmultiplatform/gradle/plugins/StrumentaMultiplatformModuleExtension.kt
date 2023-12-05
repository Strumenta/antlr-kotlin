package com.strumenta.kotlinmultiplatform.gradle.plugins

import com.strumenta.kotlinmultiplatform.gradle.ext.javaExtension
import com.strumenta.kotlinmultiplatform.gradle.ext.kmpExtension
import com.strumenta.kotlinmultiplatform.gradle.ext.releaseBuild
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import org.gradle.internal.os.OperatingSystem
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType

/**
 * @see StrumentaMultiplatformModulePlugin
 */
abstract class StrumentaMultiplatformModuleExtension(private val project: Project) {
  interface JvmConfiguration {
    val enableJava: Property<Boolean>
  }

  @get:Nested
  abstract val jvmConfig: JvmConfiguration

  fun applyJs() {
    project.kmpExtension.js(KotlinJsCompilerType.IR) {
      nodejs {
        testTask {
          filter.isFailOnNoMatchingTests = true
        }
      }

      browser {
        testTask {
          filter.isFailOnNoMatchingTests = true
        }
      }
    }
  }

  fun applyJvm() {
    val isRelease = project.releaseBuild()
    project.kmpExtension.jvm {
      if (jvmConfig.enableJava.getOrElse(false)) {
        withJava()

        val java = project.javaExtension
        java.targetCompatibility = JavaVersion.VERSION_1_8
        java.sourceCompatibility = JavaVersion.VERSION_1_8
      }

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

          if (!isRelease) {
            freeCompilerArgs.add("-Xdebug")
          }
        }
      }

      testRuns.configureEach {
        executionTask.configure {
          useJUnitPlatform()
          filter.isFailOnNoMatchingTests = true
        }
      }
    }
  }

  fun applyNative() {
    val kmpExtension = project.kmpExtension

    if (!project.releaseBuild()) {
      // If were are *not* building for a release it means we are developing.
      // So, just enable everything and let the Kotlin compiler figure out
      // what it can and cannot build

      // Tier 1
      kmpExtension.macosArm64()
      kmpExtension.macosX64()

      // Tier 2
      kmpExtension.linuxArm64()
      kmpExtension.linuxX64()

      // Tier 3
      kmpExtension.mingwX64()
      return
    }

    // When we build to release we also need multiple OSes.
    // If we were to simply enable all targets always, as we do above,
    // we would end up with duplicated publications each time
    val hostOs = OperatingSystem.current()

    when {
      // Note: we never release using Windows!
      //  Windows artifacts are generated through a Linux host
      hostOs.isLinux -> {
        // Tier 2
        kmpExtension.linuxArm64()
        kmpExtension.linuxX64()

        // Tier 3
        kmpExtension.mingwX64()
      }
      hostOs.isMacOsX -> {
        // Tier 1
        kmpExtension.macosArm64()
        kmpExtension.macosX64()
      }
    }
  }
}
