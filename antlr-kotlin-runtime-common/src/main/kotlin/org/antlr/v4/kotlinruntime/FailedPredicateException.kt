/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.AbstractPredicateTransition
import org.antlr.v4.kotlinruntime.atn.PredicateTransition


private fun formatMessage(predicate: String?, message: String?): String {
    return message ?: "failed predicate: {$predicate}?"

}

/** A semantic predicate failed during validation.  Validation of predicates
 * occurs when normally parsing the alternative just like matching a token.
 * Disambiguating predicate evaluation occurs when we test a predicate during
 * prediction.
 */
class FailedPredicateException constructor(recognizer: Parser,
                                                         val predicate: String? = null,
                                                         message: String? = null) : RecognitionException(recognizer, recognizer.readInputStream()!!, recognizer.context!!, formatMessage(predicate, message)) {
    var ruleIndex: Int = -1
    var predIndex: Int = -1

    init {
        val s = recognizer.interpreter!!.atn.states.get(recognizer.state)

        val trans = s!!.transition(0) as AbstractPredicateTransition
        if (trans is PredicateTransition) {
            this.ruleIndex = (trans as PredicateTransition).ruleIndex
            this.predIndex = (trans as PredicateTransition).predIndex
        } else {
            this.ruleIndex = 0
            this.predIndex = 0
        }
        TODO()
        //this.offendingToken = recognizer.currentToken
    }



}
