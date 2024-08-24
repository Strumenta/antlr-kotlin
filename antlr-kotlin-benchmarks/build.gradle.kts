@file:Suppress("UnstableApiUsage")

import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import kotlinx.benchmark.gradle.JvmBenchmarkTarget
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
  id("strumenta.multiplatform")
  alias(libs.plugins.kotlin.allopen)
  alias(libs.plugins.kotlinx.benchmark)
  antlr
}

strumentaMultiplatform {
  applyJvm()
  applyJs {
    // We cannot properly run benchmarks in the browser
    browser = false

    // Benchmarks need quite some time to complete
    testsTimeout = 360
  }

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    applyNative {
      disableUntestable = true

      // We want to benchmark a release binary, not a debug one
      enableOptimizationInTests = true
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
        implementation(libs.kotlinx.benchmark)
      }
    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
      }
    }

    jsMain {
      dependencies {
        implementation(project.dependencies.platform(libs.kotlin.wrappers.bom.get()))
        implementation(libs.kotlin.wrappers.kotlin.js)
        implementation(libs.kotlin.wrappers.kotlin.node)
      }
    }

    nativeMain {
      dependencies {
        implementation(libs.kotlinx.io.core)
      }
    }
  }
}

allOpen {
  annotation("org.openjdk.jmh.annotations.State")
}

benchmark {
  targets {
    register("jvm") {
      this as JvmBenchmarkTarget
      jmhVersion = "1.37"
    }

    // Blocked by https://github.com/Kotlin/kotlinx-benchmark/issues/185
    // register("js")
    // register("wasmJs")
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

    // Only include *.g4 files. This allows tools (e.g., IDE plugins)
    // to generate temporary files inside the base path
    source = fileTree(layout.projectDirectory.dir("antlr")) {
      include("**/*.g4")
    }

    val pkgName = "com.strumenta.antlrkotlin.benchmarks.generated"
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

  withType<KotlinCompilationTask<*>> {
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
