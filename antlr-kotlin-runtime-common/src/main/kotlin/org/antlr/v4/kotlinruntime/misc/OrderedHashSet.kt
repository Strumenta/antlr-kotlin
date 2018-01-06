/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

/** A HashMap that remembers the order that the elements were added.
 * You can alter the ith element with set(i,value) too :)  Unique list.
 * I need the replace/set-element-i functionality so I'm subclassing
 * LinkedHashSet.
 */
class OrderedHashSet<T> : LinkedHashSet<T>() {
    /** Track the elements as they are added to the set  */
    protected var elements: ArrayList<T>? = ArrayList()

    operator fun get(i: Int): T {
        return elements!![i]
    }

    /** Replace an existing value with a new value; updates the element
     * list and the hash table, but not the key as that has not changed.
     */
    operator fun set(i: Int, value: T): T {
        val oldElement = elements!![i]
        elements!![i] = value // update list
        super.remove(oldElement) // now update the set: remove/add
        super.add(value)
        return oldElement
    }

    fun remove(i: Int): Boolean {
        val o = elements!!.removeAt(i)
        return super.remove(o)
    }

    /** Add a value to list; keep in hashtable for consistency also;
     * Key is object itself.  Good for say asking if a certain string is in
     * a list of strings.
     */
    override fun add(value: T): Boolean {
        val result = super.add(value!!)
        if (result) {  // only track if new element not in set
            elements!!.add(value)
        }
        return result
    }

//    fun remove(o: Any?): Boolean {
//        throw UnsupportedOperationException()
//    }

    override fun clear() {
        elements!!.clear()
        super.clear()
    }

    override fun hashCode(): Int {
        return elements!!.hashCode()
    }

    override fun equals(o: Any?): Boolean {
        return if (o !is OrderedHashSet<*>) {
            false
        } else elements != null && elements == o.elements

        //		System.out.print("equals " + this + ", " + o+" = ");
        //		System.out.println(same);
    }

    override fun iterator(): MutableIterator<T> {
        return elements!!.iterator()
    }

    /** Return the List holding list of table elements.  Note that you are
     * NOT getting a copy so don't write to the list.
     */
    fun elements(): List<T>? {
        return elements
    }

//    fun clone(): Any {
//        TODO()
////        val dup = super.clone() as OrderedHashSet<T>// safe (result of clone)
////        dup.elements = ArrayList(this.elements!!)
////        return dup
//    }
//
//    fun toArray(): Array<Any> {
//        TODO()
//        //return elements!!.toTypedArray()
//    }

    override fun toString(): String {
        return elements!!.toString()
    }
}
