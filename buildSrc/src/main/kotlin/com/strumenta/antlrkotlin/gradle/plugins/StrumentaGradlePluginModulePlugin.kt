package com.strumenta.antlrkotlin.gradle.plugins

import com.gradle.publish.PublishPlugin
import com.strumenta.antlrkotlin.gradle.ext.javaExtension
import com.strumenta.antlrkotlin.gradle.ext.kotlinJvmExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.jetbrains.kotlin.gradle.dsl.JvmDefaultMode
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

/**
 * Applies and set up the necessary dependencies to develop a Gradle Plugin.
 */
class StrumentaGradlePluginModulePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    // Apply the required plugins
    project.apply<KotlinPluginWrapper>()
    project.apply<PublishPlugin>()
    project.apply {
      plugin("org.gradle.java-gradle-plugin")
    }

    // General Kotlin configuration
    val kotlin = project.kotlinJvmExtension
    kotlin.explicitApiWarning()
    kotlin.compilerOptions {
      apiVersion.set(KotlinVersion.KOTLIN_2_3)
      languageVersion.set(KotlinVersion.KOTLIN_2_3)

      jvmTarget.set(JvmTarget.JVM_1_8)
      jvmDefault.set(JvmDefaultMode.NO_COMPATIBILITY)
    }

    val java = project.javaExtension
    java.sourceCompatibility = JavaVersion.VERSION_1_8
    java.targetCompatibility = JavaVersion.VERSION_1_8
  }
}
