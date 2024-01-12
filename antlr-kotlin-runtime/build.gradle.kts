@file:Suppress("UnstableApiUsage")

import com.strumenta.antlrkotlin.gradle.ext.setupPom
import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.Platform
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask

plugins {
  id("strumenta.multiplatform")
  id("org.jetbrains.dokka")
}

strumentaMultiplatform {
  applyJvm()
  applyJs()
  applyWasi()

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    applyNative()
  }
}

kotlin {
  sourceSets {
    commonMain {
      dependencies {
        implementation(kotlin("reflect"))
      }
    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
      }
    }

    jsMain {
      dependencies {
        implementation(project.dependencies.platform(libs.kotlin.wrappers.bom.get()))
        implementation(libs.kotlin.wrappers.kotlin.js)
      }
    }
  }
}

mavenPublishing {
  coordinates(
    groupId = project.group as String,
    artifactId = project.name,
    version = project.version as String,
  )

  setupPom(project, projectDescription = "Runtime for ANTLR Kotlin")
  publishToMavenCentral(SonatypeHost.DEFAULT, true)
  signAllPublications()
}

tasks.withType<DokkaTask>().configureEach {
  dokkaSourceSets {
    configureEach {
      suppress = true
    }

    val commonMain by getting {
      suppress = false
      platform = Platform.jvm
    }
  }
}

//
// The following is required to support the wasmJs target.
//
// Node.js Canary is set to 21.0.0-v8-canary20231019bd785be450
// as that is the last version to ship Windows binaries too.
//

rootProject.extensions.configure<NodeJsRootExtension> {
  nodeVersion = "21.0.0-v8-canary20231019bd785be450"
  nodeDownloadBaseUrl = "https://nodejs.org/download/v8-canary"
}

rootProject.tasks.withType<KotlinNpmInstallTask>().configureEach {
  val flag = "--ignore-engines"

  if (!args.contains(flag)) {
    args.add(flag)
  }
}
