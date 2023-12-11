/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * Represents a span of raw text (concrete syntax) between tags in a tree pattern string.
 *
 * @param text The raw text of this chunk
 */
internal class TextChunk(val text: String) : Chunk() {
  /**
   * The implementation for [TextChunk] returns the result of [text] in single quotes.
   */
  override fun toString(): String =
    "'$text'"
}
