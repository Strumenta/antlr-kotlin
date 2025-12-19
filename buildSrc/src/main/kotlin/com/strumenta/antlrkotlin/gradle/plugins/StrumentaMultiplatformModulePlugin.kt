package com.strumenta.antlrkotlin.gradle.plugins

import com.strumenta.antlrkotlin.gradle.ext.kmpExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.create
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

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

    // Disable a nagging console (fake) error.
    // See https://youtrack.jetbrains.com/issue/KT-52578
    val yarn = project.yarn
    yarn.ignoreScripts = false

    // General Kotlin multiplatform configuration
    val kmp = project.kmpExtension
    kmp.explicitApiWarning()
    kmp.compilerOptions {
      apiVersion.set(KotlinVersion.KOTLIN_2_3)
      languageVersion.set(KotlinVersion.KOTLIN_2_3)
      freeCompilerArgs.add("-Xexpect-actual-classes")
    }
  }
}
