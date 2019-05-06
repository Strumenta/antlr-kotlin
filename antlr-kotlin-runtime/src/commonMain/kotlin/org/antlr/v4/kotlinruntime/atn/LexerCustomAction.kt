/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * Executes a custom lexer action by calling [Recognizer.action] with the
 * rule and action indexes assigned to the custom action. The implementation of
 * a custom action is added to the generated code for the lexer in an override
 * of [Recognizer.action] when the grammar is compiled.
 *
 *
 * This class may represent embedded actions created with the `{...}`
 * syntax in ANTLR 4, as well as actions created for lexer commands where the
 * command argument could not be evaluated when the grammar was compiled.
 *
 * @author Sam Harwell
 * @since 4.2
 */
class LexerCustomAction
/**
 * Constructs a custom lexer action with the specified rule and action
 * indexes.
 *
 * @param ruleIndex The rule index to use for calls to
 * [Recognizer.action].
 * @param actionIndex The action index to use for calls to
 * [Recognizer.action].
 */
(
        /**
         * Gets the rule index to use for calls to [Recognizer.action].
         *
         * @return The rule index for the custom action.
         */
        val ruleIndex: Int,
        /**
         * Gets the action index to use for calls to [Recognizer.action].
         *
         * @return The action index for the custom action.
         */
        val actionIndex: Int) : LexerAction {

    /**
     * {@inheritDoc}
     *
     * @return This method returns [LexerActionType.CUSTOM].
     */
    override val actionType: LexerActionType
        get() = LexerActionType.CUSTOM

    /**
     * Gets whether the lexer action is position-dependent. Position-dependent
     * actions may have different semantics depending on the [CharStream]
     * index at the time the action is executed.
     *
     *
     * Custom actions are position-dependent since they may represent a
     * user-defined embedded action which makes calls to methods like
     * [Lexer.getText].
     *
     * @return This method returns `true`.
     */
    override val isPositionDependent: Boolean
        get() = true

    /**
     * {@inheritDoc}
     *
     *
     * Custom actions are implemented by calling [Lexer.action] with the
     * appropriate rule and action indexes.
     */
    override fun execute(lexer: Lexer) {
        lexer.action(null, ruleIndex, actionIndex)
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, actionType.ordinal)
        hash = MurmurHash.update(hash, ruleIndex)
        hash = MurmurHash.update(hash, actionIndex)
        return MurmurHash.finish(hash, 3)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is LexerCustomAction) {
            return false
        }

        val other = obj as LexerCustomAction?
        return ruleIndex == other!!.ruleIndex && actionIndex == other.actionIndex
    }
}
