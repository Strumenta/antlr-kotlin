package com.strumenta.kotlinmultiplatform.gradle.plugins

import com.strumenta.kotlinmultiplatform.gradle.ext.javaExtension
import com.strumenta.kotlinmultiplatform.gradle.ext.kotlinJvmExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

/**
 * Applies and set up the Kotlin JVM Gradle plugin.
 */
class StrumentaJvmLibraryModulePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    // Apply the required plugins
    project.apply<KotlinPluginWrapper>()
    project.apply {
      plugin("org.gradle.java-library")
    }

    // General Kotlin configuration
    val kotlin = project.kotlinJvmExtension
    kotlin.explicitApiWarning()
    kotlin.compilerOptions {
      apiVersion.set(KotlinVersion.KOTLIN_1_9)
      languageVersion.set(KotlinVersion.KOTLIN_1_9)

      jvmTarget.set(JvmTarget.JVM_1_8)
      freeCompilerArgs.add("-Xjvm-default=all")
    }

    val java = project.javaExtension
    java.sourceCompatibility = JavaVersion.VERSION_1_8
    java.targetCompatibility = JavaVersion.VERSION_1_8
    java.withSourcesJar()
  }
}
