import com.strumenta.kotlinmultiplatform.gradle.ext.*
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode
import org.jetbrains.dokka.gradle.DokkaTask
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("strumenta.multiplatform")
  id("com.vanniktech.maven.publish")/* version "0.25.3"*/
  id("org.jetbrains.dokka")
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

//signing {
//  setRequired({
//    project.releaseBuild()
//  })
//  sign(publishing.publications)
//}

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

//tasks.withType<AbstractPublishToMaven>().configureEach {
//  val signingTasks = tasks.withType<Sign>()
//  mustRunAfter(signingTasks)
//}
//
//publishing {
//  addSonatypeRepository(project)
//  publications {
//
//    publications.withType<MavenPublication> {
//      //groupId = project.group as String
//      artifact(project.tasks.findByName("javadocJar"))
//      setupPom(project, "Runtime for ANTLR Kotlin")
//    }
//  }
//}

mavenPublishing {
  coordinates(project.group as String, project.name, project.version as String)
  setupPom(project, "Runtime for ANTLR Kotlin")

  publishToMavenCentral(SonatypeHost.DEFAULT)

  signAllPublications()
}