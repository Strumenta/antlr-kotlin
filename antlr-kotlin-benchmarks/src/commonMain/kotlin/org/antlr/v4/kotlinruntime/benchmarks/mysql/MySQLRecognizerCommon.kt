// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

/**
 * Describes functionality found in both lexer and parser classes.
 */
public interface MySQLRecognizerCommon {
  // To parameterize the parsing process
  public val serverVersion: Int
  public val sqlModes: Set<SqlMode>

  // Returns true if the given mode (one of the enums above) is set
  public fun isSqlModeActive(mode: SqlMode): Boolean
  public fun sqlModeFromString(modes: String)
}
