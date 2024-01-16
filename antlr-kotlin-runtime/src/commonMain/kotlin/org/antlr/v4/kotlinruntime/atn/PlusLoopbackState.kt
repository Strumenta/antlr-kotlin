// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Decision state for `A+` and `(A|B)+`.
 *
 * It has two transitions: one to the loop back to start of the block and one to exit.
 */
public class PlusLoopbackState : DecisionState() {
  override val stateType: Int =
    PLUS_LOOP_BACK
}
