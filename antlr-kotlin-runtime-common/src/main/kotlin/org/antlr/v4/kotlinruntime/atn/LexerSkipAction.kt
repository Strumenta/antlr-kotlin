/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Implements the `skip` lexer action by calling [Lexer.skip].
 *
 *
 * The `skip` command does not have any parameters, so this action is
 * implemented as a singleton instance exposed by [.INSTANCE].
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerSkipAction
/**
 * Constructs the singleton instance of the lexer `skip` command.
 */
private constructor() : LexerAction {

    /**
     * {@inheritDoc}
     * @return This method returns [LexerActionType.SKIP].
     */
    override val actionType: LexerActionType
        get() = LexerActionType.SKIP

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
     * This action is implemented by calling [Lexer.skip].
     */
    override fun execute(lexer: Lexer) {
        lexer.skip()
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, actionType.ordinal)
        return MurmurHash.finish(hash, 1)
    }

    override fun equals(obj: Any?): Boolean {
        return obj === this
    }

    override fun toString(): String {
        return "skip"
    }

    companion object {
        /**
         * Provides a singleton instance of this parameterless lexer action.
         */
        val INSTANCE = LexerSkipAction()
    }
}
