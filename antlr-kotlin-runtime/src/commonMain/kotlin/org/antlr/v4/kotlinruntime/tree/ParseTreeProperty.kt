// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import com.strumenta.antlrkotlin.runtime.IdentityHashMap

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
