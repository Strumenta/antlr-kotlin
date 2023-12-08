package com.strumenta.kotlinmultiplatform.gradle.ext

import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import java.net.URI

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
fun Project.releaseBuild(): Boolean =
  !(stringProperty("version")?.endsWith("-SNAPSHOT")
    ?: throw IllegalStateException("Project version not specified"))

/**
 * Returns the URL of the Maven repository to publish artifacts to,
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

fun Project.targetsJS(): Boolean =
  booleanProperty("target.is.js")


fun PublishingExtension.addSonatypeRepository(project: Project) {
  repositories {
    maven {
      name = "oss"
      url = URI(project.mavenRepositoryUrl())
      credentials {
        username = project.findProperty("ossrhUsername") as? String ?:  "Unknown user"
        password = project.findProperty("ossrhPassword") as? String ?:  "Unknown password"
      }
    }
  }
}

val Project.publicationName
    get() = project.name.replace("-", "_")

fun MavenPublication.setupPom(project: Project, descriptionValue: String) {
  pom {
    name.set(project.name)
    description.set(descriptionValue)
    version = project.version as String
    packaging = "jar"
    url.set("https://github.com/Strumenta/antlr-kotlin")

    scm {
      connection.set("scm:git:https://github.com/Strumenta/antlr-kotlin.git")
      developerConnection.set("scm:git:git@github.com:Strumenta/antlr-kotlin.git")
      url.set("https://github.com/Strumenta/antlr-kotlin.git")
    }

    licenses {
      license {
        name.set("Apache Licenve V2.0")
        url.set("https://www.apache.org/licenses/LICENSE-2.0")
        distribution.set("repo")
      }
    }

    // The developers entry is strictly required by Maven Central
    developers {
      developer {
        id.set("ftomassetti")
        name.set("Federico Tomassetti")
        email.set("federico@strumenta.com")
      }
      developer {
        id.set("lppedd")
        name.set("Edoardo Luppi")
        email.set("lp.edoardo@gmail.com")
      }
    }
  }
}