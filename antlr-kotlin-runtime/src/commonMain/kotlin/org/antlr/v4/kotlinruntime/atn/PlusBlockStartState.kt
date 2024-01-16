// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Start of `(A|B|...)+` loop.
 *
 * Technically a decision state, but we don't use for code generation.
 * Somebody might need it, so I'm defining it for completeness.
 *
 * In reality, the [PlusLoopbackState] node is the real decision-making note for `A+`.
 */
public class PlusBlockStartState : BlockStartState() {
  public var loopBackState: PlusLoopbackState? = null

  override val stateType: Int =
    PLUS_BLOCK_START
}
