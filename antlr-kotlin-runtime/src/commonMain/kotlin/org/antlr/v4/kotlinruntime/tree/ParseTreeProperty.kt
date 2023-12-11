/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import com.strumenta.kotlinmultiplatform.IdentityHashMap

/**
 * Associate a property with a parse tree node. Useful with parse tree listeners
 * that need to associate values with particular tree nodes, kind of like
 * specifying a return value for the listener event method that visited a
 * particular node. Example:
 *
 * ```
 * val values = ParseTreeProperty<Int>()
 * values.put(tree, 36)
 *
 * val x = values.get(tree)
 * values.removeFrom(tree)
 * ```
 *
 * You would make one decl (values here) in the listener and use lots of times
 * in your event methods.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ParseTreeProperty<V> {
  protected var annotations: MutableMap<ParseTree, V> = IdentityHashMap()

  public operator fun get(node: ParseTree): V? =
    annotations[node]

  public fun put(node: ParseTree, value: V) {
    annotations[node] = value
  }

  public fun removeFrom(node: ParseTree): V? =
    annotations.remove(node)
}
