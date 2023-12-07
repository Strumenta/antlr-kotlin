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
  tasks.create<Jar>("javadocJar"){
    dependsOn(":${project.name}:dokkaJavadoc")
    archiveClassifier.set("javadoc")
    from("${layout.buildDirectory}/dokka/javadoc")
  }

  tasks.create<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
  }

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
  buildTasks.set(listOf(":antlr-kotlin-runtime:publish", ":antlr-kotlin-target:publish"))
  git {
    requireBranch.set("master")
    pushToRemote.set("origin")
  }
}
