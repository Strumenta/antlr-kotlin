// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.tree.Trees

@Suppress("MemberVisibilityCanBePrivate")
public open class XPathTokenElement(tokenName: String, protected var tokenType: Int) : XPathElement(tokenName) {
  override fun evaluate(t: ParseTree): Collection<ParseTree> {
    // Return all children of t that match nodeName
    val nodes = ArrayList<ParseTree>()

    for (c in Trees.getChildren(t)) {
      if (c is TerminalNode) {
        if (c.symbol.type == tokenType && !invert || c.symbol.type != tokenType && invert) {
          nodes.add(c)
        }
      }
    }

    return nodes
  }
}
