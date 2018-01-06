/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.tree.ParseTree

/**
 * A pattern like `<ID> = <expr>;` converted to a [ParseTree] by
 * [ParseTreePatternMatcher.compile].
 */
class ParseTreePattern
/**
 * Construct a new instance of the [ParseTreePattern] class.
 *
 * @param matcher The [ParseTreePatternMatcher] which created this
 * tree pattern.
 * @param pattern The tree pattern in concrete syntax form.
 * @param patternRuleIndex The parser rule which serves as the root of the
 * tree pattern.
 * @param patternTree The tree pattern in [ParseTree] form.
 */
(
        /**
         * This is the backing field for [.getMatcher].
         */

        /**
         * Get the [ParseTreePatternMatcher] which created this tree pattern.
         *
         * @return The [ParseTreePatternMatcher] which created this tree
         * pattern.
         */

        val matcher: ParseTreePatternMatcher,
        /**
         * This is the backing field for [.getPattern].
         */

        /**
         * Get the tree pattern in concrete syntax form.
         *
         * @return The tree pattern in concrete syntax form.
         */

        val pattern: String,
        /**
         * This is the backing field for [.getPatternRuleIndex].
         */
        /**
         * Get the parser rule which serves as the outermost rule for the tree
         * pattern.
         *
         * @return The parser rule which serves as the outermost rule for the tree
         * pattern.
         */
        val patternRuleIndex: Int,
        /**
         * This is the backing field for [.getPatternTree].
         */

        /**
         * Get the tree pattern as a [ParseTree]. The rule and token tags from
         * the pattern are present in the parse tree as terminal nodes with a symbol
         * of type [RuleTagToken] or [TokenTagToken].
         *
         * @return The tree pattern as a [ParseTree].
         */

        val patternTree: ParseTree) {

    /**
     * Match a specific parse tree against this tree pattern.
     *
     * @param tree The parse tree to match against this tree pattern.
     * @return A [ParseTreeMatch] object describing the result of the
     * match operation. The [ParseTreeMatch.succeeded] method can be
     * used to determine whether or not the match was successful.
     */

    fun match(tree: ParseTree): ParseTreeMatch {
        return matcher.match(tree, this)
    }

    /**
     * Determine whether or not a parse tree matches this tree pattern.
     *
     * @param tree The parse tree to match against this tree pattern.
     * @return `true` if `tree` is a match for the current tree
     * pattern; otherwise, `false`.
     */
    fun matches(tree: ParseTree): Boolean {
        return matcher.match(tree, this).succeeded()
    }

    /**
     * Find all nodes using XPath and then try to match those subtrees against
     * this tree pattern.
     *
     * @param tree The [ParseTree] to match against this pattern.
     * @param xpath An expression matching the nodes
     *
     * @return A collection of [ParseTreeMatch] objects describing the
     * successful matches. Unsuccessful matches are omitted from the result,
     * regardless of the reason for the failure.
     */

    fun findAll(tree: ParseTree, xpath: String): List<ParseTreeMatch> {
        TODO()
//        val subtrees = XPath.findAll(tree, xpath, matcher.parser)
//        val matches = ArrayList<ParseTreeMatch>()
//        for (t in subtrees) {
//            val match = match(t)
//            if (match.succeeded()) {
//                matches.add(match)
//            }
//        }
//        return matches
    }
}
