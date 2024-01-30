// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

import com.strumenta.antlrkotlin.benchmarks.generated.MySQLLexer
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.Token

@Suppress("MemberVisibilityCanBePrivate")
public abstract class MySQLBaseLexer(input: CharStream) : Lexer(input), MySQLRecognizerCommon {
  public companion object {
    /**
     * Determines if the given type is a relational operator.
     *
     * @param type The type to check
     * @return `true` if the type is a relational operator, `false` otherwise
     */
    @Suppress("DuplicatedCode")
    public fun isRelation(type: Int): Boolean =
      type == MySQLLexer.Tokens.EQUAL_OPERATOR
        || type == MySQLLexer.Tokens.ASSIGN_OPERATOR
        || type == MySQLLexer.Tokens.NULL_SAFE_EQUAL_OPERATOR
        || type == MySQLLexer.Tokens.GREATER_OR_EQUAL_OPERATOR
        || type == MySQLLexer.Tokens.GREATER_THAN_OPERATOR
        || type == MySQLLexer.Tokens.LESS_OR_EQUAL_OPERATOR
        || type == MySQLLexer.Tokens.LESS_THAN_OPERATOR
        || type == MySQLLexer.Tokens.NOT_EQUAL_OPERATOR
        || type == MySQLLexer.Tokens.NOT_EQUAL2_OPERATOR
        || type == MySQLLexer.Tokens.PLUS_OPERATOR
        || type == MySQLLexer.Tokens.MINUS_OPERATOR
        || type == MySQLLexer.Tokens.MULT_OPERATOR
        || type == MySQLLexer.Tokens.DIV_OPERATOR
        || type == MySQLLexer.Tokens.MOD_OPERATOR
        || type == MySQLLexer.Tokens.LOGICAL_NOT_OPERATOR
        || type == MySQLLexer.Tokens.BITWISE_NOT_OPERATOR
        || type == MySQLLexer.Tokens.SHIFT_LEFT_OPERATOR
        || type == MySQLLexer.Tokens.SHIFT_RIGHT_OPERATOR
        || type == MySQLLexer.Tokens.LOGICAL_AND_OPERATOR
        || type == MySQLLexer.Tokens.BITWISE_AND_OPERATOR
        || type == MySQLLexer.Tokens.BITWISE_XOR_OPERATOR
        || type == MySQLLexer.Tokens.LOGICAL_OR_OPERATOR
        || type == MySQLLexer.Tokens.BITWISE_OR_OPERATOR
        || type == MySQLLexer.Tokens.OR_SYMBOL
        || type == MySQLLexer.Tokens.XOR_SYMBOL
        || type == MySQLLexer.Tokens.AND_SYMBOL
        || type == MySQLLexer.Tokens.IS_SYMBOL
        || type == MySQLLexer.Tokens.BETWEEN_SYMBOL
        || type == MySQLLexer.Tokens.LIKE_SYMBOL
        || type == MySQLLexer.Tokens.REGEXP_SYMBOL
        || type == MySQLLexer.Tokens.IN_SYMBOL
        || type == MySQLLexer.Tokens.SOUNDS_SYMBOL
        || type == MySQLLexer.Tokens.NOT_SYMBOL
  }

  public override var serverVersion: Int = 0
  public override var sqlModes: MutableSet<SqlMode> = HashSet()

  // Used to check repertoires
  public var charSets: Set<String> = emptySet()

  protected var inVersionComment: Boolean = false
  private var pendingTokens = ArrayList<Token>()

  /**
   * Determines if the given type is a number type.
   *
   * @param type The type to check
   * @return `true` if the type is a number type, `false` otherwise
   */
  public fun isNumber(type: Int): Boolean =
    type == MySQLLexer.Tokens.INT_NUMBER
      || type == MySQLLexer.Tokens.LONG_NUMBER
      || type == MySQLLexer.Tokens.ULONGLONG_NUMBER
      || type == MySQLLexer.Tokens.FLOAT_NUMBER
      || type == MySQLLexer.Tokens.HEX_NUMBER
      || type == MySQLLexer.Tokens.BIN_NUMBER
      || type == MySQLLexer.Tokens.DECIMAL_NUMBER

  /**
   * Determines if the given type is a delimiter.
   *
   * @param type The type to check
   * @return `true` if the type is an operator, `false` otherwise
   */
  public fun isDelimiter(type: Int): Boolean =
    type == MySQLLexer.Tokens.DOT_SYMBOL
      || type == MySQLLexer.Tokens.COMMA_SYMBOL
      || type == MySQLLexer.Tokens.SEMICOLON_SYMBOL
      || type == MySQLLexer.Tokens.COLON_SYMBOL

  /**
   * Determines if the given type is an operator.
   *
   * @param type The type to check
   * @return `true` if the type is an operator, `false` otherwise
   */
  @Suppress("DuplicatedCode")
  public fun isOperator(type: Int): Boolean =
    type == MySQLLexer.Tokens.EQUAL_OPERATOR
      || type == MySQLLexer.Tokens.ASSIGN_OPERATOR
      || type == MySQLLexer.Tokens.NULL_SAFE_EQUAL_OPERATOR
      || type == MySQLLexer.Tokens.GREATER_OR_EQUAL_OPERATOR
      || type == MySQLLexer.Tokens.GREATER_THAN_OPERATOR
      || type == MySQLLexer.Tokens.LESS_OR_EQUAL_OPERATOR
      || type == MySQLLexer.Tokens.LESS_THAN_OPERATOR
      || type == MySQLLexer.Tokens.NOT_EQUAL_OPERATOR
      || type == MySQLLexer.Tokens.NOT_EQUAL2_OPERATOR
      || type == MySQLLexer.Tokens.PLUS_OPERATOR
      || type == MySQLLexer.Tokens.MINUS_OPERATOR
      || type == MySQLLexer.Tokens.MULT_OPERATOR
      || type == MySQLLexer.Tokens.DIV_OPERATOR
      || type == MySQLLexer.Tokens.MOD_OPERATOR
      || type == MySQLLexer.Tokens.LOGICAL_NOT_OPERATOR
      || type == MySQLLexer.Tokens.BITWISE_NOT_OPERATOR
      || type == MySQLLexer.Tokens.SHIFT_LEFT_OPERATOR
      || type == MySQLLexer.Tokens.SHIFT_RIGHT_OPERATOR
      || type == MySQLLexer.Tokens.LOGICAL_AND_OPERATOR
      || type == MySQLLexer.Tokens.BITWISE_AND_OPERATOR
      || type == MySQLLexer.Tokens.BITWISE_XOR_OPERATOR
      || type == MySQLLexer.Tokens.LOGICAL_OR_OPERATOR
      || type == MySQLLexer.Tokens.BITWISE_OR_OPERATOR
      || type == MySQLLexer.Tokens.OPEN_PAR_SYMBOL
      || type == MySQLLexer.Tokens.CLOSE_PAR_SYMBOL
      || type == MySQLLexer.Tokens.AT_SIGN_SYMBOL
      || type == MySQLLexer.Tokens.AT_AT_SIGN_SYMBOL
      || type == MySQLLexer.Tokens.PARAM_MARKER
      || type == MySQLLexer.Tokens.ALL_SYMBOL
      || type == MySQLLexer.Tokens.AND_SYMBOL
      || type == MySQLLexer.Tokens.ANY_SYMBOL
      || type == MySQLLexer.Tokens.BETWEEN_SYMBOL
      || type == MySQLLexer.Tokens.EXISTS_SYMBOL
      || type == MySQLLexer.Tokens.IN_SYMBOL
      || type == MySQLLexer.Tokens.LIKE_SYMBOL
      || type == MySQLLexer.Tokens.NOT_SYMBOL
      || type == MySQLLexer.Tokens.OR_SYMBOL
      || type == MySQLLexer.Tokens.SOME_SYMBOL
      || type == MySQLLexer.Tokens.EXCEPT_SYMBOL
      || type == MySQLLexer.Tokens.INTERSECT_SYMBOL
      || type == MySQLLexer.Tokens.UNION_SYMBOL
      || type == MySQLLexer.Tokens.CROSS_SYMBOL
      || type == MySQLLexer.Tokens.FULL_SYMBOL
      || type == MySQLLexer.Tokens.INNER_SYMBOL
      || type == MySQLLexer.Tokens.JOIN_SYMBOL
      || type == MySQLLexer.Tokens.LEFT_SYMBOL
      || type == MySQLLexer.Tokens.NATURAL_SYMBOL
      || type == MySQLLexer.Tokens.OUTER_SYMBOL
      || type == MySQLLexer.Tokens.RIGHT_SYMBOL
      || type == MySQLLexer.Tokens.STRAIGHT_JOIN_SYMBOL
      || type == MySQLLexer.Tokens.CONTAINS_SYMBOL
      || type == MySQLLexer.Tokens.IS_SYMBOL
      || type == MySQLLexer.Tokens.NULL_SYMBOL

  /**
   * Determines if the given SQL mode is currently active in the lexer.
   *
   * @param mode The mode to check
   * @return `true` if the mode is one of the currently active modes, `false` otherwise
   */
  public override fun isSqlModeActive(mode: SqlMode): Boolean =
    sqlModes.contains(mode)

  /**
   * Converts a mode string into individual mode flags.
   *
   * @param modes The input string to parse
   */
  public override fun sqlModeFromString(modes: String) {
    sqlModes = HashSet()

    for (mode in modes.uppercase().split(",")) {
      when (mode) {
        "ANSI",
        "DB2",
        "MAXDB",
        "MSSQL",
        "ORACLE",
        "POSTGRESQL" -> {
          sqlModes.add(SqlMode.AnsiQuotes)
          sqlModes.add(SqlMode.PipesAsConcat)
          sqlModes.add(SqlMode.IgnoreSpace)
        }
        "ANSI_QUOTES" -> {
          sqlModes.add(SqlMode.AnsiQuotes)
        }
        "PIPES_AS_CONCAT" -> {
          sqlModes.add(SqlMode.PipesAsConcat)
        }
        "NO_BACKSLASH_ESCAPES" -> {
          sqlModes.add(SqlMode.NoBackslashEscapes)
        }
        "IGNORE_SPACE" -> {
          sqlModes.add(SqlMode.IgnoreSpace)
        }
        "HIGH_NOT_PRECEDENCE",
        "MYSQL323",
        "MYSQL40" -> {
          sqlModes.add(SqlMode.HighNotPrecedence)
        }
      }
    }
  }

  override fun reset() {
    inVersionComment = false
    super.reset()
  }

  override fun nextToken(): Token {
    // First respond with pending tokens to the next token request, if there are any
    var pending = pendingTokens.removeFirstOrNull()

    if (pending != null) {
      return pending
    }

    // Let the main lexer class run the next token recognition.
    // This might create additional tokens again.
    val next = super.nextToken()
    pending = pendingTokens.removeFirstOrNull()

    if (pending != null) {
      pendingTokens.add(next)
      return pending
    }

    return next
  }

  /**
   * Checks if the version number in the token text is less than or equal to the current server version.
   *
   * @param text The text from a matched token
   * @return `true` if so the number matches, `false` otherwise
   */
  protected fun checkMySQLVersion(text: String): Boolean {
    if (text.length < 8) { // Minimum is: /*!12345
      return false
    }

    // Skip version comment introducer.
    val version = text.substring(3).toInt()

    if (version <= serverVersion) {
      inVersionComment = true
      return true
    }

    return false
  }

  /**
   * Called when a keyword was consumed that represents an internal MySQL function and checks if that keyword is
   * followed by an open parenthesis. If not then it is not considered a keyword but treated like a normal identifier.
   *
   * @param proposed The token type to use if the check succeeds
   * @return If a function call is found then return the proposed token type,
   *   otherwise just [MySQLLexer.Tokens.IDENTIFIER]
   */
  protected fun determineFunction(proposed: Int): Int {
    // Skip any whitespace character if the sql mode says they should be ignored,
    // before actually trying to match the open parenthesis.
    var input = inputStream.LA(1).toChar()

    if (isSqlModeActive(SqlMode.IgnoreSpace)) {
      while (input == ' ' || input == '\t' || input == '\r' || input == '\n') {
        interpreter.consume(inputStream)
        channel = HIDDEN
        type = MySQLLexer.Tokens.WHITESPACE
        input = inputStream.LA(1).toChar()
      }
    }

    return if (input == '(') {
      proposed
    } else {
      MySQLLexer.Tokens.IDENTIFIER
    }
  }

  /**
   * Checks the given text and determines the smallest number type from it.
   *
   * Code has been taken from `sql_lex.cc`.
   *
   * @param text The text to parse (which must be a number)
   * @return The token type for that text
   */
  protected fun determineNumericType(text: String): Int {
    val longString = "2147483647"
    val longLength = 10
    val signedLongString = "-2147483648"
    val longLongString = "9223372036854775807"
    val longLongLength = 19
    val signedLongLongString = "-9223372036854775808"
    val signedLongLongLength = 19
    val unsignedLongLongString = "18446744073709551615"
    val unsignedLongLongLength = 20

    // The original code checks for leading +/- but actually that can never happen, neither in the
    // server parser (as a digit is used to trigger processing in the lexer) nor in our parser
    // as our rules are defined without signs. But we do it anyway for maximum compatibility.
    var length = text.length - 1

    if (length < longLength) { // Quick normal case
      return MySQLLexer.Tokens.INT_NUMBER
    }

    var negative = false
    var index = 0

    if (text[index] == '+') { // Remove sign and pre-zeros
      ++index
      --length
    } else if (text[index] == '-') {
      ++index
      --length
      negative = true
    }

    while (text[index] == '0' && length > 0) {
      ++index
      --length
    }

    if (length < longLength) {
      return MySQLLexer.Tokens.INT_NUMBER
    }

    val smaller: Int
    val bigger: Int
    val cmp: String

    if (negative) {
      if (length == longLength) {
        cmp = signedLongString.substring(1)
        smaller = MySQLLexer.Tokens.INT_NUMBER // If <= signed_long_str
        bigger = MySQLLexer.Tokens.LONG_NUMBER // If >= signed_long_str
      } else if (length < signedLongLongLength) {
        return MySQLLexer.Tokens.LONG_NUMBER
      } else if (length > signedLongLongLength) {
        return MySQLLexer.Tokens.DECIMAL_NUMBER
      } else {
        cmp = signedLongLongString.substring(1)
        smaller = MySQLLexer.Tokens.LONG_NUMBER // If <= signed_longlong_str
        bigger = MySQLLexer.Tokens.DECIMAL_NUMBER
      }
    } else {
      if (length == longLength) {
        cmp = longString
        smaller = MySQLLexer.Tokens.INT_NUMBER
        bigger = MySQLLexer.Tokens.LONG_NUMBER
      } else if (length < longLongLength) {
        return MySQLLexer.Tokens.LONG_NUMBER
      } else if (length > longLongLength) {
        if (length > unsignedLongLongLength) {
          return MySQLLexer.Tokens.DECIMAL_NUMBER
        }

        cmp = unsignedLongLongString
        smaller = MySQLLexer.Tokens.ULONGLONG_NUMBER
        bigger = MySQLLexer.Tokens.DECIMAL_NUMBER
      } else {
        cmp = longLongString
        smaller = MySQLLexer.Tokens.LONG_NUMBER
        bigger = MySQLLexer.Tokens.ULONGLONG_NUMBER
      }
    }

    var otherIndex = 0

    while (index < text.length && cmp[otherIndex++] == text[index++]) {
      //
    }

    return if (text[index - 1] <= cmp[otherIndex - 1]) {
      smaller
    } else {
      bigger
    }
  }

  /**
   * Checks if the given text corresponds to a charset defined in the server (text is preceded by an underscore).
   *
   * @param text The text to check
   * @return [MySQLLexer.Tokens.UNDERSCORE_CHARSET] if so, otherwise [MySQLLexer.Tokens.IDENTIFIER]
   */
  protected fun checkCharset(text: String): Int =
    if (charSets.contains(text)) {
      MySQLLexer.Tokens.UNDERSCORE_CHARSET
    } else {
      MySQLLexer.Tokens.IDENTIFIER
    }

  /**
   * Creates a DOT token in the token stream.
   */
  protected fun emitDot() {
    pendingTokens.add(
      tokenFactory.create(
        Pair(this, inputStream),
        MySQLLexer.Tokens.DOT_SYMBOL,
        null,
        channel,
        _tokenStartCharIndex,
        _tokenStartCharIndex,
        _tokenStartLine,
        _tokenStartCharPositionInLine,
      )
    )

    ++_tokenStartCharIndex
  }
}
