// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks

// TODO(Edoardo): this should probably be replaced by a Gradle task,
//  but in the meantime it should work consistently
private const val basePath = "../../../../antlr-kotlin-benchmarks/build/processedResources/wasmJs/main"

@Suppress("UNUSED_PARAMETER")
private fun readFileSync(name: String): String =
  js(
    """
    {
      const fs = require('fs');
      return fs.readFileSync(name, {
        encoding: 'utf8'
      });
    }
    """
  )

public actual fun readBenchmarkFile(name: String): String =
  readFileSync("$basePath$name")
