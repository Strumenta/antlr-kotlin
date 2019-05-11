/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

/**
 * This interface provides information about the vocabulary used by a
 * recognizer.
 *
 * @see Recognizer.getVocabulary
 * @author Sam Harwell
 */
interface Vocabulary {
    /**
     * Returns the highest token type value. It can be used to iterate from
     * zero to that number, inclusively, thus querying all stored entries.
     * @return the highest token type value
     */
    val maxTokenType: Int

    /**
     * Gets the string literal associated with a token type. The string returned
     * by this method, when not `null`, can be used unaltered in a parser
     * grammar to represent this token type.
     *
     *
     * The following table shows examples of lexer rules and the literal
     * names assigned to the corresponding token types.
     *
     * <table>
     * <tr>
     * <th>Rule</th>
     * <th>Literal Name</th>
     * <th>Java String Literal</th>
    </tr> *
     * <tr>
     * <td>`THIS : 'this';`</td>
     * <td>`'this'`</td>
     * <td>`"'this'"`</td>
    </tr> *
     * <tr>
     * <td>`SQUOTE : '\'';`</td>
     * <td>`'\''`</td>
     * <td>`"'\\''"`</td>
    </tr> *
     * <tr>
     * <td>`ID : [A-Z]+;`</td>
     * <td>n/a</td>
     * <td>`null`</td>
    </tr> *
    </table> *
     *
     * @param tokenType The token type.
     *
     * @return The string literal associated with the specified token type, or
     * `null` if no string literal is associated with the type.
     */
    fun getLiteralName(tokenType: Int): String?

    /**
     * Gets the symbolic name associated with a token type. The string returned
     * by this method, when not `null`, can be used unaltered in a parser
     * grammar to represent this token type.
     *
     *
     * This method supports token types defined by any of the following
     * methods:
     *
     *
     *  * Tokens created by lexer rules.
     *  * Tokens defined in a `tokens{}` block in a lexer or parser
     * grammar.
     *  * The implicitly defined `EOF` token, which has the token type
     * [Token.EOF].
     *
     *
     *
     * The following table shows examples of lexer rules and the literal
     * names assigned to the corresponding token types.
     *
     * <table>
     * <tr>
     * <th>Rule</th>
     * <th>Symbolic Name</th>
    </tr> *
     * <tr>
     * <td>`THIS : 'this';`</td>
     * <td>`THIS`</td>
    </tr> *
     * <tr>
     * <td>`SQUOTE : '\'';`</td>
     * <td>`SQUOTE`</td>
    </tr> *
     * <tr>
     * <td>`ID : [A-Z]+;`</td>
     * <td>`ID`</td>
    </tr> *
    </table> *
     *
     * @param tokenType The token type.
     *
     * @return The symbolic name associated with the specified token type, or
     * `null` if no symbolic name is associated with the type.
     */
    fun getSymbolicName(tokenType: Int): String?

    /**
     * Gets the display name of a token type.
     *
     *
     * ANTLR provides a default implementation of this method, but
     * applications are free to override the behavior in any manner which makes
     * sense for the application. The default implementation returns the first
     * result from the following list which produces a non-`null`
     * result.
     *
     *
     *  1. The result of [.getLiteralName]
     *  1. The result of [.getSymbolicName]
     *  1. The result of [Integer.toString]
     *
     *
     * @param tokenType The token type.
     *
     * @return The display name of the token type, for use in error reporting or
     * other user-visible messages which reference specific token types.
     */
    fun getDisplayName(tokenType: Int): String
}
