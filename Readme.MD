# ANTLR Kotlin

[![Build Status](https://travis-ci.org/Strumenta/antlr-kotlin.svg?branch=master)](https://travis-ci.org/Strumenta/antlr-kotlin) [![Release](https://jitpack.io/v/com.strumenta/antlr-kotlin.svg)](https://jitpack.io/#com.strumenta/antlr-kotlin)
[![License Apache-2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](LICENSE)

This project contains everything is needed to support Kotlin as a target for ANTLR. 
It means:

* the **Kotlin target**: this is a plugin for the ANTLR code generator that produces lexers, parsers, and listeners
* the **Kotlin runtime library**: this is a multi-platform library needed to run the lexers and parsers

Because we product multi-platform code and a multi-platform runtime the code written using the Kotlin target for ANTLR can run both on the JVM and in the browser. 

## Status

The project should be considered experimental. Several parsers have be implemented and work so far using this target but not all the features are complete and weel tested.

## Using ANTLR-Kotlin with Gradle

ANTLR-Kotlin is accessible on Maven & Gradle through Jitpack. In jitpack basically you can use every commit or tag as a version number. You can find recent versions on the [Jitpack page for ANTLR-Kotlin](https://jitpack.io/#com.strumenta/antlr-kotlin).

```
buildscript {
    ext.kotlin_version = '1.2.60'
    ext.antlrKotlinVersion = "b28896341f" // see notes on jitpack version
    repositories {
        mavenCentral()
        mavenLocal()
        maven { url 'https://jitpack.io' }
    }
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath "com.strumenta.antlr-kotlin:antlr-kotlin-gradle-plugin:${antlrKotlinVersion}"
    }
}

apply plugin: 'kotlin'
apply plugin: 'idea'
apply plugin: 'com.strumenta.antlrkotlin'

repositories {
    mavenCentral()
    mavenLocal()
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile "com.strumenta.antlr-kotlin:antlr-kotlin-runtime-common:${antlrKotlinVersion}"
    compile "com.strumenta.antlr-kotlin:antlr-kotlin-runtime-jvm:${antlrKotlinVersion}"

    compile "org.jetbrains.kotlin:kotlin-stdlib-common:$kotlin_version"
    testCompile "org.jetbrains.kotlin:kotlin-test:$kotlin_version"
    testCompile "org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version"
    testCompile 'junit:junit:4.12'
}

def genFolder = new File( projectDir.path + '/generated-src/antlr/' )

generateKotlinGrammarSource {
    maxHeapSize = "64m"
    arguments += ['-package', 'com.strumenta.financialdsl']
    outputDirectory = new File( genFolder.toString())
}
compileKotlin.dependsOn generateKotlinGrammarSource

sourceSets {
    generated {
        kotlin.srcDir genFolder
    }
}
compileKotlin.source sourceSets.generated.kotlin, sourceSets.main.kotlin

clean{
    delete fileTree(dir: genFolder , include: '*.kt')
    delete fileTree(dir: genFolder , include: '*.interp')
    delete fileTree(dir: genFolder , include: '*.tokens')
}

idea {
    module {
        sourceDirs += genFolder
    }
}
```

## The Kotlin target

The Kotlin target is a plugin for the ANTLR generator. It should be added to the classpath used to run the ANTLR Tool.
You will simply need to specify the language to be `Kotlin`.

## The Kotlin runtime library

This project contains the runtime for the Kotlin target of ANTLR. This runtime is built as a multi-platform project
running on the JVM and the JS platforms. We plan to extend it to support other platforms when the multi-platform Kotlin
projects will permit so.

You will need to use ANTLR 4 and the Kotlin target to generate ANTLR Lexers and Parsers in Kotlin. 
