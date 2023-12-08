import com.strumenta.kotlinmultiplatform.gradle.ext.*
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URI
import java.net.URL
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("strumenta.jvm.library")
//  id("maven-publish")
//  id("signing")
  id("com.vanniktech.maven.publish") /*version "0.25.3"*/
  id("org.jetbrains.dokka")
}

dependencies {
  api(libs.antlr4)
}

//publishing {
//  addSonatypeRepository(project)
//  publications {
//
//    create<MavenPublication>("antlrKotlinTarget") {
//      from(project.components.findByName("java"))
//      groupId = project.group as String
//      artifactId = project.name
//      artifact(project.tasks.findByName("javadocJar"))
//      setupPom(project, "Kotlin target for ANTLR")
//    }
//  }
//}
//
//signing {
//  setRequired {
//    project.releaseBuild()
//  }
//  sign(publishing.publications)
//}

mavenPublishing {
  coordinates(project.group as String, project.name, project.version as String)
  setupPom(project, "Kotlin target for ANTLR")

  publishToMavenCentral(SonatypeHost.DEFAULT)

  signAllPublications()
}