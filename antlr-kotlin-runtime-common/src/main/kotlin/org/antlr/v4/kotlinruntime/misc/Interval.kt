/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.misc

import com.strumenta.kotlinmultiplatform.Math

/** An immutable inclusive interval a..b  */
class Interval(var a: Int, var b: Int) {

    /** return number of elements between a and b inclusively. x..x is length 1.
     * if b &lt; a, then length is 0.  9..10 has length 2.
     */
    fun length(): Int {
        return if (b < a) 0 else b - a + 1
    }

    override fun equals(o: Any?): Boolean {
        if (o == null || o !is Interval) {
            return false
        }
        val other = o as Interval?
        return this.a == other!!.a && this.b == other.b
    }

    override fun hashCode(): Int {
        var hash = 23
        hash = hash * 31 + a
        hash = hash * 31 + b
        return hash
    }

    /** Does this start completely before other? Disjoint  */
    fun startsBeforeDisjoint(other: Interval): Boolean {
        return this.a < other.a && this.b < other.a
    }

    /** Does this start at or before other? Nondisjoint  */
    fun startsBeforeNonDisjoint(other: Interval): Boolean {
        return this.a <= other.a && this.b >= other.a
    }

    /** Does this.a start after other.b? May or may not be disjoint  */
    fun startsAfter(other: Interval): Boolean {
        return this.a > other.a
    }

    /** Does this start completely after other? Disjoint  */
    fun startsAfterDisjoint(other: Interval): Boolean {
        return this.a > other.b
    }

    /** Does this start after other? NonDisjoint  */
    fun startsAfterNonDisjoint(other: Interval): Boolean {
        return this.a > other.a && this.a <= other.b // this.b>=other.b implied
    }

    /** Are both ranges disjoint? I.e., no overlap?  */
    fun disjoint(other: Interval): Boolean {
        return startsBeforeDisjoint(other) || startsAfterDisjoint(other)
    }

    /** Are two intervals adjacent such as 0..41 and 42..42?  */
    fun adjacent(other: Interval): Boolean {
        return this.a == other.b + 1 || this.b == other.a - 1
    }

    fun properlyContains(other: Interval): Boolean {
        return other.a >= this.a && other.b <= this.b
    }

    /** Return the interval computed from combining this and other  */
    fun union(other: Interval): Interval {
        return Interval.of(Math.min(a, other.a), Math.max(b, other.b))
    }

    /** Return the interval in common between this and o  */
    fun intersection(other: Interval): Interval {
        return Interval.of(Math.max(a, other.a), Math.min(b, other.b))
    }

    /** Return the interval with elements from this not in other;
     * other must not be totally enclosed (properly contained)
     * within this, which would result in two disjoint intervals
     * instead of the single one returned by this method.
     */
    fun differenceNotProperlyContained(other: Interval): Interval? {
        var diff: Interval? = null
        // other.a to left of this.a (or same)
        if (other.startsBeforeNonDisjoint(this)) {
            diff = Interval.of(Math.max(this.a, other.b + 1),
                    this.b)
        } else if (other.startsAfterNonDisjoint(this)) {
            diff = Interval.of(this.a, other.a - 1)
        }// other.a to right of this.a
        return diff
    }

    override fun toString(): String {
        return a.toString() + ".." + b
    }

    companion object {
        val INTERVAL_POOL_MAX_VALUE = 1000

        val INVALID = Interval(-1, -2)

        internal var cache = arrayOfNulls<Interval>(INTERVAL_POOL_MAX_VALUE + 1)

        var creates = 0
        var misses = 0
        var hits = 0
        var outOfRange = 0

        /** Interval objects are used readonly so share all with the
         * same single value a==b up to some max size.  Use an array as a perfect hash.
         * Return shared object for 0..INTERVAL_POOL_MAX_VALUE or a new
         * Interval object with a..a in it.  On Java.g4, 218623 IntervalSets
         * have a..a (set with 1 element).
         */
        fun of(a: Int, b: Int): Interval {
            // cache just a..a
            if (a != b || a < 0 || a > INTERVAL_POOL_MAX_VALUE) {
                return Interval(a, b)
            }
            if (cache[a] == null) {
                cache[a] = Interval(a, a)
            }
            return cache[a]!!
        }
    }
}
