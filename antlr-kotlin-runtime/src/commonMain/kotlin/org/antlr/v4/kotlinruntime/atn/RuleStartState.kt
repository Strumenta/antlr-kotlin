// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

public class RuleStartState : ATNState() {
  public var stopState: RuleStopState? = null
  public var isLeftRecursiveRule: Boolean = false

  override val stateType: Int =
    RULE_START
}
