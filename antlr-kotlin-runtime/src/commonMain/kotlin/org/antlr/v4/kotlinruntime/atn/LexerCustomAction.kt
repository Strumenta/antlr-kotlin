// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Executes a custom lexer action by calling [Recognizer.action] with the
 * rule and action indexes assigned to the custom action.
 *
 * The implementation of a custom action is added to the generated code
 * for the lexer in an override of [Recognizer.action] when the grammar is compiled.
 *
 * This class may represent embedded actions created with the `{...}`
 * syntax in ANTLR 4, as well as actions created for lexer commands where the
 * command argument could not be evaluated when the grammar was compiled.
 *
 * @param ruleIndex The rule index to use for calls to [Recognizer.action]
 * @param actionIndex The action index to use for calls to [Recognizer.action]
 *
 * @author Sam Harwell
 * @since 4.2
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class LexerCustomAction(public val ruleIndex: Int, public val actionIndex: Int) : LexerAction {
  /**
   * Returns [LexerActionType.CUSTOM].
   */
  override val actionType: LexerActionType =
    LexerActionType.CUSTOM

  /**
   * Whether the lexer action is position-dependent.
   *
   * Position-dependent actions may have different semantics
   * depending on the [CharStream] index at the time the action is executed.
   *
   * Custom actions are position-dependent since they may represent a
   * user-defined embedded action which makes calls to methods like [Lexer.text].
   *
   * Set to `true` by default.
   */
  override val isPositionDependent: Boolean =
    true

  /**
   * Custom actions are implemented by calling [Lexer.action] with the
   * appropriate rule and action indexes.
   */
  override fun execute(lexer: Lexer): Unit =
    lexer.action(null, ruleIndex, actionIndex)

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()
    hash = MurmurHash.update(hash, actionType.ordinal)
    hash = MurmurHash.update(hash, ruleIndex)
    hash = MurmurHash.update(hash, actionIndex)
    return MurmurHash.finish(hash, 3)
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is LexerCustomAction) {
      return false
    }

    return ruleIndex == other.ruleIndex && actionIndex == other.actionIndex
  }
}
