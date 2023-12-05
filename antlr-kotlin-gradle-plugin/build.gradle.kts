import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.kotlin.jvm)
  `java-gradle-plugin`
}

dependencies {
  implementation(libs.antlr4)
  implementation(projects.antlrKotlinTarget)
}

kotlin {
  explicitApiWarning()
  compilerOptions {
    jvmTarget = JvmTarget.JVM_1_8
    apiVersion = KotlinVersion.KOTLIN_1_9
    languageVersion = KotlinVersion.KOTLIN_1_9
  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8

  withSourcesJar()
}

gradlePlugin {
  plugins {
    create("StrumentaAntlr4Kotlin") {
      id = "strumenta.antlr4.kotlin"
      implementationClass = "com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinPlugin"
    }
  }
}
