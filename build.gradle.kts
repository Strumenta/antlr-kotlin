import com.strumenta.kotlinmultiplatform.gradle.ext.mavenRepositoryUrl

plugins {
  `maven-publish`
}

allprojects {
  version = "1.0.0-SNAPSHOT"
  group = "com.strumenta.antlr-kotlin"

  repositories {
    mavenCentral()
  }

  apply(plugin = "maven-publish")

  // TODO: setup a real Maven repository to publish to, e.g., Maven Central
  val repoUrl = mavenRepositoryUrl()

  if (repoUrl != null) {
    publishing {
      repositories {
        maven {
          name = "StrumentaAntlrKotlin"
          url = project.uri(repoUrl)

          // TODO: this should be removed once the publication targets
          //  a real public repository
          isAllowInsecureProtocol = true
        }
      }
    }
  }
}

tasks {
  wrapper {
    gradleVersion = "8.3"
    distributionType = Wrapper.DistributionType.ALL
  }
}

tasks {
  create("ciBasicBuild") {
    dependsOn(":antlr-kotlin-runtime:compileKotlinJvm")
    dependsOn(":antlr-kotlin-tests:compileKotlinJvm")
    dependsOn(":antlr-kotlin-target:compileKotlin")
  }

  create("ciTest") {
    dependsOn(":antlr-kotlin-runtime:jvmTest")
    dependsOn(":antlr-kotlin-tests:jvmTest")
    dependsOn(":antlr-kotlin-target:test")
  }
}

