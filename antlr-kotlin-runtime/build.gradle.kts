import com.strumenta.antlrkotlin.gradle.ext.setupPom
import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.Platform
import org.jetbrains.dokka.gradle.DokkaTask

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
    commonTest {
      dependencies {
        implementation(kotlin("test"))
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
