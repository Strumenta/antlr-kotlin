// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.Trees

public open class XPathWildcardElement : XPathElement(XPath.WILDCARD) {
  override fun evaluate(t: ParseTree): Collection<ParseTree> {
    if (invert) {
      // !* is weird but valid (empty)
      return ArrayList()
    }

    val kids = ArrayList<ParseTree>()

    for (c in Trees.getChildren(t)) {
      kids.add(c as ParseTree)
    }

    return kids
  }
}
