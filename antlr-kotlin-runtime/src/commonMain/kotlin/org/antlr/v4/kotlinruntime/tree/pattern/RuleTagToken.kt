// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.TokenSource

/**
 * A [Token] object representing an entire subtree matched by a parser
 * rule; e.g., `<expr>`. These tokens are created for [TagChunk]
 * chunks where the tag corresponds to a parser rule.
 *
 * @param ruleName The name of the rule associated with this rule tag
 * @param type The token type for the current token. This is the token type assigned to
 *   the bypass alternative for the rule during ATN deserialization
 * @param label The label associated with the rule tag, or `null` if this is an unlabeled rule tag
 *
 * @throws IllegalArgumentException If [ruleName] is empty
 */
@Suppress("MemberVisibilityCanBePrivate")
public class RuleTagToken(
  public val ruleName: String,
  override val type: Int,
  public val label: String? = null,
) : Token {
  init {
    if (ruleName.isEmpty()) {
      throw IllegalArgumentException("ruleName cannot be null or empty.")
    }
  }

  /**
   * Rule tag tokens are always placed on the [Token.DEFAULT_CHANNEL].
   */
  override val channel: Int = Token.DEFAULT_CHANNEL

  /**
   * Returns the rule tag formatted with `<` and `>` delimiters.
   */
  override val text: String =
    if (label != null) {
      "<$label:$ruleName>"
    } else {
      "<$ruleName>"
    }

  /**
   * The implementation for [RuleTagToken] always returns `0`.
   */
  override val line: Int = 0

  /**
   * The implementation for [RuleTagToken] always returns `-1`.
   */
  override val charPositionInLine: Int = -1

  /**
   * The implementation for [RuleTagToken] always returns `-1`.
   */
  override val tokenIndex: Int = -1

  /**
   * The implementation for [RuleTagToken] always returns `-1`.
   */
  override val startIndex: Int = -1

  /**
   * The implementation for [RuleTagToken] always returns `-1`.
   */
  override val stopIndex: Int = -1

  /**
   * The implementation for [RuleTagToken] always returns `null`.
   */
  override val tokenSource: TokenSource? = null

  /**
   * The implementation for [RuleTagToken] always returns `null`.
   */
  override val inputStream: CharStream? = null

  /**
   * The implementation for [RuleTagToken] returns a string of the form `ruleName:bypassTokenType`.
   */
  override fun toString(): String =
    "$ruleName:$type"
}
