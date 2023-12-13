/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.tree.ParseTree

@Suppress("MemberVisibilityCanBePrivate")
public abstract class XPathElement(protected var nodeName: String) {
  public var invert: Boolean = false

  /**
   * Given tree rooted at [t] return all nodes matched by this path element.
   */
  public abstract fun evaluate(t: ParseTree): Collection<ParseTree>

  public override fun toString(): String {
    val inv = if (invert) "!" else ""
    return "${this::class.simpleName}[$inv$nodeName]"
  }
}
