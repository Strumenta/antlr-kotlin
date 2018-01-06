/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

class Triple<A, B, C>(val a: A, val b: B, val c: C) {

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is Triple<*, *, *>) {
            return false
        }

        val other = obj as Triple<*, *, *>?
        return (ObjectEqualityComparator<Any?>().equals(a, other!!.a)
                && ObjectEqualityComparator<Any?>().equals(b, other.b)
                && ObjectEqualityComparator<Any?>().equals(c, other.c))
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, a)
        hash = MurmurHash.update(hash, b)
        hash = MurmurHash.update(hash, c)
        return MurmurHash.finish(hash, 3)
    }

    override fun toString(): String {
        return "($a, $b, $c)"
    }
}
