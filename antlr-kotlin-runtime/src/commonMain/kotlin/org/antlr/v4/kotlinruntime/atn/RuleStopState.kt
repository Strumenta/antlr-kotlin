// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * The last node in the ATN for a rule, unless that rule is the start symbol.
 *
 * In that case, there is one transition to `EOF`. Later, we might encode
 * references to all calls to this rule to compute `FOLLOW` sets for
 * error handling.
 */
public class RuleStopState : ATNState() {
  override val stateType: Int =
    RULE_STOP
}
