// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql.util

/**
 * Indicates how a statement ends.
 */
public enum class StatementFinishState {
  /**
   * Ends with a delimiter.
   */
  Complete,

  /**
   * Ends with an open comment (multiline or single line w/o following new line).
   */
  OpenComment,

  /**
   * A string (single, double or backtick quoted) wasn't closed.
   */
  OpenString,

  /**
   * The delimiter is missing.
   */
  NoDelimiter,

  /**
   * The statement changes the delimiter.
   */
  DelimiterChange,
}
