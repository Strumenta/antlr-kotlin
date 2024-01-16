// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import kotlin.math.max

/**
 * Provides an implementation of [TokenSource] as a wrapper around a list
 * of [Token] objects.
 *
 * If the final token in the list is an [Token.EOF] token, it will be used
 * as the `EOF` token for every call to [nextToken] after the end of the
 * list is reached. Otherwise, an `EOF` token will be created.
 *
 * @param tokens The collection of [Token] objects to provide as a [TokenSource]
 * @param source The name of the [TokenSource].
 *   If this value is `null`, [sourceName] will attempt to infer the name from
 *   the next [Token] (or the previous token if the end of the input has been reached)
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ListTokenSource(
  protected val tokens: List<Token>,
  private val source: String? = null,
) : TokenSource {
  /**
   * The index into [tokens] of token to return by the next call to [nextToken].
   *
   * The end of the input is indicated by this value being greater than
   * or equal to the number of items in [tokens].
   */
  protected var i: Int = 0

  /**
   * This field caches the EOF token for the token source.
   */
  protected var eofToken: Token? = null

  override val sourceName: String
    get() = source ?: (inputStream?.sourceName ?: "List")

  override var tokenFactory: TokenFactory<*> = CommonTokenFactory.DEFAULT

  override val charPositionInLine: Int
    get() {
      if (i < tokens.size) {
        return tokens[i].charPositionInLine
      } else if (eofToken != null) {
        return eofToken!!.charPositionInLine
      } else if (tokens.isNotEmpty()) {
        // Have to calculate the result from the line/column of the previous
        // token, along with the text of the token
        val lastToken = tokens[tokens.size - 1]
        val tokenText = lastToken.text

        if (tokenText != null) {
          val lastNewLine = tokenText.lastIndexOf('\n')

          if (lastNewLine >= 0) {
            return tokenText.length - lastNewLine - 1
          }
        }

        return lastToken.charPositionInLine + lastToken.stopIndex - lastToken.startIndex + 1
      }

      // Only reach this if tokens is empty, meaning EOF occurs at the first
      // position in the input
      return 0
    }

  override val line: Int
    get() {
      if (i < tokens.size) {
        return tokens[i].line
      } else if (eofToken != null) {
        return eofToken!!.line
      } else if (tokens.isNotEmpty()) {
        // Have to calculate the result from the line/column of the previous
        // token, along with the text of the token
        val lastToken = tokens[tokens.size - 1]
        var line = lastToken.line
        val tokenText = lastToken.text

        if (tokenText != null) {
          for (element in tokenText) {
            if (element == '\n') {
              line++
            }
          }
        }

        // If no text is available, assume the token did not contain any newline characters
        return line
      }

      // Only reach this if tokens is empty, meaning EOF occurs at the first
      // position in the input
      return 1
    }

  override val inputStream: CharStream?
    get() {
      if (i < tokens.size) {
        return tokens[i].inputStream
      } else if (eofToken != null) {
        return eofToken!!.inputStream
      } else if (tokens.isNotEmpty()) {
        return tokens[tokens.size - 1].inputStream
      }

      // No input stream information is available
      return null
    }

  override fun nextToken(): Token {
    if (i >= tokens.size) {
      if (eofToken == null) {
        var start = -1

        if (tokens.isNotEmpty()) {
          val previousStop = tokens[tokens.size - 1].stopIndex

          if (previousStop != -1) {
            start = previousStop + 1
          }
        }

        val stop = max(-1, start - 1)
        eofToken = tokenFactory.create(
          Pair<TokenSource, CharStream?>(this, inputStream),
          Token.EOF,
          "EOF",
          Token.DEFAULT_CHANNEL,
          start,
          stop,
          line,
          charPositionInLine,
        )
      }

      return eofToken!!
    }

    val t = tokens[i]

    if (i == tokens.size - 1 && t.type == Token.EOF) {
      eofToken = t
    }

    i++
    return t
  }
}
