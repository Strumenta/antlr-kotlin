// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree

@Suppress("MemberVisibilityCanBePrivate")
public abstract class XPathElement(protected var nodeName: String) {
  public var invert: Boolean = false

  /**
   * Given tree rooted at [t], returns all nodes matched by this path element.
   */
  public abstract fun evaluate(t: ParseTree): Collection<ParseTree>

  override fun toString(): String {
    val inv = if (invert) "!" else ""
    val className = this::class.simpleName
    return "$className[$inv$nodeName]"
  }
}
