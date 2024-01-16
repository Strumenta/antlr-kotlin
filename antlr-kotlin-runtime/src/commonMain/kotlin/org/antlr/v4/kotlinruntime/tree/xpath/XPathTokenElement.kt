// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.tree.Trees

@Suppress("MemberVisibilityCanBePrivate")
public open class XPathTokenElement(tokenName: String, protected var tokenType: Int) : XPathElement(tokenName) {
  override fun evaluate(t: ParseTree): Collection<ParseTree> {
    // Return all children of t that match nodeName
    val children = Trees.getChildren(t)
    val nodes = ArrayList<ParseTree>(children.size)

    for (c in children) {
      if (c is TerminalNode) {
        if (c.symbol.type == tokenType && !invert || c.symbol.type != tokenType && invert) {
          nodes.add(c)
        }
      }
    }

    return nodes
  }
}
