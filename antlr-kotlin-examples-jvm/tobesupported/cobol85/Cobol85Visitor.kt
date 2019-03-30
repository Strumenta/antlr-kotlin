// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cobol85Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface Cobol85Visitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStartRule(ctx : Cobol85Parser.StartRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompilationUnit(ctx : Cobol85Parser.CompilationUnitContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgramUnit(ctx : Cobol85Parser.ProgramUnitContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEndProgramStatement(ctx : Cobol85Parser.EndProgramStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentificationDivision(ctx : Cobol85Parser.IdentificationDivisionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentificationDivisionBody(ctx : Cobol85Parser.IdentificationDivisionBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgramIdParagraph(ctx : Cobol85Parser.ProgramIdParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAuthorParagraph(ctx : Cobol85Parser.AuthorParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstallationParagraph(ctx : Cobol85Parser.InstallationParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDateWrittenParagraph(ctx : Cobol85Parser.DateWrittenParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDateCompiledParagraph(ctx : Cobol85Parser.DateCompiledParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSecurityParagraph(ctx : Cobol85Parser.SecurityParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRemarksParagraph(ctx : Cobol85Parser.RemarksParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnvironmentDivision(ctx : Cobol85Parser.EnvironmentDivisionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnvironmentDivisionBody(ctx : Cobol85Parser.EnvironmentDivisionBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConfigurationSection(ctx : Cobol85Parser.ConfigurationSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConfigurationSectionParagraph(ctx : Cobol85Parser.ConfigurationSectionParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSourceComputerParagraph(ctx : Cobol85Parser.SourceComputerParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitObjectComputerParagraph(ctx : Cobol85Parser.ObjectComputerParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitObjectComputerClause(ctx : Cobol85Parser.ObjectComputerClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemorySizeClause(ctx : Cobol85Parser.MemorySizeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDiskSizeClause(ctx : Cobol85Parser.DiskSizeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCollatingSequenceClause(ctx : Cobol85Parser.CollatingSequenceClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCollatingSequenceClauseAlphanumeric(ctx : Cobol85Parser.CollatingSequenceClauseAlphanumericContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCollatingSequenceClauseNational(ctx : Cobol85Parser.CollatingSequenceClauseNationalContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSegmentLimitClause(ctx : Cobol85Parser.SegmentLimitClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharacterSetClause(ctx : Cobol85Parser.CharacterSetClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpecialNamesParagraph(ctx : Cobol85Parser.SpecialNamesParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpecialNameClause(ctx : Cobol85Parser.SpecialNameClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetClause(ctx : Cobol85Parser.AlphabetClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetClauseFormat1(ctx : Cobol85Parser.AlphabetClauseFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetLiterals(ctx : Cobol85Parser.AlphabetLiteralsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetThrough(ctx : Cobol85Parser.AlphabetThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetAlso(ctx : Cobol85Parser.AlphabetAlsoContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetClauseFormat2(ctx : Cobol85Parser.AlphabetClauseFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitChannelClause(ctx : Cobol85Parser.ChannelClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassClause(ctx : Cobol85Parser.ClassClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassClauseThrough(ctx : Cobol85Parser.ClassClauseThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassClauseFrom(ctx : Cobol85Parser.ClassClauseFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassClauseTo(ctx : Cobol85Parser.ClassClauseToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCurrencySignClause(ctx : Cobol85Parser.CurrencySignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDecimalPointClause(ctx : Cobol85Parser.DecimalPointClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefaultComputationalSignClause(ctx : Cobol85Parser.DefaultComputationalSignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefaultDisplaySignClause(ctx : Cobol85Parser.DefaultDisplaySignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnvironmentSwitchNameClause(ctx : Cobol85Parser.EnvironmentSwitchNameClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnvironmentSwitchNameSpecialNamesStatusPhrase(ctx : Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOdtClause(ctx : Cobol85Parser.OdtClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReserveNetworkClause(ctx : Cobol85Parser.ReserveNetworkClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicCharactersClause(ctx : Cobol85Parser.SymbolicCharactersClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicCharacters(ctx : Cobol85Parser.SymbolicCharactersContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInputOutputSection(ctx : Cobol85Parser.InputOutputSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInputOutputSectionParagraph(ctx : Cobol85Parser.InputOutputSectionParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileControlParagraph(ctx : Cobol85Parser.FileControlParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileControlEntry(ctx : Cobol85Parser.FileControlEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelectClause(ctx : Cobol85Parser.SelectClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileControlClause(ctx : Cobol85Parser.FileControlClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignClause(ctx : Cobol85Parser.AssignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReserveClause(ctx : Cobol85Parser.ReserveClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOrganizationClause(ctx : Cobol85Parser.OrganizationClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPaddingCharacterClause(ctx : Cobol85Parser.PaddingCharacterClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordDelimiterClause(ctx : Cobol85Parser.RecordDelimiterClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAccessModeClause(ctx : Cobol85Parser.AccessModeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordKeyClause(ctx : Cobol85Parser.RecordKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlternateRecordKeyClause(ctx : Cobol85Parser.AlternateRecordKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPasswordClause(ctx : Cobol85Parser.PasswordClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileStatusClause(ctx : Cobol85Parser.FileStatusClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelativeKeyClause(ctx : Cobol85Parser.RelativeKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIoControlParagraph(ctx : Cobol85Parser.IoControlParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIoControlClause(ctx : Cobol85Parser.IoControlClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRerunClause(ctx : Cobol85Parser.RerunClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRerunEveryRecords(ctx : Cobol85Parser.RerunEveryRecordsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRerunEveryOf(ctx : Cobol85Parser.RerunEveryOfContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRerunEveryClock(ctx : Cobol85Parser.RerunEveryClockContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSameClause(ctx : Cobol85Parser.SameClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultipleFileClause(ctx : Cobol85Parser.MultipleFileClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultipleFilePosition(ctx : Cobol85Parser.MultipleFilePositionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommitmentControlClause(ctx : Cobol85Parser.CommitmentControlClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDivision(ctx : Cobol85Parser.DataDivisionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDivisionSection(ctx : Cobol85Parser.DataDivisionSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileSection(ctx : Cobol85Parser.FileSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileDescriptionEntry(ctx : Cobol85Parser.FileDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileDescriptionEntryClause(ctx : Cobol85Parser.FileDescriptionEntryClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExternalClause(ctx : Cobol85Parser.ExternalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGlobalClause(ctx : Cobol85Parser.GlobalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockContainsClause(ctx : Cobol85Parser.BlockContainsClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockContainsTo(ctx : Cobol85Parser.BlockContainsToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordContainsClause(ctx : Cobol85Parser.RecordContainsClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordContainsClauseFormat1(ctx : Cobol85Parser.RecordContainsClauseFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordContainsClauseFormat2(ctx : Cobol85Parser.RecordContainsClauseFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordContainsClauseFormat3(ctx : Cobol85Parser.RecordContainsClauseFormat3Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordContainsTo(ctx : Cobol85Parser.RecordContainsToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLabelRecordsClause(ctx : Cobol85Parser.LabelRecordsClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValueOfClause(ctx : Cobol85Parser.ValueOfClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValuePair(ctx : Cobol85Parser.ValuePairContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataRecordsClause(ctx : Cobol85Parser.DataRecordsClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinageClause(ctx : Cobol85Parser.LinageClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinageAt(ctx : Cobol85Parser.LinageAtContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinageFootingAt(ctx : Cobol85Parser.LinageFootingAtContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinageLinesAtTop(ctx : Cobol85Parser.LinageLinesAtTopContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinageLinesAtBottom(ctx : Cobol85Parser.LinageLinesAtBottomContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordingModeClause(ctx : Cobol85Parser.RecordingModeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitModeStatement(ctx : Cobol85Parser.ModeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCodeSetClause(ctx : Cobol85Parser.CodeSetClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportClause(ctx : Cobol85Parser.ReportClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataBaseSection(ctx : Cobol85Parser.DataBaseSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataBaseSectionEntry(ctx : Cobol85Parser.DataBaseSectionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWorkingStorageSection(ctx : Cobol85Parser.WorkingStorageSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinkageSection(ctx : Cobol85Parser.LinkageSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommunicationSection(ctx : Cobol85Parser.CommunicationSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommunicationDescriptionEntry(ctx : Cobol85Parser.CommunicationDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommunicationDescriptionEntryFormat1(ctx : Cobol85Parser.CommunicationDescriptionEntryFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommunicationDescriptionEntryFormat2(ctx : Cobol85Parser.CommunicationDescriptionEntryFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommunicationDescriptionEntryFormat3(ctx : Cobol85Parser.CommunicationDescriptionEntryFormat3Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDestinationCountClause(ctx : Cobol85Parser.DestinationCountClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDestinationTableClause(ctx : Cobol85Parser.DestinationTableClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEndKeyClause(ctx : Cobol85Parser.EndKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitErrorKeyClause(ctx : Cobol85Parser.ErrorKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMessageCountClause(ctx : Cobol85Parser.MessageCountClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMessageDateClause(ctx : Cobol85Parser.MessageDateClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMessageTimeClause(ctx : Cobol85Parser.MessageTimeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatusKeyClause(ctx : Cobol85Parser.StatusKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicDestinationClause(ctx : Cobol85Parser.SymbolicDestinationClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicQueueClause(ctx : Cobol85Parser.SymbolicQueueClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicSourceClause(ctx : Cobol85Parser.SymbolicSourceClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicTerminalClause(ctx : Cobol85Parser.SymbolicTerminalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicSubQueueClause(ctx : Cobol85Parser.SymbolicSubQueueClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTextLengthClause(ctx : Cobol85Parser.TextLengthClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalStorageSection(ctx : Cobol85Parser.LocalStorageSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenSection(ctx : Cobol85Parser.ScreenSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionEntry(ctx : Cobol85Parser.ScreenDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionBlankClause(ctx : Cobol85Parser.ScreenDescriptionBlankClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionBellClause(ctx : Cobol85Parser.ScreenDescriptionBellClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionBlinkClause(ctx : Cobol85Parser.ScreenDescriptionBlinkClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionEraseClause(ctx : Cobol85Parser.ScreenDescriptionEraseClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionLightClause(ctx : Cobol85Parser.ScreenDescriptionLightClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionGridClause(ctx : Cobol85Parser.ScreenDescriptionGridClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionReverseVideoClause(ctx : Cobol85Parser.ScreenDescriptionReverseVideoClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionUnderlineClause(ctx : Cobol85Parser.ScreenDescriptionUnderlineClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionSizeClause(ctx : Cobol85Parser.ScreenDescriptionSizeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionLineClause(ctx : Cobol85Parser.ScreenDescriptionLineClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionColumnClause(ctx : Cobol85Parser.ScreenDescriptionColumnClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionForegroundColorClause(ctx : Cobol85Parser.ScreenDescriptionForegroundColorClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionBackgroundColorClause(ctx : Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionControlClause(ctx : Cobol85Parser.ScreenDescriptionControlClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionValueClause(ctx : Cobol85Parser.ScreenDescriptionValueClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionPictureClause(ctx : Cobol85Parser.ScreenDescriptionPictureClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionFromClause(ctx : Cobol85Parser.ScreenDescriptionFromClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionToClause(ctx : Cobol85Parser.ScreenDescriptionToClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionUsingClause(ctx : Cobol85Parser.ScreenDescriptionUsingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionUsageClause(ctx : Cobol85Parser.ScreenDescriptionUsageClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionBlankWhenZeroClause(ctx : Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionJustifiedClause(ctx : Cobol85Parser.ScreenDescriptionJustifiedClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionSignClause(ctx : Cobol85Parser.ScreenDescriptionSignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionAutoClause(ctx : Cobol85Parser.ScreenDescriptionAutoClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionSecureClause(ctx : Cobol85Parser.ScreenDescriptionSecureClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionRequiredClause(ctx : Cobol85Parser.ScreenDescriptionRequiredClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionPromptClause(ctx : Cobol85Parser.ScreenDescriptionPromptClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionPromptOccursClause(ctx : Cobol85Parser.ScreenDescriptionPromptOccursClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionFullClause(ctx : Cobol85Parser.ScreenDescriptionFullClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenDescriptionZeroFillClause(ctx : Cobol85Parser.ScreenDescriptionZeroFillClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportSection(ctx : Cobol85Parser.ReportSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescription(ctx : Cobol85Parser.ReportDescriptionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionEntry(ctx : Cobol85Parser.ReportDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionGlobalClause(ctx : Cobol85Parser.ReportDescriptionGlobalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionPageLimitClause(ctx : Cobol85Parser.ReportDescriptionPageLimitClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionHeadingClause(ctx : Cobol85Parser.ReportDescriptionHeadingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionFirstDetailClause(ctx : Cobol85Parser.ReportDescriptionFirstDetailClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionLastDetailClause(ctx : Cobol85Parser.ReportDescriptionLastDetailClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportDescriptionFootingClause(ctx : Cobol85Parser.ReportDescriptionFootingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupDescriptionEntry(ctx : Cobol85Parser.ReportGroupDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupDescriptionEntryFormat1(ctx : Cobol85Parser.ReportGroupDescriptionEntryFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupDescriptionEntryFormat2(ctx : Cobol85Parser.ReportGroupDescriptionEntryFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupDescriptionEntryFormat3(ctx : Cobol85Parser.ReportGroupDescriptionEntryFormat3Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupBlankWhenZeroClause(ctx : Cobol85Parser.ReportGroupBlankWhenZeroClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupColumnNumberClause(ctx : Cobol85Parser.ReportGroupColumnNumberClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupIndicateClause(ctx : Cobol85Parser.ReportGroupIndicateClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupJustifiedClause(ctx : Cobol85Parser.ReportGroupJustifiedClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupLineNumberClause(ctx : Cobol85Parser.ReportGroupLineNumberClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupLineNumberNextPage(ctx : Cobol85Parser.ReportGroupLineNumberNextPageContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupLineNumberPlus(ctx : Cobol85Parser.ReportGroupLineNumberPlusContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupNextGroupClause(ctx : Cobol85Parser.ReportGroupNextGroupClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupNextGroupPlus(ctx : Cobol85Parser.ReportGroupNextGroupPlusContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupNextGroupNextPage(ctx : Cobol85Parser.ReportGroupNextGroupNextPageContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupPictureClause(ctx : Cobol85Parser.ReportGroupPictureClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupResetClause(ctx : Cobol85Parser.ReportGroupResetClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupSignClause(ctx : Cobol85Parser.ReportGroupSignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupSourceClause(ctx : Cobol85Parser.ReportGroupSourceClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupSumClause(ctx : Cobol85Parser.ReportGroupSumClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeClause(ctx : Cobol85Parser.ReportGroupTypeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeReportHeading(ctx : Cobol85Parser.ReportGroupTypeReportHeadingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypePageHeading(ctx : Cobol85Parser.ReportGroupTypePageHeadingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeControlHeading(ctx : Cobol85Parser.ReportGroupTypeControlHeadingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeDetail(ctx : Cobol85Parser.ReportGroupTypeDetailContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeControlFooting(ctx : Cobol85Parser.ReportGroupTypeControlFootingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupUsageClause(ctx : Cobol85Parser.ReportGroupUsageClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypePageFooting(ctx : Cobol85Parser.ReportGroupTypePageFootingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupTypeReportFooting(ctx : Cobol85Parser.ReportGroupTypeReportFootingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportGroupValueClause(ctx : Cobol85Parser.ReportGroupValueClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgramLibrarySection(ctx : Cobol85Parser.ProgramLibrarySectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryDescriptionEntry(ctx : Cobol85Parser.LibraryDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryDescriptionEntryFormat1(ctx : Cobol85Parser.LibraryDescriptionEntryFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryDescriptionEntryFormat2(ctx : Cobol85Parser.LibraryDescriptionEntryFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryAttributeClauseFormat1(ctx : Cobol85Parser.LibraryAttributeClauseFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryAttributeClauseFormat2(ctx : Cobol85Parser.LibraryAttributeClauseFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryAttributeFunction(ctx : Cobol85Parser.LibraryAttributeFunctionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryAttributeParameter(ctx : Cobol85Parser.LibraryAttributeParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryAttributeTitle(ctx : Cobol85Parser.LibraryAttributeTitleContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureClauseFormat1(ctx : Cobol85Parser.LibraryEntryProcedureClauseFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureClauseFormat2(ctx : Cobol85Parser.LibraryEntryProcedureClauseFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureForClause(ctx : Cobol85Parser.LibraryEntryProcedureForClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureGivingClause(ctx : Cobol85Parser.LibraryEntryProcedureGivingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureUsingClause(ctx : Cobol85Parser.LibraryEntryProcedureUsingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureUsingName(ctx : Cobol85Parser.LibraryEntryProcedureUsingNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureWithClause(ctx : Cobol85Parser.LibraryEntryProcedureWithClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryEntryProcedureWithName(ctx : Cobol85Parser.LibraryEntryProcedureWithNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryIsCommonClause(ctx : Cobol85Parser.LibraryIsCommonClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryIsGlobalClause(ctx : Cobol85Parser.LibraryIsGlobalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescriptionEntry(ctx : Cobol85Parser.DataDescriptionEntryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescriptionEntryFormat1(ctx : Cobol85Parser.DataDescriptionEntryFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescriptionEntryFormat2(ctx : Cobol85Parser.DataDescriptionEntryFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescriptionEntryFormat3(ctx : Cobol85Parser.DataDescriptionEntryFormat3Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescriptionEntryExecSql(ctx : Cobol85Parser.DataDescriptionEntryExecSqlContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataAlignedClause(ctx : Cobol85Parser.DataAlignedClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataBlankWhenZeroClause(ctx : Cobol85Parser.DataBlankWhenZeroClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataCommonOwnLocalClause(ctx : Cobol85Parser.DataCommonOwnLocalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataExternalClause(ctx : Cobol85Parser.DataExternalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataGlobalClause(ctx : Cobol85Parser.DataGlobalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataIntegerStringClause(ctx : Cobol85Parser.DataIntegerStringClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataJustifiedClause(ctx : Cobol85Parser.DataJustifiedClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataOccursClause(ctx : Cobol85Parser.DataOccursClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataOccursTo(ctx : Cobol85Parser.DataOccursToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataOccursSort(ctx : Cobol85Parser.DataOccursSortContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataPictureClause(ctx : Cobol85Parser.DataPictureClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPictureString(ctx : Cobol85Parser.PictureStringContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPictureChars(ctx : Cobol85Parser.PictureCharsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPictureCardinality(ctx : Cobol85Parser.PictureCardinalityContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataReceivedByClause(ctx : Cobol85Parser.DataReceivedByClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataRecordAreaClause(ctx : Cobol85Parser.DataRecordAreaClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataRedefinesClause(ctx : Cobol85Parser.DataRedefinesClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataRenamesClause(ctx : Cobol85Parser.DataRenamesClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataSignClause(ctx : Cobol85Parser.DataSignClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataSynchronizedClause(ctx : Cobol85Parser.DataSynchronizedClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataThreadLocalClause(ctx : Cobol85Parser.DataThreadLocalClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataTypeClause(ctx : Cobol85Parser.DataTypeClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataTypeDefClause(ctx : Cobol85Parser.DataTypeDefClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataUsageClause(ctx : Cobol85Parser.DataUsageClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataUsingClause(ctx : Cobol85Parser.DataUsingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataValueClause(ctx : Cobol85Parser.DataValueClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataValueInterval(ctx : Cobol85Parser.DataValueIntervalContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataValueIntervalFrom(ctx : Cobol85Parser.DataValueIntervalFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataValueIntervalTo(ctx : Cobol85Parser.DataValueIntervalToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataWithLowerBoundsClause(ctx : Cobol85Parser.DataWithLowerBoundsClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivision(ctx : Cobol85Parser.ProcedureDivisionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionUsingClause(ctx : Cobol85Parser.ProcedureDivisionUsingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionGivingClause(ctx : Cobol85Parser.ProcedureDivisionGivingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionUsingParameter(ctx : Cobol85Parser.ProcedureDivisionUsingParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionByReferencePhrase(ctx : Cobol85Parser.ProcedureDivisionByReferencePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionByReference(ctx : Cobol85Parser.ProcedureDivisionByReferenceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionByValuePhrase(ctx : Cobol85Parser.ProcedureDivisionByValuePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionByValue(ctx : Cobol85Parser.ProcedureDivisionByValueContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDeclaratives(ctx : Cobol85Parser.ProcedureDeclarativesContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDeclarative(ctx : Cobol85Parser.ProcedureDeclarativeContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureSectionHeader(ctx : Cobol85Parser.ProcedureSectionHeaderContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureDivisionBody(ctx : Cobol85Parser.ProcedureDivisionBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureSection(ctx : Cobol85Parser.ProcedureSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParagraphs(ctx : Cobol85Parser.ParagraphsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParagraph(ctx : Cobol85Parser.ParagraphContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSentence(ctx : Cobol85Parser.SentenceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : Cobol85Parser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcceptStatement(ctx : Cobol85Parser.AcceptStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcceptFromDateStatement(ctx : Cobol85Parser.AcceptFromDateStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcceptFromMnemonicStatement(ctx : Cobol85Parser.AcceptFromMnemonicStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcceptFromEscapeKeyStatement(ctx : Cobol85Parser.AcceptFromEscapeKeyStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAcceptMessageCountStatement(ctx : Cobol85Parser.AcceptMessageCountStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddStatement(ctx : Cobol85Parser.AddStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddToStatement(ctx : Cobol85Parser.AddToStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddToGivingStatement(ctx : Cobol85Parser.AddToGivingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddCorrespondingStatement(ctx : Cobol85Parser.AddCorrespondingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddFrom(ctx : Cobol85Parser.AddFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddTo(ctx : Cobol85Parser.AddToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddToGiving(ctx : Cobol85Parser.AddToGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddGiving(ctx : Cobol85Parser.AddGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlteredGoTo(ctx : Cobol85Parser.AlteredGoToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlterStatement(ctx : Cobol85Parser.AlterStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlterProceedTo(ctx : Cobol85Parser.AlterProceedToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallStatement(ctx : Cobol85Parser.CallStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallUsingPhrase(ctx : Cobol85Parser.CallUsingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallUsingParameter(ctx : Cobol85Parser.CallUsingParameterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByReferencePhrase(ctx : Cobol85Parser.CallByReferencePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByReference(ctx : Cobol85Parser.CallByReferenceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByValuePhrase(ctx : Cobol85Parser.CallByValuePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByValue(ctx : Cobol85Parser.CallByValueContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByContentPhrase(ctx : Cobol85Parser.CallByContentPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallByContent(ctx : Cobol85Parser.CallByContentContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallGivingPhrase(ctx : Cobol85Parser.CallGivingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCancelStatement(ctx : Cobol85Parser.CancelStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCancelCall(ctx : Cobol85Parser.CancelCallContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCloseStatement(ctx : Cobol85Parser.CloseStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCloseFile(ctx : Cobol85Parser.CloseFileContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCloseReelUnitStatement(ctx : Cobol85Parser.CloseReelUnitStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCloseRelativeStatement(ctx : Cobol85Parser.CloseRelativeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClosePortFileIOStatement(ctx : Cobol85Parser.ClosePortFileIOStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClosePortFileIOUsing(ctx : Cobol85Parser.ClosePortFileIOUsingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClosePortFileIOUsingCloseDisposition(ctx : Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClosePortFileIOUsingAssociatedData(ctx : Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClosePortFileIOUsingAssociatedDataLength(ctx : Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComputeStatement(ctx : Cobol85Parser.ComputeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComputeStore(ctx : Cobol85Parser.ComputeStoreContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitContinueStatement(ctx : Cobol85Parser.ContinueStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeleteStatement(ctx : Cobol85Parser.DeleteStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisableStatement(ctx : Cobol85Parser.DisableStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayStatement(ctx : Cobol85Parser.DisplayStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayOperand(ctx : Cobol85Parser.DisplayOperandContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayAt(ctx : Cobol85Parser.DisplayAtContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayUpon(ctx : Cobol85Parser.DisplayUponContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayWith(ctx : Cobol85Parser.DisplayWithContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideStatement(ctx : Cobol85Parser.DivideStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideIntoStatement(ctx : Cobol85Parser.DivideIntoStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideIntoGivingStatement(ctx : Cobol85Parser.DivideIntoGivingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideByGivingStatement(ctx : Cobol85Parser.DivideByGivingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideGivingPhrase(ctx : Cobol85Parser.DivideGivingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideInto(ctx : Cobol85Parser.DivideIntoContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideGiving(ctx : Cobol85Parser.DivideGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivideRemainder(ctx : Cobol85Parser.DivideRemainderContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnableStatement(ctx : Cobol85Parser.EnableStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEntryStatement(ctx : Cobol85Parser.EntryStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateStatement(ctx : Cobol85Parser.EvaluateStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateSelect(ctx : Cobol85Parser.EvaluateSelectContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateAlsoSelect(ctx : Cobol85Parser.EvaluateAlsoSelectContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateWhenPhrase(ctx : Cobol85Parser.EvaluateWhenPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateWhen(ctx : Cobol85Parser.EvaluateWhenContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateCondition(ctx : Cobol85Parser.EvaluateConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateThrough(ctx : Cobol85Parser.EvaluateThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateAlsoCondition(ctx : Cobol85Parser.EvaluateAlsoConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateWhenOther(ctx : Cobol85Parser.EvaluateWhenOtherContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEvaluateValue(ctx : Cobol85Parser.EvaluateValueContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecCicsStatement(ctx : Cobol85Parser.ExecCicsStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecSqlStatement(ctx : Cobol85Parser.ExecSqlStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecSqlImsStatement(ctx : Cobol85Parser.ExecSqlImsStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExhibitStatement(ctx : Cobol85Parser.ExhibitStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExhibitOperand(ctx : Cobol85Parser.ExhibitOperandContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExitStatement(ctx : Cobol85Parser.ExitStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGenerateStatement(ctx : Cobol85Parser.GenerateStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGobackStatement(ctx : Cobol85Parser.GobackStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoToStatement(ctx : Cobol85Parser.GoToStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoToStatementSimple(ctx : Cobol85Parser.GoToStatementSimpleContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoToDependingOnStatement(ctx : Cobol85Parser.GoToDependingOnStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfStatement(ctx : Cobol85Parser.IfStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfThen(ctx : Cobol85Parser.IfThenContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfElse(ctx : Cobol85Parser.IfElseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializeStatement(ctx : Cobol85Parser.InitializeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializeReplacingPhrase(ctx : Cobol85Parser.InitializeReplacingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializeReplacingBy(ctx : Cobol85Parser.InitializeReplacingByContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitiateStatement(ctx : Cobol85Parser.InitiateStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectStatement(ctx : Cobol85Parser.InspectStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectTallyingPhrase(ctx : Cobol85Parser.InspectTallyingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectReplacingPhrase(ctx : Cobol85Parser.InspectReplacingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectTallyingReplacingPhrase(ctx : Cobol85Parser.InspectTallyingReplacingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectConvertingPhrase(ctx : Cobol85Parser.InspectConvertingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectFor(ctx : Cobol85Parser.InspectForContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectCharacters(ctx : Cobol85Parser.InspectCharactersContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectReplacingCharacters(ctx : Cobol85Parser.InspectReplacingCharactersContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectAllLeadings(ctx : Cobol85Parser.InspectAllLeadingsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectReplacingAllLeadings(ctx : Cobol85Parser.InspectReplacingAllLeadingsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectAllLeading(ctx : Cobol85Parser.InspectAllLeadingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectReplacingAllLeading(ctx : Cobol85Parser.InspectReplacingAllLeadingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectBy(ctx : Cobol85Parser.InspectByContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectTo(ctx : Cobol85Parser.InspectToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInspectBeforeAfter(ctx : Cobol85Parser.InspectBeforeAfterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeStatement(ctx : Cobol85Parser.MergeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeOnKeyClause(ctx : Cobol85Parser.MergeOnKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeCollatingSequencePhrase(ctx : Cobol85Parser.MergeCollatingSequencePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeCollatingAlphanumeric(ctx : Cobol85Parser.MergeCollatingAlphanumericContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeCollatingNational(ctx : Cobol85Parser.MergeCollatingNationalContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeUsing(ctx : Cobol85Parser.MergeUsingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeOutputProcedurePhrase(ctx : Cobol85Parser.MergeOutputProcedurePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeOutputThrough(ctx : Cobol85Parser.MergeOutputThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeGivingPhrase(ctx : Cobol85Parser.MergeGivingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMergeGiving(ctx : Cobol85Parser.MergeGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMoveStatement(ctx : Cobol85Parser.MoveStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMoveToStatement(ctx : Cobol85Parser.MoveToStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMoveToSendingArea(ctx : Cobol85Parser.MoveToSendingAreaContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMoveCorrespondingToStatement(ctx : Cobol85Parser.MoveCorrespondingToStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMoveCorrespondingToSendingArea(ctx : Cobol85Parser.MoveCorrespondingToSendingAreaContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyStatement(ctx : Cobol85Parser.MultiplyStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyRegular(ctx : Cobol85Parser.MultiplyRegularContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyRegularOperand(ctx : Cobol85Parser.MultiplyRegularOperandContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyGiving(ctx : Cobol85Parser.MultiplyGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyGivingOperand(ctx : Cobol85Parser.MultiplyGivingOperandContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyGivingResult(ctx : Cobol85Parser.MultiplyGivingResultContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenStatement(ctx : Cobol85Parser.OpenStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenInputStatement(ctx : Cobol85Parser.OpenInputStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenInput(ctx : Cobol85Parser.OpenInputContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenOutputStatement(ctx : Cobol85Parser.OpenOutputStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenOutput(ctx : Cobol85Parser.OpenOutputContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenIOStatement(ctx : Cobol85Parser.OpenIOStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpenExtendStatement(ctx : Cobol85Parser.OpenExtendStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformStatement(ctx : Cobol85Parser.PerformStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformInlineStatement(ctx : Cobol85Parser.PerformInlineStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformProcedureStatement(ctx : Cobol85Parser.PerformProcedureStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformType(ctx : Cobol85Parser.PerformTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformTimes(ctx : Cobol85Parser.PerformTimesContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformUntil(ctx : Cobol85Parser.PerformUntilContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformVarying(ctx : Cobol85Parser.PerformVaryingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformVaryingClause(ctx : Cobol85Parser.PerformVaryingClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformVaryingPhrase(ctx : Cobol85Parser.PerformVaryingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformAfter(ctx : Cobol85Parser.PerformAfterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformFrom(ctx : Cobol85Parser.PerformFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformBy(ctx : Cobol85Parser.PerformByContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPerformTestClause(ctx : Cobol85Parser.PerformTestClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPurgeStatement(ctx : Cobol85Parser.PurgeStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReadStatement(ctx : Cobol85Parser.ReadStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReadInto(ctx : Cobol85Parser.ReadIntoContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReadWith(ctx : Cobol85Parser.ReadWithContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReadKey(ctx : Cobol85Parser.ReadKeyContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveStatement(ctx : Cobol85Parser.ReceiveStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveFromStatement(ctx : Cobol85Parser.ReceiveFromStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveFrom(ctx : Cobol85Parser.ReceiveFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveIntoStatement(ctx : Cobol85Parser.ReceiveIntoStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveNoData(ctx : Cobol85Parser.ReceiveNoDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveWithData(ctx : Cobol85Parser.ReceiveWithDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveBefore(ctx : Cobol85Parser.ReceiveBeforeContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveWith(ctx : Cobol85Parser.ReceiveWithContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveThread(ctx : Cobol85Parser.ReceiveThreadContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveSize(ctx : Cobol85Parser.ReceiveSizeContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveStatus(ctx : Cobol85Parser.ReceiveStatusContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReleaseStatement(ctx : Cobol85Parser.ReleaseStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReturnStatement(ctx : Cobol85Parser.ReturnStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReturnInto(ctx : Cobol85Parser.ReturnIntoContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRewriteStatement(ctx : Cobol85Parser.RewriteStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRewriteFrom(ctx : Cobol85Parser.RewriteFromContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSearchStatement(ctx : Cobol85Parser.SearchStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSearchVarying(ctx : Cobol85Parser.SearchVaryingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSearchWhen(ctx : Cobol85Parser.SearchWhenContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendStatement(ctx : Cobol85Parser.SendStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendStatementSync(ctx : Cobol85Parser.SendStatementSyncContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendStatementAsync(ctx : Cobol85Parser.SendStatementAsyncContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendFromPhrase(ctx : Cobol85Parser.SendFromPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendWithPhrase(ctx : Cobol85Parser.SendWithPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendReplacingPhrase(ctx : Cobol85Parser.SendReplacingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendAdvancingPhrase(ctx : Cobol85Parser.SendAdvancingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendAdvancingPage(ctx : Cobol85Parser.SendAdvancingPageContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendAdvancingLines(ctx : Cobol85Parser.SendAdvancingLinesContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSendAdvancingMnemonic(ctx : Cobol85Parser.SendAdvancingMnemonicContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetStatement(ctx : Cobol85Parser.SetStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetToStatement(ctx : Cobol85Parser.SetToStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetUpDownByStatement(ctx : Cobol85Parser.SetUpDownByStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetTo(ctx : Cobol85Parser.SetToContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetToValue(ctx : Cobol85Parser.SetToValueContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetByValue(ctx : Cobol85Parser.SetByValueContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortStatement(ctx : Cobol85Parser.SortStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortOnKeyClause(ctx : Cobol85Parser.SortOnKeyClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortDuplicatesPhrase(ctx : Cobol85Parser.SortDuplicatesPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortCollatingSequencePhrase(ctx : Cobol85Parser.SortCollatingSequencePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortCollatingAlphanumeric(ctx : Cobol85Parser.SortCollatingAlphanumericContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortCollatingNational(ctx : Cobol85Parser.SortCollatingNationalContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortInputProcedurePhrase(ctx : Cobol85Parser.SortInputProcedurePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortInputThrough(ctx : Cobol85Parser.SortInputThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortUsing(ctx : Cobol85Parser.SortUsingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortOutputProcedurePhrase(ctx : Cobol85Parser.SortOutputProcedurePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortOutputThrough(ctx : Cobol85Parser.SortOutputThroughContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortGivingPhrase(ctx : Cobol85Parser.SortGivingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSortGiving(ctx : Cobol85Parser.SortGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStartStatement(ctx : Cobol85Parser.StartStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStartKey(ctx : Cobol85Parser.StartKeyContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStopStatement(ctx : Cobol85Parser.StopStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringStatement(ctx : Cobol85Parser.StringStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringSendingPhrase(ctx : Cobol85Parser.StringSendingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringSending(ctx : Cobol85Parser.StringSendingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringDelimitedByPhrase(ctx : Cobol85Parser.StringDelimitedByPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringForPhrase(ctx : Cobol85Parser.StringForPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringIntoPhrase(ctx : Cobol85Parser.StringIntoPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStringWithPointerPhrase(ctx : Cobol85Parser.StringWithPointerPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractStatement(ctx : Cobol85Parser.SubtractStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractFromStatement(ctx : Cobol85Parser.SubtractFromStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractFromGivingStatement(ctx : Cobol85Parser.SubtractFromGivingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractCorrespondingStatement(ctx : Cobol85Parser.SubtractCorrespondingStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractSubtrahend(ctx : Cobol85Parser.SubtractSubtrahendContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractMinuend(ctx : Cobol85Parser.SubtractMinuendContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractMinuendGiving(ctx : Cobol85Parser.SubtractMinuendGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractGiving(ctx : Cobol85Parser.SubtractGivingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubtractMinuendCorresponding(ctx : Cobol85Parser.SubtractMinuendCorrespondingContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTerminateStatement(ctx : Cobol85Parser.TerminateStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringStatement(ctx : Cobol85Parser.UnstringStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringSendingPhrase(ctx : Cobol85Parser.UnstringSendingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringDelimitedByPhrase(ctx : Cobol85Parser.UnstringDelimitedByPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringOrAllPhrase(ctx : Cobol85Parser.UnstringOrAllPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringIntoPhrase(ctx : Cobol85Parser.UnstringIntoPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringInto(ctx : Cobol85Parser.UnstringIntoContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringDelimiterIn(ctx : Cobol85Parser.UnstringDelimiterInContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringCountIn(ctx : Cobol85Parser.UnstringCountInContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringWithPointerPhrase(ctx : Cobol85Parser.UnstringWithPointerPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnstringTallyingPhrase(ctx : Cobol85Parser.UnstringTallyingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseStatement(ctx : Cobol85Parser.UseStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseAfterClause(ctx : Cobol85Parser.UseAfterClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseAfterOn(ctx : Cobol85Parser.UseAfterOnContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseDebugClause(ctx : Cobol85Parser.UseDebugClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseDebugOn(ctx : Cobol85Parser.UseDebugOnContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteStatement(ctx : Cobol85Parser.WriteStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteFromPhrase(ctx : Cobol85Parser.WriteFromPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteAdvancingPhrase(ctx : Cobol85Parser.WriteAdvancingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteAdvancingPage(ctx : Cobol85Parser.WriteAdvancingPageContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteAdvancingLines(ctx : Cobol85Parser.WriteAdvancingLinesContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteAdvancingMnemonic(ctx : Cobol85Parser.WriteAdvancingMnemonicContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteAtEndOfPagePhrase(ctx : Cobol85Parser.WriteAtEndOfPagePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWriteNotAtEndOfPagePhrase(ctx : Cobol85Parser.WriteNotAtEndOfPagePhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtEndPhrase(ctx : Cobol85Parser.AtEndPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotAtEndPhrase(ctx : Cobol85Parser.NotAtEndPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInvalidKeyPhrase(ctx : Cobol85Parser.InvalidKeyPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotInvalidKeyPhrase(ctx : Cobol85Parser.NotInvalidKeyPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOnOverflowPhrase(ctx : Cobol85Parser.OnOverflowPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotOnOverflowPhrase(ctx : Cobol85Parser.NotOnOverflowPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOnSizeErrorPhrase(ctx : Cobol85Parser.OnSizeErrorPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotOnSizeErrorPhrase(ctx : Cobol85Parser.NotOnSizeErrorPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOnExceptionClause(ctx : Cobol85Parser.OnExceptionClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotOnExceptionClause(ctx : Cobol85Parser.NotOnExceptionClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArithmeticExpression(ctx : Cobol85Parser.ArithmeticExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPlusMinus(ctx : Cobol85Parser.PlusMinusContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultDivs(ctx : Cobol85Parser.MultDivsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultDiv(ctx : Cobol85Parser.MultDivContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPowers(ctx : Cobol85Parser.PowersContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPower(ctx : Cobol85Parser.PowerContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBasis(ctx : Cobol85Parser.BasisContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCondition(ctx : Cobol85Parser.ConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAndOrCondition(ctx : Cobol85Parser.AndOrConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCombinableCondition(ctx : Cobol85Parser.CombinableConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpleCondition(ctx : Cobol85Parser.SimpleConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassCondition(ctx : Cobol85Parser.ClassConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionNameReference(ctx : Cobol85Parser.ConditionNameReferenceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionNameSubscriptReference(ctx : Cobol85Parser.ConditionNameSubscriptReferenceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationCondition(ctx : Cobol85Parser.RelationConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationSignCondition(ctx : Cobol85Parser.RelationSignConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationArithmeticComparison(ctx : Cobol85Parser.RelationArithmeticComparisonContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationCombinedComparison(ctx : Cobol85Parser.RelationCombinedComparisonContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationCombinedCondition(ctx : Cobol85Parser.RelationCombinedConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationalOperator(ctx : Cobol85Parser.RelationalOperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbbreviation(ctx : Cobol85Parser.AbbreviationContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentifier(ctx : Cobol85Parser.IdentifierContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTableCall(ctx : Cobol85Parser.TableCallContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionCall(ctx : Cobol85Parser.FunctionCallContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReferenceModifier(ctx : Cobol85Parser.ReferenceModifierContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharacterPosition(ctx : Cobol85Parser.CharacterPositionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLength(ctx : Cobol85Parser.LengthContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubscript(ctx : Cobol85Parser.SubscriptContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArgument(ctx : Cobol85Parser.ArgumentContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedDataName(ctx : Cobol85Parser.QualifiedDataNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedDataNameFormat1(ctx : Cobol85Parser.QualifiedDataNameFormat1Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedDataNameFormat2(ctx : Cobol85Parser.QualifiedDataNameFormat2Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedDataNameFormat3(ctx : Cobol85Parser.QualifiedDataNameFormat3Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedDataNameFormat4(ctx : Cobol85Parser.QualifiedDataNameFormat4Context) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedInData(ctx : Cobol85Parser.QualifiedInDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInData(ctx : Cobol85Parser.InDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInFile(ctx : Cobol85Parser.InFileContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInMnemonic(ctx : Cobol85Parser.InMnemonicContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInSection(ctx : Cobol85Parser.InSectionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInLibrary(ctx : Cobol85Parser.InLibraryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInTable(ctx : Cobol85Parser.InTableContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphabetName(ctx : Cobol85Parser.AlphabetNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentName(ctx : Cobol85Parser.AssignmentNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBasisName(ctx : Cobol85Parser.BasisNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCdName(ctx : Cobol85Parser.CdNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassName(ctx : Cobol85Parser.ClassNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComputerName(ctx : Cobol85Parser.ComputerNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionName(ctx : Cobol85Parser.ConditionNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataName(ctx : Cobol85Parser.DataNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDataDescName(ctx : Cobol85Parser.DataDescNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnvironmentName(ctx : Cobol85Parser.EnvironmentNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFileName(ctx : Cobol85Parser.FileNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionName(ctx : Cobol85Parser.FunctionNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIndexName(ctx : Cobol85Parser.IndexNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLanguageName(ctx : Cobol85Parser.LanguageNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLibraryName(ctx : Cobol85Parser.LibraryNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalName(ctx : Cobol85Parser.LocalNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMnemonicName(ctx : Cobol85Parser.MnemonicNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParagraphName(ctx : Cobol85Parser.ParagraphNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProcedureName(ctx : Cobol85Parser.ProcedureNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgramName(ctx : Cobol85Parser.ProgramNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordName(ctx : Cobol85Parser.RecordNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReportName(ctx : Cobol85Parser.ReportNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRoutineName(ctx : Cobol85Parser.RoutineNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScreenName(ctx : Cobol85Parser.ScreenNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSectionName(ctx : Cobol85Parser.SectionNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSystemName(ctx : Cobol85Parser.SystemNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbolicCharacter(ctx : Cobol85Parser.SymbolicCharacterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTextName(ctx : Cobol85Parser.TextNameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCobolWord(ctx : Cobol85Parser.CobolWordContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : Cobol85Parser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanLiteral(ctx : Cobol85Parser.BooleanLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumericLiteral(ctx : Cobol85Parser.NumericLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerLiteral(ctx : Cobol85Parser.IntegerLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCicsDfhRespLiteral(ctx : Cobol85Parser.CicsDfhRespLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCicsDfhValueLiteral(ctx : Cobol85Parser.CicsDfhValueLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFigurativeConstant(ctx : Cobol85Parser.FigurativeConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpecialRegister(ctx : Cobol85Parser.SpecialRegisterContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommentEntry(ctx : Cobol85Parser.CommentEntryContext) : T
}