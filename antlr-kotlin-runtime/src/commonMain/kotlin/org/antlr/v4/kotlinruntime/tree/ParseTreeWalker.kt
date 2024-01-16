// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.ParserRuleContext
import kotlin.jvm.JvmStatic

public open class ParseTreeWalker {
  public companion object {
    @JvmStatic
    public val DEFAULT: ParseTreeWalker = ParseTreeWalker()
  }

  /**
   * Performs a walk on the given parse tree starting at the root and going down recursively
   * with depth-first search. On each node, [ParseTreeWalker.enterRule] is called before
   * recursively walking down into child nodes, then [ParseTreeWalker.exitRule] is called
   * after the recursive call to wind up.
   *
   * @param listener The listener used by the walker to process grammar rules
   * @param t The parse tree to be walked on
   */
  public open fun walk(listener: ParseTreeListener, t: ParseTree) {
    if (t is ErrorNode) {
      listener.visitErrorNode(t)
      return
    } else if (t is TerminalNode) {
      listener.visitTerminal(t)
      return
    }

    val r = t as RuleNode
    enterRule(listener, r)

    val n = r.childCount

    for (i in 0..<n) {
      walk(listener, r.getChild(i)!!)
    }

    exitRule(listener, r)
  }

  /**
   * Enters a grammar rule by first triggering the generic event [ParseTreeListener.enterEveryRule]
   * then by triggering the event specific to the given parse tree node.
   *
   * @param listener The listener responding to the trigger events
   * @param r The grammar rule containing the rule context
   */
  protected fun enterRule(listener: ParseTreeListener, r: RuleNode) {
    val ctx = r.ruleContext as ParserRuleContext
    listener.enterEveryRule(ctx)
    ctx.enterRule(listener)
  }

  /**
   * Exits a grammar rule by first triggering the event specific to the given parse tree node
   * then by triggering the generic event [ParseTreeListener.exitEveryRule].
   *
   * @param listener The listener responding to the trigger events
   * @param r The grammar rule containing the rule context
   */
  protected fun exitRule(listener: ParseTreeListener, r: RuleNode) {
    val ctx = r.ruleContext as ParserRuleContext
    ctx.exitRule(listener)
    listener.exitEveryRule(ctx)
  }
}
