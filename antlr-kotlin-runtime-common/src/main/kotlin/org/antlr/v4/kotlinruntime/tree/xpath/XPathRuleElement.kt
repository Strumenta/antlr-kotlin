/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.xpath

//import org.antlr.v4.runtime.ParserRuleContext
//import org.antlr.v4.runtime.tree.ParseTree
//import org.antlr.v4.runtime.tree.Tree
//import org.antlr.v4.runtime.tree.Trees
//
//import java.util.ArrayList
//
//class XPathRuleElement(ruleName: String, protected var ruleIndex: Int) : XPathElement(ruleName) {
//
//    override fun evaluate(t: ParseTree): Collection<ParseTree> {
//        // return all children of t that match nodeName
//        val nodes = ArrayList<ParseTree>()
//        for (c in Trees.getChildren(t)) {
//            if (c is ParserRuleContext) {
//                val ctx = c as ParserRuleContext
//                if (ctx.getRuleIndex() === ruleIndex && !invert || ctx.getRuleIndex() !== ruleIndex && invert) {
//                    nodes.add(ctx)
//                }
//            }
//        }
//        return nodes
//    }
//}
