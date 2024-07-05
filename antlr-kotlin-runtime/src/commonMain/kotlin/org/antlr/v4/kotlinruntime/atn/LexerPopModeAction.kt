// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Implements the `popMode` lexer action by calling [Lexer.popMode].
 *
 * The `popMode` command does not have any parameters,
 * so this action is implemented as an object.
 *
 * @author Sam Harwell
 * @since 4.2
 */
public object LexerPopModeAction : LexerAction {
  /**
   * Returns [LexerActionType.POP_MODE].
   */
  override val actionType: LexerActionType =
    LexerActionType.POP_MODE

  /**
   * Returns `false`.
   */
  override val isPositionDependent: Boolean =
    false

  /**
   * This action is implemented by calling [Lexer.popMode].
   */
  override fun execute(lexer: Lexer) {
    lexer.popMode()
  }

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()
    hash = MurmurHash.update(hash, actionType.ordinal)
    return MurmurHash.finish(hash, 1)
  }

  override fun equals(other: Any?): Boolean =
    other === this

  override fun toString(): String =
    "popMode"
}
