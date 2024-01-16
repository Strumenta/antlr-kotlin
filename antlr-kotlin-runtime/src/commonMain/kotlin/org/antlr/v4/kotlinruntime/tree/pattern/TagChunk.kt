// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * Represents a placeholder tag in a tree pattern.
 * A tag can have any of the following forms.
 *
 * - `expr`: An unlabeled placeholder for a parser rule `expr`
 * - `ID`: An unlabeled placeholder for a token of type `ID`
 * - `e:expr`: A labeled placeholder for a parser rule `expr`
 * - `id:ID`: A labeled placeholder for a token of type `ID`
 *
 * This class does not perform any validation on the tag or label names aside
 * from ensuring that the tag is a non-null, non-empty string.
 *
 * @param label The label, if any, assigned to this chunk
 *   If this is `null`, the [TagChunk] represents an unlabeled tag
 * @param tag The tag for this chunk, which should be the name of a parser rule or token type
 *
 * @throws IllegalArgumentException If [tag] is empty
 */
internal class TagChunk(val label: String?, val tag: String) : Chunk() {
  @Suppress("unused")
  constructor(tag: String) : this(null, tag)

  init {
    if (tag.isEmpty()) {
      throw IllegalArgumentException("tag cannot be null or empty")
    }
  }

  /**
   * This method returns a text representation of the tag chunk. Labeled tags
   * are returned in the form `label:tag`, and unlabeled tags are
   * returned as just the tag name.
   */
  override fun toString(): String =
    if (label != null) {
      "$label:$tag"
    } else {
      tag
    }
}
