import com.strumenta.antlrkotlin.gradle.ext.mavenRepositoryName
import com.strumenta.antlrkotlin.gradle.ext.mavenRepositoryUrl
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.yarn.WasmYarnPlugin
import org.jetbrains.kotlin.gradle.targets.wasm.yarn.WasmYarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.web.yarn.BaseYarnRootEnvSpec

plugins {
  alias(libs.plugins.researchgate.release)
  id("com.vanniktech.maven.publish") apply false
}

allprojects {
  group = "com.strumenta"

  apply(plugin = "com.vanniktech.maven.publish")

  // Allow publishing to a private Maven repository, other than to Maven Central
  val privateRepoUrl = mavenRepositoryUrl()

  if (privateRepoUrl != null) {
    extensions.configure<PublishingExtension>("publishing") {
      repositories {
        maven {
          name = mavenRepositoryName() ?: "PrivateNexus"
          url = uri(privateRepoUrl)
          isAllowInsecureProtocol = true
        }
      }
    }
  }
}

subprojects {
  tasks.withType<Test>().all {
    testLogging {
      showStandardStreams = true
      showExceptions = true
      exceptionFormat = TestExceptionFormat.FULL
    }
  }
}

release {
  buildTasks = listOf(
    ":antlr-kotlin-runtime:publishAllPublicationsToMavenCentralRepository",
    ":antlr-kotlin-target:publishAllPublicationsToMavenCentralRepository",
    ":antlr-kotlin-gradle-plugin:publishPlugins",
  )

  git {
    requireBranch = ""
    pushToRemote = "origin"
  }
}

tasks {
  wrapper {
    distributionType = Wrapper.DistributionType.ALL
  }
}

val yarnConfig: BaseYarnRootEnvSpec.() -> Unit = {
  // Use the latest version of Yarn Classic
  version = "1.22.22"

  // Disable a nagging console error.
  // See https://youtrack.jetbrains.com/issue/KT-52578
  ignoreScripts = false
}

// Configure Yarn for all K/JS and K/WASM modules
plugins.withType<YarnPlugin> { the<YarnRootEnvSpec>().apply(yarnConfig) }
plugins.withType<WasmYarnPlugin> { the<WasmYarnRootEnvSpec>().apply(yarnConfig) }
