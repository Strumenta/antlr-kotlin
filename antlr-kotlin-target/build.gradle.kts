import com.strumenta.kotlinmultiplatform.gradle.ext.addPublication
import com.strumenta.kotlinmultiplatform.gradle.ext.addSonatypeRepository
import com.strumenta.kotlinmultiplatform.gradle.ext.releaseBuild
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  id("strumenta.jvm.library")
  id("maven-publish")
  id("signing")
  id("org.jetbrains.dokka")
}

dependencies {
  api(libs.antlr4)
}

publishing {
  addSonatypeRepository(project)
  addPublication(project, "Kotlin target for ANTLR")
}

if (project.releaseBuild()) {
  tasks.withType(Sign::class) {
  }
}
