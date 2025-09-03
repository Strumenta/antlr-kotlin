import com.strumenta.antlrkotlin.gradle.ext.setupPom
import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import org.jetbrains.dokka.gradle.engine.parameters.KotlinPlatform

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
    groupId = project.group.toString(),
    artifactId = project.name,
    version = project.version.toString(),
  )

  setupPom(project, projectDescription = "Runtime for ANTLR Kotlin")
  publishToMavenCentral(true)
  signAllPublications()
}

dokka {
  dokkaSourceSets {
    configureEach {
      suppress = true
    }

    commonMain.configure {
      suppress = false
      analysisPlatform = KotlinPlatform.JVM
    }
  }
}
