// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EDIF300Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface EDIF300Visitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoal(ctx : EDIF300Parser.GoalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#absolute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbsolute(ctx : EDIF300Parser.AbsoluteContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#acLoad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcLoad(ctx : EDIF300Parser.AcLoadContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#acLoadDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcLoadDisplay(ctx : EDIF300Parser.AcLoadDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#acLoadFactorCapacitance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcLoadFactorCapacitance(ctx : EDIF300Parser.AcLoadFactorCapacitanceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#acLoadFactorTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcLoadFactorTime(ctx : EDIF300Parser.AcLoadFactorTimeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#addDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddDisplay(ctx : EDIF300Parser.AddDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ampere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAmpere(ctx : EDIF300Parser.AmpereContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnd(ctx : EDIF300Parser.AndContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#angleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAngleValue(ctx : EDIF300Parser.AngleValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#annotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnnotate(ctx : EDIF300Parser.AnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#approvedDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitApprovedDate(ctx : EDIF300Parser.ApprovedDateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#approvedDateDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitApprovedDateDisplay(ctx : EDIF300Parser.ApprovedDateDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#arc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArc(ctx : EDIF300Parser.ArcContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAscii(ctx : EDIF300Parser.AsciiContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#associatedInterconnectNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssociatedInterconnectNameDisplay(ctx : EDIF300Parser.AssociatedInterconnectNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#attachmentPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttachmentPoint(ctx : EDIF300Parser.AttachmentPointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAuthor(ctx : EDIF300Parser.AuthorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#backgroundColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBackgroundColor(ctx : EDIF300Parser.BackgroundColorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#baselineJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBaselineJustify(ctx : EDIF300Parser.BaselineJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#becomes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBecomes(ctx : EDIF300Parser.BecomesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#behaviorView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBehaviorView(ctx : EDIF300Parser.BehaviorViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#bidirectional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBidirectional(ctx : EDIF300Parser.BidirectionalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#bidirectionalPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBidirectionalPort(ctx : EDIF300Parser.BidirectionalPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#bidirectionalPortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBidirectionalPortAttributes(ctx : EDIF300Parser.BidirectionalPortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#bitOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitOrder(ctx : EDIF300Parser.BitOrderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#blue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlue(ctx : EDIF300Parser.BlueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#boldStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBoldStyle(ctx : EDIF300Parser.BoldStyleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#eboolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEboolean(ctx : EDIF300Parser.EbooleanContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanConstant(ctx : EDIF300Parser.BooleanConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanConstantRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanConstantRef(ctx : EDIF300Parser.BooleanConstantRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanExpression(ctx : EDIF300Parser.BooleanExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanMap(ctx : EDIF300Parser.BooleanMapContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanParameter(ctx : EDIF300Parser.BooleanParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanParameterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanParameterAssign(ctx : EDIF300Parser.BooleanParameterAssignContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanParameterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanParameterRef(ctx : EDIF300Parser.BooleanParameterRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanToken(ctx : EDIF300Parser.BooleanTokenContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanValue(ctx : EDIF300Parser.BooleanValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#borderPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBorderPattern(ctx : EDIF300Parser.BorderPatternContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#borderPatternVisible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBorderPatternVisible(ctx : EDIF300Parser.BorderPatternVisibleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#borderWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBorderWidth(ctx : EDIF300Parser.BorderWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#bottomJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBottomJustify(ctx : EDIF300Parser.BottomJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#calculated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCalculated(ctx : EDIF300Parser.CalculatedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#candela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCandela(ctx : EDIF300Parser.CandelaContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#capacitanceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCapacitanceValue(ctx : EDIF300Parser.CapacitanceValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#caplineJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCaplineJustify(ctx : EDIF300Parser.CaplineJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCell(ctx : EDIF300Parser.CellContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellHeader(ctx : EDIF300Parser.CellHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellNameDisplay(ctx : EDIF300Parser.CellNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellPropertyDisplay(ctx : EDIF300Parser.CellPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellPropertyDisplayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellPropertyDisplayOverride(ctx : EDIF300Parser.CellPropertyDisplayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellPropertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellPropertyOverride(ctx : EDIF300Parser.CellPropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cellRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCellRef(ctx : EDIF300Parser.CellRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#celsius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCelsius(ctx : EDIF300Parser.CelsiusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#centerJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCenterJustify(ctx : EDIF300Parser.CenterJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#characterEncoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharacterEncoding(ctx : EDIF300Parser.CharacterEncodingContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#checkDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCheckDate(ctx : EDIF300Parser.CheckDateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#checkDateDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCheckDateDisplay(ctx : EDIF300Parser.CheckDateDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCircle(ctx : EDIF300Parser.CircleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCluster(ctx : EDIF300Parser.ClusterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterConfiguration(ctx : EDIF300Parser.ClusterConfigurationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterConfigurationNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterConfigurationNameCaseSensitive(ctx : EDIF300Parser.ClusterConfigurationNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterConfigurationNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterConfigurationNameDef(ctx : EDIF300Parser.ClusterConfigurationNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterConfigurationNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterConfigurationNameRef(ctx : EDIF300Parser.ClusterConfigurationNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterConfigurationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterConfigurationRef(ctx : EDIF300Parser.ClusterConfigurationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterHeader(ctx : EDIF300Parser.ClusterHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterNameCaseSensitive(ctx : EDIF300Parser.ClusterNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterNameDef(ctx : EDIF300Parser.ClusterNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterNameRef(ctx : EDIF300Parser.ClusterNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterPropertyDisplay(ctx : EDIF300Parser.ClusterPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterPropertyDisplayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterPropertyDisplayOverride(ctx : EDIF300Parser.ClusterPropertyDisplayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterPropertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterPropertyOverride(ctx : EDIF300Parser.ClusterPropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#clusterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClusterRef(ctx : EDIF300Parser.ClusterRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColor(ctx : EDIF300Parser.ColorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComment(ctx : EDIF300Parser.CommentContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#commentGraphics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommentGraphics(ctx : EDIF300Parser.CommentGraphicsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#companyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompanyName(ctx : EDIF300Parser.CompanyNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#companyNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompanyNameDisplay(ctx : EDIF300Parser.CompanyNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#complementedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComplementedName(ctx : EDIF300Parser.ComplementedNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#complementedNamePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComplementedNamePart(ctx : EDIF300Parser.ComplementedNamePartContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#complexGeometry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComplexGeometry(ctx : EDIF300Parser.ComplexGeometryContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#complexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComplexName(ctx : EDIF300Parser.ComplexNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompound(ctx : EDIF300Parser.CompoundContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCondition(ctx : EDIF300Parser.ConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#conditionDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionDisplay(ctx : EDIF300Parser.ConditionDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectedSignalIndexGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectedSignalIndexGenerator(ctx : EDIF300Parser.ConnectedSignalIndexGeneratorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectedSignalIndexGeneratorDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectedSignalIndexGeneratorDisplay(ctx : EDIF300Parser.ConnectedSignalIndexGeneratorDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityBus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityBus(ctx : EDIF300Parser.ConnectivityBusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityBusJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityBusJoined(ctx : EDIF300Parser.ConnectivityBusJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityBusSlice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityBusSlice(ctx : EDIF300Parser.ConnectivityBusSliceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityFrameStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityFrameStructure(ctx : EDIF300Parser.ConnectivityFrameStructureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityFrameStructureNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityFrameStructureNameDef(ctx : EDIF300Parser.ConnectivityFrameStructureNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityNet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityNet(ctx : EDIF300Parser.ConnectivityNetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityNetJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityNetJoined(ctx : EDIF300Parser.ConnectivityNetJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityRipper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityRipper(ctx : EDIF300Parser.ConnectivityRipperContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityRipperNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityRipperNameDef(ctx : EDIF300Parser.ConnectivityRipperNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityRipperNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityRipperNameRef(ctx : EDIF300Parser.ConnectivityRipperNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityRipperRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityRipperRef(ctx : EDIF300Parser.ConnectivityRipperRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityStructure(ctx : EDIF300Parser.ConnectivityStructureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivitySubBus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivitySubBus(ctx : EDIF300Parser.ConnectivitySubBusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivitySubNet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivitySubNet(ctx : EDIF300Parser.ConnectivitySubNetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityTagGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityTagGenerator(ctx : EDIF300Parser.ConnectivityTagGeneratorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityTagGeneratorDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityTagGeneratorDisplay(ctx : EDIF300Parser.ConnectivityTagGeneratorDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityUnits(ctx : EDIF300Parser.ConnectivityUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityView(ctx : EDIF300Parser.ConnectivityViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#connectivityViewHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConnectivityViewHeader(ctx : EDIF300Parser.ConnectivityViewHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#constantNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstantNameDef(ctx : EDIF300Parser.ConstantNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#constantNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstantNameRef(ctx : EDIF300Parser.ConstantNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#constantValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstantValues(ctx : EDIF300Parser.ConstantValuesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitContract(ctx : EDIF300Parser.ContractContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#contractDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitContractDisplay(ctx : EDIF300Parser.ContractDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#copyright}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCopyright(ctx : EDIF300Parser.CopyrightContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#copyrightDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCopyrightDisplay(ctx : EDIF300Parser.CopyrightDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#cornerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCornerType(ctx : EDIF300Parser.CornerTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#coulomb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCoulomb(ctx : EDIF300Parser.CoulombContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#criticality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCriticality(ctx : EDIF300Parser.CriticalityContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#criticalityDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCriticalityDisplay(ctx : EDIF300Parser.CriticalityDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#currentMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCurrentMap(ctx : EDIF300Parser.CurrentMapContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#currentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCurrentValue(ctx : EDIF300Parser.CurrentValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#curve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCurve(ctx : EDIF300Parser.CurveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dataOrigin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataOrigin(ctx : EDIF300Parser.DataOriginContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDate(ctx : EDIF300Parser.DateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dayNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDayNumber(ctx : EDIF300Parser.DayNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcFanInLoad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcFanInLoad(ctx : EDIF300Parser.DcFanInLoadContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcFanInLoadDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcFanInLoadDisplay(ctx : EDIF300Parser.DcFanInLoadDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcFanOutLoad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcFanOutLoad(ctx : EDIF300Parser.DcFanOutLoadContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcFanOutLoadDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcFanOutLoadDisplay(ctx : EDIF300Parser.DcFanOutLoadDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcMaxFanIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcMaxFanIn(ctx : EDIF300Parser.DcMaxFanInContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcMaxFanInDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcMaxFanInDisplay(ctx : EDIF300Parser.DcMaxFanInDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcMaxFanOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcMaxFanOut(ctx : EDIF300Parser.DcMaxFanOutContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dcMaxFanOutDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDcMaxFanOutDisplay(ctx : EDIF300Parser.DcMaxFanOutDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#decimalToString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDecimalToString(ctx : EDIF300Parser.DecimalToStringContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#defaultClusterConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefaultClusterConfiguration(ctx : EDIF300Parser.DefaultClusterConfigurationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#defaultConnection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefaultConnection(ctx : EDIF300Parser.DefaultConnectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#degree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDegree(ctx : EDIF300Parser.DegreeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDelay(ctx : EDIF300Parser.DelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#denominator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDenominator(ctx : EDIF300Parser.DenominatorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#derivation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDerivation(ctx : EDIF300Parser.DerivationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#derivedFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDerivedFrom(ctx : EDIF300Parser.DerivedFromContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#design}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesign(ctx : EDIF300Parser.DesignContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignator(ctx : EDIF300Parser.DesignatorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designatorDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignatorDisplay(ctx : EDIF300Parser.DesignatorDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignHeader(ctx : EDIF300Parser.DesignHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designHierarchy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignHierarchy(ctx : EDIF300Parser.DesignHierarchyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designHierarchyHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignHierarchyHeader(ctx : EDIF300Parser.DesignHierarchyHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designHierarchyNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignHierarchyNameCaseSensitive(ctx : EDIF300Parser.DesignHierarchyNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designHierarchyNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignHierarchyNameDef(ctx : EDIF300Parser.DesignHierarchyNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignNameCaseSensitive(ctx : EDIF300Parser.DesignNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignNameDef(ctx : EDIF300Parser.DesignNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#designUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignUnits(ctx : EDIF300Parser.DesignUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#diagram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDiagram(ctx : EDIF300Parser.DiagramContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#diagramNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDiagramNameDef(ctx : EDIF300Parser.DiagramNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#directionalPortAttributeOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDirectionalPortAttributeOverride(ctx : EDIF300Parser.DirectionalPortAttributeOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplay(ctx : EDIF300Parser.DisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#displayAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayAttributes(ctx : EDIF300Parser.DisplayAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#displayName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayName(ctx : EDIF300Parser.DisplayNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#displayNameOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayNameOverride(ctx : EDIF300Parser.DisplayNameOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#distanceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDistanceValue(ctx : EDIF300Parser.DistanceValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dividend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDividend(ctx : EDIF300Parser.DividendContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#divisor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivisor(ctx : EDIF300Parser.DivisorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#documentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocumentation(ctx : EDIF300Parser.DocumentationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#documentationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocumentationHeader(ctx : EDIF300Parser.DocumentationHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#documentationNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocumentationNameCaseSensitive(ctx : EDIF300Parser.DocumentationNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#documentationNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocumentationNameDef(ctx : EDIF300Parser.DocumentationNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#documentationUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocumentationUnits(ctx : EDIF300Parser.DocumentationUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dominates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDominates(ctx : EDIF300Parser.DominatesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDot(ctx : EDIF300Parser.DotContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingDescription(ctx : EDIF300Parser.DrawingDescriptionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingDescriptionDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingDescriptionDisplay(ctx : EDIF300Parser.DrawingDescriptionDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingIdentification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingIdentification(ctx : EDIF300Parser.DrawingIdentificationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingIdentificationDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingIdentificationDisplay(ctx : EDIF300Parser.DrawingIdentificationDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingSize(ctx : EDIF300Parser.DrawingSizeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#drawingSizeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawingSizeDisplay(ctx : EDIF300Parser.DrawingSizeDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDuration(ctx : EDIF300Parser.DurationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE(ctx : EDIF300Parser.EContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdif(ctx : EDIF300Parser.EdifContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edifHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdifHeader(ctx : EDIF300Parser.EdifHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edifLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdifLevel(ctx : EDIF300Parser.EdifLevelContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edifLevelValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdifLevelValue(ctx : EDIF300Parser.EdifLevelValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edifNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdifNameDef(ctx : EDIF300Parser.EdifNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#edifVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdifVersion(ctx : EDIF300Parser.EdifVersionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#endPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEndPoint(ctx : EDIF300Parser.EndPointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#endType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEndType(ctx : EDIF300Parser.EndTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#engineeringDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEngineeringDate(ctx : EDIF300Parser.EngineeringDateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#engineeringDateDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEngineeringDateDisplay(ctx : EDIF300Parser.EngineeringDateDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvent(ctx : EDIF300Parser.EventContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExponent(ctx : EDIF300Parser.ExponentContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtend(ctx : EDIF300Parser.ExtendContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendForFrameMemberDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendForFrameMemberDef(ctx : EDIF300Parser.ExtendForFrameMemberDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendFrameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendFrameDef(ctx : EDIF300Parser.ExtendFrameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendInstanceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendInstanceDef(ctx : EDIF300Parser.ExtendInstanceDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendInstanceMemberDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendInstanceMemberDef(ctx : EDIF300Parser.ExtendInstanceMemberDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendInterconnectDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendInterconnectDef(ctx : EDIF300Parser.ExtendInterconnectDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendPageDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendPageDef(ctx : EDIF300Parser.ExtendPageDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendPortDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendPortDef(ctx : EDIF300Parser.ExtendPortDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendPortMemberDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendPortMemberDef(ctx : EDIF300Parser.ExtendPortMemberDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendSignalDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendSignalDef(ctx : EDIF300Parser.ExtendSignalDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendSignalGroupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendSignalGroupDef(ctx : EDIF300Parser.ExtendSignalGroupDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#extendSignalMemberDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtendSignalMemberDef(ctx : EDIF300Parser.ExtendSignalMemberDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#external}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExternal(ctx : EDIF300Parser.ExternalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fahrenheit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFahrenheit(ctx : EDIF300Parser.FahrenheitContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#efalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEfalse(ctx : EDIF300Parser.EfalseContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#farad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFarad(ctx : EDIF300Parser.FaradContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigure(ctx : EDIF300Parser.FigureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigureGroup(ctx : EDIF300Parser.FigureGroupContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figureGroupNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigureGroupNameCaseSensitive(ctx : EDIF300Parser.FigureGroupNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figureGroupNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigureGroupNameDef(ctx : EDIF300Parser.FigureGroupNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figureGroupNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigureGroupNameRef(ctx : EDIF300Parser.FigureGroupNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#figureGroupOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigureGroupOverride(ctx : EDIF300Parser.FigureGroupOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fillPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFillPattern(ctx : EDIF300Parser.FillPatternContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fillPatternVisible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFillPatternVisible(ctx : EDIF300Parser.FillPatternVisibleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#firstIntegerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFirstIntegerExpression(ctx : EDIF300Parser.FirstIntegerExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#firstStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFirstStringExpression(ctx : EDIF300Parser.FirstStringExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fixed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFixed(ctx : EDIF300Parser.FixedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#font}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFont(ctx : EDIF300Parser.FontContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontCapitalHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontCapitalHeight(ctx : EDIF300Parser.FontCapitalHeightContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontDefinitions(ctx : EDIF300Parser.FontDefinitionsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontDescent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontDescent(ctx : EDIF300Parser.FontDescentContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontFamily(ctx : EDIF300Parser.FontFamilyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontHeight(ctx : EDIF300Parser.FontHeightContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontNameDef(ctx : EDIF300Parser.FontNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontNameRef(ctx : EDIF300Parser.FontNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontProportions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontProportions(ctx : EDIF300Parser.FontProportionsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontRef(ctx : EDIF300Parser.FontRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fonts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFonts(ctx : EDIF300Parser.FontsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fontWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontWidth(ctx : EDIF300Parser.FontWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forbiddenEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForbiddenEvent(ctx : EDIF300Parser.ForbiddenEventContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrame(ctx : EDIF300Parser.ForFrameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameAnnotate(ctx : EDIF300Parser.ForFrameAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameIndex(ctx : EDIF300Parser.ForFrameIndexContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameIndexDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameIndexDisplay(ctx : EDIF300Parser.ForFrameIndexDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameIndexNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameIndexNameCaseSensitive(ctx : EDIF300Parser.ForFrameIndexNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameIndexRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameIndexRef(ctx : EDIF300Parser.ForFrameIndexRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameMemberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameMemberRef(ctx : EDIF300Parser.ForFrameMemberRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#forFrameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForFrameRef(ctx : EDIF300Parser.ForFrameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frameConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrameConfiguration(ctx : EDIF300Parser.FrameConfigurationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frameNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrameNameCaseSensitive(ctx : EDIF300Parser.FrameNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frameNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrameNameDef(ctx : EDIF300Parser.FrameNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frameNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrameNameRef(ctx : EDIF300Parser.FrameNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrameRef(ctx : EDIF300Parser.FrameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#frequencyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrequencyValue(ctx : EDIF300Parser.FrequencyValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fromBottom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFromBottom(ctx : EDIF300Parser.FromBottomContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fromInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFromInteger(ctx : EDIF300Parser.FromIntegerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fromLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFromLeft(ctx : EDIF300Parser.FromLeftContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fromRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFromRight(ctx : EDIF300Parser.FromRightContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#fromTop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFromTop(ctx : EDIF300Parser.FromTopContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#generated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGenerated(ctx : EDIF300Parser.GeneratedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#geometryMacro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeometryMacro(ctx : EDIF300Parser.GeometryMacroContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#geometryMacroHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeometryMacroHeader(ctx : EDIF300Parser.GeometryMacroHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#geometryMacroRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeometryMacroRef(ctx : EDIF300Parser.GeometryMacroRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#geometryMacroUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeometryMacroUnits(ctx : EDIF300Parser.GeometryMacroUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPort(ctx : EDIF300Parser.GlobalPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortBundle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortBundle(ctx : EDIF300Parser.GlobalPortBundleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortDefinitions(ctx : EDIF300Parser.GlobalPortDefinitionsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortList(ctx : EDIF300Parser.GlobalPortListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortNameCaseSensitive(ctx : EDIF300Parser.GlobalPortNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortNameDef(ctx : EDIF300Parser.GlobalPortNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortNameDisplay(ctx : EDIF300Parser.GlobalPortNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortNameRef(ctx : EDIF300Parser.GlobalPortNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortPropertyDisplay(ctx : EDIF300Parser.GlobalPortPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortRef(ctx : EDIF300Parser.GlobalPortRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#globalPortScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalPortScope(ctx : EDIF300Parser.GlobalPortScopeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#green}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGreen(ctx : EDIF300Parser.GreenContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#henry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHenry(ctx : EDIF300Parser.HenryContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hertz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHertz(ctx : EDIF300Parser.HertzContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#horizontalJustification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHorizontalJustification(ctx : EDIF300Parser.HorizontalJustificationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspot(ctx : EDIF300Parser.HotspotContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotConnectDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotConnectDirection(ctx : EDIF300Parser.HotspotConnectDirectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotGrid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotGrid(ctx : EDIF300Parser.HotspotGridContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotNameCaseSensitive(ctx : EDIF300Parser.HotspotNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotNameDef(ctx : EDIF300Parser.HotspotNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotNameDisplay(ctx : EDIF300Parser.HotspotNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hotspotNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHotspotNameRef(ctx : EDIF300Parser.HotspotNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#hourNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHourNumber(ctx : EDIF300Parser.HourNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ieeeDesignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIeeeDesignation(ctx : EDIF300Parser.IeeeDesignationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ieeeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIeeeSection(ctx : EDIF300Parser.IeeeSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ieeeStandard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIeeeStandard(ctx : EDIF300Parser.IeeeStandardContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ifFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfFrame(ctx : EDIF300Parser.IfFrameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ifFrameAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfFrameAnnotate(ctx : EDIF300Parser.IfFrameAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ifFrameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfFrameRef(ctx : EDIF300Parser.IfFrameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ifFrameSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfFrameSet(ctx : EDIF300Parser.IfFrameSetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIgnore(ctx : EDIF300Parser.IgnoreContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#implementationNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitImplementationNameCaseSensitive(ctx : EDIF300Parser.ImplementationNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#implementationNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitImplementationNameDef(ctx : EDIF300Parser.ImplementationNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#implementationNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitImplementationNameDisplay(ctx : EDIF300Parser.ImplementationNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#implementationNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitImplementationNameRef(ctx : EDIF300Parser.ImplementationNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexEndDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexEndDisplay(ctx : EDIF300Parser.IndexEndDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexNameDef(ctx : EDIF300Parser.IndexNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexNameDisplay(ctx : EDIF300Parser.IndexNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexNameRef(ctx : EDIF300Parser.IndexNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexStart(ctx : EDIF300Parser.IndexStartContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexStartDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexStartDisplay(ctx : EDIF300Parser.IndexStartDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexStep(ctx : EDIF300Parser.IndexStepContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexStepDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexStepDisplay(ctx : EDIF300Parser.IndexStepDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#indexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexValue(ctx : EDIF300Parser.IndexValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInput(ctx : EDIF300Parser.InputContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#inputPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInputPort(ctx : EDIF300Parser.InputPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#inputPortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInputPortAttributes(ctx : EDIF300Parser.InputPortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstance(ctx : EDIF300Parser.InstanceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceConfiguration(ctx : EDIF300Parser.InstanceConfigurationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceIndexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceIndexValue(ctx : EDIF300Parser.InstanceIndexValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceMemberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceMemberRef(ctx : EDIF300Parser.InstanceMemberRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameCaseSensitive(ctx : EDIF300Parser.InstanceNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameDef(ctx : EDIF300Parser.InstanceNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameDisplay(ctx : EDIF300Parser.InstanceNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameGenerator(ctx : EDIF300Parser.InstanceNameGeneratorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameGeneratorDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameGeneratorDisplay(ctx : EDIF300Parser.InstanceNameGeneratorDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceNameRef(ctx : EDIF300Parser.InstanceNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instancePortAttributeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstancePortAttributeDisplay(ctx : EDIF300Parser.InstancePortAttributeDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instancePortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstancePortAttributes(ctx : EDIF300Parser.InstancePortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instancePropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstancePropertyDisplay(ctx : EDIF300Parser.InstancePropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instancePropertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstancePropertyOverride(ctx : EDIF300Parser.InstancePropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceRef(ctx : EDIF300Parser.InstanceRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceWidth(ctx : EDIF300Parser.InstanceWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#instanceWidthDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceWidthDisplay(ctx : EDIF300Parser.InstanceWidthDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInteger(ctx : EDIF300Parser.IntegerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerConstant(ctx : EDIF300Parser.IntegerConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerConstantRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerConstantRef(ctx : EDIF300Parser.IntegerConstantRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerEqual(ctx : EDIF300Parser.IntegerEqualContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerExpression(ctx : EDIF300Parser.IntegerExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerParameter(ctx : EDIF300Parser.IntegerParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerParameterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerParameterAssign(ctx : EDIF300Parser.IntegerParameterAssignContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerParameterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerParameterRef(ctx : EDIF300Parser.IntegerParameterRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerProduct(ctx : EDIF300Parser.IntegerProductContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerQuotient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerQuotient(ctx : EDIF300Parser.IntegerQuotientContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerRemainder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerRemainder(ctx : EDIF300Parser.IntegerRemainderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerSubtract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerSubtract(ctx : EDIF300Parser.IntegerSubtractContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerSum(ctx : EDIF300Parser.IntegerSumContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerValue(ctx : EDIF300Parser.IntegerValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectAnnotate(ctx : EDIF300Parser.InterconnectAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectAttachedText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectAttachedText(ctx : EDIF300Parser.InterconnectAttachedTextContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectDelay(ctx : EDIF300Parser.InterconnectDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectDelayDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectDelayDisplay(ctx : EDIF300Parser.InterconnectDelayDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectDelayNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectDelayNameDef(ctx : EDIF300Parser.InterconnectDelayNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectDelayNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectDelayNameRef(ctx : EDIF300Parser.InterconnectDelayNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectHeader(ctx : EDIF300Parser.InterconnectHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectNameCaseSensitive(ctx : EDIF300Parser.InterconnectNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectNameDef(ctx : EDIF300Parser.InterconnectNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectNameDisplay(ctx : EDIF300Parser.InterconnectNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectNameRef(ctx : EDIF300Parser.InterconnectNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectPropertyDisplay(ctx : EDIF300Parser.InterconnectPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectRef(ctx : EDIF300Parser.InterconnectRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interconnectSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterconnectSet(ctx : EDIF300Parser.InterconnectSetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#einterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEinterface(ctx : EDIF300Parser.EinterfaceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interfaceJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterfaceJoined(ctx : EDIF300Parser.InterfaceJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#interfaceUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterfaceUnits(ctx : EDIF300Parser.InterfaceUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#iso8859}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIso8859(ctx : EDIF300Parser.Iso8859Context) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#iso8859Part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIso8859Part(ctx : EDIF300Parser.Iso8859PartContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#isolated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIsolated(ctx : EDIF300Parser.IsolatedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#issue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIssue(ctx : EDIF300Parser.IssueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#italicStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitItalicStyle(ctx : EDIF300Parser.ItalicStyleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#jisx0201}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJisx0201(ctx : EDIF300Parser.Jisx0201Context) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#jisx0208}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJisx0208(ctx : EDIF300Parser.Jisx0208Context) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#joinedAsSignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJoinedAsSignal(ctx : EDIF300Parser.JoinedAsSignalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#joule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJoule(ctx : EDIF300Parser.JouleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k0KeywordLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK0KeywordLevel(ctx : EDIF300Parser.K0KeywordLevelContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k1KeywordAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK1KeywordAlias(ctx : EDIF300Parser.K1KeywordAliasContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k1KeywordLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK1KeywordLevel(ctx : EDIF300Parser.K1KeywordLevelContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k1KeywordNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK1KeywordNameDef(ctx : EDIF300Parser.K1KeywordNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k1KeywordNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK1KeywordNameRef(ctx : EDIF300Parser.K1KeywordNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Actual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Actual(ctx : EDIF300Parser.K2ActualContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Build(ctx : EDIF300Parser.K2BuildContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Formal(ctx : EDIF300Parser.K2FormalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2FormalNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2FormalNameDef(ctx : EDIF300Parser.K2FormalNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2FormalNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2FormalNameRef(ctx : EDIF300Parser.K2FormalNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Generate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Generate(ctx : EDIF300Parser.K2GenerateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2KeywordDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2KeywordDefine(ctx : EDIF300Parser.K2KeywordDefineContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2KeywordLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2KeywordLevel(ctx : EDIF300Parser.K2KeywordLevelContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2KeywordParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2KeywordParameters(ctx : EDIF300Parser.K2KeywordParametersContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Literal(ctx : EDIF300Parser.K2LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Optional(ctx : EDIF300Parser.K2OptionalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k2Required}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK2Required(ctx : EDIF300Parser.K2RequiredContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3Build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3Build(ctx : EDIF300Parser.K3BuildContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3Collector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3Collector(ctx : EDIF300Parser.K3CollectorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3ForEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3ForEach(ctx : EDIF300Parser.K3ForEachContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3Formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3Formal(ctx : EDIF300Parser.K3FormalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3FormalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3FormalList(ctx : EDIF300Parser.K3FormalListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3Generate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3Generate(ctx : EDIF300Parser.K3GenerateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3KeywordDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3KeywordDefine(ctx : EDIF300Parser.K3KeywordDefineContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3KeywordLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3KeywordLevel(ctx : EDIF300Parser.K3KeywordLevelContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#k3KeywordParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitK3KeywordParameters(ctx : EDIF300Parser.K3KeywordParametersContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#kelvin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKelvin(ctx : EDIF300Parser.KelvinContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#keywordMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeywordMap(ctx : EDIF300Parser.KeywordMapContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#kilogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKilogram(ctx : EDIF300Parser.KilogramContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLeaf(ctx : EDIF300Parser.LeafContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#leafOccurrenceAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLeafOccurrenceAnnotate(ctx : EDIF300Parser.LeafOccurrenceAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#leftJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLeftJustify(ctx : EDIF300Parser.LeftJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#lengthValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLengthValue(ctx : EDIF300Parser.LengthValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#lessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLessThan(ctx : EDIF300Parser.LessThanContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#lessThanOrEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLessThanOrEqual(ctx : EDIF300Parser.LessThanOrEqualContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibrary(ctx : EDIF300Parser.LibraryContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryHeader(ctx : EDIF300Parser.LibraryHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryNameCaseSensitive(ctx : EDIF300Parser.LibraryNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryNameDef(ctx : EDIF300Parser.LibraryNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryNameRef(ctx : EDIF300Parser.LibraryNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryObjectNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryObjectNameCaseSensitive(ctx : EDIF300Parser.LibraryObjectNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryObjectNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryObjectNameDef(ctx : EDIF300Parser.LibraryObjectNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryObjectNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryObjectNameRef(ctx : EDIF300Parser.LibraryObjectNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#libraryRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryRef(ctx : EDIF300Parser.LibraryRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#loadDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLoadDelay(ctx : EDIF300Parser.LoadDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#localPortGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalPortGroup(ctx : EDIF300Parser.LocalPortGroupContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#localPortGroupNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalPortGroupNameCaseSensitive(ctx : EDIF300Parser.LocalPortGroupNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#localPortGroupNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalPortGroupNameDef(ctx : EDIF300Parser.LocalPortGroupNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#localPortGroupNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalPortGroupNameRef(ctx : EDIF300Parser.LocalPortGroupNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#localPortGroupRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalPortGroupRef(ctx : EDIF300Parser.LocalPortGroupRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicalConnectivity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalConnectivity(ctx : EDIF300Parser.LogicalConnectivityContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicDefinitions(ctx : EDIF300Parser.LogicDefinitionsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicList(ctx : EDIF300Parser.LogicListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicMapInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicMapInput(ctx : EDIF300Parser.LogicMapInputContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicMapOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicMapOutput(ctx : EDIF300Parser.LogicMapOutputContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicModelUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicModelUnits(ctx : EDIF300Parser.LogicModelUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicModelView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicModelView(ctx : EDIF300Parser.LogicModelViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicNameDef(ctx : EDIF300Parser.LogicNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicNameRef(ctx : EDIF300Parser.LogicNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicOneOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicOneOf(ctx : EDIF300Parser.LogicOneOfContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicRef(ctx : EDIF300Parser.LogicRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#logicValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicValue(ctx : EDIF300Parser.LogicValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#lsbToMsb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLsbToMsb(ctx : EDIF300Parser.LsbToMsbContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mantissa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMantissa(ctx : EDIF300Parser.MantissaContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMark(ctx : EDIF300Parser.MarkContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#maskLayoutUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMaskLayoutUnits(ctx : EDIF300Parser.MaskLayoutUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#maskLayoutView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMaskLayoutView(ctx : EDIF300Parser.MaskLayoutViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#measured}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeasured(ctx : EDIF300Parser.MeasuredContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#meter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeter(ctx : EDIF300Parser.MeterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#middleJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMiddleJustify(ctx : EDIF300Parser.MiddleJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#minimalWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMinimalWidth(ctx : EDIF300Parser.MinimalWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#minimumStringLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMinimumStringLength(ctx : EDIF300Parser.MinimumStringLengthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#miNoMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMiNoMax(ctx : EDIF300Parser.MiNoMaxContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#miNoMaxValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMiNoMaxValue(ctx : EDIF300Parser.MiNoMaxValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#minuend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMinuend(ctx : EDIF300Parser.MinuendContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#minuteNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMinuteNumber(ctx : EDIF300Parser.MinuteNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mixedDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMixedDirection(ctx : EDIF300Parser.MixedDirectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mnm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMnm(ctx : EDIF300Parser.MnmContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMole(ctx : EDIF300Parser.MoleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#monthNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMonthNumber(ctx : EDIF300Parser.MonthNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#msbToLsb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMsbToLsb(ctx : EDIF300Parser.MsbToLsbContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#mustJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMustJoin(ctx : EDIF300Parser.MustJoinContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameAlias(ctx : EDIF300Parser.NameAliasContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameCaseSensitivity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameCaseSensitivity(ctx : EDIF300Parser.NameCaseSensitivityContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameDef(ctx : EDIF300Parser.NameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameDimension(ctx : EDIF300Parser.NameDimensionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameDimensionStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameDimensionStructure(ctx : EDIF300Parser.NameDimensionStructureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameInformation(ctx : EDIF300Parser.NameInformationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#namePartSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamePartSeparator(ctx : EDIF300Parser.NamePartSeparatorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameRef(ctx : EDIF300Parser.NameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nameStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNameStructure(ctx : EDIF300Parser.NameStructureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#narrowPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNarrowPort(ctx : EDIF300Parser.NarrowPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#narrowWire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNarrowWire(ctx : EDIF300Parser.NarrowWireContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#noHotspotGrid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoHotspotGrid(ctx : EDIF300Parser.NoHotspotGridContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nominalHotspotGrid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNominalHotspotGrid(ctx : EDIF300Parser.NominalHotspotGridContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#nonPermutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNonPermutable(ctx : EDIF300Parser.NonPermutableContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNot(ctx : EDIF300Parser.NotContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#notInherited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotInherited(ctx : EDIF300Parser.NotInheritedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumber(ctx : EDIF300Parser.NumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberExpression(ctx : EDIF300Parser.NumberExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberOfBasicUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberOfBasicUnits(ctx : EDIF300Parser.NumberOfBasicUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberOfNewUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberOfNewUnits(ctx : EDIF300Parser.NumberOfNewUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberParameter(ctx : EDIF300Parser.NumberParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberParameterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberParameterAssign(ctx : EDIF300Parser.NumberParameterAssignContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberParameterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberParameterRef(ctx : EDIF300Parser.NumberParameterRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberPoint(ctx : EDIF300Parser.NumberPointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberValue(ctx : EDIF300Parser.NumberValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#numerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumerator(ctx : EDIF300Parser.NumeratorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#occurrenceAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOccurrenceAnnotate(ctx : EDIF300Parser.OccurrenceAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#occurrenceHierarchyAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOccurrenceHierarchyAnnotate(ctx : EDIF300Parser.OccurrenceHierarchyAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#offsetEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOffsetEvent(ctx : EDIF300Parser.OffsetEventContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ohm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOhm(ctx : EDIF300Parser.OhmContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#openShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenShape(ctx : EDIF300Parser.OpenShapeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOr(ctx : EDIF300Parser.OrContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOrigin(ctx : EDIF300Parser.OriginContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#originalBoundingBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalBoundingBox(ctx : EDIF300Parser.OriginalBoundingBoxContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#originalDrawingDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalDrawingDate(ctx : EDIF300Parser.OriginalDrawingDateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#originalDrawingDateDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalDrawingDateDisplay(ctx : EDIF300Parser.OriginalDrawingDateDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#originalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalName(ctx : EDIF300Parser.OriginalNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#otherwiseFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOtherwiseFrame(ctx : EDIF300Parser.OtherwiseFrameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#otherwiseFrameAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOtherwiseFrameAnnotate(ctx : EDIF300Parser.OtherwiseFrameAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#otherwiseFrameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOtherwiseFrameRef(ctx : EDIF300Parser.OtherwiseFrameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOutput(ctx : EDIF300Parser.OutputContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#outputPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOutputPort(ctx : EDIF300Parser.OutputPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#outputPortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOutputPortAttributes(ctx : EDIF300Parser.OutputPortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOwner(ctx : EDIF300Parser.OwnerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPage(ctx : EDIF300Parser.PageContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageAnnotate(ctx : EDIF300Parser.PageAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageBorder(ctx : EDIF300Parser.PageBorderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageBorderTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageBorderTemplate(ctx : EDIF300Parser.PageBorderTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageBorderTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageBorderTemplateRef(ctx : EDIF300Parser.PageBorderTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageCommentGraphics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageCommentGraphics(ctx : EDIF300Parser.PageCommentGraphicsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageHeader(ctx : EDIF300Parser.PageHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageIdentification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageIdentification(ctx : EDIF300Parser.PageIdentificationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageIdentificationDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageIdentificationDisplay(ctx : EDIF300Parser.PageIdentificationDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageNameCaseSensitive(ctx : EDIF300Parser.PageNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageNameDef(ctx : EDIF300Parser.PageNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageNameRef(ctx : EDIF300Parser.PageNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pagePropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPagePropertyDisplay(ctx : EDIF300Parser.PagePropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageRef(ctx : EDIF300Parser.PageRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageSize(ctx : EDIF300Parser.PageSizeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitle(ctx : EDIF300Parser.PageTitleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleBlock(ctx : EDIF300Parser.PageTitleBlockContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleBlockAttributeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleBlockAttributeDisplay(ctx : EDIF300Parser.PageTitleBlockAttributeDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleBlockAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleBlockAttributes(ctx : EDIF300Parser.PageTitleBlockAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleBlockTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleBlockTemplate(ctx : EDIF300Parser.PageTitleBlockTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleBlockTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleBlockTemplateRef(ctx : EDIF300Parser.PageTitleBlockTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pageTitleDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPageTitleDisplay(ctx : EDIF300Parser.PageTitleDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#parameterDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterDisplay(ctx : EDIF300Parser.ParameterDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#parameterNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterNameCaseSensitive(ctx : EDIF300Parser.ParameterNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#parameterNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterNameDef(ctx : EDIF300Parser.ParameterNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#parameterNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterNameDisplay(ctx : EDIF300Parser.ParameterNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#parameterNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterNameRef(ctx : EDIF300Parser.ParameterNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPath(ctx : EDIF300Parser.PathContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pathDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPathDelay(ctx : EDIF300Parser.PathDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pathWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPathWidth(ctx : EDIF300Parser.PathWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pcbLayoutUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPcbLayoutUnits(ctx : EDIF300Parser.PcbLayoutUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pcbLayoutView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPcbLayoutView(ctx : EDIF300Parser.PcbLayoutViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#permutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPermutable(ctx : EDIF300Parser.PermutableContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#physicalDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPhysicalDefaults(ctx : EDIF300Parser.PhysicalDefaultsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#physicalScaling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPhysicalScaling(ctx : EDIF300Parser.PhysicalScalingContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pixelPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPixelPattern(ctx : EDIF300Parser.PixelPatternContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pixelRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPixelRow(ctx : EDIF300Parser.PixelRowContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPoint(ctx : EDIF300Parser.PointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pointList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPointList(ctx : EDIF300Parser.PointListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pointValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPointValue(ctx : EDIF300Parser.PointValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#polygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPolygon(ctx : EDIF300Parser.PolygonContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPort(ctx : EDIF300Parser.PortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortAnnotate(ctx : EDIF300Parser.PortAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portAttributeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortAttributeDisplay(ctx : EDIF300Parser.PortAttributeDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portBundle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortBundle(ctx : EDIF300Parser.PortBundleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDelay(ctx : EDIF300Parser.PortDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDelayDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDelayDisplay(ctx : EDIF300Parser.PortDelayDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDelayNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDelayNameDef(ctx : EDIF300Parser.PortDelayNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDelayNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDelayNameRef(ctx : EDIF300Parser.PortDelayNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDelayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDelayOverride(ctx : EDIF300Parser.PortDelayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDirection(ctx : EDIF300Parser.PortDirectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portDirectionIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortDirectionIndicator(ctx : EDIF300Parser.PortDirectionIndicatorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portIndexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortIndexValue(ctx : EDIF300Parser.PortIndexValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portInstanceRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortInstanceRef(ctx : EDIF300Parser.PortInstanceRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortJoined(ctx : EDIF300Parser.PortJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortList(ctx : EDIF300Parser.PortListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portLoadDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortLoadDelay(ctx : EDIF300Parser.PortLoadDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portLoadDelayDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortLoadDelayDisplay(ctx : EDIF300Parser.PortLoadDelayDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portLoadDelayNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortLoadDelayNameDef(ctx : EDIF300Parser.PortLoadDelayNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portLoadDelayNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortLoadDelayNameRef(ctx : EDIF300Parser.PortLoadDelayNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portLoadDelayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortLoadDelayOverride(ctx : EDIF300Parser.PortLoadDelayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portMemberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortMemberRef(ctx : EDIF300Parser.PortMemberRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameCaseSensitive(ctx : EDIF300Parser.PortNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameDef(ctx : EDIF300Parser.PortNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameDisplay(ctx : EDIF300Parser.PortNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameGenerator(ctx : EDIF300Parser.PortNameGeneratorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameGeneratorDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameGeneratorDisplay(ctx : EDIF300Parser.PortNameGeneratorDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortNameRef(ctx : EDIF300Parser.PortNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortPropertyDisplay(ctx : EDIF300Parser.PortPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portPropertyDisplayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortPropertyDisplayOverride(ctx : EDIF300Parser.PortPropertyDisplayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portPropertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortPropertyOverride(ctx : EDIF300Parser.PortPropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortRef(ctx : EDIF300Parser.PortRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortSet(ctx : EDIF300Parser.PortSetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#portWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPortWidth(ctx : EDIF300Parser.PortWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#presentLogicValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPresentLogicValue(ctx : EDIF300Parser.PresentLogicValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#previousLogicValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPreviousLogicValue(ctx : EDIF300Parser.PreviousLogicValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#previousVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPreviousVersion(ctx : EDIF300Parser.PreviousVersionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#primaryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrimaryName(ctx : EDIF300Parser.PrimaryNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgram(ctx : EDIF300Parser.ProgramContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProperty(ctx : EDIF300Parser.PropertyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyDisplay(ctx : EDIF300Parser.PropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyDisplayOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyDisplayOverride(ctx : EDIF300Parser.PropertyDisplayOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyInheritanceControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyInheritanceControl(ctx : EDIF300Parser.PropertyInheritanceControlContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyNameCaseSensitive(ctx : EDIF300Parser.PropertyNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyNameDef(ctx : EDIF300Parser.PropertyNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyNameDisplay(ctx : EDIF300Parser.PropertyNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyNameRef(ctx : EDIF300Parser.PropertyNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#propertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyOverride(ctx : EDIF300Parser.PropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#proportionalFont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProportionalFont(ctx : EDIF300Parser.ProportionalFontContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPt(ctx : EDIF300Parser.PtContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPt1(ctx : EDIF300Parser.Pt1Context) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#pt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPt2(ctx : EDIF300Parser.Pt2Context) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#radian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRadian(ctx : EDIF300Parser.RadianContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#reason}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReason(ctx : EDIF300Parser.ReasonContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRectangle(ctx : EDIF300Parser.RectangleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#red}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRed(ctx : EDIF300Parser.RedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#removeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRemoveDisplay(ctx : EDIF300Parser.RemoveDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#repetitionCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRepetitionCount(ctx : EDIF300Parser.RepetitionCountContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#repetitionCountDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRepetitionCountDisplay(ctx : EDIF300Parser.RepetitionCountDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#replaceDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceDisplay(ctx : EDIF300Parser.ReplaceDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#required}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRequired(ctx : EDIF300Parser.RequiredContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#resolves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitResolves(ctx : EDIF300Parser.ResolvesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#revision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRevision(ctx : EDIF300Parser.RevisionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#revisionDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRevisionDisplay(ctx : EDIF300Parser.RevisionDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#rightJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRightJustify(ctx : EDIF300Parser.RightJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ripperHotspot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRipperHotspot(ctx : EDIF300Parser.RipperHotspotContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#ripperHotspotRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRipperHotspotRef(ctx : EDIF300Parser.RipperHotspotRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#rotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRotation(ctx : EDIF300Parser.RotationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#round}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRound(ctx : EDIF300Parser.RoundContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#rowSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRowSize(ctx : EDIF300Parser.RowSizeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#scaledInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScaledInteger(ctx : EDIF300Parser.ScaledIntegerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#scaleX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScaleX(ctx : EDIF300Parser.ScaleXContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#scaleY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScaleY(ctx : EDIF300Parser.ScaleYContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicBus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicBus(ctx : EDIF300Parser.SchematicBusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicBusDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicBusDetails(ctx : EDIF300Parser.SchematicBusDetailsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicBusGraphics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicBusGraphics(ctx : EDIF300Parser.SchematicBusGraphicsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicBusJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicBusJoined(ctx : EDIF300Parser.SchematicBusJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicBusSlice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicBusSlice(ctx : EDIF300Parser.SchematicBusSliceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicComplexFigure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicComplexFigure(ctx : EDIF300Parser.SchematicComplexFigureContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicFigureMacro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicFigureMacro(ctx : EDIF300Parser.SchematicFigureMacroContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicFigureMacroRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicFigureMacroRef(ctx : EDIF300Parser.SchematicFigureMacroRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicForFrameBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicForFrameBorder(ctx : EDIF300Parser.SchematicForFrameBorderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicForFrameBorderTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicForFrameBorderTemplate(ctx : EDIF300Parser.SchematicForFrameBorderTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicForFrameBorderTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicForFrameBorderTemplateRef(ctx : EDIF300Parser.SchematicForFrameBorderTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicForFrameImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicForFrameImplementation(ctx : EDIF300Parser.SchematicForFrameImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicForFrameImplementationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicForFrameImplementationHeader(ctx : EDIF300Parser.SchematicForFrameImplementationHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicFrameImplementationDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicFrameImplementationDetails(ctx : EDIF300Parser.SchematicFrameImplementationDetailsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicGlobalPortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicGlobalPortAttributes(ctx : EDIF300Parser.SchematicGlobalPortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicGlobalPortImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicGlobalPortImplementation(ctx : EDIF300Parser.SchematicGlobalPortImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicGlobalPortImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicGlobalPortImplementationRef(ctx : EDIF300Parser.SchematicGlobalPortImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicGlobalPortTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicGlobalPortTemplate(ctx : EDIF300Parser.SchematicGlobalPortTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicGlobalPortTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicGlobalPortTemplateRef(ctx : EDIF300Parser.SchematicGlobalPortTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicIfFrameBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicIfFrameBorder(ctx : EDIF300Parser.SchematicIfFrameBorderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicIfFrameBorderTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicIfFrameBorderTemplate(ctx : EDIF300Parser.SchematicIfFrameBorderTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicIfFrameBorderTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicIfFrameBorderTemplateRef(ctx : EDIF300Parser.SchematicIfFrameBorderTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicIfFrameImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicIfFrameImplementation(ctx : EDIF300Parser.SchematicIfFrameImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicIfFrameImplementationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicIfFrameImplementationHeader(ctx : EDIF300Parser.SchematicIfFrameImplementationHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicImplementation(ctx : EDIF300Parser.SchematicImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInstanceImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInstanceImplementation(ctx : EDIF300Parser.SchematicInstanceImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInstanceImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInstanceImplementationRef(ctx : EDIF300Parser.SchematicInstanceImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectAttributeDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectAttributeDisplay(ctx : EDIF300Parser.SchematicInterconnectAttributeDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectHeader(ctx : EDIF300Parser.SchematicInterconnectHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectTerminatorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectTerminatorImplementation(ctx : EDIF300Parser.SchematicInterconnectTerminatorImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectTerminatorImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectTerminatorImplementationRef(ctx : EDIF300Parser.SchematicInterconnectTerminatorImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectTerminatorTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectTerminatorTemplate(ctx : EDIF300Parser.SchematicInterconnectTerminatorTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicInterconnectTerminatorTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicInterconnectTerminatorTemplateRef(ctx : EDIF300Parser.SchematicInterconnectTerminatorTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicJunctionImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicJunctionImplementation(ctx : EDIF300Parser.SchematicJunctionImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicJunctionImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicJunctionImplementationRef(ctx : EDIF300Parser.SchematicJunctionImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicJunctionTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicJunctionTemplate(ctx : EDIF300Parser.SchematicJunctionTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicJunctionTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicJunctionTemplateRef(ctx : EDIF300Parser.SchematicJunctionTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicMasterPortImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicMasterPortImplementation(ctx : EDIF300Parser.SchematicMasterPortImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicMasterPortImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicMasterPortImplementationRef(ctx : EDIF300Parser.SchematicMasterPortImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicMasterPortTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicMasterPortTemplate(ctx : EDIF300Parser.SchematicMasterPortTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicMasterPortTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicMasterPortTemplateRef(ctx : EDIF300Parser.SchematicMasterPortTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicMetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicMetric(ctx : EDIF300Parser.SchematicMetricContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicNet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicNet(ctx : EDIF300Parser.SchematicNetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicNetDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicNetDetails(ctx : EDIF300Parser.SchematicNetDetailsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicNetGraphics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicNetGraphics(ctx : EDIF300Parser.SchematicNetGraphicsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicNetJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicNetJoined(ctx : EDIF300Parser.SchematicNetJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOffPageConnectorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOffPageConnectorImplementation(ctx : EDIF300Parser.SchematicOffPageConnectorImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOffPageConnectorImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOffPageConnectorImplementationRef(ctx : EDIF300Parser.SchematicOffPageConnectorImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOffPageConnectorTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOffPageConnectorTemplate(ctx : EDIF300Parser.SchematicOffPageConnectorTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOffPageConnectorTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOffPageConnectorTemplateRef(ctx : EDIF300Parser.SchematicOffPageConnectorTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOnPageConnectorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOnPageConnectorImplementation(ctx : EDIF300Parser.SchematicOnPageConnectorImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOnPageConnectorImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOnPageConnectorImplementationRef(ctx : EDIF300Parser.SchematicOnPageConnectorImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOnPageConnectorTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOnPageConnectorTemplate(ctx : EDIF300Parser.SchematicOnPageConnectorTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOnPageConnectorTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOnPageConnectorTemplateRef(ctx : EDIF300Parser.SchematicOnPageConnectorTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOtherwiseFrameBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOtherwiseFrameBorder(ctx : EDIF300Parser.SchematicOtherwiseFrameBorderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOtherwiseFrameBorderTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOtherwiseFrameBorderTemplate(ctx : EDIF300Parser.SchematicOtherwiseFrameBorderTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOtherwiseFrameBorderTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOtherwiseFrameBorderTemplateRef(ctx : EDIF300Parser.SchematicOtherwiseFrameBorderTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOtherwiseFrameImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOtherwiseFrameImplementation(ctx : EDIF300Parser.SchematicOtherwiseFrameImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicOtherwiseFrameImplementationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicOtherwiseFrameImplementationHeader(ctx : EDIF300Parser.SchematicOtherwiseFrameImplementationHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortAcPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortAcPower(ctx : EDIF300Parser.SchematicPortAcPowerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortAcPowerRecommendedFrequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortAcPowerRecommendedFrequency(ctx : EDIF300Parser.SchematicPortAcPowerRecommendedFrequencyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortAcPowerRecommendedVoltageRms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortAcPowerRecommendedVoltageRms(ctx : EDIF300Parser.SchematicPortAcPowerRecommendedVoltageRmsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortAnalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortAnalog(ctx : EDIF300Parser.SchematicPortAnalogContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortAttributes(ctx : EDIF300Parser.SchematicPortAttributesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortChassisGround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortChassisGround(ctx : EDIF300Parser.SchematicPortChassisGroundContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortClock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortClock(ctx : EDIF300Parser.SchematicPortClockContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortDcPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortDcPower(ctx : EDIF300Parser.SchematicPortDcPowerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortDcPowerRecommendedVoltage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortDcPowerRecommendedVoltage(ctx : EDIF300Parser.SchematicPortDcPowerRecommendedVoltageContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortEarthGround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortEarthGround(ctx : EDIF300Parser.SchematicPortEarthGroundContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortGround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortGround(ctx : EDIF300Parser.SchematicPortGroundContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortNonLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortNonLogical(ctx : EDIF300Parser.SchematicPortNonLogicalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortOpenCollector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortOpenCollector(ctx : EDIF300Parser.SchematicPortOpenCollectorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortOpenEmitter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortOpenEmitter(ctx : EDIF300Parser.SchematicPortOpenEmitterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortPower(ctx : EDIF300Parser.SchematicPortPowerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortStyle(ctx : EDIF300Parser.SchematicPortStyleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicPortThreeState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicPortThreeState(ctx : EDIF300Parser.SchematicPortThreeStateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicRequiredDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicRequiredDefaults(ctx : EDIF300Parser.SchematicRequiredDefaultsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicRipperImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicRipperImplementation(ctx : EDIF300Parser.SchematicRipperImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicRipperImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicRipperImplementationRef(ctx : EDIF300Parser.SchematicRipperImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicRipperTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicRipperTemplate(ctx : EDIF300Parser.SchematicRipperTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicRipperTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicRipperTemplateRef(ctx : EDIF300Parser.SchematicRipperTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSubBus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSubBus(ctx : EDIF300Parser.SchematicSubBusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSubBusSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSubBusSet(ctx : EDIF300Parser.SchematicSubBusSetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSubInterconnectHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSubInterconnectHeader(ctx : EDIF300Parser.SchematicSubInterconnectHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSubNet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSubNet(ctx : EDIF300Parser.SchematicSubNetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSubNetSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSubNetSet(ctx : EDIF300Parser.SchematicSubNetSetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbol(ctx : EDIF300Parser.SchematicSymbolContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolBorder(ctx : EDIF300Parser.SchematicSymbolBorderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolBorderTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolBorderTemplate(ctx : EDIF300Parser.SchematicSymbolBorderTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolBorderTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolBorderTemplateRef(ctx : EDIF300Parser.SchematicSymbolBorderTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolHeader(ctx : EDIF300Parser.SchematicSymbolHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolPortImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolPortImplementation(ctx : EDIF300Parser.SchematicSymbolPortImplementationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolPortImplementationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolPortImplementationRef(ctx : EDIF300Parser.SchematicSymbolPortImplementationRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolPortTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolPortTemplate(ctx : EDIF300Parser.SchematicSymbolPortTemplateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolPortTemplateRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolPortTemplateRef(ctx : EDIF300Parser.SchematicSymbolPortTemplateRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicSymbolRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicSymbolRef(ctx : EDIF300Parser.SchematicSymbolRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicTemplateHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicTemplateHeader(ctx : EDIF300Parser.SchematicTemplateHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicUnits(ctx : EDIF300Parser.SchematicUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicView(ctx : EDIF300Parser.SchematicViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicViewHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicViewHeader(ctx : EDIF300Parser.SchematicViewHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicWireAffinity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicWireAffinity(ctx : EDIF300Parser.SchematicWireAffinityContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#schematicWireStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchematicWireStyle(ctx : EDIF300Parser.SchematicWireStyleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSecond(ctx : EDIF300Parser.SecondContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#secondIntegerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSecondIntegerExpression(ctx : EDIF300Parser.SecondIntegerExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#secondNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSecondNumber(ctx : EDIF300Parser.SecondNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#secondStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSecondStringExpression(ctx : EDIF300Parser.SecondStringExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSection(ctx : EDIF300Parser.SectionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#sectionNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSectionNameDef(ctx : EDIF300Parser.SectionNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#sectionTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSectionTitle(ctx : EDIF300Parser.SectionTitleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSequence(ctx : EDIF300Parser.SequenceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setAngle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetAngle(ctx : EDIF300Parser.SetAngleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setCapacitance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetCapacitance(ctx : EDIF300Parser.SetCapacitanceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setCurrent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetCurrent(ctx : EDIF300Parser.SetCurrentContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setDistance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetDistance(ctx : EDIF300Parser.SetDistanceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setFrequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetFrequency(ctx : EDIF300Parser.SetFrequencyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetTime(ctx : EDIF300Parser.SetTimeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#setVoltage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetVoltage(ctx : EDIF300Parser.SetVoltageContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitShape(ctx : EDIF300Parser.ShapeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#siemens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSiemens(ctx : EDIF300Parser.SiemensContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignal(ctx : EDIF300Parser.SignalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalAnnotate(ctx : EDIF300Parser.SignalAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroup(ctx : EDIF300Parser.SignalGroupContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroupAnnotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroupAnnotate(ctx : EDIF300Parser.SignalGroupAnnotateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroupNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroupNameCaseSensitive(ctx : EDIF300Parser.SignalGroupNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroupNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroupNameDef(ctx : EDIF300Parser.SignalGroupNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroupNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroupNameRef(ctx : EDIF300Parser.SignalGroupNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalGroupRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalGroupRef(ctx : EDIF300Parser.SignalGroupRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalIndexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalIndexValue(ctx : EDIF300Parser.SignalIndexValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalJoined(ctx : EDIF300Parser.SignalJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalList(ctx : EDIF300Parser.SignalListContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalMemberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalMemberRef(ctx : EDIF300Parser.SignalMemberRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalNameCaseSensitive(ctx : EDIF300Parser.SignalNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalNameDef(ctx : EDIF300Parser.SignalNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalNameRef(ctx : EDIF300Parser.SignalNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalRef(ctx : EDIF300Parser.SignalRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#signalWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignalWidth(ctx : EDIF300Parser.SignalWidthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#simpleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpleName(ctx : EDIF300Parser.SimpleNameContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#startPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStartPoint(ctx : EDIF300Parser.StartPointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatus(ctx : EDIF300Parser.StatusContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStep(ctx : EDIF300Parser.StepContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitString(ctx : EDIF300Parser.StringContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringConcatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringConcatenate(ctx : EDIF300Parser.StringConcatenateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringConstant(ctx : EDIF300Parser.StringConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringConstantRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringConstantRef(ctx : EDIF300Parser.StringConstantRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringEqual(ctx : EDIF300Parser.StringEqualContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringExpression(ctx : EDIF300Parser.StringExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringLength(ctx : EDIF300Parser.StringLengthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringParameter(ctx : EDIF300Parser.StringParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringParameterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringParameterAssign(ctx : EDIF300Parser.StringParameterAssignContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringParameterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringParameterRef(ctx : EDIF300Parser.StringParameterRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringPrefix(ctx : EDIF300Parser.StringPrefixContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringSuffix(ctx : EDIF300Parser.StringSuffixContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringValue(ctx : EDIF300Parser.StringValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStrong(ctx : EDIF300Parser.StrongContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#subIssue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubIssue(ctx : EDIF300Parser.SubIssueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#substring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubstring(ctx : EDIF300Parser.SubstringContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#substringLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubstringLength(ctx : EDIF300Parser.SubstringLengthContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#substringOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubstringOffset(ctx : EDIF300Parser.SubstringOffsetContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#subtrahend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtrahend(ctx : EDIF300Parser.SubtrahendContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#symbolicLayoutUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicLayoutUnits(ctx : EDIF300Parser.SymbolicLayoutUnitsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#symbolicLayoutView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicLayoutView(ctx : EDIF300Parser.SymbolicLayoutViewContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#symbolPortImplementationNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolPortImplementationNameDef(ctx : EDIF300Parser.SymbolPortImplementationNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#symbolPortImplementationNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolPortImplementationNameRef(ctx : EDIF300Parser.SymbolPortImplementationNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#technology}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTechnology(ctx : EDIF300Parser.TechnologyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#textHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTextHeight(ctx : EDIF300Parser.TextHeightContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#throughPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThroughPoint(ctx : EDIF300Parser.ThroughPointContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTime(ctx : EDIF300Parser.TimeContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timeDelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimeDelay(ctx : EDIF300Parser.TimeDelayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timeInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimeInterval(ctx : EDIF300Parser.TimeIntervalContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timeStamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimeStamp(ctx : EDIF300Parser.TimeStampContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimeValue(ctx : EDIF300Parser.TimeValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTiming(ctx : EDIF300Parser.TimingContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timingDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimingDisplay(ctx : EDIF300Parser.TimingDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timingNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimingNameDef(ctx : EDIF300Parser.TimingNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#timingNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTimingNameRef(ctx : EDIF300Parser.TimingNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#toInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitToInteger(ctx : EDIF300Parser.ToIntegerContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#topJustify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTopJustify(ctx : EDIF300Parser.TopJustifyContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#totalPages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTotalPages(ctx : EDIF300Parser.TotalPagesContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#totalPagesDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTotalPagesDisplay(ctx : EDIF300Parser.TotalPagesDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTransform(ctx : EDIF300Parser.TransformContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTransition(ctx : EDIF300Parser.TransitionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#etrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEtrue(ctx : EDIF300Parser.EtrueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#truncate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTruncate(ctx : EDIF300Parser.TruncateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#typedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedValue(ctx : EDIF300Parser.TypedValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#typeface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeface(ctx : EDIF300Parser.TypefaceContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#typefaceSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypefaceSuffix(ctx : EDIF300Parser.TypefaceSuffixContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unconfigured}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnconfigured(ctx : EDIF300Parser.UnconfiguredContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unconstrained}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnconstrained(ctx : EDIF300Parser.UnconstrainedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#undefined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUndefined(ctx : EDIF300Parser.UndefinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnit(ctx : EDIF300Parser.UnitContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unitDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnitDefinitions(ctx : EDIF300Parser.UnitDefinitionsContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unitExponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnitExponent(ctx : EDIF300Parser.UnitExponentContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unitNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnitNameDef(ctx : EDIF300Parser.UnitNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unitNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnitNameRef(ctx : EDIF300Parser.UnitNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unitRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnitRef(ctx : EDIF300Parser.UnitRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unrestricted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnrestricted(ctx : EDIF300Parser.UnrestrictedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unspecified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnspecified(ctx : EDIF300Parser.UnspecifiedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unspecifiedDirectionPort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnspecifiedDirectionPort(ctx : EDIF300Parser.UnspecifiedDirectionPortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#untyped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUntyped(ctx : EDIF300Parser.UntypedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnused(ctx : EDIF300Parser.UnusedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#usableArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsableArea(ctx : EDIF300Parser.UsableAreaContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#userData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUserData(ctx : EDIF300Parser.UserDataContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#userDataTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUserDataTag(ctx : EDIF300Parser.UserDataTagContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVersion(ctx : EDIF300Parser.VersionContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#verticalJustification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVerticalJustification(ctx : EDIF300Parser.VerticalJustificationContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroup(ctx : EDIF300Parser.ViewGroupContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroupHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroupHeader(ctx : EDIF300Parser.ViewGroupHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroupNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroupNameCaseSensitive(ctx : EDIF300Parser.ViewGroupNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroupNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroupNameDef(ctx : EDIF300Parser.ViewGroupNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroupNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroupNameRef(ctx : EDIF300Parser.ViewGroupNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewGroupRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewGroupRef(ctx : EDIF300Parser.ViewGroupRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewNameCaseSensitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewNameCaseSensitive(ctx : EDIF300Parser.ViewNameCaseSensitiveContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewNameDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewNameDef(ctx : EDIF300Parser.ViewNameDefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewNameDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewNameDisplay(ctx : EDIF300Parser.ViewNameDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewNameRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewNameRef(ctx : EDIF300Parser.ViewNameRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewPropertyDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewPropertyDisplay(ctx : EDIF300Parser.ViewPropertyDisplayContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewPropertyOverride}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewPropertyOverride(ctx : EDIF300Parser.ViewPropertyOverrideContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#viewRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewRef(ctx : EDIF300Parser.ViewRefContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#visible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVisible(ctx : EDIF300Parser.VisibleContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#volt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVolt(ctx : EDIF300Parser.VoltContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#voltageMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVoltageMap(ctx : EDIF300Parser.VoltageMapContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#voltageValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVoltageValue(ctx : EDIF300Parser.VoltageValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#watt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWatt(ctx : EDIF300Parser.WattContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#weak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWeak(ctx : EDIF300Parser.WeakContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#weakJoined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWeakJoined(ctx : EDIF300Parser.WeakJoinedContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#weber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWeber(ctx : EDIF300Parser.WeberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#widePort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWidePort(ctx : EDIF300Parser.WidePortContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#wideWire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWideWire(ctx : EDIF300Parser.WideWireContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#written}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWritten(ctx : EDIF300Parser.WrittenContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#xCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitXCoordinate(ctx : EDIF300Parser.XCoordinateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#xNumberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitXNumberValue(ctx : EDIF300Parser.XNumberValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitXor(ctx : EDIF300Parser.XorContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#yCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitYCoordinate(ctx : EDIF300Parser.YCoordinateContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitYear(ctx : EDIF300Parser.YearContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#yearNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitYearNumber(ctx : EDIF300Parser.YearNumberContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#yNumberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitYNumberValue(ctx : EDIF300Parser.YNumberValueContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#integerToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerToken(ctx : EDIF300Parser.IntegerTokenContext) : T
	/**
	 * Visit a parse tree produced by {@link EDIF300Parser#stringToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringToken(ctx : EDIF300Parser.StringTokenContext) : T
}