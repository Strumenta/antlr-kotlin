// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("MemberVisibilityCanBePrivate")
public abstract class MySQLBaseRecognizer(input: TokenStream) : Parser(input), MySQLRecognizerCommon {
  public override var serverVersion: Int = 0
  public override var sqlModes: MutableSet<SqlMode> = HashSet()

  /**
   * Determines if the given SQL mode is currently active in the lexer.
   *
   * @param mode The mode to check
   * @return `true` if the mode is one of the currently active modes, `false` otherwise
   */
  public override fun isSqlModeActive(mode: SqlMode): Boolean =
    sqlModes.contains(mode)

  public override fun sqlModeFromString(modes: String): Unit =
    throw UnsupportedOperationException("sqlModeFromString not implemented")
}
