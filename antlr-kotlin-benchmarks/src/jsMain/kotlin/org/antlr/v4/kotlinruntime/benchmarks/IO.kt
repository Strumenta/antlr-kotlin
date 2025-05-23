// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks

// TODO(Edoardo): this should probably be replaced by a Gradle task,
//  but in the meantime it should work consistently
private const val basePath = "../../../../antlr-kotlin-benchmarks/build/processedResources/js/main"

public actual fun readBenchmarkFile(name: String): String {
  val options = js("({ encoding: 'utf8' })")
  return readFileSync("$basePath$name", options)
}
