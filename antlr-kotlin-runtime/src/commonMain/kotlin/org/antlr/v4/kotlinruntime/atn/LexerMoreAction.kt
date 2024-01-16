// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.atn.LexerMoreAction.Companion.INSTANCE
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Implements the `more` lexer action by calling [Lexer.more].
 *
 * The `more` command does not have any parameters, so this action is
 * implemented as a singleton instance exposed by [INSTANCE].
 *
 * @author Sam Harwell
 * @since 4.2
 */
public class LexerMoreAction private constructor() : LexerAction {
  public companion object {
    /**
     * Provides a singleton instance of this parameterless lexer action.
     */
    public val INSTANCE: LexerMoreAction = LexerMoreAction()
  }

  /**
   * Returns [LexerActionType.MORE].
   */
  override val actionType: LexerActionType =
    LexerActionType.MORE

  /**
   * Returns `false`.
   */
  override val isPositionDependent: Boolean =
    false

  /**
   * This action is implemented by calling [Lexer.more].
   */
  override fun execute(lexer: Lexer): Unit =
    lexer.more()

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()
    hash = MurmurHash.update(hash, actionType.ordinal)
    return MurmurHash.finish(hash, 1)
  }

  override fun equals(other: Any?): Boolean =
    other === this

  override fun toString(): String =
    "more"
}
