/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.ObjectEqualityComparator

/**
 *
 * @author Sam Harwell
 */
class OrderedATNConfigSet : ATNConfigSet() {
    init {
        this.configLookup = LexerConfigHashSet()
    }

    class LexerConfigHashSet : ATNConfigSet.AbstractConfigHashSet(ObjectEqualityComparator.INSTANCE) {
        override fun remove(element: ATNConfig): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun containsAll(elements: Collection<ATNConfig>): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun retainAll(elements: Collection<ATNConfig>): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}
