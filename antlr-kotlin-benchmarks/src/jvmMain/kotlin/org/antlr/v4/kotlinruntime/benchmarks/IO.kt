// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks

import java.lang.invoke.MethodHandles

public actual fun readBenchmarkFile(name: String): String {
  val clazz = MethodHandles.lookup().lookupClass()
  val stream = clazz.getResourceAsStream(name)!!
  return stream.bufferedReader().readText()
}
