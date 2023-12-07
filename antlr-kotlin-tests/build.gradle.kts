import com.strumenta.kotlinmultiplatform.gradle.ext.targetsNative
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
  id("strumenta.multiplatform")
  antlr
}

strumentaMultiplatform {
  applyJvm()
  applyJs()

  // Opting-in for native targets should be explicit,
  // as it makes the build and test process slower.
  //
  // Opt in by setting 'target.is.native = true' in gradle.properties
  if (targetsNative()) {
    applyNative()
  }
}

kotlin {
  // We are ok to publish this module, but sources are unnecessary
  withSourcesJar(publish = false)

  sourceSets {
    commonMain {
      dependencies {
        implementation(projects.antlrKotlinRuntime)
      }
    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
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

    val pkgName = "com.strumenta.antlrkotlin.tests.generated"
    arguments = listOf(
      "-Dlanguage=Kotlin",    // We want to generate Kotlin sources
      "-visitor",             // We want visitors alongside listeners
      "-package", pkgName,    // We want the generated sources to have this package declared
      "-encoding", "UTF-8",   // We want the generated sources to be encoded in UTF-8
    )

    val outDir = "src/commonMain/kotlin/${pkgName.replace(".", "/")}"
    outputDirectory = layout.projectDirectory.dir(outDir).asFile
  }

  withType<KotlinCompile<*>> {
    dependsOn(generateKotlinGrammarSource)
  }
}