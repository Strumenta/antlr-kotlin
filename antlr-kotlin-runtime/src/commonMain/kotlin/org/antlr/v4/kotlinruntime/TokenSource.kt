// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * A source of tokens must provide a sequence of tokens via [nextToken],
 * and also must reveal its source of characters.
 *
 * [CommonToken]'s text is computed from a [CharStream].
 * It only stores indices into the char stream.
 *
 * Errors from the lexer are never passed to the parser. Either you want to keep
 * going or you do not upon token recognition error. If you do not want to
 * continue lexing then you do not want to continue parsing. Just throw an
 * exception not under [RecognitionException] and Kotlin will naturally toss
 * you all the way out of the recognizers. If you want to continue lexing then
 * you should not throw an exception to the parser - it has already requested a
 * token. Keep lexing until you get a valid one. Just report errors and keep
 * going, looking for a valid token.
 */
public interface TokenSource {
  /**
   * Get the line number for the current position in the input stream.
   *
   * The first line in the input is line `1`.
   *
   * @return The line number for the current position in the input stream, or
   *   `0` if the current token source does not track line numbers
   */
  public val line: Int

  /**
   * Get the index into the current line for the current position in the input stream.
   *
   * The first character on a line has position `0`.
   *
   * @return The line number for the current position in the input stream, or
   *   `-1` if the current token source does not track character positions
   */
  public val charPositionInLine: Int

  /**
   * Get the [CharStream] from which this token source is currently
   * providing tokens.
   *
   * @return The [CharStream] associated with the current position in
   *   the input, or `null` if no input stream is available for the token source
   */
  public val inputStream: CharStream?

  /**
   * Gets the name of the underlying input source.
   *
   * This method returns a non-`null`, non-empty string.
   * If such a name is not known, this method returns [IntStream.UNKNOWN_SOURCE_NAME].
   */
  public val sourceName: String

  /**
   * The [TokenFactory] this token source is currently using for
   * creating [Token] objects from the input.
   */
  public var tokenFactory: TokenFactory<*>

  /**
   * Return a [Token] object from your input stream (usually a [CharStream]).
   *
   * Do not fail/return upon lexing error. Keep chewing on the characters
   * until you get a good one.
   *
   * Errors are not passed through to the parser.
   */
  public fun nextToken(): Token
}
