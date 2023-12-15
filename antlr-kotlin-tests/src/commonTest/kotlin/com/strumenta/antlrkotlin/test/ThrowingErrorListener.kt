package com.strumenta.antlrkotlin.test

import org.antlr.v4.kotlinruntime.BaseErrorListener
import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer

/**
 * A recognition error listener that simply throws an [IllegalStateException]
 * when a syntax error occurs, effectively stopping the parsing process
 * and any other activity.
 */
object ThrowingErrorListener : BaseErrorListener() {
  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    val message = "Token recognition error at line $line, column $charPositionInLine: $msg"
    throw IllegalStateException(message, e)
  }
}
