// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.Trees

public open class XPathRuleElement(ruleName: String, protected var ruleIndex: Int) : XPathElement(ruleName) {
  override fun evaluate(t: ParseTree): Collection<ParseTree> {
    // Return all children of t that match nodeName
    val children = Trees.getChildren(t)
    val nodes = ArrayList<ParseTree>(children.size)

    for (c in children) {
      if (c is ParserRuleContext) {
        if (c.ruleIndex == ruleIndex && !invert || c.ruleIndex != ruleIndex && invert) {
          nodes.add(c)
        }
      }
    }

    return nodes
  }
}
