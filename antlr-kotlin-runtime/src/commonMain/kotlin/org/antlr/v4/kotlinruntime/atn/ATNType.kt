// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Represents the type of recognizer an ATN applies to.
 *
 * @author Sam Harwell
 */
public enum class ATNType {
  /**
   * A lexer grammar.
   */
  LEXER,

  /**
   * A parser grammar.
   */
  PARSER,
}
