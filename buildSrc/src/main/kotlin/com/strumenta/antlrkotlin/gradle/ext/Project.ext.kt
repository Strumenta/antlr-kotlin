package com.strumenta.antlrkotlin.gradle.ext

import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

/**
 * Returns the Java project extension.
 */
inline val Project.javaExtension: JavaPluginExtension
  get() = extensions.getByType()

/**
 * Returns the Kotlin JVM project extension.
 */
inline val Project.kotlinJvmExtension: KotlinJvmProjectExtension
  get() = extensions.getByType()

/**
 * Returns the Kotlin Multiplatform project extension.
 */
inline val Project.kmpExtension: KotlinMultiplatformExtension
  get() = extensions.getByType()

/**
 * Returns a project property as a string, or `null` if the property is not found.
 */
fun Project.stringProperty(name: String): String? =
  findProperty(name) as? String

/**
 * Returns a project property as a boolean (`"true" == true`, else `false`).
 */
fun Project.booleanProperty(name: String): Boolean =
  (findProperty(name) as? String)?.trim()?.lowercase() == "true"

/**
 * Returns whether we are building for a release, or not.
 */
fun Project.releaseBuild(): Boolean {
  val isSnapshot = stringProperty("version")?.endsWith("-SNAPSHOT")
    ?: throw IllegalStateException("Project version not specified")

  return !isSnapshot
}

/**
 * Returns the name of the private Maven repository to publish artifacts to,
 * or `null` if none is configured for the given publishing policy (release/snapshot).
 */
fun Project.mavenRepositoryName(): String? {
  val name = if (releaseBuild()) {
    stringProperty("repo.release.name")
  } else {
    stringProperty("repo.snapshot.name")
  }

  return name?.ifBlank { null }
}

/**
 * Returns the URL of the private Maven repository to publish artifacts to,
 * or `null` if none is registered for the given publishing policy (release/snapshot).
 */
fun Project.mavenRepositoryUrl(): String? {
  val url = if (releaseBuild()) {
    stringProperty("repo.release.url")
  } else {
    stringProperty("repo.snapshot.url")
  }

  return url?.ifBlank { null }
}

/**
 * Returns whether the project should build and test Kotlin Native targets, or not.
 */
fun Project.targetsNative(): Boolean =
  booleanProperty("target.is.native")
