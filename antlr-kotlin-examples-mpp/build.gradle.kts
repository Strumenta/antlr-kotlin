//val antlrVersion = "4.8"
val antlrKotlinVersion = "0.0.6"
// you can also use a jitpack version:
//val antlrKotlinVersion = "86a86f1968"

buildscript {
    // we have to re-declare this here :-(
    val antlrKotlinVersion = "0.0.6"
    // you can also use a jitpack version (we have to re-declare this here):
    //val antlrKotlinVersion = "86a86f1968"

    dependencies {
        // add the plugin to the classpath
        classpath("com.strumenta.antlr-kotlin:antlr-kotlin-gradle-plugin:$antlrKotlinVersion")
    }
}

repositories {
    // used for local development and while building by travis ci and jitpack.io
    mavenLocal()
    // used to download antlr4
    mavenCentral()
    // used to download korio
    jcenter()
    // used to download antlr-kotlin-runtime
    maven("https://jitpack.io")
}

plugins {
    kotlin("multiplatform") version "1.3.70"
    // do not add the plugin here, it contains only a task
    //id("com.strumenta.antlr-kotlin") version "0.0.5"
}

kotlin {
    jvm()

    sourceSets {
        val commonAntlr by creating {
            dependencies {
                api(kotlin("stdlib-common"))
                // add antlr-kotlin-runtime
                // otherwise, the generated sources will not compile
                api("com.strumenta.antlr-kotlin:antlr-kotlin-runtime:$antlrKotlinVersion")
                // antlr-kotlin-runtime-jvm is automatically added as an jvm dependency by gradle
            }
            // you have to add the generated sources the to the kotlin compiler source directory list
            // this is not required if you use src/commonAntlr/kotlin
            // and want to add the generated sources to version control
            kotlin.srcDir("build/generated-src/commonAntlr/kotlin")
        }

        val commonMain by getting {
            dependsOn(commonAntlr)
        }

        val jvmMain by getting {
            dependencies {
                api(kotlin("stdlib-jdk8"))
                api(kotlin("reflect"))
            }
        }

        val jvmTest by getting {
            dependencies {
                api(kotlin("test-junit5"))
            }
        }
    }
}

// in antlr-kotlin-plugin <0.0.5, the configuration was applied by the plugin.
// starting from verison 0.0.5, you have to apply it manually:
tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinCommonGrammarSource") {
    // the classpath used to run antlr code generation
    antlrClasspath = configurations.detachedConfiguration(
            // antlr itself
            // antlr is transitive added by antlr-kotlin-target,
            // add another dependency if you want to choose another antlr4 version (not recommended)
            // project.dependencies.create("org.antlr:antlr4:$antlrVersion"),

            // antlr target, required to create kotlin code
            project.dependencies.create("com.strumenta.antlr-kotlin:antlr-kotlin-target:$antlrKotlinVersion")
    )
    maxHeapSize = "64m"
    packageName = "com.strumenta.antlrkotlin.examples"
    arguments = listOf("-no-visitor", "-no-listener")
    source = project.objects
            .sourceDirectorySet("antlr", "antlr")
            .srcDir("src/commonAntlr/antlr").apply {
                include("*.g4")
            }
    // outputDirectory is required, put it into the build directory
    // if you do not want to add the generated sources to version control
    outputDirectory = File("build/generated-src/commonAntlr/kotlin")
    // use this settings if you want to add the generated sources to version control
    // outputDirectory = File("src/commonAntlr/kotlin")
}

// run generate task before build
// not required if you add the generated sources to version control
// you can call the task manually in this case to update the generated sources
tasks.getByName("compileKotlinJvm").dependsOn("generateKotlinCommonGrammarSource")
