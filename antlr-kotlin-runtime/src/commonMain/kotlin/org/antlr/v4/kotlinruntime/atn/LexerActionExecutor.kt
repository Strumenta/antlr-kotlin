// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.IntStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Represents an executor for a sequence of lexer actions which traversed during
 * the matching operation of a lexer rule (token).
 *
 * The executor tracks position information for position-dependent lexer actions
 * efficiently, ensuring that actions appearing only at the end of the rule do
 * not cause bloating of the [DFA] created for the lexer.
 *
 * @param lexerActions The lexer actions to execute
 *
 * @author Sam Harwell
 * @since 4.2
 */
public class LexerActionExecutor(public val lexerActions: Array<LexerAction>) {
  public companion object {
    /**
     * Creates a [LexerActionExecutor] which executes the actions for
     * the input [lexerActionExecutor] followed by a specified [lexerAction].
     *
     * @param lexerActionExecutor The executor for actions already traversed by
     *   the lexer while matching a token within a particular [LexerATNConfig].
     *   If this is `null`, the method behaves as though it were an empty executor
     * @param lexerAction The lexer action to execute after the actions
     *   specified in [lexerActionExecutor]
     * @return A [LexerActionExecutor] for executing the combine actions
     *   of [lexerActionExecutor] and [lexerAction]
     */
    public fun append(lexerActionExecutor: LexerActionExecutor?, lexerAction: LexerAction): LexerActionExecutor {
      if (lexerActionExecutor == null) {
        return LexerActionExecutor(arrayOf(lexerAction))
      }

      val lexerActions = lexerActionExecutor.lexerActions.copyOf(lexerActionExecutor.lexerActions.size + 1)
      lexerActions[lexerActions.lastIndex] = lexerAction

      // We can explicitly cast because the last index, which was allocated with a null,
      // is now taken by a non-null element
      @Suppress("UNCHECKED_CAST")
      return LexerActionExecutor(lexerActions as Array<LexerAction>)
    }
  }

  /**
   * Caches the result of [hashCode] since the hash code is an element
   * of the performance-critical [LexerATNConfig.hashCode] operation.
   */
  private val hashCode: Int

  init {
    var hash = MurmurHash.initialize()

    for (lexerAction in lexerActions) {
      hash = MurmurHash.update(hash, lexerAction)
    }

    hashCode = MurmurHash.finish(hash, lexerActions.size)
  }

  /**
   * Creates a [LexerActionExecutor] which encodes the current offset
   * for position-dependent lexer actions.
   *
   * Normally, when the executor encounters lexer actions where
   * [LexerAction.isPositionDependent] returns `true`, it calls
   * [IntStream.seek] on the input [CharStream] to set the input
   * position to the *end* of the current token. This behavior provides
   * for efficient DFA representation of lexer actions which appear at the end
   * of a lexer rule, even when the lexer rule matches a variable number of
   * characters.
   *
   * Prior to traversing a match transition in the ATN, the current offset
   * from the token start index is assigned to all position-dependent lexer
   * actions which have not already been assigned a fixed offset. By storing
   * the offsets relative to the token start index, the DFA representation of
   * lexer actions which appear in the middle of tokens remains efficient due
   * to sharing among tokens of the same length, regardless of their absolute
   * position in the input stream.
   *
   * If the current executor already has offsets assigned to all
   * position-dependent lexer actions, the method returns `this`.
   *
   * @param offset The current offset to assign to all position-dependent
   *   lexer actions which do not already have offsets assigned
   * @return A [LexerActionExecutor] which stores input stream offsets
   *   for all position-dependent lexer actions
   */
  public fun fixOffsetBeforeMatch(offset: Int): LexerActionExecutor {
    var updatedLexerActions: Array<LexerAction>? = null

    for (i in lexerActions.indices) {
      if (lexerActions[i].isPositionDependent && lexerActions[i] !is LexerIndexedCustomAction) {
        if (updatedLexerActions == null) {
          updatedLexerActions = lexerActions.copyOf()
        }

        updatedLexerActions[i] = LexerIndexedCustomAction(offset, lexerActions[i])
      }
    }

    return if (updatedLexerActions == null) {
      this
    } else {
      LexerActionExecutor(updatedLexerActions)
    }
  }

  /**
   * Execute the actions encapsulated by this executor within the context of a
   * particular [Lexer].
   *
   * This method calls [IntStream.seek] to set the position of the
   * [input] [CharStream] prior to calling [LexerAction.execute] on a
   * position-dependent action.
   *
   * Before the method returns, the input position will be restored to
   * the same position it was in when the method was invoked.
   *
   * @param lexer The lexer instance
   * @param input The input stream which is the source for the current token.
   *   When this method is called, the current [IntStream.index] for
   *   [input] should be the start of the following token, i.e., `1`
   *   character past the end of the current token
   * @param startIndex The token start index. This value may be passed to
   *   [IntStream.seek] to set the [input] position to the beginning
   *   of the token
   */
  public fun execute(lexer: Lexer, input: CharStream, startIndex: Int) {
    var requiresSeek = false
    val stopIndex = input.index()

    try {
      for (lexerAction in lexerActions) {
        var mutableLexerAction = lexerAction

        if (mutableLexerAction is LexerIndexedCustomAction) {
          val offset = mutableLexerAction.offset
          input.seek(startIndex + offset)
          mutableLexerAction = mutableLexerAction.action
          requiresSeek = startIndex + offset != stopIndex
        } else if (mutableLexerAction.isPositionDependent) {
          input.seek(stopIndex)
          requiresSeek = false
        }

        mutableLexerAction.execute(lexer)
      }
    } finally {
      if (requiresSeek) {
        input.seek(stopIndex)
      }
    }
  }

  override fun hashCode(): Int =
    hashCode

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is LexerActionExecutor) {
      return false
    }

    return hashCode == other.hashCode && lexerActions.contentEquals(other.lexerActions)
  }
}
