/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.ParserRuleContext

/**
 * This interface describes the minimal core of methods triggered by [ParseTreeWalker].
 *
 * ```
 * val walker = ParseTreeWalker()
 * walker.walk(myParseTreeListener, myParseTree) // Triggers events in your listener
 * ```
 *
 * If you want to trigger events in multiple listeners during a single
 * tree walk, you can use the `ParseTreeDispatcher` object available at
 * [antlr4#841](https://github.com/antlr/antlr4/issues/841)
 */
public interface ParseTreeListener {
  public fun visitTerminal(node: TerminalNode)
  public fun visitErrorNode(node: ErrorNode)
  public fun enterEveryRule(ctx: ParserRuleContext)
  public fun exitEveryRule(ctx: ParserRuleContext)
}
