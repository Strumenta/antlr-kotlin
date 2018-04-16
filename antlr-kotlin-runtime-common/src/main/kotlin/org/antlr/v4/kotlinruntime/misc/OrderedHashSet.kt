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
class OrderedHashSet<T> : Set<T> by mutableSetOf() {

}
