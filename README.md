# ANTLR Kotlin

[![Build Status](https://github.com/Strumenta/antlr-kotlin/workflows/Build/badge.svg)](https://github.com/Strumenta/antlr-kotlin/actions)
![Maven Central Version](https://img.shields.io/maven-central/v/com.strumenta/antlr-kotlin-runtime)
[![Kotlin 2.3.0](https://img.shields.io/badge/kotlin-2.3.0-blue.svg?logo=kotlin)](https://kotlinlang.org)
[![License Apache-2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](LICENSE-Apache)
[![License BSD-3](https://img.shields.io/badge/License-BSD_3--Clause-blue.svg)](LICENSE-BSD)

This project contains everything needed to support Kotlin as a target for ANTLR.

- **Kotlin Target**: a plugin for the ANTLR code generator that produces lexers, parsers, listeners, and visitors
- **Kotlin Runtime**: a multiplatform library needed by the generated lexers and parsers

This being a fully multiplatform project, the code written using the Kotlin target for ANTLR
will run on the JVM (including Android), in the browser, in Node.js, and natively on Mac, Windows, and Linux.

Want to start experimenting immediately? See [Gradle Setup](#gradle-setup).

## Status

The runtime and target's template are up-to-date with mainstream commit: `master/e9df464`

## Kotlin Target

The Kotlin target is a plugin for the ANTLR generator.

It should be added to the classpath used to run the ANTLR Tool.

You will need to specify the target language to be `Kotlin` (`-Dlanguage=Kotlin`),
or use the [com.strumenta.antlr-kotlin][1] plugin, which instructs ANTLR automatically.

## Kotlin Runtime

The Kotlin runtime for the Kotlin target is derived from the Java runtime, and is built
as a multiplatform project running on JVM, JS, WebAssembly (including WASI), and Native.

> [!WARNING]  
> The Kotlin ANTLR runtime is **not** thread safe

The supported Native platforms are:

| Tier 1            | Tier 2                | Tier 3             |
|:------------------|:----------------------|:-------------------|
| macosX64          | linuxX64              | androidNativeArm32 |
| macosArm64        | linuxArm64            | androidNativeArm64 |
| iosSimulatorArm64 | watchosSimulatorArm64 | androidNativeX86   |
| iosX64            | watchosX64            | androidNativeX64   |
| iosArm64          | watchosArm32          | watchosDeviceArm64 |
|                   | watchosArm64          | mingwX64           |
|                   | tvosSimulatorArm64    | linuxArm32Hfp      |
|                   | tvosX64               |                    |
|                   | tvosArm64             |                    |

> [!NOTE]  
> The `linuxArm32Hfp` platform is deprecated

## Gradle Setup

To start using ANTLR Kotlin:

1. Add the `mavenCentral` repository to the list of repositories in your build script.
   This is required as artifacts are pushed to Maven Central.

   ```kotlin
   repositories {
     mavenCentral()
   }
   ```

2. Add the ANTLR Gradle plugin for the Kotlin target to the list of plugins in your build script.

   ```kotlin
   plugins {
     id("com.strumenta.antlr-kotlin") version "$antlrKotlinVersion"
   }
   ```

3. Add the ANTLR Kotlin Runtime to the list of dependencies.
   If you are working in a multiplatform project, add it to the common source set.

   ```kotlin
   kotlin {
     sourceSets {
       commonMain {
         dependencies {
           implementation("com.strumenta:antlr-kotlin-runtime:$antlrKotlinVersion")
         }
       }
     }
   }
   ```

4. Register the ANTLR Kotlin grammar generation task.

   ```kotlin
   val generateKotlinGrammarSource = tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
     dependsOn("cleanGenerateKotlinGrammarSource")

     // ANTLR .g4 files are under {example-project}/antlr
     // Only include *.g4 files. This allows tools (e.g., IDE plugins)
     // to generate temporary files inside the base path
     source = fileTree(layout.projectDirectory.dir("antlr")) {
       include("**/*.g4")
     }

     // We want the generated source files to have this package name
     val pkgName = "com.strumenta.antlrkotlin.parsers.generated"
     packageName = pkgName

     // We want visitors alongside listeners.
     // The Kotlin target language is implicit, as is the file encoding (UTF-8)
     arguments = listOf("-visitor")

     // Generated files are outputted inside build/generatedAntlr/{package-name}
     val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
     outputDirectory = layout.buildDirectory.dir(outDir).get().asFile
   }
   ```

   Depending on `cleanGenerateKotlinGrammarSource` ensures the `.tokens` files are always fresh,
   and we do not end up with out-of-sync lexers and parsers.

5. Specify that the output directory of the `generateKotlinGrammarSource` task should be included
   as a source directory in the `commonMain` source set. With Gradle, you can do that by simply
   referencing the task itself. Gradle will automatically infer the associated output directory
   and include it in the source set.

   ```kotlin
   kotlin {
     sourceSets {
       commonMain {
         kotlin {
           srcDir(generateKotlinGrammarSource)
         }
         /* ... */
       }
     }
   }
   ```

## Benchmarks

The [antlr-kotlin-benchmarks](./antlr-kotlin-benchmarks) module contains benchmarking code
for JVM, JS, WebAssembly and Native targets.

The benchmark scenario has been adapted from [antlr4ng][2].  
To run benchmarks, use:
```
./gradlew :antlr-kotlin-benchmarks:jvmBenchmark
```
or
```
./gradlew :antlr-kotlin-benchmarks:jsBenchmark
```
or
```
./gradlew :antlr-kotlin-benchmarks:wasmJsBenchmark
```
or
```
./gradlew :antlr-kotlin-benchmarks:mingwX64Benchmark
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

You can see the complete list on GitHub, but here we list those who contributed ten commits or more.

- Dennis Rieks ([@driekds](https://github.com/drieks))
- Edoardo Luppi ([@lppedd](https://github.com/lppedd))
- [@phyrian](https://github.com/phyrian)
- Patrick Del Conte [@exaV](https://github.com/exaV)

## License

Consumers of this project may choose the most appropriate license: either the Apache License 2.0, or the 3-Clause BSD License.

[1]: https://plugins.gradle.org/plugin/com.strumenta.antlr-kotlin
[2]: https://github.com/mike-lischke/antlr4ng/tree/master/tests/benchmarks
[3]: https://github.com/Kotlin/kotlinx-benchmark
