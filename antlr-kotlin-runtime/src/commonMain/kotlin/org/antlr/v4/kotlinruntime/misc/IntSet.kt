/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.misc

/**
 * A generic set of integers.
 *
 * @see IntervalSet
 */
interface IntSet {

    /**
     * Returns `true` if this set contains no elements.
     *
     * @return `true` if the current set contains no elements; otherwise,
     * `false`.
     */
    val isNil: Boolean

    /**
     * Adds the specified value to the current set.
     *
     * @param el the value to add
     *
     * @exception IllegalStateException if the current set is read-only
     */
    fun add(el: Int)

    /**
     * Modify the current [IntSet] object to contain all elements that are
     * present in itself, the specified `set`, or both.
     *
     * @param set The set to add to the current set. A `null` argument is
     * treated as though it were an empty set.
     * @return `this` (to support chained calls)
     *
     * @exception IllegalStateException if the current set is read-only
     */

    fun addAll(set: IntSet?): IntSet

    /**
     * Return a new [IntSet] object containing all elements that are
     * present in both the current set and the specified set `a`.
     *
     * @param a The set to intersect with the current set. A `null`
     * argument is treated as though it were an empty set.
     * @return A new [IntSet] instance containing the intersection of the
     * current set and `a`. The value `null` may be returned in
     * place of an empty result set.
     */

    fun and(a: IntSet?): IntSet?

    /**
     * Return a new [IntSet] object containing all elements that are
     * present in `elements` but not present in the current set. The
     * following expressions are equivalent for input non-null [IntSet]
     * instances `x` and `y`.
     *
     *
     *  * `x.complement(y)`
     *  * `y.subtract(x)`
     *
     *
     * @param elements The set to compare with the current set. A `null`
     * argument is treated as though it were an empty set.
     * @return A new [IntSet] instance containing the elements present in
     * `elements` but not present in the current set. The value
     * `null` may be returned in place of an empty result set.
     */

    fun complement(elements: IntSet?): IntSet?

    /**
     * Return a new [IntSet] object containing all elements that are
     * present in the current set, the specified set `a`, or both.
     *
     *
     *
     * This method is similar to [.addAll], but returns a new
     * [IntSet] instance instead of modifying the current set.
     *
     * @param a The set to union with the current set. A `null` argument
     * is treated as though it were an empty set.
     * @return A new [IntSet] instance containing the union of the current
     * set and `a`. The value `null` may be returned in place of an
     * empty result set.
     */

    fun or(a: IntSet?): IntSet

    /**
     * Return a new [IntSet] object containing all elements that are
     * present in the current set but not present in the input set `a`.
     * The following expressions are equivalent for input non-null
     * [IntSet] instances `x` and `y`.
     *
     *
     *  * `y.subtract(x)`
     *  * `x.complement(y)`
     *
     *
     * @param a The set to compare with the current set. A `null`
     * argument is treated as though it were an empty set.
     * @return A new [IntSet] instance containing the elements present in
     * `elements` but not present in the current set. The value
     * `null` may be returned in place of an empty result set.
     */

    fun subtract(a: IntSet?): IntSet

    /**
     * Return the total number of elements represented by the current set.
     *
     * @return the total number of elements represented by the current set,
     * regardless of the manner in which the elements are stored.
     */
    fun size(): Int

    /**
     * {@inheritDoc}
     */
    override fun equals(obj: Any?): Boolean

    /**
     * Returns `true` if the set contains the specified element.
     *
     * @param el The element to check for.
     * @return `true` if the set contains `el`; otherwise `false`.
     */
    operator fun contains(el: Int): Boolean

    /**
     * Removes the specified value from the current set. If the current set does
     * not contain the element, no changes are made.
     *
     * @param el the value to remove
     *
     * @exception IllegalStateException if the current set is read-only
     */
    fun remove(el: Int)

    /**
     * Return a list containing the elements represented by the current set. The
     * list is returned in ascending numerical order.
     *
     * @return A list containing all element present in the current set, sorted
     * in ascending numerical order.
     */

    fun toList(): List<Int>

    /**
     * {@inheritDoc}
     */
    override fun toString(): String
}
