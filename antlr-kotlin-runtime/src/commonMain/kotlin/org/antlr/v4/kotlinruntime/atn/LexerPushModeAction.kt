/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Implements the `pushMode` lexer action by calling
 * [Lexer.pushMode] with the assigned mode.
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerPushModeAction
/**
 * Constructs a new `pushMode` action with the specified mode value.
 * @param mode The mode value to pass to [Lexer.pushMode].
 */
(
        /**
         * Get the lexer mode this action should transition the lexer to.
         *
         * @return The lexer mode for this `pushMode` command.
         */
        val mode: Int) : LexerAction {

    /**
     * {@inheritDoc}
     * @return This method returns [LexerActionType.PUSH_MODE].
     */
    override val actionType: LexerActionType
        get() = LexerActionType.PUSH_MODE

    /**
     * {@inheritDoc}
     * @return This method returns `false`.
     */
    override val isPositionDependent: Boolean
        get() = false

    /**
     * {@inheritDoc}
     *
     *
     * This action is implemented by calling [Lexer.pushMode] with the
     * value provided by [.getMode].
     */
    override fun execute(lexer: Lexer) {
        lexer.pushMode(mode)
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, actionType.ordinal)
        hash = MurmurHash.update(hash, mode)
        return MurmurHash.finish(hash, 2)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is LexerPushModeAction) {
            return false
        }

        return mode == obj.mode
    }

    override fun toString(): String {
        return "pushMode($mode)"
    }
}
