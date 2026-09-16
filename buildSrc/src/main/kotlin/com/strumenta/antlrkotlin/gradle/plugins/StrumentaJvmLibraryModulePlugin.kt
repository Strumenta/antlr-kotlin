package com.strumenta.antlrkotlin.gradle.plugins

import com.strumenta.antlrkotlin.gradle.ext.javaExtension
import com.strumenta.antlrkotlin.gradle.ext.kotlinJvmExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.jetbrains.kotlin.gradle.dsl.JvmDefaultMode
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

/**
 * Applies and set up the Kotlin JVM Gradle plugin.
 */
class StrumentaJvmLibraryModulePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    // Apply the required plugins
    project.apply<KotlinPluginWrapper>()

    // General Kotlin configuration
    val kotlin = project.kotlinJvmExtension
    kotlin.explicitApiWarning()
    kotlin.compilerOptions {
      apiVersion.set(KOTLIN_VERSION)
      languageVersion.set(KOTLIN_VERSION)

      jvmTarget.set(JVM_VERSION)
      jvmDefault.set(JvmDefaultMode.NO_COMPATIBILITY)
    }

    val java = project.javaExtension
    java.sourceCompatibility = JAVA_VERSION
    java.targetCompatibility = JAVA_VERSION
  }
}
