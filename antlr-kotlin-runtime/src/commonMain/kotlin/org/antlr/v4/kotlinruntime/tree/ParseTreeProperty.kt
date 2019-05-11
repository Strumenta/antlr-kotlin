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
 * <pre>
 * ParseTreeProperty&lt;Integer&gt; values = new ParseTreeProperty&lt;Integer&gt;();
 * values.put(tree, 36);
 * int x = values.get(tree);
 * values.removeFrom(tree);
</pre> *
 *
 * You would make one decl (values here) in the listener and use lots of times
 * in your event methods.
 */
class ParseTreeProperty<V> {
    protected var annotations: MutableMap<ParseTree, V> = IdentityHashMap<ParseTree, V>()

    operator fun get(node: ParseTree): V {
        return annotations[node]!!
    }

    fun put(node: ParseTree, value: V) {
        annotations.put(node, value)
    }

    fun removeFrom(node: ParseTree): V {
        return annotations.remove(node)!!
    }
}
