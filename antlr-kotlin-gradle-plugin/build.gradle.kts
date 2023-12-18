@file:Suppress("UnstableApiUsage")

plugins {
  id("strumenta.gradle.plugin")
}

dependencies {
  implementation(libs.antlr4)
  implementation(projects.antlrKotlinTarget)
}

gradlePlugin {
  website = "https://github.com/Strumenta/antlr-kotlin"
  vcsUrl = "https://github.com/Strumenta/antlr-kotlin"

  plugins {
    create("StrumentaAntlrKotlin") {
      id = "com.strumenta.antlr-kotlin"
      displayName = "Support ANTLR Kotlin"
      description = "The ANTLR Gradle plugin for the Kotlin target"
      tags = listOf("antlr", "antlr4", "kotlin", "multiplatform")
      implementationClass = "com.strumenta.antlrkotlin.gradle.AntlrKotlinPlugin"
    }
  }
}
