// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql.util

/**
 * Information about a statement with version information.
 */
public data class VersionCheckResult(
  /**
   * True if the version in the statement matched a given version.
   */
  val matched: Boolean,

  /**
   * The statement with stripped version information.
   */
  val statement: String,

  /**
   * The found version. Can be 0 if the statement contains no version.
   */
  val version: Int,
)
