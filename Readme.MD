# ANTLR Kotlin

[![Build Status](https://travis-ci.org/ftomassetti/antlr-kotlin.svg?branch=master)](https://travis-ci.org/ftomassetti/antlr-kotlin)

This project contains everything is needed to support Kotlin as a target for ANTLR. 
It means:

* the **Kotlin target**: this is a plugin for the ANTLR code generator that produces lexers, parsers, and listeners
* the **Kotlin runtime library**: this is a multi-platform library needed to run the lexers and parsers

## Status

The project is very recent and it should be considered experimental

## The Kotlin target

The Kotlin target is a plugin for the ANTLR generator. It should be added to the classpath used to run the ANTLR Tool.
You will simply need to specify the language to be `Kotlin`.

## The Kotlin runtime library

This project contains the runtime for the Kotlin target of ANTLR. This runtime is built as a multi-platform project
running on the JVM and the JS platforms. We plan to extend it to support other platforms when the multi-platform Kotlin
projects will permit so.

You will need to use ANTLR 4 and the Kotlin target to generate ANTLR Lexers and Parsers in Kotlin. 
