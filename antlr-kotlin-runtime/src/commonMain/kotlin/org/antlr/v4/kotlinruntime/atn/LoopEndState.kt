// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Mark the end of a * or + loop.
 */
public class LoopEndState : ATNState() {
  public var loopBackState: ATNState? = null

  override val stateType: Int =
    LOOP_END
}
