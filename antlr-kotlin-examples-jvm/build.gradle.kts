// a small hack: the variable must be named like the property
// jitpack will pass -Pversion=..., so `val version` is required here.
val version: String by project
// we create an alias here...
val versionProperty = version
// do the same for group
val group: String by project
val groupProperty = if (group.endsWith(".antlr-kotlin")) {
    group
} else {
    // just another jitpack hack
    "$group.antlr-kotlin"
}

//val antlrVersion = "4.7.1"
val antlrKotlinVersion = versionProperty
// you can also use a jitpack version:
//val antlrKotlinVersion = "86a86f1968"

buildscript {
    // we have to re-declare this here :-(

    // a small hack: the variable must be named like the property
    // jitpack will pass -Pversion=..., so `val version` is required here.
    val version: String by project
    // we create an alias here...
    val versionProperty = version
    // do the same for group
    val group: String by project
    val groupProperty = if (group.endsWith(".antlr-kotlin")) {
        group
    } else {
        // just another jitpack hack
        "$group.antlr-kotlin"
    }

    val antlrKotlinVersion = versionProperty
    // you can also use a jitpack version (we have to re-declare this here):
    //val antlrKotlinVersion = "86a86f1968"

    dependencies {
        // add the plugin to the classpath
        classpath("$groupProperty:antlr-kotlin-gradle-plugin:$antlrKotlinVersion")
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
    kotlin("jvm") version "1.7.21"
    // do not add the plugin here, it contains only a task
    //id("com.strumenta.antlr-kotlin") version "0.0.5"
}

// in antlr-kotlin-plugin <0.0.5, the configuration was applied by the plugin.
// starting from verison 0.0.5, you have to apply it manually:
tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinGrammarSource") {
    // the classpath used to run antlr code generation
    antlrClasspath = configurations.detachedConfiguration(
            // antlr itself
            // antlr is transitive added by antlr-kotlin-target,
            // add another dependency if you want to choose another antlr4 version (not recommended)
            // project.dependencies.create("org.antlr:antlr4:$antlrVersion"),

            // antlr target, required to create kotlin code
            project.dependencies.create("$groupProperty:antlr-kotlin-target:$antlrKotlinVersion")
    )
    maxHeapSize = "64m"
    packageName = "com.strumenta.antlrkotlin.examples"
    arguments = listOf("-no-visitor", "-no-listener")
    source = project.objects
            .sourceDirectorySet("antlr", "antlr")
            .srcDir("src/main/antlr").apply {
                include("*.g4")
            }
    // outputDirectory is required, put it into the build directory
    // if you do not want to add the generated sources to version control
    //outputDirectory = File("build/generated-src/antlr/main")
    // use this settings if you want to add the generated sources to version control
    outputDirectory = File("src/main/kotlin-antlr")
}

// run generate task before build
// not required if you add the generated sources to version control
// you can call the task manually in this case to update the generated sources
tasks.getByName("compileKotlin").dependsOn("generateKotlinGrammarSource")

// you have to add the generated sources to kotlin compiler source directory list
configure<SourceSetContainer> {
    named("main") {
        withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
            // kotlin.srcDir("build/generated-src/antlr/main")
            kotlin.srcDir("src/main/kotlin-antlr")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    testImplementation(kotlin("test-junit5"))
    // add antlr-kotlin-runtime-jvm
    // otherwise, the generated sources will not compile
    implementation("$groupProperty:antlr-kotlin-runtime-jvm:$antlrKotlinVersion")
}

// to allow -x jsIrBrowserTest -x jsLegacyBrowserTest, see .ci.sh
tasks.register("jsIrBrowserTest")
tasks.register("jsLegacyBrowserTest")
