// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * The start of a regular `(...)` block.
 */
public abstract class BlockStartState : DecisionState() {
  public var endState: BlockEndState? = null
}
