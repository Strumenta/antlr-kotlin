/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.xpath

//import org.antlr.v4.runtime.tree.ParseTree
//import org.antlr.v4.runtime.tree.Tree
//import org.antlr.v4.runtime.tree.Trees
//
//import java.util.ArrayList
//
//class XPathWildcardElement : XPathElement(XPath.WILDCARD) {
//
//    override fun evaluate(t: ParseTree): Collection<ParseTree> {
//        if (invert) return ArrayList<ParseTree>() // !* is weird but valid (empty)
//        val kids = ArrayList<ParseTree>()
//        for (c in Trees.getChildren(t)) {
//            kids.add(c as ParseTree)
//        }
//        return kids
//    }
//}
