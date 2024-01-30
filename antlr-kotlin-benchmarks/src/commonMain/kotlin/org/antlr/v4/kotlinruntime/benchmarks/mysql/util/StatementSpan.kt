// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql.util

public data class StatementSpan(
  /**
   * The delimiter with which this statement ended or undefined if no delimiter was found.
   */
  val delimiter: String? = null,

  /**
   * Start and length of the entire statement, including leading whitespaces.
   */
  val span: TextSpan,

  /**
   * TODO
   */
  val contentStart: Int,

  /**
   * The offset where non-whitespace content starts.
   */
  val state: StatementFinishState,
)
