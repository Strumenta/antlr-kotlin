/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.TokenStream
import org.antlr.v4.kotlinruntime.misc.Interval

/** A tree that knows about an interval in a token stream
 * is some kind of syntax tree. Subinterfaces distinguish
 * between parse trees and other kinds of syntax trees we might want to create.
 */
interface SyntaxTree : Tree {
    /**
     * Return an [Interval] indicating the index in the
     * [TokenStream] of the first and last token associated with this
     * subtree. If this node is a leaf, then the interval represents a single
     * token and has interval i..i for token index i.
     *
     *
     * An interval of i..i-1 indicates an empty interval at position
     * i in the input stream, where 0 &lt;= i &lt;= the size of the input
     * token stream.  Currently, the code base can only have i=0..n-1 but
     * in concept one could have an empty interval after EOF.
     *
     *
     * If source interval is unknown, this returns [Interval.INVALID].
     *
     *
     * As a weird special case, the source interval for rules matched after
     * EOF is unspecified.
     */
    val sourceInterval: Interval
}
