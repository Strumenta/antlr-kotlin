/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Utils

/**
 * This is an [ANTLRInputStream] that is loaded from a file all at once
 * when you construct the object.
 */
@Deprecated("as of 4.7 Please use {@link CharStreams} interface.")
class ANTLRFileStream
private constructor(override val sourceName: String)
    : ANTLRInputStream() {

    companion object {
        suspend fun invoke(fileName: String): ANTLRFileStream {
            val fs = ANTLRFileStream(fileName)
            fs.load()
            return fs
        }
    }

    private suspend fun load() {
        data = Utils.readFile(sourceName)
        this.n = data!!.size
    }
}
