/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.Math
import com.strumenta.kotlinmultiplatform.NullPointerException
import org.antlr.v4.kotlinruntime.misc.Pair

/**
 * Provides an implementation of [TokenSource] as a wrapper around a list
 * of [Token] objects.
 *
 *
 * If the final token in the list is an [Token.EOF] token, it will be used
 * as the EOF token for every call to [.nextToken] after the end of the
 * list is reached. Otherwise, an EOF token will be created.
 */
class ListTokenSource
/**
 * Constructs a new [ListTokenSource] instance from the specified
 * collection of [Token] objects and source name.
 *
 * @param tokens The collection of [Token] objects to provide as a
 * [TokenSource].
 * @param sourceName The name of the [TokenSource]. If this value is
 * `null`, [.getSourceName] will attempt to infer the name from
 * the next [Token] (or the previous token if the end of the input has
 * been reached).
 *
 * @exception NullPointerException if `tokens` is `null`
 */
constructor(
        /**
         * The wrapped collection of [Token] objects to return.
         */
        protected val tokens: List<Token>?,
        /**
         * The name of the input source. If this value is `null`, a call to
         * [.getSourceName] should return the source name used to create the
         * the next token in [.tokens] (or the previous token if the end of
         * the input has been reached).
         */
        public override val sourceName: String? = null) : TokenSource {

    /**
     * The index into [.tokens] of token to return by the next call to
     * [.nextToken]. The end of the input is indicated by this value
     * being greater than or equal to the number of items in [.tokens].
     */
    protected var i: Int = 0

    /**
     * This field caches the EOF token for the token source.
     */
    protected var eofToken: Token? = null

    /**
     * This is the backing field for [.getTokenFactory] and
     * [setTokenFactory].
     */
    /**
     * {@inheritDoc}
     */
    /**
     * {@inheritDoc}
     */
    override var tokenFactory: TokenFactory<*> = CommonTokenFactory.DEFAULT

    /**
     * {@inheritDoc}
     */
    override// have to calculate the result from the line/column of the previous
            // token, along with the text of the token.
            // only reach this if tokens is empty, meaning EOF occurs at the first
            // position in the input
    val charPositionInLine: Int
        get() {
            if (i < tokens!!.size) {
                return tokens.get(i).charPositionInLine
            } else if (eofToken != null) {
                return eofToken!!.charPositionInLine
            } else if (tokens.size > 0) {
                val lastToken = tokens.get(tokens.size - 1)
                val tokenText = lastToken.text
                if (tokenText != null) {
                    val lastNewLine = tokenText!!.lastIndexOf('\n')
                    if (lastNewLine >= 0) {
                        return tokenText!!.length - lastNewLine - 1
                    }
                }

                return lastToken.charPositionInLine + lastToken.stopIndex - lastToken.startIndex + 1
            }
            return 0
        }

    /**
     * {@inheritDoc}
     */
    override// have to calculate the result from the line/column of the previous
            // token, along with the text of the token.
            // if no text is available, assume the token did not contain any newline characters.
            // only reach this if tokens is empty, meaning EOF occurs at the first
            // position in the input
    val line: Int
        get() {
            if (i < tokens!!.size) {
                return tokens.get(i).line
            } else if (eofToken != null) {
                return eofToken!!.line
            } else if (tokens.size > 0) {
                val lastToken = tokens.get(tokens.size - 1)
                var line = lastToken.line

                val tokenText = lastToken.text
                if (tokenText != null) {
                    for (i in 0 until tokenText!!.length) {
                        if (tokenText!!.get(i) == '\n') {
                            line++
                        }
                    }
                }
                return line
            }
            return 1
        }


    override fun readInputStream(): CharStream? {
        if (i < tokens!!.size) {
            return tokens!!.get(i).inputStream
        } else if (eofToken != null) {
            return eofToken!!.inputStream
        } else if (tokens.size > 0) {
            return tokens.get(tokens.size - 1).inputStream
        }
        return null
    }

    init {
        if (tokens == null) {
            throw NullPointerException("tokens cannot be null")
        }
    }

    /**
     * {@inheritDoc}
     */
    override fun nextToken(): Token {
        if (i >= tokens!!.size) {
            if (eofToken == null) {
                var start = -1
                if (tokens.size > 0) {
                    val previousStop = tokens.get(tokens.size - 1).stopIndex
                    if (previousStop != -1) {
                        start = previousStop + 1
                    }
                }

                val stop = Math.max(-1, start - 1)
                eofToken = tokenFactory.create(Pair<TokenSource, CharStream>(this, readInputStream()), Token.EOF, "EOF", Token.DEFAULT_CHANNEL, start, stop, line, charPositionInLine)
            }

            return eofToken!!
        }

        val t = tokens.get(i)
        if (i == tokens.size - 1 && t.type == Token.EOF) {
            eofToken = t
        }

        i++
        return t
    }

//    /**
//     * {@inheritDoc}
//     */
//    fun getSourceName(): String {
//        if (sourceName != null) {
//            return sourceName
//        }
//
//        val inputStream = inputStream
//        return if (inputStream != null) {
//            inputStream!!.sourceName!!
//        } else "List"
//
//    }
}
/**
 * Constructs a new [ListTokenSource] instance from the specified
 * collection of [Token] objects.
 *
 * @param tokens The collection of [Token] objects to provide as a
 * [TokenSource].
 * @exception NullPointerException if `tokens` is `null`
 */
