// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.ParserInterpreter
import org.antlr.v4.kotlinruntime.dfa.DFA

public class StarLoopEntryState : DecisionState() {
  public var loopBackState: StarLoopbackState? = null

  /**
   * Indicates whether this state can benefit from a precedence DFA during SLL
   * decision-making.
   *
   * This is a computed property that is calculated during ATN deserialization
   * and stored for use in [ParserATNSimulator] and [ParserInterpreter].
   *
   * @see DFA.isPrecedenceDfa
   */
  public var isPrecedenceDecision: Boolean = false

  override val stateType: Int =
    STAR_LOOP_ENTRY
}
