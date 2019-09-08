repositories {
    // used for local development and while building by travis ci and jitpack.io
    mavenLocal()
    // used to download antlr4
    mavenCentral()
    // used to download antlr-kotlin-runtime
    maven("https://jitpack.io")
}

plugins {
    kotlin("jvm") version "1.3.31"
    id("com.strumenta.antlr-kotlin") version "0.0.4"
}

tasks.generateKotlinGrammarSource {
    maxHeapSize = "64m"
    packageName = "com.strumenta.antlrkotlin.examples"
}

/*
// use this settings if you want to add the generated sources to version control
// outputDirectory defaults to build/generated-src/antlr/main
tasks.generateKotlinGrammarSource {
    outputDirectory = File("src/main/kotlin-antlr")
}

// if you change the outputDirectory,
// you have to add it the to the kotlin compiler source directory list
configure<SourceSetContainer> {
    named("main") {
        withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
            kotlin.srcDir("src/main/kotlin-antlr")
        }
    }
}
*/

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    testImplementation(kotlin("test-junit5"))
}
