// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

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
