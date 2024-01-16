// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * This implementation of [LexerAction] is used for tracking input offsets
 * for position-dependent actions within a [LexerActionExecutor].
 *
 * This action is not serialized as part of the ATN, and is only required for
 * position-dependent lexer actions which appear at a location other than the
 * end of a rule. For more information about DFA optimizations employed for
 * lexer actions, see [LexerActionExecutor.append] and [LexerActionExecutor.fixOffsetBeforeMatch].
 *
 * Note: this class is only required for lexer actions for which
 * [LexerAction.isPositionDependent] returns `true`.
 *
 * @param offset The offset into the input [CharStream], relative to
 *   the token start index, at which the specified lexer action should be
 *   executed
 * @param action The lexer action to execute at a particular offset in the
 *   input [CharStream]
 *
 * @author Sam Harwell
 * @since 4.2
 */
public open class LexerIndexedCustomAction(public val offset: Int, public val action: LexerAction) : LexerAction {
  /**
   * Returns the result of getting [actionType] on [action].
   */
  override val actionType: LexerActionType
    get() = action.actionType

  /**
   * Returns `true`.
   */
  override val isPositionDependent: Boolean =
    true

  /**
   * This method calls [execute] on [action] using the provided [lexer].
   */
  override fun execute(lexer: Lexer): Unit =
    // Assume the input stream position was properly set by the calling code
    action.execute(lexer)

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()
    hash = MurmurHash.update(hash, offset)
    hash = MurmurHash.update(hash, action)
    return MurmurHash.finish(hash, 2)
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is LexerIndexedCustomAction) {
      return false
    }

    return offset == other.offset && action == other.action
  }
}
