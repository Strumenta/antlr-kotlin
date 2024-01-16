// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

import org.antlr.v4.kotlinruntime.BailErrorStrategy
import org.antlr.v4.kotlinruntime.RecognitionException

/**
 * This exception is thrown to cancel a parsing operation. This exception does
 * not extend [RecognitionException], allowing it to bypass the standard
 * error recovery mechanisms. [BailErrorStrategy] throws this exception in
 * response to a parse error.
 *
 * @author Sam Harwell
 */
public class ParseCancellationException : RuntimeException {
  public constructor()
  public constructor(cause: Throwable) : super(cause)
  public constructor(message: String, cause: Throwable? = null) : super(message, cause)
}
