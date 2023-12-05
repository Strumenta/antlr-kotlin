package com.strumenta.kotlinmultiplatform.gradle

import org.gradle.api.Project

/**
 * Returns whether we are building for a release, or not.
 */
fun Project.releaseBuild(): Boolean =
  findProperty("repo.is.release") == "true"

/**
 * Returns the URL of the Maven repository to publish artifacts to,
 * or `null` if none is registered for the given publishing policy (release/snapshot).
 */
fun Project.mavenRepositoryUrl(): String? =
  if (releaseBuild()) {
    findProperty("repo.release.url")?.toString()
  } else {
    findProperty("repo.snapshot.url")?.toString()
  }

/**
 * Returns whether the project should build and test Kotlin Native targets, or not.
 */
fun Project.targetsNative(): Boolean =
  findProperty("target.is.native") == "true"
