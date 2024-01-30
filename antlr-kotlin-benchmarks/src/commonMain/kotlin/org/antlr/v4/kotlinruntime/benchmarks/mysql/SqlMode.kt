// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

/**
 * SQL modes that control parsing behavior.
 */
public enum class SqlMode {
  NoMode,
  AnsiQuotes,
  HighNotPrecedence,
  PipesAsConcat,
  IgnoreSpace,
  NoBackslashEscapes,
}
