/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.tree.xpath
//
//import org.antlr.v4.runtime.*
//import org.antlr.v4.runtime.atn.ATN
//import org.antlr.v4.runtime.misc.Interval
//
///** Mimic the old XPathLexer from .g4 file  */
//open class XPathLexer(input: CharStream) : Lexer(input) {
//
//    val grammarFileName: String
//        get() = "XPathLexer.g4"
//
//    val vocabulary: Vocabulary
//        get() = VOCABULARY
//
//    val atn: ATN?
//        get() = null
//
//    protected var line = 1
//    var charPositionInLine = 0
//        protected set
//
//    fun getRuleNames(): Array<String> {
//        return ruleNames
//    }
//
//    fun getModeNames(): Array<String> {
//        return modeNames
//    }
//
//    @Deprecated("")
//    fun getTokenNames(): Array<String> {
//        return tokenNames
//    }
//
//    fun nextToken(): Token {
//        _tokenStartCharIndex = _input.index()
//        var t: CommonToken? = null
//        while (t == null) {
//            when (_input.LA(1)) {
//                '/' -> {
//                    consume()
//                    if (_input.LA(1) === '/') {
//                        consume()
//                        t = CommonToken(ANYWHERE, "//")
//                    } else {
//                        t = CommonToken(ROOT, "/")
//                    }
//                }
//                '*' -> {
//                    consume()
//                    t = CommonToken(WILDCARD, "*")
//                }
//                '!' -> {
//                    consume()
//                    t = CommonToken(BANG, "!")
//                }
//                '\'' -> {
//                    val s = matchString()
//                    t = CommonToken(STRING, s)
//                }
//                CharStream.EOF -> return CommonToken(EOF, "<EOF>")
//                else -> if (isNameStartChar(_input.LA(1))) {
//                    val id = matchID()
//                    if (Character.isUpperCase(id[0]))
//                        t = CommonToken(TOKEN_REF, id)
//                    else
//                        t = CommonToken(RULE_REF, id)
//                } else {
//                    throw LexerNoViableAltException(this, _input, _tokenStartCharIndex, null)
//                }
//            }
//        }
//        t!!.setStartIndex(_tokenStartCharIndex)
//        t!!.setCharPositionInLine(_tokenStartCharIndex)
//        t!!.setLine(line)
//        return t
//    }
//
//    fun consume() {
//        val curChar = _input.LA(1)
//        if (curChar == '\n') {
//            line++
//            charPositionInLine = 0
//        } else {
//            charPositionInLine++
//        }
//        _input.consume()
//    }
//
//    fun matchID(): String {
//        val start = _input.index()
//        consume() // drop start char
//        while (isNameChar(_input.LA(1))) {
//            consume()
//        }
//        return _input.getText(Interval.of(start, _input.index() - 1))
//    }
//
//    fun matchString(): String {
//        val start = _input.index()
//        consume() // drop first quote
//        while (_input.LA(1) !== '\'') {
//            consume()
//        }
//        consume() // drop last quote
//        return _input.getText(Interval.of(start, _input.index() - 1))
//    }
//
//    fun isNameChar(c: Int): Boolean {
//        return Character.isUnicodeIdentifierPart(c)
//    }
//
//    fun isNameStartChar(c: Int): Boolean {
//        return Character.isUnicodeIdentifierStart(c)
//    }
//
//    companion object {
//        val TOKEN_REF = 1
//        val RULE_REF = 2
//        val ANYWHERE = 3
//        val ROOT = 4
//        val WILDCARD = 5
//        val BANG = 6
//        val ID = 7
//        val STRING = 8
//        var modeNames = arrayOf("DEFAULT_MODE")
//
//        val ruleNames = arrayOf("ANYWHERE", "ROOT", "WILDCARD", "BANG", "ID", "NameChar", "NameStartChar", "STRING")
//
//        private val _LITERAL_NAMES = arrayOf<String>(null, null, null, "'//'", "'/'", "'*'", "'!'")
//        private val _SYMBOLIC_NAMES = arrayOf<String>(null, "TOKEN_REF", "RULE_REF", "ANYWHERE", "ROOT", "WILDCARD", "BANG", "ID", "STRING")
//        val VOCABULARY: Vocabulary = VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES)
//
//
//        @Deprecated("Use {@link #VOCABULARY} instead.")
//        val tokenNames: Array<String>
//
//        init {
//            tokenNames = arrayOfNulls(_SYMBOLIC_NAMES.size)
//            for (i in tokenNames.indices) {
//                tokenNames[i] = VOCABULARY.getLiteralName(i)
//                if (tokenNames[i] == null) {
//                    tokenNames[i] = VOCABULARY.getSymbolicName(i)
//                }
//
//                if (tokenNames[i] == null) {
//                    tokenNames[i] = "<INVALID>"
//                }
//            }
//        }
//    }
//}
