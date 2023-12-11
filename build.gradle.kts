plugins {
  id("net.researchgate.release") version "3.0.2"
}

allprojects {
  group = "com.strumenta"

  repositories {
    mavenCentral()
  }

}

subprojects {

  tasks.withType<Test>().all {
    testLogging {
      showStandardStreams = true
      showExceptions = true
      exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
  }

}

tasks {
  wrapper {
    gradleVersion = "8.3"
    distributionType = Wrapper.DistributionType.ALL
  }
}

release {
  buildTasks.set(listOf(":antlr-kotlin-runtime:publishAllPublicationsToMavenCentralRepository", ":antlr-kotlin-target:publishAllPublicationsToMavenCentralRepository"))
  git {
    requireBranch.set("")
    pushToRemote.set("origin")
  }
}
