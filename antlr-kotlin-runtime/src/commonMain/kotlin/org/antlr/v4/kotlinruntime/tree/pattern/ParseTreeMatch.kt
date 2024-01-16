// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.misc.MultiMap
import org.antlr.v4.kotlinruntime.tree.ParseTree

/**
 * Represents the result of matching a [ParseTree] against a tree pattern.
 *
 * @param tree The parse tree to match against the pattern
 * @param pattern The parse tree pattern we are matching against
 * @param labels A mapping from label names to collections of [ParseTree]
 *   objects located by the tree pattern matching process.
 *
 *   The map includes special entries corresponding to the names of rules
 *   and tokens referenced in tags in the original pattern.
 *   For additional information, see the description of [getAll].
 *
 *   If the parse tree pattern did not contain any rule or token tags,
 *   this map will be empty.
 * @param mismatchedNode The first node which failed to match the tree
 *   pattern during the matching process.
 *   It is `null` if the match was successful.
 */
@Suppress("MemberVisibilityCanBePrivate")
public class ParseTreeMatch(
  public val tree: ParseTree,
  public val pattern: ParseTreePattern,
  public val labels: MultiMap<String, ParseTree>,
  public val mismatchedNode: ParseTree?,
) {
  /**
   * Get the last node associated with a specific [label].
   *
   * For example, for pattern `<id:ID>`, `this["id"]` returns the
   * node matched for that `ID`. If more than one node matched
   * the specified label, only the last is returned. If there
   * is no node associated with the label, this returns `null`.
   *
   * Pattern tags like `<ID>` and `<expr>` without labels are
   * considered to be labeled with `ID` and `expr`, respectively.
   *
   * @param label The label to check
   * @return The last [ParseTree] to match a tag with the specified label,
   *   or `null` if no parse tree matched a tag with the label
   */
  public operator fun get(label: String): ParseTree? {
    val parseTrees = labels[label]
    return if (parseTrees.isNullOrEmpty()) {
      null
    } else {
      // Return last if multiple
      parseTrees[parseTrees.size - 1]
    }
  }

  /**
   * Return all nodes matching a rule or token tag with the specified label.
   *
   * If the [label] is the name of a parser rule or token in the
   * grammar, the resulting list will contain both the parse trees matching
   * rule or tags explicitly labeled with the label and the complete set of
   * parse trees matching the labeled and unlabeled tags in the pattern for
   * the parser rule or token. For example, if [label] is `"foo"`,
   * the result will contain *all* of the following.
   *
   * - Parse tree nodes matching tags of the form `<foo:anyRuleName>` and `<foo:AnyTokenName>`
   * - Parse tree nodes matching tags of the form `<anyLabel:foo>`
   * - Parse tree nodes matching tags of the form `<foo>`
   *
   * @param label The label
   * @return A collection of all [ParseTree] nodes matching tags with
   *   the specified [label]. If no nodes matched the label,
   *   an empty list is returned
   */
  public fun getAll(label: String): List<ParseTree> =
    labels[label] ?: emptyList()

  /**
   * Gets a value indicating whether the match operation succeeded.
   *
   * @return `true` if the match operation succeeded, otherwise `false`
   */
  public fun succeeded(): Boolean =
    mismatchedNode == null

  override fun toString(): String {
    val state = if (succeeded()) {
      "succeeded"
    } else {
      "failed"
    }

    return "Match $state; found ${labels.size} labels"
  }
}
