import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import kotlinx.benchmark.gradle.JvmBenchmarkTarget
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
  id("strumenta.multiplatform")
  alias(libs.plugins.antlr.kotlin)
  alias(libs.plugins.kotlin.allopen)
  alias(libs.plugins.kotlinx.benchmark)
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
  js {
    nodejs()

    // Necessary for using @JsModule
    useCommonJs()
  }

  @OptIn(ExperimentalWasmDsl::class)
  wasmJs {
    nodejs()
  }

  mingwX64 {
    binaries.configureEach {
      // Increase the function's stack size to 2 megabytes
      // See https://youtrack.jetbrains.com/issue/KT-77313
      linkerOpts.add("-Wl,/stack:0x200000")
    }
  }

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

    register("js")
    register("wasmJs")
    register("mingwX64")
  }
}

tasks {
  val generateKotlinGrammarSource = register<AntlrKotlinTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")

    // Only include *.g4 files. This allows tools (e.g., IDE plugins)
    // to generate temporary files inside the base path
    source = fileTree(layout.projectDirectory.dir("antlr")) {
      include("**/*.g4")
    }

    val pkgName = "com.strumenta.antlrkotlin.benchmarks.generated"
    packageName = pkgName

    // We want visitors alongside listeners.
    // The Kotlin target language is implicit, as is the file encoding (UTF-8)
    arguments = listOf("-visitor")

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
