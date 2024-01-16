// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Terminal node of a simple `(a|b|c)` block.
 */
public class BlockEndState : ATNState() {
  public var startState: BlockStartState? = null

  override val stateType: Int =
    BLOCK_END
}
