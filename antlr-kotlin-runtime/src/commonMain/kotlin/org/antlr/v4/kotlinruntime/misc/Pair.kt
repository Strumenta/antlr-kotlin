/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

class Pair<A, B>(val a: A?, val b: B?) {

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        } else if (obj !is Pair<*, *>) {
            return false
        }

        val other = obj as Pair<*, *>?
        return ObjectEqualityComparator<Any?>().equals(a, other!!.a) && ObjectEqualityComparator<Any?>().equals(b, other.b)
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        hash = MurmurHash.update(hash, a)
        hash = MurmurHash.update(hash, b)
        return MurmurHash.finish(hash, 2)
    }

    override fun toString(): String {
        return "($a, $b)"
    }
}
