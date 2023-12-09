# ANTLR Kotlin

[![Build Status](https://github.com/Strumenta/antlr-kotlin/workflows/Build/badge.svg)](https://github.com/Strumenta/antlr-kotlin/actions)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.strumenta/antlr-kotlin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.strumenta/antlr-kotlin)
[![License Apache-2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](LICENSE)

This project contains everything needed to support Kotlin as a target for ANTLR.

- **Kotlin Target**: a plugin for the ANTLR code generator that produces lexers, parsers, listeners, and visitors
- **Kotlin Runtime**: a multi-platform library needed by the generated lexers and parsers

This being a 100% multi-platform project, the code written using the Kotlin target for ANTLR
will run on the JVM (including Android), in the browser, in Node.js, and natively on Mac, Windows, and Linux.

Want to start experimenting immediately? See [Gradle Setup](#gradle-setup).

## Status

The project should be considered experimental. Several parsers have been implemented and work so far using this target
but not all the features are complete and well tested.

The runtime and target's template are up-to-date with mainstream commit: `master/e9df464`  
The following are files that need further verification:

- Parser
- ATNDeserializer
- ATNSerializer
- IntegerList
- InterpreterDataReader
- tree/xpath/**

## Kotlin Target

The Kotlin target is a plugin for the ANTLR generator.

It should be added to the classpath used to run the ANTLR Tool.  
You will simply need to specify the language to be `Kotlin`.

## Kotlin Runtime

The Kotlin runtime for the Kotlin target is derived from the Java runtime, and is built
as a multi-platform project running on JVM, JS, and some of the Kotlin Native platforms.

:warning: The Kotlin Native runtime is **not** thread safe

## Gradle Setup

To start using ANTLR Kotlin:

1. Add the `mavenCentral` repository to the list of repositories in your build script.  
   This is required as artifacts are pushed to Maven Central.

   ```kotlin
   repositories {
     ...
     mavenCentral()
   }
   ```

2. Add the Gradle `antlr` plugin to the list of plugins in your build script.

   ```kotlin
   plugins {
     ...
     antlr
   }
   ```

3. Add ANTLR 4 and the ANTLR Kotlin target to the classpath of the Gradle ANTLR plugin.
   At the top level of your build script, add:

   ```kotlin
   dependencies {
     // The ANTLR 4 dependency, which instructs the Gradle ANTLR plugin
     // to use ANTLR 4 instead of the bundled version
     antlr("org.antlr:antlr4:4.13.1")
   
     // The ANTLR Kotlin target
     antlr("com.strumenta:antlr-kotlin-target:$antlrKotlinVersion")
   }
   ```
   For more details, check out [Gradle - The ANTLR Plugin](https://docs.gradle.org/current/userguide/antlr_plugin.html).

4. Add the ANTLR Kotlin Runtime to the list of dependencies.  
   If you are working in a multiplatform project, add it to the common source set.

   ```kotlin
   kotlin {
     sourceSets {
       commonMain {
         dependencies {
           ...
           implementation("com.strumenta:antlr-kotlin-runtime:$antlrKotlinVersion")
         }
       }
     }
   }
   ```

5. Disable the default ANTLR grammar generation task.  
   This is set up by the Gradle ANTLR plugin, but it does not suit our needs.

   ```kotlin
   tasks {
     generateGrammarSource {
       // The default task is set up considering a Java source set,
       // which we might not have in a Kotlin project. 
       // Using it is messier than simply registering a new task
       enabled = false
     }
   }
   ```

6. Create the ANTLR Kotlin grammar generation task.

   ```kotlin
    val generateKotlinGrammarSource = tasks.register<AntlrTask>("generateKotlinGrammarSource") {
        dependsOn("cleanGenerateKotlinGrammarSource")
    
        // ANTLR .g4 files are under {example-project}/antlr
        setSource(layout.projectDirectory.dir("src/main/antlr"))
    
        val pkgName = "com.strumenta.antlrkotlin.parsers.generated"
        arguments = listOf(
            "-Dlanguage=Kotlin",    // We want to generate Kotlin sources
            "-visitor",             // We want visitors alongside listeners
            "-package", pkgName,    // We want the generated sources to have this package declared
            "-encoding", "UTF-8",   // We want the generated sources to be encoded in UTF-8
        )
    
        // Generated files are outputted inside build/
        val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
        outputDirectory = layout.buildDirectory.get().dir(outDir).asFile
    
        sourceSets.getByName("main") {
            java.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
        }
    }
   ```

   Depending on `cleanGenerateKotlinGrammarSource` ensures the `.tokens` files are always fresh,
   and we do not end up with out-of-sync lexers and parsers.

7. Optionally instruct the Kotlin compilation tasks to depend on the grammar generation.

   ```kotlin
   withType<KotlinCompile<*>> {
     dependsOn(generateKotlinGrammarSource)
   }

   ```

## Maven Central Publication

Publication can be performed running:

```
./gradlew publishAllPublicationsToMavenCentralRepository --no-configuration-cache
```

However, it is recommended to use the releases plugin and run:

```
./gradlew release 
```

## Contributors

- Edoardo Luppi ([@lppedd](https://github.com/lppedd))
