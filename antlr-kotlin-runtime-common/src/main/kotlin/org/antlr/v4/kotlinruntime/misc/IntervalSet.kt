/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.misc

import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.Token.Companion.EOF

/**
 * This class implements the [IntSet] backed by a sorted array of
 * non-overlapping intervals. It is particularly efficient for representing
 * large collections of numbers, where the majority of elements appear as part
 * of a sequential range of numbers that are all part of the set. For example,
 * the set { 1, 2, 3, 4, 7, 8 } may be represented as { [1, 4], [7, 8] }.
 *
 *
 *
 * This class is able to represent sets containing any combination of values in
 * the range [Integer.MIN_VALUE] to [Integer.MAX_VALUE]
 * (inclusive).
 */
class IntervalSet : IntSet {

    /** The list of sorted, disjoint intervals.  */
    protected var intervals: MutableList<Interval>? = null

    //protected var readonly: Boolean = false

//    fun setReadonly(value: Boolean) {
//        this.readonly = value
//    }

    /** {@inheritDoc}  */
    override val isNil: Boolean
        get() = intervals == null || intervals!!.isEmpty()

    /**
     * Returns the maximum value contained in the set if not isNil().
     *
     * @return the maximum value contained in the set.
     * @throws RuntimeException if set is empty
     */
    val maxElement: Int
        get() {
            if (isNil) {
                throw RuntimeException("set is empty")
            }
            val last = intervals!![intervals!!.size - 1]
            return last.b
        }

    /**
     * Returns the minimum value contained in the set if not isNil().
     *
     * @return the minimum value contained in the set.
     * @throws RuntimeException if set is empty
     */
    val minElement: Int
        get() {
            if (isNil) {
                throw RuntimeException("set is empty")
            }

            return intervals!![0].a
        }

    var isReadonly: Boolean = false
        get
        set(readonly) {
            if (field && !readonly) throw IllegalStateException("can't alter readonly IntervalSet")
            field = readonly
        }

    constructor(intervals: MutableList<Interval>) {
        this.intervals = intervals
    }

    constructor(set: IntervalSet) : this() {
        addAll(set)
    }

    constructor(vararg els: Int) {
        if (els == null) {
            intervals = ArrayList<Interval>(2) // most sets are 1 or 2 elements
        } else {
            intervals = ArrayList<Interval>(els.size)
            for (e in els) add(e)
        }
    }

    fun clear() {
        if (isReadonly) throw IllegalStateException("can't alter readonly IntervalSet")
        intervals!!.clear()
    }

    /** Add a single element to the set.  An isolated element is stored
     * as a range el..el.
     */
    override fun add(el: Int) {
        if (isReadonly) throw IllegalStateException("can't alter readonly IntervalSet")
        add(el, el)
    }

    /** Add interval; i.e., add all integers from a to b to set.
     * If b&lt;a, do nothing.
     * Keep list in sorted order (by left range value).
     * If overlap, combine ranges.  For example,
     * If this is {1..5, 10..20}, adding 6..7 yields
     * {1..5, 6..7, 10..20}.  Adding 4..8 yields {1..8, 10..20}.
     */
    fun add(a: Int, b: Int) {
        add(Interval.of(a, b))
    }

    // copy on write so we can cache a..a intervals and sets of that
    protected fun add(addition: Interval) {
        if (isReadonly) throw IllegalStateException("can't alter readonly IntervalSet")
        //System.out.println("add "+addition+" to "+intervals.toString());
        if (addition.b < addition.a) {
            return
        }
        // find position in list
        // Use iterators as we modify list in place
        val iter = intervals!!.listIterator()
        while (iter.hasNext()) {
            val r = iter.next()
            if (addition == r) {
                return
            }
            if (addition.adjacent(r) || !addition.disjoint(r)) {
                // next to each other, make a single larger interval
                val bigger = addition.union(r)
                iter.set(bigger)
                // make sure we didn't just create an interval that
                // should be merged with next interval in list
                while (iter.hasNext()) {
                    val next = iter.next()
                    if (!bigger.adjacent(next) && bigger.disjoint(next)) {
                        break
                    }

                    // if we bump up against or overlap next, merge
                    iter.remove()   // remove this one
                    iter.previous() // move backwards to what we just set
                    iter.set(bigger.union(next)) // set to 3 merged ones
                    iter.next() // first call to next after previous duplicates the result
                }
                return
            }
            if (addition.startsBeforeDisjoint(r)) {
                // insert before r
                iter.previous()
                iter.add(addition)
                return
            }
            // if disjoint and after r, a future iteration will handle it
        }
        // ok, must be after last interval (and disjoint from last interval)
        // just add it
        intervals!!.add(addition)
    }

    override fun addAll(set: IntSet?): IntervalSet {
        if (set == null) {
            return this
        }

        if (set is IntervalSet) {
            val other = set as IntervalSet?
            // walk set and add each interval
            val n = other!!.intervals!!.size
            for (i in 0 until n) {
                val I = other.intervals!![i]
                this.add(I.a, I.b)
            }
        } else {
            for (value in set!!.toList()) {
                add(value)
            }
        }

        return this
    }

    fun complement(minElement: Int, maxElement: Int): IntervalSet? {
        return this.complement(IntervalSet.of(minElement, maxElement))
    }

    /** {@inheritDoc}  */
    override fun complement(vocabulary: IntSet?): IntervalSet? {
        if (vocabulary == null || vocabulary!!.isNil) {
            return null // nothing in common with null set
        }

        val vocabularyIS: IntervalSet
        if (vocabulary is IntervalSet) {
            vocabularyIS = vocabulary
        } else {
            vocabularyIS = IntervalSet()
            vocabularyIS.addAll(vocabulary)
        }

        return vocabularyIS.subtract(this)
    }

    override fun subtract(a: IntSet?): IntervalSet {
        if (a == null || a!!.isNil) {
            return IntervalSet(this)
        }

        if (a is IntervalSet) {
            return subtract(this, a as IntervalSet?)
        }

        val other = IntervalSet()
        other.addAll(a)
        return subtract(this, other)
    }

    override fun or(a: IntSet?): IntervalSet {
        val o = IntervalSet()
        o.addAll(this)
        o.addAll(a)
        return o
    }

    /** {@inheritDoc}  */
    override fun and(other: IntSet?): IntervalSet? {
        if (other == null) { //|| !(other instanceof IntervalSet) ) {
            return null // nothing in common with null set
        }

        val myIntervals = this.intervals
        val theirIntervals = (other as IntervalSet).intervals
        var intersection: IntervalSet? = null
        val mySize = myIntervals!!.size
        val theirSize = theirIntervals!!.size
        var i = 0
        var j = 0
        // iterate down both interval lists looking for nondisjoint intervals
        while (i < mySize && j < theirSize) {
            val mine = myIntervals[i]
            val theirs = theirIntervals[j]
            //System.out.println("mine="+mine+" and theirs="+theirs);
            if (mine.startsBeforeDisjoint(theirs)) {
                // move this iterator looking for interval that might overlap
                i++
            } else if (theirs.startsBeforeDisjoint(mine)) {
                // move other iterator looking for interval that might overlap
                j++
            } else if (mine.properlyContains(theirs)) {
                // overlap, add intersection, get next theirs
                if (intersection == null) {
                    intersection = IntervalSet()
                }
                intersection.add(mine.intersection(theirs))
                j++
            } else if (theirs.properlyContains(mine)) {
                // overlap, add intersection, get next mine
                if (intersection == null) {
                    intersection = IntervalSet()
                }
                intersection.add(mine.intersection(theirs))
                i++
            } else if (!mine.disjoint(theirs)) {
                // overlap, add intersection
                if (intersection == null) {
                    intersection = IntervalSet()
                }
                intersection.add(mine.intersection(theirs))
                // Move the iterator of lower range [a..b], but not
                // the upper range as it may contain elements that will collide
                // with the next iterator. So, if mine=[0..115] and
                // theirs=[115..200], then intersection is 115 and move mine
                // but not theirs as theirs may collide with the next range
                // in thisIter.
                // move both iterators to next ranges
                if (mine.startsAfterNonDisjoint(theirs)) {
                    j++
                } else if (theirs.startsAfterNonDisjoint(mine)) {
                    i++
                }
            }
        }
        return if (intersection == null) {
            IntervalSet()
        } else intersection
    }

    /** {@inheritDoc}  */
    override operator fun contains(el: Int): Boolean {
        val n = intervals!!.size
        var l = 0
        var r = n - 1
        // Binary search for the element in the (sorted,
        // disjoint) array of intervals.
        while (l <= r) {
            val m = (l + r) / 2
            val I = intervals!![m]
            val a = I.a
            val b = I.b
            if (b < el) {
                l = m + 1
            } else if (a > el) {
                r = m - 1
            } else { // el >= a && el <= b
                return true
            }
        }
        return false
    }

//    /** Return a list of Interval objects.  */
//    fun getIntervals(): List<Interval>? {
//        return intervals
//    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        for (I in intervals!!) {
            hash = MurmurHash.update(hash, I.a)
            hash = MurmurHash.update(hash, I.b)
        }

        hash = MurmurHash.finish(hash, intervals!!.size * 2)
        return hash
    }

    /** Are two IntervalSets equal?  Because all intervals are sorted
     * and disjoint, equals is a simple linear walk over both lists
     * to make sure they are the same.  Interval.equals() is used
     * by the List.equals() method to check the ranges.
     */
    override fun equals(obj: Any?): Boolean {
        if (obj == null || obj !is IntervalSet) {
            return false
        }
        val other = obj as IntervalSet?
        return this.intervals == other!!.intervals
    }

    override fun toString(): String {
        return toString(false)
    }

    fun toString(elemAreChar: Boolean): String {
        val buf = StringBuilder()
        if (this.intervals == null || this.intervals!!.isEmpty()) {
            return "{}"
        }
        if (this.size() > 1) {
            buf.append("{")
        }
        val iter = this.intervals!!.iterator()
        while (iter.hasNext()) {
            val I = iter.next()
            val a = I.a
            val b = I.b
            if (a == b) {
                if (a == EOF)
                    buf.append("<EOF>")
                else if (elemAreChar)
                    TODO()
                    //buf.append("'").appendCodePoint(a).append("'")
                else
                    buf.append(a)
            } else {
                if (elemAreChar)
                    TODO()
                    //buf.append("'").appendCodePoint(a).append("'..'").appendCodePoint(b).append("'")
                else
                    buf.append(a).append("..").append(b)
            }
            if (iter.hasNext()) {
                buf.append(", ")
            }
        }
        if (this.size() > 1) {
            buf.append("}")
        }
        return buf.toString()
    }


    @Deprecated("Use {@link #toString(Vocabulary)} instead.")
    fun toString(tokenNames: Array<String>): String {
        return toString(VocabularyImpl.fromTokenNames(tokenNames as Array<String?>))
    }

    fun toString(vocabulary: Vocabulary): String {
        val buf = StringBuilder()
        if (this.intervals == null || this.intervals!!.isEmpty()) {
            return "{}"
        }
        if (this.size() > 1) {
            buf.append("{")
        }
        val iter = this.intervals!!.iterator()
        while (iter.hasNext()) {
            val I = iter.next()
            val a = I.a
            val b = I.b
            if (a == b) {
                buf.append(elementName(vocabulary, a))
            } else {
                for (i in a..b) {
                    if (i > a) buf.append(", ")
                    buf.append(elementName(vocabulary, i))
                }
            }
            if (iter.hasNext()) {
                buf.append(", ")
            }
        }
        if (this.size() > 1) {
            buf.append("}")
        }
        return buf.toString()
    }


    @Deprecated("Use {@link #elementName(Vocabulary, int)} instead.")
    protected fun elementName(tokenNames: Array<String>, a: Int): String {
        return elementName(VocabularyImpl.fromTokenNames(tokenNames as Array<String?>), a)
    }


    protected fun elementName(vocabulary: Vocabulary, a: Int): String {
        return if (a == Token.EOF) {
            "<EOF>"
        } else if (a == Token.EPSILON) {
            "<EPSILON>"
        } else {
            vocabulary.getDisplayName(a)
        }
    }

    override fun size(): Int {
        var n = 0
        val numIntervals = intervals!!.size
        if (numIntervals == 1) {
            val firstInterval = this.intervals!![0]
            return firstInterval.b - firstInterval.a + 1
        }
        for (i in 0 until numIntervals) {
            val I = intervals!![i]
            n += I.b - I.a + 1
        }
        return n
    }

    fun toIntegerList(): IntegerList {
        val values = IntegerList(size())
        val n = intervals!!.size
        for (i in 0 until n) {
            val I = intervals!![i]
            val a = I.a
            val b = I.b
            for (v in a..b) {
                values.add(v)
            }
        }
        return values
    }

    override fun toList(): List<Int> {
        val values = ArrayList<Int>()
        val n = intervals!!.size
        for (i in 0 until n) {
            val I = intervals!![i]
            val a = I.a
            val b = I.b
            for (v in a..b) {
                values.add(v)
            }
        }
        return values
    }

    fun toSet(): Set<Int> {
        val s = HashSet<Int>()
        for (I in intervals!!) {
            val a = I.a
            val b = I.b
            for (v in a..b) {
                s.add(v)
            }
        }
        return s
    }

    /** Get the ith element of ordered set.  Used only by RandomPhrase so
     * don't bother to implement if you're not doing that for a new
     * ANTLR code gen target.
     */
    operator fun get(i: Int): Int {
        val n = intervals!!.size
        var index = 0
        for (j in 0 until n) {
            val I = intervals!![j]
            val a = I.a
            val b = I.b
            for (v in a..b) {
                if (index == i) {
                    return v
                }
                index++
            }
        }
        return -1
    }

    fun toArray(): IntArray {
        return toIntegerList().toArray()
    }

    override fun remove(el: Int) {
        if (isReadonly) throw IllegalStateException("can't alter readonly IntervalSet")
        val n = intervals!!.size
        for (i in 0 until n) {
            val I = intervals!![i]
            val a = I.a
            val b = I.b
            if (el < a) {
                break // list is sorted and el is before this interval; not here
            }
            // if whole interval x..x, rm
            if (el == a && el == b) {
                intervals!!.removeAt(i)
                break
            }
            // if on left edge x..b, adjust left
            if (el == a) {
                I.a++
                break
            }
            // if on right edge a..x, adjust right
            if (el == b) {
                I.b--
                break
            }
            // if in middle a..x..b, split interval
            if (el > a && el < b) { // found in this interval
                val oldb = I.b
                I.b = el - 1      // [a..x-1]
                add(el + 1, oldb) // add [x+1..b]
            }
        }
    }

    companion object {
        val COMPLETE_CHAR_SET = IntervalSet.of(Lexer.MIN_CHAR_VALUE, Lexer.MAX_CHAR_VALUE)

        init {
            COMPLETE_CHAR_SET.isReadonly = true
        }

        val EMPTY_SET = IntervalSet()

        init {
            EMPTY_SET.isReadonly = true
        }

        /** Create a set with a single element, el.  */

        fun of(a: Int): IntervalSet {
            val s = IntervalSet()
            s.add(a)
            return s
        }

        /** Create a set with all ints within range a..b (inclusive)  */
        fun of(a: Int, b: Int): IntervalSet {
            val s = IntervalSet()
            s.add(a, b)
            return s
        }

        /** combine all sets in the array returned the or'd value  */
        fun or(sets: Array<IntervalSet>): IntervalSet {
            val r = IntervalSet()
            for (s in sets) r.addAll(s)
            return r
        }

        /**
         * Compute the set difference between two interval sets. The specific
         * operation is `left - right`. If either of the input sets is
         * `null`, it is treated as though it was an empty set.
         */

        fun subtract(left: IntervalSet?, right: IntervalSet?): IntervalSet {
            if (left == null || left.isNil) {
                return IntervalSet()
            }

            val result = IntervalSet(left)
            if (right == null || right.isNil) {
                // right set has no elements; just return the copy of the current set
                return result
            }

            var resultI = 0
            var rightI = 0
            while (resultI < result.intervals!!.size && rightI < right.intervals!!.size) {
                val resultInterval = result.intervals!![resultI]
                val rightInterval = right.intervals!![rightI]

                // operation: (resultInterval - rightInterval) and update indexes

                if (rightInterval.b < resultInterval.a) {
                    rightI++
                    continue
                }

                if (rightInterval.a > resultInterval.b) {
                    resultI++
                    continue
                }

                var beforeCurrent: Interval? = null
                var afterCurrent: Interval? = null
                if (rightInterval.a > resultInterval.a) {
                    beforeCurrent = Interval(resultInterval.a, rightInterval.a - 1)
                }

                if (rightInterval.b < resultInterval.b) {
                    afterCurrent = Interval(rightInterval.b + 1, resultInterval.b)
                }

                if (beforeCurrent != null) {
                    if (afterCurrent != null) {
                        // split the current interval into two
                        result.intervals!![resultI] = beforeCurrent
                        result.intervals!!.add(resultI + 1, afterCurrent)
                        resultI++
                        rightI++
                        continue
                    } else {
                        // replace the current interval
                        result.intervals!![resultI] = beforeCurrent
                        resultI++
                        continue
                    }
                } else {
                    if (afterCurrent != null) {
                        // replace the current interval
                        result.intervals!![resultI] = afterCurrent
                        rightI++
                        continue
                    } else {
                        // remove the current interval (thus no need to increment resultI)
                        result.intervals!!.removeAt(resultI)
                        continue
                    }
                }
            }

            // If rightI reached right.intervals.size(), no more intervals to subtract from result.
            // If resultI reached result.intervals.size(), we would be subtracting from an empty set.
            // Either way, we are done.
            return result
        }
    }
}
