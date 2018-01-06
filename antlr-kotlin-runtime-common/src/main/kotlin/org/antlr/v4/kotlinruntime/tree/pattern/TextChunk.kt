/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * Represents a span of raw text (concrete syntax) between tags in a tree
 * pattern string.
 */
internal class TextChunk
/**
 * Constructs a new instance of [TextChunk] with the specified text.
 *
 * @param text The text of this chunk.
 * @exception IllegalArgumentException if `text` is `null`.
 */
(
        /**
         * This is the backing field for [.getText].
         */

        /**
         * Gets the raw text of this chunk.
         *
         * @return The text of the chunk.
         */

        val text: String?) : Chunk() {

    init {
        if (text == null) {
            throw IllegalArgumentException("text cannot be null")
        }
    }

    /**
     * {@inheritDoc}
     *
     *
     * The implementation for [TextChunk] returns the result of
     * [.getText] in single quotes.
     */
    override fun toString(): String {
        return "'$text'"
    }
}
