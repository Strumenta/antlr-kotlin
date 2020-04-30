# ANTLR Kotlin

[![Build Status](https://travis-ci.org/Strumenta/antlr-kotlin.svg?branch=master)](https://travis-ci.org/Strumenta/antlr-kotlin) [![Release](https://jitpack.io/v/com.strumenta/antlr-kotlin.svg)](https://jitpack.io/#com.strumenta/antlr-kotlin)
[![License Apache-2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](LICENSE)

This project contains everything is needed to support Kotlin as a target for ANTLR. 
It means:

* the **Kotlin target**: this is a plugin for the ANTLR code generator that produces lexers, parsers, and listeners
* the **Kotlin runtime library**: this is a multi-platform library needed to run the lexers and parsers

Because we produce multi-platform code and a multi-platform runtime, the code written using the Kotlin target for ANTLR can run both on the JVM, in the browser, and natively on Mac, Windows, and Linux.

## Status

The project should be considered experimental. Several parsers have been implemented and work so far using this target but not all the features are complete and well tested.

## Using ANTLR-Kotlin with Gradle

ANTLR-Kotlin is accessible on Maven & Gradle through Jitpack. In jitpack basically you can use every commit or tag as a version number. You can find recent versions on the [Jitpack page for ANTLR-Kotlin](https://jitpack.io/#com.strumenta/antlr-kotlin).

In older versions of this Plugin (antlr-kotlin-plugin <0.0.5), the configuration was applied by the plugin.
Starting from version 0.0.5, you have to apply the configuration manually:

For an example how to use ANTLR-Kotlin see the [JVM Example Project](antlr-kotlin-examples-jvm/build.gradle.kts).
There is also an [Kotlin Multiplatform Project Example](antlr-kotlin-examples-mpp/build.gradle.kts).

## The Kotlin target

The Kotlin target is a plugin for the ANTLR generator. It should be added to the classpath used to run the ANTLR Tool.
You will simply need to specify the language to be `Kotlin`.

## The Kotlin runtime library

This project contains the runtime for the Kotlin target of ANTLR. This runtime is built as a multi-platform project
running on the JVM, JS, and Kotlin/Native platforms.

You will need to use ANTLR 4 and the Kotlin target to generate ANTLR Lexers and Parsers in Kotlin. 
