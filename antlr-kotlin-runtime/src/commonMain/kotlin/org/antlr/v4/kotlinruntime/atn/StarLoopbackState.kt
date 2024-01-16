// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

public class StarLoopbackState : ATNState() {
  public val loopEntryState: StarLoopEntryState
    get() = transition(0).target as StarLoopEntryState

  override val stateType: Int =
    STAR_LOOP_BACK
}
