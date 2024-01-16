// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * This interface provides information about the vocabulary used by a
 * recognizer.
 *
 * @see Recognizer.vocabulary
 * @author Sam Harwell
 */
public interface Vocabulary {
  /**
   * Returns the highest token type value. It can be used to iterate from
   * zero to that number, inclusively, thus querying all stored entries.
   *
   * @return The highest token type value
   */
  public val maxTokenType: Int

  /**
   * Gets the string literal associated with a token type. The string returned
   * by this method, when not `null`, can be used unaltered in a parser
   * grammar to represent this token type.
   *
   * The following table shows examples of lexer rules and the literal
   * names assigned to the corresponding token types.
   *
   * ```
   * | Rule           | Literal Name | Java String Literal |
   * |----------------|--------------|---------------------|
   * | THIS : 'this'; | 'this'       | "'this'"            |
   * | SQUOTE : '\''; | '\''         | "'\\''"             |
   * | ID : [A-Z]+;   | n/a          | null                |
   * ```
   *
   * @param tokenType The token type
   * @return The string literal associated with the specified token type, or
   *   `null` if no string literal is associated with the type
   */
  public fun getLiteralName(tokenType: Int): String?

  /**
   * Gets the symbolic name associated with a token type. The string returned
   * by this method, when not `null`, can be used unaltered in a parser
   * grammar to represent this token type.
   *
   * This method supports token types defined by any of the following
   * methods:
   *
   *  - Tokens created by lexer rules
   *  - Tokens defined in a `tokens {}` block in a lexer or parser grammar
   *  - The implicitly defined `EOF` token, which has the token type [Token.EOF]
   *
   * The following table shows examples of lexer rules and the literal
   * names assigned to the corresponding token types.
   *
   * ```
   * | Rule           | Symbolic Name |
   * |----------------|---------------|
   * | THIS : 'this'; | THIS          |
   * | SQUOTE : '\''; | SQUOTE        |
   * | ID : [A-Z]+;   | ID            |
   * ```
   *
   * @param tokenType The token type
   * @return The symbolic name associated with the specified token type, or
   *   `null` if no symbolic name is associated with the type
   */
  public fun getSymbolicName(tokenType: Int): String?

  /**
   * Gets the display name of a token type.
   *
   * ANTLR provides a default implementation of this method, but
   * applications are free to override the behavior in any manner which makes
   * sense for the application. The default implementation returns the first
   * result from the following list which produces a non-`null` result:
   *
   *  1. The result of [getLiteralName]
   *  2. The result of [getSymbolicName]
   *  3. The result of [Int.toString]
   *
   * @param tokenType The token type
   * @return The display name of the token type, for use in error reporting or
   *   other user-visible messages which reference specific token types
   */
  public fun getDisplayName(tokenType: Int): String
}
