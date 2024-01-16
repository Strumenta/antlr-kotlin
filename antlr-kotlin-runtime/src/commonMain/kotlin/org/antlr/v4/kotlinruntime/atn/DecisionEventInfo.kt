// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This is the base class for gathering detailed information about prediction
 * events which occur during parsing.
 *
 * Note that we could record the parser call stack at the time this event
 * occurred but in the presence of left recursive rules, the stack is kind of
 * meaningless. It's better to look at the individual configurations for their
 * individual stacks. Of course that is a [PredictionContext] object
 * not a parse tree node and so it does not have information about the extent
 * (start...stop) of the various subtrees. Examining the stack tops of all
 * configurations provide the return states for the rule invocations.
 * From there you can get the enclosing rule.
 *
 * @since 4.3
 */
public open class DecisionEventInfo(
  /**
   * The invoked decision number which this event is related to.
   *
   * @see ATN.decisionToState
   */
  public val decision: Int,

  /**
   * The configuration set containing additional information relevant to the
   * prediction state when the current event occurred, or `null` if no
   * additional information is relevant or available.
   */
  public val configs: ATNConfigSet?,

  /**
   * The input token stream which is being parsed.
   */
  public val input: TokenStream,

  /**
   * The token index in the input stream at which the current prediction was
   * originally invoked.
   */
  public val startIndex: Int,

  /**
   * The token index in the input stream at which the current event occurred.
   */
  public val stopIndex: Int,

  /**
   * `true` if the current event occurred during LL prediction,
   * otherwise `false` if the input occurred during SLL prediction.
   */
  public val fullCtx: Boolean,
)
