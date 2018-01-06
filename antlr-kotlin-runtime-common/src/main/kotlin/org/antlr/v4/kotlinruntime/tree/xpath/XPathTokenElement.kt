/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.xpath
//
//import org.antlr.v4.runtime.tree.ParseTree
//import org.antlr.v4.runtime.tree.TerminalNode
//import org.antlr.v4.runtime.tree.Tree
//import org.antlr.v4.runtime.tree.Trees
//
//import java.util.ArrayList
//
//class XPathTokenElement(tokenName: String, protected var tokenType: Int) : XPathElement(tokenName) {
//
//    override fun evaluate(t: ParseTree): Collection<ParseTree> {
//        // return all children of t that match nodeName
//        val nodes = ArrayList<ParseTree>()
//        for (c in Trees.getChildren(t)) {
//            if (c is TerminalNode) {
//                val tnode = c as TerminalNode
//                if (tnode.getSymbol().getType() === tokenType && !invert || tnode.getSymbol().getType() !== tokenType && invert) {
//                    nodes.add(tnode)
//                }
//            }
//        }
//        return nodes
//    }
//}
