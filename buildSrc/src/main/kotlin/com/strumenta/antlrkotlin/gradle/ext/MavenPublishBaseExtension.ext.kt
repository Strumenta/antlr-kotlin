package com.strumenta.antlrkotlin.gradle.ext

import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.gradle.api.Project

@Suppress("UnstableApiUsage")
fun MavenPublishBaseExtension.setupPom(project: Project, projectDescription: String) {
  pom {
    name.set(project.name)
    description.set(projectDescription)
    url.set("https://github.com/Strumenta/antlr-kotlin")

    scm {
      connection.set("scm:git:https://github.com/Strumenta/antlr-kotlin.git")
      developerConnection.set("scm:git:git@github.com:Strumenta/antlr-kotlin.git")
      url.set("https://github.com/Strumenta/antlr-kotlin.git")
    }

    licenses {
      license {
        name.set("Apache License V2.0")
        url.set("https://www.apache.org/licenses/LICENSE-2.0")
        distribution.set("repo")
      }
    }

    // The developers entry is strictly required by Maven Central
    developers {
      developer {
        id.set("ftomassetti")
        name.set("Federico Tomassetti")
        email.set("federico@strumenta.com")
      }
      developer {
        id.set("lppedd")
        name.set("Edoardo Luppi")
        email.set("lp.edoardo@gmail.com")
      }
    }
  }
}
