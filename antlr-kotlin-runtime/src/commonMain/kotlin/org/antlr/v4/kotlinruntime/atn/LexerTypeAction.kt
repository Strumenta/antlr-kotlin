// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Implements the `type` lexer action by setting [Lexer.type]
 * to the assigned type.
 *
 * @param type The type to assign to the token using [Lexer.type]
 *
 * @author Sam Harwell
 * @since 4.2
 */
public class LexerTypeAction(public val type: Int) : LexerAction {
  /**
   * Returns [LexerActionType.TYPE].
   */
  override val actionType: LexerActionType =
    LexerActionType.TYPE

  /**
   * Returns `false`.
   */
  override val isPositionDependent: Boolean =
    false

  /**
   * This action is implemented by assigning [Lexer.type] the
   * value provided by [type].
   */
  override fun execute(lexer: Lexer) {
    lexer.type = type
  }

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()
    hash = MurmurHash.update(hash, actionType.ordinal)
    hash = MurmurHash.update(hash, type)
    return MurmurHash.finish(hash, 2)
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is LexerTypeAction) {
      return false
    }

    return type == other.type
  }

  override fun toString(): String =
    "type($type)"
}
