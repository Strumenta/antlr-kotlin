/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

class LogManager {

//    protected var records: MutableList<Record>? = null
//
//    protected class Record {
//        internal var timestamp: Long = 0
//        internal var location: StackTraceElement
//        internal var component: String? = null
//        internal var msg: String? = null
//
//        init {
//            timestamp = System.currentTimeMillis()
//            location = Throwable().getStackTrace()[0]
//        }
//
//        override fun toString(): String {
//            val buf = StringBuilder()
//            buf.append(SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(Date(timestamp)))
//            buf.append(" ")
//            buf.append(component)
//            buf.append(" ")
//            buf.append(location.getFileName())
//            buf.append(":")
//            buf.append(location.getLineNumber())
//            buf.append(" ")
//            buf.append(msg)
//            return buf.toString()
//        }
//    }
//
//    fun log(component: String?, msg: String) {
//        val r = Record()
//        r.component = component
//        r.msg = msg
//        if (records == null) {
//            records = ArrayList()
//        }
//        records!!.add(r)
//    }
//
//    fun log(msg: String) {
//        log(null, msg)
//    }
//
//    fun save(filename: String) {
//        val fw = FileWriter(filename)
//        val bw = BufferedWriter(fw)
//        try {
//            bw.write(toString())
//        } finally {
//            bw.close()
//        }
//    }
//
//    fun save(): String {
//        //String dir = System.getProperty("java.io.tmpdir");
//        val dir = "."
//        val defaultFilename = dir + "/antlr-" +
//                SimpleDateFormat("yyyy-MM-dd-HH.mm.ss").format(Date()) + ".log"
//        save(defaultFilename)
//        return defaultFilename
//    }
//
//    override fun toString(): String {
//        if (records == null) return ""
//        val nl = System.getProperty("line.separator")
//        val buf = StringBuilder()
//        for (r in records!!) {
//            buf.append(r)
//            buf.append(nl)
//        }
//        return buf.toString()
//    }

}
