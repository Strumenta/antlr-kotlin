/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.*
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * Vacuum all input from a [Reader]/[InputStream] and then treat it
 * like a `char[]` buffer. Can also pass in a [String] or
 * `char[]` to use.
 *
 *
 * If you need encoding, pass in stream/reader with correct encoding.
 *
 */
@Deprecated("as of 4.7 Please use {@link CharStreams} interface.")
open class ANTLRInputStream : CharStream {

    /** The data being scanned  */
    protected var data: CharArray? = null

    /** How many characters are actually in the buffer  */
    protected var n: Int = 0

    /** 0..n-1 index into string of next char  */
    protected var p = 0

    /** What is name or source of this char stream?  */
    var name: String? = null
//
    override val sourceName: String
        get() = if (name == null || name!!.isEmpty()) {
            IntStream.UNKNOWN_SOURCE_NAME
        } else name!!

    constructor() {}

    /** Copy data in string to a local char array  */
    constructor(input: String) {
        this.data = input.toCharArray()
        this.n = input.length
    }
//
//    /** This is the preferred constructor for strings as no data is copied  */
//    constructor(data: CharArray, numberOfActualCharsInArray: Int) {
//        this.data = data
//        this.n = numberOfActualCharsInArray
//    }
//
//    constructor(r: Reader, initialSize: Int = INITIAL_BUFFER_SIZE, readChunkSize: Int = READ_BUFFER_SIZE) {
//        load(r, initialSize, readChunkSize)
//    }
//
//    constructor(input: InputStream) : this(InputStreamReader(input), INITIAL_BUFFER_SIZE) {
//    }
//
//    constructor(input: InputStream, initialSize: Int) : this(InputStreamReader(input), initialSize) {
//    }
//
//    constructor(input: InputStream, initialSize: Int, readChunkSize: Int) : this(InputStreamReader(input), initialSize, readChunkSize) {
//    }
//
//    fun load(r: Reader?, size: Int, readChunkSize: Int) {
//        var size = size
//        var readChunkSize = readChunkSize
//        if (r == null) {
//            return
//        }
//        if (size <= 0) {
//            size = INITIAL_BUFFER_SIZE
//        }
//        if (readChunkSize <= 0) {
//            readChunkSize = READ_BUFFER_SIZE
//        }
//        // System.out.println("load "+size+" in chunks of "+readChunkSize);
//        try {
//            // alloc initial buffer size.
//            data = CharArray(size)
//            // read all the data in chunks of readChunkSize
//            var numRead = 0
//            var p = 0
//            do {
//                if (p + readChunkSize > data.size) { // overflow?
//                    // System.out.println("### overflow p="+p+", data.length="+data.length);
//                    data = Arrays.copyOf(data, data.size * 2)
//                }
//                numRead = r.read(data, p, readChunkSize)
//                // System.out.println("read "+numRead+" chars; p was "+p+" is now "+(p+numRead));
//                p += numRead
//            } while (numRead != -1) // while not EOF
//            // set the actual size of the data available;
//            // EOF subtracted one above in p+=numRead; add one back
//            n = p + 1
//            //System.out.println("n="+n);
//        } finally {
//            r.close()
//        }
//    }
//
    /** Reset the stream so that it's in the same state it was
     * when the object was created *except* the data array is not
     * touched.
     */
    fun reset() {
        p = 0
    }
//
    override fun consume() {
        if (p >= n) {
            assert(LA(1) == IntStream.EOF)
            throw IllegalStateException("cannot consume EOF")
        }

        //System.out.println("prev p="+p+", c="+(char)data[p]);
        if (p < n) {
            p++
            //System.out.println("p moves to "+p+" (c='"+(char)data[p]+"')");
        }
    }

    override fun LA(i: Int): Int {
        var i = i
        if (i == 0) {
            return 0 // undefined
        }
        if (i < 0) {
            i++ // e.g., translate LA(-1) to use offset i=0; then data[p+0-1]
            if (p + i - 1 < 0) {
                return IntStream.EOF // invalid; no char before first char
            }
        }

        return if (p + i - 1 >= n) {
            //System.out.println("char LA("+i+")=EOF; p="+p);
            IntStream.EOF
        } else data!![p + i - 1]!!.toInt()
        //System.out.println("char LA("+i+")="+(char)data[p+i-1]+"; p="+p);
        //System.out.println("LA("+i+"); p="+p+" n="+n+" data.length="+data.length);
    }

    fun LT(i: Int): Int {
        return LA(i)
    }

    /** Return the current input symbol index 0..n where n indicates the
     * last symbol has been read.  The index is the index of char to
     * be returned from LA(1).
     */
    override fun index(): Int {
        return p
    }

    override fun size(): Int {
        return n
    }
//
    /** mark/release do nothing; we have entire buffer  */
    override fun mark(): Int {
        return -1
    }
//
    override fun release(marker: Int) {}

    /** consume() ahead until p==index; can't just set p=index as we must
     * update line and charPositionInLine. If we seek backwards, just set p
     */
    override fun seek(index: Int) {
        var index = index
        if (index <= p) {
            p = index // just jump; don't update stream state (line, ...)
            return
        }
        // seek forward, consume until p hits index or n (whichever comes first)
        index = Math.min(index, n)
        while (p < index) {
            consume()
        }
    }

    override fun getText(interval: Interval): String {
        val start = interval.a
        var stop = interval.b
        if (stop >= n) stop = n - 1
        val count = stop - start + 1
        return if (start >= n) "" else data!!.copyOfRange(start, start+count).convertToString()
        //		System.err.println("data: "+Arrays.toString(data)+", n="+n+
        //						   ", start="+start+
        //						   ", stop="+stop);
    }

//    override fun toString(): String {
//        return String(data)
//    }

    companion object {
        val READ_BUFFER_SIZE = 1024
        val INITIAL_BUFFER_SIZE = 1024
    }
}
