/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

//import IntegerStack
//
///**
// * An iterative (read: non-recursive) pre-order and post-order tree walker that
// * doesn't use the thread stack but heap-based stacks. Makes it possible to
// * process deeply nested parse trees.
// */
//class IterativeParseTreeWalker : ParseTreeWalker() {
//
//    override fun walk(listener: ParseTreeListener, t: ParseTree) {
//
//        val nodeStack = ArrayDeque<ParseTree>()
//        val indexStack = IntegerStack()
//
//        var currentNode: ParseTree? = t
//        var currentIndex = 0
//
//        while (currentNode != null) {
//
//            // pre-order visit
//            if (currentNode is ErrorNode) {
//                listener.visitErrorNode(currentNode as ErrorNode?)
//            } else if (currentNode is TerminalNode) {
//                listener.visitTerminal(currentNode as TerminalNode?)
//            } else {
//                val r = currentNode as RuleNode?
//                enterRule(listener, r)
//            }
//
//            // Move down to first child, if exists
//            if (currentNode!!.childCount > 0) {
//                nodeStack.push(currentNode)
//                indexStack.push(currentIndex)
//                currentIndex = 0
//                currentNode = currentNode!!.getChild(0)
//                continue
//            }
//
//            // No child nodes, so walk tree
//            do {
//
//                // post-order visit
//                if (currentNode is RuleNode) {
//                    exitRule(listener, currentNode as RuleNode?)
//                }
//
//                // No parent, so no siblings
//                if (nodeStack.isEmpty()) {
//                    currentNode = null
//                    currentIndex = 0
//                    break
//                }
//
//                // Move to next sibling if possible
//                currentNode = nodeStack.peek().getChild(++currentIndex)
//                if (currentNode != null) {
//                    break
//                }
//
//                // No next, sibling, so move up
//                currentNode = nodeStack.pop()
//                currentIndex = indexStack.pop()
//
//            } while (currentNode != null)
//        }
//    }
//}
