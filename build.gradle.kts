@file:Suppress("UnstableApiUsage")

import com.strumenta.antlrkotlin.gradle.ext.mavenRepositoryName
import com.strumenta.antlrkotlin.gradle.ext.mavenRepositoryUrl
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
  alias(libs.plugins.researchgate.release)
  id("com.vanniktech.maven.publish") apply false
}

allprojects {
  group = "com.strumenta"

  apply(plugin = "com.vanniktech.maven.publish")

  // Allow publishing to a private Maven repository, other than to Maven Central
  val privateRepoUrl = mavenRepositoryUrl()

  if (privateRepoUrl != null) {
    extensions.configure<PublishingExtension>("publishing") {
      repositories {
        maven {
          name = mavenRepositoryName() ?: "PrivateNexus"
          url = uri(privateRepoUrl)
          isAllowInsecureProtocol = true
        }
      }
    }
  }
}

subprojects {
  tasks.withType<Test>().all {
    testLogging {
      showStandardStreams = true
      showExceptions = true
      exceptionFormat = TestExceptionFormat.FULL
    }
  }
}

release {
  buildTasks = listOf(
    ":antlr-kotlin-runtime:publishAllPublicationsToMavenCentralRepository",
    ":antlr-kotlin-target:publishAllPublicationsToMavenCentralRepository",
    ":antlr-kotlin-gradle-plugin:publishPlugins"
  )

  git {
    requireBranch = ""
    pushToRemote = "origin"
  }
}

tasks {
  wrapper {
    distributionType = Wrapper.DistributionType.ALL
  }
}
