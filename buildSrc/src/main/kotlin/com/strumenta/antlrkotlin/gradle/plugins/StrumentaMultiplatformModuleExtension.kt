package com.strumenta.antlrkotlin.gradle.plugins

import com.strumenta.antlrkotlin.gradle.ext.javaExtension
import com.strumenta.antlrkotlin.gradle.ext.kmpExtension
import com.strumenta.antlrkotlin.gradle.ext.releaseBuild
import org.gradle.api.Action
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import org.gradle.internal.os.OperatingSystem
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

/**
 * @see StrumentaMultiplatformModulePlugin
 */
abstract class StrumentaMultiplatformModuleExtension(private val project: Project) {
  interface JsConfiguration {
    val browser: Property<Boolean>
    val wasm: Property<Boolean>
  }

  interface JvmConfiguration {
    val enableJava: Property<Boolean>
  }

  interface NativeConfiguration {
    val disableUntestable: Property<Boolean>
  }

  @get:Nested
  abstract val jsConfig: JsConfiguration

  @get:Nested
  abstract val jvmConfig: JvmConfiguration

  @get:Nested
  abstract val nativeConfig: NativeConfiguration

  @OptIn(ExperimentalWasmDsl::class)
  fun applyJs(action: Action<JsConfiguration> = Action {}) {
    action.execute(jsConfig)

    val isBrowserEnabled = jsConfig.browser.getOrElse(true)
    val isWasmJsEnabled = jsConfig.wasm.getOrElse(true)

    val kmpExtension = project.kmpExtension
    kmpExtension.js(KotlinJsCompilerType.IR) {
      nodejs {
        testTask {
          useMocha {
            // Override default 2s timeout
            timeout = "30s"
          }

          filter.isFailOnNoMatchingTests = true
        }
      }

      if (isBrowserEnabled) {
        browser {
          testTask {
            useKarma {
              useSourceMapSupport()
              useChromeHeadless()
            }

            filter.isFailOnNoMatchingTests = true
          }
        }
      }
    }

    if (isWasmJsEnabled) {
      kmpExtension.wasmJs {
        nodejs {
          testTask {
            useMocha {
              // Override default 2s timeout
              timeout = "30s"
            }

            filter.isFailOnNoMatchingTests = true
          }
        }

        if (isBrowserEnabled) {
          browser {
            testTask {
              useKarma {
                useSourceMapSupport()
                useChromeHeadless()
              }

              filter.isFailOnNoMatchingTests = true
            }
          }
        }

        // Enable WASM optimizations
        applyBinaryen()
      }

      // Necessary as we are using dependsOn explicitly.
      // See https://kotlinlang.org/docs/multiplatform-hierarchy.html#creating-additional-source-sets
      kmpExtension.applyDefaultHierarchyTemplate()

      val sourceSets = kmpExtension.sourceSets

      // Register a common source set between JS and WASM
      sourceSets.register("jsAndWasmSharedMain") {
        dependsOn(sourceSets.getByName("commonMain"))

        sourceSets.getByName("jsMain").dependsOn(this)
        sourceSets.getByName("wasmJsMain").dependsOn(this)
      }

      // Register a common test source set between JS and WASM
      sourceSets.register("jsAndWasmSharedTest") {
        dependsOn(sourceSets.getByName("commonTest"))

        sourceSets.getByName("jsTest").dependsOn(this)
        sourceSets.getByName("wasmJsTest").dependsOn(this)
      }

      // Disable intermediate source set compilation
      // because we do not need js-wasmJs artifact.
      // This is taken from kotlinx.coroutines#3966
      project.tasks.configureEach {
        if (name == "compileJsAndWasmSharedMainKotlinMetadata") {
          enabled = false
        }
      }
    }
  }

  fun applyJvm(action: Action<JvmConfiguration> = Action {}) {
    action.execute(jvmConfig)

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
          freeCompilerArgs.add("-Xjvm-default=all")

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

  @OptIn(ExperimentalWasmDsl::class)
  fun applyWasi() {
    project.kmpExtension.wasmWasi {
      nodejs {
        testTask {
          useMocha {
            // Override default 2s timeout
            timeout = "30s"
          }

          filter.isFailOnNoMatchingTests = true
        }
      }
    }
  }

  fun applyNative(action: Action<NativeConfiguration> = Action {}) {
    action.execute(nativeConfig)

    val isDevelopment = !project.releaseBuild()
    val hostOs = OperatingSystem.current()

    // Development should enable all targets.
    // Publishing should occur only from a macOS host
    if (isDevelopment || hostOs.isMacOsX) {
      val disableUntestable = nativeConfig.disableUntestable.getOrElse(false)
      with(project.kmpExtension) {
        // Tier 1
        // macOS host only
        macosX64()
        macosArm64()
        iosSimulatorArm64()
        iosX64()

        // Tier 2
        linuxX64()
        linuxArm64()

        // macOS host only
        watchosSimulatorArm64()
        watchosX64()
        watchosArm32()
        watchosArm64()
        tvosSimulatorArm64()
        tvosX64()
        tvosArm64()
        iosArm64()

        // Tier 3
        mingwX64()

        if (!disableUntestable) {
          androidNativeArm32()
          androidNativeArm64()
          androidNativeX86()
          androidNativeX64()

          // macOS host only
          watchosDeviceArm64()

          // Deprecated.
          // Should follow the same route as official Kotlin libraries
          @Suppress("DEPRECATION")
          linuxArm32Hfp()
        }
      }
    }
  }
}
