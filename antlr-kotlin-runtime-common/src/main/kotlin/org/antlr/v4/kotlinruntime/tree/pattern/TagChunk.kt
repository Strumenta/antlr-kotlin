/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * Represents a placeholder tag in a tree pattern. A tag can have any of the
 * following forms.
 *
 *
 *  * `expr`: An unlabeled placeholder for a parser rule `expr`.
 *  * `ID`: An unlabeled placeholder for a token of type `ID`.
 *  * `e:expr`: A labeled placeholder for a parser rule `expr`.
 *  * `id:ID`: A labeled placeholder for a token of type `ID`.
 *
 *
 * This class does not perform any validation on the tag or accessLabel names aside
 * from ensuring that the tag is a non-null, non-empty string.
 */
internal class TagChunk
/**
 * Construct a new instance of [TagChunk] using the specified accessLabel
 * and tag.
 *
 * @param label The accessLabel for the tag. If this is `null`, the
 * [TagChunk] represents an unlabeled tag.
 * @param tag The tag, which should be the name of a parser rule or token
 * type.
 *
 * @exception IllegalArgumentException if `tag` is `null` or
 * empty.
 */
(
        /**
         * This is the backing field for [.getLabel].
         */
        /**
         * Get the accessLabel, if any, assigned to this chunk.
         *
         * @return The accessLabel assigned to this chunk, or `null` if no accessLabel is
         * assigned to the chunk.
         */

        val label: String?,
        /**
         * This is the backing field for [.getTag].
         */
        /**
         * Get the tag for this chunk.
         *
         * @return The tag for the chunk.
         */

        val tag: String?) : Chunk() {

    /**
     * Construct a new instance of [TagChunk] using the specified tag and
     * no accessLabel.
     *
     * @param tag The tag, which should be the name of a parser rule or token
     * type.
     *
     * @exception IllegalArgumentException if `tag` is `null` or
     * empty.
     */
    constructor(tag: String) : this(null, tag) {}

    init {
        if (tag == null || tag.isEmpty()) {
            throw IllegalArgumentException("tag cannot be null or empty")
        }
    }

    /**
     * This method returns a text representation of the tag chunk. Labeled tags
     * are returned in the form `accessLabel:tag`, and unlabeled tags are
     * returned as just the tag name.
     */
    override fun toString(): String {
        return if (label != null) {
            label + ":" + tag
        } else tag!!

    }
}
