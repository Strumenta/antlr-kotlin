/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.misc

/**
 *
 * @author Sam Harwell
 */
class IntegerStack : IntegerList {

    constructor() {}

    constructor(capacity: Int) : super(capacity) {}

    constructor(list: IntegerStack) : super(list) {}

    fun push(value: Int) {
        add(value)
    }

    fun pop(): Int {
        return removeAt(size() - 1)
    }

    fun peek(): Int {
        return get(size() - 1)
    }

}
