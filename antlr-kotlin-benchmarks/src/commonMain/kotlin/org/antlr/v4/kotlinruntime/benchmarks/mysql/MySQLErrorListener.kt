// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

import com.strumenta.antlrkotlin.benchmarks.generated.MySQLLexer
import com.strumenta.antlrkotlin.benchmarks.generated.MySQLParser
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.IntervalSet
import kotlin.math.min

public class MySQLErrorListener : BaseErrorListener() {
  private companion object {
    private val simpleRules = setOf(
      MySQLParser.Rules.Identifier,
      MySQLParser.Rules.QualifiedIdentifier,
    )

    private val objectNames = buildMap {
      put(MySQLParser.Rules.ColumnName, "column")
      put(MySQLParser.Rules.ColumnRef, "column")
      put(MySQLParser.Rules.ColumnInternalRef, "column")
      put(MySQLParser.Rules.IndexName, "index")
      put(MySQLParser.Rules.IndexRef, "index")
      put(MySQLParser.Rules.SchemaName, "schema")
      put(MySQLParser.Rules.SchemaRef, "schema")
      put(MySQLParser.Rules.ProcedureName, "procedure")
      put(MySQLParser.Rules.ProcedureRef, "procedure")
      put(MySQLParser.Rules.FunctionName, "function")
      put(MySQLParser.Rules.FunctionRef, "function")
      put(MySQLParser.Rules.TriggerName, "trigger")
      put(MySQLParser.Rules.TriggerRef, "trigger")
      put(MySQLParser.Rules.ViewName, "view")
      put(MySQLParser.Rules.ViewRef, "view")
      put(MySQLParser.Rules.TablespaceName, "tablespace")
      put(MySQLParser.Rules.TablespaceRef, "tablespace")
      put(MySQLParser.Rules.LogfileGroupName, "logfile group")
      put(MySQLParser.Rules.LogfileGroupRef, "logfile group")
      put(MySQLParser.Rules.EventName, "event")
      put(MySQLParser.Rules.EventRef, "event")
      put(MySQLParser.Rules.UdfName, "udf")
      put(MySQLParser.Rules.ServerName, "server")
      put(MySQLParser.Rules.ServerRef, "server")
      put(MySQLParser.Rules.EngineRef, "engine")
      put(MySQLParser.Rules.TableName, "table")
      put(MySQLParser.Rules.TableRef, "table")
      put(MySQLParser.Rules.FilterTableRef, "table")
      put(MySQLParser.Rules.TableRefWithWildcard, "table")
      put(MySQLParser.Rules.ParameterName, "parameter")
      put(MySQLParser.Rules.LabelIdentifier, "label")
      put(MySQLParser.Rules.LabelRef, "label")
      put(MySQLParser.Rules.RoleIdentifier, "role")
      put(MySQLParser.Rules.PluginRef, "plugin")
      put(MySQLParser.Rules.ComponentRef, "component")
      put(MySQLParser.Rules.ResourceGroupRef, "resource group")
      put(MySQLParser.Rules.WindowName, "window")
    }
  }

  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    var message: String

    // If not undefined then offendingSymbol is of type Token.
    if (offendingSymbol != null) {
      // Need to clone the symbol to avoid releasing the original token prematurely.
      var token = offendingSymbol as Token
      val parser = recognizer as Parser
      val isEof = token.type == Token.EOF

      if (isEof) {
        token = parser.tokenStream[token.tokenIndex - 1]
      }

      var wrongText = token.text ?: ""

      // getExpectedTokens() ignores predicates, so it might include the token for which we got this syntax error,
      // if that was excluded by a predicate (which in our case is always a version check).
      // That's a good indicator to tell the user that this keyword is not valid *for the current server version*.
      var expected = parser.expectedTokens
      var invalidForVersion = false
      val tokenType = token.type

      if (tokenType != MySQLLexer.Tokens.IDENTIFIER && expected.contains(tokenType)) {
        invalidForVersion = true
      } else {
        // tokenType = lexer.keywordFromText(wrongText)
        //
        // if (expected.contains(tokenType)) {
        //   invalidForVersion = true
        // }
      }

      if (invalidForVersion) {
        // The expected tokens set is read-only, so make a copy.
        expected = IntervalSet(expected)
        expected.remove(tokenType)
      }

      // Walk up from generic rules to reach something that gives us more context, if needed.
      var context = parser.context

      while (context?.parent != null && simpleRules.contains(context.ruleIndex)) {
        context = context.parent as ParserRuleContext?
      }

      // Try to find the expected input by examining the current parser context and
      // the expected interval set. The latter often lists useless keywords, especially if they are allowed
      // as identifiers.
      val expectedText = when (context!!.ruleIndex) {
        MySQLParser.Rules.FunctionCall -> {
          "a complete function call or other expression"
        }
        MySQLParser.Rules.Expr -> {
          "an expression"
        }
        MySQLParser.Rules.ColumnName,
        MySQLParser.Rules.IndexName,
        MySQLParser.Rules.SchemaName,
        MySQLParser.Rules.ProcedureName,
        MySQLParser.Rules.FunctionName,
        MySQLParser.Rules.TriggerName,
        MySQLParser.Rules.ViewName,
        MySQLParser.Rules.TablespaceName,
        MySQLParser.Rules.LogfileGroupName,
        MySQLParser.Rules.EventName,
        MySQLParser.Rules.UdfName,
        MySQLParser.Rules.ServerName,
        MySQLParser.Rules.TableName,
        MySQLParser.Rules.ParameterName,
        MySQLParser.Rules.LabelIdentifier,
        MySQLParser.Rules.RoleIdentifier,
        MySQLParser.Rules.WindowName -> {
          val name = objectNames[context.ruleIndex]

          if (name == null) {
            "a new object name"
          } else {
            "a new $name name"
          }
        }
        MySQLParser.Rules.ColumnRef,
        MySQLParser.Rules.IndexRef,
        MySQLParser.Rules.SchemaRef,
        MySQLParser.Rules.ProcedureRef,
        MySQLParser.Rules.FunctionRef,
        MySQLParser.Rules.TriggerRef,
        MySQLParser.Rules.ViewRef,
        MySQLParser.Rules.TablespaceRef,
        MySQLParser.Rules.LogfileGroupRef,
        MySQLParser.Rules.EventRef,
        MySQLParser.Rules.ServerRef,
        MySQLParser.Rules.EngineRef,
        MySQLParser.Rules.TableRef,
        MySQLParser.Rules.FilterTableRef,
        MySQLParser.Rules.TableRefWithWildcard,
        MySQLParser.Rules.LabelRef,
        MySQLParser.Rules.PluginRef,
        MySQLParser.Rules.ComponentRef,
        MySQLParser.Rules.ResourceGroupRef -> {
          val name = objectNames[context.ruleIndex]

          if (name == null) {
            "the name of an existing object"
          } else {
            "the name of an existing $name"
          }
        }
        MySQLParser.Rules.ColumnInternalRef -> {
          "a column name from this table"
        }
        else -> {
          // If the expected set contains the IDENTIFIER token we likely want an identifier at this position.
          // Due to the fact that MySQL defines a number of keywords as possible identifiers, we get all those
          // whenever an identifier is actually required, bloating so the expected set with irrelevant
          // elements. Hence, we check for the identifier entry and assume we *only* want an identifier.
          // This gives an imprecise result if both certain keywords *and* an identifier are expected.
          if (expected.contains(MySQLLexer.Tokens.IDENTIFIER)) {
            "an identifier"
          } else {
            intervalToString(expected, 6, Vocabulary())
          }
        }
      }

      if (!wrongText.startsWith("\"") && !wrongText.startsWith("'") && !wrongText.startsWith("`")) {
        wrongText = "\"" + wrongText + "\""
      }

      if (e == null) {
        // Missing or unwanted tokens.
        if (msg.contains("missing")) {
          if (expected.size() == 1) {
            message = "Missing $expectedText"
          }
        } else {
          message = "`Extraneous input $wrongText found, expecting $expectedText`"
        }
      } else {
        if (e is InputMismatchException) {
          if (isEof) {
            message = "Statement is incomplete"
          } else {
            message = "$wrongText is not valid at this position"

            if (expectedText.isNotEmpty()) {
              message += ", expecting $expectedText"
            }
          }
        } else if (e is FailedPredicateException) {
          // For cases like "... | a ({condition}? b)", but not "... | a ({condition}? b)?".
          // Remove parts of the message we don't want.
          val condition = e.message!!.substring("failed predicate: ".length)
          condition.replace(Regex("serverVersion"), "server version")
          condition.replace(Regex(" && "), "and")
          message = "$wrongText is valid only for $condition"
        } else if (e is NoViableAltException) {
          if (isEof) {
            message = "Statement is incomplete"
          } else {
            message = "$wrongText is not valid at this position"
            if (invalidForVersion) {
              message += " for this server version"
            }
          }

          if (expectedText.isNotEmpty()) {
            message += ", expecting $expectedText"
          }
        } else {
          message = msg
        }
      }

      // TODO(Edoardo): restore?
      // this.callback(message, token.type, token.start, line, charPositionInLine, errorLength);
    } else {
      // No offending symbol, which indicates this is a lexer error.
      if (e is LexerNoViableAltException) {
        val lexer = recognizer as Lexer
        val input = lexer.inputStream
        var text = lexer.getErrorDisplay(input.getText(Interval(lexer._tokenStartCharIndex, input.index())))

        if (text == "") {
          text = " "  // Should never happen, but we must ensure we have text.
        }

        when (text[0]) {
          '/' -> {
            message = "Unfinished multiline comment"
          }
          '"' -> {
            message = "Unfinished double quoted string literal"
          }
          '\'' -> {
            message = "Unfinished single quoted string literal"
          }
          '`' -> {
            message = "Unfinished back tick quoted string literal"
          }
          else -> run {
            // Hex or bin string?
            if (text.length > 1 && text[1] == '\'' && (text.startsWith("x") || text.startsWith("b"))) {
              message = "Unfinished ${if (text.startsWith("x")) "hex" else "binary"} string literal"
              return@run
            }

            // Something else the lexer couldn't make sense of.
            // Likely there is no rule that accepts this input.
            message = "\"$text\" is no valid input at all"
          }
        }

        // TODO(Edoardo): restore?
        // this.callback(message, 0, lexer._tokenStartCharIndex, line, charPositionInLine, input.index - lexer._tokenStartCharIndex);
      }
    }
  }

  @Suppress("UNUSED_PARAMETER")
  private fun intervalToString(set: IntervalSet, maxCount: Int, vocabulary: Vocabulary): String {
    val symbols = ArrayList<Int>()

    if (symbols.isEmpty()) {
      return ""
    }

    var result = ""
    var firstEntry = true

    @Suppress("NAME_SHADOWING")
    val maxCount = min(maxCount, symbols.size)

    for (i in 0..<maxCount) {
      val symbol = symbols[i]

      if (!firstEntry) {
        result += ", "
      }

      firstEntry = false

      if (symbol < 0) {
        result += "EOF"
      } else {
        val name = when (val dn = vocabulary.getDisplayName(symbol)) {
          "BACK_TICK_QUOTED_ID" -> "`text`"
          "DOUBLE_QUOTED_TEXT" -> "\"text\""
          "SINGLE_QUOTED_TEXT" -> "'text'"
          else -> dn.replace("_SYMBOL", "")
            .replace("_OPERATOR", "")
            .replace("_NUMBER", "")
        }

        result += name
      }
    }

    if (maxCount < symbols.size) {
      result += ", ..."
    }

    return result
  }

  private class Vocabulary {
    @Suppress("UNUSED_PARAMETER")
    fun getDisplayName(symbol: Int): String = ""
  }
}
