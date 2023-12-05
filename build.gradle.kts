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

  publishing {
    repositories {
      maven {
        val repoUrl = project.property("repository.snapshot.url") as String
        name = "AntlrKotlin"
        url = project.uri(repoUrl)
        isAllowInsecureProtocol = true
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
