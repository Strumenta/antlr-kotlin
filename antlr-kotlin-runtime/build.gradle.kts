@file:Suppress("UnstableApiUsage")

import com.strumenta.kotlinmultiplatform.gradle.ext.setupPom
import com.strumenta.kotlinmultiplatform.gradle.ext.targetsNative
import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.Platform
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode

plugins {
  id("strumenta.multiplatform")
  id("org.jetbrains.dokka")
}

strumentaMultiplatform {
  applyJvm()
  applyJs()

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    applyNative()
  }
}

kotlin {
  // TODO(Edoardo): remove this line once all the runtime sources are properly formatted
  explicitApi = ExplicitApiMode.Disabled

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
  @Suppress("UnstableApiUsage")
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
