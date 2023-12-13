/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.tree.xpath


import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * Mimic the old [XPathLexer] from `.g4` file.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class XPathLexer(input: CharStream) : Lexer(input) {
  public companion object {
    public const val TOKEN_REF: Int = 1
    public const val RULE_REF: Int = 2
    public const val ANYWHERE: Int = 3
    public const val ROOT: Int = 4
    public const val WILDCARD: Int = 5
    public const val BANG: Int = 6
    public const val ID: Int = 7
    public const val STRING: Int = 8
  }

  private var _line: Int = 1

  @Suppress("UNUSED_PARAMETER")
  override var interpreter: LexerATNSimulator
    get() = throw UnsupportedOperationException("Should never access 'interpreter'")
    set(value) = throw UnsupportedOperationException("Should never access 'interpreter'")

  override val grammarFileName: String
    get() = "XPathLexer.g4"

  override val ruleNames: Array<String> =
    arrayOf("ANYWHERE", "ROOT", "WILDCARD", "BANG", "ID", "NameChar", "NameStartChar", "STRING")

  override val modeNames: Array<String> =
    arrayOf("DEFAULT_MODE")

  override val vocabulary: Vocabulary =
    VocabularyImpl(
      arrayOf(null, null, null, "'//'", "'/'", "'*'", "'!'"),
      arrayOf(null, "TOKEN_REF", "RULE_REF", "ANYWHERE", "ROOT", "WILDCARD", "BANG", "ID", "STRING"),
    )

  override val atn: ATN
    get() = throw UnsupportedOperationException("Should never access 'atn'")

  override var charPositionInLine: Int = 0

  override fun nextToken(): Token {
    _tokenStartCharIndex = _input.index()
    var t: CommonToken? = null

    while (t == null) {
      when (_input.LA(1)) {
        '/'.code -> {
          consume()

          if (_input.LA(1) == '/'.code) {
            consume()
            t = CommonToken(ANYWHERE, "//")
          } else {
            t = CommonToken(ROOT, "/")
          }
        }
        '*'.code -> {
          consume()
          t = CommonToken(WILDCARD, "*")
        }
        '!'.code -> {
          consume()
          t = CommonToken(BANG, "!")
        }
        '\''.code -> {
          val s = matchString()
          t = CommonToken(STRING, s)
        }
        CharStream.EOF -> {
          return CommonToken(EOF, "<EOF>")
        }
        else -> {
          if (isNameStartChar(_input.LA(1))) {
            val id = matchID()
            t = if (id[0].isUpperCase()) {
              CommonToken(TOKEN_REF, id)
            } else {
              CommonToken(RULE_REF, id)
            }
          } else {
            throw LexerNoViableAltException(this, _input, _tokenStartCharIndex, null)
          }
        }
      }
    }

    t.startIndex = _tokenStartCharIndex
    t.charPositionInLine = _tokenStartCharIndex
    t.line = _line
    return t
  }

  public fun consume() {
    val curChar = _input.LA(1)

    if (curChar == '\n'.code) {
      _line++
      charPositionInLine = 0
    } else {
      charPositionInLine++
    }

    _input.consume()
  }

  public fun matchID(): String {
    val start = _input.index()

    // Drop start char
    consume()

    while (isNameChar(_input.LA(1))) {
      consume()
    }

    return _input.getText(Interval.of(start, _input.index() - 1))
  }

  public fun matchString(): String {
    val start = _input.index()

    // Drop first quote
    consume()

    while (_input.LA(1) != '\''.code) {
      consume()
    }

    // Drop last quote
    consume()
    return _input.getText(Interval.of(start, _input.index() - 1))
  }

  public fun isNameChar(@Suppress("UNUSED_PARAMETER") c: Int): Boolean {
    TODO("Need isUnicodeIdentifierPart")
    // return Character.isUnicodeIdentifierPart(c)
  }

  public fun isNameStartChar(@Suppress("UNUSED_PARAMETER") c: Int): Boolean {
    TODO("Need isUnicodeIdentifierStart")
    // return Character.isUnicodeIdentifierStart(c)
  }
}
