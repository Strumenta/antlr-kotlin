val antlrVersion = "4.7.1"
val antlrKotlinVersion = "0.0.5"

buildscript {
    // we have to re-declare this here :-(
    val antlrKotlinVersion = "0.0.5"

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
    // used to download antlr-kotlin-runtime
    maven("https://jitpack.io")
}

plugins {
    kotlin("jvm") version "1.3.50"
    // do not add the plugin here, it contains only a task
    //id("com.strumenta.antlr-kotlin") version "0.0.5"
}

// in antlr-kotlin-plugin <0.0.5, the configuration was applied by the plugin.
// starting from verison 0.0.5, you have to apply it manually:
tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinGrammarSource") {
    // the classpath used to run antlr code generation
    antlrClasspath = configurations.detachedConfiguration(
            // antlr itself
            project.dependencies.create("org.antlr:antlr4:$antlrVersion"),
            // antlr target, required to create kotlin code
            project.dependencies.create("com.strumenta.antlr-kotlin:antlr-kotlin-target:$antlrKotlinVersion")
    )
    maxHeapSize = "64m"
    packageName = "com.strumenta.antlrkotlin.examples"
    arguments = listOf("-no-visitor", "-no-listener")
    source = project.objects
            .sourceDirectorySet("antlr", "antlr")
            .srcDir("src/main/antlr").apply {
                include("*.g4")
            }
    outputDirectory = File("build/generated-src/antlr/main")
    // use this settings if you want to add the generated sources to version control
    // outputDirectory = File("src/main/kotlin-antlr")
}

// run generate task before build
tasks.getByName("compileKotlin").dependsOn("generateKotlinGrammarSource")

// you have to add it the to the kotlin compiler source directory list
configure<SourceSetContainer> {
    named("main") {
        withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
            kotlin.srcDir("build/generated-src/antlr/main")
            // kotlin.srcDir("src/main/kotlin-antlr")
        }
    }
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    testImplementation(kotlin("test-junit5"))
    // add antlr-kotlin-runtime-jvm
    // otherwise, the generated sources will not compile
    compile("com.strumenta.antlr-kotlin:antlr-kotlin-runtime-jvm:$antlrKotlinVersion")
}
