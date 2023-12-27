@file:Suppress("UnstableApiUsage")

import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
  id("strumenta.multiplatform")
  alias(libs.plugins.kotlinx.resources)
  antlr
}

strumentaMultiplatform {
  applyJvm()
  applyJs {
    // We can't properly run grammar tests in the browser
    browser = false

    // kotlinx-resources does not support wasmJs yet
    wasm = false
  }

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    applyNative {
      // kotlinx-resources does not support some of the Native targets
      disableUntestable = true
    }
  }
}

kotlin {
  sourceSets {
    commonMain {
      kotlin {
        srcDir(layout.buildDirectory.dir("generatedAntlr"))
      }

      dependencies {
        implementation(projects.antlrKotlinRuntime)
      }
    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
        implementation(libs.kotlinx.resources)
      }
    }
  }
}

dependencies {
  antlr(libs.antlr4)
  antlr(projects.antlrKotlinTarget)
}

tasks {
  generateGrammarSource {
    // The default task is set up considering a Java source set,
    // which we do not have. Using it is messier than simply
    // registering a new task
    enabled = false
  }

  val generateKotlinGrammarSource = register<AntlrTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")
    setSource(layout.projectDirectory.dir("antlr"))

    val pkgName = "com.strumenta.antlrkotlin.test.generated"
    arguments = listOf(
      "-Dlanguage=Kotlin",    // We want to generate Kotlin sources
      "-visitor",             // We want visitors alongside listeners
      "-package", pkgName,    // We want the generated sources to have this package declared
      "-encoding", "UTF-8",   // We want the generated sources to be encoded in UTF-8
    )

    // Generated files are outputted inside build/generatedAntlr
    val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
    outputDirectory = layout.buildDirectory.dir(outDir).get().asFile
  }

  withType<KotlinCompile<*>> {
    dependsOn(generateKotlinGrammarSource)
  }

  //
  // The source JAR tasks must explicitly depend on the grammar generation
  // to avoid Gradle complaining and erroring out
  //

  sourcesJar {
    dependsOn(generateKotlinGrammarSource)
  }

  kotlin.targets.configureEach {
    if (publishable) {
      named<Jar>("${targetName}SourcesJar") {
        dependsOn(generateKotlinGrammarSource)
      }
    }
  }
}
