// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.ast

/**
 * The Abstract Syntax Tree will be constituted by instances of [Node].
 */
public interface Node {
  public val parent: Node?
  public val position: Position?
}
