/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.clone
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.IntStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Represents an executor for a sequence of lexer actions which traversed during
 * the matching operation of a lexer rule (token).
 *
 *
 * The executor tracks position information for position-dependent lexer actions
 * efficiently, ensuring that actions appearing only at the end of the rule do
 * not cause bloating of the [DFA] created for the lexer.
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerActionExecutor
/**
 * Constructs an executor for a sequence of [LexerAction] actions.
 * @param lexerActions The lexer actions to execute.
 */
(
        /**
         * Gets the lexer actions to be executed by this executor.
         * @return The lexer actions to be executed by this executor.
         */
        val lexerActions: Array<LexerAction>) {
    /**
     * Caches the result of [.hashCode] since the hash code is an element
     * of the performance-critical [LexerATNConfig.hashCode] operation.
     */
    private val hashCode: Int

    init {

        var hash = MurmurHash.initialize()
        for (lexerAction in lexerActions) {
            hash = MurmurHash.update(hash, lexerAction)
        }

        this.hashCode = MurmurHash.finish(hash, lexerActions.size)
    }

    /**
     * Creates a [LexerActionExecutor] which encodes the current offset
     * for position-dependent lexer actions.
     *
     *
     * Normally, when the executor encounters lexer actions where
     * [LexerAction.isPositionDependent] returns `true`, it calls
     * [IntStream.seek] on the input [CharStream] to set the input
     * position to the *end* of the current token. This behavior provides
     * for efficient DFA representation of lexer actions which appear at the end
     * of a lexer rule, even when the lexer rule matches a variable number of
     * characters.
     *
     *
     * Prior to traversing a match transition in the ATN, the current offset
     * from the token start index is assigned to all position-dependent lexer
     * actions which have not already been assigned a fixed offset. By storing
     * the offsets relative to the token start index, the DFA representation of
     * lexer actions which appear in the middle of tokens remains efficient due
     * to sharing among tokens of the same length, regardless of their absolute
     * position in the input stream.
     *
     *
     * If the current executor already has offsets assigned to all
     * position-dependent lexer actions, the method returns `this`.
     *
     * @param offset The current offset to assign to all position-dependent
     * lexer actions which do not already have offsets assigned.
     *
     * @return A [LexerActionExecutor] which stores input stream offsets
     * for all position-dependent lexer actions.
     */
    fun fixOffsetBeforeMatch(offset: Int): LexerActionExecutor {
        var updatedLexerActions: Array<LexerAction>? = null
        for (i in lexerActions.indices) {
            if (lexerActions[i].isPositionDependent && lexerActions[i] !is LexerIndexedCustomAction) {
                if (updatedLexerActions == null) {
                    updatedLexerActions = lexerActions.clone()
                }

                updatedLexerActions!![i] = LexerIndexedCustomAction(offset, lexerActions[i])
            }
        }

        return if (updatedLexerActions == null) {
            this
        } else LexerActionExecutor(updatedLexerActions)

    }

    /**
     * Execute the actions encapsulated by this executor within the context of a
     * particular [Lexer].
     *
     *
     * This method calls [IntStream.seek] to set the position of the
     * `input` [CharStream] prior to calling
     * [LexerAction.execute] on a position-dependent action. Before the
     * method returns, the input position will be restored to the same position
     * it was in when the method was invoked.
     *
     * @param lexer The lexer instance.
     * @param input The input stream which is the source for the current token.
     * When this method is called, the current [IntStream.index] for
     * `input` should be the start of the following token, i.e. 1
     * character past the end of the current token.
     * @param startIndex The token start index. This value may be passed to
     * [IntStream.seek] to set the `input` position to the beginning
     * of the token.
     */
    fun execute(lexer: Lexer, input: CharStream, startIndex: Int) {
        var requiresSeek = false
        val stopIndex = input.index()
        try {
            for (lexerAction in lexerActions) {
                var mutableLexerAction = lexerAction
                if (mutableLexerAction is LexerIndexedCustomAction) {
                    val offset = (mutableLexerAction as LexerIndexedCustomAction).offset
                    input.seek(startIndex + offset)
                    mutableLexerAction = (mutableLexerAction as LexerIndexedCustomAction).action
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

    override fun hashCode(): Int {
        return this.hashCode
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is LexerActionExecutor) {
            return false
        }

        val other = obj as LexerActionExecutor?
        return hashCode == other!!.hashCode && Arrays.equals(lexerActions, other.lexerActions)
    }

    companion object {

        /**
         * Creates a [LexerActionExecutor] which executes the actions for
         * the input `lexerActionExecutor` followed by a specified
         * `lexerAction`.
         *
         * @param lexerActionExecutor The executor for actions already traversed by
         * the lexer while matching a token within a particular
         * [LexerATNConfig]. If this is `null`, the method behaves as
         * though it were an empty executor.
         * @param lexerAction The lexer action to execute after the actions
         * specified in `lexerActionExecutor`.
         *
         * @return A [LexerActionExecutor] for executing the combine actions
         * of `lexerActionExecutor` and `lexerAction`.
         */
        fun append(lexerActionExecutor: LexerActionExecutor?, lexerAction: LexerAction): LexerActionExecutor {
            if (lexerActionExecutor == null) {
                return LexerActionExecutor(arrayOf<LexerAction>(lexerAction))
            }

            val lexerActions = Arrays.copyOf<LexerAction>(lexerActionExecutor.lexerActions, lexerActionExecutor.lexerActions.size + 1)
            lexerActions[lexerActions.size - 1] = lexerAction
            return LexerActionExecutor(lexerActions)
        }
    }
}

