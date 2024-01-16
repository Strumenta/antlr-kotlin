// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.xpath.XPath

/**
 * A pattern like `<ID> = <expr>;` converted to a [ParseTree] by
 * [ParseTreePatternMatcher.compile].
 *
 * @param matcher The [ParseTreePatternMatcher] which created this tree pattern
 * @param pattern The tree pattern in concrete syntax form
 * @param patternRuleIndex The parser rule which serves as the root of the tree pattern
 * @param patternTree The tree pattern in [ParseTree] form. The rule and token tags from
 *   the pattern are present in the parse tree as terminal nodes with a symbol
 *   of type [RuleTagToken] or [TokenTagToken]
 */
@Suppress("MemberVisibilityCanBePrivate")
public class ParseTreePattern(
  public val matcher: ParseTreePatternMatcher,
  public val pattern: String,
  public val patternRuleIndex: Int,
  public val patternTree: ParseTree,
) {
  /**
   * Match a specific parse tree against this tree pattern.
   *
   * @param tree The parse tree to match against this tree pattern
   * @return A [ParseTreeMatch] object describing the result of the
   *   match operation. The [ParseTreeMatch.succeeded] method can be
   *   used to determine whether the match was successful
   */
  public fun match(tree: ParseTree): ParseTreeMatch =
    matcher.match(tree, this)

  /**
   * Determine whether a parse tree matches this tree pattern.
   *
   * @param tree The parse tree to match against this tree pattern
   * @return `true` if [tree] is a match for the current tree pattern, otherwise `false`
   */
  public fun matches(tree: ParseTree): Boolean =
    matcher.match(tree, this).succeeded()

  /**
   * Find all nodes using XPath and then try to match those subtrees against
   * this tree pattern.
   *
   * @param tree The [ParseTree] to match against this pattern
   * @param xpath An expression matching the nodes
   *
   * @return A collection of [ParseTreeMatch] objects describing the
   *   successful matches. Unsuccessful matches are omitted from the result,
   *   regardless of the reason for the failure
   */
  public fun findAll(tree: ParseTree, xpath: String): List<ParseTreeMatch> {
    val subtrees = XPath.findAll(tree, xpath, matcher.parser)
    val matches = ArrayList<ParseTreeMatch>()

    for (t in subtrees) {
      val match = match(t)

      if (match.succeeded()) {
        matches.add(match)
      }
    }

    return matches
  }
}
