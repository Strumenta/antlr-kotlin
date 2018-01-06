/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Utils

///**
// * This is an [ANTLRInputStream] that is loaded from a file all at once
// * when you construct the object.
// *
// */
//@Deprecated("as of 4.7 Please use {@link CharStreams} interface.")
//class ANTLRFileStream constructor(fileName: String, encoding: String? = null) : ANTLRInputStream() {
//    override var sourceName: String
//        protected set
//
//    init {
//        this.sourceName = fileName
//        load(fileName, encoding)
//    }
//
//    fun load(fileName: String, encoding: String?) {
//        data = Utils.readFile(fileName, encoding)
//        this.n = data.size
//    }
//}
