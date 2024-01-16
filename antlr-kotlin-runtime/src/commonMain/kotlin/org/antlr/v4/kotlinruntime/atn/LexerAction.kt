// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer

/**
 * Represents a single action which can be executed following the successful
 * match of a lexer rule.
 *
 * Lexer actions are used for both embedded action syntax
 * and ANTLR 4's new lexer command syntax.
 *
 * @author Sam Harwell
 * @since 4.2
 */
public interface LexerAction {
  /**
   * The serialization type of the lexer action.
   */
  public val actionType: LexerActionType

  /**
   * Whether the lexer action is position-dependent.
   *
   * Position-dependent actions may have different semantics depending
   * on the [CharStream] index at the time the action is executed.
   *
   * Many lexer commands, including `type`, `skip`, and `more`,
   * do not check the input index during their execution.
   *
   * Actions like this are position-independent, and may be stored more
   * efficiently as part of the [LexerATNConfig.lexerActionExecutor].
   *
   * @return `true` if the lexer action semantics can be affected by the
   *   position of the input [CharStream] at the time it is executed,
   *   otherwise `false`
   */
  public val isPositionDependent: Boolean

  /**
   * Execute the lexer action in the context of the specified [Lexer].
   *
   * For position-dependent actions, the input stream must already be
   * positioned correctly prior to calling this method.
   *
   * @param lexer The lexer instance
   */
  public fun execute(lexer: Lexer)
}
