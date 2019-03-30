// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc;
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class DOTParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(DOTParser.GraphContext::class,
                                                              DOTParser.Stmt_listContext::class,
                                                              DOTParser.StmtContext::class,
                                                              DOTParser.Attr_stmtContext::class,
                                                              DOTParser.Attr_listContext::class,
                                                              DOTParser.A_listContext::class,
                                                              DOTParser.Edge_stmtContext::class,
                                                              DOTParser.EdgeRHSContext::class,
                                                              DOTParser.EdgeopContext::class,
                                                              DOTParser.Node_stmtContext::class,
                                                              DOTParser.Node_idContext::class,
                                                              DOTParser.PortContext::class,
                                                              DOTParser.SubgraphContext::class,
                                                              DOTParser.IdContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "DOT.g4"

    override val tokenNames: Array<String?>?
        get() = DOTParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = DOTParser.Companion.ruleNames
    override val atn: ATN
        get() = DOTParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        T__7(8),
        T__8(9),
        T__9(10),
        STRICT(11),
        GRAPH(12),
        DIGRAPH(13),
        NODE(14),
        EDGE(15),
        SUBGRAPH(16),
        NUMBER(17),
        STRING(18),
        ID(19),
        HTML_STRING(20),
        COMMENT(21),
        LINE_COMMENT(22),
        PREPROC(23),
        WS(24)
    }

    enum class Rules(val id: Int) {
        RULE_graph(0),
        RULE_stmt_list(1),
        RULE_stmt(2),
        RULE_attr_stmt(3),
        RULE_attr_list(4),
        RULE_a_list(5),
        RULE_edge_stmt(6),
        RULE_edgeRHS(7),
        RULE_edgeop(8),
        RULE_node_stmt(9),
        RULE_node_id(10),
        RULE_port(11),
        RULE_subgraph(12),
        RULE_id(13)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("graph", "stmt_list", "stmt", "attr_stmt", 
                                "attr_list", "a_list", "edge_stmt", "edgeRHS", 
                                "edgeop", "node_stmt", "node_id", "port", 
                                "subgraph", "id")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'{'", 
                                                           "'}'", "';'", 
                                                           "'='", "'['", 
                                                           "']'", "','", 
                                                           "'->'", "'--'", 
                                                           "':'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, "STRICT", 
                                                            "GRAPH", "DIGRAPH", 
                                                            "NODE", "EDGE", 
                                                            "SUBGRAPH", 
                                                            "NUMBER", "STRING", 
                                                            "ID", "HTML_STRING", 
                                                            "COMMENT", "LINE_COMMENT", 
                                                            "PREPROC", "WS")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001a\u0082\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0003\u0002\u0005\u0002\u0020\u000a\u0002\u0003\u0002\u0003\u0002\u0005\u0002\u0024\u000a\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u002c\u000a\u0003\u0007\u0003\u002e\u000a\u0003\u000c\u0003\u000e\u0003\u0031\u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u003b\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0005\u0006\u0042\u000a\u0006\u0003\u0006\u0006\u0006\u0045\u000a\u0006\u000d\u0006\u000e\u0006\u0046\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u004c\u000a\u0007\u0003\u0007\u0005\u0007\u004f\u000a\u0007\u0006\u0007\u0051\u000a\u0007\u000d\u0007\u000e\u0007\u0052\u0003\u0008\u0003\u0008\u0005\u0008\u0057\u000a\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u005b\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0060\u000a\u0009\u0006\u0009\u0062\u000a\u0009\u000d\u0009\u000e\u0009\u0063\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0005\u000b\u006a\u000a\u000b\u0003\u000c\u0003\u000c\u0005\u000c\u006e\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u0074\u000a\u000d\u0003\u000e\u0003\u000e\u0005\u000e\u0078\u000a\u000e\u0005\u000e\u007a\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0002\u0002\u0010\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0002\u0006\u0003\u0002\u000e\u000f\u0004\u0002\u000e\u000e\u0010\u0011\u0003\u0002\u000a\u000b\u0003\u0002\u0013\u0016\u0002\u0089\u0002\u001f\u0003\u0002\u0002\u0002\u0004\u002f\u0003\u0002\u0002\u0002\u0006\u003a\u0003\u0002\u0002\u0002\u0008\u003c\u0003\u0002\u0002\u0002\u000a\u0044\u0003\u0002\u0002\u0002\u000c\u0050\u0003\u0002\u0002\u0002\u000e\u0056\u0003\u0002\u0002\u0002\u0010\u0061\u0003\u0002\u0002\u0002\u0012\u0065\u0003\u0002\u0002\u0002\u0014\u0067\u0003\u0002\u0002\u0002\u0016\u006b\u0003\u0002\u0002\u0002\u0018\u006f\u0003\u0002\u0002\u0002\u001a\u0079\u0003\u0002\u0002\u0002\u001c\u007f\u0003\u0002\u0002\u0002\u001e\u0020\u0007\u000d\u0002\u0002\u001f\u001e\u0003\u0002\u0002\u0002\u001f\u0020\u0003\u0002\u0002\u0002\u0020\u0021\u0003\u0002\u0002\u0002\u0021\u0023\u0009\u0002\u0002\u0002\u0022\u0024\u0005\u001c\u000f\u0002\u0023\u0022\u0003\u0002\u0002\u0002\u0023\u0024\u0003\u0002\u0002\u0002\u0024\u0025\u0003\u0002\u0002\u0002\u0025\u0026\u0007\u0003\u0002\u0002\u0026\u0027\u0005\u0004\u0003\u0002\u0027\u0028\u0007\u0004\u0002\u0002\u0028\u0003\u0003\u0002\u0002\u0002\u0029\u002b\u0005\u0006\u0004\u0002\u002a\u002c\u0007\u0005\u0002\u0002\u002b\u002a\u0003\u0002\u0002\u0002\u002b\u002c\u0003\u0002\u0002\u0002\u002c\u002e\u0003\u0002\u0002\u0002\u002d\u0029\u0003\u0002\u0002\u0002\u002e\u0031\u0003\u0002\u0002\u0002\u002f\u002d\u0003\u0002\u0002\u0002\u002f\u0030\u0003\u0002\u0002\u0002\u0030\u0005\u0003\u0002\u0002\u0002\u0031\u002f\u0003\u0002\u0002\u0002\u0032\u003b\u0005\u0014\u000b\u0002\u0033\u003b\u0005\u000e\u0008\u0002\u0034\u003b\u0005\u0008\u0005\u0002\u0035\u0036\u0005\u001c\u000f\u0002\u0036\u0037\u0007\u0006\u0002\u0002\u0037\u0038\u0005\u001c\u000f\u0002\u0038\u003b\u0003\u0002\u0002\u0002\u0039\u003b\u0005\u001a\u000e\u0002\u003a\u0032\u0003\u0002\u0002\u0002\u003a\u0033\u0003\u0002\u0002\u0002\u003a\u0034\u0003\u0002\u0002\u0002\u003a\u0035\u0003\u0002\u0002\u0002\u003a\u0039\u0003\u0002\u0002\u0002\u003b\u0007\u0003\u0002\u0002\u0002\u003c\u003d\u0009\u0003\u0002\u0002\u003d\u003e\u0005\u000a\u0006\u0002\u003e\u0009\u0003\u0002\u0002\u0002\u003f\u0041\u0007\u0007\u0002\u0002\u0040\u0042\u0005\u000c\u0007\u0002\u0041\u0040\u0003\u0002\u0002\u0002\u0041\u0042\u0003\u0002\u0002\u0002\u0042\u0043\u0003\u0002\u0002\u0002\u0043\u0045\u0007\u0008\u0002\u0002\u0044\u003f\u0003\u0002\u0002\u0002\u0045\u0046\u0003\u0002\u0002\u0002\u0046\u0044\u0003\u0002\u0002\u0002\u0046\u0047\u0003\u0002\u0002\u0002\u0047\u000b\u0003\u0002\u0002\u0002\u0048\u004b\u0005\u001c\u000f\u0002\u0049\u004a\u0007\u0006\u0002\u0002\u004a\u004c\u0005\u001c\u000f\u0002\u004b\u0049\u0003\u0002\u0002\u0002\u004b\u004c\u0003\u0002\u0002\u0002\u004c\u004e\u0003\u0002\u0002\u0002\u004d\u004f\u0007\u0009\u0002\u0002\u004e\u004d\u0003\u0002\u0002\u0002\u004e\u004f\u0003\u0002\u0002\u0002\u004f\u0051\u0003\u0002\u0002\u0002\u0050\u0048\u0003\u0002\u0002\u0002\u0051\u0052\u0003\u0002\u0002\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0052\u0053\u0003\u0002\u0002\u0002\u0053\u000d\u0003\u0002\u0002\u0002\u0054\u0057\u0005\u0016\u000c\u0002\u0055\u0057\u0005\u001a\u000e\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0056\u0055\u0003\u0002\u0002\u0002\u0057\u0058\u0003\u0002\u0002\u0002\u0058\u005a\u0005\u0010\u0009\u0002\u0059\u005b\u0005\u000a\u0006\u0002\u005a\u0059\u0003\u0002\u0002\u0002\u005a\u005b\u0003\u0002\u0002\u0002\u005b\u000f\u0003\u0002\u0002\u0002\u005c\u005f\u0005\u0012\u000a\u0002\u005d\u0060\u0005\u0016\u000c\u0002\u005e\u0060\u0005\u001a\u000e\u0002\u005f\u005d\u0003\u0002\u0002\u0002\u005f\u005e\u0003\u0002\u0002\u0002\u0060\u0062\u0003\u0002\u0002\u0002\u0061\u005c\u0003\u0002\u0002\u0002\u0062\u0063\u0003\u0002\u0002\u0002\u0063\u0061\u0003\u0002\u0002\u0002\u0063\u0064\u0003\u0002\u0002\u0002\u0064\u0011\u0003\u0002\u0002\u0002\u0065\u0066\u0009\u0004\u0002\u0002\u0066\u0013\u0003\u0002\u0002\u0002\u0067\u0069\u0005\u0016\u000c\u0002\u0068\u006a\u0005\u000a\u0006\u0002\u0069\u0068\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u0015\u0003\u0002\u0002\u0002\u006b\u006d\u0005\u001c\u000f\u0002\u006c\u006e\u0005\u0018\u000d\u0002\u006d\u006c\u0003\u0002\u0002\u0002\u006d\u006e\u0003\u0002\u0002\u0002\u006e\u0017\u0003\u0002\u0002\u0002\u006f\u0070\u0007\u000c\u0002\u0002\u0070\u0073\u0005\u001c\u000f\u0002\u0071\u0072\u0007\u000c\u0002\u0002\u0072\u0074\u0005\u001c\u000f\u0002\u0073\u0071\u0003\u0002\u0002\u0002\u0073\u0074\u0003\u0002\u0002\u0002\u0074\u0019\u0003\u0002\u0002\u0002\u0075\u0077\u0007\u0012\u0002\u0002\u0076\u0078\u0005\u001c\u000f\u0002\u0077\u0076\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u007a\u0003\u0002\u0002\u0002\u0079\u0075\u0003\u0002\u0002\u0002\u0079\u007a\u0003\u0002\u0002\u0002\u007a\u007b\u0003\u0002\u0002\u0002\u007b\u007c\u0007\u0003\u0002\u0002\u007c\u007d\u0005\u0004\u0003\u0002\u007d\u007e\u0007\u0004\u0002\u0002\u007e\u001b\u0003\u0002\u0002\u0002\u007f\u0080\u0009\u0005\u0002\u0002\u0080\u001d\u0003\u0002\u0002\u0002\u0015\u001f\u0023\u002b\u002f\u003a\u0041\u0046\u004b\u004e\u0052\u0056\u005a\u005f\u0063\u0069\u006d\u0073\u0077\u0079"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val T__0 = Tokens.T__0.id
    private val T__1 = Tokens.T__1.id
    private val T__2 = Tokens.T__2.id
    private val T__3 = Tokens.T__3.id
    private val T__4 = Tokens.T__4.id
    private val T__5 = Tokens.T__5.id
    private val T__6 = Tokens.T__6.id
    private val T__7 = Tokens.T__7.id
    private val T__8 = Tokens.T__8.id
    private val T__9 = Tokens.T__9.id
    private val STRICT = Tokens.STRICT.id
    private val GRAPH = Tokens.GRAPH.id
    private val DIGRAPH = Tokens.DIGRAPH.id
    private val NODE = Tokens.NODE.id
    private val EDGE = Tokens.EDGE.id
    private val SUBGRAPH = Tokens.SUBGRAPH.id
    private val NUMBER = Tokens.NUMBER.id
    private val STRING = Tokens.STRING.id
    private val ID = Tokens.ID.id
    private val HTML_STRING = Tokens.HTML_STRING.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val PREPROC = Tokens.PREPROC.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class GraphContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_graph.id
	        set(value) { throw RuntimeException() }
		fun findStmt_list() : Stmt_listContext? = getRuleContext(solver.getType("Stmt_listContext"),0)
		fun GRAPH() : TerminalNode? = getToken(DOTParser.Tokens.GRAPH.id, 0)
		fun DIGRAPH() : TerminalNode? = getToken(DOTParser.Tokens.DIGRAPH.id, 0)
		fun STRICT() : TerminalNode? = getToken(DOTParser.Tokens.STRICT.id, 0)
		fun findId() : IdContext? = getRuleContext(solver.getType("IdContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterGraph(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitGraph(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitGraph(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  graph() : GraphContext {
		var _localctx : GraphContext = GraphContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_graph.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 29
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STRICT) {
				if (true){
				this.state = 28
				match(STRICT) as Token
				}
			}

			this.state = 31
			_la = _input!!.LA(1)
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 33
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L)) {
				if (true){
				this.state = 32
				id()
				}
			}

			this.state = 35
			match(T__0) as Token
			this.state = 36
			stmt_list()
			this.state = 37
			match(T__1) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Stmt_listContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_stmt_list.id
	        set(value) { throw RuntimeException() }
		fun findStmt() : List<StmtContext> = getRuleContexts(solver.getType("StmtContext"))
		fun findStmt(i: Int) : StmtContext? = getRuleContext(solver.getType("StmtContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterStmt_list(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitStmt_list(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitStmt_list(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  stmt_list() : Stmt_listContext {
		var _localctx : Stmt_listContext = Stmt_listContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_stmt_list.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 45
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl GRAPH) or (1L shl NODE) or (1L shl EDGE) or (1L shl SUBGRAPH) or (1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L)) {
				if (true){
				if (true){
				this.state = 39
				stmt()
				this.state = 41
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==T__2) {
					if (true){
					this.state = 40
					match(T__2) as Token
					}
				}

				}
				}
				this.state = 47
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class StmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_stmt.id
	        set(value) { throw RuntimeException() }
		fun findNode_stmt() : Node_stmtContext? = getRuleContext(solver.getType("Node_stmtContext"),0)
		fun findEdge_stmt() : Edge_stmtContext? = getRuleContext(solver.getType("Edge_stmtContext"),0)
		fun findAttr_stmt() : Attr_stmtContext? = getRuleContext(solver.getType("Attr_stmtContext"),0)
		fun findId() : List<IdContext> = getRuleContexts(solver.getType("IdContext"))
		fun findId(i: Int) : IdContext? = getRuleContext(solver.getType("IdContext"),i)
		fun findSubgraph() : SubgraphContext? = getRuleContext(solver.getType("SubgraphContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterStmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitStmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitStmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  stmt() : StmtContext {
		var _localctx : StmtContext = StmtContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_stmt.id)
		try {
			this.state = 56
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 48
			node_stmt()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 49
			edge_stmt()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 50
			attr_stmt()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 51
			id()
			this.state = 52
			match(T__3) as Token
			this.state = 53
			id()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 55
			subgraph()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Attr_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attr_stmt.id
	        set(value) { throw RuntimeException() }
		fun findAttr_list() : Attr_listContext? = getRuleContext(solver.getType("Attr_listContext"),0)
		fun GRAPH() : TerminalNode? = getToken(DOTParser.Tokens.GRAPH.id, 0)
		fun NODE() : TerminalNode? = getToken(DOTParser.Tokens.NODE.id, 0)
		fun EDGE() : TerminalNode? = getToken(DOTParser.Tokens.EDGE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterAttr_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitAttr_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitAttr_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attr_stmt() : Attr_stmtContext {
		var _localctx : Attr_stmtContext = Attr_stmtContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_attr_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 58
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl GRAPH) or (1L shl NODE) or (1L shl EDGE))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 59
			attr_list()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Attr_listContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attr_list.id
	        set(value) { throw RuntimeException() }
		fun findA_list() : List<A_listContext> = getRuleContexts(solver.getType("A_listContext"))
		fun findA_list(i: Int) : A_listContext? = getRuleContext(solver.getType("A_listContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterAttr_list(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitAttr_list(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitAttr_list(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attr_list() : Attr_listContext {
		var _localctx : Attr_listContext = Attr_listContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_attr_list.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 66 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 61
				match(T__4) as Token
				this.state = 63
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L)) {
					if (true){
					this.state = 62
					a_list()
					}
				}

				this.state = 65
				match(T__5) as Token
				}
				}
				this.state = 68 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__4 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class A_listContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_a_list.id
	        set(value) { throw RuntimeException() }
		fun findId() : List<IdContext> = getRuleContexts(solver.getType("IdContext"))
		fun findId(i: Int) : IdContext? = getRuleContext(solver.getType("IdContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterA_list(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitA_list(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitA_list(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  a_list() : A_listContext {
		var _localctx : A_listContext = A_listContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_a_list.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 78 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 70
				id()
				this.state = 73
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==T__3) {
					if (true){
					this.state = 71
					match(T__3) as Token
					this.state = 72
					id()
					}
				}

				this.state = 76
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==T__6) {
					if (true){
					this.state = 75
					match(T__6) as Token
					}
				}

				}
				}
				this.state = 80 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Edge_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_edge_stmt.id
	        set(value) { throw RuntimeException() }
		fun findEdgeRHS() : EdgeRHSContext? = getRuleContext(solver.getType("EdgeRHSContext"),0)
		fun findNode_id() : Node_idContext? = getRuleContext(solver.getType("Node_idContext"),0)
		fun findSubgraph() : SubgraphContext? = getRuleContext(solver.getType("SubgraphContext"),0)
		fun findAttr_list() : Attr_listContext? = getRuleContext(solver.getType("Attr_listContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterEdge_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitEdge_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitEdge_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  edge_stmt() : Edge_stmtContext {
		var _localctx : Edge_stmtContext = Edge_stmtContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_edge_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 84
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NUMBER , STRING , ID , HTML_STRING  ->  /*LL1AltBlock*/{if (true){
			this.state = 82
			node_id()
			}}
			T__0 , SUBGRAPH  ->  /*LL1AltBlock*/{if (true){
			this.state = 83
			subgraph()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 86
			edgeRHS()
			this.state = 88
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 87
				attr_list()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class EdgeRHSContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_edgeRHS.id
	        set(value) { throw RuntimeException() }
		fun findEdgeop() : List<EdgeopContext> = getRuleContexts(solver.getType("EdgeopContext"))
		fun findEdgeop(i: Int) : EdgeopContext? = getRuleContext(solver.getType("EdgeopContext"),i)
		fun findNode_id() : List<Node_idContext> = getRuleContexts(solver.getType("Node_idContext"))
		fun findNode_id(i: Int) : Node_idContext? = getRuleContext(solver.getType("Node_idContext"),i)
		fun findSubgraph() : List<SubgraphContext> = getRuleContexts(solver.getType("SubgraphContext"))
		fun findSubgraph(i: Int) : SubgraphContext? = getRuleContext(solver.getType("SubgraphContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterEdgeRHS(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitEdgeRHS(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitEdgeRHS(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  edgeRHS() : EdgeRHSContext {
		var _localctx : EdgeRHSContext = EdgeRHSContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_edgeRHS.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 95 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 90
				edgeop()
				this.state = 93
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				NUMBER , STRING , ID , HTML_STRING  ->  /*LL1AltBlock*/{if (true){
				this.state = 91
				node_id()
				}}
				T__0 , SUBGRAPH  ->  /*LL1AltBlock*/{if (true){
				this.state = 92
				subgraph()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				}
				this.state = 97 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__7 || _la==T__8 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class EdgeopContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_edgeop.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterEdgeop(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitEdgeop(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitEdgeop(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  edgeop() : EdgeopContext {
		var _localctx : EdgeopContext = EdgeopContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_edgeop.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 99
			_la = _input!!.LA(1)
			if ( !(_la==T__7 || _la==T__8) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Node_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_node_stmt.id
	        set(value) { throw RuntimeException() }
		fun findNode_id() : Node_idContext? = getRuleContext(solver.getType("Node_idContext"),0)
		fun findAttr_list() : Attr_listContext? = getRuleContext(solver.getType("Attr_listContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterNode_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitNode_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitNode_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  node_stmt() : Node_stmtContext {
		var _localctx : Node_stmtContext = Node_stmtContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_node_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 101
			node_id()
			this.state = 103
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 102
				attr_list()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Node_idContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_node_id.id
	        set(value) { throw RuntimeException() }
		fun findId() : IdContext? = getRuleContext(solver.getType("IdContext"),0)
		fun findPort() : PortContext? = getRuleContext(solver.getType("PortContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterNode_id(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitNode_id(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitNode_id(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  node_id() : Node_idContext {
		var _localctx : Node_idContext = Node_idContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_node_id.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 105
			id()
			this.state = 107
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__9) {
				if (true){
				this.state = 106
				port()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PortContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_port.id
	        set(value) { throw RuntimeException() }
		fun findId() : List<IdContext> = getRuleContexts(solver.getType("IdContext"))
		fun findId(i: Int) : IdContext? = getRuleContext(solver.getType("IdContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterPort(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitPort(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitPort(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  port() : PortContext {
		var _localctx : PortContext = PortContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_port.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 109
			match(T__9) as Token
			this.state = 110
			id()
			this.state = 113
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__9) {
				if (true){
				this.state = 111
				match(T__9) as Token
				this.state = 112
				id()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SubgraphContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_subgraph.id
	        set(value) { throw RuntimeException() }
		fun findStmt_list() : Stmt_listContext? = getRuleContext(solver.getType("Stmt_listContext"),0)
		fun SUBGRAPH() : TerminalNode? = getToken(DOTParser.Tokens.SUBGRAPH.id, 0)
		fun findId() : IdContext? = getRuleContext(solver.getType("IdContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterSubgraph(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitSubgraph(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitSubgraph(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  subgraph() : SubgraphContext {
		var _localctx : SubgraphContext = SubgraphContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_subgraph.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 119
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SUBGRAPH) {
				if (true){
				this.state = 115
				match(SUBGRAPH) as Token
				this.state = 117
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L)) {
					if (true){
					this.state = 116
					id()
					}
				}

				}
			}

			this.state = 121
			match(T__0) as Token
			this.state = 122
			stmt_list()
			this.state = 123
			match(T__1) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_id.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(DOTParser.Tokens.ID.id, 0)
		fun STRING() : TerminalNode? = getToken(DOTParser.Tokens.STRING.id, 0)
		fun HTML_STRING() : TerminalNode? = getToken(DOTParser.Tokens.HTML_STRING.id, 0)
		fun NUMBER() : TerminalNode? = getToken(DOTParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).enterId(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DOTListener ) (listener as DOTListener).exitId(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DOTVisitor ) return (visitor as DOTVisitor<out T>).visitId(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  id() : IdContext {
		var _localctx : IdContext = IdContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_id.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 125
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMBER) or (1L shl STRING) or (1L shl ID) or (1L shl HTML_STRING))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}