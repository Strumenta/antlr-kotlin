import com.strumenta.kotlinmultiplatform.gradle.ext.*
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode
import org.jetbrains.dokka.gradle.DokkaTask
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("strumenta.multiplatform")
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

strumentaMultiplatform {
  applyJvm()

  if (targetsJS()) {
    applyJs()
  }

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

tasks.withType<DokkaTask>().configureEach {
  dokkaSourceSets {
    configureEach {
      suppress.set(true)
    }

    val commonMain by getting {
      suppress.set(false)
      platform.set(org.jetbrains.dokka.Platform.jvm)
    }
  }
}

mavenPublishing {
  coordinates(project.group as String, project.name, project.version as String)
  setupPom(project, "Runtime for ANTLR Kotlin")

  publishToMavenCentral(SonatypeHost.DEFAULT, true)

  signAllPublications()
}