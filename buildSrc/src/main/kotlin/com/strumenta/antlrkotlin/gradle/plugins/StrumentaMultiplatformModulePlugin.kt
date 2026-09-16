package com.strumenta.antlrkotlin.gradle.plugins

import com.strumenta.antlrkotlin.gradle.ext.kmpExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.create
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper

/**
 * Applies and set up the Kotlin Multiplatform Gradle plugin.
 *
 * @see StrumentaMultiplatformModuleExtension
 */
class StrumentaMultiplatformModulePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    // Apply the required plugins
    project.apply<KotlinMultiplatformPluginWrapper>()

    // Register an extension to allow configuring the plugin using
    //
    // strumentaMultiplatform {
    //   ...
    // }
    project.extensions.create<StrumentaMultiplatformModuleExtension>("strumentaMultiplatform", project)

    // General Kotlin multiplatform configuration
    val kmp = project.kmpExtension
    kmp.explicitApiWarning()
    kmp.compilerOptions {
      apiVersion.set(KOTLIN_VERSION)
      languageVersion.set(KOTLIN_VERSION)
      freeCompilerArgs.add("-Xexpect-actual-classes")
    }
  }
}
