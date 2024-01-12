@file:Suppress("UnstableApiUsage")

import com.strumenta.antlrkotlin.gradle.ext.setupPom
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("strumenta.jvm.library")
  id("org.jetbrains.dokka")
}

dependencies {
  api(libs.antlr4)
}

mavenPublishing {
  coordinates(
    groupId = project.group as String,
    artifactId = project.name,
    version = project.version as String,
  )

  setupPom(project, projectDescription = "Kotlin target for ANTLR")
  publishToMavenCentral(SonatypeHost.DEFAULT, true)
  signAllPublications()
}

tasks {
  findByName("generateMetadataFileForMavenPublication")?.dependsOn("kotlinSourcesJar")
}
