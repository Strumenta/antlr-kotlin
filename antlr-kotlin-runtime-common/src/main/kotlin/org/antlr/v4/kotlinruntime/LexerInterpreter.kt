/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNType
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class LexerInterpreter(override val grammarFileName: String, override val vocabulary: Vocabulary, ruleNames: Collection<String>, channelNames: Collection<String>, modeNames: Collection<String>, override val atn: ATN, input: CharStream) : Lexer(input) {



    @Deprecated("")
    @get:Deprecated("")
    override val tokenNames: Array<String?>?
    override val ruleNames: Array<String>?
    override val channelNames: Array<String>?
    override val modeNames: Array<String>?

    protected val _decisionToDFA: Array<DFA?>
    protected val _sharedContextCache = PredictionContextCache()

    @Deprecated("")
    constructor(grammarFileName: String, tokenNames: Collection<String>, ruleNames: Collection<String>, modeNames: Collection<String>, atn: ATN, input: CharStream) : this(grammarFileName, VocabularyImpl.fromTokenNames(tokenNames.toTypedArray<String?>()), ruleNames, ArrayList<String>(), modeNames, atn, input) {
    }

    @Deprecated("")
    constructor(grammarFileName: String, vocabulary: Vocabulary, ruleNames: Collection<String>, modeNames: Collection<String>, atn: ATN, input: CharStream) : this(grammarFileName, vocabulary, ruleNames, ArrayList<String>(), modeNames, atn, input) {
    }

    init {

        if (atn.grammarType !== ATNType.LEXER) {
            throw IllegalArgumentException("The ATN must be a lexer ATN.")
        }
        this.tokenNames = arrayOfNulls(atn.maxTokenType)
        for (i in tokenNames.indices) {
            tokenNames[i] = vocabulary!!.getDisplayName(i)
        }

        this.ruleNames = ruleNames.toTypedArray()
        this.channelNames = channelNames.toTypedArray()
        this.modeNames = modeNames.toTypedArray()

        this._decisionToDFA = arrayOfNulls<DFA>(atn.numberOfDecisions)
        for (i in _decisionToDFA.indices) {
            _decisionToDFA[i] = DFA(atn.getDecisionState(i)!!, i)
        }
        this.interpreter = LexerATNSimulator(this, atn, _decisionToDFA, _sharedContextCache)
    }

//    fun getVocabulary(): Vocabulary {
//        return vocabulary ?: super.vocabulary
//
//    }
}
