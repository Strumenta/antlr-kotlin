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

class CPP14Parser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(CPP14Parser.TranslationunitContext::class,
                                                              CPP14Parser.PrimaryexpressionContext::class,
                                                              CPP14Parser.IdexpressionContext::class,
                                                              CPP14Parser.UnqualifiedidContext::class,
                                                              CPP14Parser.QualifiedidContext::class,
                                                              CPP14Parser.NestednamespecifierContext::class,
                                                              CPP14Parser.LambdaexpressionContext::class,
                                                              CPP14Parser.LambdaintroducerContext::class,
                                                              CPP14Parser.LambdacaptureContext::class,
                                                              CPP14Parser.CapturedefaultContext::class,
                                                              CPP14Parser.CapturelistContext::class,
                                                              CPP14Parser.CaptureContext::class,
                                                              CPP14Parser.SimplecaptureContext::class,
                                                              CPP14Parser.InitcaptureContext::class,
                                                              CPP14Parser.LambdadeclaratorContext::class,
                                                              CPP14Parser.PostfixexpressionContext::class,
                                                              CPP14Parser.TypeidofexprContext::class,
                                                              CPP14Parser.TypeidofthetypeidContext::class,
                                                              CPP14Parser.ExpressionlistContext::class,
                                                              CPP14Parser.PseudodestructornameContext::class,
                                                              CPP14Parser.UnaryexpressionContext::class,
                                                              CPP14Parser.UnaryoperatorContext::class,
                                                              CPP14Parser.NewexpressionContext::class,
                                                              CPP14Parser.NewplacementContext::class,
                                                              CPP14Parser.NewtypeidContext::class,
                                                              CPP14Parser.NewdeclaratorContext::class,
                                                              CPP14Parser.NoptrnewdeclaratorContext::class,
                                                              CPP14Parser.NewinitializerContext::class,
                                                              CPP14Parser.DeleteexpressionContext::class,
                                                              CPP14Parser.NoexceptexpressionContext::class,
                                                              CPP14Parser.CastexpressionContext::class,
                                                              CPP14Parser.PmexpressionContext::class,
                                                              CPP14Parser.MultiplicativeexpressionContext::class,
                                                              CPP14Parser.AdditiveexpressionContext::class,
                                                              CPP14Parser.ShiftexpressionContext::class,
                                                              CPP14Parser.RelationalexpressionContext::class,
                                                              CPP14Parser.EqualityexpressionContext::class,
                                                              CPP14Parser.AndexpressionContext::class,
                                                              CPP14Parser.ExclusiveorexpressionContext::class,
                                                              CPP14Parser.InclusiveorexpressionContext::class,
                                                              CPP14Parser.LogicalandexpressionContext::class,
                                                              CPP14Parser.LogicalorexpressionContext::class,
                                                              CPP14Parser.ConditionalexpressionContext::class,
                                                              CPP14Parser.AssignmentexpressionContext::class,
                                                              CPP14Parser.AssignmentoperatorContext::class,
                                                              CPP14Parser.ExpressionContext::class,
                                                              CPP14Parser.ConstantexpressionContext::class,
                                                              CPP14Parser.StatementContext::class,
                                                              CPP14Parser.LabeledstatementContext::class,
                                                              CPP14Parser.ExpressionstatementContext::class,
                                                              CPP14Parser.CompoundstatementContext::class,
                                                              CPP14Parser.StatementseqContext::class,
                                                              CPP14Parser.SelectionstatementContext::class,
                                                              CPP14Parser.ConditionContext::class,
                                                              CPP14Parser.IterationstatementContext::class,
                                                              CPP14Parser.ForinitstatementContext::class,
                                                              CPP14Parser.ForrangedeclarationContext::class,
                                                              CPP14Parser.ForrangeinitializerContext::class,
                                                              CPP14Parser.JumpstatementContext::class,
                                                              CPP14Parser.DeclarationstatementContext::class,
                                                              CPP14Parser.DeclarationseqContext::class,
                                                              CPP14Parser.DeclarationContext::class,
                                                              CPP14Parser.BlockdeclarationContext::class,
                                                              CPP14Parser.AliasdeclarationContext::class,
                                                              CPP14Parser.SimpledeclarationContext::class,
                                                              CPP14Parser.Static_assertdeclarationContext::class,
                                                              CPP14Parser.EmptydeclarationContext::class,
                                                              CPP14Parser.AttributedeclarationContext::class,
                                                              CPP14Parser.DeclspecifierContext::class,
                                                              CPP14Parser.DeclspecifierseqContext::class,
                                                              CPP14Parser.StorageclassspecifierContext::class,
                                                              CPP14Parser.FunctionspecifierContext::class,
                                                              CPP14Parser.TypedefnameContext::class,
                                                              CPP14Parser.TypespecifierContext::class,
                                                              CPP14Parser.TrailingtypespecifierContext::class,
                                                              CPP14Parser.TypespecifierseqContext::class,
                                                              CPP14Parser.TrailingtypespecifierseqContext::class,
                                                              CPP14Parser.SimpletypespecifierContext::class,
                                                              CPP14Parser.ThetypenameContext::class,
                                                              CPP14Parser.DecltypespecifierContext::class,
                                                              CPP14Parser.ElaboratedtypespecifierContext::class,
                                                              CPP14Parser.EnumnameContext::class,
                                                              CPP14Parser.EnumspecifierContext::class,
                                                              CPP14Parser.EnumheadContext::class,
                                                              CPP14Parser.OpaqueenumdeclarationContext::class,
                                                              CPP14Parser.EnumkeyContext::class,
                                                              CPP14Parser.EnumbaseContext::class,
                                                              CPP14Parser.EnumeratorlistContext::class,
                                                              CPP14Parser.EnumeratordefinitionContext::class,
                                                              CPP14Parser.EnumeratorContext::class,
                                                              CPP14Parser.NamespacenameContext::class,
                                                              CPP14Parser.OriginalnamespacenameContext::class,
                                                              CPP14Parser.NamespacedefinitionContext::class,
                                                              CPP14Parser.NamednamespacedefinitionContext::class,
                                                              CPP14Parser.OriginalnamespacedefinitionContext::class,
                                                              CPP14Parser.ExtensionnamespacedefinitionContext::class,
                                                              CPP14Parser.UnnamednamespacedefinitionContext::class,
                                                              CPP14Parser.NamespacebodyContext::class,
                                                              CPP14Parser.NamespacealiasContext::class,
                                                              CPP14Parser.NamespacealiasdefinitionContext::class,
                                                              CPP14Parser.QualifiednamespacespecifierContext::class,
                                                              CPP14Parser.UsingdeclarationContext::class,
                                                              CPP14Parser.UsingdirectiveContext::class,
                                                              CPP14Parser.AsmdefinitionContext::class,
                                                              CPP14Parser.LinkagespecificationContext::class,
                                                              CPP14Parser.AttributespecifierseqContext::class,
                                                              CPP14Parser.AttributespecifierContext::class,
                                                              CPP14Parser.AlignmentspecifierContext::class,
                                                              CPP14Parser.AttributelistContext::class,
                                                              CPP14Parser.AttributeContext::class,
                                                              CPP14Parser.AttributetokenContext::class,
                                                              CPP14Parser.AttributescopedtokenContext::class,
                                                              CPP14Parser.AttributenamespaceContext::class,
                                                              CPP14Parser.AttributeargumentclauseContext::class,
                                                              CPP14Parser.BalancedtokenseqContext::class,
                                                              CPP14Parser.BalancedtokenContext::class,
                                                              CPP14Parser.InitdeclaratorlistContext::class,
                                                              CPP14Parser.InitdeclaratorContext::class,
                                                              CPP14Parser.DeclaratorContext::class,
                                                              CPP14Parser.PtrdeclaratorContext::class,
                                                              CPP14Parser.NoptrdeclaratorContext::class,
                                                              CPP14Parser.ParametersandqualifiersContext::class,
                                                              CPP14Parser.TrailingreturntypeContext::class,
                                                              CPP14Parser.PtroperatorContext::class,
                                                              CPP14Parser.CvqualifierseqContext::class,
                                                              CPP14Parser.CvqualifierContext::class,
                                                              CPP14Parser.RefqualifierContext::class,
                                                              CPP14Parser.DeclaratoridContext::class,
                                                              CPP14Parser.ThetypeidContext::class,
                                                              CPP14Parser.AbstractdeclaratorContext::class,
                                                              CPP14Parser.PtrabstractdeclaratorContext::class,
                                                              CPP14Parser.NoptrabstractdeclaratorContext::class,
                                                              CPP14Parser.AbstractpackdeclaratorContext::class,
                                                              CPP14Parser.NoptrabstractpackdeclaratorContext::class,
                                                              CPP14Parser.ParameterdeclarationclauseContext::class,
                                                              CPP14Parser.ParameterdeclarationlistContext::class,
                                                              CPP14Parser.ParameterdeclarationContext::class,
                                                              CPP14Parser.FunctiondefinitionContext::class,
                                                              CPP14Parser.FunctionbodyContext::class,
                                                              CPP14Parser.InitializerContext::class,
                                                              CPP14Parser.BraceorequalinitializerContext::class,
                                                              CPP14Parser.InitializerclauseContext::class,
                                                              CPP14Parser.InitializerlistContext::class,
                                                              CPP14Parser.BracedinitlistContext::class,
                                                              CPP14Parser.ClassnameContext::class,
                                                              CPP14Parser.ClassspecifierContext::class,
                                                              CPP14Parser.ClassheadContext::class,
                                                              CPP14Parser.ClassheadnameContext::class,
                                                              CPP14Parser.ClassvirtspecifierContext::class,
                                                              CPP14Parser.ClasskeyContext::class,
                                                              CPP14Parser.MemberspecificationContext::class,
                                                              CPP14Parser.MemberdeclarationContext::class,
                                                              CPP14Parser.MemberdeclaratorlistContext::class,
                                                              CPP14Parser.MemberdeclaratorContext::class,
                                                              CPP14Parser.VirtspecifierseqContext::class,
                                                              CPP14Parser.VirtspecifierContext::class,
                                                              CPP14Parser.PurespecifierContext::class,
                                                              CPP14Parser.BaseclauseContext::class,
                                                              CPP14Parser.BasespecifierlistContext::class,
                                                              CPP14Parser.BasespecifierContext::class,
                                                              CPP14Parser.ClassordecltypeContext::class,
                                                              CPP14Parser.BasetypespecifierContext::class,
                                                              CPP14Parser.AccessspecifierContext::class,
                                                              CPP14Parser.ConversionfunctionidContext::class,
                                                              CPP14Parser.ConversiontypeidContext::class,
                                                              CPP14Parser.ConversiondeclaratorContext::class,
                                                              CPP14Parser.CtorinitializerContext::class,
                                                              CPP14Parser.MeminitializerlistContext::class,
                                                              CPP14Parser.MeminitializerContext::class,
                                                              CPP14Parser.MeminitializeridContext::class,
                                                              CPP14Parser.OperatorfunctionidContext::class,
                                                              CPP14Parser.LiteraloperatoridContext::class,
                                                              CPP14Parser.TemplatedeclarationContext::class,
                                                              CPP14Parser.TemplateparameterlistContext::class,
                                                              CPP14Parser.TemplateparameterContext::class,
                                                              CPP14Parser.TypeparameterContext::class,
                                                              CPP14Parser.SimpletemplateidContext::class,
                                                              CPP14Parser.TemplateidContext::class,
                                                              CPP14Parser.TemplatenameContext::class,
                                                              CPP14Parser.TemplateargumentlistContext::class,
                                                              CPP14Parser.TemplateargumentContext::class,
                                                              CPP14Parser.TypenamespecifierContext::class,
                                                              CPP14Parser.ExplicitinstantiationContext::class,
                                                              CPP14Parser.ExplicitspecializationContext::class,
                                                              CPP14Parser.TryblockContext::class,
                                                              CPP14Parser.FunctiontryblockContext::class,
                                                              CPP14Parser.HandlerseqContext::class,
                                                              CPP14Parser.HandlerContext::class,
                                                              CPP14Parser.ExceptiondeclarationContext::class,
                                                              CPP14Parser.ThrowexpressionContext::class,
                                                              CPP14Parser.ExceptionspecificationContext::class,
                                                              CPP14Parser.DynamicexceptionspecificationContext::class,
                                                              CPP14Parser.TypeidlistContext::class,
                                                              CPP14Parser.NoexceptspecificationContext::class,
                                                              CPP14Parser.RightShiftContext::class,
                                                              CPP14Parser.RightShiftAssignContext::class,
                                                              CPP14Parser.TheoperatorContext::class,
                                                              CPP14Parser.LiteralContext::class,
                                                              CPP14Parser.BooleanliteralContext::class,
                                                              CPP14Parser.PointerliteralContext::class,
                                                              CPP14Parser.UserdefinedliteralContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "CPP14.g4"

    override val tokenNames: Array<String?>?
        get() = CPP14Parser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = CPP14Parser.Companion.ruleNames
    override val atn: ATN
        get() = CPP14Parser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        MultiLineMacro(1),
        Directive(2),
        Alignas(3),
        Alignof(4),
        Asm(5),
        Auto(6),
        Bool(7),
        Break(8),
        Case(9),
        Catch(10),
        Char(11),
        Char16(12),
        Char32(13),
        Class(14),
        Const(15),
        Constexpr(16),
        Const_cast(17),
        Continue(18),
        Decltype(19),
        Default(20),
        Delete(21),
        Do(22),
        Double(23),
        Dynamic_cast(24),
        Else(25),
        Enum(26),
        Explicit(27),
        Export(28),
        Extern(29),
        False(30),
        Final(31),
        Float(32),
        For(33),
        Friend(34),
        Goto(35),
        If(36),
        Inline(37),
        Int(38),
        Long(39),
        Mutable(40),
        Namespace(41),
        New(42),
        Noexcept(43),
        Nullptr(44),
        Operator(45),
        Override(46),
        Private(47),
        Protected(48),
        Public(49),
        Register(50),
        Reinterpret_cast(51),
        Return(52),
        Short(53),
        Signed(54),
        Sizeof(55),
        Static(56),
        Static_assert(57),
        Static_cast(58),
        Struct(59),
        Switch(60),
        Template(61),
        This(62),
        Thread_local(63),
        Throw(64),
        True(65),
        Try(66),
        Typedef(67),
        Typeid(68),
        Typename(69),
        Union(70),
        Unsigned(71),
        Using(72),
        Virtual(73),
        Void(74),
        Volatile(75),
        Wchar(76),
        While(77),
        LeftParen(78),
        RightParen(79),
        LeftBracket(80),
        RightBracket(81),
        LeftBrace(82),
        RightBrace(83),
        Plus(84),
        Minus(85),
        Star(86),
        Div(87),
        Mod(88),
        Caret(89),
        And(90),
        Or(91),
        Tilde(92),
        Not(93),
        Assign(94),
        Less(95),
        Greater(96),
        PlusAssign(97),
        MinusAssign(98),
        StarAssign(99),
        DivAssign(100),
        ModAssign(101),
        XorAssign(102),
        AndAssign(103),
        OrAssign(104),
        LeftShift(105),
        LeftShiftAssign(106),
        Equal(107),
        NotEqual(108),
        LessEqual(109),
        GreaterEqual(110),
        AndAnd(111),
        OrOr(112),
        PlusPlus(113),
        MinusMinus(114),
        Comma(115),
        ArrowStar(116),
        Arrow(117),
        Question(118),
        Colon(119),
        Doublecolon(120),
        Semi(121),
        Dot(122),
        DotStar(123),
        Ellipsis(124),
        Identifier(125),
        Integerliteral(126),
        Decimalliteral(127),
        Octalliteral(128),
        Hexadecimalliteral(129),
        Binaryliteral(130),
        Integersuffix(131),
        Characterliteral(132),
        Floatingliteral(133),
        Stringliteral(134),
        Userdefinedintegerliteral(135),
        Userdefinedfloatingliteral(136),
        Userdefinedstringliteral(137),
        Userdefinedcharacterliteral(138),
        Whitespace(139),
        Newline(140),
        BlockComment(141),
        LineComment(142)
    }

    enum class Rules(val id: Int) {
        RULE_translationunit(0),
        RULE_primaryexpression(1),
        RULE_idexpression(2),
        RULE_unqualifiedid(3),
        RULE_qualifiedid(4),
        RULE_nestednamespecifier(5),
        RULE_lambdaexpression(6),
        RULE_lambdaintroducer(7),
        RULE_lambdacapture(8),
        RULE_capturedefault(9),
        RULE_capturelist(10),
        RULE_capture(11),
        RULE_simplecapture(12),
        RULE_initcapture(13),
        RULE_lambdadeclarator(14),
        RULE_postfixexpression(15),
        RULE_typeidofexpr(16),
        RULE_typeidofthetypeid(17),
        RULE_expressionlist(18),
        RULE_pseudodestructorname(19),
        RULE_unaryexpression(20),
        RULE_unaryoperator(21),
        RULE_newexpression(22),
        RULE_newplacement(23),
        RULE_newtypeid(24),
        RULE_newdeclarator(25),
        RULE_noptrnewdeclarator(26),
        RULE_newinitializer(27),
        RULE_deleteexpression(28),
        RULE_noexceptexpression(29),
        RULE_castexpression(30),
        RULE_pmexpression(31),
        RULE_multiplicativeexpression(32),
        RULE_additiveexpression(33),
        RULE_shiftexpression(34),
        RULE_relationalexpression(35),
        RULE_equalityexpression(36),
        RULE_andexpression(37),
        RULE_exclusiveorexpression(38),
        RULE_inclusiveorexpression(39),
        RULE_logicalandexpression(40),
        RULE_logicalorexpression(41),
        RULE_conditionalexpression(42),
        RULE_assignmentexpression(43),
        RULE_assignmentoperator(44),
        RULE_expression(45),
        RULE_constantexpression(46),
        RULE_statement(47),
        RULE_labeledstatement(48),
        RULE_expressionstatement(49),
        RULE_compoundstatement(50),
        RULE_statementseq(51),
        RULE_selectionstatement(52),
        RULE_condition(53),
        RULE_iterationstatement(54),
        RULE_forinitstatement(55),
        RULE_forrangedeclaration(56),
        RULE_forrangeinitializer(57),
        RULE_jumpstatement(58),
        RULE_declarationstatement(59),
        RULE_declarationseq(60),
        RULE_declaration(61),
        RULE_blockdeclaration(62),
        RULE_aliasdeclaration(63),
        RULE_simpledeclaration(64),
        RULE_static_assertdeclaration(65),
        RULE_emptydeclaration(66),
        RULE_attributedeclaration(67),
        RULE_declspecifier(68),
        RULE_declspecifierseq(69),
        RULE_storageclassspecifier(70),
        RULE_functionspecifier(71),
        RULE_typedefname(72),
        RULE_typespecifier(73),
        RULE_trailingtypespecifier(74),
        RULE_typespecifierseq(75),
        RULE_trailingtypespecifierseq(76),
        RULE_simpletypespecifier(77),
        RULE_thetypename(78),
        RULE_decltypespecifier(79),
        RULE_elaboratedtypespecifier(80),
        RULE_enumname(81),
        RULE_enumspecifier(82),
        RULE_enumhead(83),
        RULE_opaqueenumdeclaration(84),
        RULE_enumkey(85),
        RULE_enumbase(86),
        RULE_enumeratorlist(87),
        RULE_enumeratordefinition(88),
        RULE_enumerator(89),
        RULE_namespacename(90),
        RULE_originalnamespacename(91),
        RULE_namespacedefinition(92),
        RULE_namednamespacedefinition(93),
        RULE_originalnamespacedefinition(94),
        RULE_extensionnamespacedefinition(95),
        RULE_unnamednamespacedefinition(96),
        RULE_namespacebody(97),
        RULE_namespacealias(98),
        RULE_namespacealiasdefinition(99),
        RULE_qualifiednamespacespecifier(100),
        RULE_usingdeclaration(101),
        RULE_usingdirective(102),
        RULE_asmdefinition(103),
        RULE_linkagespecification(104),
        RULE_attributespecifierseq(105),
        RULE_attributespecifier(106),
        RULE_alignmentspecifier(107),
        RULE_attributelist(108),
        RULE_attribute(109),
        RULE_attributetoken(110),
        RULE_attributescopedtoken(111),
        RULE_attributenamespace(112),
        RULE_attributeargumentclause(113),
        RULE_balancedtokenseq(114),
        RULE_balancedtoken(115),
        RULE_initdeclaratorlist(116),
        RULE_initdeclarator(117),
        RULE_declarator(118),
        RULE_ptrdeclarator(119),
        RULE_noptrdeclarator(120),
        RULE_parametersandqualifiers(121),
        RULE_trailingreturntype(122),
        RULE_ptroperator(123),
        RULE_cvqualifierseq(124),
        RULE_cvqualifier(125),
        RULE_refqualifier(126),
        RULE_declaratorid(127),
        RULE_thetypeid(128),
        RULE_abstractdeclarator(129),
        RULE_ptrabstractdeclarator(130),
        RULE_noptrabstractdeclarator(131),
        RULE_abstractpackdeclarator(132),
        RULE_noptrabstractpackdeclarator(133),
        RULE_parameterdeclarationclause(134),
        RULE_parameterdeclarationlist(135),
        RULE_parameterdeclaration(136),
        RULE_functiondefinition(137),
        RULE_functionbody(138),
        RULE_initializer(139),
        RULE_braceorequalinitializer(140),
        RULE_initializerclause(141),
        RULE_initializerlist(142),
        RULE_bracedinitlist(143),
        RULE_classname(144),
        RULE_classspecifier(145),
        RULE_classhead(146),
        RULE_classheadname(147),
        RULE_classvirtspecifier(148),
        RULE_classkey(149),
        RULE_memberspecification(150),
        RULE_memberdeclaration(151),
        RULE_memberdeclaratorlist(152),
        RULE_memberdeclarator(153),
        RULE_virtspecifierseq(154),
        RULE_virtspecifier(155),
        RULE_purespecifier(156),
        RULE_baseclause(157),
        RULE_basespecifierlist(158),
        RULE_basespecifier(159),
        RULE_classordecltype(160),
        RULE_basetypespecifier(161),
        RULE_accessspecifier(162),
        RULE_conversionfunctionid(163),
        RULE_conversiontypeid(164),
        RULE_conversiondeclarator(165),
        RULE_ctorinitializer(166),
        RULE_meminitializerlist(167),
        RULE_meminitializer(168),
        RULE_meminitializerid(169),
        RULE_operatorfunctionid(170),
        RULE_literaloperatorid(171),
        RULE_templatedeclaration(172),
        RULE_templateparameterlist(173),
        RULE_templateparameter(174),
        RULE_typeparameter(175),
        RULE_simpletemplateid(176),
        RULE_templateid(177),
        RULE_templatename(178),
        RULE_templateargumentlist(179),
        RULE_templateargument(180),
        RULE_typenamespecifier(181),
        RULE_explicitinstantiation(182),
        RULE_explicitspecialization(183),
        RULE_tryblock(184),
        RULE_functiontryblock(185),
        RULE_handlerseq(186),
        RULE_handler(187),
        RULE_exceptiondeclaration(188),
        RULE_throwexpression(189),
        RULE_exceptionspecification(190),
        RULE_dynamicexceptionspecification(191),
        RULE_typeidlist(192),
        RULE_noexceptspecification(193),
        RULE_rightShift(194),
        RULE_rightShiftAssign(195),
        RULE_theoperator(196),
        RULE_literal(197),
        RULE_booleanliteral(198),
        RULE_pointerliteral(199),
        RULE_userdefinedliteral(200)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("translationunit", "primaryexpression", 
                                "idexpression", "unqualifiedid", "qualifiedid", 
                                "nestednamespecifier", "lambdaexpression", 
                                "lambdaintroducer", "lambdacapture", "capturedefault", 
                                "capturelist", "capture", "simplecapture", 
                                "initcapture", "lambdadeclarator", "postfixexpression", 
                                "typeidofexpr", "typeidofthetypeid", "expressionlist", 
                                "pseudodestructorname", "unaryexpression", 
                                "unaryoperator", "newexpression", "newplacement", 
                                "newtypeid", "newdeclarator", "noptrnewdeclarator", 
                                "newinitializer", "deleteexpression", "noexceptexpression", 
                                "castexpression", "pmexpression", "multiplicativeexpression", 
                                "additiveexpression", "shiftexpression", 
                                "relationalexpression", "equalityexpression", 
                                "andexpression", "exclusiveorexpression", 
                                "inclusiveorexpression", "logicalandexpression", 
                                "logicalorexpression", "conditionalexpression", 
                                "assignmentexpression", "assignmentoperator", 
                                "expression", "constantexpression", "statement", 
                                "labeledstatement", "expressionstatement", 
                                "compoundstatement", "statementseq", "selectionstatement", 
                                "condition", "iterationstatement", "forinitstatement", 
                                "forrangedeclaration", "forrangeinitializer", 
                                "jumpstatement", "declarationstatement", 
                                "declarationseq", "declaration", "blockdeclaration", 
                                "aliasdeclaration", "simpledeclaration", 
                                "static_assertdeclaration", "emptydeclaration", 
                                "attributedeclaration", "declspecifier", 
                                "declspecifierseq", "storageclassspecifier", 
                                "functionspecifier", "typedefname", "typespecifier", 
                                "trailingtypespecifier", "typespecifierseq", 
                                "trailingtypespecifierseq", "simpletypespecifier", 
                                "thetypename", "decltypespecifier", "elaboratedtypespecifier", 
                                "enumname", "enumspecifier", "enumhead", 
                                "opaqueenumdeclaration", "enumkey", "enumbase", 
                                "enumeratorlist", "enumeratordefinition", 
                                "enumerator", "namespacename", "originalnamespacename", 
                                "namespacedefinition", "namednamespacedefinition", 
                                "originalnamespacedefinition", "extensionnamespacedefinition", 
                                "unnamednamespacedefinition", "namespacebody", 
                                "namespacealias", "namespacealiasdefinition", 
                                "qualifiednamespacespecifier", "usingdeclaration", 
                                "usingdirective", "asmdefinition", "linkagespecification", 
                                "attributespecifierseq", "attributespecifier", 
                                "alignmentspecifier", "attributelist", "attribute", 
                                "attributetoken", "attributescopedtoken", 
                                "attributenamespace", "attributeargumentclause", 
                                "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
                                "initdeclarator", "declarator", "ptrdeclarator", 
                                "noptrdeclarator", "parametersandqualifiers", 
                                "trailingreturntype", "ptroperator", "cvqualifierseq", 
                                "cvqualifier", "refqualifier", "declaratorid", 
                                "thetypeid", "abstractdeclarator", "ptrabstractdeclarator", 
                                "noptrabstractdeclarator", "abstractpackdeclarator", 
                                "noptrabstractpackdeclarator", "parameterdeclarationclause", 
                                "parameterdeclarationlist", "parameterdeclaration", 
                                "functiondefinition", "functionbody", "initializer", 
                                "braceorequalinitializer", "initializerclause", 
                                "initializerlist", "bracedinitlist", "classname", 
                                "classspecifier", "classhead", "classheadname", 
                                "classvirtspecifier", "classkey", "memberspecification", 
                                "memberdeclaration", "memberdeclaratorlist", 
                                "memberdeclarator", "virtspecifierseq", 
                                "virtspecifier", "purespecifier", "baseclause", 
                                "basespecifierlist", "basespecifier", "classordecltype", 
                                "basetypespecifier", "accessspecifier", 
                                "conversionfunctionid", "conversiontypeid", 
                                "conversiondeclarator", "ctorinitializer", 
                                "meminitializerlist", "meminitializer", 
                                "meminitializerid", "operatorfunctionid", 
                                "literaloperatorid", "templatedeclaration", 
                                "templateparameterlist", "templateparameter", 
                                "typeparameter", "simpletemplateid", "templateid", 
                                "templatename", "templateargumentlist", 
                                "templateargument", "typenamespecifier", 
                                "explicitinstantiation", "explicitspecialization", 
                                "tryblock", "functiontryblock", "handlerseq", 
                                "handler", "exceptiondeclaration", "throwexpression", 
                                "exceptionspecification", "dynamicexceptionspecification", 
                                "typeidlist", "noexceptspecification", "rightShift", 
                                "rightShiftAssign", "theoperator", "literal", 
                                "booleanliteral", "pointerliteral", "userdefinedliteral")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
                                                           "'alignas'", 
                                                           "'alignof'", 
                                                           "'asm'", "'auto'", 
                                                           "'bool'", "'break'", 
                                                           "'case'", "'catch'", 
                                                           "'char'", "'char16_t'", 
                                                           "'char32_t'", 
                                                           "'class'", "'const'", 
                                                           "'constexpr'", 
                                                           "'const_cast'", 
                                                           "'continue'", 
                                                           "'decltype'", 
                                                           "'default'", 
                                                           "'delete'", "'do'", 
                                                           "'double'", "'dynamic_cast'", 
                                                           "'else'", "'enum'", 
                                                           "'explicit'", 
                                                           "'export'", "'extern'", 
                                                           "'false'", "'final'", 
                                                           "'float'", "'for'", 
                                                           "'friend'", "'goto'", 
                                                           "'if'", "'inline'", 
                                                           "'int'", "'long'", 
                                                           "'mutable'", 
                                                           "'namespace'", 
                                                           "'new'", "'noexcept'", 
                                                           "'nullptr'", 
                                                           "'operator'", 
                                                           "'override'", 
                                                           "'private'", 
                                                           "'protected'", 
                                                           "'public'", "'register'", 
                                                           "'reinterpret_cast'", 
                                                           "'return'", "'short'", 
                                                           "'signed'", "'sizeof'", 
                                                           "'static'", "'static_assert'", 
                                                           "'static_cast'", 
                                                           "'struct'", "'switch'", 
                                                           "'template'", 
                                                           "'this'", "'thread_local'", 
                                                           "'throw'", "'true'", 
                                                           "'try'", "'typedef'", 
                                                           "'typeid'", "'typename'", 
                                                           "'union'", "'unsigned'", 
                                                           "'using'", "'virtual'", 
                                                           "'void'", "'volatile'", 
                                                           "'wchar_t'", 
                                                           "'while'", "'('", 
                                                           "')'", "'['", 
                                                           "']'", "'{'", 
                                                           "'}'", "'+'", 
                                                           "'-'", "'*'", 
                                                           "'/'", "'%'", 
                                                           "'^'", "'&'", 
                                                           "'|'", "'~'", 
                                                           "'!'", "'='", 
                                                           "'<'", "'>'", 
                                                           "'+='", "'-='", 
                                                           "'*='", "'/='", 
                                                           "'%='", "'^='", 
                                                           "'&='", "'|='", 
                                                           "'<<'", "'<<='", 
                                                           "'=='", "'!='", 
                                                           "'<='", "'>='", 
                                                           "'&&'", "'||'", 
                                                           "'++'", "'--'", 
                                                           "','", "'->*'", 
                                                           "'->'", "'?'", 
                                                           "':'", "'::'", 
                                                           "';'", "'.'", 
                                                           "'.*'", "'...'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "MultiLineMacro", 
                                                            "Directive", 
                                                            "Alignas", "Alignof", 
                                                            "Asm", "Auto", 
                                                            "Bool", "Break", 
                                                            "Case", "Catch", 
                                                            "Char", "Char16", 
                                                            "Char32", "Class", 
                                                            "Const", "Constexpr", 
                                                            "Const_cast", 
                                                            "Continue", 
                                                            "Decltype", 
                                                            "Default", "Delete", 
                                                            "Do", "Double", 
                                                            "Dynamic_cast", 
                                                            "Else", "Enum", 
                                                            "Explicit", 
                                                            "Export", "Extern", 
                                                            "False", "Final", 
                                                            "Float", "For", 
                                                            "Friend", "Goto", 
                                                            "If", "Inline", 
                                                            "Int", "Long", 
                                                            "Mutable", "Namespace", 
                                                            "New", "Noexcept", 
                                                            "Nullptr", "Operator", 
                                                            "Override", 
                                                            "Private", "Protected", 
                                                            "Public", "Register", 
                                                            "Reinterpret_cast", 
                                                            "Return", "Short", 
                                                            "Signed", "Sizeof", 
                                                            "Static", "Static_assert", 
                                                            "Static_cast", 
                                                            "Struct", "Switch", 
                                                            "Template", 
                                                            "This", "Thread_local", 
                                                            "Throw", "True", 
                                                            "Try", "Typedef", 
                                                            "Typeid", "Typename", 
                                                            "Union", "Unsigned", 
                                                            "Using", "Virtual", 
                                                            "Void", "Volatile", 
                                                            "Wchar", "While", 
                                                            "LeftParen", 
                                                            "RightParen", 
                                                            "LeftBracket", 
                                                            "RightBracket", 
                                                            "LeftBrace", 
                                                            "RightBrace", 
                                                            "Plus", "Minus", 
                                                            "Star", "Div", 
                                                            "Mod", "Caret", 
                                                            "And", "Or", 
                                                            "Tilde", "Not", 
                                                            "Assign", "Less", 
                                                            "Greater", "PlusAssign", 
                                                            "MinusAssign", 
                                                            "StarAssign", 
                                                            "DivAssign", 
                                                            "ModAssign", 
                                                            "XorAssign", 
                                                            "AndAssign", 
                                                            "OrAssign", 
                                                            "LeftShift", 
                                                            "LeftShiftAssign", 
                                                            "Equal", "NotEqual", 
                                                            "LessEqual", 
                                                            "GreaterEqual", 
                                                            "AndAnd", "OrOr", 
                                                            "PlusPlus", 
                                                            "MinusMinus", 
                                                            "Comma", "ArrowStar", 
                                                            "Arrow", "Question", 
                                                            "Colon", "Doublecolon", 
                                                            "Semi", "Dot", 
                                                            "DotStar", "Ellipsis", 
                                                            "Identifier", 
                                                            "Integerliteral", 
                                                            "Decimalliteral", 
                                                            "Octalliteral", 
                                                            "Hexadecimalliteral", 
                                                            "Binaryliteral", 
                                                            "Integersuffix", 
                                                            "Characterliteral", 
                                                            "Floatingliteral", 
                                                            "Stringliteral", 
                                                            "Userdefinedintegerliteral", 
                                                            "Userdefinedfloatingliteral", 
                                                            "Userdefinedstringliteral", 
                                                            "Userdefinedcharacterliteral", 
                                                            "Whitespace", 
                                                            "Newline", "BlockComment", 
                                                            "LineComment")

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

        private const val serializedATNSegment0 : String =
        	"\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0090\u09ae\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0004\u0050\u0009\u0050\u0004\u0051\u0009\u0051\u0004\u0052\u0009\u0052\u0004\u0053\u0009\u0053\u0004\u0054\u0009\u0054\u0004\u0055\u0009\u0055\u0004\u0056\u0009\u0056\u0004\u0057\u0009\u0057\u0004\u0058\u0009\u0058\u0004\u0059\u0009\u0059\u0004\u005a\u0009\u005a\u0004\u005b\u0009\u005b\u0004\u005c\u0009\u005c\u0004\u005d\u0009\u005d\u0004\u005e\u0009\u005e\u0004\u005f\u0009\u005f\u0004\u0060\u0009\u0060\u0004\u0061\u0009\u0061\u0004\u0062\u0009\u0062\u0004\u0063\u0009\u0063\u0004\u0064\u0009\u0064\u0004\u0065\u0009\u0065\u0004\u0066\u0009\u0066\u0004\u0067\u0009\u0067\u0004\u0068\u0009\u0068\u0004\u0069\u0009\u0069\u0004\u006a\u0009\u006a\u0004\u006b\u0009\u006b\u0004\u006c\u0009\u006c\u0004\u006d\u0009\u006d\u0004\u006e\u0009\u006e\u0004\u006f\u0009\u006f\u0004\u0070\u0009\u0070\u0004\u0071\u0009\u0071\u0004\u0072\u0009\u0072\u0004\u0073\u0009\u0073\u0004\u0074\u0009\u0074\u0004\u0075\u0009\u0075\u0004\u0076\u0009\u0076\u0004\u0077\u0009\u0077\u0004\u0078\u0009\u0078\u0004\u0079\u0009\u0079\u0004\u007a\u0009\u007a\u0004\u007b\u0009\u007b\u0004\u007c\u0009\u007c\u0004\u007d\u0009\u007d\u0004\u007e\u0009\u007e\u0004\u007f\u0009\u007f\u0004\u0080\u0009\u0080\u0004\u0081\u0009\u0081\u0004\u0082\u0009\u0082\u0004\u0083\u0009\u0083\u0004\u0084\u0009\u0084\u0004\u0085\u0009\u0085\u0004\u0086\u0009\u0086\u0004\u0087\u0009\u0087\u0004\u0088\u0009\u0088\u0004\u0089\u0009\u0089\u0004\u008a\u0009\u008a\u0004\u008b\u0009\u008b\u0004\u008c\u0009\u008c\u0004\u008d\u0009\u008d\u0004\u008e\u0009\u008e\u0004\u008f\u0009\u008f\u0004\u0090\u0009\u0090\u0004\u0091\u0009\u0091\u0004\u0092\u0009\u0092\u0004\u0093\u0009\u0093\u0004\u0094\u0009\u0094\u0004\u0095\u0009\u0095\u0004\u0096\u0009\u0096\u0004\u0097\u0009\u0097\u0004\u0098\u0009\u0098\u0004\u0099\u0009\u0099\u0004\u009a\u0009\u009a\u0004\u009b\u0009\u009b\u0004\u009c\u0009\u009c\u0004\u009d\u0009\u009d\u0004\u009e\u0009\u009e\u0004\u009f\u0009\u009f\u0004\u00a0\u0009\u00a0\u0004\u00a1\u0009\u00a1\u0004\u00a2\u0009\u00a2\u0004\u00a3\u0009\u00a3\u0004\u00a4\u0009\u00a4\u0004\u00a5\u0009\u00a5\u0004\u00a6\u0009\u00a6\u0004\u00a7\u0009\u00a7\u0004\u00a8\u0009\u00a8\u0004\u00a9\u0009\u00a9\u0004\u00aa\u0009\u00aa\u0004\u00ab\u0009\u00ab\u0004\u00ac\u0009\u00ac\u0004\u00ad\u0009\u00ad\u0004\u00ae\u0009\u00ae\u0004\u00af\u0009\u00af\u0004\u00b0\u0009\u00b0\u0004\u00b1\u0009\u00b1\u0004\u00b2\u0009\u00b2\u0004\u00b3\u0009\u00b3\u0004\u00b4\u0009\u00b4\u0004\u00b5\u0009\u00b5\u0004\u00b6\u0009\u00b6\u0004\u00b7\u0009\u00b7\u0004\u00b8\u0009\u00b8\u0004\u00b9\u0009\u00b9\u0004\u00ba\u0009\u00ba\u0004\u00bb\u0009\u00bb\u0004\u00bc\u0009\u00bc\u0004\u00bd\u0009\u00bd\u0004\u00be\u0009\u00be\u0004\u00bf\u0009\u00bf\u0004\u00c0\u0009\u00c0\u0004\u00c1\u0009\u00c1\u0004\u00c2\u0009\u00c2\u0004\u00c3\u0009\u00c3\u0004\u00c4\u0009\u00c4\u0004\u00c5\u0009\u00c5\u0004\u00c6\u0009\u00c6\u0004\u00c7\u0009\u00c7\u0004\u00c8\u0009\u00c8\u0004\u00c9\u0009\u00c9\u0004\u00ca\u0009\u00ca\u0003\u0002\u0005\u0002\u0196\u000a\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u01a2\u000a\u0003\u0003\u0004\u0003\u0004\u0005\u0004\u01a6\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u01b1\u000a\u0005\u0003\u0006\u0003\u0006\u0005\u0006\u01b5\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u01c4\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u01cb\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u01d0\u000a\u0007\u000c\u0007\u000e\u0007\u01d3\u000b\u0007\u0003\u0008\u0003\u0008\u0005\u0008\u01d7\u000a\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0005\u0009\u01dd\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u01e7\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u01ee\u000a\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u01f4\u000a\u000c\u0007\u000c\u01f6\u000a\u000c\u000c\u000c\u000e\u000c\u01f9\u000b\u000c\u0003\u000d\u0003\u000d\u0005\u000d\u01fd\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0203\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u020a\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0210\u000a\u0010\u0003\u0010\u0005\u0010\u0213\u000a\u0010\u0003\u0010\u0005\u0010\u0216\u000a\u0010\u0003\u0010\u0005\u0010\u0219\u000a\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0220\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0227\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u025b\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u026a\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0270\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0276\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0283\u000a\u0011\u000c\u0011\u000e\u0011\u0286\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0005\u0015\u028f\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u029e\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u02a4\u000a\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u02c2\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0005\u0018\u02c7\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u02cb\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u02cf\u000a\u0018\u0003\u0018\u0005\u0018\u02d2\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u02d6\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u02dc\u000a\u0018\u0005\u0018\u02de\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0005\u001a\u02e6\u000a\u001a\u0003\u001b\u0003\u001b\u0005\u001b\u02ea\u000a\u001b\u0003\u001b\u0005\u001b\u02ed\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u02f4\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u02fb\u000a\u001c\u0007\u001c\u02fd\u000a\u001c\u000c\u001c\u000e\u001c\u0300\u000b\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u0304\u000a\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u0308\u000a\u001d\u0003\u001e\u0005\u001e\u030b\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0310\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0316\u000a\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0323\u000a\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0007\u0021\u032e\u000a\u0021\u000c\u0021\u000e\u0021\u0331\u000b\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0007\u0022\u033f\u000a\u0022\u000c\u0022\u000e\u0022\u0342\u000b\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0007\u0023\u034d\u000a\u0023\u000c\u0023\u000e\u0023\u0350\u000b\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0007\u0024\u035c\u000a\u0024\u000c\u0024\u000e\u0024\u035f\u000b\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0007\u0025\u0370\u000a\u0025\u000c\u0025\u000e\u0025\u0373\u000b\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0007\u0026\u037e\u000a\u0026\u000c\u0026\u000e\u0026\u0381\u000b\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0007\u0027\u0389\u000a\u0027\u000c\u0027\u000e\u0027\u038c\u000b\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0007\u0028\u0394\u000a\u0028\u000c\u0028\u000e\u0028\u0397\u000b\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0007\u0029\u039f\u000a\u0029\u000c\u0029\u000e\u0029\u03a2\u000b\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0007\u002a\u03aa\u000a\u002a\u000c\u002a\u000e\u002a\u03ad\u000b\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0007\u002b\u03b5\u000a\u002b\u000c\u002b\u000e\u002b\u03b8\u000b\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0005\u002c\u03c1\u000a\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u03c9\u000a\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u03d6\u000a\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0007\u002f\u03de\u000a\u002f\u000c\u002f\u000e\u002f\u03e1\u000b\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0005\u0031\u03e7\u000a\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u03eb\u000a\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u03ef\u000a\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u03f3\u000a\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u03f7\u000a\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u03fc\u000a\u0031\u0003\u0031\u0005\u0031\u03ff\u000a\u0031\u0003\u0032\u0005\u0032\u0402\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u0408\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u0410\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u0415\u000a\u0032\u0003\u0033\u0005\u0033\u0418\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0005\u0034\u041e\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u0427\u000a\u0035\u000c\u0035\u000e\u0035\u042a\u000b\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u0440\u000a\u0036\u0003\u0037\u0003\u0037\u0005\u0037\u0444\u000a\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u044c\u000a\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u0452\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u0466\u000a\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u046a\u000a\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u0477\u000a\u0038\u0003\u0039\u0003\u0039\u0005\u0039\u047b\u000a\u0039\u0003\u003a\u0005\u003a\u047e\u000a\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003b\u0003\u003b\u0005\u003b\u0485\u000a\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u048d\u000a\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u0497\u000a\u003c\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0007\u003e\u04a0\u000a\u003e\u000c\u003e\u000e\u003e\u04a3\u000b\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u04ae\u000a\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0005\u0040\u04b8\u000a\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0005\u0041\u04bd\u000a\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0042\u0005\u0042\u04c4\u000a\u0042\u0003\u0042\u0005\u0042\u04c7\u000a\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u04cc\u000a\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u04d1\u000a\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u04e6\u000a\u0046\u0003\u0047\u0003\u0047\u0005\u0047\u04ea\u000a\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0005\u0047\u04ef\u000a\u0047\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0003\u004a\u0003\u004a\u0003\u004b\u0003\u004b\u0003\u004b\u0005\u004b\u04fa\u000a\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u0500\u000a\u004c\u0003\u004d\u0003\u004d\u0005\u004d\u0504\u000a\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0005\u004d\u0509\u000a\u004d\u0003\u004e\u0003\u004e\u0005\u004e\u050d\u000a\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0005\u004e\u0512\u000a\u004e\u0003\u004f\u0005\u004f\u0515\u000a\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0005\u004f\u052b\u000a\u004f\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0005\u0050\u0531\u000a\u0050\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0005\u0051\u053c\u000a\u0051\u0003\u0052\u0003\u0052\u0005\u0052\u0540\u000a\u0052\u0003\u0052\u0005\u0052\u0543\u000a\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0005\u0052\u054d\u000a\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0005\u0052\u0553\u000a\u0052\u0003\u0052\u0005\u0052\u0556\u000a\u0052\u0003\u0053\u0003\u0053\u0003\u0054\u0003\u0054\u0003\u0054\u0005\u0054\u055d\u000a\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0005\u0054\u0567\u000a\u0054\u0003\u0055\u0003\u0055\u0005\u0055\u056b\u000a\u0055\u0003\u0055\u0005\u0055\u056e\u000a\u0055\u0003\u0055\u0005\u0055\u0571\u000a\u0055\u0003\u0055\u0003\u0055\u0005\u0055\u0575\u000a\u0055\u0003\u0055\u0003\u0055\u0003\u0055\u0005\u0055\u057a\u000a\u0055\u0005\u0055\u057c\u000a\u0055\u0003\u0056\u0003\u0056\u0005\u0056\u0580\u000a\u0056\u0003\u0056\u0003\u0056\u0005\u0056\u0584\u000a\u0056\u0003\u0056\u0003\u0056\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0005\u0057\u058d\u000a\u0057\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0007\u0059\u0598\u000a\u0059\u000c\u0059\u000e\u0059\u059b\u000b\u0059\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0005\u005a\u05a2\u000a\u005a\u0003\u005b\u0003\u005b\u0003\u005c\u0003\u005c\u0005\u005c\u05a8\u000a\u005c\u0003\u005d\u0003\u005d\u0003\u005e\u0003\u005e\u0005\u005e\u05ae\u000a\u005e\u0003\u005f\u0003\u005f\u0005\u005f\u05b2\u000a\u005f\u0003\u0060\u0005\u0060\u05b5\u000a\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0061\u0005\u0061\u05be\u000a\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0062\u0005\u0062\u05c7\u000a\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0063\u0005\u0063\u05cf\u000a\u0063\u0003\u0064\u0003\u0064\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0066\u0005\u0066\u05da\u000a\u0066\u0003\u0066\u0003\u0066\u0003\u0067\u0003\u0067\u0005\u0067\u05e0\u000a\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0005\u0067\u05eb\u000a\u0067\u0003\u0068\u0005\u0068\u05ee\u000a\u0068\u0003\u0068\u0003\u0068\u0003\u0068\u0005\u0068\u05f3\u000a\u0068\u0003\u0068\u0003\u0068\u0003\u0068\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u006a\u0003\u006a\u0003\u006a\u0003\u006a\u0005\u006a\u0602\u000a\u006a\u0003\u006a\u0003\u006a\u0003\u006a\u0003\u006a\u0005\u006a\u0608\u000a\u006a\u0003\u006b\u0003\u006b\u0003\u006b\u0003\u006b\u0003\u006b\u0007\u006b\u060f\u000a\u006b\u000c\u006b\u000e\u006b\u0612\u000b\u006b\u0003\u006c\u0003\u006c\u0003\u006c\u0003\u006c\u0003\u006c\u0003\u006c\u0003\u006c\u0005\u006c\u061b\u000a\u006c\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0005\u006d\u0621\u000a\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0005\u006d\u0629\u000a\u006d\u0003\u006d\u0003\u006d\u0005\u006d\u062d\u000a\u006d\u0003\u006e\u0003\u006e\u0005\u006e\u0631\u000a\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0005\u006e\u0636\u000a\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0005\u006e\u063b\u000a\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0007\u006e\u0642\u000a\u006e\u000c\u006e\u000e\u006e\u0645\u000b\u006e\u0003\u006f\u0003\u006f\u0005\u006f\u0649\u000a\u006f\u0003\u0070\u0003\u0070\u0005\u0070\u064d\u000a\u0070\u0003\u0071\u0003\u0071\u0003\u0071\u0003\u0071\u0003\u0072\u0003\u0072\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0074\u0003\u0074\u0005\u0074\u065b\u000a\u0074\u0003\u0074\u0003\u0074\u0007\u0074\u065f\u000a\u0074\u000c\u0074\u000e\u0074\u0662\u000b\u0074\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0005\u0075\u0670\u000a\u0075\u0003\u0076\u0003\u0076\u0003\u0076\u0003\u0076\u0003\u0076\u0003\u0076\u0007\u0076\u0678\u000a\u0076\u000c\u0076\u000e\u0076\u067b\u000b\u0076\u0003\u0077\u0003\u0077\u0005\u0077\u067f\u000a\u0077\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0005\u0078\u0686\u000a\u0078\u0003\u0079\u0003\u0079\u0003\u0079\u0003\u0079\u0005\u0079\u068c\u000a\u0079\u0003\u007a\u0003\u007a\u0003\u007a\u0005\u007a\u0691\u000a\u007a\u0003\u007a\u0003\u007a\u0003\u007a\u0003\u007a\u0005\u007a\u0697\u000a\u007a\u0003\u007a\u0003\u007a\u0003\u007a\u0003\u007a\u0003\u007a\u0005\u007a\u069e\u000a\u007a\u0003\u007a\u0003\u007a\u0005\u007a\u06a2\u000a\u007a\u0007\u007a\u06a4\u000a\u007a\u000c\u007a\u000e\u007a\u06a7\u000b\u007a\u0003\u007b\u0003\u007b\u0003\u007b\u0003\u007b\u0005\u007b\u06ad\u000a\u007b\u0003\u007b\u0005\u007b\u06b0\u000a\u007b\u0003\u007b\u0005\u007b\u06b3\u000a\u007b\u0003\u007b\u0005\u007b\u06b6\u000a\u007b\u0003\u007c\u0003\u007c\u0003\u007c\u0005\u007c\u06bb\u000a\u007c\u0003\u007d\u0003\u007d\u0005\u007d\u06bf\u000a\u007d\u0003\u007d\u0005\u007d\u06c2\u000a\u007d\u0003\u007d\u0003\u007d\u0005\u007d\u06c6\u000a\u007d\u0003\u007d\u0003\u007d\u0005\u007d\u06ca\u000a\u007d\u0003\u007d\u0003\u007d\u0003\u007d\u0005\u007d\u06cf\u000a\u007d\u0003\u007d\u0005\u007d\u06d2\u000a\u007d\u0005\u007d\u06d4\u000a\u007d\u0003\u007e\u0003\u007e\u0005\u007e\u06d8\u000a\u007e\u0003\u007f\u0003\u007f\u0003\u0080\u0003\u0080\u0003\u0081\u0005\u0081\u06df\u000a\u0081\u0003\u0081\u0003\u0081\u0003\u0082\u0003\u0082\u0005\u0082\u06e5\u000a\u0082\u0003\u0083\u0003\u0083\u0005\u0083\u06e9\u000a\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0005\u0083\u06ef\u000a\u0083\u0003\u0084\u0003\u0084\u0003\u0084\u0005\u0084\u06f4\u000a\u0084\u0005\u0084\u06f6\u000a\u0084\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085\u06fc\u000a\u0085\u0003\u0085\u0003\u0085\u0005\u0085\u0700\u000a\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085\u0706\u000a\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085\u070d\u000a\u0085\u0003\u0085\u0003\u0085\u0005\u0085\u0711\u000a\u0085\u0007\u0085\u0713\u000a\u0085\u000c\u0085\u000e\u0085\u0716\u000b\u0085\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0005\u0086\u071c\u000a\u0086\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0005\u0087\u0726\u000a\u0087\u0003\u0087\u0003\u0087\u0005\u0087\u072a\u000a\u0087\u0007\u0087\u072c\u000a\u0087\u000c\u0087\u000e\u0087\u072f\u000b\u0087\u0003\u0088\u0005\u0088\u0732\u000a\u0088\u0003\u0088\u0005\u0088\u0735\u000a\u0088\u0003\u0088\u0003\u0088\u0003\u0088\u0003\u0088\u0005\u0088\u073b\u000a\u0088\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u0089\u0007\u0089\u0743\u000a\u0089\u000c\u0089\u000e\u0089\u0746\u000b\u0089\u0003\u008a\u0005\u008a\u0749\u000a\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0005\u008a\u074f\u000a\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0005\u008a\u0757\u000a\u008a\u0003\u008a\u0003\u008a\u0005\u008a\u075b\u000a\u008a\u0003\u008a\u0005\u008a\u075e\u000a\u008a\u0003\u008a\u0003\u008a\u0005\u008a\u0762\u000a\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0005\u008a\u0767\u000a\u008a\u0003\u008b\u0005\u008b\u076a\u000a\u008b\u0003\u008b\u0005\u008b\u076d\u000a\u008b\u0003\u008b\u0003\u008b\u0005\u008b\u0771\u000a\u008b\u0003\u008b\u0003\u008b\u0003\u008c\u0005\u008c\u0776\u000a\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0005\u008c\u0780\u000a\u008c\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0005\u008d\u0787\u000a\u008d\u0003\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u078c\u000a\u008e\u0003\u008f\u0003\u008f\u0005\u008f\u0790\u000a\u008f\u0003\u0090\u0003\u0090\u0003\u0090\u0005\u0090\u0795\u000a\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0005\u0090\u079b\u000a\u0090\u0007\u0090\u079d\u000a\u0090\u000c\u0090\u000e\u0090\u07a0\u000b\u0090\u0003\u0091\u0003\u0091\u0003\u0091\u0005\u0091\u07a5\u000a\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0005\u0091\u07ab\u000a\u0091\u0003\u0092\u0003\u0092\u0005\u0092\u07af\u000a\u0092\u0003\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u07b4\u000a\u0093\u0003\u0093\u0003\u0093\u0003\u0094\u0003\u0094\u0005\u0094\u07ba\u000a\u0094\u0003\u0094\u0003\u0094\u0005\u0094\u07be\u000a\u0094\u0003\u0094\u0005\u0094\u07c1\u000a\u0094\u0003\u0094\u0003\u0094\u0005\u0094\u07c5\u000a\u0094\u0003\u0094\u0005\u0094\u07c8\u000a\u0094\u0005\u0094\u07ca\u000a\u0094\u0003\u0095\u0005\u0095\u07cd\u000a\u0095\u0003\u0095\u0003\u0095\u0003\u0096\u0003\u0096\u0003\u0097\u0003\u0097\u0003\u0098\u0003\u0098\u0005\u0098\u07d7\u000a\u0098\u0003\u0098\u0003\u0098\u0003\u0098\u0005\u0098\u07dc\u000a\u0098\u0005\u0098\u07de\u000a\u0098\u0003\u0099\u0005\u0099\u07e1\u000a\u0099\u0003\u0099\u0005\u0099\u07e4\u000a\u0099\u0003\u0099\u0005\u0099\u07e7\u000a\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0005\u0099\u07f0\u000a\u0099\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0007\u009a\u07f8\u000a\u009a\u000c\u009a\u000e\u009a\u07fb\u000b\u009a\u0003\u009b\u0003\u009b\u0005\u009b\u07ff\u000a\u009b\u0003\u009b\u0005\u009b\u0802\u000a\u009b\u0003\u009b\u0003\u009b\u0005\u009b\u0806\u000a\u009b\u0003\u009b\u0005\u009b\u0809\u000a\u009b\u0003\u009b\u0005\u009b\u080c\u000a\u009b\u0003\u009b\u0003\u009b\u0005\u009b\u0810\u000a\u009b\u0003\u009c\u0003\u009c\u0003\u009c\u0003\u009c\u0003\u009c\u0007\u009c\u0817\u000a\u009c\u000c\u009c\u000e\u009c\u081a\u000b\u009c\u0003\u009d\u0003\u009d\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009f\u0003\u009f\u0003\u009f\u0003\u00a0\u0003\u00a0\u0003\u00a0\u0005\u00a0\u0828\u000a\u00a0\u0003\u00a0\u0003\u00a0\u0003\u00a0\u0003\u00a0\u0005\u00a0\u082e\u000a\u00a0\u0007\u00a0\u0830\u000a\u00a0\u000c\u00a0\u000e\u00a0\u0833\u000b\u00a0\u0003\u00a1\u0005\u00a1\u0836\u000a\u00a1\u0003\u00a1\u0003\u00a1\u0005\u00a1\u083a\u000a\u00a1\u0003\u00a1\u0003\u00a1\u0005\u00a1\u083e\u000a\u00a1\u0003\u00a1\u0003\u00a1\u0005\u00a1\u0842\u000a\u00a1\u0003\u00a1\u0003\u00a1\u0005\u00a1\u0846\u000a\u00a1\u0003\u00a1\u0003\u00a1\u0005\u00a1\u084a\u000a\u00a1\u0003\u00a2\u0005\u00a2\u084d\u000a\u00a2\u0003\u00a2\u0003\u00a2\u0005\u00a2\u0851\u000a\u00a2\u0003\u00a3\u0003\u00a3\u0003\u00a4\u0003\u00a4\u0003\u00a5\u0003\u00a5\u0003\u00a5\u0003\u00a6\u0003\u00a6\u0005\u00a6\u085c\u000a\u00a6\u0003\u00a7\u0003\u00a7\u0005\u00a7\u0860\u000a\u00a7\u0003\u00a8\u0003\u00a8\u0003\u00a8\u0003\u00a9\u0003\u00a9\u0005\u00a9\u0867\u000a\u00a9\u0003\u00a9\u0003\u00a9\u0005\u00a9\u086b\u000a\u00a9\u0003\u00a9\u0003\u00a9\u0003\u00a9\u0005\u00a9\u0870\u000a\u00a9\u0003\u00aa\u0003\u00aa\u0003\u00aa\u0005\u00aa\u0875\u000a\u00aa\u0003\u00aa\u0003\u00aa\u0003\u00aa\u0003\u00aa\u0003\u00aa\u0005\u00aa\u087c\u000a\u00aa\u0003\u00ab\u0003\u00ab\u0005\u00ab\u0880\u000a\u00ab\u0003\u00ac\u0003\u00ac\u0003\u00ac\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0005\u00ad\u088a\u000a\u00ad\u0003\u00ae\u0003\u00ae\u0003\u00ae\u0003\u00ae\u0003\u00ae\u0003\u00ae\u0003\u00af\u0003\u00af\u0003\u00af\u0003\u00af\u0003\u00af\u0003\u00af\u0007\u00af\u0898\u000a\u00af\u000c\u00af\u000e\u00af\u089b\u000b\u00af\u0003\u00b0\u0003\u00b0\u0005\u00b0\u089f\u000a\u00b0\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08a3\u000a\u00b1\u0003\u00b1\u0005\u00b1\u08a6\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08aa\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08b0\u000a\u00b1\u0003\u00b1\u0005\u00b1\u08b3\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08b7\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08c1\u000a\u00b1\u0003\u00b1\u0005\u00b1\u08c4\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08cc\u000a\u00b1\u0003\u00b1\u0003\u00b1\u0003\u00b1\u0005\u00b1\u08d1\u000a\u00b1\u0003\u00b2\u0003\u00b2\u0003\u00b2\u0005\u00b2\u08d6\u000a\u00b2\u0003\u00b2\u0003\u00b2\u0003\u00b3\u0003\u00b3\u0003\u00b3\u0003\u00b3\u0005\u00b3\u08de\u000a\u00b3\u0003\u00b3\u0003\u00b3\u0003\u00b3\u0003\u00b3\u0003\u00b3\u0005\u00b3\u08e5\u000a\u00b3\u0003\u00b3\u0003\u00b3\u0005\u00b3\u08e9\u000a\u00b3\u0003\u00b4\u0003\u00b4\u0003\u00b5\u0003\u00b5\u0003\u00b5\u0005\u00b5\u08f0\u000a\u00b5\u0003\u00b5\u0003\u00b5\u0003\u00b5\u0003\u00b5\u0005\u00b5\u08f6\u000a\u00b5\u0007\u00b5\u08f8\u000a\u00b5\u000c\u00b5\u000e\u00b5\u08fb\u000b\u00b5\u0003\u00b6\u0003\u00b6\u0003\u00b6\u0005\u00b6\u0900\u000a\u00b6\u0003\u00b7\u0003\u00b7\u0003\u00b7\u0003\u00b7\u0003\u00b7\u0003\u00b7\u0003\u00b7\u0005\u00b7\u0909\u000a\u00b7\u0003\u00b7\u0003\u00b7\u0005\u00b7\u090d\u000a\u00b7\u0003\u00b8\u0005\u00b8\u0910\u000a\u00b8\u0003\u00b8\u0003\u00b8\u0003\u00b8\u0003\u00b9\u0003\u00b9\u0003\u00b9\u0003\u00b9\u0003\u00b9\u0003\u00ba\u0003\u00ba\u0003\u00ba\u0003\u00ba\u0003\u00bb\u0003\u00bb\u0005\u00bb\u0920\u000a\u00bb\u0003\u00bb\u0003\u00bb\u0003\u00bb\u0003\u00bc\u0003\u00bc\u0005\u00bc\u0927\u000a\u00bc\u0003\u00bd\u0003\u00bd\u0003\u00bd\u0003\u00bd\u0003\u00bd\u0003\u00bd\u0003\u00be\u0005\u00be\u0930\u000a\u00be\u0003\u00be\u0003\u00be\u0003\u00be\u0003\u00be\u0005\u00be\u0936\u000a\u00be\u0003\u00be\u0003\u00be\u0005\u00be\u093a\u000a\u00be\u0003\u00be\u0005\u00be\u093d\u000a\u00be\u0003\u00bf\u0003\u00bf\u0005\u00bf\u0941\u000a\u00bf\u0003\u00c0\u0003\u00c0\u0005\u00c0\u0945\u000a\u00c0\u0003\u00c1\u0003\u00c1\u0003\u00c1\u0005\u00c1\u094a\u000a\u00c1\u0003\u00c1\u0003\u00c1\u0003\u00c2\u0003\u00c2\u0003\u00c2\u0005\u00c2\u0951\u000a\u00c2\u0003\u00c2\u0003\u00c2\u0003\u00c2\u0003\u00c2\u0005\u00c2\u0957\u000a\u00c2\u0007\u00c2\u0959\u000a\u00c2\u000c\u00c2\u000e\u00c2\u095c\u000b\u00c2\u0003\u00c3\u0003\u00c3\u0003\u00c3\u0003\u00c3\u0003\u00c3\u0003\u00c3\u0005\u00c3\u0964\u000a\u00c3\u0003\u00c4\u0003\u00c4\u0003\u00c4\u0003\u00c5\u0003\u00c5\u0003\u00c5\u0003\u00c5\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0003\u00c6\u0005\u00c6\u099d\u000a\u00c6\u0003\u00c7\u0003\u00c7\u0003\u00c7\u0003\u00c7\u0003\u00c7\u0003\u00c7\u0003\u00c7\u0005\u00c7\u09a6\u000a\u00c7\u0003\u00c8\u0003\u00c8\u0003\u00c9\u0003\u00c9\u0003\u00ca\u0003\u00ca\u0003\u00ca\u0002\u0024\u000c\u0016\u0020\u0036\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u005c\u0068\u007a\u00b0\u00d4\u00da\u00e6\u00ea\u00f2\u0108\u010c\u0110\u011e\u0132\u0136\u013e\u015c\u0168\u0182\u00cb\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0002\u000d\u0004\u0002\u005c\u005c\u0060\u0060\u0004\u0002\u0056\u0058\u005c\u005f\u0007\u0002\u001f\u001f\u002a\u002a\u0034\u0034\u003a\u003a\u0041\u0041\u0005\u0002\u001d\u001d\u0027\u0027\u004b\u004b\u0004\u0002\u0011\u0011\u004d\u004d\u0004\u0002\u005c\u005c\u0071\u0071\u0005\u0002\u0010\u0010\u003d\u003d\u0048\u0048\u0004\u0002\u0021\u0021\u0030\u0030\u0003\u0002\u0031\u0033\u0004\u0002\u0020\u0020\u0043\u0043\u0003\u0002\u0089\u008c\u0002\u0acd\u0002\u0195\u0003\u0002\u0002\u0002\u0004\u01a1\u0003\u0002\u0002\u0002\u0006\u01a5\u0003\u0002\u0002\u0002\u0008\u01b0\u0003\u0002\u0002\u0002\u000a\u01b2\u0003\u0002\u0002\u0002\u000c\u01c3\u0003\u0002\u0002\u0002\u000e\u01d4\u0003\u0002\u0002\u0002\u0010\u01da\u0003\u0002\u0002\u0002\u0012\u01e6\u0003\u0002\u0002\u0002\u0014\u01e8\u0003\u0002\u0002\u0002\u0016\u01ea\u0003\u0002\u0002\u0002\u0018\u01fc\u0003\u0002\u0002\u0002\u001a\u0202\u0003\u0002\u0002\u0002\u001c\u0209\u0003\u0002\u0002\u0002\u001e\u020b\u0003\u0002\u0002\u0002\u0020\u025a\u0003\u0002\u0002\u0002\u0022\u0287\u0003\u0002\u0002\u0002\u0024\u0289\u0003\u0002\u0002\u0002\u0026\u028b\u0003\u0002\u0002\u0002\u0028\u02a3\u0003\u0002\u0002\u0002\u002a\u02c1\u0003\u0002\u0002\u0002\u002c\u02c3\u0003\u0002\u0002\u0002\u002e\u02dd\u0003\u0002\u0002\u0002\u0030\u02df\u0003\u0002\u0002\u0002\u0032\u02e3\u0003\u0002\u0002\u0002\u0034\u02ec\u0003\u0002\u0002\u0002\u0036\u02ee\u0003\u0002\u0002\u0002\u0038\u0307\u0003\u0002\u0002\u0002\u003a\u0315\u0003\u0002\u0002\u0002\u003c\u0317\u0003\u0002\u0002\u0002\u003e\u0322\u0003\u0002\u0002\u0002\u0040\u0324\u0003\u0002\u0002\u0002\u0042\u0332\u0003\u0002\u0002\u0002\u0044\u0343\u0003\u0002\u0002\u0002\u0046\u0351\u0003\u0002\u0002\u0002\u0048\u0360\u0003\u0002\u0002\u0002\u004a\u0374\u0003\u0002\u0002\u0002\u004c\u0382\u0003\u0002\u0002\u0002\u004e\u038d\u0003\u0002\u0002\u0002\u0050\u0398\u0003\u0002\u0002\u0002\u0052\u03a3\u0003\u0002\u0002\u0002\u0054\u03ae\u0003\u0002\u0002\u0002\u0056\u03c0\u0003\u0002\u0002\u0002\u0058\u03c8\u0003\u0002\u0002\u0002\u005a\u03d5\u0003\u0002\u0002\u0002\u005c\u03d7\u0003\u0002\u0002\u0002\u005e\u03e2\u0003\u0002\u0002\u0002\u0060\u03fe\u0003\u0002\u0002\u0002\u0062\u0414\u0003\u0002\u0002\u0002\u0064\u0417\u0003\u0002\u0002\u0002\u0066\u041b\u0003\u0002\u0002\u0002\u0068\u0421\u0003\u0002\u0002\u0002\u006a\u043f\u0003\u0002\u0002\u0002\u006c\u0451\u0003\u0002\u0002\u0002\u006e\u0476\u0003\u0002\u0002\u0002\u0070\u047a\u0003\u0002\u0002\u0002\u0072\u047d\u0003\u0002\u0002\u0002\u0074\u0484\u0003\u0002\u0002\u0002\u0076\u0496\u0003\u0002\u0002\u0002\u0078\u0498\u0003\u0002\u0002\u0002\u007a\u049a\u0003\u0002\u0002\u0002\u007c\u04ad\u0003\u0002\u0002\u0002\u007e\u04b7\u0003\u0002\u0002\u0002\u0080\u04b9\u0003\u0002\u0002\u0002\u0082\u04d0\u0003\u0002\u0002\u0002\u0084\u04d2\u0003\u0002\u0002\u0002\u0086\u04da\u0003\u0002\u0002\u0002\u0088\u04dc\u0003\u0002\u0002\u0002\u008a\u04e5\u0003\u0002\u0002\u0002\u008c\u04ee\u0003\u0002\u0002\u0002\u008e\u04f0\u0003\u0002\u0002\u0002\u0090\u04f2\u0003\u0002\u0002\u0002\u0092\u04f4\u0003\u0002\u0002\u0002\u0094\u04f9\u0003\u0002\u0002\u0002\u0096\u04ff\u0003\u0002\u0002\u0002\u0098\u0508\u0003\u0002\u0002\u0002\u009a\u0511\u0003\u0002\u0002\u0002\u009c\u052a\u0003\u0002\u0002\u0002\u009e\u0530\u0003\u0002\u0002\u0002\u00a0\u053b\u0003\u0002\u0002\u0002\u00a2\u0555\u0003\u0002\u0002\u0002\u00a4\u0557\u0003\u0002\u0002\u0002\u00a6\u0566\u0003\u0002\u0002\u0002\u00a8\u057b\u0003\u0002\u0002\u0002\u00aa\u057d\u0003\u0002\u0002\u0002\u00ac\u058c\u0003\u0002\u0002\u0002\u00ae\u058e\u0003\u0002\u0002\u0002\u00b0\u0591\u0003\u0002\u0002\u0002\u00b2\u05a1\u0003\u0002\u0002\u0002\u00b4\u05a3\u0003\u0002\u0002\u0002\u00b6\u05a7\u0003\u0002\u0002\u0002\u00b8\u05a9\u0003\u0002\u0002\u0002\u00ba\u05ad\u0003\u0002\u0002\u0002\u00bc\u05b1\u0003\u0002\u0002\u0002\u00be\u05b4\u0003\u0002\u0002\u0002\u00c0\u05bd\u0003\u0002\u0002\u0002\u00c2\u05c6\u0003\u0002\u0002\u0002\u00c4\u05ce\u0003\u0002\u0002\u0002\u00c6\u05d0\u0003\u0002\u0002\u0002\u00c8\u05d2\u0003\u0002\u0002\u0002\u00ca\u05d9\u0003\u0002\u0002\u0002\u00cc\u05ea\u0003\u0002\u0002\u0002\u00ce\u05ed\u0003\u0002\u0002\u0002\u00d0\u05f7\u0003\u0002\u0002\u0002\u00d2\u0607\u0003\u0002\u0002\u0002\u00d4\u0609\u0003\u0002\u0002\u0002\u00d6\u061a\u0003\u0002\u0002\u0002\u00d8\u062c\u0003\u0002\u0002\u0002\u00da\u0635\u0003\u0002\u0002\u0002\u00dc\u0646\u0003\u0002\u0002\u0002\u00de\u064c\u0003\u0002\u0002\u0002\u00e0\u064e\u0003\u0002\u0002\u0002\u00e2\u0652\u0003\u0002\u0002\u0002\u00e4\u0654\u0003\u0002\u0002\u0002\u00e6\u0658\u0003\u0002\u0002\u0002\u00e8\u066f\u0003\u0002\u0002\u0002\u00ea\u0671\u0003\u0002\u0002\u0002\u00ec\u067c\u0003\u0002\u0002\u0002\u00ee\u0685\u0003\u0002\u0002\u0002\u00f0\u068b\u0003\u0002\u0002\u0002\u00f2\u0696\u0003\u0002\u0002\u0002\u00f4\u06a8\u0003\u0002\u0002\u0002\u00f6\u06b7\u0003\u0002\u0002\u0002\u00f8\u06d3\u0003\u0002\u0002\u0002\u00fa\u06d5\u0003\u0002\u0002\u0002\u00fc\u06d9\u0003\u0002\u0002\u0002\u00fe\u06db\u0003\u0002\u0002\u0002\u0100\u06de\u0003\u0002\u0002\u0002\u0102\u06e2\u0003\u0002\u0002\u0002\u0104\u06ee\u0003\u0002\u0002\u0002\u0106\u06f5\u0003\u0002\u0002\u0002\u0108\u0705\u0003\u0002\u0002\u0002\u010a\u071b\u0003\u0002\u0002\u0002\u010c\u071d\u0003\u0002\u0002\u0002\u010e\u073a\u0003\u0002\u0002\u0002\u0110\u073c\u0003\u0002\u0002\u0002\u0112\u0766\u0003\u0002\u0002\u0002\u0114\u0769\u0003\u0002\u0002\u0002\u0116\u077f\u0003\u0002\u0002\u0002\u0118\u0786\u0003\u0002\u0002\u0002\u011a\u078b\u0003\u0002\u0002\u0002\u011c\u078f\u0003\u0002\u0002\u0002\u011e\u0791\u0003\u0002\u0002\u0002\u0120\u07aa\u0003\u0002\u0002\u0002\u0122\u07ae\u0003\u0002\u0002\u0002\u0124\u07b0\u0003\u0002\u0002\u0002\u0126\u07c9\u0003\u0002\u0002\u0002\u0128\u07cc\u0003\u0002\u0002\u0002\u012a\u07d0\u0003\u0002\u0002\u0002\u012c\u07d2\u0003\u0002\u0002\u0002\u012e\u07dd\u0003\u0002\u0002\u0002\u0130\u07ef\u0003\u0002\u0002\u0002\u0132\u07f1\u0003\u0002\u0002\u0002\u0134\u080f\u0003\u0002\u0002\u0002\u0136\u0811\u0003\u0002\u0002\u0002\u0138\u081b\u0003\u0002\u0002\u0002\u013a\u081d\u0003\u0002\u0002\u0002\u013c\u0821\u0003\u0002\u0002\u0002\u013e\u0824\u0003\u0002\u0002\u0002\u0140\u0849\u0003\u0002\u0002\u0002\u0142\u0850\u0003\u0002\u0002\u0002\u0144\u0852\u0003\u0002\u0002\u0002\u0146\u0854\u0003\u0002\u0002\u0002\u0148\u0856\u0003\u0002\u0002\u0002\u014a\u0859\u0003\u0002\u0002\u0002\u014c\u085d\u0003\u0002\u0002\u0002\u014e\u0861\u0003\u0002\u0002\u0002\u0150\u086f\u0003\u0002\u0002\u0002\u0152\u087b\u0003\u0002\u0002\u0002\u0154\u087f\u0003\u0002\u0002\u0002\u0156\u0881\u0003\u0002\u0002\u0002\u0158\u0889\u0003\u0002\u0002\u0002\u015a\u088b\u0003\u0002\u0002\u0002\u015c\u0891\u0003\u0002\u0002\u0002\u015e\u089e\u0003\u0002\u0002\u0002\u0160\u08d0\u0003\u0002\u0002\u0002\u0162\u08d2\u0003\u0002\u0002\u0002\u0164\u08e8\u0003\u0002\u0002\u0002\u0166\u08ea\u0003\u0002\u0002\u0002\u0168\u08ec\u0003\u0002\u0002\u0002\u016a\u08ff\u0003\u0002\u0002\u0002\u016c\u090c\u0003\u0002\u0002\u0002\u016e\u090f\u0003\u0002\u0002\u0002\u0170\u0914\u0003\u0002\u0002\u0002\u0172\u0919\u0003\u0002\u0002\u0002\u0174\u091d\u0003\u0002\u0002\u0002\u0176\u0924\u0003\u0002\u0002\u0002\u0178\u0928\u0003\u0002\u0002\u0002\u017a\u093c\u0003\u0002\u0002\u0002\u017c\u093e\u0003\u0002\u0002\u0002\u017e\u0944\u0003\u0002\u0002\u0002\u0180\u0946\u0003\u0002\u0002\u0002\u0182\u094d\u0003\u0002\u0002\u0002\u0184\u0963\u0003\u0002\u0002\u0002\u0186\u0965\u0003\u0002\u0002\u0002\u0188\u0968\u0003\u0002\u0002\u0002\u018a\u099c\u0003\u0002\u0002\u0002\u018c\u09a5\u0003\u0002\u0002\u0002\u018e\u09a7\u0003\u0002\u0002\u0002\u0190\u09a9\u0003\u0002\u0002\u0002\u0192\u09ab\u0003\u0002\u0002\u0002\u0194\u0196\u0005\u007a\u003e\u0002\u0195\u0194\u0003\u0002\u0002\u0002\u0195\u0196\u0003\u0002\u0002\u0002\u0196\u0197\u0003\u0002\u0002\u0002\u0197\u0198\u0007\u0002\u0002\u0003\u0198\u0003\u0003\u0002\u0002\u0002\u0199\u01a2\u0005\u018c\u00c7\u0002\u019a\u01a2\u0007\u0040\u0002\u0002\u019b\u019c\u0007\u0050\u0002\u0002\u019c\u019d\u0005\u005c\u002f\u0002\u019d\u019e\u0007\u0051\u0002\u0002\u019e\u01a2\u0003\u0002\u0002\u0002\u019f\u01a2\u0005\u0006\u0004\u0002\u01a0\u01a2\u0005\u000e\u0008\u0002\u01a1\u0199\u0003\u0002\u0002\u0002\u01a1\u019a\u0003\u0002\u0002\u0002\u01a1\u019b\u0003\u0002\u0002\u0002\u01a1\u019f\u0003\u0002\u0002\u0002\u01a1\u01a0\u0003\u0002\u0002\u0002\u01a2\u0005\u0003\u0002\u0002\u0002\u01a3\u01a6\u0005\u0008\u0005\u0002\u01a4\u01a6\u0005\u000a\u0006\u0002\u01a5\u01a3\u0003\u0002\u0002\u0002\u01a5\u01a4\u0003\u0002\u0002\u0002\u01a6\u0007\u0003\u0002\u0002\u0002\u01a7\u01b1\u0007\u007f\u0002\u0002\u01a8\u01b1\u0005\u0156\u00ac\u0002\u01a9\u01b1\u0005\u0148\u00a5\u0002\u01aa\u01b1\u0005\u0158\u00ad\u0002\u01ab\u01ac\u0007\u005e\u0002\u0002\u01ac\u01b1\u0005\u0122\u0092\u0002\u01ad\u01ae\u0007\u005e\u0002\u0002\u01ae\u01b1\u0005\u00a0\u0051\u0002\u01af\u01b1\u0005\u0164\u00b3\u0002\u01b0\u01a7\u0003\u0002\u0002\u0002\u01b0\u01a8\u0003\u0002\u0002\u0002\u01b0\u01a9\u0003\u0002\u0002\u0002\u01b0\u01aa\u0003\u0002\u0002\u0002\u01b0\u01ab\u0003\u0002\u0002\u0002\u01b0\u01ad\u0003\u0002\u0002\u0002\u01b0\u01af\u0003\u0002\u0002\u0002\u01b1\u0009\u0003\u0002\u0002\u0002\u01b2\u01b4\u0005\u000c\u0007\u0002\u01b3\u01b5\u0007\u003f\u0002\u0002\u01b4\u01b3\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01b7\u0005\u0008\u0005\u0002\u01b7\u000b\u0003\u0002\u0002\u0002\u01b8\u01b9\u0008\u0007\u0001\u0002\u01b9\u01c4\u0007\u007a\u0002\u0002\u01ba\u01bb\u0005\u009e\u0050\u0002\u01bb\u01bc\u0007\u007a\u0002\u0002\u01bc\u01c4\u0003\u0002\u0002\u0002\u01bd\u01be\u0005\u00b6\u005c\u0002\u01be\u01bf\u0007\u007a\u0002\u0002\u01bf\u01c4\u0003\u0002\u0002\u0002\u01c0\u01c1\u0005\u00a0\u0051\u0002\u01c1\u01c2\u0007\u007a\u0002\u0002\u01c2\u01c4\u0003\u0002\u0002\u0002\u01c3\u01b8\u0003\u0002\u0002\u0002\u01c3\u01ba\u0003\u0002\u0002\u0002\u01c3\u01bd\u0003\u0002\u0002\u0002\u01c3\u01c0\u0003\u0002\u0002\u0002\u01c4\u01d1\u0003\u0002\u0002\u0002\u01c5\u01c6\u000c\u0004\u0002\u0002\u01c6\u01c7\u0007\u007f\u0002\u0002\u01c7\u01d0\u0007\u007a\u0002\u0002\u01c8\u01ca\u000c\u0003\u0002\u0002\u01c9\u01cb\u0007\u003f\u0002\u0002\u01ca\u01c9\u0003\u0002\u0002\u0002\u01ca\u01cb\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u01cd\u0005\u0162\u00b2\u0002\u01cd\u01ce\u0007\u007a\u0002\u0002\u01ce\u01d0\u0003\u0002\u0002\u0002\u01cf\u01c5\u0003\u0002\u0002\u0002\u01cf\u01c8\u0003\u0002\u0002\u0002\u01d0\u01d3\u0003\u0002\u0002\u0002\u01d1\u01cf\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u000d\u0003\u0002\u0002\u0002\u01d3\u01d1\u0003\u0002\u0002\u0002\u01d4\u01d6\u0005\u0010\u0009\u0002\u01d5\u01d7\u0005\u001e\u0010\u0002\u01d6\u01d5\u0003\u0002\u0002\u0002\u01d6\u01d7\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01d9\u0005\u0066\u0034\u0002\u01d9\u000f\u0003\u0002\u0002\u0002\u01da\u01dc\u0007\u0052\u0002\u0002\u01db\u01dd\u0005\u0012\u000a\u0002\u01dc\u01db\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002\u0002\u01de\u01df\u0007\u0053\u0002\u0002\u01df\u0011\u0003\u0002\u0002\u0002\u01e0\u01e7\u0005\u0014\u000b\u0002\u01e1\u01e7\u0005\u0016\u000c\u0002\u01e2\u01e3\u0005\u0014\u000b\u0002\u01e3\u01e4\u0007\u0075\u0002\u0002\u01e4\u01e5\u0005\u0016\u000c\u0002\u01e5\u01e7\u0003\u0002\u0002\u0002\u01e6\u01e0\u0003\u0002\u0002\u0002\u01e6\u01e1\u0003\u0002\u0002\u0002\u01e6\u01e2\u0003\u0002\u0002\u0002\u01e7\u0013\u0003\u0002\u0002\u0002\u01e8\u01e9\u0009\u0002\u0002\u0002\u01e9\u0015\u0003\u0002\u0002\u0002\u01ea\u01eb\u0008\u000c\u0001\u0002\u01eb\u01ed\u0005\u0018\u000d\u0002\u01ec\u01ee\u0007\u007e\u0002\u0002\u01ed\u01ec\u0003\u0002\u0002\u0002\u01ed\u01ee\u0003\u0002\u0002\u0002\u01ee\u01f7\u0003\u0002\u0002\u0002\u01ef\u01f0\u000c\u0003\u0002\u0002\u01f0\u01f1\u0007\u0075\u0002\u0002\u01f1\u01f3\u0005\u0018\u000d\u0002\u01f2\u01f4\u0007\u007e\u0002\u0002\u01f3\u01f2\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u01f6\u0003\u0002\u0002\u0002\u01f5\u01ef\u0003\u0002\u0002\u0002\u01f6\u01f9\u0003\u0002\u0002\u0002\u01f7\u01f5\u0003\u0002\u0002\u0002\u01f7\u01f8\u0003\u0002\u0002\u0002\u01f8\u0017\u0003\u0002\u0002\u0002\u01f9\u01f7\u0003\u0002\u0002\u0002\u01fa\u01fd\u0005\u001a\u000e\u0002\u01fb\u01fd\u0005\u001c\u000f\u0002\u01fc\u01fa\u0003\u0002\u0002\u0002\u01fc\u01fb\u0003\u0002\u0002\u0002\u01fd\u0019\u0003\u0002\u0002\u0002\u01fe\u0203\u0007\u007f\u0002\u0002\u01ff\u0200\u0007\u005c\u0002\u0002\u0200\u0203\u0007\u007f\u0002\u0002\u0201\u0203\u0007\u0040\u0002\u0002\u0202\u01fe\u0003\u0002\u0002\u0002\u0202\u01ff\u0003\u0002\u0002\u0002\u0202\u0201\u0003\u0002\u0002\u0002\u0203\u001b\u0003\u0002\u0002\u0002\u0204\u0205\u0007\u007f\u0002\u0002\u0205\u020a\u0005\u0118\u008d\u0002\u0206\u0207\u0007\u005c\u0002\u0002\u0207\u0208\u0007\u007f\u0002\u0002\u0208\u020a\u0005\u0118\u008d\u0002\u0209\u0204\u0003\u0002\u0002\u0002\u0209\u0206\u0003\u0002\u0002\u0002\u020a\u001d\u0003\u0002\u0002\u0002\u020b\u020c\u0007\u0050\u0002\u0002\u020c\u020d\u0005\u010e\u0088\u0002\u020d\u020f\u0007\u0051\u0002\u0002\u020e\u0210\u0007\u002a\u0002\u0002\u020f\u020e\u0003\u0002\u0002\u0002\u020f\u0210\u0003\u0002\u0002\u0002\u0210\u0212\u0003\u0002\u0002\u0002\u0211\u0213\u0005\u017e\u00c0\u0002\u0212\u0211\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0215\u0003\u0002\u0002\u0002\u0214\u0216\u0005\u00d4\u006b\u0002\u0215\u0214\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u0218\u0003\u0002\u0002\u0002\u0217\u0219\u0005\u00f6\u007c\u0002\u0218\u0217\u0003\u0002\u0002\u0002\u0218\u0219\u0003\u0002\u0002\u0002\u0219\u001f\u0003\u0002\u0002\u0002\u021a\u021b\u0008\u0011\u0001\u0002\u021b\u025b\u0005\u0004\u0003\u0002\u021c\u021d\u0005\u009c\u004f\u0002\u021d\u021f\u0007\u0050\u0002\u0002\u021e\u0220\u0005\u0026\u0014\u0002\u021f\u021e\u0003\u0002\u0002\u0002\u021f\u0220\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0222\u0007\u0051\u0002\u0002\u0222\u025b\u0003\u0002\u0002\u0002\u0223\u0224\u0005\u016c\u00b7\u0002\u0224\u0226\u0007\u0050\u0002\u0002\u0225\u0227\u0005\u0026\u0014\u0002\u0226\u0225\u0003\u0002\u0002\u0002\u0226\u0227\u0003\u0002\u0002\u0002\u0227\u0228\u0003\u0002\u0002\u0002\u0228\u0229\u0007\u0051\u0002\u0002\u0229\u025b\u0003\u0002\u0002\u0002\u022a\u022b\u0005\u009c\u004f\u0002\u022b\u022c\u0005\u0120\u0091\u0002\u022c\u025b\u0003\u0002\u0002\u0002\u022d\u022e\u0005\u016c\u00b7\u0002\u022e\u022f\u0005\u0120\u0091\u0002\u022f\u025b\u0003\u0002\u0002\u0002\u0230\u0231\u0007\u001a\u0002\u0002\u0231\u0232\u0007\u0061\u0002\u0002\u0232\u0233\u0005\u0102\u0082\u0002\u0233\u0234\u0007\u0062\u0002\u0002\u0234\u0235\u0007\u0050\u0002\u0002\u0235\u0236\u0005\u005c\u002f\u0002\u0236\u0237\u0007\u0051\u0002\u0002\u0237\u025b\u0003\u0002\u0002\u0002\u0238\u0239\u0007\u003c\u0002\u0002\u0239\u023a\u0007\u0061\u0002\u0002\u023a\u023b\u0005\u0102\u0082\u0002\u023b\u023c\u0007\u0062\u0002\u0002\u023c\u023d\u0007\u0050\u0002\u0002\u023d\u023e\u0005\u005c\u002f\u0002\u023e\u023f\u0007\u0051\u0002\u0002\u023f\u025b\u0003\u0002\u0002\u0002\u0240\u0241\u0007\u0035\u0002\u0002\u0241\u0242\u0007\u0061\u0002\u0002\u0242\u0243\u0005\u0102\u0082\u0002\u0243\u0244\u0007\u0062\u0002\u0002\u0244\u0245\u0007\u0050\u0002\u0002\u0245\u0246\u0005\u005c\u002f\u0002\u0246\u0247\u0007\u0051\u0002\u0002\u0247\u025b\u0003\u0002\u0002\u0002\u0248\u0249\u0007\u0013\u0002\u0002\u0249\u024a\u0007\u0061\u0002\u0002\u024a\u024b\u0005\u0102\u0082\u0002\u024b\u024c\u0007\u0062\u0002\u0002\u024c\u024d\u0007\u0050\u0002\u0002\u024d\u024e\u0005\u005c\u002f\u0002\u024e\u024f\u0007\u0051\u0002\u0002\u024f\u025b\u0003\u0002\u0002\u0002\u0250\u0251\u0005\u0024\u0013\u0002\u0251\u0252\u0007\u0050\u0002\u0002\u0252\u0253\u0005\u005c\u002f\u0002\u0253\u0254\u0007\u0051\u0002\u0002\u0254\u025b\u0003\u0002\u0002\u0002\u0255\u0256\u0005\u0024\u0013\u0002\u0256\u0257\u0007\u0050\u0002\u0002\u0257\u0258\u0005\u0102\u0082\u0002\u0258\u0259\u0007\u0051\u0002\u0002\u0259\u025b\u0003\u0002\u0002\u0002\u025a\u021a\u0003\u0002\u0002\u0002\u025a\u021c\u0003\u0002\u0002\u0002\u025a\u0223\u0003\u0002\u0002\u0002\u025a\u022a\u0003\u0002\u0002\u0002\u025a\u022d\u0003\u0002\u0002\u0002\u025a\u0230\u0003\u0002\u0002\u0002\u025a\u0238\u0003\u0002\u0002\u0002\u025a\u0240\u0003\u0002\u0002\u0002\u025a\u0248\u0003\u0002\u0002\u0002\u025a\u0250\u0003\u0002\u0002\u0002\u025a\u0255\u0003\u0002\u0002\u0002\u025b\u0284\u0003\u0002\u0002\u0002\u025c\u025d\u000c\u0015\u0002\u0002\u025d\u025e\u0007\u0052\u0002\u0002\u025e\u025f\u0005\u005c\u002f\u0002\u025f\u0260\u0007\u0053\u0002\u0002\u0260\u0283\u0003\u0002\u0002\u0002\u0261\u0262\u000c\u0014\u0002\u0002\u0262\u0263\u0007\u0052\u0002\u0002\u0263\u0264\u0005\u0120\u0091\u0002\u0264\u0265\u0007\u0053\u0002\u0002\u0265\u0283\u0003\u0002\u0002\u0002\u0266\u0267\u000c\u0013\u0002\u0002\u0267\u0269\u0007\u0050\u0002\u0002\u0268\u026a\u0005\u0026\u0014\u0002\u0269\u0268\u0003\u0002\u0002\u0002\u0269\u026a\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u0283\u0007\u0051\u0002\u0002\u026c\u026d\u000c\u000e\u0002\u0002\u026d\u026f\u0007\u007c\u0002\u0002\u026e\u0270\u0007\u003f\u0002\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u0283\u0005\u0006\u0004\u0002\u0272\u0273\u000c\u000d\u0002\u0002\u0273\u0275\u0007\u0077\u0002\u0002\u0274\u0276\u0007\u003f\u0002\u0002\u0275\u0274\u0003\u0002\u0002\u0002\u0275\u0276\u0003\u0002\u0002\u0002\u0276\u0277\u0003\u0002\u0002\u0002\u0277\u0283\u0005\u0006\u0004\u0002\u0278\u0279\u000c\u000c\u0002\u0002\u0279\u027a\u0007\u007c\u0002\u0002\u027a\u0283\u0005\u0028\u0015\u0002\u027b\u027c\u000c\u000b\u0002\u0002\u027c\u027d\u0007\u0077\u0002\u0002\u027d\u0283\u0005\u0028\u0015\u0002\u027e\u027f\u000c\u000a\u0002\u0002\u027f\u0283\u0007\u0073\u0002\u0002\u0280\u0281\u000c\u0009\u0002\u0002\u0281\u0283\u0007\u0074\u0002\u0002\u0282\u025c\u0003\u0002\u0002\u0002\u0282\u0261\u0003\u0002\u0002\u0002\u0282\u0266\u0003\u0002\u0002\u0002\u0282\u026c\u0003\u0002\u0002\u0002\u0282\u0272\u0003\u0002\u0002\u0002\u0282\u0278\u0003\u0002\u0002\u0002\u0282\u027b\u0003\u0002\u0002\u0002\u0282\u027e\u0003\u0002\u0002\u0002\u0282\u0280\u0003\u0002\u0002\u0002\u0283\u0286\u0003\u0002\u0002\u0002\u0284\u0282\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u0021\u0003\u0002\u0002\u0002\u0286\u0284\u0003\u0002\u0002\u0002\u0287\u0288\u0007\u0046\u0002\u0002\u0288\u0023\u0003\u0002\u0002\u0002\u0289\u028a\u0007\u0046\u0002\u0002\u028a\u0025\u0003\u0002\u0002\u0002\u028b\u028c\u0005\u011e\u0090\u0002\u028c\u0027\u0003\u0002\u0002\u0002\u028d\u028f\u0005\u000c\u0007\u0002\u028e\u028d\u0003\u0002\u0002\u0002\u028e\u028f\u0003\u0002\u0002\u0002\u028f\u0290\u0003\u0002\u0002\u0002\u0290\u0291\u0005\u009e\u0050\u0002\u0291\u0292\u0007\u007a\u0002\u0002\u0292\u0293\u0007\u005e\u0002\u0002\u0293\u0294\u0005\u009e\u0050\u0002\u0294\u02a4\u0003\u0002\u0002\u0002\u0295\u0296\u0005\u000c\u0007\u0002\u0296\u0297\u0007\u003f\u0002\u0002\u0297\u0298\u0005\u0162\u00b2\u0002\u0298\u0299\u0007\u007a\u0002\u0002\u0299\u029a\u0007\u005e\u0002\u0002\u029a\u029b\u0005\u009e\u0050\u0002\u029b\u02a4\u0003\u0002\u0002\u0002\u029c\u029e\u0005\u000c\u0007\u0002\u029d\u029c\u0003\u0002\u0002\u0002\u029d\u029e\u0003\u0002\u0002\u0002\u029e\u029f\u0003\u0002\u0002\u0002\u029f\u02a0\u0007\u005e\u0002\u0002\u02a0\u02a4\u0005\u009e\u0050\u0002\u02a1\u02a2\u0007\u005e\u0002\u0002\u02a2\u02a4\u0005\u00a0\u0051\u0002\u02a3\u028e\u0003\u0002\u0002\u0002\u02a3\u0295\u0003\u0002\u0002\u0002\u02a3\u029d\u0003\u0002\u0002\u0002\u02a3\u02a1\u0003\u0002\u0002\u0002\u02a4\u0029\u0003\u0002\u0002\u0002\u02a5\u02c2\u0005\u0020\u0011\u0002\u02a6\u02a7\u0007\u0073\u0002\u0002\u02a7\u02c2\u0005\u003e\u0020\u0002\u02a8\u02a9\u0007\u0074\u0002\u0002\u02a9\u02c2\u0005\u003e\u0020\u0002\u02aa\u02ab\u0005\u002c\u0017\u0002\u02ab\u02ac\u0005\u003e\u0020\u0002\u02ac\u02c2\u0003\u0002\u0002\u0002\u02ad\u02ae\u0007\u0039\u0002\u0002\u02ae\u02c2\u0005\u002a\u0016\u0002\u02af\u02b0\u0007\u0039\u0002\u0002\u02b0\u02b1\u0007\u0050\u0002\u0002\u02b1\u02b2\u0005\u0102\u0082\u0002\u02b2\u02b3\u0007\u0051\u0002\u0002\u02b3\u02c2\u0003\u0002\u0002\u0002\u02b4\u02b5\u0007\u0039\u0002\u0002\u02b5\u02b6\u0007\u007e\u0002\u0002\u02b6\u02b7\u0007\u0050\u0002\u0002\u02b7\u02b8\u0007\u007f\u0002\u0002\u02b8\u02c2\u0007\u0051\u0002\u0002\u02b9\u02ba\u0007\u0006\u0002\u0002\u02ba\u02bb\u0007\u0050\u0002\u0002\u02bb\u02bc\u0005\u0102\u0082\u0002\u02bc\u02bd\u0007\u0051\u0002\u0002\u02bd\u02c2\u0003\u0002\u0002\u0002\u02be\u02c2\u0005\u003c\u001f\u0002\u02bf\u02c2\u0005\u002e\u0018\u0002\u02c0\u02c2\u0005\u003a\u001e\u0002\u02c1\u02a5\u0003\u0002\u0002\u0002\u02c1\u02a6\u0003\u0002\u0002\u0002\u02c1\u02a8\u0003\u0002\u0002\u0002\u02c1\u02aa\u0003\u0002\u0002\u0002\u02c1\u02ad\u0003\u0002\u0002\u0002\u02c1\u02af\u0003\u0002\u0002\u0002\u02c1\u02b4\u0003\u0002\u0002\u0002\u02c1\u02b9\u0003\u0002\u0002\u0002\u02c1\u02be\u0003\u0002\u0002\u0002\u02c1\u02bf\u0003\u0002\u0002\u0002\u02c1\u02c0\u0003\u0002\u0002\u0002\u02c2\u002b\u0003\u0002\u0002\u0002\u02c3\u02c4\u0009\u0003\u0002\u0002\u02c4\u002d\u0003\u0002\u0002\u0002\u02c5\u02c7\u0007\u007a\u0002\u0002\u02c6\u02c5\u0003\u0002\u0002\u0002\u02c6\u02c7\u0003\u0002\u0002\u0002\u02c7\u02c8\u0003\u0002\u0002\u0002\u02c8\u02ca\u0007\u002c\u0002\u0002\u02c9\u02cb\u0005\u0030\u0019\u0002\u02ca\u02c9\u0003\u0002\u0002\u0002\u02ca\u02cb\u0003\u0002\u0002\u0002\u02cb\u02cc\u0003\u0002\u0002\u0002\u02cc\u02ce\u0005\u0032\u001a\u0002\u02cd\u02cf\u0005\u0038\u001d\u0002\u02ce\u02cd\u0003\u0002\u0002\u0002\u02ce\u02cf\u0003\u0002\u0002\u0002\u02cf\u02de\u0003\u0002\u0002\u0002\u02d0\u02d2\u0007\u007a\u0002\u0002\u02d1\u02d0\u0003\u0002\u0002\u0002\u02d1\u02d2\u0003\u0002\u0002\u0002\u02d2\u02d3\u0003\u0002\u0002\u0002\u02d3\u02d5\u0007\u002c\u0002\u0002\u02d4\u02d6\u0005\u0030\u0019\u0002\u02d5\u02d4\u0003\u0002\u0002\u0002\u02d5\u02d6\u0003\u0002\u0002\u0002\u02d6\u02d7\u0003\u0002\u0002\u0002\u02d7\u02d8\u0007\u0050\u0002\u0002\u02d8\u02d9\u0005\u0102\u0082\u0002\u02d9\u02db\u0007\u0051\u0002\u0002\u02da\u02dc\u0005\u0038\u001d\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02db\u02dc\u0003\u0002\u0002\u0002\u02dc\u02de\u0003\u0002\u0002\u0002\u02dd\u02c6\u0003\u0002\u0002\u0002\u02dd\u02d1\u0003\u0002\u0002\u0002\u02de\u002f\u0003\u0002\u0002\u0002\u02df\u02e0\u0007\u0050\u0002\u0002\u02e0\u02e1\u0005\u0026\u0014\u0002\u02e1\u02e2\u0007\u0051\u0002\u0002\u02e2\u0031\u0003\u0002\u0002\u0002\u02e3\u02e5\u0005\u0098\u004d\u0002\u02e4\u02e6\u0005\u0034\u001b\u0002\u02e5\u02e4\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u0033\u0003\u0002\u0002\u0002\u02e7\u02e9\u0005\u00f8\u007d\u0002\u02e8\u02ea\u0005\u0034\u001b\u0002\u02e9\u02e8\u0003\u0002\u0002\u0002\u02e9\u02ea\u0003\u0002\u0002\u0002\u02ea\u02ed\u0003\u0002\u0002\u0002\u02eb\u02ed\u0005\u0036\u001c\u0002\u02ec\u02e7\u0003\u0002\u0002\u0002\u02ec\u02eb\u0003\u0002\u0002\u0002\u02ed\u0035\u0003\u0002\u0002\u0002\u02ee\u02ef\u0008\u001c\u0001\u0002\u02ef\u02f0\u0007\u0052\u0002\u0002\u02f0\u02f1\u0005\u005c\u002f\u0002\u02f1\u02f3\u0007\u0053\u0002\u0002\u02f2\u02f4\u0005\u00d4\u006b\u0002\u02f3\u02f2\u0003\u0002\u0002\u0002\u02f3\u02f4\u0003\u0002\u0002\u0002\u02f4\u02fe\u0003\u0002\u0002\u0002\u02f5\u02f6\u000c\u0003\u0002\u0002\u02f6\u02f7\u0007\u0052\u0002\u0002\u02f7\u02f8\u0005\u005e\u0030\u0002\u02f8\u02fa\u0007\u0053\u0002\u0002\u02f9\u02fb\u0005\u00d4\u006b\u0002\u02fa\u02f9\u0003\u0002\u0002\u0002\u02fa\u02fb\u0003\u0002\u0002\u0002\u02fb\u02fd\u0003\u0002\u0002\u0002\u02fc\u02f5\u0003\u0002\u0002\u0002\u02fd\u0300\u0003\u0002\u0002\u0002\u02fe\u02fc\u0003\u0002\u0002\u0002\u02fe\u02ff\u0003\u0002\u0002\u0002\u02ff\u0037\u0003\u0002\u0002\u0002\u0300\u02fe\u0003\u0002\u0002\u0002\u0301\u0303\u0007\u0050\u0002\u0002\u0302\u0304\u0005\u0026\u0014\u0002\u0303\u0302\u0003\u0002\u0002\u0002\u0303\u0304\u0003\u0002\u0002\u0002\u0304\u0305\u0003\u0002\u0002\u0002\u0305\u0308\u0007\u0051\u0002\u0002\u0306\u0308\u0005\u0120\u0091\u0002\u0307\u0301\u0003\u0002\u0002\u0002\u0307\u0306\u0003\u0002\u0002\u0002\u0308\u0039\u0003\u0002\u0002\u0002\u0309\u030b\u0007\u007a\u0002\u0002\u030a\u0309\u0003\u0002\u0002\u0002\u030a\u030b\u0003\u0002\u0002\u0002\u030b\u030c\u0003\u0002\u0002\u0002\u030c\u030d\u0007\u0017\u0002\u0002\u030d\u0316\u0005\u003e\u0020\u0002\u030e\u0310\u0007\u007a\u0002\u0002\u030f\u030e\u0003\u0002\u0002\u0002\u030f\u0310\u0003\u0002\u0002\u0002\u0310\u0311\u0003\u0002\u0002\u0002\u0311\u0312\u0007\u0017\u0002\u0002\u0312\u0313\u0007\u0052\u0002\u0002\u0313\u0314\u0007\u0053\u0002\u0002\u0314\u0316\u0005\u003e\u0020\u0002\u0315\u030a\u0003\u0002\u0002\u0002\u0315\u030f\u0003\u0002\u0002\u0002\u0316\u003b\u0003\u0002\u0002\u0002\u0317\u0318\u0007\u002d\u0002\u0002\u0318\u0319\u0007\u0050\u0002\u0002\u0319\u031a\u0005\u005c\u002f\u0002\u031a\u031b\u0007\u0051\u0002\u0002\u031b\u003d\u0003\u0002\u0002\u0002\u031c\u0323\u0005\u002a\u0016\u0002\u031d\u031e\u0007\u0050\u0002\u0002\u031e\u031f\u0005\u0102\u0082\u0002\u031f\u0320\u0007\u0051\u0002\u0002\u0320\u0321\u0005\u003e\u0020\u0002\u0321\u0323\u0003\u0002\u0002\u0002\u0322\u031c\u0003\u0002\u0002\u0002\u0322\u031d\u0003\u0002\u0002\u0002\u0323\u003f\u0003\u0002\u0002\u0002\u0324\u0325\u0008\u0021\u0001\u0002\u0325\u0326\u0005\u003e\u0020\u0002\u0326\u032f\u0003\u0002\u0002\u0002\u0327\u0328\u000c\u0004\u0002\u0002\u0328\u0329\u0007\u007d\u0002\u0002\u0329\u032e\u0005\u003e\u0020\u0002\u032a\u032b\u000c\u0003\u0002\u0002\u032b\u032c\u0007\u0076\u0002\u0002\u032c\u032e\u0005\u003e\u0020\u0002\u032d\u0327\u0003\u0002\u0002\u0002\u032d\u032a\u0003\u0002\u0002\u0002\u032e\u0331\u0003\u0002\u0002\u0002\u032f\u032d\u0003\u0002\u0002\u0002\u032f\u0330\u0003\u0002\u0002\u0002\u0330\u0041\u0003\u0002\u0002\u0002\u0331\u032f\u0003\u0002\u0002\u0002\u0332\u0333\u0008\u0022\u0001\u0002\u0333\u0334\u0005\u0040\u0021\u0002\u0334\u0340\u0003\u0002\u0002\u0002\u0335\u0336\u000c\u0005\u0002\u0002\u0336\u0337\u0007\u0058\u0002\u0002\u0337\u033f\u0005\u0040\u0021\u0002\u0338\u0339\u000c\u0004\u0002\u0002\u0339\u033a\u0007\u0059\u0002\u0002\u033a\u033f\u0005\u0040\u0021\u0002\u033b\u033c\u000c\u0003\u0002\u0002\u033c\u033d\u0007\u005a\u0002\u0002\u033d\u033f\u0005\u0040\u0021\u0002\u033e\u0335\u0003\u0002\u0002\u0002\u033e\u0338\u0003\u0002\u0002\u0002\u033e\u033b\u0003\u0002\u0002\u0002\u033f\u0342\u0003\u0002\u0002\u0002\u0340\u033e\u0003\u0002\u0002\u0002\u0340\u0341\u0003\u0002\u0002\u0002\u0341\u0043\u0003\u0002\u0002\u0002\u0342\u0340\u0003\u0002\u0002\u0002\u0343\u0344\u0008\u0023\u0001\u0002\u0344\u0345\u0005\u0042\u0022\u0002\u0345\u034e\u0003\u0002\u0002\u0002\u0346\u0347\u000c\u0004\u0002\u0002\u0347\u0348\u0007\u0056\u0002\u0002\u0348\u034d\u0005\u0042\u0022\u0002\u0349\u034a\u000c\u0003\u0002\u0002\u034a\u034b\u0007\u0057\u0002\u0002\u034b\u034d\u0005\u0042\u0022\u0002\u034c\u0346\u0003\u0002\u0002\u0002\u034c\u0349\u0003\u0002\u0002\u0002\u034d\u0350\u0003\u0002\u0002\u0002\u034e\u034c\u0003\u0002\u0002\u0002\u034e\u034f\u0003\u0002\u0002\u0002\u034f\u0045\u0003\u0002\u0002\u0002\u0350\u034e\u0003\u0002\u0002\u0002\u0351\u0352\u0008\u0024\u0001\u0002\u0352\u0353\u0005\u0044\u0023\u0002\u0353\u035d\u0003\u0002\u0002\u0002\u0354\u0355\u000c\u0004\u0002\u0002\u0355\u0356\u0007\u006b\u0002\u0002\u0356\u035c\u0005\u0044\u0023\u0002\u0357\u0358\u000c\u0003\u0002\u0002\u0358\u0359\u0005\u0186\u00c4\u0002\u0359\u035a\u0005\u0044\u0023\u0002\u035a\u035c\u0003\u0002\u0002\u0002\u035b\u0354\u0003\u0002\u0002\u0002\u035b\u0357\u0003\u0002\u0002\u0002\u035c\u035f\u0003\u0002\u0002\u0002\u035d\u035b\u0003\u0002\u0002\u0002\u035d\u035e\u0003\u0002\u0002\u0002\u035e\u0047\u0003\u0002\u0002\u0002\u035f\u035d\u0003\u0002\u0002\u0002\u0360\u0361\u0008\u0025\u0001\u0002\u0361\u0362\u0005\u0046\u0024\u0002\u0362\u0371\u0003\u0002\u0002\u0002\u0363\u0364\u000c\u0006\u0002\u0002\u0364\u0365\u0007\u0061\u0002\u0002\u0365\u0370\u0005\u0046\u0024\u0002\u0366\u0367\u000c\u0005\u0002\u0002\u0367\u0368\u0007\u0062\u0002\u0002\u0368\u0370\u0005\u0046\u0024\u0002\u0369\u036a\u000c\u0004\u0002\u0002\u036a\u036b\u0007\u006f\u0002\u0002\u036b\u0370\u0005\u0046\u0024\u0002\u036c\u036d\u000c\u0003\u0002\u0002\u036d\u036e\u0007\u0070\u0002\u0002\u036e\u0370\u0005\u0046\u0024\u0002\u036f\u0363\u0003\u0002\u0002\u0002\u036f\u0366\u0003\u0002\u0002\u0002\u036f\u0369\u0003\u0002\u0002\u0002\u036f\u036c\u0003\u0002\u0002\u0002\u0370\u0373\u0003\u0002\u0002\u0002\u0371\u036f\u0003\u0002\u0002\u0002\u0371\u0372\u0003\u0002\u0002\u0002\u0372\u0049\u0003\u0002\u0002\u0002\u0373\u0371\u0003\u0002\u0002\u0002\u0374\u0375\u0008\u0026\u0001\u0002\u0375\u0376\u0005\u0048\u0025\u0002\u0376\u037f\u0003\u0002\u0002\u0002\u0377\u0378\u000c\u0004\u0002\u0002\u0378\u0379\u0007\u006d\u0002\u0002\u0379\u037e\u0005\u0048\u0025\u0002\u037a\u037b\u000c\u0003\u0002\u0002\u037b\u037c\u0007\u006e\u0002\u0002\u037c\u037e\u0005\u0048\u0025\u0002\u037d\u0377\u0003\u0002\u0002\u0002\u037d\u037a\u0003\u0002\u0002\u0002\u037e\u0381\u0003\u0002\u0002\u0002\u037f\u037d\u0003\u0002\u0002\u0002\u037f\u0380\u0003\u0002\u0002\u0002\u0380\u004b\u0003\u0002\u0002\u0002\u0381\u037f\u0003\u0002\u0002\u0002\u0382\u0383\u0008\u0027\u0001\u0002\u0383\u0384\u0005\u004a\u0026\u0002\u0384\u038a\u0003\u0002\u0002\u0002\u0385\u0386\u000c\u0003\u0002\u0002\u0386\u0387\u0007\u005c\u0002\u0002\u0387\u0389\u0005\u004a\u0026\u0002\u0388\u0385\u0003\u0002\u0002\u0002\u0389\u038c\u0003\u0002\u0002\u0002\u038a\u0388\u0003\u0002\u0002\u0002\u038a\u038b\u0003\u0002\u0002\u0002\u038b\u004d\u0003\u0002\u0002\u0002\u038c\u038a\u0003\u0002\u0002\u0002\u038d\u038e\u0008\u0028\u0001\u0002\u038e\u038f\u0005\u004c\u0027\u0002\u038f\u0395\u0003\u0002\u0002\u0002\u0390\u0391\u000c\u0003\u0002\u0002\u0391\u0392\u0007\u005b\u0002\u0002\u0392\u0394\u0005\u004c\u0027\u0002\u0393\u0390\u0003\u0002\u0002\u0002\u0394\u0397\u0003\u0002\u0002\u0002\u0395\u0393\u0003\u0002\u0002\u0002\u0395\u0396\u0003\u0002\u0002\u0002\u0396\u004f\u0003\u0002\u0002\u0002\u0397\u0395\u0003\u0002\u0002\u0002\u0398\u0399\u0008\u0029\u0001\u0002\u0399\u039a\u0005\u004e\u0028\u0002\u039a\u03a0\u0003\u0002\u0002\u0002\u039b\u039c\u000c\u0003\u0002\u0002\u039c\u039d\u0007\u005d\u0002\u0002\u039d\u039f\u0005\u004e\u0028\u0002\u039e\u039b\u0003\u0002\u0002\u0002\u039f\u03a2\u0003\u0002\u0002\u0002\u03a0\u039e\u0003\u0002\u0002\u0002\u03a0\u03a1\u0003\u0002\u0002\u0002\u03a1\u0051\u0003\u0002\u0002\u0002\u03a2\u03a0\u0003\u0002\u0002\u0002\u03a3\u03a4\u0008\u002a\u0001\u0002\u03a4\u03a5\u0005\u0050\u0029\u0002\u03a5\u03ab\u0003\u0002\u0002\u0002\u03a6\u03a7\u000c\u0003\u0002\u0002\u03a7\u03a8\u0007\u0071\u0002\u0002\u03a8\u03aa\u0005\u0050\u0029\u0002\u03a9\u03a6\u0003\u0002\u0002\u0002\u03aa\u03ad\u0003\u0002\u0002\u0002\u03ab\u03a9\u0003\u0002\u0002\u0002\u03ab\u03ac\u0003\u0002\u0002\u0002\u03ac\u0053\u0003\u0002\u0002\u0002\u03ad\u03ab\u0003\u0002\u0002\u0002\u03ae\u03af\u0008\u002b\u0001\u0002\u03af\u03b0\u0005\u0052\u002a\u0002\u03b0\u03b6\u0003\u0002\u0002\u0002\u03b1\u03b2\u000c\u0003\u0002\u0002\u03b2\u03b3\u0007\u0072\u0002\u0002\u03b3\u03b5\u0005\u0052\u002a\u0002\u03b4\u03b1\u0003\u0002\u0002\u0002\u03b5\u03b8\u0003\u0002\u0002\u0002\u03b6\u03b4\u0003\u0002\u0002\u0002\u03b6\u03b7\u0003\u0002\u0002\u0002\u03b7\u0055\u0003\u0002\u0002\u0002\u03b8\u03b6\u0003\u0002\u0002\u0002\u03b9\u03c1\u0005\u0054\u002b\u0002\u03ba\u03bb\u0005\u0054\u002b\u0002\u03bb\u03bc\u0007\u0078\u0002\u0002\u03bc\u03bd\u0005\u005c\u002f\u0002\u03bd\u03be\u0007\u0079\u0002\u0002\u03be\u03bf\u0005\u0058\u002d\u0002\u03bf\u03c1\u0003\u0002\u0002\u0002\u03c0\u03b9\u0003\u0002\u0002\u0002\u03c0\u03ba\u0003\u0002\u0002\u0002\u03c1\u0057\u0003\u0002\u0002\u0002\u03c2\u03c9\u0005\u0056\u002c\u0002\u03c3\u03c4\u0005\u0054\u002b\u0002\u03c4\u03c5\u0005\u005a\u002e\u0002\u03c5\u03c6\u0005\u011c\u008f\u0002\u03c6\u03c9\u0003\u0002\u0002\u0002\u03c7\u03c9\u0005\u017c\u00bf\u0002\u03c8\u03c2\u0003\u0002\u0002\u0002\u03c8\u03c3\u0003\u0002\u0002\u0002\u03c8\u03c7\u0003\u0002\u0002\u0002\u03c9\u0059\u0003\u0002\u0002\u0002\u03ca\u03d6\u0007\u0060\u0002\u0002\u03cb\u03d6\u0007\u0065\u0002\u0002\u03cc\u03d6\u0007\u0066\u0002\u0002\u03cd\u03d6\u0007\u0067\u0002\u0002\u03ce\u03d6\u0007\u0063\u0002\u0002\u03cf\u03d6\u0007\u0064\u0002\u0002\u03d0\u03d6\u0005\u0188\u00c5\u0002\u03d1\u03d6\u0007\u006c\u0002\u0002\u03d2\u03d6\u0007\u0069\u0002\u0002\u03d3\u03d6\u0007\u0068\u0002\u0002\u03d4\u03d6\u0007\u006a\u0002\u0002\u03d5\u03ca\u0003\u0002\u0002\u0002\u03d5\u03cb\u0003\u0002\u0002\u0002\u03d5\u03cc\u0003\u0002\u0002\u0002\u03d5\u03cd\u0003\u0002\u0002\u0002\u03d5\u03ce\u0003\u0002\u0002\u0002\u03d5\u03cf\u0003\u0002\u0002\u0002\u03d5\u03d0\u0003\u0002\u0002\u0002\u03d5\u03d1\u0003\u0002\u0002\u0002\u03d5\u03d2\u0003\u0002\u0002\u0002\u03d5\u03d3\u0003\u0002\u0002\u0002\u03d5\u03d4\u0003\u0002\u0002\u0002\u03d6\u005b\u0003\u0002\u0002\u0002\u03d7\u03d8\u0008\u002f\u0001\u0002\u03d8\u03d9\u0005\u0058\u002d\u0002\u03d9\u03df\u0003\u0002\u0002\u0002\u03da\u03db\u000c\u0003\u0002\u0002\u03db\u03dc\u0007\u0075\u0002\u0002\u03dc\u03de\u0005\u0058\u002d\u0002\u03dd\u03da\u0003\u0002\u0002\u0002\u03de\u03e1\u0003\u0002\u0002\u0002\u03df\u03dd\u0003\u0002\u0002\u0002\u03df\u03e0\u0003\u0002\u0002\u0002\u03e0\u005d\u0003\u0002\u0002\u0002\u03e1\u03df\u0003\u0002\u0002\u0002\u03e2\u03e3\u0005\u0056\u002c\u0002\u03e3\u005f\u0003\u0002\u0002\u0002\u03e4\u03ff\u0005\u0062\u0032\u0002\u03e5\u03e7\u0005\u00d4\u006b\u0002\u03e6\u03e5\u0003\u0002\u0002\u0002\u03e6\u03e7\u0003\u0002\u0002\u0002\u03e7\u03e8\u0003\u0002\u0002\u0002\u03e8\u03ff\u0005\u0064\u0033\u0002\u03e9\u03eb\u0005\u00d4\u006b\u0002\u03ea\u03e9\u0003\u0002\u0002\u0002\u03ea\u03eb\u0003\u0002\u0002\u0002\u03eb\u03ec\u0003\u0002\u0002\u0002\u03ec\u03ff\u0005\u0066\u0034\u0002\u03ed\u03ef\u0005\u00d4\u006b\u0002\u03ee\u03ed\u0003\u0002\u0002\u0002\u03ee\u03ef\u0003\u0002\u0002\u0002\u03ef\u03f0\u0003\u0002\u0002\u0002\u03f0\u03ff\u0005\u006a\u0036\u0002\u03f1\u03f3\u0005\u00d4\u006b\u0002\u03f2\u03f1\u0003\u0002\u0002\u0002\u03f2\u03f3\u0003\u0002\u0002\u0002\u03f3\u03f4\u0003\u0002\u0002\u0002\u03f4\u03ff\u0005\u006e\u0038\u0002\u03f5\u03f7\u0005\u00d4\u006b\u0002\u03f6\u03f5\u0003\u0002\u0002\u0002\u03f6\u03f7\u0003\u0002\u0002\u0002\u03f7\u03f8\u0003\u0002\u0002\u0002\u03f8\u03ff\u0005\u0076\u003c\u0002\u03f9\u03ff\u0005\u0078\u003d\u0002\u03fa\u03fc\u0005\u00d4\u006b\u0002\u03fb\u03fa\u0003\u0002\u0002\u0002\u03fb\u03fc\u0003\u0002\u0002\u0002\u03fc\u03fd\u0003\u0002\u0002\u0002\u03fd\u03ff\u0005\u0172\u00ba\u0002\u03fe\u03e4\u0003\u0002\u0002\u0002\u03fe\u03e6\u0003\u0002\u0002\u0002\u03fe\u03ea\u0003\u0002\u0002\u0002\u03fe\u03ee\u0003\u0002\u0002\u0002\u03fe\u03f2\u0003\u0002\u0002\u0002\u03fe\u03f6\u0003\u0002\u0002\u0002\u03fe\u03f9\u0003\u0002\u0002\u0002\u03fe\u03fb\u0003\u0002\u0002\u0002\u03ff\u0061\u0003\u0002\u0002\u0002\u0400\u0402\u0005\u00d4\u006b\u0002\u0401\u0400\u0003\u0002\u0002\u0002\u0401\u0402\u0003\u0002\u0002\u0002\u0402\u0403\u0003\u0002\u0002\u0002\u0403\u0404\u0007\u007f\u0002\u0002\u0404\u0405\u0007\u0079\u0002\u0002\u0405\u0415\u0005\u0060\u0031\u0002\u0406\u0408\u0005\u00d4\u006b\u0002\u0407\u0406\u0003\u0002\u0002\u0002\u0407\u0408\u0003\u0002\u0002\u0002\u0408\u0409\u0003\u0002\u0002\u0002\u0409\u040a\u0007\u000b\u0002\u0002\u040a\u040b\u0005\u005e\u0030\u0002\u040b\u040c\u0007\u0079\u0002\u0002\u040c\u040d\u0005\u0060\u0031\u0002\u040d\u0415\u0003\u0002\u0002\u0002\u040e\u0410\u0005\u00d4\u006b\u0002\u040f\u040e\u0003\u0002\u0002\u0002\u040f\u0410\u0003\u0002\u0002\u0002\u0410\u0411\u0003\u0002\u0002\u0002\u0411\u0412\u0007\u0016\u0002\u0002\u0412\u0413\u0007\u0079\u0002\u0002\u0413\u0415\u0005\u0060\u0031\u0002\u0414\u0401\u0003\u0002\u0002\u0002\u0414\u0407\u0003\u0002\u0002\u0002\u0414\u040f\u0003\u0002\u0002\u0002\u0415\u0063\u0003\u0002\u0002\u0002\u0416\u0418\u0005\u005c\u002f\u0002\u0417\u0416\u0003\u0002\u0002\u0002\u0417\u0418\u0003\u0002\u0002\u0002\u0418\u0419\u0003\u0002\u0002\u0002\u0419\u041a\u0007\u007b\u0002\u0002\u041a\u0065\u0003\u0002\u0002\u0002\u041b\u041d\u0007\u0054\u0002\u0002\u041c\u041e\u0005\u0068\u0035\u0002\u041d\u041c\u0003\u0002\u0002\u0002\u041d\u041e\u0003\u0002\u0002\u0002\u041e\u041f\u0003\u0002\u0002\u0002\u041f\u0420\u0007\u0055\u0002\u0002\u0420\u0067\u0003\u0002\u0002\u0002\u0421\u0422\u0008\u0035\u0001\u0002\u0422\u0423\u0005\u0060\u0031\u0002\u0423\u0428\u0003\u0002\u0002\u0002\u0424\u0425\u000c\u0003\u0002\u0002\u0425\u0427\u0005\u0060\u0031\u0002\u0426\u0424\u0003\u0002\u0002\u0002\u0427\u042a\u0003\u0002\u0002\u0002\u0428\u0426\u0003\u0002\u0002\u0002\u0428\u0429\u0003\u0002\u0002\u0002\u0429\u0069\u0003\u0002\u0002\u0002\u042a\u0428\u0003\u0002\u0002\u0002\u042b\u042c\u0007\u0026\u0002\u0002\u042c\u042d\u0007\u0050\u0002\u0002\u042d\u042e\u0005\u006c\u0037\u0002\u042e\u042f\u0007\u0051\u0002\u0002\u042f\u0430\u0005\u0060\u0031\u0002\u0430\u0440\u0003\u0002\u0002\u0002\u0431\u0432\u0007\u0026\u0002\u0002\u0432\u0433\u0007\u0050\u0002\u0002\u0433\u0434\u0005\u006c\u0037\u0002\u0434\u0435\u0007\u0051\u0002\u0002\u0435\u0436\u0005\u0060\u0031\u0002\u0436\u0437\u0007\u001b\u0002\u0002\u0437\u0438\u0005\u0060\u0031\u0002\u0438\u0440\u0003\u0002\u0002\u0002\u0439\u043a\u0007\u003e\u0002\u0002\u043a\u043b\u0007\u0050\u0002\u0002\u043b\u043c\u0005\u006c\u0037\u0002\u043c\u043d\u0007\u0051\u0002\u0002\u043d\u043e\u0005\u0060\u0031\u0002\u043e\u0440\u0003\u0002\u0002\u0002\u043f\u042b\u0003\u0002\u0002\u0002\u043f\u0431\u0003\u0002\u0002\u0002\u043f\u0439\u0003\u0002\u0002\u0002\u0440\u006b\u0003\u0002\u0002\u0002\u0441\u0452\u0005\u005c\u002f\u0002\u0442\u0444\u0005\u00d4\u006b\u0002\u0443\u0442\u0003\u0002\u0002\u0002\u0443\u0444\u0003\u0002\u0002\u0002\u0444\u0445\u0003\u0002\u0002\u0002\u0445\u0446\u0005\u008c\u0047\u0002\u0446\u0447\u0005\u00ee\u0078\u0002\u0447\u0448\u0007\u0060\u0002\u0002\u0448\u0449\u0005\u011c\u008f\u0002\u0449\u0452\u0003\u0002\u0002\u0002\u044a\u044c\u0005\u00d4\u006b\u0002\u044b\u044a\u0003\u0002\u0002\u0002\u044b\u044c\u0003\u0002\u0002\u0002\u044c\u044d\u0003\u0002\u0002\u0002\u044d\u044e\u0005\u008c\u0047\u0002\u044e\u044f\u0005\u00ee\u0078\u0002\u044f\u0450\u0005\u0120\u0091\u0002\u0450\u0452\u0003\u0002\u0002\u0002\u0451\u0441\u0003\u0002\u0002\u0002\u0451\u0443\u0003\u0002\u0002\u0002\u0451\u044b\u0003\u0002\u0002\u0002\u0452\u006d\u0003\u0002\u0002\u0002\u0453\u0454\u0007\u004f\u0002\u0002\u0454\u0455\u0007\u0050\u0002\u0002\u0455\u0456\u0005\u006c\u0037\u0002\u0456\u0457\u0007\u0051\u0002\u0002\u0457\u0458\u0005\u0060\u0031\u0002\u0458\u0477\u0003\u0002\u0002\u0002\u0459\u045a\u0007\u0018\u0002\u0002\u045a\u045b\u0005\u0060\u0031\u0002\u045b\u045c\u0007\u004f\u0002\u0002\u045c\u045d\u0007\u0050\u0002\u0002\u045d\u045e\u0005\u005c\u002f\u0002\u045e\u045f\u0007\u0051\u0002\u0002\u045f\u0460\u0007\u007b\u0002\u0002\u0460\u0477\u0003\u0002\u0002\u0002\u0461\u0462\u0007\u0023\u0002\u0002\u0462\u0463\u0007\u0050\u0002\u0002\u0463\u0465\u0005\u0070\u0039\u0002\u0464\u0466\u0005\u006c\u0037\u0002\u0465\u0464\u0003\u0002\u0002\u0002\u0465\u0466\u0003\u0002\u0002\u0002\u0466\u0467\u0003\u0002\u0002\u0002\u0467\u0469\u0007\u007b\u0002\u0002\u0468\u046a\u0005\u005c\u002f\u0002\u0469\u0468\u0003\u0002\u0002\u0002\u0469\u046a\u0003\u0002\u0002\u0002\u046a\u046b\u0003\u0002\u0002\u0002\u046b\u046c\u0007\u0051\u0002\u0002\u046c\u046d\u0005\u0060\u0031\u0002\u046d\u0477\u0003\u0002\u0002\u0002\u046e\u046f\u0007\u0023\u0002\u0002\u046f\u0470\u0007\u0050\u0002\u0002\u0470\u0471\u0005\u0072\u003a\u0002\u0471\u0472\u0007\u0079\u0002\u0002\u0472\u0473\u0005\u0074\u003b\u0002\u0473\u0474\u0007\u0051\u0002\u0002\u0474\u0475\u0005\u0060\u0031\u0002\u0475\u0477\u0003\u0002\u0002\u0002\u0476\u0453\u0003\u0002\u0002\u0002\u0476\u0459\u0003\u0002\u0002\u0002\u0476\u0461\u0003\u0002\u0002\u0002\u0476\u046e\u0003\u0002\u0002\u0002\u0477\u006f\u0003\u0002\u0002\u0002\u0478\u047b\u0005\u0064\u0033\u0002\u0479\u047b\u0005\u0082\u0042\u0002\u047a\u0478\u0003\u0002\u0002\u0002\u047a\u0479\u0003\u0002\u0002\u0002\u047b\u0071\u0003\u0002\u0002\u0002\u047c\u047e\u0005\u00d4\u006b\u0002\u047d\u047c\u0003\u0002\u0002\u0002\u047d\u047e\u0003\u0002\u0002\u0002\u047e\u047f\u0003\u0002\u0002\u0002\u047f\u0480\u0005\u008c\u0047\u0002\u0480\u0481\u0005\u00ee\u0078\u0002\u0481\u0073\u0003\u0002\u0002\u0002\u0482\u0485\u0005\u005c\u002f\u0002\u0483\u0485\u0005\u0120\u0091\u0002\u0484\u0482\u0003\u0002\u0002\u0002\u0484\u0483\u0003\u0002\u0002\u0002\u0485\u0075\u0003\u0002\u0002\u0002\u0486\u0487\u0007\u000a\u0002\u0002\u0487\u0497\u0007\u007b\u0002\u0002\u0488\u0489\u0007\u0014\u0002\u0002\u0489\u0497\u0007\u007b\u0002\u0002\u048a\u048c\u0007\u0036\u0002\u0002\u048b\u048d\u0005\u005c\u002f\u0002\u048c\u048b\u0003\u0002\u0002\u0002\u048c\u048d\u0003\u0002\u0002\u0002\u048d\u048e\u0003\u0002\u0002\u0002\u048e\u0497\u0007\u007b\u0002\u0002\u048f\u0490\u0007\u0036\u0002\u0002\u0490\u0491\u0005\u0120\u0091\u0002\u0491\u0492\u0007\u007b\u0002\u0002\u0492\u0497\u0003\u0002\u0002\u0002\u0493\u0494\u0007\u0025\u0002\u0002\u0494\u0495\u0007\u007f\u0002\u0002\u0495\u0497\u0007\u007b\u0002\u0002\u0496\u0486\u0003\u0002\u0002\u0002\u0496\u0488\u0003\u0002\u0002\u0002\u0496\u048a\u0003\u0002\u0002\u0002\u0496\u048f\u0003\u0002\u0002\u0002\u0496\u0493\u0003\u0002\u0002\u0002\u0497\u0077\u0003\u0002\u0002\u0002\u0498\u0499\u0005\u007e\u0040\u0002\u0499\u0079\u0003\u0002\u0002\u0002\u049a\u049b\u0008\u003e\u0001\u0002\u049b\u049c\u0005\u007c\u003f\u0002\u049c\u04a1\u0003\u0002\u0002\u0002\u049d\u049e\u000c\u0003\u0002\u0002\u049e\u04a0\u0005\u007c\u003f\u0002\u049f\u049d\u0003\u0002\u0002\u0002\u04a0\u04a3\u0003\u0002\u0002\u0002\u04a1\u049f\u0003\u0002\u0002\u0002\u04a1\u04a2\u0003\u0002\u0002\u0002\u04a2\u007b\u0003\u0002\u0002\u0002\u04a3\u04a1\u0003\u0002\u0002\u0002\u04a4\u04ae\u0005\u007e\u0040\u0002\u04a5\u04ae\u0005\u0114\u008b\u0002\u04a6\u04ae\u0005\u015a\u00ae\u0002\u04a7\u04ae\u0005\u016e\u00b8\u0002\u04a8\u04ae\u0005\u0170\u00b9\u0002\u04a9\u04ae\u0005\u00d2\u006a\u0002\u04aa\u04ae\u0005\u00ba\u005e\u0002\u04ab\u04ae\u0005\u0086\u0044\u0002\u04ac\u04ae\u0005\u0088\u0045\u0002\u04ad\u04a4\u0003\u0002\u0002\u0002\u04ad\u04a5\u0003\u0002\u0002\u0002\u04ad\u04a6\u0003\u0002\u0002\u0002\u04ad\u04a7\u0003\u0002\u0002\u0002\u04ad\u04a8\u0003\u0002\u0002\u0002\u04ad\u04a9\u0003\u0002\u0002\u0002\u04ad\u04aa\u0003\u0002\u0002\u0002\u04ad\u04ab\u0003\u0002\u0002\u0002\u04ad\u04ac\u0003\u0002\u0002\u0002\u04ae\u007d\u0003\u0002\u0002\u0002\u04af\u04b8\u0005\u0082\u0042\u0002\u04b0\u04b8\u0005\u00d0\u0069\u0002\u04b1\u04b8\u0005\u00c8\u0065\u0002\u04b2\u04b8\u0005\u00cc\u0067\u0002\u04b3\u04b8\u0005\u00ce\u0068\u0002\u04b4\u04b8\u0005\u0084\u0043\u0002\u04b5\u04b8\u0005\u0080\u0041\u0002\u04b6\u04b8\u0005\u00aa\u0056\u0002\u04b7\u04af\u0003\u0002\u0002\u0002\u04b7\u04b0\u0003\u0002\u0002\u0002\u04b7\u04b1\u0003\u0002\u0002\u0002\u04b7\u04b2\u0003\u0002\u0002\u0002\u04b7\u04b3\u0003\u0002\u0002\u0002\u04b7\u04b4\u0003\u0002\u0002\u0002\u04b7\u04b5\u0003\u0002\u0002\u0002\u04b7\u04b6\u0003\u0002\u0002\u0002\u04b8\u007f\u0003\u0002\u0002\u0002\u04b9\u04ba\u0007\u004a\u0002\u0002\u04ba\u04bc\u0007\u007f\u0002\u0002\u04bb\u04bd\u0005\u00d4\u006b\u0002\u04bc\u04bb\u0003\u0002\u0002\u0002\u04bc\u04bd\u0003\u0002\u0002\u0002\u04bd\u04be\u0003\u0002\u0002\u0002\u04be\u04bf\u0007\u0060\u0002\u0002\u04bf\u04c0\u0005\u0102\u0082\u0002\u04c0\u04c1\u0007\u007b\u0002\u0002\u04c1\u0081\u0003\u0002\u0002\u0002\u04c2\u04c4\u0005\u008c\u0047\u0002\u04c3\u04c2\u0003\u0002\u0002\u0002\u04c3\u04c4\u0003\u0002\u0002\u0002\u04c4\u04c6\u0003\u0002\u0002\u0002\u04c5\u04c7\u0005\u00ea\u0076\u0002\u04c6\u04c5\u0003\u0002\u0002\u0002\u04c6\u04c7\u0003\u0002\u0002\u0002\u04c7\u04c8\u0003\u0002\u0002\u0002\u04c8\u04d1\u0007\u007b\u0002\u0002\u04c9\u04cb\u0005\u00d4\u006b\u0002\u04ca\u04cc\u0005\u008c\u0047\u0002\u04cb\u04ca\u0003\u0002\u0002\u0002\u04cb\u04cc\u0003\u0002\u0002\u0002\u04cc\u04cd\u0003\u0002\u0002\u0002\u04cd\u04ce\u0005\u00ea\u0076\u0002\u04ce\u04cf\u0007\u007b\u0002\u0002\u04cf\u04d1\u0003\u0002\u0002\u0002\u04d0\u04c3\u0003\u0002\u0002\u0002\u04d0\u04c9\u0003\u0002\u0002\u0002\u04d1\u0083\u0003\u0002\u0002\u0002\u04d2\u04d3\u0007\u003b\u0002\u0002\u04d3\u04d4\u0007\u0050\u0002\u0002\u04d4\u04d5\u0005\u005e\u0030\u0002\u04d5\u04d6\u0007\u0075\u0002\u0002\u04d6\u04d7\u0007\u0088\u0002\u0002\u04d7\u04d8\u0007\u0051\u0002\u0002\u04d8\u04d9\u0007\u007b\u0002\u0002\u04d9\u0085\u0003\u0002\u0002\u0002\u04da\u04db\u0007\u007b\u0002\u0002\u04db\u0087\u0003\u0002\u0002\u0002\u04dc\u04dd\u0005\u00d4\u006b\u0002\u04dd\u04de\u0007\u007b\u0002\u0002\u04de\u0089\u0003\u0002\u0002\u0002\u04df\u04e6\u0005\u008e\u0048\u0002\u04e0\u04e6\u0005\u0094\u004b\u0002\u04e1\u04e6\u0005\u0090\u0049\u0002\u04e2\u04e6\u0007\u0024\u0002\u0002\u04e3\u04e6\u0007\u0045\u0002\u0002\u04e4\u04e6\u0007\u0012\u0002\u0002\u04e5\u04df\u0003\u0002\u0002\u0002\u04e5\u04e0\u0003\u0002\u0002\u0002\u04e5\u04e1\u0003\u0002\u0002\u0002\u04e5\u04e2\u0003\u0002\u0002\u0002\u04e5\u04e3\u0003\u0002\u0002\u0002\u04e5\u04e4\u0003\u0002\u0002\u0002\u04e6\u008b\u0003\u0002\u0002\u0002\u04e7\u04e9\u0005\u008a\u0046\u0002\u04e8\u04ea\u0005\u00d4\u006b\u0002\u04e9\u04e8\u0003\u0002\u0002\u0002\u04e9\u04ea\u0003\u0002\u0002\u0002\u04ea\u04ef\u0003\u0002\u0002\u0002\u04eb\u04ec\u0005\u008a\u0046\u0002\u04ec\u04ed\u0005\u008c\u0047\u0002\u04ed\u04ef\u0003\u0002\u0002\u0002\u04ee\u04e7\u0003\u0002\u0002\u0002\u04ee\u04eb\u0003\u0002\u0002\u0002\u04ef\u008d\u0003\u0002\u0002\u0002\u04f0\u04f1\u0009\u0004\u0002\u0002\u04f1\u008f\u0003\u0002\u0002\u0002\u04f2\u04f3\u0009\u0005\u0002\u0002\u04f3\u0091\u0003\u0002\u0002\u0002\u04f4\u04f5\u0007\u007f\u0002\u0002\u04f5\u0093\u0003\u0002\u0002\u0002\u04f6\u04fa\u0005\u0096\u004c\u0002\u04f7\u04fa\u0005\u0124\u0093\u0002\u04f8\u04fa\u0005\u00a6\u0054\u0002\u04f9\u04f6\u0003\u0002\u0002\u0002\u04f9\u04f7\u0003\u0002\u0002\u0002\u04f9\u04f8\u0003\u0002\u0002\u0002\u04fa\u0095\u0003\u0002\u0002\u0002\u04fb\u0500\u0005\u009c\u004f\u0002\u04fc\u0500\u0005\u00a2\u0052\u0002\u04fd\u0500\u0005\u016c\u00b7\u0002\u04fe\u0500\u0005\u00fc\u007f\u0002\u04ff\u04fb\u0003\u0002\u0002\u0002\u04ff\u04fc\u0003\u0002\u0002\u0002\u04ff\u04fd\u0003\u0002\u0002\u0002\u04ff\u04fe\u0003\u0002\u0002\u0002\u0500\u0097\u0003\u0002\u0002\u0002\u0501\u0503\u0005\u0094\u004b\u0002\u0502\u0504\u0005\u00d4\u006b\u0002\u0503\u0502\u0003\u0002\u0002\u0002\u0503\u0504\u0003\u0002\u0002\u0002\u0504\u0509\u0003\u0002\u0002\u0002\u0505\u0506\u0005\u0094\u004b\u0002\u0506\u0507\u0005\u0098\u004d\u0002\u0507\u0509\u0003\u0002\u0002\u0002\u0508\u0501\u0003\u0002\u0002\u0002\u0508\u0505\u0003\u0002\u0002\u0002\u0509\u0099\u0003\u0002\u0002\u0002\u050a\u050c\u0005\u0096\u004c\u0002\u050b\u050d\u0005\u00d4\u006b\u0002\u050c\u050b\u0003\u0002\u0002\u0002\u050c\u050d\u0003\u0002\u0002\u0002\u050d\u0512\u0003\u0002\u0002\u0002\u050e\u050f\u0005\u0096\u004c\u0002\u050f\u0510\u0005\u009a\u004e\u0002\u0510\u0512\u0003\u0002\u0002\u0002\u0511\u050a\u0003\u0002\u0002\u0002\u0511\u050e\u0003\u0002\u0002\u0002\u0512\u009b\u0003\u0002\u0002\u0002\u0513\u0515\u0005\u000c\u0007\u0002\u0514\u0513\u0003\u0002\u0002\u0002\u0514\u0515\u0003\u0002\u0002\u0002\u0515\u0516\u0003\u0002\u0002\u0002\u0516\u052b\u0005\u009e\u0050\u0002\u0517\u0518\u0005\u000c\u0007\u0002\u0518\u0519\u0007\u003f\u0002\u0002\u0519\u051a\u0005\u0162\u00b2\u0002\u051a\u052b\u0003\u0002\u0002\u0002\u051b\u052b\u0007\u000d\u0002\u0002\u051c\u052b\u0007\u000e\u0002\u0002\u051d\u052b\u0007\u000f\u0002\u0002\u051e\u052b\u0007\u004e\u0002\u0002\u051f\u052b\u0007\u0009\u0002\u0002\u0520\u052b\u0007\u0037\u0002\u0002\u0521\u052b\u0007\u0028\u0002\u0002\u0522\u052b\u0007\u0029\u0002\u0002\u0523\u052b\u0007\u0038\u0002\u0002\u0524\u052b\u0007\u0049\u0002\u0002\u0525\u052b\u0007\u0022\u0002\u0002\u0526\u052b\u0007\u0019\u0002\u0002\u0527\u052b\u0007\u004c\u0002\u0002\u0528\u052b\u0007\u0008\u0002\u0002\u0529\u052b\u0005\u00a0\u0051\u0002\u052a\u0514\u0003\u0002\u0002\u0002\u052a\u0517\u0003\u0002\u0002\u0002\u052a\u051b\u0003\u0002\u0002\u0002\u052a\u051c\u0003\u0002\u0002\u0002\u052a\u051d\u0003\u0002\u0002\u0002\u052a\u051e\u0003\u0002\u0002\u0002\u052a\u051f\u0003\u0002\u0002\u0002\u052a\u0520\u0003\u0002\u0002\u0002\u052a\u0521\u0003\u0002\u0002\u0002\u052a\u0522\u0003\u0002\u0002\u0002\u052a\u0523\u0003\u0002\u0002\u0002\u052a\u0524\u0003\u0002\u0002\u0002\u052a\u0525\u0003\u0002\u0002\u0002\u052a\u0526\u0003\u0002\u0002\u0002\u052a\u0527\u0003\u0002\u0002\u0002\u052a\u0528\u0003\u0002\u0002\u0002\u052a\u0529\u0003\u0002\u0002\u0002\u052b\u009d\u0003\u0002\u0002\u0002\u052c\u0531\u0005\u0122\u0092\u0002\u052d\u0531\u0005\u00a4\u0053\u0002\u052e\u0531\u0005\u0092\u004a\u0002\u052f\u0531\u0005\u0162\u00b2\u0002\u0530\u052c\u0003\u0002\u0002\u0002\u0530\u052d\u0003\u0002\u0002\u0002\u0530\u052e\u0003\u0002\u0002\u0002\u0530\u052f\u0003\u0002\u0002\u0002\u0531\u009f\u0003\u0002\u0002\u0002\u0532\u0533\u0007\u0015\u0002\u0002\u0533\u0534\u0007\u0050\u0002\u0002\u0534\u0535\u0005\u005c\u002f\u0002\u0535\u0536\u0007\u0051\u0002\u0002\u0536\u053c\u0003\u0002\u0002\u0002\u0537\u0538\u0007\u0015\u0002\u0002\u0538\u0539\u0007\u0050\u0002\u0002\u0539\u053a\u0007\u0008\u0002\u0002\u053a\u053c\u0007\u0051\u0002\u0002\u053b\u0532\u0003\u0002\u0002\u0002\u053b\u0537\u0003\u0002\u0002\u0002\u053c\u00a1\u0003\u0002\u0002\u0002\u053d\u053f\u0005\u012c\u0097\u0002\u053e\u0540\u0005\u00d4\u006b\u0002\u053f\u053e\u0003\u0002\u0002\u0002\u053f\u0540\u0003\u0002\u0002\u0002\u0540\u0542\u0003\u0002\u0002\u0002\u0541\u0543\u0005\u000c\u0007\u0002\u0542\u0541\u0003\u0002\u0002\u0002\u0542\u0543\u0003\u0002\u0002\u0002\u0543\u0544\u0003\u0002\u0002\u0002\u0544\u0545\u0007\u007f\u0002\u0002\u0545\u0556\u0003\u0002\u0002\u0002\u0546\u0547\u0005\u012c\u0097\u0002\u0547\u0548\u0005\u0162\u00b2\u0002\u0548\u0556\u0003\u0002\u0002\u0002\u0549\u054a\u0005\u012c\u0097\u0002\u054a\u054c\u0005\u000c\u0007\u0002\u054b\u054d\u0007\u003f\u0002\u0002\u054c\u054b\u0003\u0002\u0002\u0002\u054c\u054d\u0003\u0002\u0002\u0002\u054d\u054e\u0003\u0002\u0002\u0002\u054e\u054f\u0005\u0162\u00b2\u0002\u054f\u0556\u0003\u0002\u0002\u0002\u0550\u0552\u0007\u001c\u0002\u0002\u0551\u0553\u0005\u000c\u0007\u0002\u0552\u0551\u0003\u0002\u0002\u0002\u0552\u0553\u0003\u0002\u0002\u0002\u0553\u0554\u0003\u0002\u0002\u0002\u0554\u0556\u0007\u007f\u0002\u0002\u0555\u053d\u0003\u0002\u0002\u0002\u0555\u0546\u0003\u0002\u0002\u0002\u0555\u0549\u0003\u0002\u0002\u0002\u0555\u0550\u0003\u0002\u0002\u0002\u0556\u00a3\u0003\u0002\u0002\u0002\u0557\u0558\u0007\u007f\u0002\u0002\u0558\u00a5\u0003\u0002\u0002\u0002\u0559\u055a\u0005\u00a8\u0055\u0002\u055a\u055c\u0007\u0054\u0002\u0002\u055b\u055d\u0005\u00b0\u0059\u0002\u055c\u055b\u0003\u0002\u0002\u0002\u055c\u055d\u0003\u0002\u0002\u0002\u055d\u055e\u0003\u0002\u0002\u0002\u055e\u055f\u0007\u0055\u0002\u0002\u055f\u0567\u0003\u0002\u0002\u0002\u0560\u0561\u0005\u00a8\u0055\u0002\u0561\u0562\u0007\u0054\u0002\u0002\u0562\u0563\u0005\u00b0\u0059\u0002\u0563\u0564\u0007\u0075\u0002\u0002\u0564\u0565\u0007\u0055\u0002\u0002\u0565\u0567\u0003\u0002\u0002\u0002\u0566\u0559\u0003\u0002\u0002\u0002\u0566\u0560\u0003\u0002\u0002\u0002\u0567\u00a7\u0003\u0002\u0002\u0002\u0568\u056a\u0005\u00ac\u0057\u0002\u0569\u056b\u0005\u00d4\u006b\u0002\u056a\u0569\u0003\u0002\u0002\u0002\u056a\u056b\u0003\u0002\u0002\u0002\u056b\u056d\u0003\u0002\u0002\u0002\u056c\u056e\u0007\u007f\u0002\u0002\u056d\u056c\u0003\u0002\u0002\u0002\u056d\u056e\u0003\u0002\u0002\u0002\u056e\u0570\u0003\u0002\u0002\u0002\u056f\u0571\u0005\u00ae\u0058\u0002\u0570\u056f\u0003\u0002\u0002\u0002\u0570\u0571\u0003\u0002\u0002\u0002\u0571\u057c\u0003\u0002\u0002\u0002\u0572\u0574\u0005\u00ac\u0057\u0002\u0573\u0575\u0005\u00d4\u006b\u0002\u0574\u0573\u0003\u0002\u0002\u0002\u0574\u0575\u0003\u0002\u0002\u0002\u0575\u0576\u0003\u0002\u0002\u0002\u0576\u0577\u0005\u000c\u0007\u0002\u0577\u0579\u0007\u007f\u0002\u0002\u0578\u057a\u0005\u00ae\u0058\u0002\u0579\u0578\u0003\u0002\u0002\u0002\u0579\u057a\u0003\u0002\u0002\u0002\u057a\u057c\u0003\u0002\u0002\u0002\u057b\u0568\u0003\u0002\u0002\u0002\u057b\u0572\u0003\u0002\u0002\u0002\u057c\u00a9\u0003\u0002\u0002\u0002\u057d\u057f\u0005\u00ac\u0057\u0002\u057e\u0580\u0005\u00d4\u006b\u0002\u057f\u057e\u0003\u0002\u0002\u0002\u057f\u0580\u0003\u0002\u0002\u0002\u0580\u0581\u0003\u0002\u0002\u0002\u0581\u0583\u0007\u007f\u0002\u0002\u0582\u0584\u0005\u00ae\u0058\u0002\u0583\u0582\u0003\u0002\u0002\u0002\u0583\u0584\u0003\u0002\u0002\u0002\u0584\u0585\u0003\u0002\u0002\u0002\u0585\u0586\u0007\u007b\u0002\u0002\u0586\u00ab\u0003\u0002\u0002\u0002\u0587\u058d\u0007\u001c\u0002\u0002\u0588\u0589\u0007\u001c\u0002\u0002\u0589\u058d\u0007\u0010\u0002\u0002\u058a\u058b\u0007\u001c\u0002\u0002\u058b\u058d\u0007\u003d\u0002\u0002\u058c\u0587\u0003\u0002\u0002\u0002\u058c\u0588\u0003\u0002\u0002\u0002\u058c\u058a\u0003\u0002\u0002\u0002\u058d\u00ad\u0003\u0002\u0002\u0002\u058e\u058f\u0007\u0079\u0002\u0002\u058f\u0590\u0005\u0098\u004d\u0002\u0590\u00af\u0003\u0002\u0002\u0002\u0591\u0592\u0008\u0059\u0001\u0002\u0592\u0593\u0005\u00b2\u005a\u0002\u0593\u0599\u0003\u0002\u0002\u0002\u0594\u0595\u000c\u0003\u0002\u0002\u0595\u0596\u0007\u0075\u0002\u0002\u0596\u0598\u0005\u00b2\u005a\u0002\u0597\u0594\u0003\u0002\u0002\u0002\u0598\u059b\u0003\u0002\u0002\u0002\u0599\u0597\u0003\u0002\u0002\u0002\u0599\u059a\u0003\u0002\u0002\u0002\u059a\u00b1\u0003\u0002\u0002\u0002\u059b\u0599\u0003\u0002\u0002\u0002\u059c\u05a2\u0005\u00b4\u005b\u0002\u059d\u059e\u0005\u00b4\u005b\u0002\u059e\u059f\u0007\u0060\u0002\u0002\u059f\u05a0\u0005\u005e\u0030\u0002\u05a0\u05a2\u0003\u0002\u0002\u0002\u05a1\u059c\u0003\u0002\u0002\u0002\u05a1\u059d\u0003\u0002\u0002\u0002\u05a2\u00b3\u0003\u0002\u0002\u0002\u05a3\u05a4\u0007\u007f\u0002\u0002\u05a4\u00b5\u0003\u0002\u0002\u0002\u05a5\u05a8\u0005\u00b8\u005d\u0002\u05a6\u05a8\u0005\u00c6\u0064\u0002\u05a7\u05a5\u0003\u0002\u0002\u0002\u05a7\u05a6\u0003\u0002\u0002\u0002\u05a8\u00b7\u0003\u0002\u0002\u0002\u05a9\u05aa\u0007\u007f\u0002\u0002\u05aa\u00b9\u0003\u0002\u0002\u0002\u05ab\u05ae\u0005\u00bc\u005f\u0002\u05ac\u05ae\u0005\u00c2\u0062\u0002\u05ad\u05ab\u0003\u0002\u0002\u0002\u05ad\u05ac\u0003\u0002\u0002\u0002\u05ae\u00bb\u0003\u0002\u0002\u0002\u05af\u05b2\u0005\u00be\u0060\u0002\u05b0\u05b2\u0005\u00c0\u0061\u0002\u05b1\u05af\u0003\u0002\u0002\u0002\u05b1\u05b0\u0003\u0002\u0002\u0002\u05b2\u00bd\u0003\u0002\u0002\u0002\u05b3\u05b5\u0007\u0027\u0002\u0002\u05b4\u05b3\u0003\u0002\u0002\u0002\u05b4\u05b5\u0003\u0002\u0002\u0002\u05b5\u05b6\u0003\u0002\u0002\u0002\u05b6\u05b7\u0007\u002b\u0002\u0002\u05b7\u05b8\u0007\u007f\u0002\u0002\u05b8\u05b9\u0007\u0054\u0002\u0002\u05b9\u05ba\u0005\u00c4\u0063\u0002\u05ba\u05bb\u0007\u0055\u0002\u0002\u05bb\u00bf\u0003\u0002\u0002\u0002\u05bc\u05be\u0007\u0027\u0002\u0002\u05bd\u05bc\u0003\u0002\u0002\u0002\u05bd\u05be\u0003\u0002\u0002\u0002\u05be\u05bf\u0003\u0002\u0002\u0002\u05bf\u05c0\u0007\u002b\u0002\u0002\u05c0\u05c1\u0005\u00b8\u005d\u0002\u05c1\u05c2\u0007\u0054\u0002\u0002\u05c2\u05c3\u0005\u00c4\u0063\u0002\u05c3\u05c4\u0007\u0055\u0002\u0002\u05c4\u00c1\u0003\u0002\u0002\u0002\u05c5\u05c7\u0007\u0027\u0002\u0002\u05c6\u05c5\u0003\u0002\u0002\u0002\u05c6\u05c7\u0003\u0002\u0002\u0002\u05c7\u05c8\u0003\u0002\u0002\u0002\u05c8\u05c9\u0007\u002b\u0002\u0002\u05c9\u05ca\u0007\u0054\u0002\u0002\u05ca\u05cb\u0005\u00c4\u0063\u0002\u05cb\u05cc\u0007\u0055\u0002\u0002\u05cc\u00c3\u0003\u0002\u0002\u0002\u05cd\u05cf\u0005\u007a\u003e\u0002\u05ce\u05cd\u0003\u0002\u0002\u0002\u05ce\u05cf\u0003\u0002\u0002\u0002\u05cf\u00c5\u0003\u0002\u0002\u0002\u05d0\u05d1\u0007\u007f\u0002\u0002\u05d1\u00c7\u0003\u0002\u0002\u0002\u05d2\u05d3\u0007\u002b\u0002\u0002\u05d3\u05d4\u0007\u007f\u0002\u0002\u05d4\u05d5\u0007\u0060\u0002\u0002\u05d5\u05d6\u0005\u00ca\u0066\u0002\u05d6\u05d7\u0007\u007b\u0002\u0002\u05d7\u00c9\u0003\u0002\u0002\u0002\u05d8\u05da\u0005\u000c\u0007\u0002\u05d9\u05d8\u0003\u0002\u0002\u0002\u05d9\u05da\u0003\u0002\u0002\u0002\u05da\u05db\u0003\u0002\u0002\u0002\u05db\u05dc\u0005\u00b6\u005c\u0002\u05dc\u00cb\u0003\u0002\u0002\u0002\u05dd\u05df\u0007\u004a\u0002\u0002\u05de\u05e0\u0007\u0047\u0002\u0002\u05df\u05de\u0003\u0002\u0002\u0002\u05df\u05e0\u0003\u0002\u0002\u0002\u05e0\u05e1\u0003\u0002\u0002\u0002\u05e1\u05e2\u0005\u000c\u0007\u0002\u05e2\u05e3\u0005\u0008\u0005\u0002\u05e3\u05e4\u0007\u007b\u0002\u0002\u05e4\u05eb\u0003\u0002\u0002\u0002\u05e5\u05e6\u0007\u004a\u0002\u0002\u05e6\u05e7\u0007\u007a\u0002\u0002\u05e7\u05e8\u0005\u0008\u0005\u0002\u05e8\u05e9\u0007\u007b\u0002\u0002\u05e9\u05eb\u0003\u0002\u0002\u0002\u05ea\u05dd\u0003\u0002\u0002\u0002\u05ea\u05e5\u0003\u0002\u0002\u0002\u05eb\u00cd\u0003\u0002\u0002\u0002\u05ec\u05ee\u0005\u00d4\u006b\u0002\u05ed\u05ec\u0003\u0002\u0002\u0002\u05ed\u05ee\u0003\u0002\u0002\u0002\u05ee\u05ef\u0003\u0002\u0002\u0002\u05ef\u05f0\u0007\u004a\u0002\u0002\u05f0\u05f2\u0007\u002b\u0002\u0002\u05f1\u05f3\u0005\u000c\u0007\u0002\u05f2\u05f1\u0003\u0002\u0002\u0002\u05f2\u05f3\u0003\u0002\u0002\u0002\u05f3\u05f4\u0003\u0002\u0002\u0002\u05f4\u05f5\u0005\u00b6\u005c\u0002\u05f5\u05f6\u0007\u007b\u0002\u0002\u05f6\u00cf\u0003\u0002\u0002\u0002\u05f7\u05f8\u0007\u0007\u0002\u0002\u05f8\u05f9\u0007\u0050\u0002\u0002\u05f9\u05fa\u0007\u0088\u0002\u0002\u05fa\u05fb\u0007\u0051\u0002\u0002\u05fb\u05fc\u0007\u007b\u0002\u0002\u05fc\u00d1\u0003\u0002\u0002\u0002\u05fd\u05fe\u0007\u001f\u0002\u0002\u05fe\u05ff\u0007\u0088\u0002\u0002\u05ff\u0601\u0007\u0054\u0002\u0002\u0600\u0602\u0005\u007a\u003e\u0002\u0601\u0600\u0003\u0002\u0002\u0002\u0601\u0602\u0003\u0002\u0002\u0002\u0602\u0603\u0003\u0002\u0002\u0002\u0603\u0608\u0007\u0055\u0002\u0002\u0604\u0605\u0007\u001f\u0002\u0002\u0605\u0606\u0007\u0088\u0002\u0002\u0606\u0608\u0005\u007c\u003f\u0002\u0607\u05fd\u0003\u0002\u0002\u0002\u0607\u0604\u0003\u0002\u0002\u0002\u0608\u00d3\u0003\u0002\u0002\u0002\u0609\u060a\u0008\u006b\u0001\u0002\u060a\u060b\u0005\u00d6\u006c\u0002\u060b\u0610\u0003\u0002\u0002\u0002\u060c\u060d\u000c\u0003\u0002\u0002\u060d\u060f\u0005\u00d6\u006c\u0002\u060e\u060c\u0003\u0002\u0002\u0002\u060f\u0612\u0003\u0002\u0002\u0002\u0610\u060e\u0003\u0002\u0002\u0002\u0610\u0611\u0003\u0002\u0002\u0002\u0611\u00d5\u0003\u0002\u0002\u0002\u0612\u0610\u0003\u0002\u0002\u0002\u0613\u0614\u0007\u0052\u0002\u0002\u0614\u0615\u0007\u0052\u0002\u0002\u0615\u0616\u0005\u00da\u006e\u0002\u0616\u0617\u0007\u0053\u0002\u0002\u0617\u0618\u0007\u0053\u0002\u0002\u0618\u061b\u0003\u0002\u0002\u0002\u0619\u061b\u0005\u00d8\u006d\u0002\u061a\u0613\u0003\u0002\u0002\u0002\u061a\u0619\u0003\u0002\u0002\u0002\u061b\u00d7\u0003\u0002\u0002\u0002\u061c\u061d\u0007\u0005\u0002\u0002\u061d\u061e\u0007\u0050\u0002\u0002\u061e\u0620\u0005\u0102\u0082\u0002\u061f\u0621\u0007\u007e\u0002\u0002\u0620\u061f\u0003\u0002\u0002\u0002\u0620\u0621\u0003\u0002\u0002\u0002\u0621\u0622\u0003\u0002\u0002\u0002\u0622\u0623\u0007\u0051\u0002\u0002\u0623\u062d\u0003\u0002\u0002\u0002\u0624\u0625\u0007\u0005\u0002\u0002\u0625\u0626\u0007\u0050\u0002\u0002\u0626\u0628\u0005\u005e\u0030\u0002\u0627\u0629\u0007\u007e\u0002\u0002\u0628\u0627\u0003\u0002\u0002\u0002\u0628\u0629\u0003\u0002\u0002\u0002\u0629\u062a\u0003\u0002\u0002\u0002\u062a\u062b\u0007\u0051\u0002\u0002\u062b\u062d\u0003\u0002\u0002\u0002\u062c\u061c\u0003\u0002\u0002\u0002\u062c\u0624\u0003\u0002\u0002\u0002\u062d\u00d9\u0003\u0002\u0002\u0002\u062e\u0630\u0008\u006e\u0001\u0002\u062f\u0631\u0005\u00dc\u006f\u0002\u0630\u062f\u0003\u0002\u0002\u0002\u0630\u0631\u0003\u0002\u0002\u0002\u0631\u0636\u0003\u0002\u0002\u0002\u0632\u0633\u0005\u00dc\u006f\u0002\u0633\u0634\u0007\u007e\u0002\u0002\u0634\u0636\u0003\u0002\u0002\u0002\u0635\u062e\u0003\u0002\u0002\u0002\u0635\u0632\u0003\u0002\u0002\u0002\u0636\u0643\u0003\u0002\u0002\u0002\u0637\u0638\u000c\u0005\u0002\u0002\u0638\u063a\u0007\u0075\u0002\u0002\u0639\u063b\u0005\u00dc\u006f\u0002\u063a\u0639\u0003\u0002\u0002\u0002\u063a\u063b\u0003\u0002\u0002\u0002\u063b\u0642\u0003\u0002\u0002\u0002\u063c\u063d\u000c\u0003\u0002\u0002\u063d\u063e\u0007\u0075\u0002\u0002\u063e\u063f\u0005\u00dc\u006f\u0002\u063f\u0640\u0007\u007e\u0002\u0002\u0640\u0642\u0003\u0002\u0002\u0002\u0641\u0637\u0003\u0002\u0002\u0002\u0641\u063c\u0003\u0002\u0002\u0002\u0642\u0645\u0003\u0002\u0002\u0002\u0643\u0641\u0003\u0002\u0002\u0002\u0643\u0644\u0003\u0002\u0002\u0002\u0644\u00db\u0003\u0002\u0002\u0002\u0645\u0643\u0003\u0002\u0002\u0002\u0646\u0648\u0005\u00de\u0070\u0002\u0647\u0649\u0005\u00e4\u0073\u0002\u0648\u0647\u0003\u0002\u0002\u0002\u0648\u0649\u0003\u0002\u0002\u0002\u0649\u00dd\u0003\u0002\u0002\u0002\u064a\u064d\u0007\u007f\u0002\u0002\u064b\u064d\u0005\u00e0\u0071\u0002\u064c\u064a\u0003\u0002\u0002\u0002\u064c\u064b\u0003\u0002\u0002\u0002\u064d\u00df\u0003\u0002\u0002\u0002\u064e\u064f\u0005\u00e2\u0072\u0002\u064f\u0650\u0007\u007a\u0002\u0002\u0650\u0651\u0007\u007f\u0002\u0002\u0651\u00e1\u0003\u0002\u0002\u0002\u0652\u0653\u0007\u007f\u0002\u0002\u0653\u00e3\u0003\u0002\u0002\u0002\u0654\u0655\u0007\u0050\u0002\u0002\u0655\u0656\u0005\u00e6\u0074\u0002\u0656\u0657\u0007\u0051\u0002\u0002\u0657\u00e5\u0003\u0002\u0002\u0002\u0658\u065a\u0008\u0074\u0001\u0002\u0659\u065b\u0005\u00e8\u0075\u0002\u065a\u0659\u0003\u0002\u0002\u0002\u065a\u065b\u0003\u0002\u0002\u0002\u065b\u0660\u0003\u0002\u0002\u0002\u065c\u065d\u000c\u0003\u0002\u0002\u065d\u065f\u0005\u00e8\u0075\u0002\u065e\u065c\u0003\u0002\u0002\u0002\u065f\u0662\u0003\u0002\u0002\u0002\u0660\u065e\u0003\u0002\u0002\u0002\u0660\u0661\u0003\u0002\u0002\u0002\u0661\u00e7\u0003\u0002\u0002\u0002\u0662\u0660\u0003\u0002\u0002\u0002\u0663\u0664\u0007\u0050\u0002\u0002\u0664\u0665\u0005\u00e6\u0074\u0002\u0665\u0666\u0007\u0051\u0002\u0002\u0666\u0670\u0003\u0002\u0002\u0002\u0667\u0668\u0007\u0052\u0002\u0002\u0668\u0669\u0005\u00e6\u0074\u0002\u0669\u066a\u0007\u0053\u0002\u0002\u066a\u0670\u0003\u0002\u0002\u0002\u066b\u066c\u0007\u0054\u0002\u0002\u066c\u066d\u0005\u00e6\u0074\u0002\u066d\u066e\u0007\u0055\u0002\u0002\u066e\u0670\u0003\u0002\u0002\u0002\u066f\u0663\u0003\u0002\u0002\u0002\u066f\u0667\u0003\u0002\u0002\u0002\u066f\u066b\u0003\u0002\u0002\u0002\u0670\u00e9\u0003\u0002\u0002\u0002\u0671\u0672\u0008\u0076\u0001\u0002\u0672\u0673\u0005\u00ec\u0077\u0002\u0673\u0679\u0003\u0002\u0002\u0002\u0674\u0675\u000c\u0003\u0002\u0002\u0675\u0676\u0007\u0075\u0002\u0002\u0676\u0678\u0005\u00ec\u0077\u0002\u0677\u0674\u0003\u0002\u0002\u0002\u0678\u067b\u0003\u0002\u0002\u0002\u0679\u0677\u0003\u0002\u0002\u0002\u0679\u067a\u0003\u0002\u0002\u0002\u067a\u00eb\u0003\u0002\u0002\u0002\u067b\u0679\u0003\u0002\u0002\u0002\u067c\u067e\u0005\u00ee\u0078\u0002\u067d\u067f\u0005\u0118\u008d\u0002\u067e\u067d\u0003\u0002\u0002\u0002\u067e\u067f\u0003\u0002\u0002\u0002\u067f\u00ed\u0003\u0002\u0002\u0002\u0680\u0686\u0005\u00f0\u0079\u0002\u0681\u0682\u0005\u00f2\u007a\u0002\u0682\u0683\u0005\u00f4\u007b\u0002\u0683\u0684\u0005\u00f6\u007c\u0002\u0684\u0686\u0003\u0002\u0002\u0002\u0685\u0680\u0003\u0002\u0002\u0002\u0685\u0681\u0003\u0002\u0002\u0002\u0686\u00ef\u0003\u0002\u0002\u0002\u0687\u068c\u0005\u00f2\u007a\u0002\u0688\u0689\u0005\u00f8\u007d\u0002\u0689\u068a\u0005\u00f0\u0079\u0002\u068a\u068c\u0003\u0002\u0002\u0002\u068b\u0687\u0003\u0002\u0002\u0002\u068b\u0688\u0003\u0002\u0002\u0002\u068c\u00f1\u0003\u0002\u0002\u0002\u068d\u068e\u0008\u007a\u0001\u0002\u068e\u0690\u0005\u0100\u0081\u0002\u068f\u0691\u0005\u00d4\u006b\u0002\u0690\u068f\u0003\u0002\u0002\u0002\u0690\u0691\u0003\u0002\u0002\u0002\u0691\u0697\u0003\u0002\u0002\u0002\u0692\u0693\u0007\u0050\u0002\u0002\u0693\u0694\u0005\u00f0\u0079\u0002\u0694\u0695\u0007\u0051\u0002\u0002\u0695\u0697\u0003\u0002\u0002\u0002\u0696\u068d\u0003\u0002\u0002\u0002\u0696\u0692\u0003\u0002\u0002\u0002\u0697\u06a5\u0003\u0002\u0002\u0002\u0698\u0699\u000c\u0005\u0002\u0002\u0699\u06a4\u0005\u00f4\u007b\u0002\u069a\u069b\u000c\u0004\u0002\u0002\u069b\u069d\u0007\u0052\u0002\u0002\u069c\u069e\u0005\u005e\u0030\u0002\u069d\u069c\u0003\u0002\u0002\u0002\u069d\u069e\u0003\u0002\u0002\u0002\u069e\u069f\u0003\u0002\u0002\u0002\u069f\u06a1\u0007\u0053\u0002\u0002\u06a0\u06a2\u0005\u00d4\u006b\u0002\u06a1\u06a0\u0003\u0002\u0002\u0002\u06a1\u06a2\u0003\u0002\u0002\u0002\u06a2\u06a4\u0003\u0002\u0002\u0002\u06a3\u0698\u0003\u0002\u0002\u0002\u06a3\u069a\u0003\u0002\u0002\u0002\u06a4\u06a7\u0003\u0002\u0002\u0002\u06a5\u06a3\u0003\u0002\u0002\u0002\u06a5\u06a6\u0003\u0002\u0002\u0002\u06a6\u00f3\u0003\u0002\u0002\u0002\u06a7\u06a5\u0003\u0002\u0002\u0002\u06a8\u06a9\u0007\u0050\u0002\u0002\u06a9\u06aa\u0005\u010e\u0088\u0002\u06aa\u06ac\u0007\u0051\u0002\u0002\u06ab\u06ad\u0005\u00fa\u007e\u0002\u06ac\u06ab\u0003\u0002\u0002\u0002\u06ac\u06ad\u0003\u0002\u0002\u0002\u06ad\u06af\u0003\u0002\u0002\u0002\u06ae\u06b0\u0005\u00fe\u0080\u0002\u06af\u06ae\u0003\u0002\u0002\u0002\u06af\u06b0\u0003\u0002\u0002\u0002\u06b0\u06b2\u0003\u0002\u0002\u0002\u06b1\u06b3\u0005\u017e\u00c0\u0002\u06b2\u06b1\u0003\u0002\u0002\u0002\u06b2\u06b3\u0003\u0002\u0002\u0002\u06b3\u06b5\u0003\u0002\u0002\u0002\u06b4\u06b6\u0005\u00d4\u006b\u0002\u06b5\u06b4\u0003\u0002\u0002\u0002\u06b5\u06b6\u0003\u0002\u0002\u0002\u06b6\u00f5\u0003\u0002\u0002\u0002\u06b7\u06b8\u0007\u0077\u0002\u0002\u06b8\u06ba\u0005\u009a\u004e\u0002\u06b9\u06bb\u0005\u0104\u0083\u0002\u06ba\u06b9\u0003\u0002\u0002\u0002\u06ba\u06bb\u0003\u0002\u0002\u0002\u06bb\u00f7\u0003\u0002\u0002\u0002\u06bc\u06be\u0007\u0058\u0002\u0002\u06bd\u06bf\u0005\u00d4\u006b\u0002\u06be\u06bd\u0003\u0002\u0002\u0002\u06be\u06bf\u0003\u0002\u0002\u0002\u06bf\u06c1\u0003\u0002\u0002\u0002\u06c0\u06c2\u0005\u00fa\u007e\u0002\u06c1\u06c0\u0003\u0002\u0002\u0002\u06c1\u06c2\u0003\u0002\u0002\u0002\u06c2\u06d4\u0003\u0002\u0002\u0002\u06c3\u06c5\u0007\u005c\u0002\u0002\u06c4\u06c6\u0005\u00d4\u006b\u0002\u06c5\u06c4\u0003\u0002\u0002\u0002\u06c5\u06c6\u0003\u0002\u0002\u0002\u06c6\u06d4\u0003\u0002\u0002\u0002\u06c7\u06c9\u0007\u0071\u0002\u0002\u06c8\u06ca\u0005\u00d4\u006b\u0002\u06c9\u06c8\u0003\u0002\u0002\u0002\u06c9\u06ca\u0003\u0002\u0002\u0002\u06ca\u06d4\u0003\u0002\u0002\u0002\u06cb\u06cc\u0005\u000c\u0007\u0002\u06cc\u06ce\u0007\u0058\u0002\u0002\u06cd\u06cf\u0005\u00d4\u006b\u0002\u06ce\u06cd\u0003\u0002\u0002\u0002\u06ce\u06cf\u0003\u0002\u0002\u0002\u06cf\u06d1\u0003\u0002\u0002\u0002\u06d0\u06d2\u0005\u00fa\u007e\u0002\u06d1\u06d0\u0003\u0002\u0002\u0002\u06d1\u06d2\u0003\u0002\u0002\u0002\u06d2\u06d4\u0003\u0002\u0002\u0002\u06d3\u06bc\u0003\u0002\u0002\u0002\u06d3\u06c3\u0003\u0002\u0002\u0002\u06d3\u06c7\u0003\u0002\u0002\u0002\u06d3\u06cb\u0003\u0002\u0002\u0002\u06d4\u00f9\u0003\u0002\u0002\u0002\u06d5\u06d7\u0005\u00fc\u007f\u0002\u06d6\u06d8\u0005\u00fa\u007e\u0002\u06d7\u06d6\u0003\u0002\u0002\u0002\u06d7\u06d8\u0003\u0002\u0002\u0002\u06d8\u00fb\u0003\u0002\u0002\u0002\u06d9\u06da\u0009\u0006\u0002\u0002\u06da\u00fd\u0003\u0002\u0002\u0002\u06db\u06dc\u0009\u0007\u0002\u0002\u06dc\u00ff\u0003\u0002\u0002\u0002\u06dd\u06df\u0007\u007e\u0002\u0002\u06de\u06dd\u0003\u0002\u0002\u0002\u06de\u06df\u0003\u0002\u0002\u0002\u06df\u06e0\u0003\u0002\u0002\u0002\u06e0\u06e1\u0005\u0006\u0004\u0002\u06e1\u0101\u0003\u0002\u0002\u0002\u06e2\u06e4\u0005\u0098\u004d\u0002\u06e3\u06e5\u0005\u0104\u0083\u0002\u06e4\u06e3\u0003\u0002\u0002\u0002\u06e4\u06e5\u0003\u0002\u0002\u0002\u06e5\u0103\u0003\u0002\u0002\u0002\u06e6\u06ef\u0005\u0106\u0084\u0002\u06e7\u06e9\u0005\u0108\u0085\u0002\u06e8\u06e7\u0003\u0002\u0002\u0002\u06e8\u06e9\u0003\u0002\u0002\u0002\u06e9\u06ea\u0003\u0002\u0002\u0002\u06ea\u06eb\u0005\u00f4\u007b\u0002\u06eb\u06ec\u0005\u00f6\u007c\u0002\u06ec\u06ef\u0003\u0002\u0002\u0002\u06ed\u06ef\u0005\u010a\u0086\u0002\u06ee\u06e6\u0003\u0002\u0002\u0002\u06ee\u06e8\u0003\u0002\u0002\u0002\u06ee\u06ed\u0003\u0002\u0002\u0002\u06ef\u0105\u0003\u0002\u0002\u0002\u06f0\u06f6\u0005\u0108\u0085\u0002\u06f1\u06f3\u0005\u00f8\u007d\u0002\u06f2\u06f4\u0005\u0106\u0084\u0002\u06f3\u06f2\u0003\u0002\u0002\u0002\u06f3\u06f4\u0003\u0002\u0002\u0002\u06f4\u06f6\u0003\u0002\u0002\u0002\u06f5\u06f0\u0003\u0002\u0002\u0002\u06f5\u06f1\u0003\u0002\u0002\u0002\u06f6\u0107\u0003\u0002\u0002\u0002\u06f7\u06f8\u0008\u0085\u0001\u0002\u06f8\u0706\u0005\u00f4\u007b\u0002\u06f9\u06fb\u0007\u0052\u0002\u0002\u06fa\u06fc\u0005\u005e\u0030\u0002\u06fb\u06fa\u0003\u0002\u0002\u0002\u06fb\u06fc\u0003\u0002\u0002\u0002\u06fc\u06fd\u0003\u0002\u0002\u0002\u06fd\u06ff\u0007\u0053\u0002\u0002\u06fe\u0700\u0005\u00d4\u006b\u0002\u06ff\u06fe\u0003\u0002\u0002\u0002\u06ff\u0700\u0003\u0002\u0002\u0002\u0700\u0706\u0003\u0002\u0002\u0002\u0701\u0702\u0007\u0050\u0002\u0002\u0702\u0703\u0005\u0106\u0084\u0002\u0703\u0704\u0007\u0051\u0002\u0002\u0704\u0706\u0003\u0002\u0002\u0002\u0705\u06f7\u0003\u0002\u0002\u0002\u0705\u06f9\u0003\u0002\u0002\u0002\u0705\u0701\u0003\u0002\u0002\u0002\u0706\u0714\u0003\u0002\u0002\u0002\u0707\u0708\u000c\u0007\u0002\u0002\u0708\u0713\u0005\u00f4\u007b\u0002\u0709\u070a\u000c\u0005\u0002\u0002\u070a\u070c\u0007\u0052\u0002\u0002\u070b\u070d\u0005\u005e\u0030\u0002\u070c\u070b\u0003\u0002\u0002\u0002\u070c\u070d\u0003\u0002\u0002\u0002\u070d\u070e\u0003\u0002\u0002\u0002\u070e\u0710\u0007\u0053\u0002\u0002\u070f\u0711\u0005\u00d4\u006b\u0002\u0710\u070f\u0003\u0002\u0002\u0002\u0710\u0711\u0003\u0002\u0002\u0002\u0711\u0713\u0003\u0002\u0002\u0002\u0712\u0707\u0003\u0002\u0002\u0002\u0712\u0709\u0003\u0002\u0002\u0002\u0713\u0716\u0003\u0002\u0002\u0002\u0714\u0712\u0003\u0002\u0002\u0002\u0714\u0715\u0003\u0002\u0002\u0002\u0715\u0109\u0003\u0002\u0002\u0002\u0716\u0714\u0003\u0002\u0002\u0002\u0717\u071c\u0005\u010c\u0087\u0002\u0718\u0719\u0005\u00f8\u007d\u0002\u0719\u071a\u0005\u010a\u0086\u0002\u071a\u071c\u0003\u0002\u0002\u0002\u071b\u0717\u0003\u0002\u0002\u0002\u071b\u0718\u0003\u0002\u0002\u0002\u071c\u010b\u0003\u0002\u0002\u0002\u071d\u071e\u0008\u0087\u0001\u0002\u071e\u071f\u0007\u007e\u0002\u0002\u071f\u072d\u0003\u0002\u0002\u0002\u0720\u0721\u000c\u0005\u0002\u0002\u0721\u072c\u0005\u00f4\u007b\u0002\u0722\u0723\u000c\u0004\u0002\u0002\u0723\u0725\u0007\u0052\u0002\u0002\u0724\u0726\u0005\u005e\u0030\u0002\u0725\u0724\u0003\u0002\u0002\u0002\u0725\u0726\u0003\u0002\u0002\u0002\u0726\u0727\u0003\u0002\u0002\u0002\u0727\u0729\u0007\u0053\u0002\u0002\u0728\u072a\u0005\u00d4\u006b\u0002\u0729\u0728\u0003\u0002\u0002\u0002\u0729\u072a\u0003\u0002\u0002\u0002\u072a\u072c\u0003\u0002\u0002\u0002\u072b\u0720\u0003\u0002\u0002\u0002\u072b\u0722\u0003\u0002\u0002\u0002\u072c\u072f\u0003\u0002\u0002\u0002\u072d\u072b\u0003\u0002\u0002\u0002\u072d\u072e\u0003\u0002\u0002\u0002\u072e\u010d\u0003\u0002\u0002\u0002\u072f\u072d\u0003\u0002\u0002\u0002\u0730\u0732\u0005\u0110\u0089\u0002\u0731\u0730\u0003\u0002\u0002\u0002\u0731\u0732\u0003\u0002\u0002\u0002\u0732\u0734\u0003\u0002\u0002\u0002\u0733\u0735\u0007\u007e\u0002\u0002\u0734\u0733\u0003\u0002\u0002\u0002\u0734\u0735\u0003\u0002\u0002\u0002\u0735\u073b\u0003\u0002\u0002\u0002\u0736\u0737\u0005\u0110\u0089\u0002\u0737\u0738\u0007\u0075\u0002\u0002\u0738\u0739\u0007\u007e\u0002\u0002\u0739\u073b\u0003\u0002\u0002\u0002\u073a\u0731\u0003\u0002\u0002\u0002\u073a\u0736\u0003\u0002\u0002\u0002\u073b\u010f\u0003\u0002\u0002\u0002\u073c\u073d\u0008\u0089\u0001\u0002\u073d\u073e\u0005\u0112\u008a\u0002\u073e\u0744\u0003\u0002\u0002\u0002\u073f\u0740\u000c\u0003\u0002\u0002\u0740\u0741\u0007\u0075\u0002\u0002\u0741\u0743\u0005\u0112\u008a\u0002\u0742\u073f\u0003\u0002\u0002\u0002\u0743\u0746\u0003\u0002\u0002\u0002\u0744\u0742\u0003\u0002\u0002\u0002\u0744\u0745\u0003\u0002\u0002\u0002\u0745\u0111\u0003\u0002\u0002\u0002\u0746\u0744\u0003\u0002\u0002\u0002\u0747\u0749\u0005\u00d4\u006b\u0002\u0748\u0747\u0003\u0002\u0002\u0002\u0748\u0749\u0003\u0002\u0002\u0002\u0749\u074a\u0003\u0002\u0002\u0002\u074a\u074b\u0005\u008c\u0047\u0002\u074b\u074c\u0005\u00ee\u0078\u0002\u074c\u0767\u0003\u0002\u0002\u0002\u074d\u074f\u0005\u00d4\u006b\u0002\u074e\u074d\u0003\u0002\u0002\u0002\u074e\u074f\u0003\u0002\u0002\u0002\u074f\u0750\u0003\u0002\u0002\u0002\u0750\u0751\u0005\u008c\u0047\u0002\u0751\u0752\u0005\u00ee\u0078\u0002\u0752\u0753\u0007\u0060\u0002\u0002\u0753\u0754\u0005\u011c\u008f\u0002\u0754\u0767\u0003\u0002\u0002\u0002\u0755\u0757\u0005\u00d4\u006b\u0002\u0756\u0755\u0003\u0002\u0002\u0002\u0756\u0757\u0003\u0002\u0002\u0002\u0757\u0758\u0003\u0002\u0002\u0002\u0758\u075a\u0005\u008c\u0047\u0002\u0759\u075b\u0005\u0104\u0083\u0002\u075a\u0759\u0003\u0002\u0002\u0002\u075a\u075b\u0003\u0002\u0002\u0002\u075b\u0767\u0003\u0002\u0002\u0002\u075c\u075e\u0005\u00d4\u006b\u0002\u075d\u075c\u0003\u0002\u0002\u0002\u075d\u075e\u0003\u0002\u0002\u0002\u075e\u075f\u0003\u0002\u0002\u0002\u075f\u0761\u0005\u008c\u0047\u0002\u0760\u0762\u0005\u0104\u0083\u0002\u0761\u0760\u0003\u0002\u0002\u0002\u0761\u0762\u0003\u0002\u0002\u0002\u0762\u0763\u0003\u0002\u0002\u0002\u0763\u0764\u0007\u0060\u0002\u0002\u0764\u0765\u0005\u011c\u008f\u0002\u0765\u0767\u0003\u0002\u0002\u0002\u0766\u0748\u0003\u0002\u0002\u0002\u0766\u074e\u0003\u0002\u0002\u0002\u0766\u0756\u0003\u0002\u0002\u0002\u0766\u075d\u0003\u0002\u0002\u0002\u0767\u0113\u0003\u0002\u0002\u0002\u0768\u076a\u0005\u00d4\u006b\u0002\u0769\u0768\u0003\u0002\u0002\u0002\u0769\u076a\u0003\u0002\u0002\u0002\u076a\u076c\u0003\u0002\u0002\u0002\u076b\u076d\u0005\u008c\u0047\u0002\u076c\u076b\u0003\u0002\u0002\u0002\u076c\u076d\u0003\u0002\u0002\u0002\u076d\u076e\u0003\u0002\u0002\u0002\u076e\u0770\u0005\u00ee\u0078\u0002\u076f\u0771\u0005\u0136\u009c\u0002\u0770\u076f\u0003\u0002\u0002\u0002\u0770\u0771\u0003\u0002\u0002\u0002\u0771\u0772\u0003\u0002\u0002\u0002\u0772\u0773\u0005\u0116\u008c\u0002\u0773\u0115\u0003\u0002\u0002\u0002\u0774\u0776\u0005\u014e\u00a8\u0002\u0775\u0774\u0003\u0002\u0002\u0002\u0775\u0776\u0003\u0002\u0002\u0002\u0776\u0777\u0003\u0002\u0002\u0002\u0777\u0780\u0005\u0066\u0034\u0002\u0778\u0780\u0005\u0174\u00bb\u0002\u0779\u077a\u0007\u0060\u0002\u0002\u077a\u077b\u0007\u0016\u0002\u0002\u077b\u0780\u0007\u007b\u0002\u0002\u077c\u077d\u0007\u0060\u0002\u0002\u077d\u077e\u0007\u0017\u0002\u0002\u077e\u0780\u0007\u007b\u0002\u0002\u077f\u0775\u0003\u0002\u0002\u0002\u077f\u0778\u0003\u0002\u0002\u0002\u077f\u0779\u0003\u0002\u0002\u0002\u077f\u077c\u0003\u0002\u0002\u0002\u0780\u0117\u0003\u0002\u0002\u0002\u0781\u0787\u0005\u011a\u008e\u0002\u0782\u0783\u0007\u0050\u0002\u0002\u0783\u0784\u0005\u0026\u0014\u0002\u0784\u0785\u0007\u0051\u0002\u0002\u0785\u0787\u0003\u0002\u0002\u0002\u0786\u0781\u0003\u0002\u0002\u0002\u0786\u0782\u0003\u0002\u0002\u0002\u0787\u0119\u0003\u0002\u0002\u0002\u0788\u0789\u0007\u0060\u0002\u0002\u0789\u078c\u0005\u011c\u008f\u0002\u078a\u078c\u0005\u0120\u0091\u0002\u078b\u0788\u0003\u0002\u0002\u0002\u078b\u078a\u0003\u0002\u0002\u0002\u078c\u011b\u0003\u0002\u0002\u0002\u078d\u0790\u0005\u0058\u002d\u0002\u078e\u0790\u0005\u0120\u0091\u0002\u078f\u078d\u0003\u0002\u0002\u0002\u078f\u078e\u0003\u0002\u0002\u0002\u0790\u011d\u0003\u0002\u0002\u0002\u0791\u0792\u0008\u0090\u0001\u0002\u0792\u0794\u0005\u011c\u008f\u0002\u0793\u0795\u0007\u007e\u0002\u0002\u0794\u0793\u0003\u0002\u0002\u0002\u0794\u0795\u0003\u0002\u0002\u0002\u0795\u079e\u0003\u0002\u0002\u0002\u0796\u0797\u000c\u0003\u0002\u0002\u0797\u0798\u0007\u0075\u0002\u0002\u0798\u079a\u0005\u011c\u008f\u0002\u0799\u079b\u0007\u007e\u0002\u0002\u079a\u0799\u0003\u0002\u0002\u0002\u079a\u079b\u0003\u0002\u0002\u0002\u079b\u079d\u0003\u0002\u0002\u0002\u079c\u0796\u0003\u0002\u0002\u0002\u079d\u07a0\u0003\u0002\u0002\u0002\u079e\u079c\u0003\u0002\u0002\u0002\u079e\u079f\u0003\u0002\u0002\u0002\u079f\u011f\u0003\u0002\u0002\u0002\u07a0\u079e\u0003\u0002\u0002\u0002\u07a1\u07a2\u0007\u0054\u0002\u0002\u07a2\u07a4\u0005\u011e\u0090\u0002\u07a3\u07a5\u0007\u0075\u0002\u0002\u07a4\u07a3\u0003\u0002\u0002\u0002\u07a4\u07a5\u0003\u0002\u0002\u0002\u07a5\u07a6\u0003\u0002\u0002\u0002\u07a6\u07a7\u0007\u0055\u0002\u0002\u07a7\u07ab\u0003\u0002\u0002\u0002\u07a8\u07a9\u0007\u0054\u0002\u0002\u07a9\u07ab\u0007\u0055\u0002\u0002\u07aa\u07a1\u0003\u0002\u0002\u0002\u07aa\u07a8\u0003\u0002\u0002\u0002\u07ab\u0121\u0003\u0002\u0002\u0002\u07ac\u07af\u0007\u007f\u0002\u0002\u07ad\u07af\u0005\u0162\u00b2\u0002\u07ae\u07ac\u0003\u0002\u0002\u0002\u07ae\u07ad\u0003\u0002\u0002\u0002\u07af\u0123\u0003\u0002\u0002\u0002\u07b0\u07b1\u0005\u0126\u0094\u0002\u07b1\u07b3\u0007\u0054\u0002\u0002\u07b2\u07b4\u0005\u012e\u0098\u0002\u07b3\u07b2\u0003\u0002\u0002\u0002\u07b3\u07b4\u0003\u0002\u0002\u0002\u07b4\u07b5\u0003\u0002\u0002\u0002\u07b5\u07b6\u0007\u0055\u0002\u0002\u07b6\u0125\u0003\u0002\u0002\u0002\u07b7\u07b9\u0005\u012c\u0097\u0002\u07b8\u07ba\u0005\u00d4\u006b\u0002\u07b9\u07b8\u0003\u0002\u0002\u0002\u07b9\u07ba\u0003\u0002\u0002\u0002\u07ba\u07bb\u0003\u0002\u0002\u0002\u07bb\u07bd\u0005\u0128\u0095\u0002\u07bc\u07be\u0005\u012a\u0096\u0002\u07bd\u07bc\u0003\u0002\u0002\u0002\u07bd\u07be\u0003\u0002\u0002\u0002\u07be\u07c0\u0003\u0002\u0002\u0002\u07bf\u07c1\u0005\u013c\u009f\u0002\u07c0\u07bf\u0003\u0002\u0002\u0002\u07c0\u07c1\u0003\u0002\u0002\u0002\u07c1\u07ca\u0003\u0002\u0002\u0002\u07c2\u07c4\u0005\u012c\u0097\u0002\u07c3\u07c5\u0005\u00d4\u006b\u0002\u07c4\u07c3\u0003\u0002\u0002\u0002\u07c4\u07c5\u0003\u0002\u0002\u0002\u07c5\u07c7\u0003\u0002\u0002\u0002\u07c6\u07c8\u0005\u013c\u009f\u0002\u07c7\u07c6\u0003\u0002\u0002\u0002\u07c7\u07c8\u0003\u0002\u0002\u0002\u07c8\u07ca\u0003\u0002\u0002\u0002\u07c9\u07b7\u0003\u0002\u0002\u0002\u07c9\u07c2\u0003\u0002\u0002\u0002\u07ca\u0127\u0003\u0002\u0002\u0002\u07cb\u07cd\u0005\u000c\u0007\u0002\u07cc\u07cb\u0003\u0002\u0002\u0002\u07cc\u07cd\u0003\u0002\u0002\u0002\u07cd\u07ce\u0003\u0002\u0002\u0002\u07ce\u07cf\u0005\u0122\u0092\u0002\u07cf\u0129\u0003\u0002\u0002\u0002\u07d0\u07d1\u0007\u0021\u0002\u0002\u07d1\u012b\u0003\u0002\u0002\u0002\u07d2\u07d3\u0009\u0008\u0002\u0002\u07d3\u012d\u0003\u0002\u0002\u0002\u07d4\u07d6\u0005\u0130\u0099\u0002\u07d5\u07d7\u0005\u012e\u0098\u0002\u07d6\u07d5\u0003\u0002\u0002\u0002\u07d6\u07d7\u0003\u0002\u0002\u0002\u07d7\u07de\u0003\u0002\u0002\u0002\u07d8\u07d9\u0005\u0146\u00a4\u0002\u07d9\u07db\u0007\u0079\u0002\u0002\u07da\u07dc\u0005\u012e\u0098\u0002\u07db\u07da\u0003\u0002\u0002\u0002\u07db\u07dc\u0003\u0002\u0002\u0002\u07dc\u07de\u0003\u0002\u0002\u0002\u07dd\u07d4\u0003\u0002\u0002\u0002\u07dd\u07d8\u0003\u0002\u0002\u0002\u07de\u012f\u0003\u0002\u0002\u0002\u07df\u07e1\u0005\u00d4\u006b\u0002\u07e0\u07df\u0003\u0002\u0002\u0002\u07e0\u07e1\u0003\u0002\u0002\u0002\u07e1\u07e3\u0003\u0002\u0002\u0002\u07e2\u07e4\u0005\u008c\u0047\u0002\u07e3\u07e2\u0003\u0002\u0002\u0002\u07e3\u07e4\u0003\u0002\u0002\u0002\u07e4\u07e6\u0003\u0002\u0002\u0002\u07e5\u07e7\u0005\u0132\u009a\u0002\u07e6\u07e5\u0003\u0002\u0002\u0002\u07e6\u07e7\u0003\u0002\u0002\u0002\u07e7\u07e8\u0003\u0002\u0002\u0002\u07e8\u07f0\u0007\u007b\u0002\u0002\u07e9\u07f0\u0005\u0114\u008b\u0002\u07ea\u07f0\u0005\u00cc\u0067\u0002\u07eb\u07f0\u0005\u0084\u0043\u0002\u07ec\u07f0\u0005\u015a\u00ae\u0002\u07ed\u07f0\u0005\u0080\u0041\u0002\u07ee\u07f0\u0005\u0086\u0044\u0002\u07ef\u07e0\u0003\u0002\u0002\u0002\u07ef\u07e9\u0003\u0002\u0002\u0002\u07ef\u07ea\u0003\u0002\u0002\u0002\u07ef\u07eb\u0003\u0002\u0002\u0002\u07ef\u07ec\u0003\u0002\u0002\u0002\u07ef\u07ed\u0003\u0002\u0002\u0002\u07ef\u07ee\u0003\u0002\u0002\u0002\u07f0\u0131\u0003\u0002\u0002\u0002\u07f1\u07f2\u0008\u009a\u0001\u0002\u07f2\u07f3\u0005\u0134\u009b\u0002\u07f3\u07f9\u0003\u0002\u0002\u0002\u07f4\u07f5\u000c\u0003\u0002\u0002\u07f5\u07f6\u0007\u0075\u0002\u0002\u07f6\u07f8\u0005\u0134\u009b\u0002\u07f7\u07f4\u0003\u0002\u0002\u0002\u07f8\u07fb\u0003\u0002\u0002\u0002\u07f9\u07f7\u0003\u0002\u0002\u0002\u07f9\u07fa\u0003\u0002\u0002\u0002\u07fa\u0133\u0003\u0002\u0002\u0002\u07fb\u07f9\u0003\u0002\u0002\u0002\u07fc\u07fe\u0005\u00ee\u0078\u0002\u07fd\u07ff\u0005\u0136\u009c\u0002\u07fe\u07fd\u0003\u0002\u0002\u0002\u07fe\u07ff\u0003\u0002\u0002\u0002\u07ff\u0801\u0003\u0002\u0002\u0002\u0800\u0802\u0005\u013a\u009e\u0002\u0801\u0800\u0003\u0002\u0002\u0002\u0801\u0802\u0003\u0002\u0002\u0002\u0802\u0810\u0003\u0002\u0002\u0002\u0803\u0805\u0005\u00ee\u0078\u0002\u0804\u0806\u0005\u011a\u008e\u0002\u0805\u0804\u0003\u0002\u0002\u0002\u0805\u0806\u0003\u0002\u0002\u0002\u0806\u0810\u0003\u0002\u0002\u0002\u0807\u0809\u0007\u007f\u0002\u0002\u0808\u0807\u0003\u0002\u0002\u0002\u0808\u0809\u0003\u0002\u0002\u0002\u0809\u080b\u0003\u0002\u0002\u0002\u080a\u080c\u0005\u00d4\u006b\u0002\u080b\u080a\u0003\u0002\u0002\u0002\u080b\u080c\u0003\u0002\u0002\u0002\u080c\u080d\u0003\u0002\u0002\u0002\u080d\u080e\u0007\u0079\u0002\u0002\u080e\u0810\u0005\u005e\u0030\u0002\u080f\u07fc\u0003\u0002\u0002\u0002\u080f\u0803\u0003\u0002\u0002\u0002\u080f\u0808\u0003\u0002\u0002\u0002\u0810\u0135\u0003\u0002\u0002\u0002\u0811\u0812\u0008\u009c\u0001\u0002\u0812\u0813\u0005\u0138\u009d\u0002\u0813\u0818\u0003\u0002\u0002\u0002\u0814\u0815\u000c\u0003\u0002\u0002\u0815\u0817\u0005\u0138\u009d\u0002\u0816\u0814\u0003\u0002\u0002\u0002\u0817\u081a\u0003\u0002\u0002\u0002\u0818\u0816\u0003\u0002\u0002\u0002\u0818\u0819\u0003\u0002\u0002\u0002\u0819\u0137\u0003\u0002\u0002\u0002\u081a\u0818\u0003\u0002\u0002\u0002\u081b\u081c\u0009\u0009\u0002\u0002\u081c\u0139\u0003\u0002\u0002\u0002\u081d\u081e\u0007\u0060\u0002\u0002\u081e\u081f\u0007\u0082\u0002\u0002\u081f\u0820\u0008\u009e\u0001\u0002\u0820\u013b\u0003\u0002\u0002\u0002\u0821\u0822\u0007\u0079\u0002\u0002\u0822\u0823\u0005\u013e\u00a0\u0002\u0823\u013d\u0003\u0002\u0002\u0002\u0824\u0825\u0008\u00a0\u0001\u0002\u0825\u0827\u0005\u0140\u00a1\u0002\u0826\u0828\u0007\u007e\u0002\u0002\u0827\u0826\u0003\u0002\u0002\u0002\u0827\u0828\u0003\u0002\u0002\u0002\u0828\u0831\u0003\u0002\u0002\u0002\u0829\u082a\u000c\u0003\u0002\u0002\u082a\u082b\u0007\u0075\u0002\u0002\u082b\u082d\u0005\u0140\u00a1\u0002\u082c\u082e\u0007\u007e\u0002\u0002\u082d\u082c\u0003\u0002\u0002\u0002\u082d\u082e\u0003\u0002\u0002\u0002\u082e\u0830\u0003\u0002\u0002\u0002\u082f\u0829\u0003\u0002\u0002\u0002\u0830\u0833\u0003\u0002\u0002\u0002\u0831\u082f\u0003\u0002\u0002\u0002\u0831\u0832\u0003\u0002\u0002\u0002\u0832\u013f\u0003\u0002\u0002\u0002\u0833\u0831\u0003\u0002\u0002\u0002\u0834\u0836\u0005\u00d4\u006b\u0002\u0835\u0834\u0003\u0002\u0002\u0002\u0835\u0836\u0003\u0002\u0002\u0002\u0836\u0837\u0003\u0002\u0002\u0002\u0837\u084a\u0005\u0144\u00a3\u0002\u0838\u083a\u0005\u00d4\u006b\u0002\u0839\u0838\u0003\u0002\u0002\u0002\u0839\u083a\u0003\u0002\u0002\u0002\u083a\u083b\u0003\u0002\u0002\u0002\u083b\u083d\u0007\u004b\u0002\u0002\u083c\u083e\u0005\u0146\u00a4\u0002\u083d\u083c\u0003\u0002\u0002\u0002\u083d\u083e\u0003\u0002\u0002\u0002\u083e\u083f\u0003\u0002\u0002\u0002\u083f\u084a\u0005\u0144\u00a3\u0002\u0840\u0842\u0005\u00d4\u006b\u0002\u0841\u0840\u0003\u0002\u0002\u0002\u0841\u0842\u0003\u0002\u0002\u0002\u0842\u0843\u0003\u0002\u0002\u0002\u0843\u0845\u0005\u0146\u00a4\u0002\u0844\u0846\u0007\u004b\u0002\u0002\u0845\u0844\u0003\u0002\u0002\u0002\u0845\u0846\u0003\u0002\u0002\u0002\u0846\u0847\u0003\u0002\u0002\u0002\u0847\u0848\u0005\u0144\u00a3\u0002\u0848\u084a\u0003\u0002\u0002\u0002\u0849\u0835\u0003\u0002\u0002\u0002\u0849\u0839\u0003\u0002\u0002\u0002\u0849\u0841\u0003\u0002\u0002\u0002\u084a\u0141\u0003\u0002\u0002\u0002\u084b\u084d\u0005\u000c\u0007\u0002\u084c\u084b\u0003\u0002\u0002\u0002\u084c\u084d\u0003\u0002\u0002\u0002\u084d\u084e\u0003\u0002\u0002\u0002\u084e\u0851\u0005\u0122\u0092\u0002\u084f\u0851\u0005\u00a0\u0051\u0002\u0850\u084c\u0003\u0002\u0002\u0002\u0850\u084f\u0003\u0002\u0002\u0002\u0851\u0143\u0003\u0002\u0002\u0002\u0852\u0853\u0005\u0142\u00a2\u0002\u0853\u0145\u0003\u0002\u0002\u0002\u0854\u0855\u0009\u000a\u0002\u0002\u0855\u0147\u0003\u0002\u0002\u0002\u0856\u0857\u0007\u002f\u0002\u0002\u0857\u0858\u0005\u014a\u00a6\u0002\u0858\u0149\u0003\u0002\u0002\u0002\u0859\u085b\u0005\u0098\u004d\u0002\u085a\u085c\u0005\u014c\u00a7\u0002\u085b\u085a\u0003\u0002\u0002\u0002\u085b\u085c\u0003\u0002\u0002\u0002\u085c\u014b\u0003\u0002\u0002\u0002\u085d\u085f\u0005\u00f8\u007d\u0002\u085e\u0860\u0005\u014c\u00a7\u0002\u085f\u085e\u0003\u0002\u0002\u0002\u085f\u0860\u0003\u0002\u0002\u0002\u0860\u014d\u0003\u0002\u0002\u0002\u0861\u0862\u0007\u0079\u0002\u0002\u0862\u0863\u0005\u0150\u00a9\u0002\u0863\u014f\u0003\u0002\u0002\u0002\u0864\u0866\u0005\u0152\u00aa\u0002\u0865\u0867\u0007\u007e\u0002\u0002\u0866\u0865\u0003\u0002\u0002\u0002\u0866\u0867\u0003\u0002\u0002\u0002\u0867\u0870\u0003\u0002\u0002\u0002\u0868\u086a\u0005\u0152\u00aa\u0002\u0869\u086b\u0007\u007e\u0002\u0002\u086a\u0869\u0003\u0002\u0002\u0002\u086a\u086b\u0003\u0002\u0002\u0002\u086b\u086c\u0003\u0002\u0002\u0002\u086c\u086d\u0007\u0075\u0002\u0002\u086d\u086e\u0005\u0150\u00a9\u0002\u086e\u0870\u0003\u0002\u0002\u0002\u086f\u0864\u0003\u0002\u0002\u0002\u086f\u0868\u0003\u0002\u0002\u0002\u0870\u0151\u0003\u0002\u0002\u0002\u0871\u0872\u0005\u0154\u00ab\u0002\u0872\u0874\u0007\u0050\u0002\u0002\u0873\u0875\u0005\u0026\u0014\u0002\u0874\u0873\u0003\u0002\u0002\u0002\u0874\u0875\u0003\u0002\u0002\u0002\u0875\u0876\u0003\u0002\u0002\u0002\u0876\u0877\u0007\u0051\u0002\u0002\u0877\u087c\u0003\u0002\u0002\u0002\u0878\u0879\u0005\u0154\u00ab\u0002\u0879\u087a\u0005\u0120\u0091\u0002\u087a\u087c\u0003\u0002\u0002\u0002\u087b\u0871\u0003\u0002\u0002\u0002\u087b\u0878\u0003\u0002\u0002\u0002\u087c\u0153\u0003\u0002\u0002\u0002\u087d\u0880\u0005\u0142\u00a2\u0002\u087e\u0880\u0007\u007f\u0002\u0002\u087f\u087d\u0003\u0002\u0002\u0002\u087f\u087e\u0003\u0002\u0002\u0002\u0880\u0155\u0003\u0002\u0002\u0002\u0881\u0882\u0007\u002f\u0002\u0002\u0882\u0883\u0005\u018a\u00c6\u0002\u0883\u0157\u0003\u0002\u0002\u0002\u0884\u0885\u0007\u002f\u0002\u0002\u0885\u0886\u0007\u0088\u0002\u0002\u0886\u088a\u0007\u007f\u0002\u0002\u0887\u0888\u0007\u002f\u0002\u0002\u0888\u088a\u0007\u008b\u0002\u0002\u0889\u0884\u0003\u0002\u0002\u0002\u0889\u0887\u0003\u0002\u0002\u0002\u088a\u0159\u0003\u0002\u0002\u0002\u088b\u088c\u0007\u003f\u0002\u0002\u088c\u088d\u0007\u0061\u0002\u0002\u088d\u088e\u0005\u015c\u00af\u0002\u088e\u088f\u0007\u0062\u0002\u0002\u088f\u0890\u0005\u007c\u003f\u0002\u0890\u015b\u0003\u0002\u0002\u0002\u0891\u0892\u0008\u00af\u0001\u0002\u0892\u0893\u0005\u015e\u00b0\u0002\u0893\u0899\u0003\u0002\u0002\u0002\u0894\u0895\u000c\u0003\u0002\u0002\u0895\u0896\u0007\u0075\u0002\u0002\u0896\u0898\u0005\u015e\u00b0\u0002\u0897\u0894\u0003\u0002\u0002\u0002\u0898\u089b\u0003\u0002\u0002\u0002\u0899\u0897\u0003\u0002\u0002\u0002\u0899\u089a\u0003\u0002\u0002\u0002\u089a\u015d\u0003\u0002\u0002\u0002\u089b\u0899\u0003\u0002\u0002\u0002\u089c\u089f\u0005\u0160\u00b1\u0002\u089d\u089f\u0005\u0112\u008a\u0002\u089e\u089c\u0003\u0002\u0002\u0002\u089e\u089d\u0003\u0002\u0002\u0002\u089f\u015f\u0003\u0002\u0002\u0002\u08a0\u08a2\u0007\u0010\u0002\u0002\u08a1\u08a3\u0007\u007e\u0002\u0002\u08a2\u08a1\u0003\u0002\u0002\u0002\u08a2\u08a3\u0003\u0002\u0002\u0002\u08a3\u08a5\u0003\u0002\u0002\u0002\u08a4\u08a6\u0007\u007f\u0002\u0002\u08a5\u08a4\u0003\u0002\u0002\u0002\u08a5\u08a6\u0003\u0002\u0002\u0002\u08a6\u08d1\u0003\u0002\u0002\u0002\u08a7\u08a9\u0007\u0010\u0002\u0002\u08a8\u08aa\u0007\u007f\u0002\u0002\u08a9\u08a8\u0003\u0002\u0002\u0002\u08a9\u08aa\u0003\u0002\u0002\u0002\u08aa\u08ab\u0003\u0002\u0002\u0002\u08ab\u08ac\u0007\u0060\u0002\u0002\u08ac\u08d1\u0005\u0102\u0082\u0002\u08ad\u08af\u0007\u0047\u0002\u0002\u08ae\u08b0\u0007\u007e\u0002\u0002\u08af\u08ae\u0003\u0002\u0002\u0002\u08af\u08b0\u0003\u0002\u0002\u0002\u08b0\u08b2\u0003\u0002\u0002\u0002\u08b1\u08b3\u0007\u007f\u0002\u0002\u08b2\u08b1\u0003\u0002\u0002\u0002\u08b2\u08b3\u0003\u0002\u0002\u0002\u08b3\u08d1\u0003\u0002\u0002\u0002\u08b4\u08b6\u0007\u0047\u0002\u0002\u08b5\u08b7\u0007\u007f\u0002\u0002\u08b6\u08b5\u0003\u0002\u0002\u0002\u08b6\u08b7\u0003\u0002\u0002\u0002\u08b7\u08b8\u0003\u0002\u0002\u0002\u08b8\u08b9\u0007\u0060\u0002\u0002\u08b9\u08d1\u0005\u0102\u0082\u0002\u08ba\u08bb\u0007\u003f\u0002\u0002\u08bb\u08bc\u0007\u0061\u0002\u0002\u08bc\u08bd\u0005\u015c\u00af\u0002\u08bd\u08be\u0007\u0062\u0002\u0002\u08be\u08c0\u0007\u0010\u0002\u0002\u08bf\u08c1\u0007\u007e\u0002\u0002\u08c0\u08bf\u0003\u0002\u0002\u0002\u08c0\u08c1\u0003\u0002\u0002\u0002\u08c1\u08c3\u0003\u0002\u0002\u0002\u08c2\u08c4\u0007\u007f\u0002\u0002\u08c3\u08c2\u0003\u0002\u0002\u0002\u08c3\u08c4\u0003\u0002\u0002\u0002\u08c4\u08d1\u0003\u0002\u0002\u0002\u08c5\u08c6\u0007\u003f\u0002\u0002\u08c6\u08c7\u0007\u0061\u0002\u0002\u08c7\u08c8\u0005\u015c\u00af\u0002\u08c8\u08c9\u0007\u0062\u0002\u0002\u08c9\u08cb\u0007\u0010\u0002\u0002\u08ca\u08cc\u0007\u007f\u0002\u0002\u08cb\u08ca\u0003\u0002\u0002\u0002\u08cb\u08cc\u0003\u0002\u0002\u0002\u08cc\u08cd\u0003\u0002\u0002\u0002\u08cd\u08ce\u0007\u0060\u0002\u0002\u08ce\u08cf\u0005\u0006\u0004\u0002\u08cf\u08d1\u0003\u0002\u0002\u0002\u08d0\u08a0\u0003\u0002\u0002\u0002\u08d0\u08a7\u0003\u0002\u0002\u0002\u08d0\u08ad\u0003\u0002\u0002\u0002\u08d0\u08b4\u0003\u0002\u0002\u0002\u08d0\u08ba\u0003\u0002\u0002\u0002\u08d0\u08c5\u0003\u0002\u0002\u0002\u08d1\u0161\u0003\u0002\u0002\u0002\u08d2\u08d3\u0005\u0166\u00b4\u0002\u08d3\u08d5\u0007\u0061\u0002\u0002\u08d4\u08d6\u0005\u0168\u00b5\u0002\u08d5\u08d4\u0003\u0002\u0002\u0002\u08d5\u08d6\u0003\u0002\u0002\u0002\u08d6\u08d7\u0003\u0002\u0002\u0002\u08d7\u08d8\u0007\u0062\u0002\u0002\u08d8\u0163\u0003\u0002\u0002\u0002\u08d9\u08e9\u0005\u0162\u00b2\u0002\u08da\u08db\u0005\u0156\u00ac\u0002\u08db\u08dd\u0007\u0061\u0002\u0002\u08dc\u08de\u0005\u0168\u00b5\u0002\u08dd\u08dc\u0003\u0002\u0002\u0002\u08dd\u08de\u0003\u0002\u0002\u0002\u08de\u08df\u0003\u0002\u0002\u0002\u08df\u08e0\u0007\u0062\u0002\u0002\u08e0\u08e9\u0003\u0002\u0002\u0002\u08e1\u08e2\u0005\u0158\u00ad\u0002\u08e2\u08e4\u0007\u0061\u0002\u0002\u08e3\u08e5\u0005\u0168\u00b5\u0002\u08e4\u08e3\u0003\u0002\u0002\u0002\u08e4\u08e5\u0003\u0002\u0002\u0002\u08e5\u08e6\u0003\u0002\u0002\u0002\u08e6\u08e7\u0007\u0062\u0002\u0002\u08e7\u08e9\u0003\u0002\u0002\u0002\u08e8\u08d9\u0003\u0002\u0002\u0002\u08e8\u08da\u0003\u0002\u0002\u0002\u08e8\u08e1\u0003\u0002\u0002\u0002\u08e9\u0165\u0003\u0002\u0002\u0002\u08ea\u08eb\u0007\u007f\u0002\u0002\u08eb\u0167\u0003\u0002\u0002\u0002\u08ec\u08ed\u0008\u00b5\u0001\u0002\u08ed\u08ef\u0005\u016a\u00b6\u0002\u08ee\u08f0\u0007\u007e\u0002\u0002\u08ef\u08ee\u0003\u0002\u0002\u0002\u08ef\u08f0\u0003\u0002\u0002\u0002\u08f0\u08f9\u0003\u0002\u0002\u0002\u08f1\u08f2\u000c\u0003\u0002\u0002\u08f2\u08f3\u0007\u0075\u0002\u0002\u08f3\u08f5\u0005\u016a\u00b6\u0002\u08f4\u08f6\u0007\u007e\u0002\u0002\u08f5\u08f4\u0003\u0002\u0002\u0002\u08f5\u08f6\u0003\u0002\u0002\u0002\u08f6\u08f8\u0003\u0002\u0002\u0002\u08f7\u08f1\u0003\u0002\u0002\u0002\u08f8\u08fb\u0003\u0002\u0002\u0002\u08f9\u08f7\u0003\u0002\u0002\u0002\u08f9\u08fa\u0003\u0002\u0002\u0002\u08fa\u0169\u0003\u0002\u0002\u0002\u08fb\u08f9\u0003\u0002\u0002\u0002\u08fc\u0900\u0005\u0102\u0082\u0002\u08fd\u0900\u0005\u005e\u0030\u0002\u08fe\u0900\u0005\u0006\u0004\u0002\u08ff\u08fc\u0003\u0002\u0002\u0002\u08ff\u08fd\u0003\u0002\u0002\u0002\u08ff\u08fe\u0003\u0002\u0002\u0002\u0900\u016b\u0003\u0002\u0002\u0002\u0901\u0902\u0007\u0047\u0002\u0002\u0902\u0903\u0005\u000c\u0007\u0002\u0903\u0904\u0007\u007f\u0002\u0002\u0904\u090d\u0003\u0002\u0002\u0002\u0905\u0906\u0007\u0047\u0002\u0002\u0906\u0908\u0005\u000c\u0007\u0002\u0907\u0909\u0007\u003f\u0002\u0002\u0908\u0907\u0003\u0002\u0002\u0002\u0908\u0909\u0003\u0002\u0002\u0002\u0909\u090a\u0003\u0002\u0002\u0002\u090a\u090b\u0005\u0162\u00b2\u0002\u090b\u090d\u0003\u0002\u0002\u0002\u090c\u0901\u0003\u0002\u0002\u0002\u090c\u0905\u0003\u0002\u0002\u0002\u090d\u016d\u0003\u0002\u0002\u0002\u090e\u0910\u0007\u001f\u0002\u0002\u090f\u090e\u0003\u0002\u0002\u0002\u090f\u0910\u0003\u0002\u0002\u0002\u0910\u0911\u0003\u0002\u0002\u0002\u0911\u0912\u0007\u003f\u0002\u0002\u0912\u0913\u0005\u007c\u003f\u0002\u0913\u016f\u0003\u0002\u0002\u0002\u0914\u0915\u0007\u003f\u0002\u0002\u0915\u0916\u0007\u0061\u0002\u0002\u0916\u0917\u0007\u0062\u0002\u0002\u0917\u0918\u0005\u007c\u003f\u0002\u0918\u0171\u0003\u0002\u0002\u0002\u0919\u091a\u0007\u0044\u0002\u0002\u091a\u091b\u0005\u0066\u0034\u0002\u091b\u091c\u0005\u0176\u00bc\u0002\u091c\u0173\u0003\u0002\u0002\u0002\u091d\u091f\u0007\u0044\u0002\u0002\u091e\u0920\u0005\u014e\u00a8\u0002\u091f\u091e\u0003\u0002\u0002\u0002\u091f\u0920\u0003\u0002\u0002\u0002\u0920\u0921\u0003\u0002\u0002\u0002\u0921\u0922\u0005\u0066\u0034\u0002\u0922\u0923\u0005\u0176\u00bc\u0002\u0923\u0175\u0003\u0002\u0002\u0002\u0924\u0926\u0005\u0178\u00bd\u0002\u0925\u0927\u0005\u0176\u00bc\u0002\u0926\u0925\u0003\u0002\u0002\u0002\u0926\u0927\u0003\u0002\u0002\u0002\u0927\u0177\u0003\u0002\u0002\u0002\u0928\u0929\u0007\u000c\u0002\u0002\u0929\u092a\u0007\u0050\u0002\u0002\u092a\u092b\u0005\u017a\u00be\u0002\u092b\u092c\u0007\u0051\u0002\u0002\u092c\u092d\u0005\u0066\u0034\u0002\u092d\u0179\u0003\u0002\u0002\u0002\u092e\u0930\u0005\u00d4\u006b\u0002\u092f\u092e\u0003\u0002\u0002\u0002\u092f\u0930\u0003\u0002\u0002\u0002\u0930\u0931\u0003\u0002\u0002\u0002\u0931\u0932\u0005\u0098\u004d\u0002\u0932\u0933\u0005\u00ee\u0078\u0002\u0933\u093d\u0003\u0002\u0002\u0002\u0934\u0936\u0005\u00d4\u006b\u0002\u0935\u0934\u0003\u0002\u0002\u0002\u0935\u0936\u0003\u0002\u0002\u0002\u0936\u0937\u0003\u0002\u0002\u0002\u0937\u0939\u0005\u0098\u004d\u0002\u0938\u093a\u0005\u0104\u0083\u0002\u0939\u0938\u0003\u0002\u0002\u0002\u0939\u093a\u0003\u0002\u0002\u0002\u093a\u093d\u0003\u0002\u0002\u0002\u093b\u093d\u0007\u007e\u0002\u0002\u093c\u092f\u0003\u0002\u0002\u0002\u093c\u0935\u0003\u0002\u0002\u0002\u093c\u093b\u0003\u0002\u0002\u0002\u093d\u017b\u0003\u0002\u0002\u0002\u093e\u0940\u0007\u0042\u0002\u0002\u093f\u0941\u0005\u0058\u002d\u0002\u0940\u093f\u0003\u0002\u0002\u0002\u0940\u0941\u0003\u0002\u0002\u0002\u0941\u017d\u0003\u0002\u0002\u0002\u0942\u0945\u0005\u0180\u00c1\u0002\u0943\u0945\u0005\u0184\u00c3\u0002\u0944\u0942\u0003\u0002\u0002\u0002\u0944\u0943\u0003\u0002\u0002\u0002\u0945\u017f\u0003\u0002\u0002\u0002\u0946\u0947\u0007\u0042\u0002\u0002\u0947\u0949\u0007\u0050\u0002\u0002\u0948\u094a\u0005\u0182\u00c2\u0002\u0949\u0948\u0003\u0002\u0002\u0002\u0949\u094a\u0003\u0002\u0002\u0002\u094a\u094b\u0003\u0002\u0002\u0002\u094b\u094c\u0007\u0051\u0002\u0002\u094c\u0181\u0003\u0002\u0002\u0002\u094d\u094e\u0008\u00c2\u0001\u0002\u094e\u0950\u0005\u0102\u0082\u0002\u094f\u0951\u0007\u007e\u0002\u0002\u0950\u094f\u0003\u0002\u0002\u0002\u0950\u0951\u0003\u0002\u0002\u0002\u0951\u095a\u0003\u0002\u0002\u0002\u0952\u0953\u000c\u0003\u0002\u0002\u0953\u0954\u0007\u0075\u0002\u0002\u0954\u0956\u0005\u0102\u0082\u0002\u0955\u0957\u0007\u007e\u0002\u0002\u0956\u0955\u0003\u0002\u0002\u0002\u0956\u0957\u0003\u0002\u0002\u0002\u0957\u0959\u0003\u0002\u0002\u0002\u0958\u0952\u0003\u0002\u0002\u0002\u0959\u095c\u0003\u0002\u0002\u0002\u095a\u0958\u0003\u0002\u0002\u0002\u095a\u095b\u0003\u0002\u0002\u0002\u095b\u0183\u0003\u0002\u0002\u0002\u095c\u095a\u0003\u0002\u0002\u0002\u095d\u095e\u0007\u002d\u0002\u0002\u095e\u095f\u0007\u0050\u0002\u0002\u095f\u0960\u0005\u005e\u0030\u0002\u0960\u0961\u0007\u0051\u0002\u0002\u0961\u0964\u0003\u0002\u0002\u0002\u0962\u0964\u0007\u002d\u0002\u0002\u0963\u095d\u0003\u0002\u0002\u0002\u0963\u0962\u0003\u0002\u0002\u0002\u0964\u0185\u0003\u0002\u0002\u0002\u0965\u0966\u0007\u0062\u0002\u0002\u0966\u0967\u0007\u0062\u0002\u0002\u0967\u0187\u0003\u0002\u0002\u0002\u0968\u0969\u0007\u0062\u0002\u0002\u0969\u096a\u0007\u0062\u0002\u0002\u096a\u096b\u0007\u0060\u0002\u0002\u096b\u0189\u0003\u0002\u0002\u0002\u096c\u099d\u0007\u002c\u0002\u0002\u096d\u099d\u0007\u0017\u0002\u0002\u096e\u096f\u0007\u002c\u0002\u0002\u096f\u0970\u0007\u0052\u0002\u0002\u0970\u099d\u0007\u0053\u0002\u0002\u0971\u0972\u0007\u0017\u0002\u0002\u0972\u0973\u0007\u0052\u0002\u0002\u0973\u099d\u0007\u0053\u0002\u0002\u0974\u099d\u0007\u0056\u0002\u0002\u0975\u099d\u0007\u0057\u0002\u0002\u0976\u099d\u0007\u0058\u0002\u0002\u0977\u099d\u0007\u0059\u0002\u0002\u0978\u099d\u0007\u005a\u0002\u0002\u0979\u099d\u0007\u005b\u0002\u0002\u097a\u099d\u0007\u005c\u0002\u0002\u097b\u099d\u0007\u005d\u0002\u0002\u097c\u099d\u0007\u005e\u0002\u0002\u097d\u099d\u0007\u005f\u0002\u0002\u097e\u099d\u0007\u0060\u0002\u0002\u097f\u099d\u0007\u0061\u0002\u0002\u0980\u099d\u0007\u0062\u0002\u0002\u0981\u099d\u0007\u0063\u0002\u0002\u0982\u099d\u0007\u0064\u0002\u0002\u0983\u099d\u0007\u0065\u0002\u0002\u0984\u099d\u0007\u0066\u0002\u0002\u0985\u099d\u0007\u0067\u0002\u0002\u0986\u099d\u0007\u0068\u0002\u0002\u0987\u099d\u0007\u0069\u0002\u0002\u0988\u099d\u0007\u006a\u0002\u0002\u0989\u099d\u0007\u006b\u0002\u0002\u098a\u099d\u0005\u0186\u00c4\u0002\u098b\u099d\u0005\u0188\u00c5\u0002\u098c\u099d\u0007\u006c\u0002\u0002\u098d\u099d\u0007\u006d\u0002\u0002\u098e\u099d\u0007\u006e\u0002\u0002\u098f\u099d\u0007\u006f\u0002\u0002\u0990\u099d\u0007\u0070\u0002\u0002\u0991\u099d\u0007\u0071\u0002\u0002\u0992\u099d\u0007\u0072\u0002\u0002\u0993\u099d\u0007\u0073\u0002\u0002\u0994\u099d\u0007\u0074\u0002\u0002\u0995\u099d\u0007\u0075\u0002\u0002\u0996\u099d\u0007\u0076\u0002\u0002\u0997\u099d\u0007\u0077\u0002\u0002\u0998\u0999\u0007\u0050\u0002\u0002\u0999\u099d\u0007\u0051\u0002\u0002\u099a\u099b\u0007\u0052\u0002\u0002\u099b\u099d\u0007\u0053\u0002\u0002\u099c\u096c\u0003\u0002\u0002\u0002\u099c\u096d\u0003\u0002\u0002\u0002\u099c\u096e\u0003\u0002\u0002\u0002\u099c\u0971\u0003\u0002\u0002\u0002\u099c\u0974\u0003\u0002\u0002\u0002\u099c\u0975\u0003\u0002\u0002\u0002";
        private const val serializedATNSegment1 : String =
        	"\u099c\u0976\u0003\u0002\u0002\u0002\u099c\u0977\u0003\u0002\u0002\u0002\u099c\u0978\u0003\u0002\u0002\u0002\u099c\u0979\u0003\u0002\u0002\u0002\u099c\u097a\u0003\u0002\u0002\u0002\u099c\u097b\u0003\u0002\u0002\u0002\u099c\u097c\u0003\u0002\u0002\u0002\u099c\u097d\u0003\u0002\u0002\u0002\u099c\u097e\u0003\u0002\u0002\u0002\u099c\u097f\u0003\u0002\u0002\u0002\u099c\u0980\u0003\u0002\u0002\u0002\u099c\u0981\u0003\u0002\u0002\u0002\u099c\u0982\u0003\u0002\u0002\u0002\u099c\u0983\u0003\u0002\u0002\u0002\u099c\u0984\u0003\u0002\u0002\u0002\u099c\u0985\u0003\u0002\u0002\u0002\u099c\u0986\u0003\u0002\u0002\u0002\u099c\u0987\u0003\u0002\u0002\u0002\u099c\u0988\u0003\u0002\u0002\u0002\u099c\u0989\u0003\u0002\u0002\u0002\u099c\u098a\u0003\u0002\u0002\u0002\u099c\u098b\u0003\u0002\u0002\u0002\u099c\u098c\u0003\u0002\u0002\u0002\u099c\u098d\u0003\u0002\u0002\u0002\u099c\u098e\u0003\u0002\u0002\u0002\u099c\u098f\u0003\u0002\u0002\u0002\u099c\u0990\u0003\u0002\u0002\u0002\u099c\u0991\u0003\u0002\u0002\u0002\u099c\u0992\u0003\u0002\u0002\u0002\u099c\u0993\u0003\u0002\u0002\u0002\u099c\u0994\u0003\u0002\u0002\u0002\u099c\u0995\u0003\u0002\u0002\u0002\u099c\u0996\u0003\u0002\u0002\u0002\u099c\u0997\u0003\u0002\u0002\u0002\u099c\u0998\u0003\u0002\u0002\u0002\u099c\u099a\u0003\u0002\u0002\u0002\u099d\u018b\u0003\u0002\u0002\u0002\u099e\u09a6\u0007\u0080\u0002\u0002\u099f\u09a6\u0007\u0086\u0002\u0002\u09a0\u09a6\u0007\u0087\u0002\u0002\u09a1\u09a6\u0007\u0088\u0002\u0002\u09a2\u09a6\u0005\u018e\u00c8\u0002\u09a3\u09a6\u0005\u0190\u00c9\u0002\u09a4\u09a6\u0005\u0192\u00ca\u0002\u09a5\u099e\u0003\u0002\u0002\u0002\u09a5\u099f\u0003\u0002\u0002\u0002\u09a5\u09a0\u0003\u0002\u0002\u0002\u09a5\u09a1\u0003\u0002\u0002\u0002\u09a5\u09a2\u0003\u0002\u0002\u0002\u09a5\u09a3\u0003\u0002\u0002\u0002\u09a5\u09a4\u0003\u0002\u0002\u0002\u09a6\u018d\u0003\u0002\u0002\u0002\u09a7\u09a8\u0009\u000b\u0002\u0002\u09a8\u018f\u0003\u0002\u0002\u0002\u09a9\u09aa\u0007\u002e\u0002\u0002\u09aa\u0191\u0003\u0002\u0002\u0002\u09ab\u09ac\u0009\u000c\u0002\u0002\u09ac\u0193\u0003\u0002\u0002\u0002\u013d\u0195\u01a1\u01a5\u01b0\u01b4\u01c3\u01ca\u01cf\u01d1\u01d6\u01dc\u01e6\u01ed\u01f3\u01f7\u01fc\u0202\u0209\u020f\u0212\u0215\u0218\u021f\u0226\u025a\u0269\u026f\u0275\u0282\u0284\u028e\u029d\u02a3\u02c1\u02c6\u02ca\u02ce\u02d1\u02d5\u02db\u02dd\u02e5\u02e9\u02ec\u02f3\u02fa\u02fe\u0303\u0307\u030a\u030f\u0315\u0322\u032d\u032f\u033e\u0340\u034c\u034e\u035b\u035d\u036f\u0371\u037d\u037f\u038a\u0395\u03a0\u03ab\u03b6\u03c0\u03c8\u03d5\u03df\u03e6\u03ea\u03ee\u03f2\u03f6\u03fb\u03fe\u0401\u0407\u040f\u0414\u0417\u041d\u0428\u043f\u0443\u044b\u0451\u0465\u0469\u0476\u047a\u047d\u0484\u048c\u0496\u04a1\u04ad\u04b7\u04bc\u04c3\u04c6\u04cb\u04d0\u04e5\u04e9\u04ee\u04f9\u04ff\u0503\u0508\u050c\u0511\u0514\u052a\u0530\u053b\u053f\u0542\u054c\u0552\u0555\u055c\u0566\u056a\u056d\u0570\u0574\u0579\u057b\u057f\u0583\u058c\u0599\u05a1\u05a7\u05ad\u05b1\u05b4\u05bd\u05c6\u05ce\u05d9\u05df\u05ea\u05ed\u05f2\u0601\u0607\u0610\u061a\u0620\u0628\u062c\u0630\u0635\u063a\u0641\u0643\u0648\u064c\u065a\u0660\u066f\u0679\u067e\u0685\u068b\u0690\u0696\u069d\u06a1\u06a3\u06a5\u06ac\u06af\u06b2\u06b5\u06ba\u06be\u06c1\u06c5\u06c9\u06ce\u06d1\u06d3\u06d7\u06de\u06e4\u06e8\u06ee\u06f3\u06f5\u06fb\u06ff\u0705\u070c\u0710\u0712\u0714\u071b\u0725\u0729\u072b\u072d\u0731\u0734\u073a\u0744\u0748\u074e\u0756\u075a\u075d\u0761\u0766\u0769\u076c\u0770\u0775\u077f\u0786\u078b\u078f\u0794\u079a\u079e\u07a4\u07aa\u07ae\u07b3\u07b9\u07bd\u07c0\u07c4\u07c7\u07c9\u07cc\u07d6\u07db\u07dd\u07e0\u07e3\u07e6\u07ef\u07f9\u07fe\u0801\u0805\u0808\u080b\u080f\u0818\u0827\u082d\u0831\u0835\u0839\u083d\u0841\u0845\u0849\u084c\u0850\u085b\u085f\u0866\u086a\u086f\u0874\u087b\u087f\u0889\u0899\u089e\u08a2\u08a5\u08a9\u08af\u08b2\u08b6\u08c0\u08c3\u08cb\u08d0\u08d5\u08dd\u08e4\u08e8\u08ef\u08f5\u08f9\u08ff\u0908\u090c\u090f\u091f\u0926\u092f\u0935\u0939\u093c\u0940\u0944\u0949\u0950\u0956\u095a\u0963\u099c\u09a5";
        private val serializedATN : String = Utils.join(
        	listOf(serializedATNSegment0,
        serializedATNSegment1).iterator(),
        	""
        )
        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val MultiLineMacro = Tokens.MultiLineMacro.id
    private val Directive = Tokens.Directive.id
    private val Alignas = Tokens.Alignas.id
    private val Alignof = Tokens.Alignof.id
    private val Asm = Tokens.Asm.id
    private val Auto = Tokens.Auto.id
    private val Bool = Tokens.Bool.id
    private val Break = Tokens.Break.id
    private val Case = Tokens.Case.id
    private val Catch = Tokens.Catch.id
    private val Char = Tokens.Char.id
    private val Char16 = Tokens.Char16.id
    private val Char32 = Tokens.Char32.id
    private val Class = Tokens.Class.id
    private val Const = Tokens.Const.id
    private val Constexpr = Tokens.Constexpr.id
    private val Const_cast = Tokens.Const_cast.id
    private val Continue = Tokens.Continue.id
    private val Decltype = Tokens.Decltype.id
    private val Default = Tokens.Default.id
    private val Delete = Tokens.Delete.id
    private val Do = Tokens.Do.id
    private val Double = Tokens.Double.id
    private val Dynamic_cast = Tokens.Dynamic_cast.id
    private val Else = Tokens.Else.id
    private val Enum = Tokens.Enum.id
    private val Explicit = Tokens.Explicit.id
    private val Export = Tokens.Export.id
    private val Extern = Tokens.Extern.id
    private val False = Tokens.False.id
    private val Final = Tokens.Final.id
    private val Float = Tokens.Float.id
    private val For = Tokens.For.id
    private val Friend = Tokens.Friend.id
    private val Goto = Tokens.Goto.id
    private val If = Tokens.If.id
    private val Inline = Tokens.Inline.id
    private val Int = Tokens.Int.id
    private val Long = Tokens.Long.id
    private val Mutable = Tokens.Mutable.id
    private val Namespace = Tokens.Namespace.id
    private val New = Tokens.New.id
    private val Noexcept = Tokens.Noexcept.id
    private val Nullptr = Tokens.Nullptr.id
    private val Operator = Tokens.Operator.id
    private val Override = Tokens.Override.id
    private val Private = Tokens.Private.id
    private val Protected = Tokens.Protected.id
    private val Public = Tokens.Public.id
    private val Register = Tokens.Register.id
    private val Reinterpret_cast = Tokens.Reinterpret_cast.id
    private val Return = Tokens.Return.id
    private val Short = Tokens.Short.id
    private val Signed = Tokens.Signed.id
    private val Sizeof = Tokens.Sizeof.id
    private val Static = Tokens.Static.id
    private val Static_assert = Tokens.Static_assert.id
    private val Static_cast = Tokens.Static_cast.id
    private val Struct = Tokens.Struct.id
    private val Switch = Tokens.Switch.id
    private val Template = Tokens.Template.id
    private val This = Tokens.This.id
    private val Thread_local = Tokens.Thread_local.id
    private val Throw = Tokens.Throw.id
    private val True = Tokens.True.id
    private val Try = Tokens.Try.id
    private val Typedef = Tokens.Typedef.id
    private val Typeid = Tokens.Typeid.id
    private val Typename = Tokens.Typename.id
    private val Union = Tokens.Union.id
    private val Unsigned = Tokens.Unsigned.id
    private val Using = Tokens.Using.id
    private val Virtual = Tokens.Virtual.id
    private val Void = Tokens.Void.id
    private val Volatile = Tokens.Volatile.id
    private val Wchar = Tokens.Wchar.id
    private val While = Tokens.While.id
    private val LeftParen = Tokens.LeftParen.id
    private val RightParen = Tokens.RightParen.id
    private val LeftBracket = Tokens.LeftBracket.id
    private val RightBracket = Tokens.RightBracket.id
    private val LeftBrace = Tokens.LeftBrace.id
    private val RightBrace = Tokens.RightBrace.id
    private val Plus = Tokens.Plus.id
    private val Minus = Tokens.Minus.id
    private val Star = Tokens.Star.id
    private val Div = Tokens.Div.id
    private val Mod = Tokens.Mod.id
    private val Caret = Tokens.Caret.id
    private val And = Tokens.And.id
    private val Or = Tokens.Or.id
    private val Tilde = Tokens.Tilde.id
    private val Not = Tokens.Not.id
    private val Assign = Tokens.Assign.id
    private val Less = Tokens.Less.id
    private val Greater = Tokens.Greater.id
    private val PlusAssign = Tokens.PlusAssign.id
    private val MinusAssign = Tokens.MinusAssign.id
    private val StarAssign = Tokens.StarAssign.id
    private val DivAssign = Tokens.DivAssign.id
    private val ModAssign = Tokens.ModAssign.id
    private val XorAssign = Tokens.XorAssign.id
    private val AndAssign = Tokens.AndAssign.id
    private val OrAssign = Tokens.OrAssign.id
    private val LeftShift = Tokens.LeftShift.id
    private val LeftShiftAssign = Tokens.LeftShiftAssign.id
    private val Equal = Tokens.Equal.id
    private val NotEqual = Tokens.NotEqual.id
    private val LessEqual = Tokens.LessEqual.id
    private val GreaterEqual = Tokens.GreaterEqual.id
    private val AndAnd = Tokens.AndAnd.id
    private val OrOr = Tokens.OrOr.id
    private val PlusPlus = Tokens.PlusPlus.id
    private val MinusMinus = Tokens.MinusMinus.id
    private val Comma = Tokens.Comma.id
    private val ArrowStar = Tokens.ArrowStar.id
    private val Arrow = Tokens.Arrow.id
    private val Question = Tokens.Question.id
    private val Colon = Tokens.Colon.id
    private val Doublecolon = Tokens.Doublecolon.id
    private val Semi = Tokens.Semi.id
    private val Dot = Tokens.Dot.id
    private val DotStar = Tokens.DotStar.id
    private val Ellipsis = Tokens.Ellipsis.id
    private val Identifier = Tokens.Identifier.id
    private val Integerliteral = Tokens.Integerliteral.id
    private val Decimalliteral = Tokens.Decimalliteral.id
    private val Octalliteral = Tokens.Octalliteral.id
    private val Hexadecimalliteral = Tokens.Hexadecimalliteral.id
    private val Binaryliteral = Tokens.Binaryliteral.id
    private val Integersuffix = Tokens.Integersuffix.id
    private val Characterliteral = Tokens.Characterliteral.id
    private val Floatingliteral = Tokens.Floatingliteral.id
    private val Stringliteral = Tokens.Stringliteral.id
    private val Userdefinedintegerliteral = Tokens.Userdefinedintegerliteral.id
    private val Userdefinedfloatingliteral = Tokens.Userdefinedfloatingliteral.id
    private val Userdefinedstringliteral = Tokens.Userdefinedstringliteral.id
    private val Userdefinedcharacterliteral = Tokens.Userdefinedcharacterliteral.id
    private val Whitespace = Tokens.Whitespace.id
    private val Newline = Tokens.Newline.id
    private val BlockComment = Tokens.BlockComment.id
    private val LineComment = Tokens.LineComment.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class TranslationunitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_translationunit.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(CPP14Parser.Tokens.EOF.id, 0)
		fun findDeclarationseq() : DeclarationseqContext? = getRuleContext(solver.getType("DeclarationseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTranslationunit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTranslationunit(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTranslationunit(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  translationunit() : TranslationunitContext {
		var _localctx : TranslationunitContext = TranslationunitContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_translationunit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 403
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Asm) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Namespace) or (1L shl Operator) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 402
				declarationseq(0)
				}
			}

			this.state = 405
			match(EOF) as Token
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

	open class PrimaryexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primaryexpression.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun This() : TerminalNode? = getToken(CPP14Parser.Tokens.This.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findIdexpression() : IdexpressionContext? = getRuleContext(solver.getType("IdexpressionContext"),0)
		fun findLambdaexpression() : LambdaexpressionContext? = getRuleContext(solver.getType("LambdaexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPrimaryexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPrimaryexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPrimaryexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  primaryexpression() : PrimaryexpressionContext {
		var _localctx : PrimaryexpressionContext = PrimaryexpressionContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_primaryexpression.id)
		try {
			this.state = 415
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			False , Nullptr , True , Integerliteral , Characterliteral , Floatingliteral , Stringliteral , Userdefinedintegerliteral , Userdefinedfloatingliteral , Userdefinedstringliteral , Userdefinedcharacterliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 407
			literal()
			}}
			This  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 408
			match(This) as Token
			}}
			LeftParen  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 409
			match(LeftParen) as Token
			this.state = 410
			expression(0)
			this.state = 411
			match(RightParen) as Token
			}}
			Decltype , Operator , Tilde , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 413
			idexpression()
			}}
			LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 414
			lambdaexpression()
			}}
			else -> throw NoViableAltException(this)
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

	open class IdexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_idexpression.id
	        set(value) { throw RuntimeException() }
		fun findUnqualifiedid() : UnqualifiedidContext? = getRuleContext(solver.getType("UnqualifiedidContext"),0)
		fun findQualifiedid() : QualifiedidContext? = getRuleContext(solver.getType("QualifiedidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterIdexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitIdexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitIdexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  idexpression() : IdexpressionContext {
		var _localctx : IdexpressionContext = IdexpressionContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_idexpression.id)
		try {
			this.state = 419
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 417
			unqualifiedid()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 418
			qualifiedid()
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

	open class UnqualifiedidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unqualifiedid.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findOperatorfunctionid() : OperatorfunctionidContext? = getRuleContext(solver.getType("OperatorfunctionidContext"),0)
		fun findConversionfunctionid() : ConversionfunctionidContext? = getRuleContext(solver.getType("ConversionfunctionidContext"),0)
		fun findLiteraloperatorid() : LiteraloperatoridContext? = getRuleContext(solver.getType("LiteraloperatoridContext"),0)
		fun findClassname() : ClassnameContext? = getRuleContext(solver.getType("ClassnameContext"),0)
		fun findDecltypespecifier() : DecltypespecifierContext? = getRuleContext(solver.getType("DecltypespecifierContext"),0)
		fun findTemplateid() : TemplateidContext? = getRuleContext(solver.getType("TemplateidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUnqualifiedid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUnqualifiedid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUnqualifiedid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unqualifiedid() : UnqualifiedidContext {
		var _localctx : UnqualifiedidContext = UnqualifiedidContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_unqualifiedid.id)
		try {
			this.state = 430
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 421
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 422
			operatorfunctionid()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 423
			conversionfunctionid()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 424
			literaloperatorid()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 425
			match(Tilde) as Token
			this.state = 426
			classname()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 427
			match(Tilde) as Token
			this.state = 428
			decltypespecifier()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 429
			templateid()
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

	open class QualifiedidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_qualifiedid.id
	        set(value) { throw RuntimeException() }
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun findUnqualifiedid() : UnqualifiedidContext? = getRuleContext(solver.getType("UnqualifiedidContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterQualifiedid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitQualifiedid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitQualifiedid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  qualifiedid() : QualifiedidContext {
		var _localctx : QualifiedidContext = QualifiedidContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_qualifiedid.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 432
			nestednamespecifier(0)
			this.state = 434
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Template) {
				if (true){
				this.state = 433
				match(Template) as Token
				}
			}

			this.state = 436
			unqualifiedid()
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

	open class NestednamespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_nestednamespecifier.id
	        set(value) { throw RuntimeException() }
		fun findThetypename() : ThetypenameContext? = getRuleContext(solver.getType("ThetypenameContext"),0)
		fun findNamespacename() : NamespacenameContext? = getRuleContext(solver.getType("NamespacenameContext"),0)
		fun findDecltypespecifier() : DecltypespecifierContext? = getRuleContext(solver.getType("DecltypespecifierContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNestednamespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNestednamespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNestednamespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun nestednamespecifier() : NestednamespecifierContext {
		return nestednamespecifier(0);
	}

	private fun nestednamespecifier(_p: Int) : NestednamespecifierContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : NestednamespecifierContext= NestednamespecifierContext(context, _parentState)
		var _prevctx : NestednamespecifierContext= _localctx
		var _startState : Int = 10
		enterRecursionRule(_localctx, 10, Rules.RULE_nestednamespecifier.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 449
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {if (true){
			this.state = 439
			match(Doublecolon) as Token
			}}
			2 -> {if (true){
			this.state = 440
			thetypename()
			this.state = 441
			match(Doublecolon) as Token
			}}
			3 -> {if (true){
			this.state = 443
			namespacename()
			this.state = 444
			match(Doublecolon) as Token
			}}
			4 -> {if (true){
			this.state = 446
			decltypespecifier()
			this.state = 447
			match(Doublecolon) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 463
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 461
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
					1 -> {if (true){
					_localctx = NestednamespecifierContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_nestednamespecifier.id)
					this.state = 451
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 452
					match(Identifier) as Token
					this.state = 453
					match(Doublecolon) as Token
					}}
					2 -> {if (true){
					_localctx = NestednamespecifierContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_nestednamespecifier.id)
					this.state = 454
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 456
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==Template) {
						if (true){
						this.state = 455
						match(Template) as Token
						}
					}

					this.state = 458
					simpletemplateid()
					this.state = 459
					match(Doublecolon) as Token
					}}
					}
					} 
				}
				this.state = 465
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class LambdaexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambdaexpression.id
	        set(value) { throw RuntimeException() }
		fun findLambdaintroducer() : LambdaintroducerContext? = getRuleContext(solver.getType("LambdaintroducerContext"),0)
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		fun findLambdadeclarator() : LambdadeclaratorContext? = getRuleContext(solver.getType("LambdadeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLambdaexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLambdaexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLambdaexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lambdaexpression() : LambdaexpressionContext {
		var _localctx : LambdaexpressionContext = LambdaexpressionContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_lambdaexpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 466
			lambdaintroducer()
			this.state = 468
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LeftParen) {
				if (true){
				this.state = 467
				lambdadeclarator()
				}
			}

			this.state = 470
			compoundstatement()
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

	open class LambdaintroducerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambdaintroducer.id
	        set(value) { throw RuntimeException() }
		fun findLambdacapture() : LambdacaptureContext? = getRuleContext(solver.getType("LambdacaptureContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLambdaintroducer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLambdaintroducer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLambdaintroducer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lambdaintroducer() : LambdaintroducerContext {
		var _localctx : LambdaintroducerContext = LambdaintroducerContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_lambdaintroducer.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 472
			match(LeftBracket) as Token
			this.state = 474
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (((((_la - 62)) and 0x3f.inv()) == 0 && ((1L shl (_la - 62)) and ((1L shl (This - 62)) or (1L shl (And - 62)) or (1L shl (Assign - 62)) or (1L shl (Identifier - 62)))) != 0L)) {
				if (true){
				this.state = 473
				lambdacapture()
				}
			}

			this.state = 476
			match(RightBracket) as Token
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

	open class LambdacaptureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambdacapture.id
	        set(value) { throw RuntimeException() }
		fun findCapturedefault() : CapturedefaultContext? = getRuleContext(solver.getType("CapturedefaultContext"),0)
		fun findCapturelist() : CapturelistContext? = getRuleContext(solver.getType("CapturelistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLambdacapture(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLambdacapture(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLambdacapture(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lambdacapture() : LambdacaptureContext {
		var _localctx : LambdacaptureContext = LambdacaptureContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_lambdacapture.id)
		try {
			this.state = 484
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,11,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 478
			capturedefault()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 479
			capturelist(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 480
			capturedefault()
			this.state = 481
			match(Comma) as Token
			this.state = 482
			capturelist(0)
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

	open class CapturedefaultContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_capturedefault.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCapturedefault(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCapturedefault(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCapturedefault(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  capturedefault() : CapturedefaultContext {
		var _localctx : CapturedefaultContext = CapturedefaultContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_capturedefault.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 486
			_la = _input!!.LA(1)
			if ( !(_la==And || _la==Assign) ) {
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

	open class CapturelistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_capturelist.id
	        set(value) { throw RuntimeException() }
		fun findCapture() : CaptureContext? = getRuleContext(solver.getType("CaptureContext"),0)
		fun findCapturelist() : CapturelistContext? = getRuleContext(solver.getType("CapturelistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCapturelist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCapturelist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCapturelist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun capturelist() : CapturelistContext {
		return capturelist(0);
	}

	private fun capturelist(_p: Int) : CapturelistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : CapturelistContext= CapturelistContext(context, _parentState)
		var _prevctx : CapturelistContext= _localctx
		var _startState : Int = 20
		enterRecursionRule(_localctx, 20, Rules.RULE_capturelist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 489
			capture()
			this.state = 491
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1   -> if (true){
			this.state = 490
			match(Ellipsis) as Token
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 501
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = CapturelistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_capturelist.id)
					this.state = 493
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 494
					match(Comma) as Token
					this.state = 495
					capture()
					this.state = 497
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
					1   -> if (true){
					this.state = 496
					match(Ellipsis) as Token
					}
					}
					}
					} 
				}
				this.state = 503
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class CaptureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_capture.id
	        set(value) { throw RuntimeException() }
		fun findSimplecapture() : SimplecaptureContext? = getRuleContext(solver.getType("SimplecaptureContext"),0)
		fun findInitcapture() : InitcaptureContext? = getRuleContext(solver.getType("InitcaptureContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCapture(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCapture(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCapture(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  capture() : CaptureContext {
		var _localctx : CaptureContext = CaptureContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_capture.id)
		try {
			this.state = 506
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 504
			simplecapture()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 505
			initcapture()
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

	open class SimplecaptureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simplecapture.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun This() : TerminalNode? = getToken(CPP14Parser.Tokens.This.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterSimplecapture(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitSimplecapture(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitSimplecapture(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simplecapture() : SimplecaptureContext {
		var _localctx : SimplecaptureContext = SimplecaptureContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_simplecapture.id)
		try {
			this.state = 512
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 508
			match(Identifier) as Token
			}}
			And  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 509
			match(And) as Token
			this.state = 510
			match(Identifier) as Token
			}}
			This  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 511
			match(This) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class InitcaptureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initcapture.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findInitializer() : InitializerContext? = getRuleContext(solver.getType("InitializerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitcapture(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitcapture(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitcapture(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  initcapture() : InitcaptureContext {
		var _localctx : InitcaptureContext = InitcaptureContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_initcapture.id)
		try {
			this.state = 519
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 514
			match(Identifier) as Token
			this.state = 515
			initializer()
			}}
			And  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 516
			match(And) as Token
			this.state = 517
			match(Identifier) as Token
			this.state = 518
			initializer()
			}}
			else -> throw NoViableAltException(this)
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

	open class LambdadeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambdadeclarator.id
	        set(value) { throw RuntimeException() }
		fun findParameterdeclarationclause() : ParameterdeclarationclauseContext? = getRuleContext(solver.getType("ParameterdeclarationclauseContext"),0)
		fun Mutable() : TerminalNode? = getToken(CPP14Parser.Tokens.Mutable.id, 0)
		fun findExceptionspecification() : ExceptionspecificationContext? = getRuleContext(solver.getType("ExceptionspecificationContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findTrailingreturntype() : TrailingreturntypeContext? = getRuleContext(solver.getType("TrailingreturntypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLambdadeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLambdadeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLambdadeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lambdadeclarator() : LambdadeclaratorContext {
		var _localctx : LambdadeclaratorContext = LambdadeclaratorContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_lambdadeclarator.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 521
			match(LeftParen) as Token
			this.state = 522
			parameterdeclarationclause()
			this.state = 523
			match(RightParen) as Token
			this.state = 525
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Mutable) {
				if (true){
				this.state = 524
				match(Mutable) as Token
				}
			}

			this.state = 528
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Noexcept || _la==Throw) {
				if (true){
				this.state = 527
				exceptionspecification()
				}
			}

			this.state = 531
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 530
				attributespecifierseq(0)
				}
			}

			this.state = 534
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Arrow) {
				if (true){
				this.state = 533
				trailingreturntype()
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

	open class PostfixexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_postfixexpression.id
	        set(value) { throw RuntimeException() }
		fun findPrimaryexpression() : PrimaryexpressionContext? = getRuleContext(solver.getType("PrimaryexpressionContext"),0)
		fun findSimpletypespecifier() : SimpletypespecifierContext? = getRuleContext(solver.getType("SimpletypespecifierContext"),0)
		fun findExpressionlist() : ExpressionlistContext? = getRuleContext(solver.getType("ExpressionlistContext"),0)
		fun findTypenamespecifier() : TypenamespecifierContext? = getRuleContext(solver.getType("TypenamespecifierContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		fun Dynamic_cast() : TerminalNode? = getToken(CPP14Parser.Tokens.Dynamic_cast.id, 0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun Static_cast() : TerminalNode? = getToken(CPP14Parser.Tokens.Static_cast.id, 0)
		fun Reinterpret_cast() : TerminalNode? = getToken(CPP14Parser.Tokens.Reinterpret_cast.id, 0)
		fun Const_cast() : TerminalNode? = getToken(CPP14Parser.Tokens.Const_cast.id, 0)
		fun findTypeidofthetypeid() : TypeidofthetypeidContext? = getRuleContext(solver.getType("TypeidofthetypeidContext"),0)
		fun findPostfixexpression() : PostfixexpressionContext? = getRuleContext(solver.getType("PostfixexpressionContext"),0)
		fun findIdexpression() : IdexpressionContext? = getRuleContext(solver.getType("IdexpressionContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findPseudodestructorname() : PseudodestructornameContext? = getRuleContext(solver.getType("PseudodestructornameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPostfixexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPostfixexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPostfixexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun postfixexpression() : PostfixexpressionContext {
		return postfixexpression(0);
	}

	private fun postfixexpression(_p: Int) : PostfixexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : PostfixexpressionContext= PostfixexpressionContext(context, _parentState)
		var _prevctx : PostfixexpressionContext= _localctx
		var _startState : Int = 30
		enterRecursionRule(_localctx, 30, Rules.RULE_postfixexpression.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 600
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1 -> {if (true){
			this.state = 537
			primaryexpression()
			}}
			2 -> {if (true){
			this.state = 538
			simpletypespecifier()
			this.state = 539
			match(LeftParen) as Token
			this.state = 541
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 540
				expressionlist()
				}
			}

			this.state = 543
			match(RightParen) as Token
			}}
			3 -> {if (true){
			this.state = 545
			typenamespecifier()
			this.state = 546
			match(LeftParen) as Token
			this.state = 548
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 547
				expressionlist()
				}
			}

			this.state = 550
			match(RightParen) as Token
			}}
			4 -> {if (true){
			this.state = 552
			simpletypespecifier()
			this.state = 553
			bracedinitlist()
			}}
			5 -> {if (true){
			this.state = 555
			typenamespecifier()
			this.state = 556
			bracedinitlist()
			}}
			6 -> {if (true){
			this.state = 558
			match(Dynamic_cast) as Token
			this.state = 559
			match(Less) as Token
			this.state = 560
			thetypeid()
			this.state = 561
			match(Greater) as Token
			this.state = 562
			match(LeftParen) as Token
			this.state = 563
			expression(0)
			this.state = 564
			match(RightParen) as Token
			}}
			7 -> {if (true){
			this.state = 566
			match(Static_cast) as Token
			this.state = 567
			match(Less) as Token
			this.state = 568
			thetypeid()
			this.state = 569
			match(Greater) as Token
			this.state = 570
			match(LeftParen) as Token
			this.state = 571
			expression(0)
			this.state = 572
			match(RightParen) as Token
			}}
			8 -> {if (true){
			this.state = 574
			match(Reinterpret_cast) as Token
			this.state = 575
			match(Less) as Token
			this.state = 576
			thetypeid()
			this.state = 577
			match(Greater) as Token
			this.state = 578
			match(LeftParen) as Token
			this.state = 579
			expression(0)
			this.state = 580
			match(RightParen) as Token
			}}
			9 -> {if (true){
			this.state = 582
			match(Const_cast) as Token
			this.state = 583
			match(Less) as Token
			this.state = 584
			thetypeid()
			this.state = 585
			match(Greater) as Token
			this.state = 586
			match(LeftParen) as Token
			this.state = 587
			expression(0)
			this.state = 588
			match(RightParen) as Token
			}}
			10 -> {if (true){
			this.state = 590
			typeidofthetypeid()
			this.state = 591
			match(LeftParen) as Token
			this.state = 592
			expression(0)
			this.state = 593
			match(RightParen) as Token
			}}
			11 -> {if (true){
			this.state = 595
			typeidofthetypeid()
			this.state = 596
			match(LeftParen) as Token
			this.state = 597
			thetypeid()
			this.state = 598
			match(RightParen) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 642
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,29,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 640
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,28,context) ) {
					1 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 602
					if (!(precpred(context!!, 19))) throw FailedPredicateException(this, "precpred(context!!, 19)")
					this.state = 603
					match(LeftBracket) as Token
					this.state = 604
					expression(0)
					this.state = 605
					match(RightBracket) as Token
					}}
					2 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 607
					if (!(precpred(context!!, 18))) throw FailedPredicateException(this, "precpred(context!!, 18)")
					this.state = 608
					match(LeftBracket) as Token
					this.state = 609
					bracedinitlist()
					this.state = 610
					match(RightBracket) as Token
					}}
					3 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 612
					if (!(precpred(context!!, 17))) throw FailedPredicateException(this, "precpred(context!!, 17)")
					this.state = 613
					match(LeftParen) as Token
					this.state = 615
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
						if (true){
						this.state = 614
						expressionlist()
						}
					}

					this.state = 617
					match(RightParen) as Token
					}}
					4 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 618
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 619
					match(Dot) as Token
					this.state = 621
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==Template) {
						if (true){
						this.state = 620
						match(Template) as Token
						}
					}

					this.state = 623
					idexpression()
					}}
					5 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 624
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 625
					match(Arrow) as Token
					this.state = 627
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==Template) {
						if (true){
						this.state = 626
						match(Template) as Token
						}
					}

					this.state = 629
					idexpression()
					}}
					6 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 630
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 631
					match(Dot) as Token
					this.state = 632
					pseudodestructorname()
					}}
					7 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 633
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 634
					match(Arrow) as Token
					this.state = 635
					pseudodestructorname()
					}}
					8 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 636
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 637
					match(PlusPlus) as Token
					}}
					9 -> {if (true){
					_localctx = PostfixexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_postfixexpression.id)
					this.state = 638
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 639
					match(MinusMinus) as Token
					}}
					}
					} 
				}
				this.state = 644
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,29,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TypeidofexprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeidofexpr.id
	        set(value) { throw RuntimeException() }
		fun Typeid() : TerminalNode? = getToken(CPP14Parser.Tokens.Typeid.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypeidofexpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypeidofexpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypeidofexpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeidofexpr() : TypeidofexprContext {
		var _localctx : TypeidofexprContext = TypeidofexprContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_typeidofexpr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 645
			match(Typeid) as Token
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

	open class TypeidofthetypeidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeidofthetypeid.id
	        set(value) { throw RuntimeException() }
		fun Typeid() : TerminalNode? = getToken(CPP14Parser.Tokens.Typeid.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypeidofthetypeid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypeidofthetypeid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypeidofthetypeid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeidofthetypeid() : TypeidofthetypeidContext {
		var _localctx : TypeidofthetypeidContext = TypeidofthetypeidContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_typeidofthetypeid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 647
			match(Typeid) as Token
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

	open class ExpressionlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expressionlist.id
	        set(value) { throw RuntimeException() }
		fun findInitializerlist() : InitializerlistContext? = getRuleContext(solver.getType("InitializerlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExpressionlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExpressionlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExpressionlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expressionlist() : ExpressionlistContext {
		var _localctx : ExpressionlistContext = ExpressionlistContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_expressionlist.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 649
			initializerlist(0)
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

	open class PseudodestructornameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pseudodestructorname.id
	        set(value) { throw RuntimeException() }
		fun findThetypename() : List<ThetypenameContext> = getRuleContexts(solver.getType("ThetypenameContext"))
		fun findThetypename(i: Int) : ThetypenameContext? = getRuleContext(solver.getType("ThetypenameContext"),i)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun findDecltypespecifier() : DecltypespecifierContext? = getRuleContext(solver.getType("DecltypespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPseudodestructorname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPseudodestructorname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPseudodestructorname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pseudodestructorname() : PseudodestructornameContext {
		var _localctx : PseudodestructornameContext = PseudodestructornameContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_pseudodestructorname.id)
		var _la: Int
		try {
			this.state = 673
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,32,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 652
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,30,context) ) {
			1   -> if (true){
			this.state = 651
			nestednamespecifier(0)
			}
			}
			this.state = 654
			thetypename()
			this.state = 655
			match(Doublecolon) as Token
			this.state = 656
			match(Tilde) as Token
			this.state = 657
			thetypename()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 659
			nestednamespecifier(0)
			this.state = 660
			match(Template) as Token
			this.state = 661
			simpletemplateid()
			this.state = 662
			match(Doublecolon) as Token
			this.state = 663
			match(Tilde) as Token
			this.state = 664
			thetypename()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 667
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				if (true){
				this.state = 666
				nestednamespecifier(0)
				}
			}

			this.state = 669
			match(Tilde) as Token
			this.state = 670
			thetypename()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 671
			match(Tilde) as Token
			this.state = 672
			decltypespecifier()
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

	open class UnaryexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unaryexpression.id
	        set(value) { throw RuntimeException() }
		fun findPostfixexpression() : PostfixexpressionContext? = getRuleContext(solver.getType("PostfixexpressionContext"),0)
		fun findCastexpression() : CastexpressionContext? = getRuleContext(solver.getType("CastexpressionContext"),0)
		fun findUnaryoperator() : UnaryoperatorContext? = getRuleContext(solver.getType("UnaryoperatorContext"),0)
		fun Sizeof() : TerminalNode? = getToken(CPP14Parser.Tokens.Sizeof.id, 0)
		fun findUnaryexpression() : UnaryexpressionContext? = getRuleContext(solver.getType("UnaryexpressionContext"),0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun Alignof() : TerminalNode? = getToken(CPP14Parser.Tokens.Alignof.id, 0)
		fun findNoexceptexpression() : NoexceptexpressionContext? = getRuleContext(solver.getType("NoexceptexpressionContext"),0)
		fun findNewexpression() : NewexpressionContext? = getRuleContext(solver.getType("NewexpressionContext"),0)
		fun findDeleteexpression() : DeleteexpressionContext? = getRuleContext(solver.getType("DeleteexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUnaryexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUnaryexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUnaryexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unaryexpression() : UnaryexpressionContext {
		var _localctx : UnaryexpressionContext = UnaryexpressionContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_unaryexpression.id)
		try {
			this.state = 703
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 675
			postfixexpression(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 676
			match(PlusPlus) as Token
			this.state = 677
			castexpression()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 678
			match(MinusMinus) as Token
			this.state = 679
			castexpression()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 680
			unaryoperator()
			this.state = 681
			castexpression()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 683
			match(Sizeof) as Token
			this.state = 684
			unaryexpression()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 685
			match(Sizeof) as Token
			this.state = 686
			match(LeftParen) as Token
			this.state = 687
			thetypeid()
			this.state = 688
			match(RightParen) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 690
			match(Sizeof) as Token
			this.state = 691
			match(Ellipsis) as Token
			this.state = 692
			match(LeftParen) as Token
			this.state = 693
			match(Identifier) as Token
			this.state = 694
			match(RightParen) as Token
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 695
			match(Alignof) as Token
			this.state = 696
			match(LeftParen) as Token
			this.state = 697
			thetypeid()
			this.state = 698
			match(RightParen) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 700
			noexceptexpression()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 701
			newexpression()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 702
			deleteexpression()
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

	open class UnaryoperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unaryoperator.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUnaryoperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUnaryoperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUnaryoperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unaryoperator() : UnaryoperatorContext {
		var _localctx : UnaryoperatorContext = UnaryoperatorContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_unaryoperator.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 705
			_la = _input!!.LA(1)
			if ( !(((((_la - 84)) and 0x3f.inv()) == 0 && ((1L shl (_la - 84)) and ((1L shl (Plus - 84)) or (1L shl (Minus - 84)) or (1L shl (Star - 84)) or (1L shl (And - 84)) or (1L shl (Or - 84)) or (1L shl (Tilde - 84)) or (1L shl (Not - 84)))) != 0L)) ) {
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

	open class NewexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newexpression.id
	        set(value) { throw RuntimeException() }
		fun New() : TerminalNode? = getToken(CPP14Parser.Tokens.New.id, 0)
		fun findNewtypeid() : NewtypeidContext? = getRuleContext(solver.getType("NewtypeidContext"),0)
		fun findNewplacement() : NewplacementContext? = getRuleContext(solver.getType("NewplacementContext"),0)
		fun findNewinitializer() : NewinitializerContext? = getRuleContext(solver.getType("NewinitializerContext"),0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNewexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNewexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNewexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  newexpression() : NewexpressionContext {
		var _localctx : NewexpressionContext = NewexpressionContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_newexpression.id)
		var _la: Int
		try {
			this.state = 731
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 708
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Doublecolon) {
				if (true){
				this.state = 707
				match(Doublecolon) as Token
				}
			}

			this.state = 710
			match(New) as Token
			this.state = 712
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LeftParen) {
				if (true){
				this.state = 711
				newplacement()
				}
			}

			this.state = 714
			newtypeid()
			this.state = 716
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,36,context) ) {
			1   -> if (true){
			this.state = 715
			newinitializer()
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 719
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Doublecolon) {
				if (true){
				this.state = 718
				match(Doublecolon) as Token
				}
			}

			this.state = 721
			match(New) as Token
			this.state = 723
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
			1   -> if (true){
			this.state = 722
			newplacement()
			}
			}
			this.state = 725
			match(LeftParen) as Token
			this.state = 726
			thetypeid()
			this.state = 727
			match(RightParen) as Token
			this.state = 729
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
			1   -> if (true){
			this.state = 728
			newinitializer()
			}
			}
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

	open class NewplacementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newplacement.id
	        set(value) { throw RuntimeException() }
		fun findExpressionlist() : ExpressionlistContext? = getRuleContext(solver.getType("ExpressionlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNewplacement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNewplacement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNewplacement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  newplacement() : NewplacementContext {
		var _localctx : NewplacementContext = NewplacementContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_newplacement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 733
			match(LeftParen) as Token
			this.state = 734
			expressionlist()
			this.state = 735
			match(RightParen) as Token
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

	open class NewtypeidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newtypeid.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		fun findNewdeclarator() : NewdeclaratorContext? = getRuleContext(solver.getType("NewdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNewtypeid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNewtypeid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNewtypeid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  newtypeid() : NewtypeidContext {
		var _localctx : NewtypeidContext = NewtypeidContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_newtypeid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 737
			typespecifierseq()
			this.state = 739
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,41,context) ) {
			1   -> if (true){
			this.state = 738
			newdeclarator()
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

	open class NewdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findPtroperator() : PtroperatorContext? = getRuleContext(solver.getType("PtroperatorContext"),0)
		fun findNewdeclarator() : NewdeclaratorContext? = getRuleContext(solver.getType("NewdeclaratorContext"),0)
		fun findNoptrnewdeclarator() : NoptrnewdeclaratorContext? = getRuleContext(solver.getType("NoptrnewdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNewdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNewdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNewdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  newdeclarator() : NewdeclaratorContext {
		var _localctx : NewdeclaratorContext = NewdeclaratorContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_newdeclarator.id)
		try {
			this.state = 746
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Decltype , Star , And , AndAnd , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 741
			ptroperator()
			this.state = 743
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,42,context) ) {
			1   -> if (true){
			this.state = 742
			newdeclarator()
			}
			}
			}}
			LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 745
			noptrnewdeclarator(0)
			}}
			else -> throw NoViableAltException(this)
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

	open class NoptrnewdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noptrnewdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findNoptrnewdeclarator() : NoptrnewdeclaratorContext? = getRuleContext(solver.getType("NoptrnewdeclaratorContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoptrnewdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoptrnewdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoptrnewdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun noptrnewdeclarator() : NoptrnewdeclaratorContext {
		return noptrnewdeclarator(0);
	}

	private fun noptrnewdeclarator(_p: Int) : NoptrnewdeclaratorContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : NoptrnewdeclaratorContext= NoptrnewdeclaratorContext(context, _parentState)
		var _prevctx : NoptrnewdeclaratorContext= _localctx
		var _startState : Int = 52
		enterRecursionRule(_localctx, 52, Rules.RULE_noptrnewdeclarator.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 749
			match(LeftBracket) as Token
			this.state = 750
			expression(0)
			this.state = 751
			match(RightBracket) as Token
			this.state = 753
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,44,context) ) {
			1   -> if (true){
			this.state = 752
			attributespecifierseq(0)
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 764
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,46,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = NoptrnewdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrnewdeclarator.id)
					this.state = 755
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 756
					match(LeftBracket) as Token
					this.state = 757
					constantexpression()
					this.state = 758
					match(RightBracket) as Token
					this.state = 760
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
					1   -> if (true){
					this.state = 759
					attributespecifierseq(0)
					}
					}
					}
					} 
				}
				this.state = 766
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,46,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class NewinitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newinitializer.id
	        set(value) { throw RuntimeException() }
		fun findExpressionlist() : ExpressionlistContext? = getRuleContext(solver.getType("ExpressionlistContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNewinitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNewinitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNewinitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  newinitializer() : NewinitializerContext {
		var _localctx : NewinitializerContext = NewinitializerContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_newinitializer.id)
		var _la: Int
		try {
			this.state = 773
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LeftParen  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 767
			match(LeftParen) as Token
			this.state = 769
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 768
				expressionlist()
				}
			}

			this.state = 771
			match(RightParen) as Token
			}}
			LeftBrace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 772
			bracedinitlist()
			}}
			else -> throw NoViableAltException(this)
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

	open class DeleteexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_deleteexpression.id
	        set(value) { throw RuntimeException() }
		fun Delete() : TerminalNode? = getToken(CPP14Parser.Tokens.Delete.id, 0)
		fun findCastexpression() : CastexpressionContext? = getRuleContext(solver.getType("CastexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeleteexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeleteexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeleteexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  deleteexpression() : DeleteexpressionContext {
		var _localctx : DeleteexpressionContext = DeleteexpressionContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_deleteexpression.id)
		var _la: Int
		try {
			this.state = 787
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,51,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 776
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Doublecolon) {
				if (true){
				this.state = 775
				match(Doublecolon) as Token
				}
			}

			this.state = 778
			match(Delete) as Token
			this.state = 779
			castexpression()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 781
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Doublecolon) {
				if (true){
				this.state = 780
				match(Doublecolon) as Token
				}
			}

			this.state = 783
			match(Delete) as Token
			this.state = 784
			match(LeftBracket) as Token
			this.state = 785
			match(RightBracket) as Token
			this.state = 786
			castexpression()
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

	open class NoexceptexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noexceptexpression.id
	        set(value) { throw RuntimeException() }
		fun Noexcept() : TerminalNode? = getToken(CPP14Parser.Tokens.Noexcept.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoexceptexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoexceptexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoexceptexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  noexceptexpression() : NoexceptexpressionContext {
		var _localctx : NoexceptexpressionContext = NoexceptexpressionContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_noexceptexpression.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 789
			match(Noexcept) as Token
			this.state = 790
			match(LeftParen) as Token
			this.state = 791
			expression(0)
			this.state = 792
			match(RightParen) as Token
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

	open class CastexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_castexpression.id
	        set(value) { throw RuntimeException() }
		fun findUnaryexpression() : UnaryexpressionContext? = getRuleContext(solver.getType("UnaryexpressionContext"),0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findCastexpression() : CastexpressionContext? = getRuleContext(solver.getType("CastexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCastexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCastexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCastexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  castexpression() : CastexpressionContext {
		var _localctx : CastexpressionContext = CastexpressionContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_castexpression.id)
		try {
			this.state = 800
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 794
			unaryexpression()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 795
			match(LeftParen) as Token
			this.state = 796
			thetypeid()
			this.state = 797
			match(RightParen) as Token
			this.state = 798
			castexpression()
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

	open class PmexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pmexpression.id
	        set(value) { throw RuntimeException() }
		fun findCastexpression() : CastexpressionContext? = getRuleContext(solver.getType("CastexpressionContext"),0)
		fun findPmexpression() : PmexpressionContext? = getRuleContext(solver.getType("PmexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPmexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPmexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPmexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun pmexpression() : PmexpressionContext {
		return pmexpression(0);
	}

	private fun pmexpression(_p: Int) : PmexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : PmexpressionContext= PmexpressionContext(context, _parentState)
		var _prevctx : PmexpressionContext= _localctx
		var _startState : Int = 62
		enterRecursionRule(_localctx, 62, Rules.RULE_pmexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 803
			castexpression()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 813
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,54,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 811
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
					1 -> {if (true){
					_localctx = PmexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_pmexpression.id)
					this.state = 805
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 806
					match(DotStar) as Token
					this.state = 807
					castexpression()
					}}
					2 -> {if (true){
					_localctx = PmexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_pmexpression.id)
					this.state = 808
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 809
					match(ArrowStar) as Token
					this.state = 810
					castexpression()
					}}
					}
					} 
				}
				this.state = 815
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,54,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class MultiplicativeexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_multiplicativeexpression.id
	        set(value) { throw RuntimeException() }
		fun findPmexpression() : PmexpressionContext? = getRuleContext(solver.getType("PmexpressionContext"),0)
		fun findMultiplicativeexpression() : MultiplicativeexpressionContext? = getRuleContext(solver.getType("MultiplicativeexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMultiplicativeexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMultiplicativeexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMultiplicativeexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun multiplicativeexpression() : MultiplicativeexpressionContext {
		return multiplicativeexpression(0);
	}

	private fun multiplicativeexpression(_p: Int) : MultiplicativeexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : MultiplicativeexpressionContext= MultiplicativeexpressionContext(context, _parentState)
		var _prevctx : MultiplicativeexpressionContext= _localctx
		var _startState : Int = 64
		enterRecursionRule(_localctx, 64, Rules.RULE_multiplicativeexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 817
			pmexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 830
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,56,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 828
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,55,context) ) {
					1 -> {if (true){
					_localctx = MultiplicativeexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_multiplicativeexpression.id)
					this.state = 819
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 820
					match(Star) as Token
					this.state = 821
					pmexpression(0)
					}}
					2 -> {if (true){
					_localctx = MultiplicativeexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_multiplicativeexpression.id)
					this.state = 822
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 823
					match(Div) as Token
					this.state = 824
					pmexpression(0)
					}}
					3 -> {if (true){
					_localctx = MultiplicativeexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_multiplicativeexpression.id)
					this.state = 825
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 826
					match(Mod) as Token
					this.state = 827
					pmexpression(0)
					}}
					}
					} 
				}
				this.state = 832
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,56,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class AdditiveexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_additiveexpression.id
	        set(value) { throw RuntimeException() }
		fun findMultiplicativeexpression() : MultiplicativeexpressionContext? = getRuleContext(solver.getType("MultiplicativeexpressionContext"),0)
		fun findAdditiveexpression() : AdditiveexpressionContext? = getRuleContext(solver.getType("AdditiveexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAdditiveexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAdditiveexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAdditiveexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun additiveexpression() : AdditiveexpressionContext {
		return additiveexpression(0);
	}

	private fun additiveexpression(_p: Int) : AdditiveexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : AdditiveexpressionContext= AdditiveexpressionContext(context, _parentState)
		var _prevctx : AdditiveexpressionContext= _localctx
		var _startState : Int = 66
		enterRecursionRule(_localctx, 66, Rules.RULE_additiveexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 834
			multiplicativeexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 844
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,58,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 842
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
					1 -> {if (true){
					_localctx = AdditiveexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_additiveexpression.id)
					this.state = 836
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 837
					match(Plus) as Token
					this.state = 838
					multiplicativeexpression(0)
					}}
					2 -> {if (true){
					_localctx = AdditiveexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_additiveexpression.id)
					this.state = 839
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 840
					match(Minus) as Token
					this.state = 841
					multiplicativeexpression(0)
					}}
					}
					} 
				}
				this.state = 846
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,58,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ShiftexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_shiftexpression.id
	        set(value) { throw RuntimeException() }
		fun findAdditiveexpression() : AdditiveexpressionContext? = getRuleContext(solver.getType("AdditiveexpressionContext"),0)
		fun findShiftexpression() : ShiftexpressionContext? = getRuleContext(solver.getType("ShiftexpressionContext"),0)
		fun findRightShift() : RightShiftContext? = getRuleContext(solver.getType("RightShiftContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterShiftexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitShiftexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitShiftexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun shiftexpression() : ShiftexpressionContext {
		return shiftexpression(0);
	}

	private fun shiftexpression(_p: Int) : ShiftexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ShiftexpressionContext= ShiftexpressionContext(context, _parentState)
		var _prevctx : ShiftexpressionContext= _localctx
		var _startState : Int = 68
		enterRecursionRule(_localctx, 68, Rules.RULE_shiftexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 848
			additiveexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 859
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,60,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 857
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
					1 -> {if (true){
					_localctx = ShiftexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_shiftexpression.id)
					this.state = 850
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 851
					match(LeftShift) as Token
					this.state = 852
					additiveexpression(0)
					}}
					2 -> {if (true){
					_localctx = ShiftexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_shiftexpression.id)
					this.state = 853
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 854
					rightShift()
					this.state = 855
					additiveexpression(0)
					}}
					}
					} 
				}
				this.state = 861
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,60,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class RelationalexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relationalexpression.id
	        set(value) { throw RuntimeException() }
		fun findShiftexpression() : ShiftexpressionContext? = getRuleContext(solver.getType("ShiftexpressionContext"),0)
		fun findRelationalexpression() : RelationalexpressionContext? = getRuleContext(solver.getType("RelationalexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterRelationalexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitRelationalexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitRelationalexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun relationalexpression() : RelationalexpressionContext {
		return relationalexpression(0);
	}

	private fun relationalexpression(_p: Int) : RelationalexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : RelationalexpressionContext= RelationalexpressionContext(context, _parentState)
		var _prevctx : RelationalexpressionContext= _localctx
		var _startState : Int = 70
		enterRecursionRule(_localctx, 70, Rules.RULE_relationalexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 863
			shiftexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 879
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,62,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 877
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
					1 -> {if (true){
					_localctx = RelationalexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_relationalexpression.id)
					this.state = 865
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 866
					match(Less) as Token
					this.state = 867
					shiftexpression(0)
					}}
					2 -> {if (true){
					_localctx = RelationalexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_relationalexpression.id)
					this.state = 868
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 869
					match(Greater) as Token
					this.state = 870
					shiftexpression(0)
					}}
					3 -> {if (true){
					_localctx = RelationalexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_relationalexpression.id)
					this.state = 871
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 872
					match(LessEqual) as Token
					this.state = 873
					shiftexpression(0)
					}}
					4 -> {if (true){
					_localctx = RelationalexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_relationalexpression.id)
					this.state = 874
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 875
					match(GreaterEqual) as Token
					this.state = 876
					shiftexpression(0)
					}}
					}
					} 
				}
				this.state = 881
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,62,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class EqualityexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_equalityexpression.id
	        set(value) { throw RuntimeException() }
		fun findRelationalexpression() : RelationalexpressionContext? = getRuleContext(solver.getType("RelationalexpressionContext"),0)
		fun findEqualityexpression() : EqualityexpressionContext? = getRuleContext(solver.getType("EqualityexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEqualityexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEqualityexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEqualityexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun equalityexpression() : EqualityexpressionContext {
		return equalityexpression(0);
	}

	private fun equalityexpression(_p: Int) : EqualityexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : EqualityexpressionContext= EqualityexpressionContext(context, _parentState)
		var _prevctx : EqualityexpressionContext= _localctx
		var _startState : Int = 72
		enterRecursionRule(_localctx, 72, Rules.RULE_equalityexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 883
			relationalexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 893
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,64,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 891
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,63,context) ) {
					1 -> {if (true){
					_localctx = EqualityexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_equalityexpression.id)
					this.state = 885
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 886
					match(Equal) as Token
					this.state = 887
					relationalexpression(0)
					}}
					2 -> {if (true){
					_localctx = EqualityexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_equalityexpression.id)
					this.state = 888
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 889
					match(NotEqual) as Token
					this.state = 890
					relationalexpression(0)
					}}
					}
					} 
				}
				this.state = 895
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,64,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class AndexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_andexpression.id
	        set(value) { throw RuntimeException() }
		fun findEqualityexpression() : EqualityexpressionContext? = getRuleContext(solver.getType("EqualityexpressionContext"),0)
		fun findAndexpression() : AndexpressionContext? = getRuleContext(solver.getType("AndexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAndexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAndexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAndexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun andexpression() : AndexpressionContext {
		return andexpression(0);
	}

	private fun andexpression(_p: Int) : AndexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : AndexpressionContext= AndexpressionContext(context, _parentState)
		var _prevctx : AndexpressionContext= _localctx
		var _startState : Int = 74
		enterRecursionRule(_localctx, 74, Rules.RULE_andexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 897
			equalityexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 904
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,65,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = AndexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_andexpression.id)
					this.state = 899
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 900
					match(And) as Token
					this.state = 901
					equalityexpression(0)
					}
					} 
				}
				this.state = 906
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,65,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ExclusiveorexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exclusiveorexpression.id
	        set(value) { throw RuntimeException() }
		fun findAndexpression() : AndexpressionContext? = getRuleContext(solver.getType("AndexpressionContext"),0)
		fun findExclusiveorexpression() : ExclusiveorexpressionContext? = getRuleContext(solver.getType("ExclusiveorexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExclusiveorexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExclusiveorexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExclusiveorexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun exclusiveorexpression() : ExclusiveorexpressionContext {
		return exclusiveorexpression(0);
	}

	private fun exclusiveorexpression(_p: Int) : ExclusiveorexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ExclusiveorexpressionContext= ExclusiveorexpressionContext(context, _parentState)
		var _prevctx : ExclusiveorexpressionContext= _localctx
		var _startState : Int = 76
		enterRecursionRule(_localctx, 76, Rules.RULE_exclusiveorexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 908
			andexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 915
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,66,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = ExclusiveorexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_exclusiveorexpression.id)
					this.state = 910
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 911
					match(Caret) as Token
					this.state = 912
					andexpression(0)
					}
					} 
				}
				this.state = 917
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,66,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class InclusiveorexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inclusiveorexpression.id
	        set(value) { throw RuntimeException() }
		fun findExclusiveorexpression() : ExclusiveorexpressionContext? = getRuleContext(solver.getType("ExclusiveorexpressionContext"),0)
		fun findInclusiveorexpression() : InclusiveorexpressionContext? = getRuleContext(solver.getType("InclusiveorexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInclusiveorexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInclusiveorexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInclusiveorexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun inclusiveorexpression() : InclusiveorexpressionContext {
		return inclusiveorexpression(0);
	}

	private fun inclusiveorexpression(_p: Int) : InclusiveorexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : InclusiveorexpressionContext= InclusiveorexpressionContext(context, _parentState)
		var _prevctx : InclusiveorexpressionContext= _localctx
		var _startState : Int = 78
		enterRecursionRule(_localctx, 78, Rules.RULE_inclusiveorexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 919
			exclusiveorexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 926
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,67,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = InclusiveorexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_inclusiveorexpression.id)
					this.state = 921
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 922
					match(Or) as Token
					this.state = 923
					exclusiveorexpression(0)
					}
					} 
				}
				this.state = 928
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,67,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class LogicalandexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logicalandexpression.id
	        set(value) { throw RuntimeException() }
		fun findInclusiveorexpression() : InclusiveorexpressionContext? = getRuleContext(solver.getType("InclusiveorexpressionContext"),0)
		fun findLogicalandexpression() : LogicalandexpressionContext? = getRuleContext(solver.getType("LogicalandexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLogicalandexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLogicalandexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLogicalandexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun logicalandexpression() : LogicalandexpressionContext {
		return logicalandexpression(0);
	}

	private fun logicalandexpression(_p: Int) : LogicalandexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : LogicalandexpressionContext= LogicalandexpressionContext(context, _parentState)
		var _prevctx : LogicalandexpressionContext= _localctx
		var _startState : Int = 80
		enterRecursionRule(_localctx, 80, Rules.RULE_logicalandexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 930
			inclusiveorexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 937
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,68,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = LogicalandexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_logicalandexpression.id)
					this.state = 932
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 933
					match(AndAnd) as Token
					this.state = 934
					inclusiveorexpression(0)
					}
					} 
				}
				this.state = 939
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,68,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class LogicalorexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logicalorexpression.id
	        set(value) { throw RuntimeException() }
		fun findLogicalandexpression() : LogicalandexpressionContext? = getRuleContext(solver.getType("LogicalandexpressionContext"),0)
		fun findLogicalorexpression() : LogicalorexpressionContext? = getRuleContext(solver.getType("LogicalorexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLogicalorexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLogicalorexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLogicalorexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun logicalorexpression() : LogicalorexpressionContext {
		return logicalorexpression(0);
	}

	private fun logicalorexpression(_p: Int) : LogicalorexpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : LogicalorexpressionContext= LogicalorexpressionContext(context, _parentState)
		var _prevctx : LogicalorexpressionContext= _localctx
		var _startState : Int = 82
		enterRecursionRule(_localctx, 82, Rules.RULE_logicalorexpression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 941
			logicalandexpression(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 948
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,69,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = LogicalorexpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_logicalorexpression.id)
					this.state = 943
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 944
					match(OrOr) as Token
					this.state = 945
					logicalandexpression(0)
					}
					} 
				}
				this.state = 950
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,69,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ConditionalexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_conditionalexpression.id
	        set(value) { throw RuntimeException() }
		fun findLogicalorexpression() : LogicalorexpressionContext? = getRuleContext(solver.getType("LogicalorexpressionContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findAssignmentexpression() : AssignmentexpressionContext? = getRuleContext(solver.getType("AssignmentexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterConditionalexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitConditionalexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitConditionalexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  conditionalexpression() : ConditionalexpressionContext {
		var _localctx : ConditionalexpressionContext = ConditionalexpressionContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_conditionalexpression.id)
		try {
			this.state = 958
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 951
			logicalorexpression(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 952
			logicalorexpression(0)
			this.state = 953
			match(Question) as Token
			this.state = 954
			expression(0)
			this.state = 955
			match(Colon) as Token
			this.state = 956
			assignmentexpression()
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

	open class AssignmentexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentexpression.id
	        set(value) { throw RuntimeException() }
		fun findConditionalexpression() : ConditionalexpressionContext? = getRuleContext(solver.getType("ConditionalexpressionContext"),0)
		fun findLogicalorexpression() : LogicalorexpressionContext? = getRuleContext(solver.getType("LogicalorexpressionContext"),0)
		fun findAssignmentoperator() : AssignmentoperatorContext? = getRuleContext(solver.getType("AssignmentoperatorContext"),0)
		fun findInitializerclause() : InitializerclauseContext? = getRuleContext(solver.getType("InitializerclauseContext"),0)
		fun findThrowexpression() : ThrowexpressionContext? = getRuleContext(solver.getType("ThrowexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAssignmentexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAssignmentexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAssignmentexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assignmentexpression() : AssignmentexpressionContext {
		var _localctx : AssignmentexpressionContext = AssignmentexpressionContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_assignmentexpression.id)
		try {
			this.state = 966
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,71,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 960
			conditionalexpression()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 961
			logicalorexpression(0)
			this.state = 962
			assignmentoperator()
			this.state = 963
			initializerclause()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 965
			throwexpression()
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

	open class AssignmentoperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentoperator.id
	        set(value) { throw RuntimeException() }
		fun findRightShiftAssign() : RightShiftAssignContext? = getRuleContext(solver.getType("RightShiftAssignContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAssignmentoperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAssignmentoperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAssignmentoperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assignmentoperator() : AssignmentoperatorContext {
		var _localctx : AssignmentoperatorContext = AssignmentoperatorContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_assignmentoperator.id)
		try {
			this.state = 979
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Assign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 968
			match(Assign) as Token
			}}
			StarAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 969
			match(StarAssign) as Token
			}}
			DivAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 970
			match(DivAssign) as Token
			}}
			ModAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 971
			match(ModAssign) as Token
			}}
			PlusAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 972
			match(PlusAssign) as Token
			}}
			MinusAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 973
			match(MinusAssign) as Token
			}}
			Greater  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 974
			rightShiftAssign()
			}}
			LeftShiftAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 975
			match(LeftShiftAssign) as Token
			}}
			AndAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 976
			match(AndAssign) as Token
			}}
			XorAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 977
			match(XorAssign) as Token
			}}
			OrAssign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 978
			match(OrAssign) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		fun findAssignmentexpression() : AssignmentexpressionContext? = getRuleContext(solver.getType("AssignmentexpressionContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun expression() : ExpressionContext {
		return expression(0);
	}

	private fun expression(_p: Int) : ExpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ExpressionContext= ExpressionContext(context, _parentState)
		var _prevctx : ExpressionContext= _localctx
		var _startState : Int = 90
		enterRecursionRule(_localctx, 90, Rules.RULE_expression.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 982
			assignmentexpression()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 989
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,73,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = ExpressionContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 984
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 985
					match(Comma) as Token
					this.state = 986
					assignmentexpression()
					}
					} 
				}
				this.state = 991
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,73,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ConstantexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constantexpression.id
	        set(value) { throw RuntimeException() }
		fun findConditionalexpression() : ConditionalexpressionContext? = getRuleContext(solver.getType("ConditionalexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterConstantexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitConstantexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitConstantexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  constantexpression() : ConstantexpressionContext {
		var _localctx : ConstantexpressionContext = ConstantexpressionContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_constantexpression.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 992
			conditionalexpression()
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

	open class StatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statement.id
	        set(value) { throw RuntimeException() }
		fun findLabeledstatement() : LabeledstatementContext? = getRuleContext(solver.getType("LabeledstatementContext"),0)
		fun findExpressionstatement() : ExpressionstatementContext? = getRuleContext(solver.getType("ExpressionstatementContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		fun findSelectionstatement() : SelectionstatementContext? = getRuleContext(solver.getType("SelectionstatementContext"),0)
		fun findIterationstatement() : IterationstatementContext? = getRuleContext(solver.getType("IterationstatementContext"),0)
		fun findJumpstatement() : JumpstatementContext? = getRuleContext(solver.getType("JumpstatementContext"),0)
		fun findDeclarationstatement() : DeclarationstatementContext? = getRuleContext(solver.getType("DeclarationstatementContext"),0)
		fun findTryblock() : TryblockContext? = getRuleContext(solver.getType("TryblockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_statement.id)
		var _la: Int
		try {
			this.state = 1020
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,80,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 994
			labeledstatement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 996
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
			1   -> if (true){
			this.state = 995
			attributespecifierseq(0)
			}
			}
			this.state = 998
			expressionstatement()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1000
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 999
				attributespecifierseq(0)
				}
			}

			this.state = 1002
			compoundstatement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1004
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1003
				attributespecifierseq(0)
				}
			}

			this.state = 1006
			selectionstatement()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1008
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1007
				attributespecifierseq(0)
				}
			}

			this.state = 1010
			iterationstatement()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1012
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1011
				attributespecifierseq(0)
				}
			}

			this.state = 1014
			jumpstatement()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1015
			declarationstatement()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 1017
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1016
				attributespecifierseq(0)
				}
			}

			this.state = 1019
			tryblock()
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

	open class LabeledstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_labeledstatement.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun Case() : TerminalNode? = getToken(CPP14Parser.Tokens.Case.id, 0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun Default() : TerminalNode? = getToken(CPP14Parser.Tokens.Default.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLabeledstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLabeledstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLabeledstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  labeledstatement() : LabeledstatementContext {
		var _localctx : LabeledstatementContext = LabeledstatementContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_labeledstatement.id)
		var _la: Int
		try {
			this.state = 1042
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,84,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1023
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1022
				attributespecifierseq(0)
				}
			}

			this.state = 1025
			match(Identifier) as Token
			this.state = 1026
			match(Colon) as Token
			this.state = 1027
			statement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1029
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1028
				attributespecifierseq(0)
				}
			}

			this.state = 1031
			match(Case) as Token
			this.state = 1032
			constantexpression()
			this.state = 1033
			match(Colon) as Token
			this.state = 1034
			statement()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1037
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1036
				attributespecifierseq(0)
				}
			}

			this.state = 1039
			match(Default) as Token
			this.state = 1040
			match(Colon) as Token
			this.state = 1041
			statement()
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

	open class ExpressionstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expressionstatement.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExpressionstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExpressionstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExpressionstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expressionstatement() : ExpressionstatementContext {
		var _localctx : ExpressionstatementContext = ExpressionstatementContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_expressionstatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1045
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1044
				expression(0)
				}
			}

			this.state = 1047
			match(Semi) as Token
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

	open class CompoundstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compoundstatement.id
	        set(value) { throw RuntimeException() }
		fun findStatementseq() : StatementseqContext? = getRuleContext(solver.getType("StatementseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCompoundstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCompoundstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCompoundstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  compoundstatement() : CompoundstatementContext {
		var _localctx : CompoundstatementContext = CompoundstatementContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_compoundstatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1049
			match(LeftBrace) as Token
			this.state = 1051
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Alignof) or (1L shl Asm) or (1L shl Auto) or (1L shl Bool) or (1L shl Break) or (1L shl Case) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Const_cast) or (1L shl Continue) or (1L shl Decltype) or (1L shl Default) or (1L shl Delete) or (1L shl Do) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl False) or (1L shl Float) or (1L shl For) or (1L shl Friend) or (1L shl Goto) or (1L shl If) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Namespace) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Register) or (1L shl Reinterpret_cast) or (1L shl Return) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static) or (1L shl Static_assert) or (1L shl Static_cast) or (1L shl Struct) or (1L shl Switch) or (1L shl This) or (1L shl Thread_local))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Try - 64)) or (1L shl (Typedef - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Union - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Using - 64)) or (1L shl (Virtual - 64)) or (1L shl (Void - 64)) or (1L shl (Volatile - 64)) or (1L shl (Wchar - 64)) or (1L shl (While - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (AndAnd - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Semi - 64)) or (1L shl (Ellipsis - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1050
				statementseq(0)
				}
			}

			this.state = 1053
			match(RightBrace) as Token
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

	open class StatementseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statementseq.id
	        set(value) { throw RuntimeException() }
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findStatementseq() : StatementseqContext? = getRuleContext(solver.getType("StatementseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterStatementseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitStatementseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitStatementseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun statementseq() : StatementseqContext {
		return statementseq(0);
	}

	private fun statementseq(_p: Int) : StatementseqContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : StatementseqContext= StatementseqContext(context, _parentState)
		var _prevctx : StatementseqContext= _localctx
		var _startState : Int = 102
		enterRecursionRule(_localctx, 102, Rules.RULE_statementseq.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1056
			statement()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1062
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,87,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = StatementseqContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_statementseq.id)
					this.state = 1058
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1059
					statement()
					}
					} 
				}
				this.state = 1064
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,87,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class SelectionstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_selectionstatement.id
	        set(value) { throw RuntimeException() }
		fun If() : TerminalNode? = getToken(CPP14Parser.Tokens.If.id, 0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		fun Else() : TerminalNode? = getToken(CPP14Parser.Tokens.Else.id, 0)
		fun Switch() : TerminalNode? = getToken(CPP14Parser.Tokens.Switch.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterSelectionstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitSelectionstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitSelectionstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  selectionstatement() : SelectionstatementContext {
		var _localctx : SelectionstatementContext = SelectionstatementContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_selectionstatement.id)
		try {
			this.state = 1085
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,88,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1065
			match(If) as Token
			this.state = 1066
			match(LeftParen) as Token
			this.state = 1067
			condition()
			this.state = 1068
			match(RightParen) as Token
			this.state = 1069
			statement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1071
			match(If) as Token
			this.state = 1072
			match(LeftParen) as Token
			this.state = 1073
			condition()
			this.state = 1074
			match(RightParen) as Token
			this.state = 1075
			statement()
			this.state = 1076
			match(Else) as Token
			this.state = 1077
			statement()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1079
			match(Switch) as Token
			this.state = 1080
			match(LeftParen) as Token
			this.state = 1081
			condition()
			this.state = 1082
			match(RightParen) as Token
			this.state = 1083
			statement()
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

	open class ConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_condition.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findInitializerclause() : InitializerclauseContext? = getRuleContext(solver.getType("InitializerclauseContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCondition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCondition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCondition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  condition() : ConditionContext {
		var _localctx : ConditionContext = ConditionContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_condition.id)
		var _la: Int
		try {
			this.state = 1103
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,91,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1087
			expression(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1089
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1088
				attributespecifierseq(0)
				}
			}

			this.state = 1091
			declspecifierseq()
			this.state = 1092
			declarator()
			this.state = 1093
			match(Assign) as Token
			this.state = 1094
			initializerclause()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1097
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1096
				attributespecifierseq(0)
				}
			}

			this.state = 1099
			declspecifierseq()
			this.state = 1100
			declarator()
			this.state = 1101
			bracedinitlist()
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

	open class IterationstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_iterationstatement.id
	        set(value) { throw RuntimeException() }
		fun While() : TerminalNode? = getToken(CPP14Parser.Tokens.While.id, 0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun Do() : TerminalNode? = getToken(CPP14Parser.Tokens.Do.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun For() : TerminalNode? = getToken(CPP14Parser.Tokens.For.id, 0)
		fun findForinitstatement() : ForinitstatementContext? = getRuleContext(solver.getType("ForinitstatementContext"),0)
		fun findForrangedeclaration() : ForrangedeclarationContext? = getRuleContext(solver.getType("ForrangedeclarationContext"),0)
		fun findForrangeinitializer() : ForrangeinitializerContext? = getRuleContext(solver.getType("ForrangeinitializerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterIterationstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitIterationstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitIterationstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  iterationstatement() : IterationstatementContext {
		var _localctx : IterationstatementContext = IterationstatementContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_iterationstatement.id)
		var _la: Int
		try {
			this.state = 1140
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,94,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1105
			match(While) as Token
			this.state = 1106
			match(LeftParen) as Token
			this.state = 1107
			condition()
			this.state = 1108
			match(RightParen) as Token
			this.state = 1109
			statement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1111
			match(Do) as Token
			this.state = 1112
			statement()
			this.state = 1113
			match(While) as Token
			this.state = 1114
			match(LeftParen) as Token
			this.state = 1115
			expression(0)
			this.state = 1116
			match(RightParen) as Token
			this.state = 1117
			match(Semi) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1119
			match(For) as Token
			this.state = 1120
			match(LeftParen) as Token
			this.state = 1121
			forinitstatement()
			this.state = 1123
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl False) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Register) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static) or (1L shl Static_cast) or (1L shl Struct) or (1L shl This) or (1L shl Thread_local))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typedef - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Union - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Virtual - 64)) or (1L shl (Void - 64)) or (1L shl (Volatile - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1122
				condition()
				}
			}

			this.state = 1125
			match(Semi) as Token
			this.state = 1127
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1126
				expression(0)
				}
			}

			this.state = 1129
			match(RightParen) as Token
			this.state = 1130
			statement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1132
			match(For) as Token
			this.state = 1133
			match(LeftParen) as Token
			this.state = 1134
			forrangedeclaration()
			this.state = 1135
			match(Colon) as Token
			this.state = 1136
			forrangeinitializer()
			this.state = 1137
			match(RightParen) as Token
			this.state = 1138
			statement()
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

	open class ForinitstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forinitstatement.id
	        set(value) { throw RuntimeException() }
		fun findExpressionstatement() : ExpressionstatementContext? = getRuleContext(solver.getType("ExpressionstatementContext"),0)
		fun findSimpledeclaration() : SimpledeclarationContext? = getRuleContext(solver.getType("SimpledeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterForinitstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitForinitstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitForinitstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forinitstatement() : ForinitstatementContext {
		var _localctx : ForinitstatementContext = ForinitstatementContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_forinitstatement.id)
		try {
			this.state = 1144
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,95,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1142
			expressionstatement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1143
			simpledeclaration()
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

	open class ForrangedeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forrangedeclaration.id
	        set(value) { throw RuntimeException() }
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterForrangedeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitForrangedeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitForrangedeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forrangedeclaration() : ForrangedeclarationContext {
		var _localctx : ForrangedeclarationContext = ForrangedeclarationContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_forrangedeclaration.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1147
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1146
				attributespecifierseq(0)
				}
			}

			this.state = 1149
			declspecifierseq()
			this.state = 1150
			declarator()
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

	open class ForrangeinitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forrangeinitializer.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterForrangeinitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitForrangeinitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitForrangeinitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forrangeinitializer() : ForrangeinitializerContext {
		var _localctx : ForrangeinitializerContext = ForrangeinitializerContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_forrangeinitializer.id)
		try {
			this.state = 1154
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Alignof , Auto , Bool , Char , Char16 , Char32 , Const_cast , Decltype , Delete , Double , Dynamic_cast , False , Float , Int , Long , New , Noexcept , Nullptr , Operator , Reinterpret_cast , Short , Signed , Sizeof , Static_cast , This , Throw , True , Typeid , Typename , Unsigned , Void , Wchar , LeftParen , LeftBracket , Plus , Minus , Star , And , Or , Tilde , Not , PlusPlus , MinusMinus , Doublecolon , Identifier , Integerliteral , Characterliteral , Floatingliteral , Stringliteral , Userdefinedintegerliteral , Userdefinedfloatingliteral , Userdefinedstringliteral , Userdefinedcharacterliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1152
			expression(0)
			}}
			LeftBrace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1153
			bracedinitlist()
			}}
			else -> throw NoViableAltException(this)
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

	open class JumpstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_jumpstatement.id
	        set(value) { throw RuntimeException() }
		fun Break() : TerminalNode? = getToken(CPP14Parser.Tokens.Break.id, 0)
		fun Continue() : TerminalNode? = getToken(CPP14Parser.Tokens.Continue.id, 0)
		fun Return() : TerminalNode? = getToken(CPP14Parser.Tokens.Return.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		fun Goto() : TerminalNode? = getToken(CPP14Parser.Tokens.Goto.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterJumpstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitJumpstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitJumpstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  jumpstatement() : JumpstatementContext {
		var _localctx : JumpstatementContext = JumpstatementContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_jumpstatement.id)
		var _la: Int
		try {
			this.state = 1172
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,99,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1156
			match(Break) as Token
			this.state = 1157
			match(Semi) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1158
			match(Continue) as Token
			this.state = 1159
			match(Semi) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1160
			match(Return) as Token
			this.state = 1162
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1161
				expression(0)
				}
			}

			this.state = 1164
			match(Semi) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1165
			match(Return) as Token
			this.state = 1166
			bracedinitlist()
			this.state = 1167
			match(Semi) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1169
			match(Goto) as Token
			this.state = 1170
			match(Identifier) as Token
			this.state = 1171
			match(Semi) as Token
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

	open class DeclarationstatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declarationstatement.id
	        set(value) { throw RuntimeException() }
		fun findBlockdeclaration() : BlockdeclarationContext? = getRuleContext(solver.getType("BlockdeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclarationstatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclarationstatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclarationstatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declarationstatement() : DeclarationstatementContext {
		var _localctx : DeclarationstatementContext = DeclarationstatementContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_declarationstatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1174
			blockdeclaration()
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

	open class DeclarationseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declarationseq.id
	        set(value) { throw RuntimeException() }
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		fun findDeclarationseq() : DeclarationseqContext? = getRuleContext(solver.getType("DeclarationseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclarationseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclarationseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclarationseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun declarationseq() : DeclarationseqContext {
		return declarationseq(0);
	}

	private fun declarationseq(_p: Int) : DeclarationseqContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : DeclarationseqContext= DeclarationseqContext(context, _parentState)
		var _prevctx : DeclarationseqContext= _localctx
		var _startState : Int = 120
		enterRecursionRule(_localctx, 120, Rules.RULE_declarationseq.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1177
			declaration()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1183
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,100,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = DeclarationseqContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_declarationseq.id)
					this.state = 1179
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1180
					declaration()
					}
					} 
				}
				this.state = 1185
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,100,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class DeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declaration.id
	        set(value) { throw RuntimeException() }
		fun findBlockdeclaration() : BlockdeclarationContext? = getRuleContext(solver.getType("BlockdeclarationContext"),0)
		fun findFunctiondefinition() : FunctiondefinitionContext? = getRuleContext(solver.getType("FunctiondefinitionContext"),0)
		fun findTemplatedeclaration() : TemplatedeclarationContext? = getRuleContext(solver.getType("TemplatedeclarationContext"),0)
		fun findExplicitinstantiation() : ExplicitinstantiationContext? = getRuleContext(solver.getType("ExplicitinstantiationContext"),0)
		fun findExplicitspecialization() : ExplicitspecializationContext? = getRuleContext(solver.getType("ExplicitspecializationContext"),0)
		fun findLinkagespecification() : LinkagespecificationContext? = getRuleContext(solver.getType("LinkagespecificationContext"),0)
		fun findNamespacedefinition() : NamespacedefinitionContext? = getRuleContext(solver.getType("NamespacedefinitionContext"),0)
		fun findEmptydeclaration() : EmptydeclarationContext? = getRuleContext(solver.getType("EmptydeclarationContext"),0)
		fun findAttributedeclaration() : AttributedeclarationContext? = getRuleContext(solver.getType("AttributedeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaration() : DeclarationContext {
		var _localctx : DeclarationContext = DeclarationContext(context, state)
		enterRule(_localctx, 122, Rules.RULE_declaration.id)
		try {
			this.state = 1195
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,101,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1186
			blockdeclaration()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1187
			functiondefinition()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1188
			templatedeclaration()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1189
			explicitinstantiation()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1190
			explicitspecialization()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1191
			linkagespecification()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1192
			namespacedefinition()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 1193
			emptydeclaration()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 1194
			attributedeclaration()
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

	open class BlockdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_blockdeclaration.id
	        set(value) { throw RuntimeException() }
		fun findSimpledeclaration() : SimpledeclarationContext? = getRuleContext(solver.getType("SimpledeclarationContext"),0)
		fun findAsmdefinition() : AsmdefinitionContext? = getRuleContext(solver.getType("AsmdefinitionContext"),0)
		fun findNamespacealiasdefinition() : NamespacealiasdefinitionContext? = getRuleContext(solver.getType("NamespacealiasdefinitionContext"),0)
		fun findUsingdeclaration() : UsingdeclarationContext? = getRuleContext(solver.getType("UsingdeclarationContext"),0)
		fun findUsingdirective() : UsingdirectiveContext? = getRuleContext(solver.getType("UsingdirectiveContext"),0)
		fun findStatic_assertdeclaration() : Static_assertdeclarationContext? = getRuleContext(solver.getType("Static_assertdeclarationContext"),0)
		fun findAliasdeclaration() : AliasdeclarationContext? = getRuleContext(solver.getType("AliasdeclarationContext"),0)
		fun findOpaqueenumdeclaration() : OpaqueenumdeclarationContext? = getRuleContext(solver.getType("OpaqueenumdeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBlockdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBlockdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBlockdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  blockdeclaration() : BlockdeclarationContext {
		var _localctx : BlockdeclarationContext = BlockdeclarationContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_blockdeclaration.id)
		try {
			this.state = 1205
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,102,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1197
			simpledeclaration()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1198
			asmdefinition()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1199
			namespacealiasdefinition()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1200
			usingdeclaration()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1201
			usingdirective()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1202
			static_assertdeclaration()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1203
			aliasdeclaration()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 1204
			opaqueenumdeclaration()
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

	open class AliasdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aliasdeclaration.id
	        set(value) { throw RuntimeException() }
		fun Using() : TerminalNode? = getToken(CPP14Parser.Tokens.Using.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAliasdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAliasdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAliasdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  aliasdeclaration() : AliasdeclarationContext {
		var _localctx : AliasdeclarationContext = AliasdeclarationContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_aliasdeclaration.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1207
			match(Using) as Token
			this.state = 1208
			match(Identifier) as Token
			this.state = 1210
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1209
				attributespecifierseq(0)
				}
			}

			this.state = 1212
			match(Assign) as Token
			this.state = 1213
			thetypeid()
			this.state = 1214
			match(Semi) as Token
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

	open class SimpledeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simpledeclaration.id
	        set(value) { throw RuntimeException() }
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findInitdeclaratorlist() : InitdeclaratorlistContext? = getRuleContext(solver.getType("InitdeclaratorlistContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterSimpledeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitSimpledeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitSimpledeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simpledeclaration() : SimpledeclarationContext {
		var _localctx : SimpledeclarationContext = SimpledeclarationContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_simpledeclaration.id)
		var _la: Int
		try {
			this.state = 1230
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Auto , Bool , Char , Char16 , Char32 , Class , Const , Constexpr , Decltype , Double , Enum , Explicit , Extern , Float , Friend , Inline , Int , Long , Mutable , Operator , Register , Short , Signed , Static , Struct , Thread_local , Typedef , Typename , Union , Unsigned , Virtual , Void , Volatile , Wchar , LeftParen , Star , And , Tilde , AndAnd , Doublecolon , Semi , Ellipsis , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1217
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,104,context) ) {
			1   -> if (true){
			this.state = 1216
			declspecifierseq()
			}
			}
			this.state = 1220
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Decltype || _la==Operator || ((((_la - 78)) and 0x3f.inv()) == 0 && ((1L shl (_la - 78)) and ((1L shl (LeftParen - 78)) or (1L shl (Star - 78)) or (1L shl (And - 78)) or (1L shl (Tilde - 78)) or (1L shl (AndAnd - 78)) or (1L shl (Doublecolon - 78)) or (1L shl (Ellipsis - 78)) or (1L shl (Identifier - 78)))) != 0L)) {
				if (true){
				this.state = 1219
				initdeclaratorlist(0)
				}
			}

			this.state = 1222
			match(Semi) as Token
			}}
			Alignas , LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1223
			attributespecifierseq(0)
			this.state = 1225
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,106,context) ) {
			1   -> if (true){
			this.state = 1224
			declspecifierseq()
			}
			}
			this.state = 1227
			initdeclaratorlist(0)
			this.state = 1228
			match(Semi) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class Static_assertdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_static_assertdeclaration.id
	        set(value) { throw RuntimeException() }
		fun Static_assert() : TerminalNode? = getToken(CPP14Parser.Tokens.Static_assert.id, 0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun Stringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Stringliteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterStatic_assertdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitStatic_assertdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitStatic_assertdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  static_assertdeclaration() : Static_assertdeclarationContext {
		var _localctx : Static_assertdeclarationContext = Static_assertdeclarationContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_static_assertdeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1232
			match(Static_assert) as Token
			this.state = 1233
			match(LeftParen) as Token
			this.state = 1234
			constantexpression()
			this.state = 1235
			match(Comma) as Token
			this.state = 1236
			match(Stringliteral) as Token
			this.state = 1237
			match(RightParen) as Token
			this.state = 1238
			match(Semi) as Token
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

	open class EmptydeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_emptydeclaration.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEmptydeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEmptydeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEmptydeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  emptydeclaration() : EmptydeclarationContext {
		var _localctx : EmptydeclarationContext = EmptydeclarationContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_emptydeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1240
			match(Semi) as Token
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

	open class AttributedeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributedeclaration.id
	        set(value) { throw RuntimeException() }
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributedeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributedeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributedeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributedeclaration() : AttributedeclarationContext {
		var _localctx : AttributedeclarationContext = AttributedeclarationContext(context, state)
		enterRule(_localctx, 134, Rules.RULE_attributedeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1242
			attributespecifierseq(0)
			this.state = 1243
			match(Semi) as Token
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

	open class DeclspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declspecifier.id
	        set(value) { throw RuntimeException() }
		fun findStorageclassspecifier() : StorageclassspecifierContext? = getRuleContext(solver.getType("StorageclassspecifierContext"),0)
		fun findTypespecifier() : TypespecifierContext? = getRuleContext(solver.getType("TypespecifierContext"),0)
		fun findFunctionspecifier() : FunctionspecifierContext? = getRuleContext(solver.getType("FunctionspecifierContext"),0)
		fun Friend() : TerminalNode? = getToken(CPP14Parser.Tokens.Friend.id, 0)
		fun Typedef() : TerminalNode? = getToken(CPP14Parser.Tokens.Typedef.id, 0)
		fun Constexpr() : TerminalNode? = getToken(CPP14Parser.Tokens.Constexpr.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declspecifier() : DeclspecifierContext {
		var _localctx : DeclspecifierContext = DeclspecifierContext(context, state)
		enterRule(_localctx, 136, Rules.RULE_declspecifier.id)
		try {
			this.state = 1251
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Extern , Mutable , Register , Static , Thread_local  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1245
			storageclassspecifier()
			}}
			Auto , Bool , Char , Char16 , Char32 , Class , Const , Decltype , Double , Enum , Float , Int , Long , Short , Signed , Struct , Typename , Union , Unsigned , Void , Volatile , Wchar , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1246
			typespecifier()
			}}
			Explicit , Inline , Virtual  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1247
			functionspecifier()
			}}
			Friend  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1248
			match(Friend) as Token
			}}
			Typedef  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1249
			match(Typedef) as Token
			}}
			Constexpr  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1250
			match(Constexpr) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class DeclspecifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declspecifierseq.id
	        set(value) { throw RuntimeException() }
		fun findDeclspecifier() : DeclspecifierContext? = getRuleContext(solver.getType("DeclspecifierContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclspecifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclspecifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclspecifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declspecifierseq() : DeclspecifierseqContext {
		var _localctx : DeclspecifierseqContext = DeclspecifierseqContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_declspecifierseq.id)
		try {
			this.state = 1260
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,110,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1253
			declspecifier()
			this.state = 1255
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,109,context) ) {
			1   -> if (true){
			this.state = 1254
			attributespecifierseq(0)
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1257
			declspecifier()
			this.state = 1258
			declspecifierseq()
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

	open class StorageclassspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_storageclassspecifier.id
	        set(value) { throw RuntimeException() }
		fun Register() : TerminalNode? = getToken(CPP14Parser.Tokens.Register.id, 0)
		fun Static() : TerminalNode? = getToken(CPP14Parser.Tokens.Static.id, 0)
		fun Thread_local() : TerminalNode? = getToken(CPP14Parser.Tokens.Thread_local.id, 0)
		fun Extern() : TerminalNode? = getToken(CPP14Parser.Tokens.Extern.id, 0)
		fun Mutable() : TerminalNode? = getToken(CPP14Parser.Tokens.Mutable.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterStorageclassspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitStorageclassspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitStorageclassspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  storageclassspecifier() : StorageclassspecifierContext {
		var _localctx : StorageclassspecifierContext = StorageclassspecifierContext(context, state)
		enterRule(_localctx, 140, Rules.RULE_storageclassspecifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1262
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Extern) or (1L shl Mutable) or (1L shl Register) or (1L shl Static) or (1L shl Thread_local))) != 0L)) ) {
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

	open class FunctionspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionspecifier.id
	        set(value) { throw RuntimeException() }
		fun Inline() : TerminalNode? = getToken(CPP14Parser.Tokens.Inline.id, 0)
		fun Virtual() : TerminalNode? = getToken(CPP14Parser.Tokens.Virtual.id, 0)
		fun Explicit() : TerminalNode? = getToken(CPP14Parser.Tokens.Explicit.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterFunctionspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitFunctionspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitFunctionspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionspecifier() : FunctionspecifierContext {
		var _localctx : FunctionspecifierContext = FunctionspecifierContext(context, state)
		enterRule(_localctx, 142, Rules.RULE_functionspecifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1264
			_la = _input!!.LA(1)
			if ( !(((((_la - 27)) and 0x3f.inv()) == 0 && ((1L shl (_la - 27)) and ((1L shl (Explicit - 27)) or (1L shl (Inline - 27)) or (1L shl (Virtual - 27)))) != 0L)) ) {
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

	open class TypedefnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typedefname.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypedefname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypedefname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypedefname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typedefname() : TypedefnameContext {
		var _localctx : TypedefnameContext = TypedefnameContext(context, state)
		enterRule(_localctx, 144, Rules.RULE_typedefname.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1266
			match(Identifier) as Token
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

	open class TypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typespecifier.id
	        set(value) { throw RuntimeException() }
		fun findTrailingtypespecifier() : TrailingtypespecifierContext? = getRuleContext(solver.getType("TrailingtypespecifierContext"),0)
		fun findClassspecifier() : ClassspecifierContext? = getRuleContext(solver.getType("ClassspecifierContext"),0)
		fun findEnumspecifier() : EnumspecifierContext? = getRuleContext(solver.getType("EnumspecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typespecifier() : TypespecifierContext {
		var _localctx : TypespecifierContext = TypespecifierContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_typespecifier.id)
		try {
			this.state = 1271
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,111,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1268
			trailingtypespecifier()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1269
			classspecifier()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1270
			enumspecifier()
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

	open class TrailingtypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_trailingtypespecifier.id
	        set(value) { throw RuntimeException() }
		fun findSimpletypespecifier() : SimpletypespecifierContext? = getRuleContext(solver.getType("SimpletypespecifierContext"),0)
		fun findElaboratedtypespecifier() : ElaboratedtypespecifierContext? = getRuleContext(solver.getType("ElaboratedtypespecifierContext"),0)
		fun findTypenamespecifier() : TypenamespecifierContext? = getRuleContext(solver.getType("TypenamespecifierContext"),0)
		fun findCvqualifier() : CvqualifierContext? = getRuleContext(solver.getType("CvqualifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTrailingtypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTrailingtypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTrailingtypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  trailingtypespecifier() : TrailingtypespecifierContext {
		var _localctx : TrailingtypespecifierContext = TrailingtypespecifierContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_trailingtypespecifier.id)
		try {
			this.state = 1277
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Auto , Bool , Char , Char16 , Char32 , Decltype , Double , Float , Int , Long , Short , Signed , Unsigned , Void , Wchar , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1273
			simpletypespecifier()
			}}
			Class , Enum , Struct , Union  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1274
			elaboratedtypespecifier()
			}}
			Typename  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1275
			typenamespecifier()
			}}
			Const , Volatile  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1276
			cvqualifier()
			}}
			else -> throw NoViableAltException(this)
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

	open class TypespecifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typespecifierseq.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifier() : TypespecifierContext? = getRuleContext(solver.getType("TypespecifierContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypespecifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypespecifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypespecifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typespecifierseq() : TypespecifierseqContext {
		var _localctx : TypespecifierseqContext = TypespecifierseqContext(context, state)
		enterRule(_localctx, 150, Rules.RULE_typespecifierseq.id)
		try {
			this.state = 1286
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,114,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1279
			typespecifier()
			this.state = 1281
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,113,context) ) {
			1   -> if (true){
			this.state = 1280
			attributespecifierseq(0)
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1283
			typespecifier()
			this.state = 1284
			typespecifierseq()
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

	open class TrailingtypespecifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_trailingtypespecifierseq.id
	        set(value) { throw RuntimeException() }
		fun findTrailingtypespecifier() : TrailingtypespecifierContext? = getRuleContext(solver.getType("TrailingtypespecifierContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findTrailingtypespecifierseq() : TrailingtypespecifierseqContext? = getRuleContext(solver.getType("TrailingtypespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTrailingtypespecifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTrailingtypespecifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTrailingtypespecifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  trailingtypespecifierseq() : TrailingtypespecifierseqContext {
		var _localctx : TrailingtypespecifierseqContext = TrailingtypespecifierseqContext(context, state)
		enterRule(_localctx, 152, Rules.RULE_trailingtypespecifierseq.id)
		try {
			this.state = 1295
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1288
			trailingtypespecifier()
			this.state = 1290
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,115,context) ) {
			1   -> if (true){
			this.state = 1289
			attributespecifierseq(0)
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1292
			trailingtypespecifier()
			this.state = 1293
			trailingtypespecifierseq()
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

	open class SimpletypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simpletypespecifier.id
	        set(value) { throw RuntimeException() }
		fun findThetypename() : ThetypenameContext? = getRuleContext(solver.getType("ThetypenameContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun Char() : TerminalNode? = getToken(CPP14Parser.Tokens.Char.id, 0)
		fun Char16() : TerminalNode? = getToken(CPP14Parser.Tokens.Char16.id, 0)
		fun Char32() : TerminalNode? = getToken(CPP14Parser.Tokens.Char32.id, 0)
		fun Wchar() : TerminalNode? = getToken(CPP14Parser.Tokens.Wchar.id, 0)
		fun Bool() : TerminalNode? = getToken(CPP14Parser.Tokens.Bool.id, 0)
		fun Short() : TerminalNode? = getToken(CPP14Parser.Tokens.Short.id, 0)
		fun Int() : TerminalNode? = getToken(CPP14Parser.Tokens.Int.id, 0)
		fun Long() : TerminalNode? = getToken(CPP14Parser.Tokens.Long.id, 0)
		fun Signed() : TerminalNode? = getToken(CPP14Parser.Tokens.Signed.id, 0)
		fun Unsigned() : TerminalNode? = getToken(CPP14Parser.Tokens.Unsigned.id, 0)
		fun Float() : TerminalNode? = getToken(CPP14Parser.Tokens.Float.id, 0)
		fun Double() : TerminalNode? = getToken(CPP14Parser.Tokens.Double.id, 0)
		fun Void() : TerminalNode? = getToken(CPP14Parser.Tokens.Void.id, 0)
		fun Auto() : TerminalNode? = getToken(CPP14Parser.Tokens.Auto.id, 0)
		fun findDecltypespecifier() : DecltypespecifierContext? = getRuleContext(solver.getType("DecltypespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterSimpletypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitSimpletypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitSimpletypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simpletypespecifier() : SimpletypespecifierContext {
		var _localctx : SimpletypespecifierContext = SimpletypespecifierContext(context, state)
		enterRule(_localctx, 154, Rules.RULE_simpletypespecifier.id)
		try {
			this.state = 1320
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,118,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1298
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,117,context) ) {
			1   -> if (true){
			this.state = 1297
			nestednamespecifier(0)
			}
			}
			this.state = 1300
			thetypename()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1301
			nestednamespecifier(0)
			this.state = 1302
			match(Template) as Token
			this.state = 1303
			simpletemplateid()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1305
			match(Char) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1306
			match(Char16) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1307
			match(Char32) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1308
			match(Wchar) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1309
			match(Bool) as Token
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 1310
			match(Short) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 1311
			match(Int) as Token
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 1312
			match(Long) as Token
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 1313
			match(Signed) as Token
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 1314
			match(Unsigned) as Token
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 1315
			match(Float) as Token
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 1316
			match(Double) as Token
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 1317
			match(Void) as Token
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 1318
			match(Auto) as Token
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 1319
			decltypespecifier()
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

	open class ThetypenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_thetypename.id
	        set(value) { throw RuntimeException() }
		fun findClassname() : ClassnameContext? = getRuleContext(solver.getType("ClassnameContext"),0)
		fun findEnumname() : EnumnameContext? = getRuleContext(solver.getType("EnumnameContext"),0)
		fun findTypedefname() : TypedefnameContext? = getRuleContext(solver.getType("TypedefnameContext"),0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterThetypename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitThetypename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitThetypename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  thetypename() : ThetypenameContext {
		var _localctx : ThetypenameContext = ThetypenameContext(context, state)
		enterRule(_localctx, 156, Rules.RULE_thetypename.id)
		try {
			this.state = 1326
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,119,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1322
			classname()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1323
			enumname()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1324
			typedefname()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1325
			simpletemplateid()
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

	open class DecltypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_decltypespecifier.id
	        set(value) { throw RuntimeException() }
		fun Decltype() : TerminalNode? = getToken(CPP14Parser.Tokens.Decltype.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun Auto() : TerminalNode? = getToken(CPP14Parser.Tokens.Auto.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDecltypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDecltypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDecltypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  decltypespecifier() : DecltypespecifierContext {
		var _localctx : DecltypespecifierContext = DecltypespecifierContext(context, state)
		enterRule(_localctx, 158, Rules.RULE_decltypespecifier.id)
		try {
			this.state = 1337
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,120,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1328
			match(Decltype) as Token
			this.state = 1329
			match(LeftParen) as Token
			this.state = 1330
			expression(0)
			this.state = 1331
			match(RightParen) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1333
			match(Decltype) as Token
			this.state = 1334
			match(LeftParen) as Token
			this.state = 1335
			match(Auto) as Token
			this.state = 1336
			match(RightParen) as Token
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

	open class ElaboratedtypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_elaboratedtypespecifier.id
	        set(value) { throw RuntimeException() }
		fun findClasskey() : ClasskeyContext? = getRuleContext(solver.getType("ClasskeyContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun Enum() : TerminalNode? = getToken(CPP14Parser.Tokens.Enum.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterElaboratedtypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitElaboratedtypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitElaboratedtypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  elaboratedtypespecifier() : ElaboratedtypespecifierContext {
		var _localctx : ElaboratedtypespecifierContext = ElaboratedtypespecifierContext(context, state)
		enterRule(_localctx, 160, Rules.RULE_elaboratedtypespecifier.id)
		var _la: Int
		try {
			this.state = 1363
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,125,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1339
			classkey()
			this.state = 1341
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1340
				attributespecifierseq(0)
				}
			}

			this.state = 1344
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,122,context) ) {
			1   -> if (true){
			this.state = 1343
			nestednamespecifier(0)
			}
			}
			this.state = 1346
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1348
			classkey()
			this.state = 1349
			simpletemplateid()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1351
			classkey()
			this.state = 1352
			nestednamespecifier(0)
			this.state = 1354
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Template) {
				if (true){
				this.state = 1353
				match(Template) as Token
				}
			}

			this.state = 1356
			simpletemplateid()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1358
			match(Enum) as Token
			this.state = 1360
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,124,context) ) {
			1   -> if (true){
			this.state = 1359
			nestednamespecifier(0)
			}
			}
			this.state = 1362
			match(Identifier) as Token
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

	open class EnumnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumname.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumname() : EnumnameContext {
		var _localctx : EnumnameContext = EnumnameContext(context, state)
		enterRule(_localctx, 162, Rules.RULE_enumname.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1365
			match(Identifier) as Token
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

	open class EnumspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumspecifier.id
	        set(value) { throw RuntimeException() }
		fun findEnumhead() : EnumheadContext? = getRuleContext(solver.getType("EnumheadContext"),0)
		fun findEnumeratorlist() : EnumeratorlistContext? = getRuleContext(solver.getType("EnumeratorlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumspecifier() : EnumspecifierContext {
		var _localctx : EnumspecifierContext = EnumspecifierContext(context, state)
		enterRule(_localctx, 164, Rules.RULE_enumspecifier.id)
		var _la: Int
		try {
			this.state = 1380
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,127,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1367
			enumhead()
			this.state = 1368
			match(LeftBrace) as Token
			this.state = 1370
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 1369
				enumeratorlist(0)
				}
			}

			this.state = 1372
			match(RightBrace) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1374
			enumhead()
			this.state = 1375
			match(LeftBrace) as Token
			this.state = 1376
			enumeratorlist(0)
			this.state = 1377
			match(Comma) as Token
			this.state = 1378
			match(RightBrace) as Token
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

	open class EnumheadContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumhead.id
	        set(value) { throw RuntimeException() }
		fun findEnumkey() : EnumkeyContext? = getRuleContext(solver.getType("EnumkeyContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findEnumbase() : EnumbaseContext? = getRuleContext(solver.getType("EnumbaseContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumhead(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumhead(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumhead(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumhead() : EnumheadContext {
		var _localctx : EnumheadContext = EnumheadContext(context, state)
		enterRule(_localctx, 166, Rules.RULE_enumhead.id)
		var _la: Int
		try {
			this.state = 1401
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,133,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1382
			enumkey()
			this.state = 1384
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1383
				attributespecifierseq(0)
				}
			}

			this.state = 1387
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 1386
				match(Identifier) as Token
				}
			}

			this.state = 1390
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1389
				enumbase()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1392
			enumkey()
			this.state = 1394
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1393
				attributespecifierseq(0)
				}
			}

			this.state = 1396
			nestednamespecifier(0)
			this.state = 1397
			match(Identifier) as Token
			this.state = 1399
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1398
				enumbase()
				}
			}

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

	open class OpaqueenumdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opaqueenumdeclaration.id
	        set(value) { throw RuntimeException() }
		fun findEnumkey() : EnumkeyContext? = getRuleContext(solver.getType("EnumkeyContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findEnumbase() : EnumbaseContext? = getRuleContext(solver.getType("EnumbaseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterOpaqueenumdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitOpaqueenumdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitOpaqueenumdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  opaqueenumdeclaration() : OpaqueenumdeclarationContext {
		var _localctx : OpaqueenumdeclarationContext = OpaqueenumdeclarationContext(context, state)
		enterRule(_localctx, 168, Rules.RULE_opaqueenumdeclaration.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1403
			enumkey()
			this.state = 1405
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1404
				attributespecifierseq(0)
				}
			}

			this.state = 1407
			match(Identifier) as Token
			this.state = 1409
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1408
				enumbase()
				}
			}

			this.state = 1411
			match(Semi) as Token
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

	open class EnumkeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumkey.id
	        set(value) { throw RuntimeException() }
		fun Enum() : TerminalNode? = getToken(CPP14Parser.Tokens.Enum.id, 0)
		fun Class() : TerminalNode? = getToken(CPP14Parser.Tokens.Class.id, 0)
		fun Struct() : TerminalNode? = getToken(CPP14Parser.Tokens.Struct.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumkey(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumkey(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumkey(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumkey() : EnumkeyContext {
		var _localctx : EnumkeyContext = EnumkeyContext(context, state)
		enterRule(_localctx, 170, Rules.RULE_enumkey.id)
		try {
			this.state = 1418
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,136,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1413
			match(Enum) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1414
			match(Enum) as Token
			this.state = 1415
			match(Class) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1416
			match(Enum) as Token
			this.state = 1417
			match(Struct) as Token
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

	open class EnumbaseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumbase.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumbase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumbase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumbase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumbase() : EnumbaseContext {
		var _localctx : EnumbaseContext = EnumbaseContext(context, state)
		enterRule(_localctx, 172, Rules.RULE_enumbase.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1420
			match(Colon) as Token
			this.state = 1421
			typespecifierseq()
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

	open class EnumeratorlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumeratorlist.id
	        set(value) { throw RuntimeException() }
		fun findEnumeratordefinition() : EnumeratordefinitionContext? = getRuleContext(solver.getType("EnumeratordefinitionContext"),0)
		fun findEnumeratorlist() : EnumeratorlistContext? = getRuleContext(solver.getType("EnumeratorlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumeratorlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumeratorlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumeratorlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun enumeratorlist() : EnumeratorlistContext {
		return enumeratorlist(0);
	}

	private fun enumeratorlist(_p: Int) : EnumeratorlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : EnumeratorlistContext= EnumeratorlistContext(context, _parentState)
		var _prevctx : EnumeratorlistContext= _localctx
		var _startState : Int = 174
		enterRecursionRule(_localctx, 174, Rules.RULE_enumeratorlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1424
			enumeratordefinition()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1431
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,137,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = EnumeratorlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_enumeratorlist.id)
					this.state = 1426
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1427
					match(Comma) as Token
					this.state = 1428
					enumeratordefinition()
					}
					} 
				}
				this.state = 1433
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,137,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class EnumeratordefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumeratordefinition.id
	        set(value) { throw RuntimeException() }
		fun findEnumerator() : EnumeratorContext? = getRuleContext(solver.getType("EnumeratorContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumeratordefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumeratordefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumeratordefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumeratordefinition() : EnumeratordefinitionContext {
		var _localctx : EnumeratordefinitionContext = EnumeratordefinitionContext(context, state)
		enterRule(_localctx, 176, Rules.RULE_enumeratordefinition.id)
		try {
			this.state = 1439
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,138,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1434
			enumerator()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1435
			enumerator()
			this.state = 1436
			match(Assign) as Token
			this.state = 1437
			constantexpression()
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

	open class EnumeratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumerator.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterEnumerator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitEnumerator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitEnumerator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumerator() : EnumeratorContext {
		var _localctx : EnumeratorContext = EnumeratorContext(context, state)
		enterRule(_localctx, 178, Rules.RULE_enumerator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1441
			match(Identifier) as Token
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

	open class NamespacenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacename.id
	        set(value) { throw RuntimeException() }
		fun findOriginalnamespacename() : OriginalnamespacenameContext? = getRuleContext(solver.getType("OriginalnamespacenameContext"),0)
		fun findNamespacealias() : NamespacealiasContext? = getRuleContext(solver.getType("NamespacealiasContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamespacename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamespacename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamespacename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacename() : NamespacenameContext {
		var _localctx : NamespacenameContext = NamespacenameContext(context, state)
		enterRule(_localctx, 180, Rules.RULE_namespacename.id)
		try {
			this.state = 1445
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,139,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1443
			originalnamespacename()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1444
			namespacealias()
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

	open class OriginalnamespacenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_originalnamespacename.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterOriginalnamespacename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitOriginalnamespacename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitOriginalnamespacename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  originalnamespacename() : OriginalnamespacenameContext {
		var _localctx : OriginalnamespacenameContext = OriginalnamespacenameContext(context, state)
		enterRule(_localctx, 182, Rules.RULE_originalnamespacename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1447
			match(Identifier) as Token
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

	open class NamespacedefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacedefinition.id
	        set(value) { throw RuntimeException() }
		fun findNamednamespacedefinition() : NamednamespacedefinitionContext? = getRuleContext(solver.getType("NamednamespacedefinitionContext"),0)
		fun findUnnamednamespacedefinition() : UnnamednamespacedefinitionContext? = getRuleContext(solver.getType("UnnamednamespacedefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamespacedefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamespacedefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamespacedefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacedefinition() : NamespacedefinitionContext {
		var _localctx : NamespacedefinitionContext = NamespacedefinitionContext(context, state)
		enterRule(_localctx, 184, Rules.RULE_namespacedefinition.id)
		try {
			this.state = 1451
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,140,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1449
			namednamespacedefinition()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1450
			unnamednamespacedefinition()
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

	open class NamednamespacedefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namednamespacedefinition.id
	        set(value) { throw RuntimeException() }
		fun findOriginalnamespacedefinition() : OriginalnamespacedefinitionContext? = getRuleContext(solver.getType("OriginalnamespacedefinitionContext"),0)
		fun findExtensionnamespacedefinition() : ExtensionnamespacedefinitionContext? = getRuleContext(solver.getType("ExtensionnamespacedefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamednamespacedefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamednamespacedefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamednamespacedefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namednamespacedefinition() : NamednamespacedefinitionContext {
		var _localctx : NamednamespacedefinitionContext = NamednamespacedefinitionContext(context, state)
		enterRule(_localctx, 186, Rules.RULE_namednamespacedefinition.id)
		try {
			this.state = 1455
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,141,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1453
			originalnamespacedefinition()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1454
			extensionnamespacedefinition()
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

	open class OriginalnamespacedefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_originalnamespacedefinition.id
	        set(value) { throw RuntimeException() }
		fun Namespace() : TerminalNode? = getToken(CPP14Parser.Tokens.Namespace.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findNamespacebody() : NamespacebodyContext? = getRuleContext(solver.getType("NamespacebodyContext"),0)
		fun Inline() : TerminalNode? = getToken(CPP14Parser.Tokens.Inline.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterOriginalnamespacedefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitOriginalnamespacedefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitOriginalnamespacedefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  originalnamespacedefinition() : OriginalnamespacedefinitionContext {
		var _localctx : OriginalnamespacedefinitionContext = OriginalnamespacedefinitionContext(context, state)
		enterRule(_localctx, 188, Rules.RULE_originalnamespacedefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1458
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Inline) {
				if (true){
				this.state = 1457
				match(Inline) as Token
				}
			}

			this.state = 1460
			match(Namespace) as Token
			this.state = 1461
			match(Identifier) as Token
			this.state = 1462
			match(LeftBrace) as Token
			this.state = 1463
			namespacebody()
			this.state = 1464
			match(RightBrace) as Token
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

	open class ExtensionnamespacedefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_extensionnamespacedefinition.id
	        set(value) { throw RuntimeException() }
		fun Namespace() : TerminalNode? = getToken(CPP14Parser.Tokens.Namespace.id, 0)
		fun findOriginalnamespacename() : OriginalnamespacenameContext? = getRuleContext(solver.getType("OriginalnamespacenameContext"),0)
		fun findNamespacebody() : NamespacebodyContext? = getRuleContext(solver.getType("NamespacebodyContext"),0)
		fun Inline() : TerminalNode? = getToken(CPP14Parser.Tokens.Inline.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExtensionnamespacedefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExtensionnamespacedefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExtensionnamespacedefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  extensionnamespacedefinition() : ExtensionnamespacedefinitionContext {
		var _localctx : ExtensionnamespacedefinitionContext = ExtensionnamespacedefinitionContext(context, state)
		enterRule(_localctx, 190, Rules.RULE_extensionnamespacedefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1467
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Inline) {
				if (true){
				this.state = 1466
				match(Inline) as Token
				}
			}

			this.state = 1469
			match(Namespace) as Token
			this.state = 1470
			originalnamespacename()
			this.state = 1471
			match(LeftBrace) as Token
			this.state = 1472
			namespacebody()
			this.state = 1473
			match(RightBrace) as Token
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

	open class UnnamednamespacedefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unnamednamespacedefinition.id
	        set(value) { throw RuntimeException() }
		fun Namespace() : TerminalNode? = getToken(CPP14Parser.Tokens.Namespace.id, 0)
		fun findNamespacebody() : NamespacebodyContext? = getRuleContext(solver.getType("NamespacebodyContext"),0)
		fun Inline() : TerminalNode? = getToken(CPP14Parser.Tokens.Inline.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUnnamednamespacedefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUnnamednamespacedefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUnnamednamespacedefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unnamednamespacedefinition() : UnnamednamespacedefinitionContext {
		var _localctx : UnnamednamespacedefinitionContext = UnnamednamespacedefinitionContext(context, state)
		enterRule(_localctx, 192, Rules.RULE_unnamednamespacedefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1476
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Inline) {
				if (true){
				this.state = 1475
				match(Inline) as Token
				}
			}

			this.state = 1478
			match(Namespace) as Token
			this.state = 1479
			match(LeftBrace) as Token
			this.state = 1480
			namespacebody()
			this.state = 1481
			match(RightBrace) as Token
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

	open class NamespacebodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacebody.id
	        set(value) { throw RuntimeException() }
		fun findDeclarationseq() : DeclarationseqContext? = getRuleContext(solver.getType("DeclarationseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamespacebody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamespacebody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamespacebody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacebody() : NamespacebodyContext {
		var _localctx : NamespacebodyContext = NamespacebodyContext(context, state)
		enterRule(_localctx, 194, Rules.RULE_namespacebody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1484
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Asm) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Namespace) or (1L shl Operator) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 1483
				declarationseq(0)
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

	open class NamespacealiasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacealias.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamespacealias(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamespacealias(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamespacealias(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacealias() : NamespacealiasContext {
		var _localctx : NamespacealiasContext = NamespacealiasContext(context, state)
		enterRule(_localctx, 196, Rules.RULE_namespacealias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1486
			match(Identifier) as Token
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

	open class NamespacealiasdefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacealiasdefinition.id
	        set(value) { throw RuntimeException() }
		fun Namespace() : TerminalNode? = getToken(CPP14Parser.Tokens.Namespace.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findQualifiednamespacespecifier() : QualifiednamespacespecifierContext? = getRuleContext(solver.getType("QualifiednamespacespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNamespacealiasdefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNamespacealiasdefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNamespacealiasdefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacealiasdefinition() : NamespacealiasdefinitionContext {
		var _localctx : NamespacealiasdefinitionContext = NamespacealiasdefinitionContext(context, state)
		enterRule(_localctx, 198, Rules.RULE_namespacealiasdefinition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1488
			match(Namespace) as Token
			this.state = 1489
			match(Identifier) as Token
			this.state = 1490
			match(Assign) as Token
			this.state = 1491
			qualifiednamespacespecifier()
			this.state = 1492
			match(Semi) as Token
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

	open class QualifiednamespacespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_qualifiednamespacespecifier.id
	        set(value) { throw RuntimeException() }
		fun findNamespacename() : NamespacenameContext? = getRuleContext(solver.getType("NamespacenameContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterQualifiednamespacespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitQualifiednamespacespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitQualifiednamespacespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  qualifiednamespacespecifier() : QualifiednamespacespecifierContext {
		var _localctx : QualifiednamespacespecifierContext = QualifiednamespacespecifierContext(context, state)
		enterRule(_localctx, 200, Rules.RULE_qualifiednamespacespecifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1495
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,146,context) ) {
			1   -> if (true){
			this.state = 1494
			nestednamespecifier(0)
			}
			}
			this.state = 1497
			namespacename()
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

	open class UsingdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_usingdeclaration.id
	        set(value) { throw RuntimeException() }
		fun Using() : TerminalNode? = getToken(CPP14Parser.Tokens.Using.id, 0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun findUnqualifiedid() : UnqualifiedidContext? = getRuleContext(solver.getType("UnqualifiedidContext"),0)
		fun Typename() : TerminalNode? = getToken(CPP14Parser.Tokens.Typename.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUsingdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUsingdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUsingdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  usingdeclaration() : UsingdeclarationContext {
		var _localctx : UsingdeclarationContext = UsingdeclarationContext(context, state)
		enterRule(_localctx, 202, Rules.RULE_usingdeclaration.id)
		var _la: Int
		try {
			this.state = 1512
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,148,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1499
			match(Using) as Token
			this.state = 1501
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Typename) {
				if (true){
				this.state = 1500
				match(Typename) as Token
				}
			}

			this.state = 1503
			nestednamespecifier(0)
			this.state = 1504
			unqualifiedid()
			this.state = 1505
			match(Semi) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1507
			match(Using) as Token
			this.state = 1508
			match(Doublecolon) as Token
			this.state = 1509
			unqualifiedid()
			this.state = 1510
			match(Semi) as Token
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

	open class UsingdirectiveContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_usingdirective.id
	        set(value) { throw RuntimeException() }
		fun Using() : TerminalNode? = getToken(CPP14Parser.Tokens.Using.id, 0)
		fun Namespace() : TerminalNode? = getToken(CPP14Parser.Tokens.Namespace.id, 0)
		fun findNamespacename() : NamespacenameContext? = getRuleContext(solver.getType("NamespacenameContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUsingdirective(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUsingdirective(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUsingdirective(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  usingdirective() : UsingdirectiveContext {
		var _localctx : UsingdirectiveContext = UsingdirectiveContext(context, state)
		enterRule(_localctx, 204, Rules.RULE_usingdirective.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1515
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1514
				attributespecifierseq(0)
				}
			}

			this.state = 1517
			match(Using) as Token
			this.state = 1518
			match(Namespace) as Token
			this.state = 1520
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,150,context) ) {
			1   -> if (true){
			this.state = 1519
			nestednamespecifier(0)
			}
			}
			this.state = 1522
			namespacename()
			this.state = 1523
			match(Semi) as Token
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

	open class AsmdefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_asmdefinition.id
	        set(value) { throw RuntimeException() }
		fun Asm() : TerminalNode? = getToken(CPP14Parser.Tokens.Asm.id, 0)
		fun Stringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Stringliteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAsmdefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAsmdefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAsmdefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  asmdefinition() : AsmdefinitionContext {
		var _localctx : AsmdefinitionContext = AsmdefinitionContext(context, state)
		enterRule(_localctx, 206, Rules.RULE_asmdefinition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1525
			match(Asm) as Token
			this.state = 1526
			match(LeftParen) as Token
			this.state = 1527
			match(Stringliteral) as Token
			this.state = 1528
			match(RightParen) as Token
			this.state = 1529
			match(Semi) as Token
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

	open class LinkagespecificationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_linkagespecification.id
	        set(value) { throw RuntimeException() }
		fun Extern() : TerminalNode? = getToken(CPP14Parser.Tokens.Extern.id, 0)
		fun Stringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Stringliteral.id, 0)
		fun findDeclarationseq() : DeclarationseqContext? = getRuleContext(solver.getType("DeclarationseqContext"),0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLinkagespecification(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLinkagespecification(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLinkagespecification(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  linkagespecification() : LinkagespecificationContext {
		var _localctx : LinkagespecificationContext = LinkagespecificationContext(context, state)
		enterRule(_localctx, 208, Rules.RULE_linkagespecification.id)
		var _la: Int
		try {
			this.state = 1541
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,152,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1531
			match(Extern) as Token
			this.state = 1532
			match(Stringliteral) as Token
			this.state = 1533
			match(LeftBrace) as Token
			this.state = 1535
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Asm) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Namespace) or (1L shl Operator) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 1534
				declarationseq(0)
				}
			}

			this.state = 1537
			match(RightBrace) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1538
			match(Extern) as Token
			this.state = 1539
			match(Stringliteral) as Token
			this.state = 1540
			declaration()
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

	open class AttributespecifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributespecifierseq.id
	        set(value) { throw RuntimeException() }
		fun findAttributespecifier() : AttributespecifierContext? = getRuleContext(solver.getType("AttributespecifierContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributespecifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributespecifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributespecifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun attributespecifierseq() : AttributespecifierseqContext {
		return attributespecifierseq(0);
	}

	private fun attributespecifierseq(_p: Int) : AttributespecifierseqContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : AttributespecifierseqContext= AttributespecifierseqContext(context, _parentState)
		var _prevctx : AttributespecifierseqContext= _localctx
		var _startState : Int = 210
		enterRecursionRule(_localctx, 210, Rules.RULE_attributespecifierseq.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1544
			attributespecifier()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1550
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,153,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = AttributespecifierseqContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_attributespecifierseq.id)
					this.state = 1546
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1547
					attributespecifier()
					}
					} 
				}
				this.state = 1552
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,153,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class AttributespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributespecifier.id
	        set(value) { throw RuntimeException() }
		fun findAttributelist() : AttributelistContext? = getRuleContext(solver.getType("AttributelistContext"),0)
		fun findAlignmentspecifier() : AlignmentspecifierContext? = getRuleContext(solver.getType("AlignmentspecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributespecifier() : AttributespecifierContext {
		var _localctx : AttributespecifierContext = AttributespecifierContext(context, state)
		enterRule(_localctx, 212, Rules.RULE_attributespecifier.id)
		try {
			this.state = 1560
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1553
			match(LeftBracket) as Token
			this.state = 1554
			match(LeftBracket) as Token
			this.state = 1555
			attributelist(0)
			this.state = 1556
			match(RightBracket) as Token
			this.state = 1557
			match(RightBracket) as Token
			}}
			Alignas  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1559
			alignmentspecifier()
			}}
			else -> throw NoViableAltException(this)
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

	open class AlignmentspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alignmentspecifier.id
	        set(value) { throw RuntimeException() }
		fun Alignas() : TerminalNode? = getToken(CPP14Parser.Tokens.Alignas.id, 0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAlignmentspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAlignmentspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAlignmentspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  alignmentspecifier() : AlignmentspecifierContext {
		var _localctx : AlignmentspecifierContext = AlignmentspecifierContext(context, state)
		enterRule(_localctx, 214, Rules.RULE_alignmentspecifier.id)
		var _la: Int
		try {
			this.state = 1578
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,157,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1562
			match(Alignas) as Token
			this.state = 1563
			match(LeftParen) as Token
			this.state = 1564
			thetypeid()
			this.state = 1566
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 1565
				match(Ellipsis) as Token
				}
			}

			this.state = 1568
			match(RightParen) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1570
			match(Alignas) as Token
			this.state = 1571
			match(LeftParen) as Token
			this.state = 1572
			constantexpression()
			this.state = 1574
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 1573
				match(Ellipsis) as Token
				}
			}

			this.state = 1576
			match(RightParen) as Token
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

	open class AttributelistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributelist.id
	        set(value) { throw RuntimeException() }
		fun findAttribute() : AttributeContext? = getRuleContext(solver.getType("AttributeContext"),0)
		fun findAttributelist() : AttributelistContext? = getRuleContext(solver.getType("AttributelistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributelist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributelist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributelist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun attributelist() : AttributelistContext {
		return attributelist(0);
	}

	private fun attributelist(_p: Int) : AttributelistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : AttributelistContext= AttributelistContext(context, _parentState)
		var _prevctx : AttributelistContext= _localctx
		var _startState : Int = 216
		enterRecursionRule(_localctx, 216, Rules.RULE_attributelist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1587
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,159,context) ) {
			1 -> {if (true){
			this.state = 1582
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,158,context) ) {
			1   -> if (true){
			this.state = 1581
			attribute()
			}
			}
			}}
			2 -> {if (true){
			this.state = 1584
			attribute()
			this.state = 1585
			match(Ellipsis) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1601
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,162,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 1599
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,161,context) ) {
					1 -> {if (true){
					_localctx = AttributelistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_attributelist.id)
					this.state = 1589
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 1590
					match(Comma) as Token
					this.state = 1592
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,160,context) ) {
					1   -> if (true){
					this.state = 1591
					attribute()
					}
					}
					}}
					2 -> {if (true){
					_localctx = AttributelistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_attributelist.id)
					this.state = 1594
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1595
					match(Comma) as Token
					this.state = 1596
					attribute()
					this.state = 1597
					match(Ellipsis) as Token
					}}
					}
					} 
				}
				this.state = 1603
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,162,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class AttributeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attribute.id
	        set(value) { throw RuntimeException() }
		fun findAttributetoken() : AttributetokenContext? = getRuleContext(solver.getType("AttributetokenContext"),0)
		fun findAttributeargumentclause() : AttributeargumentclauseContext? = getRuleContext(solver.getType("AttributeargumentclauseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttribute(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttribute(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttribute(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attribute() : AttributeContext {
		var _localctx : AttributeContext = AttributeContext(context, state)
		enterRule(_localctx, 218, Rules.RULE_attribute.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1604
			attributetoken()
			this.state = 1606
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,163,context) ) {
			1   -> if (true){
			this.state = 1605
			attributeargumentclause()
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

	open class AttributetokenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributetoken.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findAttributescopedtoken() : AttributescopedtokenContext? = getRuleContext(solver.getType("AttributescopedtokenContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributetoken(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributetoken(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributetoken(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributetoken() : AttributetokenContext {
		var _localctx : AttributetokenContext = AttributetokenContext(context, state)
		enterRule(_localctx, 220, Rules.RULE_attributetoken.id)
		try {
			this.state = 1610
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,164,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1608
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1609
			attributescopedtoken()
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

	open class AttributescopedtokenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributescopedtoken.id
	        set(value) { throw RuntimeException() }
		fun findAttributenamespace() : AttributenamespaceContext? = getRuleContext(solver.getType("AttributenamespaceContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributescopedtoken(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributescopedtoken(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributescopedtoken(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributescopedtoken() : AttributescopedtokenContext {
		var _localctx : AttributescopedtokenContext = AttributescopedtokenContext(context, state)
		enterRule(_localctx, 222, Rules.RULE_attributescopedtoken.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1612
			attributenamespace()
			this.state = 1613
			match(Doublecolon) as Token
			this.state = 1614
			match(Identifier) as Token
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

	open class AttributenamespaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributenamespace.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributenamespace(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributenamespace(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributenamespace(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributenamespace() : AttributenamespaceContext {
		var _localctx : AttributenamespaceContext = AttributenamespaceContext(context, state)
		enterRule(_localctx, 224, Rules.RULE_attributenamespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1616
			match(Identifier) as Token
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

	open class AttributeargumentclauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attributeargumentclause.id
	        set(value) { throw RuntimeException() }
		fun findBalancedtokenseq() : BalancedtokenseqContext? = getRuleContext(solver.getType("BalancedtokenseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAttributeargumentclause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAttributeargumentclause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAttributeargumentclause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attributeargumentclause() : AttributeargumentclauseContext {
		var _localctx : AttributeargumentclauseContext = AttributeargumentclauseContext(context, state)
		enterRule(_localctx, 226, Rules.RULE_attributeargumentclause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1618
			match(LeftParen) as Token
			this.state = 1619
			balancedtokenseq(0)
			this.state = 1620
			match(RightParen) as Token
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

	open class BalancedtokenseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_balancedtokenseq.id
	        set(value) { throw RuntimeException() }
		fun findBalancedtoken() : BalancedtokenContext? = getRuleContext(solver.getType("BalancedtokenContext"),0)
		fun findBalancedtokenseq() : BalancedtokenseqContext? = getRuleContext(solver.getType("BalancedtokenseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBalancedtokenseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBalancedtokenseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBalancedtokenseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun balancedtokenseq() : BalancedtokenseqContext {
		return balancedtokenseq(0);
	}

	private fun balancedtokenseq(_p: Int) : BalancedtokenseqContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : BalancedtokenseqContext= BalancedtokenseqContext(context, _parentState)
		var _prevctx : BalancedtokenseqContext= _localctx
		var _startState : Int = 228
		enterRecursionRule(_localctx, 228, Rules.RULE_balancedtokenseq.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1624
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,165,context) ) {
			1   -> if (true){
			this.state = 1623
			balancedtoken()
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1630
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,166,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = BalancedtokenseqContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_balancedtokenseq.id)
					this.state = 1626
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1627
					balancedtoken()
					}
					} 
				}
				this.state = 1632
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,166,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class BalancedtokenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_balancedtoken.id
	        set(value) { throw RuntimeException() }
		fun findBalancedtokenseq() : BalancedtokenseqContext? = getRuleContext(solver.getType("BalancedtokenseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBalancedtoken(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBalancedtoken(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBalancedtoken(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  balancedtoken() : BalancedtokenContext {
		var _localctx : BalancedtokenContext = BalancedtokenContext(context, state)
		enterRule(_localctx, 230, Rules.RULE_balancedtoken.id)
		try {
			this.state = 1645
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LeftParen  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1633
			match(LeftParen) as Token
			this.state = 1634
			balancedtokenseq(0)
			this.state = 1635
			match(RightParen) as Token
			}}
			LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1637
			match(LeftBracket) as Token
			this.state = 1638
			balancedtokenseq(0)
			this.state = 1639
			match(RightBracket) as Token
			}}
			LeftBrace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1641
			match(LeftBrace) as Token
			this.state = 1642
			balancedtokenseq(0)
			this.state = 1643
			match(RightBrace) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class InitdeclaratorlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initdeclaratorlist.id
	        set(value) { throw RuntimeException() }
		fun findInitdeclarator() : InitdeclaratorContext? = getRuleContext(solver.getType("InitdeclaratorContext"),0)
		fun findInitdeclaratorlist() : InitdeclaratorlistContext? = getRuleContext(solver.getType("InitdeclaratorlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitdeclaratorlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitdeclaratorlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitdeclaratorlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun initdeclaratorlist() : InitdeclaratorlistContext {
		return initdeclaratorlist(0);
	}

	private fun initdeclaratorlist(_p: Int) : InitdeclaratorlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : InitdeclaratorlistContext= InitdeclaratorlistContext(context, _parentState)
		var _prevctx : InitdeclaratorlistContext= _localctx
		var _startState : Int = 232
		enterRecursionRule(_localctx, 232, Rules.RULE_initdeclaratorlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1648
			initdeclarator()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1655
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,168,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = InitdeclaratorlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_initdeclaratorlist.id)
					this.state = 1650
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1651
					match(Comma) as Token
					this.state = 1652
					initdeclarator()
					}
					} 
				}
				this.state = 1657
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,168,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class InitdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findInitializer() : InitializerContext? = getRuleContext(solver.getType("InitializerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  initdeclarator() : InitdeclaratorContext {
		var _localctx : InitdeclaratorContext = InitdeclaratorContext(context, state)
		enterRule(_localctx, 234, Rules.RULE_initdeclarator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1658
			declarator()
			this.state = 1660
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,169,context) ) {
			1   -> if (true){
			this.state = 1659
			initializer()
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

	open class DeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declarator.id
	        set(value) { throw RuntimeException() }
		fun findPtrdeclarator() : PtrdeclaratorContext? = getRuleContext(solver.getType("PtrdeclaratorContext"),0)
		fun findNoptrdeclarator() : NoptrdeclaratorContext? = getRuleContext(solver.getType("NoptrdeclaratorContext"),0)
		fun findParametersandqualifiers() : ParametersandqualifiersContext? = getRuleContext(solver.getType("ParametersandqualifiersContext"),0)
		fun findTrailingreturntype() : TrailingreturntypeContext? = getRuleContext(solver.getType("TrailingreturntypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declarator() : DeclaratorContext {
		var _localctx : DeclaratorContext = DeclaratorContext(context, state)
		enterRule(_localctx, 236, Rules.RULE_declarator.id)
		try {
			this.state = 1667
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,170,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1662
			ptrdeclarator()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1663
			noptrdeclarator(0)
			this.state = 1664
			parametersandqualifiers()
			this.state = 1665
			trailingreturntype()
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

	open class PtrdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ptrdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findNoptrdeclarator() : NoptrdeclaratorContext? = getRuleContext(solver.getType("NoptrdeclaratorContext"),0)
		fun findPtroperator() : PtroperatorContext? = getRuleContext(solver.getType("PtroperatorContext"),0)
		fun findPtrdeclarator() : PtrdeclaratorContext? = getRuleContext(solver.getType("PtrdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPtrdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPtrdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPtrdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ptrdeclarator() : PtrdeclaratorContext {
		var _localctx : PtrdeclaratorContext = PtrdeclaratorContext(context, state)
		enterRule(_localctx, 238, Rules.RULE_ptrdeclarator.id)
		try {
			this.state = 1673
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,171,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1669
			noptrdeclarator(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1670
			ptroperator()
			this.state = 1671
			ptrdeclarator()
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

	open class NoptrdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noptrdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findDeclaratorid() : DeclaratoridContext? = getRuleContext(solver.getType("DeclaratoridContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findPtrdeclarator() : PtrdeclaratorContext? = getRuleContext(solver.getType("PtrdeclaratorContext"),0)
		fun findNoptrdeclarator() : NoptrdeclaratorContext? = getRuleContext(solver.getType("NoptrdeclaratorContext"),0)
		fun findParametersandqualifiers() : ParametersandqualifiersContext? = getRuleContext(solver.getType("ParametersandqualifiersContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoptrdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoptrdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoptrdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun noptrdeclarator() : NoptrdeclaratorContext {
		return noptrdeclarator(0);
	}

	private fun noptrdeclarator(_p: Int) : NoptrdeclaratorContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : NoptrdeclaratorContext= NoptrdeclaratorContext(context, _parentState)
		var _prevctx : NoptrdeclaratorContext= _localctx
		var _startState : Int = 240
		enterRecursionRule(_localctx, 240, Rules.RULE_noptrdeclarator.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1684
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Decltype , Operator , Tilde , Doublecolon , Ellipsis , Identifier  ->  /*LL1AltBlock*/{if (true){
			this.state = 1676
			declaratorid()
			this.state = 1678
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,172,context) ) {
			1   -> if (true){
			this.state = 1677
			attributespecifierseq(0)
			}
			}
			}}
			LeftParen  ->  /*LL1AltBlock*/{if (true){
			this.state = 1680
			match(LeftParen) as Token
			this.state = 1681
			ptrdeclarator()
			this.state = 1682
			match(RightParen) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1699
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,177,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 1697
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,176,context) ) {
					1 -> {if (true){
					_localctx = NoptrdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrdeclarator.id)
					this.state = 1686
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 1687
					parametersandqualifiers()
					}}
					2 -> {if (true){
					_localctx = NoptrdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrdeclarator.id)
					this.state = 1688
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 1689
					match(LeftBracket) as Token
					this.state = 1691
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
						if (true){
						this.state = 1690
						constantexpression()
						}
					}

					this.state = 1693
					match(RightBracket) as Token
					this.state = 1695
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,175,context) ) {
					1   -> if (true){
					this.state = 1694
					attributespecifierseq(0)
					}
					}
					}}
					}
					} 
				}
				this.state = 1701
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,177,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ParametersandqualifiersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parametersandqualifiers.id
	        set(value) { throw RuntimeException() }
		fun findParameterdeclarationclause() : ParameterdeclarationclauseContext? = getRuleContext(solver.getType("ParameterdeclarationclauseContext"),0)
		fun findCvqualifierseq() : CvqualifierseqContext? = getRuleContext(solver.getType("CvqualifierseqContext"),0)
		fun findRefqualifier() : RefqualifierContext? = getRuleContext(solver.getType("RefqualifierContext"),0)
		fun findExceptionspecification() : ExceptionspecificationContext? = getRuleContext(solver.getType("ExceptionspecificationContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterParametersandqualifiers(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitParametersandqualifiers(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitParametersandqualifiers(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  parametersandqualifiers() : ParametersandqualifiersContext {
		var _localctx : ParametersandqualifiersContext = ParametersandqualifiersContext(context, state)
		enterRule(_localctx, 242, Rules.RULE_parametersandqualifiers.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1702
			match(LeftParen) as Token
			this.state = 1703
			parameterdeclarationclause()
			this.state = 1704
			match(RightParen) as Token
			this.state = 1706
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,178,context) ) {
			1   -> if (true){
			this.state = 1705
			cvqualifierseq()
			}
			}
			this.state = 1709
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,179,context) ) {
			1   -> if (true){
			this.state = 1708
			refqualifier()
			}
			}
			this.state = 1712
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,180,context) ) {
			1   -> if (true){
			this.state = 1711
			exceptionspecification()
			}
			}
			this.state = 1715
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,181,context) ) {
			1   -> if (true){
			this.state = 1714
			attributespecifierseq(0)
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

	open class TrailingreturntypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_trailingreturntype.id
	        set(value) { throw RuntimeException() }
		fun findTrailingtypespecifierseq() : TrailingtypespecifierseqContext? = getRuleContext(solver.getType("TrailingtypespecifierseqContext"),0)
		fun findAbstractdeclarator() : AbstractdeclaratorContext? = getRuleContext(solver.getType("AbstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTrailingreturntype(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTrailingreturntype(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTrailingreturntype(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  trailingreturntype() : TrailingreturntypeContext {
		var _localctx : TrailingreturntypeContext = TrailingreturntypeContext(context, state)
		enterRule(_localctx, 244, Rules.RULE_trailingreturntype.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1717
			match(Arrow) as Token
			this.state = 1718
			trailingtypespecifierseq()
			this.state = 1720
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,182,context) ) {
			1   -> if (true){
			this.state = 1719
			abstractdeclarator()
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

	open class PtroperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ptroperator.id
	        set(value) { throw RuntimeException() }
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findCvqualifierseq() : CvqualifierseqContext? = getRuleContext(solver.getType("CvqualifierseqContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPtroperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPtroperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPtroperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ptroperator() : PtroperatorContext {
		var _localctx : PtroperatorContext = PtroperatorContext(context, state)
		enterRule(_localctx, 246, Rules.RULE_ptroperator.id)
		try {
			this.state = 1745
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Star  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1722
			match(Star) as Token
			this.state = 1724
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,183,context) ) {
			1   -> if (true){
			this.state = 1723
			attributespecifierseq(0)
			}
			}
			this.state = 1727
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,184,context) ) {
			1   -> if (true){
			this.state = 1726
			cvqualifierseq()
			}
			}
			}}
			And  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1729
			match(And) as Token
			this.state = 1731
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,185,context) ) {
			1   -> if (true){
			this.state = 1730
			attributespecifierseq(0)
			}
			}
			}}
			AndAnd  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1733
			match(AndAnd) as Token
			this.state = 1735
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,186,context) ) {
			1   -> if (true){
			this.state = 1734
			attributespecifierseq(0)
			}
			}
			}}
			Decltype , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1737
			nestednamespecifier(0)
			this.state = 1738
			match(Star) as Token
			this.state = 1740
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,187,context) ) {
			1   -> if (true){
			this.state = 1739
			attributespecifierseq(0)
			}
			}
			this.state = 1743
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,188,context) ) {
			1   -> if (true){
			this.state = 1742
			cvqualifierseq()
			}
			}
			}}
			else -> throw NoViableAltException(this)
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

	open class CvqualifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cvqualifierseq.id
	        set(value) { throw RuntimeException() }
		fun findCvqualifier() : CvqualifierContext? = getRuleContext(solver.getType("CvqualifierContext"),0)
		fun findCvqualifierseq() : CvqualifierseqContext? = getRuleContext(solver.getType("CvqualifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCvqualifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCvqualifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCvqualifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cvqualifierseq() : CvqualifierseqContext {
		var _localctx : CvqualifierseqContext = CvqualifierseqContext(context, state)
		enterRule(_localctx, 248, Rules.RULE_cvqualifierseq.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1747
			cvqualifier()
			this.state = 1749
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,190,context) ) {
			1   -> if (true){
			this.state = 1748
			cvqualifierseq()
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

	open class CvqualifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cvqualifier.id
	        set(value) { throw RuntimeException() }
		fun Const() : TerminalNode? = getToken(CPP14Parser.Tokens.Const.id, 0)
		fun Volatile() : TerminalNode? = getToken(CPP14Parser.Tokens.Volatile.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCvqualifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCvqualifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCvqualifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cvqualifier() : CvqualifierContext {
		var _localctx : CvqualifierContext = CvqualifierContext(context, state)
		enterRule(_localctx, 250, Rules.RULE_cvqualifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1751
			_la = _input!!.LA(1)
			if ( !(_la==Const || _la==Volatile) ) {
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

	open class RefqualifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_refqualifier.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterRefqualifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitRefqualifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitRefqualifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  refqualifier() : RefqualifierContext {
		var _localctx : RefqualifierContext = RefqualifierContext(context, state)
		enterRule(_localctx, 252, Rules.RULE_refqualifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1753
			_la = _input!!.LA(1)
			if ( !(_la==And || _la==AndAnd) ) {
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

	open class DeclaratoridContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declaratorid.id
	        set(value) { throw RuntimeException() }
		fun findIdexpression() : IdexpressionContext? = getRuleContext(solver.getType("IdexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDeclaratorid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDeclaratorid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDeclaratorid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaratorid() : DeclaratoridContext {
		var _localctx : DeclaratoridContext = DeclaratoridContext(context, state)
		enterRule(_localctx, 254, Rules.RULE_declaratorid.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1756
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 1755
				match(Ellipsis) as Token
				}
			}

			this.state = 1758
			idexpression()
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

	open class ThetypeidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_thetypeid.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		fun findAbstractdeclarator() : AbstractdeclaratorContext? = getRuleContext(solver.getType("AbstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterThetypeid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitThetypeid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitThetypeid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  thetypeid() : ThetypeidContext {
		var _localctx : ThetypeidContext = ThetypeidContext(context, state)
		enterRule(_localctx, 256, Rules.RULE_thetypeid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1760
			typespecifierseq()
			this.state = 1762
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,192,context) ) {
			1   -> if (true){
			this.state = 1761
			abstractdeclarator()
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

	open class AbstractdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_abstractdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findPtrabstractdeclarator() : PtrabstractdeclaratorContext? = getRuleContext(solver.getType("PtrabstractdeclaratorContext"),0)
		fun findParametersandqualifiers() : ParametersandqualifiersContext? = getRuleContext(solver.getType("ParametersandqualifiersContext"),0)
		fun findTrailingreturntype() : TrailingreturntypeContext? = getRuleContext(solver.getType("TrailingreturntypeContext"),0)
		fun findNoptrabstractdeclarator() : NoptrabstractdeclaratorContext? = getRuleContext(solver.getType("NoptrabstractdeclaratorContext"),0)
		fun findAbstractpackdeclarator() : AbstractpackdeclaratorContext? = getRuleContext(solver.getType("AbstractpackdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAbstractdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAbstractdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAbstractdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  abstractdeclarator() : AbstractdeclaratorContext {
		var _localctx : AbstractdeclaratorContext = AbstractdeclaratorContext(context, state)
		enterRule(_localctx, 258, Rules.RULE_abstractdeclarator.id)
		try {
			this.state = 1772
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,194,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1764
			ptrabstractdeclarator()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1766
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,193,context) ) {
			1   -> if (true){
			this.state = 1765
			noptrabstractdeclarator(0)
			}
			}
			this.state = 1768
			parametersandqualifiers()
			this.state = 1769
			trailingreturntype()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1771
			abstractpackdeclarator()
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

	open class PtrabstractdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ptrabstractdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findNoptrabstractdeclarator() : NoptrabstractdeclaratorContext? = getRuleContext(solver.getType("NoptrabstractdeclaratorContext"),0)
		fun findPtroperator() : PtroperatorContext? = getRuleContext(solver.getType("PtroperatorContext"),0)
		fun findPtrabstractdeclarator() : PtrabstractdeclaratorContext? = getRuleContext(solver.getType("PtrabstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPtrabstractdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPtrabstractdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPtrabstractdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ptrabstractdeclarator() : PtrabstractdeclaratorContext {
		var _localctx : PtrabstractdeclaratorContext = PtrabstractdeclaratorContext(context, state)
		enterRule(_localctx, 260, Rules.RULE_ptrabstractdeclarator.id)
		try {
			this.state = 1779
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LeftParen , LeftBracket  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1774
			noptrabstractdeclarator(0)
			}}
			Decltype , Star , And , AndAnd , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1775
			ptroperator()
			this.state = 1777
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,195,context) ) {
			1   -> if (true){
			this.state = 1776
			ptrabstractdeclarator()
			}
			}
			}}
			else -> throw NoViableAltException(this)
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

	open class NoptrabstractdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noptrabstractdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findParametersandqualifiers() : ParametersandqualifiersContext? = getRuleContext(solver.getType("ParametersandqualifiersContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findPtrabstractdeclarator() : PtrabstractdeclaratorContext? = getRuleContext(solver.getType("PtrabstractdeclaratorContext"),0)
		fun findNoptrabstractdeclarator() : NoptrabstractdeclaratorContext? = getRuleContext(solver.getType("NoptrabstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoptrabstractdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoptrabstractdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoptrabstractdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun noptrabstractdeclarator() : NoptrabstractdeclaratorContext {
		return noptrabstractdeclarator(0);
	}

	private fun noptrabstractdeclarator(_p: Int) : NoptrabstractdeclaratorContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : NoptrabstractdeclaratorContext= NoptrabstractdeclaratorContext(context, _parentState)
		var _prevctx : NoptrabstractdeclaratorContext= _localctx
		var _startState : Int = 262
		enterRecursionRule(_localctx, 262, Rules.RULE_noptrabstractdeclarator.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1795
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,199,context) ) {
			1 -> {if (true){
			this.state = 1782
			parametersandqualifiers()
			}}
			2 -> {if (true){
			this.state = 1783
			match(LeftBracket) as Token
			this.state = 1785
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 1784
				constantexpression()
				}
			}

			this.state = 1787
			match(RightBracket) as Token
			this.state = 1789
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,198,context) ) {
			1   -> if (true){
			this.state = 1788
			attributespecifierseq(0)
			}
			}
			}}
			3 -> {if (true){
			this.state = 1791
			match(LeftParen) as Token
			this.state = 1792
			ptrabstractdeclarator()
			this.state = 1793
			match(RightParen) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1810
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,203,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 1808
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,202,context) ) {
					1 -> {if (true){
					_localctx = NoptrabstractdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrabstractdeclarator.id)
					this.state = 1797
					if (!(precpred(context!!, 5))) throw FailedPredicateException(this, "precpred(context!!, 5)")
					this.state = 1798
					parametersandqualifiers()
					}}
					2 -> {if (true){
					_localctx = NoptrabstractdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrabstractdeclarator.id)
					this.state = 1799
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 1800
					match(LeftBracket) as Token
					this.state = 1802
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
						if (true){
						this.state = 1801
						constantexpression()
						}
					}

					this.state = 1804
					match(RightBracket) as Token
					this.state = 1806
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,201,context) ) {
					1   -> if (true){
					this.state = 1805
					attributespecifierseq(0)
					}
					}
					}}
					}
					} 
				}
				this.state = 1812
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,203,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class AbstractpackdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_abstractpackdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findNoptrabstractpackdeclarator() : NoptrabstractpackdeclaratorContext? = getRuleContext(solver.getType("NoptrabstractpackdeclaratorContext"),0)
		fun findPtroperator() : PtroperatorContext? = getRuleContext(solver.getType("PtroperatorContext"),0)
		fun findAbstractpackdeclarator() : AbstractpackdeclaratorContext? = getRuleContext(solver.getType("AbstractpackdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAbstractpackdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAbstractpackdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAbstractpackdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  abstractpackdeclarator() : AbstractpackdeclaratorContext {
		var _localctx : AbstractpackdeclaratorContext = AbstractpackdeclaratorContext(context, state)
		enterRule(_localctx, 264, Rules.RULE_abstractpackdeclarator.id)
		try {
			this.state = 1817
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Ellipsis  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1813
			noptrabstractpackdeclarator(0)
			}}
			Decltype , Star , And , AndAnd , Doublecolon , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1814
			ptroperator()
			this.state = 1815
			abstractpackdeclarator()
			}}
			else -> throw NoViableAltException(this)
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

	open class NoptrabstractpackdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noptrabstractpackdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findNoptrabstractpackdeclarator() : NoptrabstractpackdeclaratorContext? = getRuleContext(solver.getType("NoptrabstractpackdeclaratorContext"),0)
		fun findParametersandqualifiers() : ParametersandqualifiersContext? = getRuleContext(solver.getType("ParametersandqualifiersContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoptrabstractpackdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoptrabstractpackdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoptrabstractpackdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun noptrabstractpackdeclarator() : NoptrabstractpackdeclaratorContext {
		return noptrabstractpackdeclarator(0);
	}

	private fun noptrabstractpackdeclarator(_p: Int) : NoptrabstractpackdeclaratorContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : NoptrabstractpackdeclaratorContext= NoptrabstractpackdeclaratorContext(context, _parentState)
		var _prevctx : NoptrabstractpackdeclaratorContext= _localctx
		var _startState : Int = 266
		enterRecursionRule(_localctx, 266, Rules.RULE_noptrabstractpackdeclarator.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1820
			match(Ellipsis) as Token
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1835
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,208,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 1833
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,207,context) ) {
					1 -> {if (true){
					_localctx = NoptrabstractpackdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrabstractpackdeclarator.id)
					this.state = 1822
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 1823
					parametersandqualifiers()
					}}
					2 -> {if (true){
					_localctx = NoptrabstractpackdeclaratorContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_noptrabstractpackdeclarator.id)
					this.state = 1824
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 1825
					match(LeftBracket) as Token
					this.state = 1827
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
						if (true){
						this.state = 1826
						constantexpression()
						}
					}

					this.state = 1829
					match(RightBracket) as Token
					this.state = 1831
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,206,context) ) {
					1   -> if (true){
					this.state = 1830
					attributespecifierseq(0)
					}
					}
					}}
					}
					} 
				}
				this.state = 1837
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,208,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ParameterdeclarationclauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterdeclarationclause.id
	        set(value) { throw RuntimeException() }
		fun findParameterdeclarationlist() : ParameterdeclarationlistContext? = getRuleContext(solver.getType("ParameterdeclarationlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterParameterdeclarationclause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitParameterdeclarationclause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitParameterdeclarationclause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  parameterdeclarationclause() : ParameterdeclarationclauseContext {
		var _localctx : ParameterdeclarationclauseContext = ParameterdeclarationclauseContext(context, state)
		enterRule(_localctx, 268, Rules.RULE_parameterdeclarationclause.id)
		var _la: Int
		try {
			this.state = 1848
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,211,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1839
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Struct) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 1838
				parameterdeclarationlist(0)
				}
			}

			this.state = 1842
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 1841
				match(Ellipsis) as Token
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1844
			parameterdeclarationlist(0)
			this.state = 1845
			match(Comma) as Token
			this.state = 1846
			match(Ellipsis) as Token
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

	open class ParameterdeclarationlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterdeclarationlist.id
	        set(value) { throw RuntimeException() }
		fun findParameterdeclaration() : ParameterdeclarationContext? = getRuleContext(solver.getType("ParameterdeclarationContext"),0)
		fun findParameterdeclarationlist() : ParameterdeclarationlistContext? = getRuleContext(solver.getType("ParameterdeclarationlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterParameterdeclarationlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitParameterdeclarationlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitParameterdeclarationlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun parameterdeclarationlist() : ParameterdeclarationlistContext {
		return parameterdeclarationlist(0);
	}

	private fun parameterdeclarationlist(_p: Int) : ParameterdeclarationlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ParameterdeclarationlistContext= ParameterdeclarationlistContext(context, _parentState)
		var _prevctx : ParameterdeclarationlistContext= _localctx
		var _startState : Int = 270
		enterRecursionRule(_localctx, 270, Rules.RULE_parameterdeclarationlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1851
			parameterdeclaration()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1858
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,212,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = ParameterdeclarationlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_parameterdeclarationlist.id)
					this.state = 1853
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1854
					match(Comma) as Token
					this.state = 1855
					parameterdeclaration()
					}
					} 
				}
				this.state = 1860
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,212,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class ParameterdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterdeclaration.id
	        set(value) { throw RuntimeException() }
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findInitializerclause() : InitializerclauseContext? = getRuleContext(solver.getType("InitializerclauseContext"),0)
		fun findAbstractdeclarator() : AbstractdeclaratorContext? = getRuleContext(solver.getType("AbstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterParameterdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitParameterdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitParameterdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  parameterdeclaration() : ParameterdeclarationContext {
		var _localctx : ParameterdeclarationContext = ParameterdeclarationContext(context, state)
		enterRule(_localctx, 272, Rules.RULE_parameterdeclaration.id)
		var _la: Int
		try {
			this.state = 1892
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,219,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1862
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1861
				attributespecifierseq(0)
				}
			}

			this.state = 1864
			declspecifierseq()
			this.state = 1865
			declarator()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1868
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1867
				attributespecifierseq(0)
				}
			}

			this.state = 1870
			declspecifierseq()
			this.state = 1871
			declarator()
			this.state = 1872
			match(Assign) as Token
			this.state = 1873
			initializerclause()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1876
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1875
				attributespecifierseq(0)
				}
			}

			this.state = 1878
			declspecifierseq()
			this.state = 1880
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,216,context) ) {
			1   -> if (true){
			this.state = 1879
			abstractdeclarator()
			}
			}
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1883
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1882
				attributespecifierseq(0)
				}
			}

			this.state = 1885
			declspecifierseq()
			this.state = 1887
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Decltype || ((((_la - 78)) and 0x3f.inv()) == 0 && ((1L shl (_la - 78)) and ((1L shl (LeftParen - 78)) or (1L shl (LeftBracket - 78)) or (1L shl (Star - 78)) or (1L shl (And - 78)) or (1L shl (AndAnd - 78)) or (1L shl (Doublecolon - 78)) or (1L shl (Ellipsis - 78)) or (1L shl (Identifier - 78)))) != 0L)) {
				if (true){
				this.state = 1886
				abstractdeclarator()
				}
			}

			this.state = 1889
			match(Assign) as Token
			this.state = 1890
			initializerclause()
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

	open class FunctiondefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functiondefinition.id
	        set(value) { throw RuntimeException() }
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findFunctionbody() : FunctionbodyContext? = getRuleContext(solver.getType("FunctionbodyContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findVirtspecifierseq() : VirtspecifierseqContext? = getRuleContext(solver.getType("VirtspecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterFunctiondefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitFunctiondefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitFunctiondefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functiondefinition() : FunctiondefinitionContext {
		var _localctx : FunctiondefinitionContext = FunctiondefinitionContext(context, state)
		enterRule(_localctx, 274, Rules.RULE_functiondefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1895
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1894
				attributespecifierseq(0)
				}
			}

			this.state = 1898
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,221,context) ) {
			1   -> if (true){
			this.state = 1897
			declspecifierseq()
			}
			}
			this.state = 1900
			declarator()
			this.state = 1902
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Final || _la==Override) {
				if (true){
				this.state = 1901
				virtspecifierseq(0)
				}
			}

			this.state = 1904
			functionbody()
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

	open class FunctionbodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionbody.id
	        set(value) { throw RuntimeException() }
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		fun findCtorinitializer() : CtorinitializerContext? = getRuleContext(solver.getType("CtorinitializerContext"),0)
		fun findFunctiontryblock() : FunctiontryblockContext? = getRuleContext(solver.getType("FunctiontryblockContext"),0)
		fun Default() : TerminalNode? = getToken(CPP14Parser.Tokens.Default.id, 0)
		fun Delete() : TerminalNode? = getToken(CPP14Parser.Tokens.Delete.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterFunctionbody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitFunctionbody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitFunctionbody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionbody() : FunctionbodyContext {
		var _localctx : FunctionbodyContext = FunctionbodyContext(context, state)
		enterRule(_localctx, 276, Rules.RULE_functionbody.id)
		var _la: Int
		try {
			this.state = 1917
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,224,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1907
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1906
				ctorinitializer()
				}
			}

			this.state = 1909
			compoundstatement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1910
			functiontryblock()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1911
			match(Assign) as Token
			this.state = 1912
			match(Default) as Token
			this.state = 1913
			match(Semi) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1914
			match(Assign) as Token
			this.state = 1915
			match(Delete) as Token
			this.state = 1916
			match(Semi) as Token
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

	open class InitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initializer.id
	        set(value) { throw RuntimeException() }
		fun findBraceorequalinitializer() : BraceorequalinitializerContext? = getRuleContext(solver.getType("BraceorequalinitializerContext"),0)
		fun findExpressionlist() : ExpressionlistContext? = getRuleContext(solver.getType("ExpressionlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  initializer() : InitializerContext {
		var _localctx : InitializerContext = InitializerContext(context, state)
		enterRule(_localctx, 278, Rules.RULE_initializer.id)
		try {
			this.state = 1924
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LeftBrace , Assign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1919
			braceorequalinitializer()
			}}
			LeftParen  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1920
			match(LeftParen) as Token
			this.state = 1921
			expressionlist()
			this.state = 1922
			match(RightParen) as Token
			}}
			else -> throw NoViableAltException(this)
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

	open class BraceorequalinitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_braceorequalinitializer.id
	        set(value) { throw RuntimeException() }
		fun findInitializerclause() : InitializerclauseContext? = getRuleContext(solver.getType("InitializerclauseContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBraceorequalinitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBraceorequalinitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBraceorequalinitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  braceorequalinitializer() : BraceorequalinitializerContext {
		var _localctx : BraceorequalinitializerContext = BraceorequalinitializerContext(context, state)
		enterRule(_localctx, 280, Rules.RULE_braceorequalinitializer.id)
		try {
			this.state = 1929
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Assign  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1926
			match(Assign) as Token
			this.state = 1927
			initializerclause()
			}}
			LeftBrace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1928
			bracedinitlist()
			}}
			else -> throw NoViableAltException(this)
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

	open class InitializerclauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initializerclause.id
	        set(value) { throw RuntimeException() }
		fun findAssignmentexpression() : AssignmentexpressionContext? = getRuleContext(solver.getType("AssignmentexpressionContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitializerclause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitializerclause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitializerclause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  initializerclause() : InitializerclauseContext {
		var _localctx : InitializerclauseContext = InitializerclauseContext(context, state)
		enterRule(_localctx, 282, Rules.RULE_initializerclause.id)
		try {
			this.state = 1933
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Alignof , Auto , Bool , Char , Char16 , Char32 , Const_cast , Decltype , Delete , Double , Dynamic_cast , False , Float , Int , Long , New , Noexcept , Nullptr , Operator , Reinterpret_cast , Short , Signed , Sizeof , Static_cast , This , Throw , True , Typeid , Typename , Unsigned , Void , Wchar , LeftParen , LeftBracket , Plus , Minus , Star , And , Or , Tilde , Not , PlusPlus , MinusMinus , Doublecolon , Identifier , Integerliteral , Characterliteral , Floatingliteral , Stringliteral , Userdefinedintegerliteral , Userdefinedfloatingliteral , Userdefinedstringliteral , Userdefinedcharacterliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1931
			assignmentexpression()
			}}
			LeftBrace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1932
			bracedinitlist()
			}}
			else -> throw NoViableAltException(this)
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

	open class InitializerlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initializerlist.id
	        set(value) { throw RuntimeException() }
		fun findInitializerclause() : InitializerclauseContext? = getRuleContext(solver.getType("InitializerclauseContext"),0)
		fun findInitializerlist() : InitializerlistContext? = getRuleContext(solver.getType("InitializerlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterInitializerlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitInitializerlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitInitializerlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun initializerlist() : InitializerlistContext {
		return initializerlist(0);
	}

	private fun initializerlist(_p: Int) : InitializerlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : InitializerlistContext= InitializerlistContext(context, _parentState)
		var _prevctx : InitializerlistContext= _localctx
		var _startState : Int = 284
		enterRecursionRule(_localctx, 284, Rules.RULE_initializerlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1936
			initializerclause()
			this.state = 1938
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,228,context) ) {
			1   -> if (true){
			this.state = 1937
			match(Ellipsis) as Token
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 1948
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,230,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = InitializerlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_initializerlist.id)
					this.state = 1940
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 1941
					match(Comma) as Token
					this.state = 1942
					initializerclause()
					this.state = 1944
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,229,context) ) {
					1   -> if (true){
					this.state = 1943
					match(Ellipsis) as Token
					}
					}
					}
					} 
				}
				this.state = 1950
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,230,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class BracedinitlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bracedinitlist.id
	        set(value) { throw RuntimeException() }
		fun findInitializerlist() : InitializerlistContext? = getRuleContext(solver.getType("InitializerlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBracedinitlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBracedinitlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBracedinitlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bracedinitlist() : BracedinitlistContext {
		var _localctx : BracedinitlistContext = BracedinitlistContext(context, state)
		enterRule(_localctx, 286, Rules.RULE_bracedinitlist.id)
		var _la: Int
		try {
			this.state = 1960
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,232,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1951
			match(LeftBrace) as Token
			this.state = 1952
			initializerlist(0)
			this.state = 1954
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Comma) {
				if (true){
				this.state = 1953
				match(Comma) as Token
				}
			}

			this.state = 1956
			match(RightBrace) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1958
			match(LeftBrace) as Token
			this.state = 1959
			match(RightBrace) as Token
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

	open class ClassnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classname.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClassname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClassname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClassname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classname() : ClassnameContext {
		var _localctx : ClassnameContext = ClassnameContext(context, state)
		enterRule(_localctx, 288, Rules.RULE_classname.id)
		try {
			this.state = 1964
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,233,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1962
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1963
			simpletemplateid()
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

	open class ClassspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classspecifier.id
	        set(value) { throw RuntimeException() }
		fun findClasshead() : ClassheadContext? = getRuleContext(solver.getType("ClassheadContext"),0)
		fun findMemberspecification() : MemberspecificationContext? = getRuleContext(solver.getType("MemberspecificationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClassspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClassspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClassspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classspecifier() : ClassspecifierContext {
		var _localctx : ClassspecifierContext = ClassspecifierContext(context, state)
		enterRule(_localctx, 290, Rules.RULE_classspecifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1966
			classhead()
			this.state = 1967
			match(LeftBrace) as Token
			this.state = 1969
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Operator) or (1L shl Private) or (1L shl Protected) or (1L shl Public) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Colon - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 1968
				memberspecification()
				}
			}

			this.state = 1971
			match(RightBrace) as Token
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

	open class ClassheadContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classhead.id
	        set(value) { throw RuntimeException() }
		fun findClasskey() : ClasskeyContext? = getRuleContext(solver.getType("ClasskeyContext"),0)
		fun findClassheadname() : ClassheadnameContext? = getRuleContext(solver.getType("ClassheadnameContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findClassvirtspecifier() : ClassvirtspecifierContext? = getRuleContext(solver.getType("ClassvirtspecifierContext"),0)
		fun findBaseclause() : BaseclauseContext? = getRuleContext(solver.getType("BaseclauseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClasshead(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClasshead(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClasshead(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classhead() : ClassheadContext {
		var _localctx : ClassheadContext = ClassheadContext(context, state)
		enterRule(_localctx, 292, Rules.RULE_classhead.id)
		var _la: Int
		try {
			this.state = 1991
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,240,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1973
			classkey()
			this.state = 1975
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1974
				attributespecifierseq(0)
				}
			}

			this.state = 1977
			classheadname()
			this.state = 1979
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Final) {
				if (true){
				this.state = 1978
				classvirtspecifier()
				}
			}

			this.state = 1982
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1981
				baseclause()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1984
			classkey()
			this.state = 1986
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 1985
				attributespecifierseq(0)
				}
			}

			this.state = 1989
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 1988
				baseclause()
				}
			}

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

	open class ClassheadnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classheadname.id
	        set(value) { throw RuntimeException() }
		fun findClassname() : ClassnameContext? = getRuleContext(solver.getType("ClassnameContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClassheadname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClassheadname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClassheadname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classheadname() : ClassheadnameContext {
		var _localctx : ClassheadnameContext = ClassheadnameContext(context, state)
		enterRule(_localctx, 294, Rules.RULE_classheadname.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1994
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,241,context) ) {
			1   -> if (true){
			this.state = 1993
			nestednamespecifier(0)
			}
			}
			this.state = 1996
			classname()
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

	open class ClassvirtspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classvirtspecifier.id
	        set(value) { throw RuntimeException() }
		fun Final() : TerminalNode? = getToken(CPP14Parser.Tokens.Final.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClassvirtspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClassvirtspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClassvirtspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classvirtspecifier() : ClassvirtspecifierContext {
		var _localctx : ClassvirtspecifierContext = ClassvirtspecifierContext(context, state)
		enterRule(_localctx, 296, Rules.RULE_classvirtspecifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1998
			match(Final) as Token
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

	open class ClasskeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classkey.id
	        set(value) { throw RuntimeException() }
		fun Class() : TerminalNode? = getToken(CPP14Parser.Tokens.Class.id, 0)
		fun Struct() : TerminalNode? = getToken(CPP14Parser.Tokens.Struct.id, 0)
		fun Union() : TerminalNode? = getToken(CPP14Parser.Tokens.Union.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClasskey(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClasskey(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClasskey(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classkey() : ClasskeyContext {
		var _localctx : ClasskeyContext = ClasskeyContext(context, state)
		enterRule(_localctx, 298, Rules.RULE_classkey.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2000
			_la = _input!!.LA(1)
			if ( !(((((_la - 14)) and 0x3f.inv()) == 0 && ((1L shl (_la - 14)) and ((1L shl (Class - 14)) or (1L shl (Struct - 14)) or (1L shl (Union - 14)))) != 0L)) ) {
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

	open class MemberspecificationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_memberspecification.id
	        set(value) { throw RuntimeException() }
		fun findMemberdeclaration() : MemberdeclarationContext? = getRuleContext(solver.getType("MemberdeclarationContext"),0)
		fun findMemberspecification() : MemberspecificationContext? = getRuleContext(solver.getType("MemberspecificationContext"),0)
		fun findAccessspecifier() : AccessspecifierContext? = getRuleContext(solver.getType("AccessspecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMemberspecification(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMemberspecification(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMemberspecification(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  memberspecification() : MemberspecificationContext {
		var _localctx : MemberspecificationContext = MemberspecificationContext(context, state)
		enterRule(_localctx, 300, Rules.RULE_memberspecification.id)
		var _la: Int
		try {
			this.state = 2011
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Alignas , Auto , Bool , Char , Char16 , Char32 , Class , Const , Constexpr , Decltype , Double , Enum , Explicit , Extern , Float , Friend , Inline , Int , Long , Mutable , Operator , Register , Short , Signed , Static , Static_assert , Struct , Template , Thread_local , Typedef , Typename , Union , Unsigned , Using , Virtual , Void , Volatile , Wchar , LeftParen , LeftBracket , Star , And , Tilde , AndAnd , Colon , Doublecolon , Semi , Ellipsis , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2002
			memberdeclaration()
			this.state = 2004
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Operator) or (1L shl Private) or (1L shl Protected) or (1L shl Public) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Colon - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 2003
				memberspecification()
				}
			}

			}}
			Private , Protected , Public  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2006
			accessspecifier()
			this.state = 2007
			match(Colon) as Token
			this.state = 2009
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Constexpr) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Explicit) or (1L shl Extern) or (1L shl Float) or (1L shl Friend) or (1L shl Inline) or (1L shl Int) or (1L shl Long) or (1L shl Mutable) or (1L shl Operator) or (1L shl Private) or (1L shl Protected) or (1L shl Public) or (1L shl Register) or (1L shl Short) or (1L shl Signed) or (1L shl Static) or (1L shl Static_assert) or (1L shl Struct) or (1L shl Template) or (1L shl Thread_local))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Typedef - 67)) or (1L shl (Typename - 67)) or (1L shl (Union - 67)) or (1L shl (Unsigned - 67)) or (1L shl (Using - 67)) or (1L shl (Virtual - 67)) or (1L shl (Void - 67)) or (1L shl (Volatile - 67)) or (1L shl (Wchar - 67)) or (1L shl (LeftParen - 67)) or (1L shl (LeftBracket - 67)) or (1L shl (Star - 67)) or (1L shl (And - 67)) or (1L shl (Tilde - 67)) or (1L shl (AndAnd - 67)) or (1L shl (Colon - 67)) or (1L shl (Doublecolon - 67)) or (1L shl (Semi - 67)) or (1L shl (Ellipsis - 67)) or (1L shl (Identifier - 67)))) != 0L)) {
				if (true){
				this.state = 2008
				memberspecification()
				}
			}

			}}
			else -> throw NoViableAltException(this)
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

	open class MemberdeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_memberdeclaration.id
	        set(value) { throw RuntimeException() }
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findDeclspecifierseq() : DeclspecifierseqContext? = getRuleContext(solver.getType("DeclspecifierseqContext"),0)
		fun findMemberdeclaratorlist() : MemberdeclaratorlistContext? = getRuleContext(solver.getType("MemberdeclaratorlistContext"),0)
		fun findFunctiondefinition() : FunctiondefinitionContext? = getRuleContext(solver.getType("FunctiondefinitionContext"),0)
		fun findUsingdeclaration() : UsingdeclarationContext? = getRuleContext(solver.getType("UsingdeclarationContext"),0)
		fun findStatic_assertdeclaration() : Static_assertdeclarationContext? = getRuleContext(solver.getType("Static_assertdeclarationContext"),0)
		fun findTemplatedeclaration() : TemplatedeclarationContext? = getRuleContext(solver.getType("TemplatedeclarationContext"),0)
		fun findAliasdeclaration() : AliasdeclarationContext? = getRuleContext(solver.getType("AliasdeclarationContext"),0)
		fun findEmptydeclaration() : EmptydeclarationContext? = getRuleContext(solver.getType("EmptydeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMemberdeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMemberdeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMemberdeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  memberdeclaration() : MemberdeclarationContext {
		var _localctx : MemberdeclarationContext = MemberdeclarationContext(context, state)
		enterRule(_localctx, 302, Rules.RULE_memberdeclaration.id)
		var _la: Int
		try {
			this.state = 2029
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,248,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2014
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,245,context) ) {
			1   -> if (true){
			this.state = 2013
			attributespecifierseq(0)
			}
			}
			this.state = 2017
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,246,context) ) {
			1   -> if (true){
			this.state = 2016
			declspecifierseq()
			}
			}
			this.state = 2020
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignas) or (1L shl Decltype) or (1L shl Operator))) != 0L) || ((((_la - 78)) and 0x3f.inv()) == 0 && ((1L shl (_la - 78)) and ((1L shl (LeftParen - 78)) or (1L shl (LeftBracket - 78)) or (1L shl (Star - 78)) or (1L shl (And - 78)) or (1L shl (Tilde - 78)) or (1L shl (AndAnd - 78)) or (1L shl (Colon - 78)) or (1L shl (Doublecolon - 78)) or (1L shl (Ellipsis - 78)) or (1L shl (Identifier - 78)))) != 0L)) {
				if (true){
				this.state = 2019
				memberdeclaratorlist(0)
				}
			}

			this.state = 2022
			match(Semi) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2023
			functiondefinition()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2024
			usingdeclaration()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 2025
			static_assertdeclaration()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 2026
			templatedeclaration()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 2027
			aliasdeclaration()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 2028
			emptydeclaration()
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

	open class MemberdeclaratorlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_memberdeclaratorlist.id
	        set(value) { throw RuntimeException() }
		fun findMemberdeclarator() : MemberdeclaratorContext? = getRuleContext(solver.getType("MemberdeclaratorContext"),0)
		fun findMemberdeclaratorlist() : MemberdeclaratorlistContext? = getRuleContext(solver.getType("MemberdeclaratorlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMemberdeclaratorlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMemberdeclaratorlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMemberdeclaratorlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun memberdeclaratorlist() : MemberdeclaratorlistContext {
		return memberdeclaratorlist(0);
	}

	private fun memberdeclaratorlist(_p: Int) : MemberdeclaratorlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : MemberdeclaratorlistContext= MemberdeclaratorlistContext(context, _parentState)
		var _prevctx : MemberdeclaratorlistContext= _localctx
		var _startState : Int = 304
		enterRecursionRule(_localctx, 304, Rules.RULE_memberdeclaratorlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2032
			memberdeclarator()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2039
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,249,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = MemberdeclaratorlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_memberdeclaratorlist.id)
					this.state = 2034
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2035
					match(Comma) as Token
					this.state = 2036
					memberdeclarator()
					}
					} 
				}
				this.state = 2041
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,249,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class MemberdeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_memberdeclarator.id
	        set(value) { throw RuntimeException() }
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findVirtspecifierseq() : VirtspecifierseqContext? = getRuleContext(solver.getType("VirtspecifierseqContext"),0)
		fun findPurespecifier() : PurespecifierContext? = getRuleContext(solver.getType("PurespecifierContext"),0)
		fun findBraceorequalinitializer() : BraceorequalinitializerContext? = getRuleContext(solver.getType("BraceorequalinitializerContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMemberdeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMemberdeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMemberdeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  memberdeclarator() : MemberdeclaratorContext {
		var _localctx : MemberdeclaratorContext = MemberdeclaratorContext(context, state)
		enterRule(_localctx, 306, Rules.RULE_memberdeclarator.id)
		var _la: Int
		try {
			this.state = 2061
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,255,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2042
			declarator()
			this.state = 2044
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,250,context) ) {
			1   -> if (true){
			this.state = 2043
			virtspecifierseq(0)
			}
			}
			this.state = 2047
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,251,context) ) {
			1   -> if (true){
			this.state = 2046
			purespecifier()
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2049
			declarator()
			this.state = 2051
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,252,context) ) {
			1   -> if (true){
			this.state = 2050
			braceorequalinitializer()
			}
			}
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2054
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 2053
				match(Identifier) as Token
				}
			}

			this.state = 2057
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2056
				attributespecifierseq(0)
				}
			}

			this.state = 2059
			match(Colon) as Token
			this.state = 2060
			constantexpression()
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

	open class VirtspecifierseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_virtspecifierseq.id
	        set(value) { throw RuntimeException() }
		fun findVirtspecifier() : VirtspecifierContext? = getRuleContext(solver.getType("VirtspecifierContext"),0)
		fun findVirtspecifierseq() : VirtspecifierseqContext? = getRuleContext(solver.getType("VirtspecifierseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterVirtspecifierseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitVirtspecifierseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitVirtspecifierseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun virtspecifierseq() : VirtspecifierseqContext {
		return virtspecifierseq(0);
	}

	private fun virtspecifierseq(_p: Int) : VirtspecifierseqContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : VirtspecifierseqContext= VirtspecifierseqContext(context, _parentState)
		var _prevctx : VirtspecifierseqContext= _localctx
		var _startState : Int = 308
		enterRecursionRule(_localctx, 308, Rules.RULE_virtspecifierseq.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2064
			virtspecifier()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2070
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,256,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = VirtspecifierseqContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_virtspecifierseq.id)
					this.state = 2066
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2067
					virtspecifier()
					}
					} 
				}
				this.state = 2072
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,256,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class VirtspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_virtspecifier.id
	        set(value) { throw RuntimeException() }
		fun Override() : TerminalNode? = getToken(CPP14Parser.Tokens.Override.id, 0)
		fun Final() : TerminalNode? = getToken(CPP14Parser.Tokens.Final.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterVirtspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitVirtspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitVirtspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  virtspecifier() : VirtspecifierContext {
		var _localctx : VirtspecifierContext = VirtspecifierContext(context, state)
		enterRule(_localctx, 310, Rules.RULE_virtspecifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2073
			_la = _input!!.LA(1)
			if ( !(_la==Final || _la==Override) ) {
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

	open class PurespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_purespecifier.id
	        set(value) { throw RuntimeException() }
		var val: Token? = null
		fun Assign() : TerminalNode? = getToken(CPP14Parser.Tokens.Assign.id, 0)
		fun Octalliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Octalliteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPurespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPurespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPurespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  purespecifier() : PurespecifierContext {
		var _localctx : PurespecifierContext = PurespecifierContext(context, state)
		enterRule(_localctx, 312, Rules.RULE_purespecifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2075
			match(Assign) as Token
			this.state = 2076
			(_localctx as PurespecifierContext).val = match(Octalliteral) as Token
			if(((_localctx as PurespecifierContext).val?.text).compareTo("0")!=0) throw new InputMismatchException(this);
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

	open class BaseclauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_baseclause.id
	        set(value) { throw RuntimeException() }
		fun findBasespecifierlist() : BasespecifierlistContext? = getRuleContext(solver.getType("BasespecifierlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBaseclause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBaseclause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBaseclause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  baseclause() : BaseclauseContext {
		var _localctx : BaseclauseContext = BaseclauseContext(context, state)
		enterRule(_localctx, 314, Rules.RULE_baseclause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2079
			match(Colon) as Token
			this.state = 2080
			basespecifierlist(0)
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

	open class BasespecifierlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_basespecifierlist.id
	        set(value) { throw RuntimeException() }
		fun findBasespecifier() : BasespecifierContext? = getRuleContext(solver.getType("BasespecifierContext"),0)
		fun findBasespecifierlist() : BasespecifierlistContext? = getRuleContext(solver.getType("BasespecifierlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBasespecifierlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBasespecifierlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBasespecifierlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun basespecifierlist() : BasespecifierlistContext {
		return basespecifierlist(0);
	}

	private fun basespecifierlist(_p: Int) : BasespecifierlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : BasespecifierlistContext= BasespecifierlistContext(context, _parentState)
		var _prevctx : BasespecifierlistContext= _localctx
		var _startState : Int = 316
		enterRecursionRule(_localctx, 316, Rules.RULE_basespecifierlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2083
			basespecifier()
			this.state = 2085
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,257,context) ) {
			1   -> if (true){
			this.state = 2084
			match(Ellipsis) as Token
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2095
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,259,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = BasespecifierlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_basespecifierlist.id)
					this.state = 2087
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2088
					match(Comma) as Token
					this.state = 2089
					basespecifier()
					this.state = 2091
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,258,context) ) {
					1   -> if (true){
					this.state = 2090
					match(Ellipsis) as Token
					}
					}
					}
					} 
				}
				this.state = 2097
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,259,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class BasespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_basespecifier.id
	        set(value) { throw RuntimeException() }
		fun findBasetypespecifier() : BasetypespecifierContext? = getRuleContext(solver.getType("BasetypespecifierContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun Virtual() : TerminalNode? = getToken(CPP14Parser.Tokens.Virtual.id, 0)
		fun findAccessspecifier() : AccessspecifierContext? = getRuleContext(solver.getType("AccessspecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBasespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBasespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBasespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  basespecifier() : BasespecifierContext {
		var _localctx : BasespecifierContext = BasespecifierContext(context, state)
		enterRule(_localctx, 318, Rules.RULE_basespecifier.id)
		var _la: Int
		try {
			this.state = 2119
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,265,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2099
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2098
				attributespecifierseq(0)
				}
			}

			this.state = 2101
			basetypespecifier()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2103
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2102
				attributespecifierseq(0)
				}
			}

			this.state = 2105
			match(Virtual) as Token
			this.state = 2107
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Private) or (1L shl Protected) or (1L shl Public))) != 0L)) {
				if (true){
				this.state = 2106
				accessspecifier()
				}
			}

			this.state = 2109
			basetypespecifier()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2111
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2110
				attributespecifierseq(0)
				}
			}

			this.state = 2113
			accessspecifier()
			this.state = 2115
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Virtual) {
				if (true){
				this.state = 2114
				match(Virtual) as Token
				}
			}

			this.state = 2117
			basetypespecifier()
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

	open class ClassordecltypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classordecltype.id
	        set(value) { throw RuntimeException() }
		fun findClassname() : ClassnameContext? = getRuleContext(solver.getType("ClassnameContext"),0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun findDecltypespecifier() : DecltypespecifierContext? = getRuleContext(solver.getType("DecltypespecifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterClassordecltype(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitClassordecltype(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitClassordecltype(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classordecltype() : ClassordecltypeContext {
		var _localctx : ClassordecltypeContext = ClassordecltypeContext(context, state)
		enterRule(_localctx, 320, Rules.RULE_classordecltype.id)
		try {
			this.state = 2126
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,267,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2122
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,266,context) ) {
			1   -> if (true){
			this.state = 2121
			nestednamespecifier(0)
			}
			}
			this.state = 2124
			classname()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2125
			decltypespecifier()
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

	open class BasetypespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_basetypespecifier.id
	        set(value) { throw RuntimeException() }
		fun findClassordecltype() : ClassordecltypeContext? = getRuleContext(solver.getType("ClassordecltypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBasetypespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBasetypespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBasetypespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  basetypespecifier() : BasetypespecifierContext {
		var _localctx : BasetypespecifierContext = BasetypespecifierContext(context, state)
		enterRule(_localctx, 322, Rules.RULE_basetypespecifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2128
			classordecltype()
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

	open class AccessspecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_accessspecifier.id
	        set(value) { throw RuntimeException() }
		fun Private() : TerminalNode? = getToken(CPP14Parser.Tokens.Private.id, 0)
		fun Protected() : TerminalNode? = getToken(CPP14Parser.Tokens.Protected.id, 0)
		fun Public() : TerminalNode? = getToken(CPP14Parser.Tokens.Public.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterAccessspecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitAccessspecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitAccessspecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  accessspecifier() : AccessspecifierContext {
		var _localctx : AccessspecifierContext = AccessspecifierContext(context, state)
		enterRule(_localctx, 324, Rules.RULE_accessspecifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2130
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Private) or (1L shl Protected) or (1L shl Public))) != 0L)) ) {
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

	open class ConversionfunctionidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_conversionfunctionid.id
	        set(value) { throw RuntimeException() }
		fun Operator() : TerminalNode? = getToken(CPP14Parser.Tokens.Operator.id, 0)
		fun findConversiontypeid() : ConversiontypeidContext? = getRuleContext(solver.getType("ConversiontypeidContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterConversionfunctionid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitConversionfunctionid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitConversionfunctionid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  conversionfunctionid() : ConversionfunctionidContext {
		var _localctx : ConversionfunctionidContext = ConversionfunctionidContext(context, state)
		enterRule(_localctx, 326, Rules.RULE_conversionfunctionid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2132
			match(Operator) as Token
			this.state = 2133
			conversiontypeid()
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

	open class ConversiontypeidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_conversiontypeid.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		fun findConversiondeclarator() : ConversiondeclaratorContext? = getRuleContext(solver.getType("ConversiondeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterConversiontypeid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitConversiontypeid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitConversiontypeid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  conversiontypeid() : ConversiontypeidContext {
		var _localctx : ConversiontypeidContext = ConversiontypeidContext(context, state)
		enterRule(_localctx, 328, Rules.RULE_conversiontypeid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2135
			typespecifierseq()
			this.state = 2137
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,268,context) ) {
			1   -> if (true){
			this.state = 2136
			conversiondeclarator()
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

	open class ConversiondeclaratorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_conversiondeclarator.id
	        set(value) { throw RuntimeException() }
		fun findPtroperator() : PtroperatorContext? = getRuleContext(solver.getType("PtroperatorContext"),0)
		fun findConversiondeclarator() : ConversiondeclaratorContext? = getRuleContext(solver.getType("ConversiondeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterConversiondeclarator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitConversiondeclarator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitConversiondeclarator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  conversiondeclarator() : ConversiondeclaratorContext {
		var _localctx : ConversiondeclaratorContext = ConversiondeclaratorContext(context, state)
		enterRule(_localctx, 330, Rules.RULE_conversiondeclarator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2139
			ptroperator()
			this.state = 2141
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,269,context) ) {
			1   -> if (true){
			this.state = 2140
			conversiondeclarator()
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

	open class CtorinitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ctorinitializer.id
	        set(value) { throw RuntimeException() }
		fun findMeminitializerlist() : MeminitializerlistContext? = getRuleContext(solver.getType("MeminitializerlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterCtorinitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitCtorinitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitCtorinitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ctorinitializer() : CtorinitializerContext {
		var _localctx : CtorinitializerContext = CtorinitializerContext(context, state)
		enterRule(_localctx, 332, Rules.RULE_ctorinitializer.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2143
			match(Colon) as Token
			this.state = 2144
			meminitializerlist()
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

	open class MeminitializerlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_meminitializerlist.id
	        set(value) { throw RuntimeException() }
		fun findMeminitializer() : MeminitializerContext? = getRuleContext(solver.getType("MeminitializerContext"),0)
		fun findMeminitializerlist() : MeminitializerlistContext? = getRuleContext(solver.getType("MeminitializerlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMeminitializerlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMeminitializerlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMeminitializerlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  meminitializerlist() : MeminitializerlistContext {
		var _localctx : MeminitializerlistContext = MeminitializerlistContext(context, state)
		enterRule(_localctx, 334, Rules.RULE_meminitializerlist.id)
		var _la: Int
		try {
			this.state = 2157
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,272,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2146
			meminitializer()
			this.state = 2148
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 2147
				match(Ellipsis) as Token
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2150
			meminitializer()
			this.state = 2152
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Ellipsis) {
				if (true){
				this.state = 2151
				match(Ellipsis) as Token
				}
			}

			this.state = 2154
			match(Comma) as Token
			this.state = 2155
			meminitializerlist()
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

	open class MeminitializerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_meminitializer.id
	        set(value) { throw RuntimeException() }
		fun findMeminitializerid() : MeminitializeridContext? = getRuleContext(solver.getType("MeminitializeridContext"),0)
		fun findExpressionlist() : ExpressionlistContext? = getRuleContext(solver.getType("ExpressionlistContext"),0)
		fun findBracedinitlist() : BracedinitlistContext? = getRuleContext(solver.getType("BracedinitlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMeminitializer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMeminitializer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMeminitializer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  meminitializer() : MeminitializerContext {
		var _localctx : MeminitializerContext = MeminitializerContext(context, state)
		enterRule(_localctx, 336, Rules.RULE_meminitializer.id)
		var _la: Int
		try {
			this.state = 2169
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,274,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2159
			meminitializerid()
			this.state = 2160
			match(LeftParen) as Token
			this.state = 2162
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl This))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (Throw - 64)) or (1L shl (True - 64)) or (1L shl (Typeid - 64)) or (1L shl (Typename - 64)) or (1L shl (Unsigned - 64)) or (1L shl (Void - 64)) or (1L shl (Wchar - 64)) or (1L shl (LeftParen - 64)) or (1L shl (LeftBracket - 64)) or (1L shl (LeftBrace - 64)) or (1L shl (Plus - 64)) or (1L shl (Minus - 64)) or (1L shl (Star - 64)) or (1L shl (And - 64)) or (1L shl (Or - 64)) or (1L shl (Tilde - 64)) or (1L shl (Not - 64)) or (1L shl (PlusPlus - 64)) or (1L shl (MinusMinus - 64)) or (1L shl (Doublecolon - 64)) or (1L shl (Identifier - 64)) or (1L shl (Integerliteral - 64)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 2161
				expressionlist()
				}
			}

			this.state = 2164
			match(RightParen) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2166
			meminitializerid()
			this.state = 2167
			bracedinitlist()
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

	open class MeminitializeridContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_meminitializerid.id
	        set(value) { throw RuntimeException() }
		fun findClassordecltype() : ClassordecltypeContext? = getRuleContext(solver.getType("ClassordecltypeContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterMeminitializerid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitMeminitializerid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitMeminitializerid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  meminitializerid() : MeminitializeridContext {
		var _localctx : MeminitializeridContext = MeminitializeridContext(context, state)
		enterRule(_localctx, 338, Rules.RULE_meminitializerid.id)
		try {
			this.state = 2173
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,275,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2171
			classordecltype()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2172
			match(Identifier) as Token
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

	open class OperatorfunctionidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_operatorfunctionid.id
	        set(value) { throw RuntimeException() }
		fun Operator() : TerminalNode? = getToken(CPP14Parser.Tokens.Operator.id, 0)
		fun findTheoperator() : TheoperatorContext? = getRuleContext(solver.getType("TheoperatorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterOperatorfunctionid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitOperatorfunctionid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitOperatorfunctionid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  operatorfunctionid() : OperatorfunctionidContext {
		var _localctx : OperatorfunctionidContext = OperatorfunctionidContext(context, state)
		enterRule(_localctx, 340, Rules.RULE_operatorfunctionid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2175
			match(Operator) as Token
			this.state = 2176
			theoperator()
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

	open class LiteraloperatoridContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literaloperatorid.id
	        set(value) { throw RuntimeException() }
		fun Operator() : TerminalNode? = getToken(CPP14Parser.Tokens.Operator.id, 0)
		fun Stringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Stringliteral.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun Userdefinedstringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Userdefinedstringliteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLiteraloperatorid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLiteraloperatorid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLiteraloperatorid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literaloperatorid() : LiteraloperatoridContext {
		var _localctx : LiteraloperatoridContext = LiteraloperatoridContext(context, state)
		enterRule(_localctx, 342, Rules.RULE_literaloperatorid.id)
		try {
			this.state = 2183
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,276,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2178
			match(Operator) as Token
			this.state = 2179
			match(Stringliteral) as Token
			this.state = 2180
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2181
			match(Operator) as Token
			this.state = 2182
			match(Userdefinedstringliteral) as Token
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

	open class TemplatedeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templatedeclaration.id
	        set(value) { throw RuntimeException() }
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findTemplateparameterlist() : TemplateparameterlistContext? = getRuleContext(solver.getType("TemplateparameterlistContext"),0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplatedeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplatedeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplatedeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  templatedeclaration() : TemplatedeclarationContext {
		var _localctx : TemplatedeclarationContext = TemplatedeclarationContext(context, state)
		enterRule(_localctx, 344, Rules.RULE_templatedeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2185
			match(Template) as Token
			this.state = 2186
			match(Less) as Token
			this.state = 2187
			templateparameterlist(0)
			this.state = 2188
			match(Greater) as Token
			this.state = 2189
			declaration()
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

	open class TemplateparameterlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templateparameterlist.id
	        set(value) { throw RuntimeException() }
		fun findTemplateparameter() : TemplateparameterContext? = getRuleContext(solver.getType("TemplateparameterContext"),0)
		fun findTemplateparameterlist() : TemplateparameterlistContext? = getRuleContext(solver.getType("TemplateparameterlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplateparameterlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplateparameterlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplateparameterlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun templateparameterlist() : TemplateparameterlistContext {
		return templateparameterlist(0);
	}

	private fun templateparameterlist(_p: Int) : TemplateparameterlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : TemplateparameterlistContext= TemplateparameterlistContext(context, _parentState)
		var _prevctx : TemplateparameterlistContext= _localctx
		var _startState : Int = 346
		enterRecursionRule(_localctx, 346, Rules.RULE_templateparameterlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2192
			templateparameter()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2199
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,277,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TemplateparameterlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_templateparameterlist.id)
					this.state = 2194
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2195
					match(Comma) as Token
					this.state = 2196
					templateparameter()
					}
					} 
				}
				this.state = 2201
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,277,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TemplateparameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templateparameter.id
	        set(value) { throw RuntimeException() }
		fun findTypeparameter() : TypeparameterContext? = getRuleContext(solver.getType("TypeparameterContext"),0)
		fun findParameterdeclaration() : ParameterdeclarationContext? = getRuleContext(solver.getType("ParameterdeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplateparameter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplateparameter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplateparameter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  templateparameter() : TemplateparameterContext {
		var _localctx : TemplateparameterContext = TemplateparameterContext(context, state)
		enterRule(_localctx, 348, Rules.RULE_templateparameter.id)
		try {
			this.state = 2204
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,278,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2202
			typeparameter()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2203
			parameterdeclaration()
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

	open class TypeparameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeparameter.id
	        set(value) { throw RuntimeException() }
		fun Class() : TerminalNode? = getToken(CPP14Parser.Tokens.Class.id, 0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun Typename() : TerminalNode? = getToken(CPP14Parser.Tokens.Typename.id, 0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findTemplateparameterlist() : TemplateparameterlistContext? = getRuleContext(solver.getType("TemplateparameterlistContext"),0)
		fun findIdexpression() : IdexpressionContext? = getRuleContext(solver.getType("IdexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypeparameter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypeparameter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypeparameter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeparameter() : TypeparameterContext {
		var _localctx : TypeparameterContext = TypeparameterContext(context, state)
		enterRule(_localctx, 350, Rules.RULE_typeparameter.id)
		var _la: Int
		try {
			this.state = 2254
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,288,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2206
			match(Class) as Token
			this.state = 2208
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,279,context) ) {
			1   -> if (true){
			this.state = 2207
			match(Ellipsis) as Token
			}
			}
			this.state = 2211
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,280,context) ) {
			1   -> if (true){
			this.state = 2210
			match(Identifier) as Token
			}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2213
			match(Class) as Token
			this.state = 2215
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 2214
				match(Identifier) as Token
				}
			}

			this.state = 2217
			match(Assign) as Token
			this.state = 2218
			thetypeid()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2219
			match(Typename) as Token
			this.state = 2221
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,282,context) ) {
			1   -> if (true){
			this.state = 2220
			match(Ellipsis) as Token
			}
			}
			this.state = 2224
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,283,context) ) {
			1   -> if (true){
			this.state = 2223
			match(Identifier) as Token
			}
			}
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 2226
			match(Typename) as Token
			this.state = 2228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 2227
				match(Identifier) as Token
				}
			}

			this.state = 2230
			match(Assign) as Token
			this.state = 2231
			thetypeid()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 2232
			match(Template) as Token
			this.state = 2233
			match(Less) as Token
			this.state = 2234
			templateparameterlist(0)
			this.state = 2235
			match(Greater) as Token
			this.state = 2236
			match(Class) as Token
			this.state = 2238
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,285,context) ) {
			1   -> if (true){
			this.state = 2237
			match(Ellipsis) as Token
			}
			}
			this.state = 2241
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,286,context) ) {
			1   -> if (true){
			this.state = 2240
			match(Identifier) as Token
			}
			}
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 2243
			match(Template) as Token
			this.state = 2244
			match(Less) as Token
			this.state = 2245
			templateparameterlist(0)
			this.state = 2246
			match(Greater) as Token
			this.state = 2247
			match(Class) as Token
			this.state = 2249
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 2248
				match(Identifier) as Token
				}
			}

			this.state = 2251
			match(Assign) as Token
			this.state = 2252
			idexpression()
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

	open class SimpletemplateidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simpletemplateid.id
	        set(value) { throw RuntimeException() }
		fun findTemplatename() : TemplatenameContext? = getRuleContext(solver.getType("TemplatenameContext"),0)
		fun findTemplateargumentlist() : TemplateargumentlistContext? = getRuleContext(solver.getType("TemplateargumentlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterSimpletemplateid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitSimpletemplateid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitSimpletemplateid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simpletemplateid() : SimpletemplateidContext {
		var _localctx : SimpletemplateidContext = SimpletemplateidContext(context, state)
		enterRule(_localctx, 352, Rules.RULE_simpletemplateid.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2256
			templatename()
			this.state = 2257
			match(Less) as Token
			this.state = 2259
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl Enum) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl Struct) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Union - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Volatile - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 2258
				templateargumentlist(0)
				}
			}

			this.state = 2261
			match(Greater) as Token
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

	open class TemplateidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templateid.id
	        set(value) { throw RuntimeException() }
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun findOperatorfunctionid() : OperatorfunctionidContext? = getRuleContext(solver.getType("OperatorfunctionidContext"),0)
		fun findTemplateargumentlist() : TemplateargumentlistContext? = getRuleContext(solver.getType("TemplateargumentlistContext"),0)
		fun findLiteraloperatorid() : LiteraloperatoridContext? = getRuleContext(solver.getType("LiteraloperatoridContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplateid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplateid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplateid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  templateid() : TemplateidContext {
		var _localctx : TemplateidContext = TemplateidContext(context, state)
		enterRule(_localctx, 354, Rules.RULE_templateid.id)
		var _la: Int
		try {
			this.state = 2278
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,292,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2263
			simpletemplateid()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2264
			operatorfunctionid()
			this.state = 2265
			match(Less) as Token
			this.state = 2267
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl Enum) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl Struct) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Union - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Volatile - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 2266
				templateargumentlist(0)
				}
			}

			this.state = 2269
			match(Greater) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2271
			literaloperatorid()
			this.state = 2272
			match(Less) as Token
			this.state = 2274
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Alignof) or (1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Const_cast) or (1L shl Decltype) or (1L shl Delete) or (1L shl Double) or (1L shl Dynamic_cast) or (1L shl Enum) or (1L shl False) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl New) or (1L shl Noexcept) or (1L shl Nullptr) or (1L shl Operator) or (1L shl Reinterpret_cast) or (1L shl Short) or (1L shl Signed) or (1L shl Sizeof) or (1L shl Static_cast) or (1L shl Struct) or (1L shl This))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (True - 65)) or (1L shl (Typeid - 65)) or (1L shl (Typename - 65)) or (1L shl (Union - 65)) or (1L shl (Unsigned - 65)) or (1L shl (Void - 65)) or (1L shl (Volatile - 65)) or (1L shl (Wchar - 65)) or (1L shl (LeftParen - 65)) or (1L shl (LeftBracket - 65)) or (1L shl (Plus - 65)) or (1L shl (Minus - 65)) or (1L shl (Star - 65)) or (1L shl (And - 65)) or (1L shl (Or - 65)) or (1L shl (Tilde - 65)) or (1L shl (Not - 65)) or (1L shl (PlusPlus - 65)) or (1L shl (MinusMinus - 65)) or (1L shl (Doublecolon - 65)) or (1L shl (Identifier - 65)) or (1L shl (Integerliteral - 65)))) != 0L) || ((((_la - 132)) and 0x3f.inv()) == 0 && ((1L shl (_la - 132)) and ((1L shl (Characterliteral - 132)) or (1L shl (Floatingliteral - 132)) or (1L shl (Stringliteral - 132)) or (1L shl (Userdefinedintegerliteral - 132)) or (1L shl (Userdefinedfloatingliteral - 132)) or (1L shl (Userdefinedstringliteral - 132)) or (1L shl (Userdefinedcharacterliteral - 132)))) != 0L)) {
				if (true){
				this.state = 2273
				templateargumentlist(0)
				}
			}

			this.state = 2276
			match(Greater) as Token
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

	open class TemplatenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templatename.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplatename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplatename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplatename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  templatename() : TemplatenameContext {
		var _localctx : TemplatenameContext = TemplatenameContext(context, state)
		enterRule(_localctx, 356, Rules.RULE_templatename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2280
			match(Identifier) as Token
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

	open class TemplateargumentlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templateargumentlist.id
	        set(value) { throw RuntimeException() }
		fun findTemplateargument() : TemplateargumentContext? = getRuleContext(solver.getType("TemplateargumentContext"),0)
		fun findTemplateargumentlist() : TemplateargumentlistContext? = getRuleContext(solver.getType("TemplateargumentlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplateargumentlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplateargumentlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplateargumentlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun templateargumentlist() : TemplateargumentlistContext {
		return templateargumentlist(0);
	}

	private fun templateargumentlist(_p: Int) : TemplateargumentlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : TemplateargumentlistContext= TemplateargumentlistContext(context, _parentState)
		var _prevctx : TemplateargumentlistContext= _localctx
		var _startState : Int = 358
		enterRecursionRule(_localctx, 358, Rules.RULE_templateargumentlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2283
			templateargument()
			this.state = 2285
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,293,context) ) {
			1   -> if (true){
			this.state = 2284
			match(Ellipsis) as Token
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2295
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,295,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TemplateargumentlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_templateargumentlist.id)
					this.state = 2287
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2288
					match(Comma) as Token
					this.state = 2289
					templateargument()
					this.state = 2291
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,294,context) ) {
					1   -> if (true){
					this.state = 2290
					match(Ellipsis) as Token
					}
					}
					}
					} 
				}
				this.state = 2297
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,295,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TemplateargumentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_templateargument.id
	        set(value) { throw RuntimeException() }
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		fun findIdexpression() : IdexpressionContext? = getRuleContext(solver.getType("IdexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTemplateargument(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTemplateargument(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTemplateargument(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  templateargument() : TemplateargumentContext {
		var _localctx : TemplateargumentContext = TemplateargumentContext(context, state)
		enterRule(_localctx, 360, Rules.RULE_templateargument.id)
		try {
			this.state = 2301
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,296,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2298
			thetypeid()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2299
			constantexpression()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2300
			idexpression()
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

	open class TypenamespecifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typenamespecifier.id
	        set(value) { throw RuntimeException() }
		fun Typename() : TerminalNode? = getToken(CPP14Parser.Tokens.Typename.id, 0)
		fun findNestednamespecifier() : NestednamespecifierContext? = getRuleContext(solver.getType("NestednamespecifierContext"),0)
		fun Identifier() : TerminalNode? = getToken(CPP14Parser.Tokens.Identifier.id, 0)
		fun findSimpletemplateid() : SimpletemplateidContext? = getRuleContext(solver.getType("SimpletemplateidContext"),0)
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypenamespecifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypenamespecifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypenamespecifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typenamespecifier() : TypenamespecifierContext {
		var _localctx : TypenamespecifierContext = TypenamespecifierContext(context, state)
		enterRule(_localctx, 362, Rules.RULE_typenamespecifier.id)
		var _la: Int
		try {
			this.state = 2314
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,298,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2303
			match(Typename) as Token
			this.state = 2304
			nestednamespecifier(0)
			this.state = 2305
			match(Identifier) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2307
			match(Typename) as Token
			this.state = 2308
			nestednamespecifier(0)
			this.state = 2310
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Template) {
				if (true){
				this.state = 2309
				match(Template) as Token
				}
			}

			this.state = 2312
			simpletemplateid()
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

	open class ExplicitinstantiationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_explicitinstantiation.id
	        set(value) { throw RuntimeException() }
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		fun Extern() : TerminalNode? = getToken(CPP14Parser.Tokens.Extern.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExplicitinstantiation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExplicitinstantiation(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExplicitinstantiation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  explicitinstantiation() : ExplicitinstantiationContext {
		var _localctx : ExplicitinstantiationContext = ExplicitinstantiationContext(context, state)
		enterRule(_localctx, 364, Rules.RULE_explicitinstantiation.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2317
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Extern) {
				if (true){
				this.state = 2316
				match(Extern) as Token
				}
			}

			this.state = 2319
			match(Template) as Token
			this.state = 2320
			declaration()
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

	open class ExplicitspecializationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_explicitspecialization.id
	        set(value) { throw RuntimeException() }
		fun Template() : TerminalNode? = getToken(CPP14Parser.Tokens.Template.id, 0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExplicitspecialization(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExplicitspecialization(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExplicitspecialization(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  explicitspecialization() : ExplicitspecializationContext {
		var _localctx : ExplicitspecializationContext = ExplicitspecializationContext(context, state)
		enterRule(_localctx, 366, Rules.RULE_explicitspecialization.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2322
			match(Template) as Token
			this.state = 2323
			match(Less) as Token
			this.state = 2324
			match(Greater) as Token
			this.state = 2325
			declaration()
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

	open class TryblockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryblock.id
	        set(value) { throw RuntimeException() }
		fun Try() : TerminalNode? = getToken(CPP14Parser.Tokens.Try.id, 0)
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		fun findHandlerseq() : HandlerseqContext? = getRuleContext(solver.getType("HandlerseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTryblock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTryblock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTryblock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryblock() : TryblockContext {
		var _localctx : TryblockContext = TryblockContext(context, state)
		enterRule(_localctx, 368, Rules.RULE_tryblock.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2327
			match(Try) as Token
			this.state = 2328
			compoundstatement()
			this.state = 2329
			handlerseq()
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

	open class FunctiontryblockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functiontryblock.id
	        set(value) { throw RuntimeException() }
		fun Try() : TerminalNode? = getToken(CPP14Parser.Tokens.Try.id, 0)
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		fun findHandlerseq() : HandlerseqContext? = getRuleContext(solver.getType("HandlerseqContext"),0)
		fun findCtorinitializer() : CtorinitializerContext? = getRuleContext(solver.getType("CtorinitializerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterFunctiontryblock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitFunctiontryblock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitFunctiontryblock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functiontryblock() : FunctiontryblockContext {
		var _localctx : FunctiontryblockContext = FunctiontryblockContext(context, state)
		enterRule(_localctx, 370, Rules.RULE_functiontryblock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2331
			match(Try) as Token
			this.state = 2333
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Colon) {
				if (true){
				this.state = 2332
				ctorinitializer()
				}
			}

			this.state = 2335
			compoundstatement()
			this.state = 2336
			handlerseq()
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

	open class HandlerseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_handlerseq.id
	        set(value) { throw RuntimeException() }
		fun findHandler() : HandlerContext? = getRuleContext(solver.getType("HandlerContext"),0)
		fun findHandlerseq() : HandlerseqContext? = getRuleContext(solver.getType("HandlerseqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterHandlerseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitHandlerseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitHandlerseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  handlerseq() : HandlerseqContext {
		var _localctx : HandlerseqContext = HandlerseqContext(context, state)
		enterRule(_localctx, 372, Rules.RULE_handlerseq.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2338
			handler()
			this.state = 2340
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,301,context) ) {
			1   -> if (true){
			this.state = 2339
			handlerseq()
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

	open class HandlerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_handler.id
	        set(value) { throw RuntimeException() }
		fun Catch() : TerminalNode? = getToken(CPP14Parser.Tokens.Catch.id, 0)
		fun findExceptiondeclaration() : ExceptiondeclarationContext? = getRuleContext(solver.getType("ExceptiondeclarationContext"),0)
		fun findCompoundstatement() : CompoundstatementContext? = getRuleContext(solver.getType("CompoundstatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterHandler(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitHandler(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitHandler(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  handler() : HandlerContext {
		var _localctx : HandlerContext = HandlerContext(context, state)
		enterRule(_localctx, 374, Rules.RULE_handler.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2342
			match(Catch) as Token
			this.state = 2343
			match(LeftParen) as Token
			this.state = 2344
			exceptiondeclaration()
			this.state = 2345
			match(RightParen) as Token
			this.state = 2346
			compoundstatement()
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

	open class ExceptiondeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exceptiondeclaration.id
	        set(value) { throw RuntimeException() }
		fun findTypespecifierseq() : TypespecifierseqContext? = getRuleContext(solver.getType("TypespecifierseqContext"),0)
		fun findDeclarator() : DeclaratorContext? = getRuleContext(solver.getType("DeclaratorContext"),0)
		fun findAttributespecifierseq() : AttributespecifierseqContext? = getRuleContext(solver.getType("AttributespecifierseqContext"),0)
		fun findAbstractdeclarator() : AbstractdeclaratorContext? = getRuleContext(solver.getType("AbstractdeclaratorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExceptiondeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExceptiondeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExceptiondeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exceptiondeclaration() : ExceptiondeclarationContext {
		var _localctx : ExceptiondeclarationContext = ExceptiondeclarationContext(context, state)
		enterRule(_localctx, 376, Rules.RULE_exceptiondeclaration.id)
		var _la: Int
		try {
			this.state = 2362
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,305,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2349
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2348
				attributespecifierseq(0)
				}
			}

			this.state = 2351
			typespecifierseq()
			this.state = 2352
			declarator()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2355
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Alignas || _la==LeftBracket) {
				if (true){
				this.state = 2354
				attributespecifierseq(0)
				}
			}

			this.state = 2357
			typespecifierseq()
			this.state = 2359
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Decltype || ((((_la - 78)) and 0x3f.inv()) == 0 && ((1L shl (_la - 78)) and ((1L shl (LeftParen - 78)) or (1L shl (LeftBracket - 78)) or (1L shl (Star - 78)) or (1L shl (And - 78)) or (1L shl (AndAnd - 78)) or (1L shl (Doublecolon - 78)) or (1L shl (Ellipsis - 78)) or (1L shl (Identifier - 78)))) != 0L)) {
				if (true){
				this.state = 2358
				abstractdeclarator()
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2361
			match(Ellipsis) as Token
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

	open class ThrowexpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_throwexpression.id
	        set(value) { throw RuntimeException() }
		fun Throw() : TerminalNode? = getToken(CPP14Parser.Tokens.Throw.id, 0)
		fun findAssignmentexpression() : AssignmentexpressionContext? = getRuleContext(solver.getType("AssignmentexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterThrowexpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitThrowexpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitThrowexpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  throwexpression() : ThrowexpressionContext {
		var _localctx : ThrowexpressionContext = ThrowexpressionContext(context, state)
		enterRule(_localctx, 378, Rules.RULE_throwexpression.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2364
			match(Throw) as Token
			this.state = 2366
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,306,context) ) {
			1   -> if (true){
			this.state = 2365
			assignmentexpression()
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

	open class ExceptionspecificationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exceptionspecification.id
	        set(value) { throw RuntimeException() }
		fun findDynamicexceptionspecification() : DynamicexceptionspecificationContext? = getRuleContext(solver.getType("DynamicexceptionspecificationContext"),0)
		fun findNoexceptspecification() : NoexceptspecificationContext? = getRuleContext(solver.getType("NoexceptspecificationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterExceptionspecification(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitExceptionspecification(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitExceptionspecification(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exceptionspecification() : ExceptionspecificationContext {
		var _localctx : ExceptionspecificationContext = ExceptionspecificationContext(context, state)
		enterRule(_localctx, 380, Rules.RULE_exceptionspecification.id)
		try {
			this.state = 2370
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Throw  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2368
			dynamicexceptionspecification()
			}}
			Noexcept  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2369
			noexceptspecification()
			}}
			else -> throw NoViableAltException(this)
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

	open class DynamicexceptionspecificationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dynamicexceptionspecification.id
	        set(value) { throw RuntimeException() }
		fun Throw() : TerminalNode? = getToken(CPP14Parser.Tokens.Throw.id, 0)
		fun findTypeidlist() : TypeidlistContext? = getRuleContext(solver.getType("TypeidlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterDynamicexceptionspecification(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitDynamicexceptionspecification(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitDynamicexceptionspecification(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dynamicexceptionspecification() : DynamicexceptionspecificationContext {
		var _localctx : DynamicexceptionspecificationContext = DynamicexceptionspecificationContext(context, state)
		enterRule(_localctx, 382, Rules.RULE_dynamicexceptionspecification.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2372
			match(Throw) as Token
			this.state = 2373
			match(LeftParen) as Token
			this.state = 2375
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Auto) or (1L shl Bool) or (1L shl Char) or (1L shl Char16) or (1L shl Char32) or (1L shl Class) or (1L shl Const) or (1L shl Decltype) or (1L shl Double) or (1L shl Enum) or (1L shl Float) or (1L shl Int) or (1L shl Long) or (1L shl Short) or (1L shl Signed) or (1L shl Struct))) != 0L) || ((((_la - 69)) and 0x3f.inv()) == 0 && ((1L shl (_la - 69)) and ((1L shl (Typename - 69)) or (1L shl (Union - 69)) or (1L shl (Unsigned - 69)) or (1L shl (Void - 69)) or (1L shl (Volatile - 69)) or (1L shl (Wchar - 69)) or (1L shl (Doublecolon - 69)) or (1L shl (Identifier - 69)))) != 0L)) {
				if (true){
				this.state = 2374
				typeidlist(0)
				}
			}

			this.state = 2377
			match(RightParen) as Token
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

	open class TypeidlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeidlist.id
	        set(value) { throw RuntimeException() }
		fun findThetypeid() : ThetypeidContext? = getRuleContext(solver.getType("ThetypeidContext"),0)
		fun findTypeidlist() : TypeidlistContext? = getRuleContext(solver.getType("TypeidlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTypeidlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTypeidlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTypeidlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun typeidlist() : TypeidlistContext {
		return typeidlist(0);
	}

	private fun typeidlist(_p: Int) : TypeidlistContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : TypeidlistContext= TypeidlistContext(context, _parentState)
		var _prevctx : TypeidlistContext= _localctx
		var _startState : Int = 384
		enterRecursionRule(_localctx, 384, Rules.RULE_typeidlist.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 2380
			thetypeid()
			this.state = 2382
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,309,context) ) {
			1   -> if (true){
			this.state = 2381
			match(Ellipsis) as Token
			}
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 2392
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,311,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TypeidlistContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_typeidlist.id)
					this.state = 2384
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 2385
					match(Comma) as Token
					this.state = 2386
					thetypeid()
					this.state = 2388
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,310,context) ) {
					1   -> if (true){
					this.state = 2387
					match(Ellipsis) as Token
					}
					}
					}
					} 
				}
				this.state = 2394
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,311,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class NoexceptspecificationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_noexceptspecification.id
	        set(value) { throw RuntimeException() }
		fun Noexcept() : TerminalNode? = getToken(CPP14Parser.Tokens.Noexcept.id, 0)
		fun findConstantexpression() : ConstantexpressionContext? = getRuleContext(solver.getType("ConstantexpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterNoexceptspecification(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitNoexceptspecification(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitNoexceptspecification(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  noexceptspecification() : NoexceptspecificationContext {
		var _localctx : NoexceptspecificationContext = NoexceptspecificationContext(context, state)
		enterRule(_localctx, 386, Rules.RULE_noexceptspecification.id)
		try {
			this.state = 2401
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,312,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2395
			match(Noexcept) as Token
			this.state = 2396
			match(LeftParen) as Token
			this.state = 2397
			constantexpression()
			this.state = 2398
			match(RightParen) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2400
			match(Noexcept) as Token
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

	open class RightShiftContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rightShift.id
	        set(value) { throw RuntimeException() }
		fun Greater() : List<TerminalNode> = getTokens(CPP14Parser.Tokens.Greater.id)
		fun Greater(i: Int) : TerminalNode = getToken(CPP14Parser.Tokens.Greater.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterRightShift(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitRightShift(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitRightShift(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rightShift() : RightShiftContext {
		var _localctx : RightShiftContext = RightShiftContext(context, state)
		enterRule(_localctx, 388, Rules.RULE_rightShift.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2403
			match(Greater) as Token
			this.state = 2404
			match(Greater) as Token
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

	open class RightShiftAssignContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rightShiftAssign.id
	        set(value) { throw RuntimeException() }
		fun Greater() : List<TerminalNode> = getTokens(CPP14Parser.Tokens.Greater.id)
		fun Greater(i: Int) : TerminalNode = getToken(CPP14Parser.Tokens.Greater.id, i) as TerminalNode
		fun Assign() : TerminalNode? = getToken(CPP14Parser.Tokens.Assign.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterRightShiftAssign(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitRightShiftAssign(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitRightShiftAssign(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rightShiftAssign() : RightShiftAssignContext {
		var _localctx : RightShiftAssignContext = RightShiftAssignContext(context, state)
		enterRule(_localctx, 390, Rules.RULE_rightShiftAssign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2406
			match(Greater) as Token
			this.state = 2407
			match(Greater) as Token
			this.state = 2408
			match(Assign) as Token
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

	open class TheoperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_theoperator.id
	        set(value) { throw RuntimeException() }
		fun New() : TerminalNode? = getToken(CPP14Parser.Tokens.New.id, 0)
		fun Delete() : TerminalNode? = getToken(CPP14Parser.Tokens.Delete.id, 0)
		fun findRightShift() : RightShiftContext? = getRuleContext(solver.getType("RightShiftContext"),0)
		fun findRightShiftAssign() : RightShiftAssignContext? = getRuleContext(solver.getType("RightShiftAssignContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterTheoperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitTheoperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitTheoperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  theoperator() : TheoperatorContext {
		var _localctx : TheoperatorContext = TheoperatorContext(context, state)
		enterRule(_localctx, 392, Rules.RULE_theoperator.id)
		try {
			this.state = 2458
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,313,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2410
			match(New) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2411
			match(Delete) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2412
			match(New) as Token
			this.state = 2413
			match(LeftBracket) as Token
			this.state = 2414
			match(RightBracket) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 2415
			match(Delete) as Token
			this.state = 2416
			match(LeftBracket) as Token
			this.state = 2417
			match(RightBracket) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 2418
			match(Plus) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 2419
			match(Minus) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 2420
			match(Star) as Token
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 2421
			match(Div) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 2422
			match(Mod) as Token
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 2423
			match(Caret) as Token
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 2424
			match(And) as Token
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 2425
			match(Or) as Token
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 2426
			match(Tilde) as Token
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 2427
			match(Not) as Token
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 2428
			match(Assign) as Token
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 2429
			match(Less) as Token
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 2430
			match(Greater) as Token
			}}
			18 -> {
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 2431
			match(PlusAssign) as Token
			}}
			19 -> {
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 2432
			match(MinusAssign) as Token
			}}
			20 -> {
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 2433
			match(StarAssign) as Token
			}}
			21 -> {
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 2434
			match(DivAssign) as Token
			}}
			22 -> {
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 2435
			match(ModAssign) as Token
			}}
			23 -> {
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 2436
			match(XorAssign) as Token
			}}
			24 -> {
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 2437
			match(AndAssign) as Token
			}}
			25 -> {
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 2438
			match(OrAssign) as Token
			}}
			26 -> {
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 2439
			match(LeftShift) as Token
			}}
			27 -> {
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 2440
			rightShift()
			}}
			28 -> {
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 2441
			rightShiftAssign()
			}}
			29 -> {
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 2442
			match(LeftShiftAssign) as Token
			}}
			30 -> {
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 2443
			match(Equal) as Token
			}}
			31 -> {
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 2444
			match(NotEqual) as Token
			}}
			32 -> {
			enterOuterAlt(_localctx, 32)
			if (true){
			this.state = 2445
			match(LessEqual) as Token
			}}
			33 -> {
			enterOuterAlt(_localctx, 33)
			if (true){
			this.state = 2446
			match(GreaterEqual) as Token
			}}
			34 -> {
			enterOuterAlt(_localctx, 34)
			if (true){
			this.state = 2447
			match(AndAnd) as Token
			}}
			35 -> {
			enterOuterAlt(_localctx, 35)
			if (true){
			this.state = 2448
			match(OrOr) as Token
			}}
			36 -> {
			enterOuterAlt(_localctx, 36)
			if (true){
			this.state = 2449
			match(PlusPlus) as Token
			}}
			37 -> {
			enterOuterAlt(_localctx, 37)
			if (true){
			this.state = 2450
			match(MinusMinus) as Token
			}}
			38 -> {
			enterOuterAlt(_localctx, 38)
			if (true){
			this.state = 2451
			match(Comma) as Token
			}}
			39 -> {
			enterOuterAlt(_localctx, 39)
			if (true){
			this.state = 2452
			match(ArrowStar) as Token
			}}
			40 -> {
			enterOuterAlt(_localctx, 40)
			if (true){
			this.state = 2453
			match(Arrow) as Token
			}}
			41 -> {
			enterOuterAlt(_localctx, 41)
			if (true){
			this.state = 2454
			match(LeftParen) as Token
			this.state = 2455
			match(RightParen) as Token
			}}
			42 -> {
			enterOuterAlt(_localctx, 42)
			if (true){
			this.state = 2456
			match(LeftBracket) as Token
			this.state = 2457
			match(RightBracket) as Token
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

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun Integerliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Integerliteral.id, 0)
		fun Characterliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Characterliteral.id, 0)
		fun Floatingliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Floatingliteral.id, 0)
		fun Stringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Stringliteral.id, 0)
		fun findBooleanliteral() : BooleanliteralContext? = getRuleContext(solver.getType("BooleanliteralContext"),0)
		fun findPointerliteral() : PointerliteralContext? = getRuleContext(solver.getType("PointerliteralContext"),0)
		fun findUserdefinedliteral() : UserdefinedliteralContext? = getRuleContext(solver.getType("UserdefinedliteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 394, Rules.RULE_literal.id)
		try {
			this.state = 2467
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Integerliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2460
			match(Integerliteral) as Token
			}}
			Characterliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 2461
			match(Characterliteral) as Token
			}}
			Floatingliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 2462
			match(Floatingliteral) as Token
			}}
			Stringliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 2463
			match(Stringliteral) as Token
			}}
			False , True  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 2464
			booleanliteral()
			}}
			Nullptr  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 2465
			pointerliteral()
			}}
			Userdefinedintegerliteral , Userdefinedfloatingliteral , Userdefinedstringliteral , Userdefinedcharacterliteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 2466
			userdefinedliteral()
			}}
			else -> throw NoViableAltException(this)
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

	open class BooleanliteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_booleanliteral.id
	        set(value) { throw RuntimeException() }
		fun False() : TerminalNode? = getToken(CPP14Parser.Tokens.False.id, 0)
		fun True() : TerminalNode? = getToken(CPP14Parser.Tokens.True.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterBooleanliteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitBooleanliteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitBooleanliteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  booleanliteral() : BooleanliteralContext {
		var _localctx : BooleanliteralContext = BooleanliteralContext(context, state)
		enterRule(_localctx, 396, Rules.RULE_booleanliteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2469
			_la = _input!!.LA(1)
			if ( !(_la==False || _la==True) ) {
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

	open class PointerliteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pointerliteral.id
	        set(value) { throw RuntimeException() }
		fun Nullptr() : TerminalNode? = getToken(CPP14Parser.Tokens.Nullptr.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterPointerliteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitPointerliteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitPointerliteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pointerliteral() : PointerliteralContext {
		var _localctx : PointerliteralContext = PointerliteralContext(context, state)
		enterRule(_localctx, 398, Rules.RULE_pointerliteral.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2471
			match(Nullptr) as Token
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

	open class UserdefinedliteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_userdefinedliteral.id
	        set(value) { throw RuntimeException() }
		fun Userdefinedintegerliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Userdefinedintegerliteral.id, 0)
		fun Userdefinedfloatingliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Userdefinedfloatingliteral.id, 0)
		fun Userdefinedstringliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Userdefinedstringliteral.id, 0)
		fun Userdefinedcharacterliteral() : TerminalNode? = getToken(CPP14Parser.Tokens.Userdefinedcharacterliteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).enterUserdefinedliteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CPP14Listener ) (listener as CPP14Listener).exitUserdefinedliteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CPP14Visitor ) return (visitor as CPP14Visitor<out T>).visitUserdefinedliteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  userdefinedliteral() : UserdefinedliteralContext {
		var _localctx : UserdefinedliteralContext = UserdefinedliteralContext(context, state)
		enterRule(_localctx, 400, Rules.RULE_userdefinedliteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2473
			_la = _input!!.LA(1)
			if ( !(((((_la - 135)) and 0x3f.inv()) == 0 && ((1L shl (_la - 135)) and ((1L shl (Userdefinedintegerliteral - 135)) or (1L shl (Userdefinedfloatingliteral - 135)) or (1L shl (Userdefinedstringliteral - 135)) or (1L shl (Userdefinedcharacterliteral - 135)))) != 0L)) ) {
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		5 -> return nestednamespecifier_sempred(_localctx as NestednamespecifierContext, predIndex)
		10 -> return capturelist_sempred(_localctx as CapturelistContext, predIndex)
		15 -> return postfixexpression_sempred(_localctx as PostfixexpressionContext, predIndex)
		26 -> return noptrnewdeclarator_sempred(_localctx as NoptrnewdeclaratorContext, predIndex)
		31 -> return pmexpression_sempred(_localctx as PmexpressionContext, predIndex)
		32 -> return multiplicativeexpression_sempred(_localctx as MultiplicativeexpressionContext, predIndex)
		33 -> return additiveexpression_sempred(_localctx as AdditiveexpressionContext, predIndex)
		34 -> return shiftexpression_sempred(_localctx as ShiftexpressionContext, predIndex)
		35 -> return relationalexpression_sempred(_localctx as RelationalexpressionContext, predIndex)
		36 -> return equalityexpression_sempred(_localctx as EqualityexpressionContext, predIndex)
		37 -> return andexpression_sempred(_localctx as AndexpressionContext, predIndex)
		38 -> return exclusiveorexpression_sempred(_localctx as ExclusiveorexpressionContext, predIndex)
		39 -> return inclusiveorexpression_sempred(_localctx as InclusiveorexpressionContext, predIndex)
		40 -> return logicalandexpression_sempred(_localctx as LogicalandexpressionContext, predIndex)
		41 -> return logicalorexpression_sempred(_localctx as LogicalorexpressionContext, predIndex)
		45 -> return expression_sempred(_localctx as ExpressionContext, predIndex)
		51 -> return statementseq_sempred(_localctx as StatementseqContext, predIndex)
		60 -> return declarationseq_sempred(_localctx as DeclarationseqContext, predIndex)
		87 -> return enumeratorlist_sempred(_localctx as EnumeratorlistContext, predIndex)
		105 -> return attributespecifierseq_sempred(_localctx as AttributespecifierseqContext, predIndex)
		108 -> return attributelist_sempred(_localctx as AttributelistContext, predIndex)
		114 -> return balancedtokenseq_sempred(_localctx as BalancedtokenseqContext, predIndex)
		116 -> return initdeclaratorlist_sempred(_localctx as InitdeclaratorlistContext, predIndex)
		120 -> return noptrdeclarator_sempred(_localctx as NoptrdeclaratorContext, predIndex)
		131 -> return noptrabstractdeclarator_sempred(_localctx as NoptrabstractdeclaratorContext, predIndex)
		133 -> return noptrabstractpackdeclarator_sempred(_localctx as NoptrabstractpackdeclaratorContext, predIndex)
		135 -> return parameterdeclarationlist_sempred(_localctx as ParameterdeclarationlistContext, predIndex)
		142 -> return initializerlist_sempred(_localctx as InitializerlistContext, predIndex)
		152 -> return memberdeclaratorlist_sempred(_localctx as MemberdeclaratorlistContext, predIndex)
		154 -> return virtspecifierseq_sempred(_localctx as VirtspecifierseqContext, predIndex)
		158 -> return basespecifierlist_sempred(_localctx as BasespecifierlistContext, predIndex)
		173 -> return templateparameterlist_sempred(_localctx as TemplateparameterlistContext, predIndex)
		179 -> return templateargumentlist_sempred(_localctx as TemplateargumentlistContext, predIndex)
		192 -> return typeidlist_sempred(_localctx as TypeidlistContext, predIndex)
		}
		return true
	}
	private fun nestednamespecifier_sempred( _localctx : NestednamespecifierContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 2)
		    1 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun capturelist_sempred( _localctx : CapturelistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    2 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun postfixexpression_sempred( _localctx : PostfixexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    3 -> return precpred(context!!, 19)
		    4 -> return precpred(context!!, 18)
		    5 -> return precpred(context!!, 17)
		    6 -> return precpred(context!!, 12)
		    7 -> return precpred(context!!, 11)
		    8 -> return precpred(context!!, 10)
		    9 -> return precpred(context!!, 9)
		    10 -> return precpred(context!!, 8)
		    11 -> return precpred(context!!, 7)
		}
		return true
	}
	private fun noptrnewdeclarator_sempred( _localctx : NoptrnewdeclaratorContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    12 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun pmexpression_sempred( _localctx : PmexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    13 -> return precpred(context!!, 2)
		    14 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun multiplicativeexpression_sempred( _localctx : MultiplicativeexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    15 -> return precpred(context!!, 3)
		    16 -> return precpred(context!!, 2)
		    17 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun additiveexpression_sempred( _localctx : AdditiveexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    18 -> return precpred(context!!, 2)
		    19 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun shiftexpression_sempred( _localctx : ShiftexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    20 -> return precpred(context!!, 2)
		    21 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun relationalexpression_sempred( _localctx : RelationalexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    22 -> return precpred(context!!, 4)
		    23 -> return precpred(context!!, 3)
		    24 -> return precpred(context!!, 2)
		    25 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun equalityexpression_sempred( _localctx : EqualityexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    26 -> return precpred(context!!, 2)
		    27 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun andexpression_sempred( _localctx : AndexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    28 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun exclusiveorexpression_sempred( _localctx : ExclusiveorexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    29 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun inclusiveorexpression_sempred( _localctx : InclusiveorexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    30 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun logicalandexpression_sempred( _localctx : LogicalandexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    31 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun logicalorexpression_sempred( _localctx : LogicalorexpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    32 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun expression_sempred( _localctx : ExpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    33 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun statementseq_sempred( _localctx : StatementseqContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    34 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun declarationseq_sempred( _localctx : DeclarationseqContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    35 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun enumeratorlist_sempred( _localctx : EnumeratorlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    36 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun attributespecifierseq_sempred( _localctx : AttributespecifierseqContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    37 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun attributelist_sempred( _localctx : AttributelistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    38 -> return precpred(context!!, 3)
		    39 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun balancedtokenseq_sempred( _localctx : BalancedtokenseqContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    40 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun initdeclaratorlist_sempred( _localctx : InitdeclaratorlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    41 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun noptrdeclarator_sempred( _localctx : NoptrdeclaratorContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    42 -> return precpred(context!!, 3)
		    43 -> return precpred(context!!, 2)
		}
		return true
	}
	private fun noptrabstractdeclarator_sempred( _localctx : NoptrabstractdeclaratorContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    44 -> return precpred(context!!, 5)
		    45 -> return precpred(context!!, 3)
		}
		return true
	}
	private fun noptrabstractpackdeclarator_sempred( _localctx : NoptrabstractpackdeclaratorContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    46 -> return precpred(context!!, 3)
		    47 -> return precpred(context!!, 2)
		}
		return true
	}
	private fun parameterdeclarationlist_sempred( _localctx : ParameterdeclarationlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    48 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun initializerlist_sempred( _localctx : InitializerlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    49 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun memberdeclaratorlist_sempred( _localctx : MemberdeclaratorlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    50 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun virtspecifierseq_sempred( _localctx : VirtspecifierseqContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    51 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun basespecifierlist_sempred( _localctx : BasespecifierlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    52 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun templateparameterlist_sempred( _localctx : TemplateparameterlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    53 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun templateargumentlist_sempred( _localctx : TemplateargumentlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    54 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun typeidlist_sempred( _localctx : TypeidlistContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    55 -> return precpred(context!!, 1)
		}
		return true
	}

}