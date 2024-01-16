// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.Trees

public open class XPathWildcardElement : XPathElement(XPath.WILDCARD) {
  override fun evaluate(t: ParseTree): Collection<ParseTree> {
    if (invert) {
      // !* is weird but valid (empty)
      return emptyList()
    }

    val children = Trees.getChildren(t)
    val kids = ArrayList<ParseTree>(children.size)

    for (c in children) {
      kids.add(c as ParseTree)
    }

    return kids
  }
}
