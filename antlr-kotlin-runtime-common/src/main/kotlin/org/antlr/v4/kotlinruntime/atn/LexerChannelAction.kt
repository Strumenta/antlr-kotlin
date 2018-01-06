/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.misc.MurmurHash
import org.antlr.v4.kotlinruntime.Token

/**
 * Implements the `channel` lexer action by calling
 * [Lexer.setChannel] with the assigned channel.
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerChannelAction
/**
 * Constructs a new `channel` action with the specified channel value.
 * @param channel The channel value to pass to [Lexer.setChannel].
 */
(
        /**
         * Gets the channel to use for the [Token] created by the lexer.
         *
         * @return The channel to use for the [Token] created by the lexer.
         */
        val channel: Int) : LexerAction {

    /**
     * {@inheritDoc}
     * @return This method returns [LexerActionType.CHANNEL].
     */
    override val actionType: LexerActionType
        get() = LexerActionType.CHANNEL

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
     * This action is implemented by calling [Lexer.setChannel] with the
     * value provided by [.getChannel].
     */
    override fun execute(lexer: Lexer) {
        lexer.channel = channel
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, actionType.ordinal)
        hash = MurmurHash.update(hash, channel)
        return MurmurHash.finish(hash, 2)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is LexerChannelAction) {
            return false
        }

        return channel == obj.channel
    }

    override fun toString(): String {
        return "channel($channel)"
    }
}
