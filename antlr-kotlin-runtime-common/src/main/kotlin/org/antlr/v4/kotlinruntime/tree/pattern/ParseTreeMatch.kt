/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.misc.MultiMap

/**
 * Represents the result of matching a [ParseTree] against a tree pattern.
 */
class ParseTreeMatch
/**
 * Constructs a new instance of [ParseTreeMatch] from the specified
 * parse tree and pattern.
 *
 * @param tree The parse tree to match against the pattern.
 * @param pattern The parse tree pattern.
 * @param labels A mapping from accessLabel names to collections of
 * [ParseTree] objects located by the tree pattern matching process.
 * @param mismatchedNode The first node which failed to match the tree
 * pattern during the matching process.
 *
 * @exception IllegalArgumentException if `tree` is `null`
 * @exception IllegalArgumentException if `pattern` is `null`
 * @exception IllegalArgumentException if `labels` is `null`
 */
(
        /**
         * This is the backing field for [.getTree].
         */
        /**
         * Get the parse tree we are trying to match to a pattern.
         *
         * @return The [ParseTree] we are trying to match to a pattern.
         */

        val tree: ParseTree?,
        /**
         * This is the backing field for [.getPattern].
         */
        /**
         * Get the tree pattern we are matching against.
         *
         * @return The tree pattern we are matching against.
         */

        val pattern: ParseTreePattern?,
        /**
         * This is the backing field for [.getLabels].
         */
        /**
         * Return a mapping from accessLabel  [list of nodes].
         *
         *
         * The map includes special entries corresponding to the names of rules and
         * tokens referenced in tags in the original pattern. For additional
         * information, see the description of [.getAll].
         *
         * @return A mapping from labels to parse tree nodes. If the parse tree
         * pattern did not contain any rule or token tags, this map will be empty.
         */

        val labels: MultiMap<String, ParseTree>?,
        /**
         * This is the backing field for [.getMismatchedNode].
         */
        /**
         * Get the node at which we first detected a mismatch.
         *
         * @return the node at which we first detected a mismatch, or `null`
         * if the match was successful.
         */

        val mismatchedNode: ParseTree?) {

    init {
        if (tree == null) {
            throw IllegalArgumentException("tree cannot be null")
        }

        if (pattern == null) {
            throw IllegalArgumentException("pattern cannot be null")
        }

        if (labels == null) {
            throw IllegalArgumentException("labels cannot be null")
        }
    }

    /**
     * Get the last node associated with a specific `accessLabel`.
     *
     *
     * For example, for pattern `<id:ID>`, `get("id")` returns the
     * node matched for that `ID`. If more than one node
     * matched the specified accessLabel, only the last is returned. If there is
     * no node associated with the accessLabel, this returns `null`.
     *
     *
     * Pattern tags like `<ID>` and `<expr>` without labels are
     * considered to be labeled with `ID` and `expr`, respectively.
     *
     * @param label The accessLabel to check.
     *
     * @return The last [ParseTree] to match a tag with the specified
     * accessLabel, or `null` if no parse tree matched a tag with the accessLabel.
     */

    operator fun get(label: String): ParseTree? {
        val parseTrees = labels!!.get(label)
        return if (parseTrees == null || parseTrees!!.size == 0) {
            null
        } else parseTrees!!.get(parseTrees!!.size - 1)

// return last if multiple
    }

    /**
     * Return all nodes matching a rule or token tag with the specified accessLabel.
     *
     *
     * If the `accessLabel` is the name of a parser rule or token in the
     * grammar, the resulting list will contain both the parse trees matching
     * rule or tags explicitly labeled with the accessLabel and the complete set of
     * parse trees matching the labeled and unlabeled tags in the pattern for
     * the parser rule or token. For example, if `accessLabel` is `"foo"`,
     * the result will contain *all* of the following.
     *
     *
     *  * Parse tree nodes matching tags of the form `<foo:anyRuleName>` and
     * `<foo:AnyTokenName>`.
     *  * Parse tree nodes matching tags of the form `<anyLabel:foo>`.
     *  * Parse tree nodes matching tags of the form `<foo>`.
     *
     *
     * @param label The accessLabel.
     *
     * @return A collection of all [ParseTree] nodes matching tags with
     * the specified `accessLabel`. If no nodes matched the accessLabel, an empty list
     * is returned.
     */

    fun getAll(label: String): List<ParseTree> {
        return labels!!.get(label) ?: return emptyList()
    }

    /**
     * Gets a value indicating whether the match operation succeeded.
     *
     * @return `true` if the match operation succeeded; otherwise,
     * `false`.
     */
    fun succeeded(): Boolean {
        return mismatchedNode == null
    }

    /**
     * {@inheritDoc}
     */
    override fun toString(): String {
        return "Match ${if (succeeded()) "succeeded" else "failed"}; found ${labels!!.size} labels"
    }
}
