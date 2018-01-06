/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 * Represents the serialization type of a [LexerAction].
 *
 * @author Sam Harwell
 * @since 4.2
 */
enum class LexerActionType {
    /**
     * The type of a [LexerChannelAction] action.
     */
    CHANNEL,
    /**
     * The type of a [LexerCustomAction] action.
     */
    CUSTOM,
    /**
     * The type of a [LexerModeAction] action.
     */
    MODE,
    /**
     * The type of a [LexerMoreAction] action.
     */
    MORE,
    /**
     * The type of a [LexerPopModeAction] action.
     */
    POP_MODE,
    /**
     * The type of a [LexerPushModeAction] action.
     */
    PUSH_MODE,
    /**
     * The type of a [LexerSkipAction] action.
     */
    SKIP,
    /**
     * The type of a [LexerTypeAction] action.
     */
    TYPE
}
