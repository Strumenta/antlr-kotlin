import com.strumenta.kotlinmultiplatform.gradle.ext.*
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URI
import java.net.URL
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("strumenta.jvm.library")
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

dependencies {
  api(libs.antlr4)
}

mavenPublishing {
  coordinates(project.group as String, project.name, project.version as String)
  setupPom(project, "Kotlin target for ANTLR")

  publishToMavenCentral(SonatypeHost.DEFAULT, true)

  signAllPublications()
}

tasks {
  findByName("generateMetadataFileForMavenPublication")?.dependsOn("kotlinSourcesJar")
}
