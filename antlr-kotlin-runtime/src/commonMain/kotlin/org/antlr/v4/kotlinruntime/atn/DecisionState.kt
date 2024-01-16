// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

public abstract class DecisionState : ATNState() {
  public var decision: Int = -1
  public var nonGreedy: Boolean = false
}
