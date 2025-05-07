import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import com.strumenta.antlrkotlin.gradle.ext.targetsNative
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

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

tasks {
  // The TSQL grammar test fails because of a compiler error
  // when targeting the JVM (MethodTooLargeException), even
  // if we never test on the JVM.
  // Here we simply filter out the generated TSQL Kotlin files
  // from the compilation phase
  withType<KotlinJvmCompile> {
    exclude("**/test/generated/TSql*.kt")
  }

  val generateKotlinGrammarSource = register<AntlrKotlinTask>("generateKotlinGrammarSource") {
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
