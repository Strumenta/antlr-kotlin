import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import com.strumenta.antlrkotlin.gradle.ext.targetsNative

plugins {
  id("strumenta.multiplatform")
  alias(libs.plugins.antlr.kotlin)
  alias(libs.plugins.kotlinx.resources)
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

val generateKotlinGrammarSource = tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
  dependsOn("cleanGenerateKotlinGrammarSource")

  // Only include *.g4 files. This allows tools (e.g., IDE plugins)
  // to generate temporary files inside the base path
  source = fileTree(layout.projectDirectory.dir("antlr")) {
    include("**/*.g4")
  }

  val pkgName = "com.strumenta.antlrkotlin.test.generated"
  packageName = pkgName

  // We want visitors alongside listeners.
  // The Kotlin target language is implicit, as is the file encoding (UTF-8)
  arguments = listOf("-visitor")

  // Generated files are outputted inside build/generatedAntlr
  val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
  outputDirectory = layout.buildDirectory.dir(outDir).get().asFile
}

kotlin {
  sourceSets {
    commonMain {
      kotlin {
        srcDir(generateKotlinGrammarSource)
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
