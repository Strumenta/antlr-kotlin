import com.strumenta.kotlinmultiplatform.gradle.ext.*
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  id("strumenta.multiplatform")
  id("maven-publish")
  id("signing")
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

publishing {
  addSonatypeRepository(project)
  addPublication(project, "Runtime for ANTLR Kotlin")
}

signing {
  setRequired({
    project.releaseBuild()
  })
  sign(publishing.publications)
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

tasks {
  val allTasks = getAllTasks(true)[project]!!.toList()
  val publishTasks = allTasks.filter{ it.name.startsWith("publish") && it.name != "publish" }
  val signTasks = allTasks.filter { it.name.startsWith("sign") && it.name != "sign" }
  publishTasks.forEach { pt ->
    pt.dependsOn(signTasks)
  }
}