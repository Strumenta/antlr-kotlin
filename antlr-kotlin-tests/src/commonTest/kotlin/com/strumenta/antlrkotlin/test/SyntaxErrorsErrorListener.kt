package com.strumenta.antlrkotlin.test

import org.antlr.v4.kotlinruntime.BaseErrorListener
import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer

/**
 * Accumulates syntax errors while parsing.
 */
class SyntaxErrorsErrorListener : BaseErrorListener() {
  private var errorMessages = ArrayList<String>(16)

  val errors: List<String>
    get() = errorMessages

  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    errorMessages.add("line $line:$charPositionInLine $msg")
  }
}
