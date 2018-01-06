/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * This implementation of [LexerAction] is used for tracking input offsets
 * for position-dependent actions within a [LexerActionExecutor].
 *
 *
 * This action is not serialized as part of the ATN, and is only required for
 * position-dependent lexer actions which appear at a location other than the
 * end of a rule. For more information about DFA optimizations employed for
 * lexer actions, see [LexerActionExecutor.append] and
 * [LexerActionExecutor.fixOffsetBeforeMatch].
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerIndexedCustomAction
/**
 * Constructs a new indexed custom action by associating a character offset
 * with a [LexerAction].
 *
 *
 * Note: This class is only required for lexer actions for which
 * [LexerAction.isPositionDependent] returns `true`.
 *
 * @param offset The offset into the input [CharStream], relative to
 * the token start index, at which the specified lexer action should be
 * executed.
 * @param action The lexer action to execute at a particular offset in the
 * input [CharStream].
 */
(
        /**
         * Gets the location in the input [CharStream] at which the lexer
         * action should be executed. The value is interpreted as an offset relative
         * to the token start index.
         *
         * @return The location in the input [CharStream] at which the lexer
         * action should be executed.
         */
        val offset: Int,
        /**
         * Gets the lexer action to execute.
         *
         * @return A [LexerAction] object which executes the lexer action.
         */
        val action: LexerAction) : LexerAction {

    /**
     * {@inheritDoc}
     *
     * @return This method returns the result of calling [.getActionType]
     * on the [LexerAction] returned by [.getAction].
     */
    override val actionType: LexerActionType
        get() = action.actionType

    /**
     * {@inheritDoc}
     * @return This method returns `true`.
     */
    override val isPositionDependent: Boolean
        get() = true

    /**
     * {@inheritDoc}
     *
     *
     * This method calls [.execute] on the result of [.getAction]
     * using the provided `lexer`.
     */
    override fun execute(lexer: Lexer) {
        // assume the input stream position was properly set by the calling code
        action.execute(lexer)
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, offset)
        hash = MurmurHash.update(hash, action)
        return MurmurHash.finish(hash, 2)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is LexerIndexedCustomAction) {
            return false
        }

        val other = obj as LexerIndexedCustomAction?
        return offset == other!!.offset && action == other.action
    }

}
