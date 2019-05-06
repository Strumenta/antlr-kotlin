/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.TokenSource

val DEFAULT_CHANNEL = 0

/**
 * A [Token] object representing an entire subtree matched by a parser
 * rule; e.g., `<expr>`. These tokens are created for [TagChunk]
 * chunks where the tag corresponds to a parser rule.
 */
class RuleTagToken
/**
 * Constructs a new instance of [RuleTagToken] with the specified rule
 * name, bypass token type, and accessLabel.
 *
 * @param ruleName The name of the parser rule this rule tag matches.
 * @param bypassTokenType The bypass token type assigned to the parser rule.
 * @param label The accessLabel associated with the rule tag, or `null` if
 * the rule tag is unlabeled.
 *
 * @exception IllegalArgumentException if `ruleName` is `null`
 * or empty.
 */
constructor(
        /**
         * This is the backing field for [.getRuleName].
         */
        /**
         * Gets the name of the rule associated with this rule tag.
         *
         * @return The name of the parser rule associated with this rule tag.
         */

        val ruleName: String?,
        /**
         * The token type for the current token. This is the token type assigned to
         * the bypass alternative for the rule during ATN deserialization.
         */
        /**
         * {@inheritDoc}
         *
         *
         * Rule tag tokens have types assigned according to the rule bypass
         * transitions created during ATN deserialization.
         */
        override val type: Int,
        /**
         * This is the backing field for [.getLabel].
         */
        /**
         * Gets the accessLabel associated with the rule tag.
         *
         * @return The name of the accessLabel associated with the rule tag, or
         * `null` if this is an unlabeled rule tag.
         */

        val label: String? = null) : Token {

    /**
     * {@inheritDoc}
     *
     *
     * Rule tag tokens are always placed on the [.DEFAULT_CHANNEL].
     */
    override val channel: Int
        get() = DEFAULT_CHANNEL

    /**
     * {@inheritDoc}
     *
     *
     * This method returns the rule tag formatted with `<` and `>`
     * delimiters.
     */
    override val text: String
        get() = if (label != null) {
            "<$label:$ruleName>"
        } else "<$ruleName>"

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns 0.
     */
    override val line: Int
        get() = 0

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns -1.
     */
    override val charPositionInLine: Int
        get() = -1

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns -1.
     */
    override val tokenIndex: Int
        get() = -1

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns -1.
     */
    override val startIndex: Int
        get() = -1

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns -1.
     */
    override val stopIndex: Int
        get() = -1

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns `null`.
     */
    override val tokenSource: TokenSource?
        get() = null

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] always returns `null`.
     */
    override val inputStream: CharStream?
        get() = null

    init {
        if (ruleName == null || ruleName.isEmpty()) {
            throw IllegalArgumentException("ruleName cannot be null or empty.")
        }
    }

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [RuleTagToken] returns a string of the form
     * `ruleName:bypassTokenType`.
     */
    override fun toString(): String {
        return ruleName + ":" + type
    }
}
/**
 * Constructs a new instance of [RuleTagToken] with the specified rule
 * name and bypass token type and no accessLabel.
 *
 * @param ruleName The name of the parser rule this rule tag matches.
 * @param bypassTokenType The bypass token type assigned to the parser rule.
 *
 * @exception IllegalArgumentException if `ruleName` is `null`
 * or empty.
 */
