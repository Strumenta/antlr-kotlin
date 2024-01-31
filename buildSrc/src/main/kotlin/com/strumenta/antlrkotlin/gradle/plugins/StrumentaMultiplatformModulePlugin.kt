package com.strumenta.antlrkotlin.gradle.plugins

import com.strumenta.antlrkotlin.gradle.ext.kmpExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask
import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

/**
 * Applies and set up the Kotlin Multiplatform Gradle plugin.
 *
 * @see StrumentaMultiplatformModuleExtension
 */
class StrumentaMultiplatformModulePlugin : Plugin<Project> {
  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  override fun apply(project: Project) {
    // Apply the required plugins
    project.apply<KotlinMultiplatformPluginWrapper>()

    // Register an extension to allow configuring the plugin using
    //
    // strumentaMultiplatform {
    //   ...
    // }
    project.extensions.create<StrumentaMultiplatformModuleExtension>("strumentaMultiplatform", project)

    // Disable a nagging console (fake) error.
    // See https://youtrack.jetbrains.com/issue/KT-52578
    val yarn = project.yarn
    yarn.ignoreScripts = false

    // General Kotlin multiplatform configuration
    val kmp = project.kmpExtension
    kmp.explicitApiWarning()
    kmp.compilerOptions {
      apiVersion.set(KotlinVersion.KOTLIN_1_9)
      languageVersion.set(KotlinVersion.KOTLIN_1_9)
      freeCompilerArgs.add("-Xexpect-actual-classes")
    }

    // The following is required to support the wasmJs target.
    //
    // Node.js Canary is set to 21.0.0-v8-canary20231019bd785be450
    // as that is the last version to ship Windows binaries too.
    project.rootProject.extensions.configure<NodeJsRootExtension> {
      nodeVersion = "21.0.0-v8-canary20231019bd785be450"
      nodeDownloadBaseUrl = "https://nodejs.org/download/v8-canary"
    }

    project.rootProject.tasks.withType<KotlinNpmInstallTask>().configureEach {
      val flag = "--ignore-engines"

      if (!args.contains(flag)) {
        args.add(flag)
      }
    }
  }
}
