///*
// * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
// * Use of this file is governed by the BSD 3-clause license that
// * can be found in the LICENSE.txt file in the project root.
// */
//
//package org.antlr.v4.kotlinruntime.tree.xpath
//
//import org.antlr.v4.runtime.tree.ParseTree
//
//abstract class XPathElement
///** Construct element like `/ID` or `ID` or `/*` etc...
// * op is null if just node
//*/
//(protected var nodeName:String) {
//var invert:Boolean = false
//
///**
// * Given tree rooted at `t` return all nodes matched by this path
// * element.
//*/
//abstract fun evaluate(t:ParseTree):Collection<ParseTree>
//
//public override fun toString():String {
//val inv = if (invert) "!" else ""
//return javaClass.getSimpleName() + "[" + inv + nodeName + "]"
//}
//}
