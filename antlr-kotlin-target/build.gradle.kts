import com.strumenta.kotlinmultiplatform.gradle.ext.addPublication
import com.strumenta.kotlinmultiplatform.gradle.ext.addSonatypeRepository
import com.strumenta.kotlinmultiplatform.gradle.ext.releaseBuild

plugins {
  id("strumenta.jvm.library")
  id("maven-publish")
  id("signing")
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