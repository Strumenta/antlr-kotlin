// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cobol85Parser}.
 */
interface Cobol85Listener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 */
	fun enterStartRule(ctx: Cobol85Parser.StartRuleContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 */
	fun exitStartRule(ctx: Cobol85Parser.StartRuleContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	fun enterCompilationUnit(ctx: Cobol85Parser.CompilationUnitContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	fun exitCompilationUnit(ctx: Cobol85Parser.CompilationUnitContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 */
	fun enterProgramUnit(ctx: Cobol85Parser.ProgramUnitContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 */
	fun exitProgramUnit(ctx: Cobol85Parser.ProgramUnitContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEndProgramStatement(ctx: Cobol85Parser.EndProgramStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEndProgramStatement(ctx: Cobol85Parser.EndProgramStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	fun enterIdentificationDivision(ctx: Cobol85Parser.IdentificationDivisionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	fun exitIdentificationDivision(ctx: Cobol85Parser.IdentificationDivisionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun enterIdentificationDivisionBody(ctx: Cobol85Parser.IdentificationDivisionBodyContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun exitIdentificationDivisionBody(ctx: Cobol85Parser.IdentificationDivisionBodyContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterProgramIdParagraph(ctx: Cobol85Parser.ProgramIdParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitProgramIdParagraph(ctx: Cobol85Parser.ProgramIdParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterAuthorParagraph(ctx: Cobol85Parser.AuthorParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitAuthorParagraph(ctx: Cobol85Parser.AuthorParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterInstallationParagraph(ctx: Cobol85Parser.InstallationParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitInstallationParagraph(ctx: Cobol85Parser.InstallationParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterDateWrittenParagraph(ctx: Cobol85Parser.DateWrittenParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitDateWrittenParagraph(ctx: Cobol85Parser.DateWrittenParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterDateCompiledParagraph(ctx: Cobol85Parser.DateCompiledParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitDateCompiledParagraph(ctx: Cobol85Parser.DateCompiledParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterSecurityParagraph(ctx: Cobol85Parser.SecurityParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitSecurityParagraph(ctx: Cobol85Parser.SecurityParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterRemarksParagraph(ctx: Cobol85Parser.RemarksParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitRemarksParagraph(ctx: Cobol85Parser.RemarksParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	fun enterEnvironmentDivision(ctx: Cobol85Parser.EnvironmentDivisionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	fun exitEnvironmentDivision(ctx: Cobol85Parser.EnvironmentDivisionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun enterEnvironmentDivisionBody(ctx: Cobol85Parser.EnvironmentDivisionBodyContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun exitEnvironmentDivisionBody(ctx: Cobol85Parser.EnvironmentDivisionBodyContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 */
	fun enterConfigurationSection(ctx: Cobol85Parser.ConfigurationSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 */
	fun exitConfigurationSection(ctx: Cobol85Parser.ConfigurationSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterConfigurationSectionParagraph(ctx: Cobol85Parser.ConfigurationSectionParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitConfigurationSectionParagraph(ctx: Cobol85Parser.ConfigurationSectionParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterSourceComputerParagraph(ctx: Cobol85Parser.SourceComputerParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitSourceComputerParagraph(ctx: Cobol85Parser.SourceComputerParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterObjectComputerParagraph(ctx: Cobol85Parser.ObjectComputerParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitObjectComputerParagraph(ctx: Cobol85Parser.ObjectComputerParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 */
	fun enterObjectComputerClause(ctx: Cobol85Parser.ObjectComputerClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 */
	fun exitObjectComputerClause(ctx: Cobol85Parser.ObjectComputerClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 */
	fun enterMemorySizeClause(ctx: Cobol85Parser.MemorySizeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 */
	fun exitMemorySizeClause(ctx: Cobol85Parser.MemorySizeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 */
	fun enterDiskSizeClause(ctx: Cobol85Parser.DiskSizeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 */
	fun exitDiskSizeClause(ctx: Cobol85Parser.DiskSizeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 */
	fun enterCollatingSequenceClause(ctx: Cobol85Parser.CollatingSequenceClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 */
	fun exitCollatingSequenceClause(ctx: Cobol85Parser.CollatingSequenceClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun enterCollatingSequenceClauseAlphanumeric(ctx: Cobol85Parser.CollatingSequenceClauseAlphanumericContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun exitCollatingSequenceClauseAlphanumeric(ctx: Cobol85Parser.CollatingSequenceClauseAlphanumericContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 */
	fun enterCollatingSequenceClauseNational(ctx: Cobol85Parser.CollatingSequenceClauseNationalContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 */
	fun exitCollatingSequenceClauseNational(ctx: Cobol85Parser.CollatingSequenceClauseNationalContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 */
	fun enterSegmentLimitClause(ctx: Cobol85Parser.SegmentLimitClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 */
	fun exitSegmentLimitClause(ctx: Cobol85Parser.SegmentLimitClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	fun enterCharacterSetClause(ctx: Cobol85Parser.CharacterSetClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	fun exitCharacterSetClause(ctx: Cobol85Parser.CharacterSetClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterSpecialNamesParagraph(ctx: Cobol85Parser.SpecialNamesParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitSpecialNamesParagraph(ctx: Cobol85Parser.SpecialNamesParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 */
	fun enterSpecialNameClause(ctx: Cobol85Parser.SpecialNameClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 */
	fun exitSpecialNameClause(ctx: Cobol85Parser.SpecialNameClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetClause(ctx: Cobol85Parser.AlphabetClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetClause(ctx: Cobol85Parser.AlphabetClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetClauseFormat1(ctx: Cobol85Parser.AlphabetClauseFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetClauseFormat1(ctx: Cobol85Parser.AlphabetClauseFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetLiterals(ctx: Cobol85Parser.AlphabetLiteralsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetLiterals(ctx: Cobol85Parser.AlphabetLiteralsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetThrough(ctx: Cobol85Parser.AlphabetThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetThrough(ctx: Cobol85Parser.AlphabetThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetAlso(ctx: Cobol85Parser.AlphabetAlsoContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetAlso(ctx: Cobol85Parser.AlphabetAlsoContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetClauseFormat2(ctx: Cobol85Parser.AlphabetClauseFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetClauseFormat2(ctx: Cobol85Parser.AlphabetClauseFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 */
	fun enterChannelClause(ctx: Cobol85Parser.ChannelClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 */
	fun exitChannelClause(ctx: Cobol85Parser.ChannelClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 */
	fun enterClassClause(ctx: Cobol85Parser.ClassClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 */
	fun exitClassClause(ctx: Cobol85Parser.ClassClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 */
	fun enterClassClauseThrough(ctx: Cobol85Parser.ClassClauseThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 */
	fun exitClassClauseThrough(ctx: Cobol85Parser.ClassClauseThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 */
	fun enterClassClauseFrom(ctx: Cobol85Parser.ClassClauseFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 */
	fun exitClassClauseFrom(ctx: Cobol85Parser.ClassClauseFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 */
	fun enterClassClauseTo(ctx: Cobol85Parser.ClassClauseToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 */
	fun exitClassClauseTo(ctx: Cobol85Parser.ClassClauseToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 */
	fun enterCurrencySignClause(ctx: Cobol85Parser.CurrencySignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 */
	fun exitCurrencySignClause(ctx: Cobol85Parser.CurrencySignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 */
	fun enterDecimalPointClause(ctx: Cobol85Parser.DecimalPointClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 */
	fun exitDecimalPointClause(ctx: Cobol85Parser.DecimalPointClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 */
	fun enterDefaultComputationalSignClause(ctx: Cobol85Parser.DefaultComputationalSignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 */
	fun exitDefaultComputationalSignClause(ctx: Cobol85Parser.DefaultComputationalSignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 */
	fun enterDefaultDisplaySignClause(ctx: Cobol85Parser.DefaultDisplaySignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 */
	fun exitDefaultDisplaySignClause(ctx: Cobol85Parser.DefaultDisplaySignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 */
	fun enterEnvironmentSwitchNameClause(ctx: Cobol85Parser.EnvironmentSwitchNameClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 */
	fun exitEnvironmentSwitchNameClause(ctx: Cobol85Parser.EnvironmentSwitchNameClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterEnvironmentSwitchNameSpecialNamesStatusPhrase(ctx: Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitEnvironmentSwitchNameSpecialNamesStatusPhrase(ctx: Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 */
	fun enterOdtClause(ctx: Cobol85Parser.OdtClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 */
	fun exitOdtClause(ctx: Cobol85Parser.OdtClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 */
	fun enterReserveNetworkClause(ctx: Cobol85Parser.ReserveNetworkClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 */
	fun exitReserveNetworkClause(ctx: Cobol85Parser.ReserveNetworkClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicCharactersClause(ctx: Cobol85Parser.SymbolicCharactersClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicCharactersClause(ctx: Cobol85Parser.SymbolicCharactersClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicCharacters(ctx: Cobol85Parser.SymbolicCharactersContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicCharacters(ctx: Cobol85Parser.SymbolicCharactersContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 */
	fun enterInputOutputSection(ctx: Cobol85Parser.InputOutputSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 */
	fun exitInputOutputSection(ctx: Cobol85Parser.InputOutputSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterInputOutputSectionParagraph(ctx: Cobol85Parser.InputOutputSectionParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitInputOutputSectionParagraph(ctx: Cobol85Parser.InputOutputSectionParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterFileControlParagraph(ctx: Cobol85Parser.FileControlParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitFileControlParagraph(ctx: Cobol85Parser.FileControlParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 */
	fun enterFileControlEntry(ctx: Cobol85Parser.FileControlEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 */
	fun exitFileControlEntry(ctx: Cobol85Parser.FileControlEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 */
	fun enterSelectClause(ctx: Cobol85Parser.SelectClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 */
	fun exitSelectClause(ctx: Cobol85Parser.SelectClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 */
	fun enterFileControlClause(ctx: Cobol85Parser.FileControlClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 */
	fun exitFileControlClause(ctx: Cobol85Parser.FileControlClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 */
	fun enterAssignClause(ctx: Cobol85Parser.AssignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 */
	fun exitAssignClause(ctx: Cobol85Parser.AssignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 */
	fun enterReserveClause(ctx: Cobol85Parser.ReserveClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 */
	fun exitReserveClause(ctx: Cobol85Parser.ReserveClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 */
	fun enterOrganizationClause(ctx: Cobol85Parser.OrganizationClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 */
	fun exitOrganizationClause(ctx: Cobol85Parser.OrganizationClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 */
	fun enterPaddingCharacterClause(ctx: Cobol85Parser.PaddingCharacterClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 */
	fun exitPaddingCharacterClause(ctx: Cobol85Parser.PaddingCharacterClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 */
	fun enterRecordDelimiterClause(ctx: Cobol85Parser.RecordDelimiterClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 */
	fun exitRecordDelimiterClause(ctx: Cobol85Parser.RecordDelimiterClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 */
	fun enterAccessModeClause(ctx: Cobol85Parser.AccessModeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 */
	fun exitAccessModeClause(ctx: Cobol85Parser.AccessModeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterRecordKeyClause(ctx: Cobol85Parser.RecordKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitRecordKeyClause(ctx: Cobol85Parser.RecordKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterAlternateRecordKeyClause(ctx: Cobol85Parser.AlternateRecordKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitAlternateRecordKeyClause(ctx: Cobol85Parser.AlternateRecordKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 */
	fun enterPasswordClause(ctx: Cobol85Parser.PasswordClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 */
	fun exitPasswordClause(ctx: Cobol85Parser.PasswordClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 */
	fun enterFileStatusClause(ctx: Cobol85Parser.FileStatusClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 */
	fun exitFileStatusClause(ctx: Cobol85Parser.FileStatusClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterRelativeKeyClause(ctx: Cobol85Parser.RelativeKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitRelativeKeyClause(ctx: Cobol85Parser.RelativeKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 */
	fun enterIoControlParagraph(ctx: Cobol85Parser.IoControlParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 */
	fun exitIoControlParagraph(ctx: Cobol85Parser.IoControlParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 */
	fun enterIoControlClause(ctx: Cobol85Parser.IoControlClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 */
	fun exitIoControlClause(ctx: Cobol85Parser.IoControlClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 */
	fun enterRerunClause(ctx: Cobol85Parser.RerunClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 */
	fun exitRerunClause(ctx: Cobol85Parser.RerunClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 */
	fun enterRerunEveryRecords(ctx: Cobol85Parser.RerunEveryRecordsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 */
	fun exitRerunEveryRecords(ctx: Cobol85Parser.RerunEveryRecordsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 */
	fun enterRerunEveryOf(ctx: Cobol85Parser.RerunEveryOfContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 */
	fun exitRerunEveryOf(ctx: Cobol85Parser.RerunEveryOfContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 */
	fun enterRerunEveryClock(ctx: Cobol85Parser.RerunEveryClockContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 */
	fun exitRerunEveryClock(ctx: Cobol85Parser.RerunEveryClockContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 */
	fun enterSameClause(ctx: Cobol85Parser.SameClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 */
	fun exitSameClause(ctx: Cobol85Parser.SameClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 */
	fun enterMultipleFileClause(ctx: Cobol85Parser.MultipleFileClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 */
	fun exitMultipleFileClause(ctx: Cobol85Parser.MultipleFileClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 */
	fun enterMultipleFilePosition(ctx: Cobol85Parser.MultipleFilePositionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 */
	fun exitMultipleFilePosition(ctx: Cobol85Parser.MultipleFilePositionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 */
	fun enterCommitmentControlClause(ctx: Cobol85Parser.CommitmentControlClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 */
	fun exitCommitmentControlClause(ctx: Cobol85Parser.CommitmentControlClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 */
	fun enterDataDivision(ctx: Cobol85Parser.DataDivisionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 */
	fun exitDataDivision(ctx: Cobol85Parser.DataDivisionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	fun enterDataDivisionSection(ctx: Cobol85Parser.DataDivisionSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	fun exitDataDivisionSection(ctx: Cobol85Parser.DataDivisionSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 */
	fun enterFileSection(ctx: Cobol85Parser.FileSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 */
	fun exitFileSection(ctx: Cobol85Parser.FileSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterFileDescriptionEntry(ctx: Cobol85Parser.FileDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitFileDescriptionEntry(ctx: Cobol85Parser.FileDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 */
	fun enterFileDescriptionEntryClause(ctx: Cobol85Parser.FileDescriptionEntryClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 */
	fun exitFileDescriptionEntryClause(ctx: Cobol85Parser.FileDescriptionEntryClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 */
	fun enterExternalClause(ctx: Cobol85Parser.ExternalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 */
	fun exitExternalClause(ctx: Cobol85Parser.ExternalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 */
	fun enterGlobalClause(ctx: Cobol85Parser.GlobalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 */
	fun exitGlobalClause(ctx: Cobol85Parser.GlobalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 */
	fun enterBlockContainsClause(ctx: Cobol85Parser.BlockContainsClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 */
	fun exitBlockContainsClause(ctx: Cobol85Parser.BlockContainsClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 */
	fun enterBlockContainsTo(ctx: Cobol85Parser.BlockContainsToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 */
	fun exitBlockContainsTo(ctx: Cobol85Parser.BlockContainsToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 */
	fun enterRecordContainsClause(ctx: Cobol85Parser.RecordContainsClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 */
	fun exitRecordContainsClause(ctx: Cobol85Parser.RecordContainsClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterRecordContainsClauseFormat1(ctx: Cobol85Parser.RecordContainsClauseFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitRecordContainsClauseFormat1(ctx: Cobol85Parser.RecordContainsClauseFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterRecordContainsClauseFormat2(ctx: Cobol85Parser.RecordContainsClauseFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitRecordContainsClauseFormat2(ctx: Cobol85Parser.RecordContainsClauseFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 */
	fun enterRecordContainsClauseFormat3(ctx: Cobol85Parser.RecordContainsClauseFormat3Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 */
	fun exitRecordContainsClauseFormat3(ctx: Cobol85Parser.RecordContainsClauseFormat3Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 */
	fun enterRecordContainsTo(ctx: Cobol85Parser.RecordContainsToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 */
	fun exitRecordContainsTo(ctx: Cobol85Parser.RecordContainsToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 */
	fun enterLabelRecordsClause(ctx: Cobol85Parser.LabelRecordsClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 */
	fun exitLabelRecordsClause(ctx: Cobol85Parser.LabelRecordsClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 */
	fun enterValueOfClause(ctx: Cobol85Parser.ValueOfClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 */
	fun exitValueOfClause(ctx: Cobol85Parser.ValueOfClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 */
	fun enterValuePair(ctx: Cobol85Parser.ValuePairContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 */
	fun exitValuePair(ctx: Cobol85Parser.ValuePairContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataRecordsClause(ctx: Cobol85Parser.DataRecordsClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataRecordsClause(ctx: Cobol85Parser.DataRecordsClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 */
	fun enterLinageClause(ctx: Cobol85Parser.LinageClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 */
	fun exitLinageClause(ctx: Cobol85Parser.LinageClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 */
	fun enterLinageAt(ctx: Cobol85Parser.LinageAtContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 */
	fun exitLinageAt(ctx: Cobol85Parser.LinageAtContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 */
	fun enterLinageFootingAt(ctx: Cobol85Parser.LinageFootingAtContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 */
	fun exitLinageFootingAt(ctx: Cobol85Parser.LinageFootingAtContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 */
	fun enterLinageLinesAtTop(ctx: Cobol85Parser.LinageLinesAtTopContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 */
	fun exitLinageLinesAtTop(ctx: Cobol85Parser.LinageLinesAtTopContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 */
	fun enterLinageLinesAtBottom(ctx: Cobol85Parser.LinageLinesAtBottomContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 */
	fun exitLinageLinesAtBottom(ctx: Cobol85Parser.LinageLinesAtBottomContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 */
	fun enterRecordingModeClause(ctx: Cobol85Parser.RecordingModeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 */
	fun exitRecordingModeClause(ctx: Cobol85Parser.RecordingModeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterModeStatement(ctx: Cobol85Parser.ModeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitModeStatement(ctx: Cobol85Parser.ModeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 */
	fun enterCodeSetClause(ctx: Cobol85Parser.CodeSetClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 */
	fun exitCodeSetClause(ctx: Cobol85Parser.CodeSetClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportClause(ctx: Cobol85Parser.ReportClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportClause(ctx: Cobol85Parser.ReportClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 */
	fun enterDataBaseSection(ctx: Cobol85Parser.DataBaseSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 */
	fun exitDataBaseSection(ctx: Cobol85Parser.DataBaseSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterDataBaseSectionEntry(ctx: Cobol85Parser.DataBaseSectionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitDataBaseSectionEntry(ctx: Cobol85Parser.DataBaseSectionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 */
	fun enterWorkingStorageSection(ctx: Cobol85Parser.WorkingStorageSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 */
	fun exitWorkingStorageSection(ctx: Cobol85Parser.WorkingStorageSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 */
	fun enterLinkageSection(ctx: Cobol85Parser.LinkageSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 */
	fun exitLinkageSection(ctx: Cobol85Parser.LinkageSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 */
	fun enterCommunicationSection(ctx: Cobol85Parser.CommunicationSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 */
	fun exitCommunicationSection(ctx: Cobol85Parser.CommunicationSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterCommunicationDescriptionEntry(ctx: Cobol85Parser.CommunicationDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitCommunicationDescriptionEntry(ctx: Cobol85Parser.CommunicationDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterCommunicationDescriptionEntryFormat1(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitCommunicationDescriptionEntryFormat1(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterCommunicationDescriptionEntryFormat2(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitCommunicationDescriptionEntryFormat2(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun enterCommunicationDescriptionEntryFormat3(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat3Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun exitCommunicationDescriptionEntryFormat3(ctx: Cobol85Parser.CommunicationDescriptionEntryFormat3Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 */
	fun enterDestinationCountClause(ctx: Cobol85Parser.DestinationCountClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 */
	fun exitDestinationCountClause(ctx: Cobol85Parser.DestinationCountClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 */
	fun enterDestinationTableClause(ctx: Cobol85Parser.DestinationTableClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 */
	fun exitDestinationTableClause(ctx: Cobol85Parser.DestinationTableClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterEndKeyClause(ctx: Cobol85Parser.EndKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitEndKeyClause(ctx: Cobol85Parser.EndKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterErrorKeyClause(ctx: Cobol85Parser.ErrorKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitErrorKeyClause(ctx: Cobol85Parser.ErrorKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 */
	fun enterMessageCountClause(ctx: Cobol85Parser.MessageCountClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 */
	fun exitMessageCountClause(ctx: Cobol85Parser.MessageCountClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 */
	fun enterMessageDateClause(ctx: Cobol85Parser.MessageDateClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 */
	fun exitMessageDateClause(ctx: Cobol85Parser.MessageDateClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 */
	fun enterMessageTimeClause(ctx: Cobol85Parser.MessageTimeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 */
	fun exitMessageTimeClause(ctx: Cobol85Parser.MessageTimeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterStatusKeyClause(ctx: Cobol85Parser.StatusKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitStatusKeyClause(ctx: Cobol85Parser.StatusKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicDestinationClause(ctx: Cobol85Parser.SymbolicDestinationClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicDestinationClause(ctx: Cobol85Parser.SymbolicDestinationClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicQueueClause(ctx: Cobol85Parser.SymbolicQueueClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicQueueClause(ctx: Cobol85Parser.SymbolicQueueClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicSourceClause(ctx: Cobol85Parser.SymbolicSourceClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicSourceClause(ctx: Cobol85Parser.SymbolicSourceClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicTerminalClause(ctx: Cobol85Parser.SymbolicTerminalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicTerminalClause(ctx: Cobol85Parser.SymbolicTerminalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicSubQueueClause(ctx: Cobol85Parser.SymbolicSubQueueClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicSubQueueClause(ctx: Cobol85Parser.SymbolicSubQueueClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 */
	fun enterTextLengthClause(ctx: Cobol85Parser.TextLengthClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 */
	fun exitTextLengthClause(ctx: Cobol85Parser.TextLengthClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 */
	fun enterLocalStorageSection(ctx: Cobol85Parser.LocalStorageSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 */
	fun exitLocalStorageSection(ctx: Cobol85Parser.LocalStorageSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 */
	fun enterScreenSection(ctx: Cobol85Parser.ScreenSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 */
	fun exitScreenSection(ctx: Cobol85Parser.ScreenSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionEntry(ctx: Cobol85Parser.ScreenDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionEntry(ctx: Cobol85Parser.ScreenDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionBlankClause(ctx: Cobol85Parser.ScreenDescriptionBlankClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionBlankClause(ctx: Cobol85Parser.ScreenDescriptionBlankClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionBellClause(ctx: Cobol85Parser.ScreenDescriptionBellClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionBellClause(ctx: Cobol85Parser.ScreenDescriptionBellClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionBlinkClause(ctx: Cobol85Parser.ScreenDescriptionBlinkClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionBlinkClause(ctx: Cobol85Parser.ScreenDescriptionBlinkClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionEraseClause(ctx: Cobol85Parser.ScreenDescriptionEraseClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionEraseClause(ctx: Cobol85Parser.ScreenDescriptionEraseClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionLightClause(ctx: Cobol85Parser.ScreenDescriptionLightClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionLightClause(ctx: Cobol85Parser.ScreenDescriptionLightClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionGridClause(ctx: Cobol85Parser.ScreenDescriptionGridClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionGridClause(ctx: Cobol85Parser.ScreenDescriptionGridClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionReverseVideoClause(ctx: Cobol85Parser.ScreenDescriptionReverseVideoClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionReverseVideoClause(ctx: Cobol85Parser.ScreenDescriptionReverseVideoClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionUnderlineClause(ctx: Cobol85Parser.ScreenDescriptionUnderlineClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionUnderlineClause(ctx: Cobol85Parser.ScreenDescriptionUnderlineClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionSizeClause(ctx: Cobol85Parser.ScreenDescriptionSizeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionSizeClause(ctx: Cobol85Parser.ScreenDescriptionSizeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionLineClause(ctx: Cobol85Parser.ScreenDescriptionLineClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionLineClause(ctx: Cobol85Parser.ScreenDescriptionLineClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionColumnClause(ctx: Cobol85Parser.ScreenDescriptionColumnClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionColumnClause(ctx: Cobol85Parser.ScreenDescriptionColumnClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionForegroundColorClause(ctx: Cobol85Parser.ScreenDescriptionForegroundColorClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionForegroundColorClause(ctx: Cobol85Parser.ScreenDescriptionForegroundColorClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionBackgroundColorClause(ctx: Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionBackgroundColorClause(ctx: Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionControlClause(ctx: Cobol85Parser.ScreenDescriptionControlClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionControlClause(ctx: Cobol85Parser.ScreenDescriptionControlClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionValueClause(ctx: Cobol85Parser.ScreenDescriptionValueClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionValueClause(ctx: Cobol85Parser.ScreenDescriptionValueClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionPictureClause(ctx: Cobol85Parser.ScreenDescriptionPictureClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionPictureClause(ctx: Cobol85Parser.ScreenDescriptionPictureClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionFromClause(ctx: Cobol85Parser.ScreenDescriptionFromClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionFromClause(ctx: Cobol85Parser.ScreenDescriptionFromClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionToClause(ctx: Cobol85Parser.ScreenDescriptionToClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionToClause(ctx: Cobol85Parser.ScreenDescriptionToClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionUsingClause(ctx: Cobol85Parser.ScreenDescriptionUsingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionUsingClause(ctx: Cobol85Parser.ScreenDescriptionUsingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionUsageClause(ctx: Cobol85Parser.ScreenDescriptionUsageClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionUsageClause(ctx: Cobol85Parser.ScreenDescriptionUsageClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionBlankWhenZeroClause(ctx: Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionBlankWhenZeroClause(ctx: Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionJustifiedClause(ctx: Cobol85Parser.ScreenDescriptionJustifiedClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionJustifiedClause(ctx: Cobol85Parser.ScreenDescriptionJustifiedClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionSignClause(ctx: Cobol85Parser.ScreenDescriptionSignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionSignClause(ctx: Cobol85Parser.ScreenDescriptionSignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionAutoClause(ctx: Cobol85Parser.ScreenDescriptionAutoClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionAutoClause(ctx: Cobol85Parser.ScreenDescriptionAutoClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionSecureClause(ctx: Cobol85Parser.ScreenDescriptionSecureClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionSecureClause(ctx: Cobol85Parser.ScreenDescriptionSecureClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionRequiredClause(ctx: Cobol85Parser.ScreenDescriptionRequiredClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionRequiredClause(ctx: Cobol85Parser.ScreenDescriptionRequiredClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionPromptClause(ctx: Cobol85Parser.ScreenDescriptionPromptClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionPromptClause(ctx: Cobol85Parser.ScreenDescriptionPromptClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionPromptOccursClause(ctx: Cobol85Parser.ScreenDescriptionPromptOccursClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionPromptOccursClause(ctx: Cobol85Parser.ScreenDescriptionPromptOccursClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionFullClause(ctx: Cobol85Parser.ScreenDescriptionFullClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionFullClause(ctx: Cobol85Parser.ScreenDescriptionFullClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 */
	fun enterScreenDescriptionZeroFillClause(ctx: Cobol85Parser.ScreenDescriptionZeroFillClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 */
	fun exitScreenDescriptionZeroFillClause(ctx: Cobol85Parser.ScreenDescriptionZeroFillClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 */
	fun enterReportSection(ctx: Cobol85Parser.ReportSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 */
	fun exitReportSection(ctx: Cobol85Parser.ReportSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescription(ctx: Cobol85Parser.ReportDescriptionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescription(ctx: Cobol85Parser.ReportDescriptionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionEntry(ctx: Cobol85Parser.ReportDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionEntry(ctx: Cobol85Parser.ReportDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionGlobalClause(ctx: Cobol85Parser.ReportDescriptionGlobalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionGlobalClause(ctx: Cobol85Parser.ReportDescriptionGlobalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionPageLimitClause(ctx: Cobol85Parser.ReportDescriptionPageLimitClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionPageLimitClause(ctx: Cobol85Parser.ReportDescriptionPageLimitClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionHeadingClause(ctx: Cobol85Parser.ReportDescriptionHeadingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionHeadingClause(ctx: Cobol85Parser.ReportDescriptionHeadingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionFirstDetailClause(ctx: Cobol85Parser.ReportDescriptionFirstDetailClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionFirstDetailClause(ctx: Cobol85Parser.ReportDescriptionFirstDetailClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionLastDetailClause(ctx: Cobol85Parser.ReportDescriptionLastDetailClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionLastDetailClause(ctx: Cobol85Parser.ReportDescriptionLastDetailClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportDescriptionFootingClause(ctx: Cobol85Parser.ReportDescriptionFootingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportDescriptionFootingClause(ctx: Cobol85Parser.ReportDescriptionFootingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupDescriptionEntry(ctx: Cobol85Parser.ReportGroupDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupDescriptionEntry(ctx: Cobol85Parser.ReportGroupDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupDescriptionEntryFormat1(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupDescriptionEntryFormat1(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupDescriptionEntryFormat2(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupDescriptionEntryFormat2(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupDescriptionEntryFormat3(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat3Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupDescriptionEntryFormat3(ctx: Cobol85Parser.ReportGroupDescriptionEntryFormat3Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupBlankWhenZeroClause(ctx: Cobol85Parser.ReportGroupBlankWhenZeroClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupBlankWhenZeroClause(ctx: Cobol85Parser.ReportGroupBlankWhenZeroClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupColumnNumberClause(ctx: Cobol85Parser.ReportGroupColumnNumberClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupColumnNumberClause(ctx: Cobol85Parser.ReportGroupColumnNumberClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupIndicateClause(ctx: Cobol85Parser.ReportGroupIndicateClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupIndicateClause(ctx: Cobol85Parser.ReportGroupIndicateClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupJustifiedClause(ctx: Cobol85Parser.ReportGroupJustifiedClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupJustifiedClause(ctx: Cobol85Parser.ReportGroupJustifiedClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupLineNumberClause(ctx: Cobol85Parser.ReportGroupLineNumberClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupLineNumberClause(ctx: Cobol85Parser.ReportGroupLineNumberClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupLineNumberNextPage(ctx: Cobol85Parser.ReportGroupLineNumberNextPageContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupLineNumberNextPage(ctx: Cobol85Parser.ReportGroupLineNumberNextPageContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupLineNumberPlus(ctx: Cobol85Parser.ReportGroupLineNumberPlusContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupLineNumberPlus(ctx: Cobol85Parser.ReportGroupLineNumberPlusContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupNextGroupClause(ctx: Cobol85Parser.ReportGroupNextGroupClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupNextGroupClause(ctx: Cobol85Parser.ReportGroupNextGroupClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupNextGroupPlus(ctx: Cobol85Parser.ReportGroupNextGroupPlusContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupNextGroupPlus(ctx: Cobol85Parser.ReportGroupNextGroupPlusContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupNextGroupNextPage(ctx: Cobol85Parser.ReportGroupNextGroupNextPageContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupNextGroupNextPage(ctx: Cobol85Parser.ReportGroupNextGroupNextPageContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupPictureClause(ctx: Cobol85Parser.ReportGroupPictureClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupPictureClause(ctx: Cobol85Parser.ReportGroupPictureClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupResetClause(ctx: Cobol85Parser.ReportGroupResetClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupResetClause(ctx: Cobol85Parser.ReportGroupResetClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupSignClause(ctx: Cobol85Parser.ReportGroupSignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupSignClause(ctx: Cobol85Parser.ReportGroupSignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupSourceClause(ctx: Cobol85Parser.ReportGroupSourceClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupSourceClause(ctx: Cobol85Parser.ReportGroupSourceClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupSumClause(ctx: Cobol85Parser.ReportGroupSumClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupSumClause(ctx: Cobol85Parser.ReportGroupSumClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeClause(ctx: Cobol85Parser.ReportGroupTypeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeClause(ctx: Cobol85Parser.ReportGroupTypeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeReportHeading(ctx: Cobol85Parser.ReportGroupTypeReportHeadingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeReportHeading(ctx: Cobol85Parser.ReportGroupTypeReportHeadingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypePageHeading(ctx: Cobol85Parser.ReportGroupTypePageHeadingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypePageHeading(ctx: Cobol85Parser.ReportGroupTypePageHeadingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeControlHeading(ctx: Cobol85Parser.ReportGroupTypeControlHeadingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeControlHeading(ctx: Cobol85Parser.ReportGroupTypeControlHeadingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeDetail(ctx: Cobol85Parser.ReportGroupTypeDetailContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeDetail(ctx: Cobol85Parser.ReportGroupTypeDetailContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeControlFooting(ctx: Cobol85Parser.ReportGroupTypeControlFootingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeControlFooting(ctx: Cobol85Parser.ReportGroupTypeControlFootingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupUsageClause(ctx: Cobol85Parser.ReportGroupUsageClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupUsageClause(ctx: Cobol85Parser.ReportGroupUsageClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypePageFooting(ctx: Cobol85Parser.ReportGroupTypePageFootingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypePageFooting(ctx: Cobol85Parser.ReportGroupTypePageFootingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupTypeReportFooting(ctx: Cobol85Parser.ReportGroupTypeReportFootingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupTypeReportFooting(ctx: Cobol85Parser.ReportGroupTypeReportFootingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 */
	fun enterReportGroupValueClause(ctx: Cobol85Parser.ReportGroupValueClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 */
	fun exitReportGroupValueClause(ctx: Cobol85Parser.ReportGroupValueClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 */
	fun enterProgramLibrarySection(ctx: Cobol85Parser.ProgramLibrarySectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 */
	fun exitProgramLibrarySection(ctx: Cobol85Parser.ProgramLibrarySectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryDescriptionEntry(ctx: Cobol85Parser.LibraryDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryDescriptionEntry(ctx: Cobol85Parser.LibraryDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryDescriptionEntryFormat1(ctx: Cobol85Parser.LibraryDescriptionEntryFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryDescriptionEntryFormat1(ctx: Cobol85Parser.LibraryDescriptionEntryFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryDescriptionEntryFormat2(ctx: Cobol85Parser.LibraryDescriptionEntryFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryDescriptionEntryFormat2(ctx: Cobol85Parser.LibraryDescriptionEntryFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryAttributeClauseFormat1(ctx: Cobol85Parser.LibraryAttributeClauseFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryAttributeClauseFormat1(ctx: Cobol85Parser.LibraryAttributeClauseFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryAttributeClauseFormat2(ctx: Cobol85Parser.LibraryAttributeClauseFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryAttributeClauseFormat2(ctx: Cobol85Parser.LibraryAttributeClauseFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryAttributeFunction(ctx: Cobol85Parser.LibraryAttributeFunctionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryAttributeFunction(ctx: Cobol85Parser.LibraryAttributeFunctionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryAttributeParameter(ctx: Cobol85Parser.LibraryAttributeParameterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryAttributeParameter(ctx: Cobol85Parser.LibraryAttributeParameterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryAttributeTitle(ctx: Cobol85Parser.LibraryAttributeTitleContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryAttributeTitle(ctx: Cobol85Parser.LibraryAttributeTitleContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureClauseFormat1(ctx: Cobol85Parser.LibraryEntryProcedureClauseFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureClauseFormat1(ctx: Cobol85Parser.LibraryEntryProcedureClauseFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureClauseFormat2(ctx: Cobol85Parser.LibraryEntryProcedureClauseFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureClauseFormat2(ctx: Cobol85Parser.LibraryEntryProcedureClauseFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureForClause(ctx: Cobol85Parser.LibraryEntryProcedureForClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureForClause(ctx: Cobol85Parser.LibraryEntryProcedureForClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureGivingClause(ctx: Cobol85Parser.LibraryEntryProcedureGivingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureGivingClause(ctx: Cobol85Parser.LibraryEntryProcedureGivingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureUsingClause(ctx: Cobol85Parser.LibraryEntryProcedureUsingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureUsingClause(ctx: Cobol85Parser.LibraryEntryProcedureUsingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureUsingName(ctx: Cobol85Parser.LibraryEntryProcedureUsingNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureUsingName(ctx: Cobol85Parser.LibraryEntryProcedureUsingNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureWithClause(ctx: Cobol85Parser.LibraryEntryProcedureWithClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureWithClause(ctx: Cobol85Parser.LibraryEntryProcedureWithClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryEntryProcedureWithName(ctx: Cobol85Parser.LibraryEntryProcedureWithNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryEntryProcedureWithName(ctx: Cobol85Parser.LibraryEntryProcedureWithNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryIsCommonClause(ctx: Cobol85Parser.LibraryIsCommonClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryIsCommonClause(ctx: Cobol85Parser.LibraryIsCommonClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryIsGlobalClause(ctx: Cobol85Parser.LibraryIsGlobalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryIsGlobalClause(ctx: Cobol85Parser.LibraryIsGlobalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescriptionEntry(ctx: Cobol85Parser.DataDescriptionEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescriptionEntry(ctx: Cobol85Parser.DataDescriptionEntryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescriptionEntryFormat1(ctx: Cobol85Parser.DataDescriptionEntryFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescriptionEntryFormat1(ctx: Cobol85Parser.DataDescriptionEntryFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescriptionEntryFormat2(ctx: Cobol85Parser.DataDescriptionEntryFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescriptionEntryFormat2(ctx: Cobol85Parser.DataDescriptionEntryFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescriptionEntryFormat3(ctx: Cobol85Parser.DataDescriptionEntryFormat3Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescriptionEntryFormat3(ctx: Cobol85Parser.DataDescriptionEntryFormat3Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescriptionEntryExecSql(ctx: Cobol85Parser.DataDescriptionEntryExecSqlContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescriptionEntryExecSql(ctx: Cobol85Parser.DataDescriptionEntryExecSqlContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataAlignedClause(ctx: Cobol85Parser.DataAlignedClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataAlignedClause(ctx: Cobol85Parser.DataAlignedClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataBlankWhenZeroClause(ctx: Cobol85Parser.DataBlankWhenZeroClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataBlankWhenZeroClause(ctx: Cobol85Parser.DataBlankWhenZeroClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataCommonOwnLocalClause(ctx: Cobol85Parser.DataCommonOwnLocalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataCommonOwnLocalClause(ctx: Cobol85Parser.DataCommonOwnLocalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataExternalClause(ctx: Cobol85Parser.DataExternalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataExternalClause(ctx: Cobol85Parser.DataExternalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataGlobalClause(ctx: Cobol85Parser.DataGlobalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataGlobalClause(ctx: Cobol85Parser.DataGlobalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataIntegerStringClause(ctx: Cobol85Parser.DataIntegerStringClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataIntegerStringClause(ctx: Cobol85Parser.DataIntegerStringClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataJustifiedClause(ctx: Cobol85Parser.DataJustifiedClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataJustifiedClause(ctx: Cobol85Parser.DataJustifiedClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataOccursClause(ctx: Cobol85Parser.DataOccursClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataOccursClause(ctx: Cobol85Parser.DataOccursClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	fun enterDataOccursTo(ctx: Cobol85Parser.DataOccursToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	fun exitDataOccursTo(ctx: Cobol85Parser.DataOccursToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	fun enterDataOccursSort(ctx: Cobol85Parser.DataOccursSortContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	fun exitDataOccursSort(ctx: Cobol85Parser.DataOccursSortContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataPictureClause(ctx: Cobol85Parser.DataPictureClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataPictureClause(ctx: Cobol85Parser.DataPictureClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 */
	fun enterPictureString(ctx: Cobol85Parser.PictureStringContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 */
	fun exitPictureString(ctx: Cobol85Parser.PictureStringContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 */
	fun enterPictureChars(ctx: Cobol85Parser.PictureCharsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 */
	fun exitPictureChars(ctx: Cobol85Parser.PictureCharsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	fun enterPictureCardinality(ctx: Cobol85Parser.PictureCardinalityContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	fun exitPictureCardinality(ctx: Cobol85Parser.PictureCardinalityContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataReceivedByClause(ctx: Cobol85Parser.DataReceivedByClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataReceivedByClause(ctx: Cobol85Parser.DataReceivedByClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataRecordAreaClause(ctx: Cobol85Parser.DataRecordAreaClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataRecordAreaClause(ctx: Cobol85Parser.DataRecordAreaClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataRedefinesClause(ctx: Cobol85Parser.DataRedefinesClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataRedefinesClause(ctx: Cobol85Parser.DataRedefinesClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataRenamesClause(ctx: Cobol85Parser.DataRenamesClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataRenamesClause(ctx: Cobol85Parser.DataRenamesClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataSignClause(ctx: Cobol85Parser.DataSignClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataSignClause(ctx: Cobol85Parser.DataSignClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataSynchronizedClause(ctx: Cobol85Parser.DataSynchronizedClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataSynchronizedClause(ctx: Cobol85Parser.DataSynchronizedClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataThreadLocalClause(ctx: Cobol85Parser.DataThreadLocalClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataThreadLocalClause(ctx: Cobol85Parser.DataThreadLocalClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataTypeClause(ctx: Cobol85Parser.DataTypeClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataTypeClause(ctx: Cobol85Parser.DataTypeClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataTypeDefClause(ctx: Cobol85Parser.DataTypeDefClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataTypeDefClause(ctx: Cobol85Parser.DataTypeDefClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataUsageClause(ctx: Cobol85Parser.DataUsageClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataUsageClause(ctx: Cobol85Parser.DataUsageClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataUsingClause(ctx: Cobol85Parser.DataUsingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataUsingClause(ctx: Cobol85Parser.DataUsingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataValueClause(ctx: Cobol85Parser.DataValueClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataValueClause(ctx: Cobol85Parser.DataValueClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	fun enterDataValueInterval(ctx: Cobol85Parser.DataValueIntervalContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	fun exitDataValueInterval(ctx: Cobol85Parser.DataValueIntervalContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	fun enterDataValueIntervalFrom(ctx: Cobol85Parser.DataValueIntervalFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	fun exitDataValueIntervalFrom(ctx: Cobol85Parser.DataValueIntervalFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	fun enterDataValueIntervalTo(ctx: Cobol85Parser.DataValueIntervalToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	fun exitDataValueIntervalTo(ctx: Cobol85Parser.DataValueIntervalToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	fun enterDataWithLowerBoundsClause(ctx: Cobol85Parser.DataWithLowerBoundsClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	fun exitDataWithLowerBoundsClause(ctx: Cobol85Parser.DataWithLowerBoundsClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivision(ctx: Cobol85Parser.ProcedureDivisionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivision(ctx: Cobol85Parser.ProcedureDivisionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionUsingClause(ctx: Cobol85Parser.ProcedureDivisionUsingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionUsingClause(ctx: Cobol85Parser.ProcedureDivisionUsingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionGivingClause(ctx: Cobol85Parser.ProcedureDivisionGivingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionGivingClause(ctx: Cobol85Parser.ProcedureDivisionGivingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionUsingParameter(ctx: Cobol85Parser.ProcedureDivisionUsingParameterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionUsingParameter(ctx: Cobol85Parser.ProcedureDivisionUsingParameterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionByReferencePhrase(ctx: Cobol85Parser.ProcedureDivisionByReferencePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionByReferencePhrase(ctx: Cobol85Parser.ProcedureDivisionByReferencePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionByReference(ctx: Cobol85Parser.ProcedureDivisionByReferenceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionByReference(ctx: Cobol85Parser.ProcedureDivisionByReferenceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionByValuePhrase(ctx: Cobol85Parser.ProcedureDivisionByValuePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionByValuePhrase(ctx: Cobol85Parser.ProcedureDivisionByValuePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionByValue(ctx: Cobol85Parser.ProcedureDivisionByValueContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionByValue(ctx: Cobol85Parser.ProcedureDivisionByValueContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDeclaratives(ctx: Cobol85Parser.ProcedureDeclarativesContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDeclaratives(ctx: Cobol85Parser.ProcedureDeclarativesContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDeclarative(ctx: Cobol85Parser.ProcedureDeclarativeContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDeclarative(ctx: Cobol85Parser.ProcedureDeclarativeContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureSectionHeader(ctx: Cobol85Parser.ProcedureSectionHeaderContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureSectionHeader(ctx: Cobol85Parser.ProcedureSectionHeaderContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureDivisionBody(ctx: Cobol85Parser.ProcedureDivisionBodyContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureDivisionBody(ctx: Cobol85Parser.ProcedureDivisionBodyContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureSection(ctx: Cobol85Parser.ProcedureSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureSection(ctx: Cobol85Parser.ProcedureSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 */
	fun enterParagraphs(ctx: Cobol85Parser.ParagraphsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 */
	fun exitParagraphs(ctx: Cobol85Parser.ParagraphsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 */
	fun enterParagraph(ctx: Cobol85Parser.ParagraphContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 */
	fun exitParagraph(ctx: Cobol85Parser.ParagraphContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 */
	fun enterSentence(ctx: Cobol85Parser.SentenceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 */
	fun exitSentence(ctx: Cobol85Parser.SentenceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterStatement(ctx: Cobol85Parser.StatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitStatement(ctx: Cobol85Parser.StatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAcceptStatement(ctx: Cobol85Parser.AcceptStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAcceptStatement(ctx: Cobol85Parser.AcceptStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAcceptFromDateStatement(ctx: Cobol85Parser.AcceptFromDateStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAcceptFromDateStatement(ctx: Cobol85Parser.AcceptFromDateStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAcceptFromMnemonicStatement(ctx: Cobol85Parser.AcceptFromMnemonicStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAcceptFromMnemonicStatement(ctx: Cobol85Parser.AcceptFromMnemonicStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAcceptFromEscapeKeyStatement(ctx: Cobol85Parser.AcceptFromEscapeKeyStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAcceptFromEscapeKeyStatement(ctx: Cobol85Parser.AcceptFromEscapeKeyStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAcceptMessageCountStatement(ctx: Cobol85Parser.AcceptMessageCountStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAcceptMessageCountStatement(ctx: Cobol85Parser.AcceptMessageCountStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAddStatement(ctx: Cobol85Parser.AddStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAddStatement(ctx: Cobol85Parser.AddStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAddToStatement(ctx: Cobol85Parser.AddToStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAddToStatement(ctx: Cobol85Parser.AddToStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAddToGivingStatement(ctx: Cobol85Parser.AddToGivingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAddToGivingStatement(ctx: Cobol85Parser.AddToGivingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAddCorrespondingStatement(ctx: Cobol85Parser.AddCorrespondingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAddCorrespondingStatement(ctx: Cobol85Parser.AddCorrespondingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 */
	fun enterAddFrom(ctx: Cobol85Parser.AddFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 */
	fun exitAddFrom(ctx: Cobol85Parser.AddFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 */
	fun enterAddTo(ctx: Cobol85Parser.AddToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 */
	fun exitAddTo(ctx: Cobol85Parser.AddToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 */
	fun enterAddToGiving(ctx: Cobol85Parser.AddToGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 */
	fun exitAddToGiving(ctx: Cobol85Parser.AddToGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 */
	fun enterAddGiving(ctx: Cobol85Parser.AddGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 */
	fun exitAddGiving(ctx: Cobol85Parser.AddGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 */
	fun enterAlteredGoTo(ctx: Cobol85Parser.AlteredGoToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 */
	fun exitAlteredGoTo(ctx: Cobol85Parser.AlteredGoToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 */
	fun enterAlterStatement(ctx: Cobol85Parser.AlterStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 */
	fun exitAlterStatement(ctx: Cobol85Parser.AlterStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 */
	fun enterAlterProceedTo(ctx: Cobol85Parser.AlterProceedToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 */
	fun exitAlterProceedTo(ctx: Cobol85Parser.AlterProceedToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCallStatement(ctx: Cobol85Parser.CallStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCallStatement(ctx: Cobol85Parser.CallStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterCallUsingPhrase(ctx: Cobol85Parser.CallUsingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitCallUsingPhrase(ctx: Cobol85Parser.CallUsingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 */
	fun enterCallUsingParameter(ctx: Cobol85Parser.CallUsingParameterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 */
	fun exitCallUsingParameter(ctx: Cobol85Parser.CallUsingParameterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterCallByReferencePhrase(ctx: Cobol85Parser.CallByReferencePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitCallByReferencePhrase(ctx: Cobol85Parser.CallByReferencePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 */
	fun enterCallByReference(ctx: Cobol85Parser.CallByReferenceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 */
	fun exitCallByReference(ctx: Cobol85Parser.CallByReferenceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterCallByValuePhrase(ctx: Cobol85Parser.CallByValuePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitCallByValuePhrase(ctx: Cobol85Parser.CallByValuePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 */
	fun enterCallByValue(ctx: Cobol85Parser.CallByValueContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 */
	fun exitCallByValue(ctx: Cobol85Parser.CallByValueContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterCallByContentPhrase(ctx: Cobol85Parser.CallByContentPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitCallByContentPhrase(ctx: Cobol85Parser.CallByContentPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 */
	fun enterCallByContent(ctx: Cobol85Parser.CallByContentContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 */
	fun exitCallByContent(ctx: Cobol85Parser.CallByContentContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterCallGivingPhrase(ctx: Cobol85Parser.CallGivingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitCallGivingPhrase(ctx: Cobol85Parser.CallGivingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCancelStatement(ctx: Cobol85Parser.CancelStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCancelStatement(ctx: Cobol85Parser.CancelStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 */
	fun enterCancelCall(ctx: Cobol85Parser.CancelCallContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 */
	fun exitCancelCall(ctx: Cobol85Parser.CancelCallContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCloseStatement(ctx: Cobol85Parser.CloseStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCloseStatement(ctx: Cobol85Parser.CloseStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 */
	fun enterCloseFile(ctx: Cobol85Parser.CloseFileContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 */
	fun exitCloseFile(ctx: Cobol85Parser.CloseFileContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCloseReelUnitStatement(ctx: Cobol85Parser.CloseReelUnitStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCloseReelUnitStatement(ctx: Cobol85Parser.CloseReelUnitStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCloseRelativeStatement(ctx: Cobol85Parser.CloseRelativeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCloseRelativeStatement(ctx: Cobol85Parser.CloseRelativeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 */
	fun enterClosePortFileIOStatement(ctx: Cobol85Parser.ClosePortFileIOStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 */
	fun exitClosePortFileIOStatement(ctx: Cobol85Parser.ClosePortFileIOStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 */
	fun enterClosePortFileIOUsing(ctx: Cobol85Parser.ClosePortFileIOUsingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 */
	fun exitClosePortFileIOUsing(ctx: Cobol85Parser.ClosePortFileIOUsingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 */
	fun enterClosePortFileIOUsingCloseDisposition(ctx: Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 */
	fun exitClosePortFileIOUsingCloseDisposition(ctx: Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 */
	fun enterClosePortFileIOUsingAssociatedData(ctx: Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 */
	fun exitClosePortFileIOUsingAssociatedData(ctx: Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 */
	fun enterClosePortFileIOUsingAssociatedDataLength(ctx: Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 */
	fun exitClosePortFileIOUsingAssociatedDataLength(ctx: Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterComputeStatement(ctx: Cobol85Parser.ComputeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitComputeStatement(ctx: Cobol85Parser.ComputeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 */
	fun enterComputeStore(ctx: Cobol85Parser.ComputeStoreContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 */
	fun exitComputeStore(ctx: Cobol85Parser.ComputeStoreContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	fun enterContinueStatement(ctx: Cobol85Parser.ContinueStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	fun exitContinueStatement(ctx: Cobol85Parser.ContinueStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDeleteStatement(ctx: Cobol85Parser.DeleteStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDeleteStatement(ctx: Cobol85Parser.DeleteStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDisableStatement(ctx: Cobol85Parser.DisableStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDisableStatement(ctx: Cobol85Parser.DisableStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayStatement(ctx: Cobol85Parser.DisplayStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayStatement(ctx: Cobol85Parser.DisplayStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayOperand(ctx: Cobol85Parser.DisplayOperandContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayOperand(ctx: Cobol85Parser.DisplayOperandContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayAt(ctx: Cobol85Parser.DisplayAtContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayAt(ctx: Cobol85Parser.DisplayAtContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayUpon(ctx: Cobol85Parser.DisplayUponContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayUpon(ctx: Cobol85Parser.DisplayUponContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayWith(ctx: Cobol85Parser.DisplayWithContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayWith(ctx: Cobol85Parser.DisplayWithContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDivideStatement(ctx: Cobol85Parser.DivideStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDivideStatement(ctx: Cobol85Parser.DivideStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDivideIntoStatement(ctx: Cobol85Parser.DivideIntoStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDivideIntoStatement(ctx: Cobol85Parser.DivideIntoStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDivideIntoGivingStatement(ctx: Cobol85Parser.DivideIntoGivingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDivideIntoGivingStatement(ctx: Cobol85Parser.DivideIntoGivingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDivideByGivingStatement(ctx: Cobol85Parser.DivideByGivingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDivideByGivingStatement(ctx: Cobol85Parser.DivideByGivingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterDivideGivingPhrase(ctx: Cobol85Parser.DivideGivingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitDivideGivingPhrase(ctx: Cobol85Parser.DivideGivingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 */
	fun enterDivideInto(ctx: Cobol85Parser.DivideIntoContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 */
	fun exitDivideInto(ctx: Cobol85Parser.DivideIntoContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 */
	fun enterDivideGiving(ctx: Cobol85Parser.DivideGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 */
	fun exitDivideGiving(ctx: Cobol85Parser.DivideGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 */
	fun enterDivideRemainder(ctx: Cobol85Parser.DivideRemainderContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 */
	fun exitDivideRemainder(ctx: Cobol85Parser.DivideRemainderContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEnableStatement(ctx: Cobol85Parser.EnableStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEnableStatement(ctx: Cobol85Parser.EnableStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEntryStatement(ctx: Cobol85Parser.EntryStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEntryStatement(ctx: Cobol85Parser.EntryStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateStatement(ctx: Cobol85Parser.EvaluateStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateStatement(ctx: Cobol85Parser.EvaluateStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateSelect(ctx: Cobol85Parser.EvaluateSelectContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateSelect(ctx: Cobol85Parser.EvaluateSelectContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateAlsoSelect(ctx: Cobol85Parser.EvaluateAlsoSelectContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateAlsoSelect(ctx: Cobol85Parser.EvaluateAlsoSelectContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateWhenPhrase(ctx: Cobol85Parser.EvaluateWhenPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateWhenPhrase(ctx: Cobol85Parser.EvaluateWhenPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateWhen(ctx: Cobol85Parser.EvaluateWhenContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateWhen(ctx: Cobol85Parser.EvaluateWhenContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateCondition(ctx: Cobol85Parser.EvaluateConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateCondition(ctx: Cobol85Parser.EvaluateConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateThrough(ctx: Cobol85Parser.EvaluateThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateThrough(ctx: Cobol85Parser.EvaluateThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateAlsoCondition(ctx: Cobol85Parser.EvaluateAlsoConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateAlsoCondition(ctx: Cobol85Parser.EvaluateAlsoConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateWhenOther(ctx: Cobol85Parser.EvaluateWhenOtherContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateWhenOther(ctx: Cobol85Parser.EvaluateWhenOtherContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 */
	fun enterEvaluateValue(ctx: Cobol85Parser.EvaluateValueContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 */
	fun exitEvaluateValue(ctx: Cobol85Parser.EvaluateValueContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecCicsStatement(ctx: Cobol85Parser.ExecCicsStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecCicsStatement(ctx: Cobol85Parser.ExecCicsStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecSqlStatement(ctx: Cobol85Parser.ExecSqlStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecSqlStatement(ctx: Cobol85Parser.ExecSqlStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecSqlImsStatement(ctx: Cobol85Parser.ExecSqlImsStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecSqlImsStatement(ctx: Cobol85Parser.ExecSqlImsStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExhibitStatement(ctx: Cobol85Parser.ExhibitStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExhibitStatement(ctx: Cobol85Parser.ExhibitStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 */
	fun enterExhibitOperand(ctx: Cobol85Parser.ExhibitOperandContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 */
	fun exitExhibitOperand(ctx: Cobol85Parser.ExhibitOperandContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExitStatement(ctx: Cobol85Parser.ExitStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExitStatement(ctx: Cobol85Parser.ExitStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 */
	fun enterGenerateStatement(ctx: Cobol85Parser.GenerateStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 */
	fun exitGenerateStatement(ctx: Cobol85Parser.GenerateStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 */
	fun enterGobackStatement(ctx: Cobol85Parser.GobackStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 */
	fun exitGobackStatement(ctx: Cobol85Parser.GobackStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 */
	fun enterGoToStatement(ctx: Cobol85Parser.GoToStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 */
	fun exitGoToStatement(ctx: Cobol85Parser.GoToStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 */
	fun enterGoToStatementSimple(ctx: Cobol85Parser.GoToStatementSimpleContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 */
	fun exitGoToStatementSimple(ctx: Cobol85Parser.GoToStatementSimpleContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 */
	fun enterGoToDependingOnStatement(ctx: Cobol85Parser.GoToDependingOnStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 */
	fun exitGoToDependingOnStatement(ctx: Cobol85Parser.GoToDependingOnStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	fun enterIfStatement(ctx: Cobol85Parser.IfStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	fun exitIfStatement(ctx: Cobol85Parser.IfStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	fun enterIfThen(ctx: Cobol85Parser.IfThenContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	fun exitIfThen(ctx: Cobol85Parser.IfThenContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 */
	fun enterIfElse(ctx: Cobol85Parser.IfElseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 */
	fun exitIfElse(ctx: Cobol85Parser.IfElseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterInitializeStatement(ctx: Cobol85Parser.InitializeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitInitializeStatement(ctx: Cobol85Parser.InitializeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInitializeReplacingPhrase(ctx: Cobol85Parser.InitializeReplacingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInitializeReplacingPhrase(ctx: Cobol85Parser.InitializeReplacingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 */
	fun enterInitializeReplacingBy(ctx: Cobol85Parser.InitializeReplacingByContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 */
	fun exitInitializeReplacingBy(ctx: Cobol85Parser.InitializeReplacingByContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 */
	fun enterInitiateStatement(ctx: Cobol85Parser.InitiateStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 */
	fun exitInitiateStatement(ctx: Cobol85Parser.InitiateStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 */
	fun enterInspectStatement(ctx: Cobol85Parser.InspectStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 */
	fun exitInspectStatement(ctx: Cobol85Parser.InspectStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInspectTallyingPhrase(ctx: Cobol85Parser.InspectTallyingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInspectTallyingPhrase(ctx: Cobol85Parser.InspectTallyingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInspectReplacingPhrase(ctx: Cobol85Parser.InspectReplacingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInspectReplacingPhrase(ctx: Cobol85Parser.InspectReplacingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInspectTallyingReplacingPhrase(ctx: Cobol85Parser.InspectTallyingReplacingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInspectTallyingReplacingPhrase(ctx: Cobol85Parser.InspectTallyingReplacingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInspectConvertingPhrase(ctx: Cobol85Parser.InspectConvertingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInspectConvertingPhrase(ctx: Cobol85Parser.InspectConvertingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 */
	fun enterInspectFor(ctx: Cobol85Parser.InspectForContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 */
	fun exitInspectFor(ctx: Cobol85Parser.InspectForContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 */
	fun enterInspectCharacters(ctx: Cobol85Parser.InspectCharactersContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 */
	fun exitInspectCharacters(ctx: Cobol85Parser.InspectCharactersContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 */
	fun enterInspectReplacingCharacters(ctx: Cobol85Parser.InspectReplacingCharactersContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 */
	fun exitInspectReplacingCharacters(ctx: Cobol85Parser.InspectReplacingCharactersContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 */
	fun enterInspectAllLeadings(ctx: Cobol85Parser.InspectAllLeadingsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 */
	fun exitInspectAllLeadings(ctx: Cobol85Parser.InspectAllLeadingsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 */
	fun enterInspectReplacingAllLeadings(ctx: Cobol85Parser.InspectReplacingAllLeadingsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 */
	fun exitInspectReplacingAllLeadings(ctx: Cobol85Parser.InspectReplacingAllLeadingsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 */
	fun enterInspectAllLeading(ctx: Cobol85Parser.InspectAllLeadingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 */
	fun exitInspectAllLeading(ctx: Cobol85Parser.InspectAllLeadingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 */
	fun enterInspectReplacingAllLeading(ctx: Cobol85Parser.InspectReplacingAllLeadingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 */
	fun exitInspectReplacingAllLeading(ctx: Cobol85Parser.InspectReplacingAllLeadingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 */
	fun enterInspectBy(ctx: Cobol85Parser.InspectByContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 */
	fun exitInspectBy(ctx: Cobol85Parser.InspectByContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 */
	fun enterInspectTo(ctx: Cobol85Parser.InspectToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 */
	fun exitInspectTo(ctx: Cobol85Parser.InspectToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 */
	fun enterInspectBeforeAfter(ctx: Cobol85Parser.InspectBeforeAfterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 */
	fun exitInspectBeforeAfter(ctx: Cobol85Parser.InspectBeforeAfterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterMergeStatement(ctx: Cobol85Parser.MergeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitMergeStatement(ctx: Cobol85Parser.MergeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterMergeOnKeyClause(ctx: Cobol85Parser.MergeOnKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitMergeOnKeyClause(ctx: Cobol85Parser.MergeOnKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterMergeCollatingSequencePhrase(ctx: Cobol85Parser.MergeCollatingSequencePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitMergeCollatingSequencePhrase(ctx: Cobol85Parser.MergeCollatingSequencePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun enterMergeCollatingAlphanumeric(ctx: Cobol85Parser.MergeCollatingAlphanumericContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun exitMergeCollatingAlphanumeric(ctx: Cobol85Parser.MergeCollatingAlphanumericContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 */
	fun enterMergeCollatingNational(ctx: Cobol85Parser.MergeCollatingNationalContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 */
	fun exitMergeCollatingNational(ctx: Cobol85Parser.MergeCollatingNationalContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 */
	fun enterMergeUsing(ctx: Cobol85Parser.MergeUsingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 */
	fun exitMergeUsing(ctx: Cobol85Parser.MergeUsingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterMergeOutputProcedurePhrase(ctx: Cobol85Parser.MergeOutputProcedurePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitMergeOutputProcedurePhrase(ctx: Cobol85Parser.MergeOutputProcedurePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 */
	fun enterMergeOutputThrough(ctx: Cobol85Parser.MergeOutputThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 */
	fun exitMergeOutputThrough(ctx: Cobol85Parser.MergeOutputThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterMergeGivingPhrase(ctx: Cobol85Parser.MergeGivingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitMergeGivingPhrase(ctx: Cobol85Parser.MergeGivingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 */
	fun enterMergeGiving(ctx: Cobol85Parser.MergeGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 */
	fun exitMergeGiving(ctx: Cobol85Parser.MergeGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 */
	fun enterMoveStatement(ctx: Cobol85Parser.MoveStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 */
	fun exitMoveStatement(ctx: Cobol85Parser.MoveStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	fun enterMoveToStatement(ctx: Cobol85Parser.MoveToStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	fun exitMoveToStatement(ctx: Cobol85Parser.MoveToStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	fun enterMoveToSendingArea(ctx: Cobol85Parser.MoveToSendingAreaContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	fun exitMoveToSendingArea(ctx: Cobol85Parser.MoveToSendingAreaContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 */
	fun enterMoveCorrespondingToStatement(ctx: Cobol85Parser.MoveCorrespondingToStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 */
	fun exitMoveCorrespondingToStatement(ctx: Cobol85Parser.MoveCorrespondingToStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 */
	fun enterMoveCorrespondingToSendingArea(ctx: Cobol85Parser.MoveCorrespondingToSendingAreaContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 */
	fun exitMoveCorrespondingToSendingArea(ctx: Cobol85Parser.MoveCorrespondingToSendingAreaContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyStatement(ctx: Cobol85Parser.MultiplyStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyStatement(ctx: Cobol85Parser.MultiplyStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyRegular(ctx: Cobol85Parser.MultiplyRegularContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyRegular(ctx: Cobol85Parser.MultiplyRegularContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyRegularOperand(ctx: Cobol85Parser.MultiplyRegularOperandContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyRegularOperand(ctx: Cobol85Parser.MultiplyRegularOperandContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyGiving(ctx: Cobol85Parser.MultiplyGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyGiving(ctx: Cobol85Parser.MultiplyGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyGivingOperand(ctx: Cobol85Parser.MultiplyGivingOperandContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyGivingOperand(ctx: Cobol85Parser.MultiplyGivingOperandContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyGivingResult(ctx: Cobol85Parser.MultiplyGivingResultContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyGivingResult(ctx: Cobol85Parser.MultiplyGivingResultContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 */
	fun enterOpenStatement(ctx: Cobol85Parser.OpenStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 */
	fun exitOpenStatement(ctx: Cobol85Parser.OpenStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 */
	fun enterOpenInputStatement(ctx: Cobol85Parser.OpenInputStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 */
	fun exitOpenInputStatement(ctx: Cobol85Parser.OpenInputStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 */
	fun enterOpenInput(ctx: Cobol85Parser.OpenInputContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 */
	fun exitOpenInput(ctx: Cobol85Parser.OpenInputContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 */
	fun enterOpenOutputStatement(ctx: Cobol85Parser.OpenOutputStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 */
	fun exitOpenOutputStatement(ctx: Cobol85Parser.OpenOutputStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 */
	fun enterOpenOutput(ctx: Cobol85Parser.OpenOutputContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 */
	fun exitOpenOutput(ctx: Cobol85Parser.OpenOutputContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 */
	fun enterOpenIOStatement(ctx: Cobol85Parser.OpenIOStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 */
	fun exitOpenIOStatement(ctx: Cobol85Parser.OpenIOStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 */
	fun enterOpenExtendStatement(ctx: Cobol85Parser.OpenExtendStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 */
	fun exitOpenExtendStatement(ctx: Cobol85Parser.OpenExtendStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 */
	fun enterPerformStatement(ctx: Cobol85Parser.PerformStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 */
	fun exitPerformStatement(ctx: Cobol85Parser.PerformStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 */
	fun enterPerformInlineStatement(ctx: Cobol85Parser.PerformInlineStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 */
	fun exitPerformInlineStatement(ctx: Cobol85Parser.PerformInlineStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 */
	fun enterPerformProcedureStatement(ctx: Cobol85Parser.PerformProcedureStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 */
	fun exitPerformProcedureStatement(ctx: Cobol85Parser.PerformProcedureStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 */
	fun enterPerformType(ctx: Cobol85Parser.PerformTypeContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 */
	fun exitPerformType(ctx: Cobol85Parser.PerformTypeContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 */
	fun enterPerformTimes(ctx: Cobol85Parser.PerformTimesContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 */
	fun exitPerformTimes(ctx: Cobol85Parser.PerformTimesContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 */
	fun enterPerformUntil(ctx: Cobol85Parser.PerformUntilContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 */
	fun exitPerformUntil(ctx: Cobol85Parser.PerformUntilContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 */
	fun enterPerformVarying(ctx: Cobol85Parser.PerformVaryingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 */
	fun exitPerformVarying(ctx: Cobol85Parser.PerformVaryingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 */
	fun enterPerformVaryingClause(ctx: Cobol85Parser.PerformVaryingClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 */
	fun exitPerformVaryingClause(ctx: Cobol85Parser.PerformVaryingClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterPerformVaryingPhrase(ctx: Cobol85Parser.PerformVaryingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitPerformVaryingPhrase(ctx: Cobol85Parser.PerformVaryingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 */
	fun enterPerformAfter(ctx: Cobol85Parser.PerformAfterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 */
	fun exitPerformAfter(ctx: Cobol85Parser.PerformAfterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 */
	fun enterPerformFrom(ctx: Cobol85Parser.PerformFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 */
	fun exitPerformFrom(ctx: Cobol85Parser.PerformFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 */
	fun enterPerformBy(ctx: Cobol85Parser.PerformByContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 */
	fun exitPerformBy(ctx: Cobol85Parser.PerformByContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 */
	fun enterPerformTestClause(ctx: Cobol85Parser.PerformTestClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 */
	fun exitPerformTestClause(ctx: Cobol85Parser.PerformTestClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterPurgeStatement(ctx: Cobol85Parser.PurgeStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitPurgeStatement(ctx: Cobol85Parser.PurgeStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReadStatement(ctx: Cobol85Parser.ReadStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReadStatement(ctx: Cobol85Parser.ReadStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 */
	fun enterReadInto(ctx: Cobol85Parser.ReadIntoContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 */
	fun exitReadInto(ctx: Cobol85Parser.ReadIntoContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 */
	fun enterReadWith(ctx: Cobol85Parser.ReadWithContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 */
	fun exitReadWith(ctx: Cobol85Parser.ReadWithContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 */
	fun enterReadKey(ctx: Cobol85Parser.ReadKeyContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 */
	fun exitReadKey(ctx: Cobol85Parser.ReadKeyContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveStatement(ctx: Cobol85Parser.ReceiveStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveStatement(ctx: Cobol85Parser.ReceiveStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveFromStatement(ctx: Cobol85Parser.ReceiveFromStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveFromStatement(ctx: Cobol85Parser.ReceiveFromStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveFrom(ctx: Cobol85Parser.ReceiveFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveFrom(ctx: Cobol85Parser.ReceiveFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveIntoStatement(ctx: Cobol85Parser.ReceiveIntoStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveIntoStatement(ctx: Cobol85Parser.ReceiveIntoStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveNoData(ctx: Cobol85Parser.ReceiveNoDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveNoData(ctx: Cobol85Parser.ReceiveNoDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveWithData(ctx: Cobol85Parser.ReceiveWithDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveWithData(ctx: Cobol85Parser.ReceiveWithDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveBefore(ctx: Cobol85Parser.ReceiveBeforeContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveBefore(ctx: Cobol85Parser.ReceiveBeforeContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveWith(ctx: Cobol85Parser.ReceiveWithContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveWith(ctx: Cobol85Parser.ReceiveWithContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveThread(ctx: Cobol85Parser.ReceiveThreadContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveThread(ctx: Cobol85Parser.ReceiveThreadContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveSize(ctx: Cobol85Parser.ReceiveSizeContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveSize(ctx: Cobol85Parser.ReceiveSizeContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveStatus(ctx: Cobol85Parser.ReceiveStatusContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveStatus(ctx: Cobol85Parser.ReceiveStatusContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReleaseStatement(ctx: Cobol85Parser.ReleaseStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReleaseStatement(ctx: Cobol85Parser.ReleaseStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReturnStatement(ctx: Cobol85Parser.ReturnStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReturnStatement(ctx: Cobol85Parser.ReturnStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 */
	fun enterReturnInto(ctx: Cobol85Parser.ReturnIntoContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 */
	fun exitReturnInto(ctx: Cobol85Parser.ReturnIntoContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	fun enterRewriteStatement(ctx: Cobol85Parser.RewriteStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	fun exitRewriteStatement(ctx: Cobol85Parser.RewriteStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 */
	fun enterRewriteFrom(ctx: Cobol85Parser.RewriteFromContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 */
	fun exitRewriteFrom(ctx: Cobol85Parser.RewriteFromContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSearchStatement(ctx: Cobol85Parser.SearchStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSearchStatement(ctx: Cobol85Parser.SearchStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 */
	fun enterSearchVarying(ctx: Cobol85Parser.SearchVaryingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 */
	fun exitSearchVarying(ctx: Cobol85Parser.SearchVaryingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 */
	fun enterSearchWhen(ctx: Cobol85Parser.SearchWhenContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 */
	fun exitSearchWhen(ctx: Cobol85Parser.SearchWhenContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSendStatement(ctx: Cobol85Parser.SendStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSendStatement(ctx: Cobol85Parser.SendStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 */
	fun enterSendStatementSync(ctx: Cobol85Parser.SendStatementSyncContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 */
	fun exitSendStatementSync(ctx: Cobol85Parser.SendStatementSyncContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 */
	fun enterSendStatementAsync(ctx: Cobol85Parser.SendStatementAsyncContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 */
	fun exitSendStatementAsync(ctx: Cobol85Parser.SendStatementAsyncContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSendFromPhrase(ctx: Cobol85Parser.SendFromPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSendFromPhrase(ctx: Cobol85Parser.SendFromPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSendWithPhrase(ctx: Cobol85Parser.SendWithPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSendWithPhrase(ctx: Cobol85Parser.SendWithPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSendReplacingPhrase(ctx: Cobol85Parser.SendReplacingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSendReplacingPhrase(ctx: Cobol85Parser.SendReplacingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSendAdvancingPhrase(ctx: Cobol85Parser.SendAdvancingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSendAdvancingPhrase(ctx: Cobol85Parser.SendAdvancingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 */
	fun enterSendAdvancingPage(ctx: Cobol85Parser.SendAdvancingPageContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 */
	fun exitSendAdvancingPage(ctx: Cobol85Parser.SendAdvancingPageContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 */
	fun enterSendAdvancingLines(ctx: Cobol85Parser.SendAdvancingLinesContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 */
	fun exitSendAdvancingLines(ctx: Cobol85Parser.SendAdvancingLinesContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	fun enterSendAdvancingMnemonic(ctx: Cobol85Parser.SendAdvancingMnemonicContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	fun exitSendAdvancingMnemonic(ctx: Cobol85Parser.SendAdvancingMnemonicContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSetStatement(ctx: Cobol85Parser.SetStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSetStatement(ctx: Cobol85Parser.SetStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSetToStatement(ctx: Cobol85Parser.SetToStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSetToStatement(ctx: Cobol85Parser.SetToStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSetUpDownByStatement(ctx: Cobol85Parser.SetUpDownByStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSetUpDownByStatement(ctx: Cobol85Parser.SetUpDownByStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 */
	fun enterSetTo(ctx: Cobol85Parser.SetToContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 */
	fun exitSetTo(ctx: Cobol85Parser.SetToContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 */
	fun enterSetToValue(ctx: Cobol85Parser.SetToValueContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 */
	fun exitSetToValue(ctx: Cobol85Parser.SetToValueContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 */
	fun enterSetByValue(ctx: Cobol85Parser.SetByValueContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 */
	fun exitSetByValue(ctx: Cobol85Parser.SetByValueContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSortStatement(ctx: Cobol85Parser.SortStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSortStatement(ctx: Cobol85Parser.SortStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 */
	fun enterSortOnKeyClause(ctx: Cobol85Parser.SortOnKeyClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 */
	fun exitSortOnKeyClause(ctx: Cobol85Parser.SortOnKeyClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSortDuplicatesPhrase(ctx: Cobol85Parser.SortDuplicatesPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSortDuplicatesPhrase(ctx: Cobol85Parser.SortDuplicatesPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSortCollatingSequencePhrase(ctx: Cobol85Parser.SortCollatingSequencePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSortCollatingSequencePhrase(ctx: Cobol85Parser.SortCollatingSequencePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun enterSortCollatingAlphanumeric(ctx: Cobol85Parser.SortCollatingAlphanumericContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	fun exitSortCollatingAlphanumeric(ctx: Cobol85Parser.SortCollatingAlphanumericContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 */
	fun enterSortCollatingNational(ctx: Cobol85Parser.SortCollatingNationalContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 */
	fun exitSortCollatingNational(ctx: Cobol85Parser.SortCollatingNationalContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSortInputProcedurePhrase(ctx: Cobol85Parser.SortInputProcedurePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSortInputProcedurePhrase(ctx: Cobol85Parser.SortInputProcedurePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 */
	fun enterSortInputThrough(ctx: Cobol85Parser.SortInputThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 */
	fun exitSortInputThrough(ctx: Cobol85Parser.SortInputThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 */
	fun enterSortUsing(ctx: Cobol85Parser.SortUsingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 */
	fun exitSortUsing(ctx: Cobol85Parser.SortUsingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSortOutputProcedurePhrase(ctx: Cobol85Parser.SortOutputProcedurePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSortOutputProcedurePhrase(ctx: Cobol85Parser.SortOutputProcedurePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 */
	fun enterSortOutputThrough(ctx: Cobol85Parser.SortOutputThroughContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 */
	fun exitSortOutputThrough(ctx: Cobol85Parser.SortOutputThroughContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterSortGivingPhrase(ctx: Cobol85Parser.SortGivingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitSortGivingPhrase(ctx: Cobol85Parser.SortGivingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 */
	fun enterSortGiving(ctx: Cobol85Parser.SortGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 */
	fun exitSortGiving(ctx: Cobol85Parser.SortGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 */
	fun enterStartStatement(ctx: Cobol85Parser.StartStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 */
	fun exitStartStatement(ctx: Cobol85Parser.StartStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 */
	fun enterStartKey(ctx: Cobol85Parser.StartKeyContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 */
	fun exitStartKey(ctx: Cobol85Parser.StartKeyContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 */
	fun enterStopStatement(ctx: Cobol85Parser.StopStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 */
	fun exitStopStatement(ctx: Cobol85Parser.StopStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 */
	fun enterStringStatement(ctx: Cobol85Parser.StringStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 */
	fun exitStringStatement(ctx: Cobol85Parser.StringStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterStringSendingPhrase(ctx: Cobol85Parser.StringSendingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitStringSendingPhrase(ctx: Cobol85Parser.StringSendingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 */
	fun enterStringSending(ctx: Cobol85Parser.StringSendingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 */
	fun exitStringSending(ctx: Cobol85Parser.StringSendingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterStringDelimitedByPhrase(ctx: Cobol85Parser.StringDelimitedByPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitStringDelimitedByPhrase(ctx: Cobol85Parser.StringDelimitedByPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterStringForPhrase(ctx: Cobol85Parser.StringForPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitStringForPhrase(ctx: Cobol85Parser.StringForPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterStringIntoPhrase(ctx: Cobol85Parser.StringIntoPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitStringIntoPhrase(ctx: Cobol85Parser.StringIntoPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterStringWithPointerPhrase(ctx: Cobol85Parser.StringWithPointerPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitStringWithPointerPhrase(ctx: Cobol85Parser.StringWithPointerPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractStatement(ctx: Cobol85Parser.SubtractStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractStatement(ctx: Cobol85Parser.SubtractStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractFromStatement(ctx: Cobol85Parser.SubtractFromStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractFromStatement(ctx: Cobol85Parser.SubtractFromStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractFromGivingStatement(ctx: Cobol85Parser.SubtractFromGivingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractFromGivingStatement(ctx: Cobol85Parser.SubtractFromGivingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractCorrespondingStatement(ctx: Cobol85Parser.SubtractCorrespondingStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractCorrespondingStatement(ctx: Cobol85Parser.SubtractCorrespondingStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractSubtrahend(ctx: Cobol85Parser.SubtractSubtrahendContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractSubtrahend(ctx: Cobol85Parser.SubtractSubtrahendContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractMinuend(ctx: Cobol85Parser.SubtractMinuendContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractMinuend(ctx: Cobol85Parser.SubtractMinuendContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractMinuendGiving(ctx: Cobol85Parser.SubtractMinuendGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractMinuendGiving(ctx: Cobol85Parser.SubtractMinuendGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractGiving(ctx: Cobol85Parser.SubtractGivingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractGiving(ctx: Cobol85Parser.SubtractGivingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 */
	fun enterSubtractMinuendCorresponding(ctx: Cobol85Parser.SubtractMinuendCorrespondingContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 */
	fun exitSubtractMinuendCorresponding(ctx: Cobol85Parser.SubtractMinuendCorrespondingContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	fun enterTerminateStatement(ctx: Cobol85Parser.TerminateStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	fun exitTerminateStatement(ctx: Cobol85Parser.TerminateStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringStatement(ctx: Cobol85Parser.UnstringStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringStatement(ctx: Cobol85Parser.UnstringStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringSendingPhrase(ctx: Cobol85Parser.UnstringSendingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringSendingPhrase(ctx: Cobol85Parser.UnstringSendingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringDelimitedByPhrase(ctx: Cobol85Parser.UnstringDelimitedByPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringDelimitedByPhrase(ctx: Cobol85Parser.UnstringDelimitedByPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringOrAllPhrase(ctx: Cobol85Parser.UnstringOrAllPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringOrAllPhrase(ctx: Cobol85Parser.UnstringOrAllPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringIntoPhrase(ctx: Cobol85Parser.UnstringIntoPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringIntoPhrase(ctx: Cobol85Parser.UnstringIntoPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringInto(ctx: Cobol85Parser.UnstringIntoContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringInto(ctx: Cobol85Parser.UnstringIntoContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringDelimiterIn(ctx: Cobol85Parser.UnstringDelimiterInContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringDelimiterIn(ctx: Cobol85Parser.UnstringDelimiterInContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringCountIn(ctx: Cobol85Parser.UnstringCountInContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringCountIn(ctx: Cobol85Parser.UnstringCountInContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringWithPointerPhrase(ctx: Cobol85Parser.UnstringWithPointerPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringWithPointerPhrase(ctx: Cobol85Parser.UnstringWithPointerPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterUnstringTallyingPhrase(ctx: Cobol85Parser.UnstringTallyingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitUnstringTallyingPhrase(ctx: Cobol85Parser.UnstringTallyingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 */
	fun enterUseStatement(ctx: Cobol85Parser.UseStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 */
	fun exitUseStatement(ctx: Cobol85Parser.UseStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 */
	fun enterUseAfterClause(ctx: Cobol85Parser.UseAfterClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 */
	fun exitUseAfterClause(ctx: Cobol85Parser.UseAfterClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 */
	fun enterUseAfterOn(ctx: Cobol85Parser.UseAfterOnContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 */
	fun exitUseAfterOn(ctx: Cobol85Parser.UseAfterOnContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 */
	fun enterUseDebugClause(ctx: Cobol85Parser.UseDebugClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 */
	fun exitUseDebugClause(ctx: Cobol85Parser.UseDebugClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 */
	fun enterUseDebugOn(ctx: Cobol85Parser.UseDebugOnContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 */
	fun exitUseDebugOn(ctx: Cobol85Parser.UseDebugOnContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	fun enterWriteStatement(ctx: Cobol85Parser.WriteStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	fun exitWriteStatement(ctx: Cobol85Parser.WriteStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterWriteFromPhrase(ctx: Cobol85Parser.WriteFromPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitWriteFromPhrase(ctx: Cobol85Parser.WriteFromPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterWriteAdvancingPhrase(ctx: Cobol85Parser.WriteAdvancingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitWriteAdvancingPhrase(ctx: Cobol85Parser.WriteAdvancingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 */
	fun enterWriteAdvancingPage(ctx: Cobol85Parser.WriteAdvancingPageContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 */
	fun exitWriteAdvancingPage(ctx: Cobol85Parser.WriteAdvancingPageContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 */
	fun enterWriteAdvancingLines(ctx: Cobol85Parser.WriteAdvancingLinesContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 */
	fun exitWriteAdvancingLines(ctx: Cobol85Parser.WriteAdvancingLinesContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	fun enterWriteAdvancingMnemonic(ctx: Cobol85Parser.WriteAdvancingMnemonicContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	fun exitWriteAdvancingMnemonic(ctx: Cobol85Parser.WriteAdvancingMnemonicContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterWriteAtEndOfPagePhrase(ctx: Cobol85Parser.WriteAtEndOfPagePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitWriteAtEndOfPagePhrase(ctx: Cobol85Parser.WriteAtEndOfPagePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	fun enterWriteNotAtEndOfPagePhrase(ctx: Cobol85Parser.WriteNotAtEndOfPagePhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	fun exitWriteNotAtEndOfPagePhrase(ctx: Cobol85Parser.WriteNotAtEndOfPagePhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterAtEndPhrase(ctx: Cobol85Parser.AtEndPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitAtEndPhrase(ctx: Cobol85Parser.AtEndPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterNotAtEndPhrase(ctx: Cobol85Parser.NotAtEndPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitNotAtEndPhrase(ctx: Cobol85Parser.NotAtEndPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterInvalidKeyPhrase(ctx: Cobol85Parser.InvalidKeyPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitInvalidKeyPhrase(ctx: Cobol85Parser.InvalidKeyPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterNotInvalidKeyPhrase(ctx: Cobol85Parser.NotInvalidKeyPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitNotInvalidKeyPhrase(ctx: Cobol85Parser.NotInvalidKeyPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterOnOverflowPhrase(ctx: Cobol85Parser.OnOverflowPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitOnOverflowPhrase(ctx: Cobol85Parser.OnOverflowPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterNotOnOverflowPhrase(ctx: Cobol85Parser.NotOnOverflowPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitNotOnOverflowPhrase(ctx: Cobol85Parser.NotOnOverflowPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterOnSizeErrorPhrase(ctx: Cobol85Parser.OnSizeErrorPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitOnSizeErrorPhrase(ctx: Cobol85Parser.OnSizeErrorPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterNotOnSizeErrorPhrase(ctx: Cobol85Parser.NotOnSizeErrorPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitNotOnSizeErrorPhrase(ctx: Cobol85Parser.NotOnSizeErrorPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 */
	fun enterOnExceptionClause(ctx: Cobol85Parser.OnExceptionClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 */
	fun exitOnExceptionClause(ctx: Cobol85Parser.OnExceptionClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 */
	fun enterNotOnExceptionClause(ctx: Cobol85Parser.NotOnExceptionClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 */
	fun exitNotOnExceptionClause(ctx: Cobol85Parser.NotOnExceptionClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	fun enterArithmeticExpression(ctx: Cobol85Parser.ArithmeticExpressionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	fun exitArithmeticExpression(ctx: Cobol85Parser.ArithmeticExpressionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 */
	fun enterPlusMinus(ctx: Cobol85Parser.PlusMinusContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 */
	fun exitPlusMinus(ctx: Cobol85Parser.PlusMinusContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 */
	fun enterMultDivs(ctx: Cobol85Parser.MultDivsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 */
	fun exitMultDivs(ctx: Cobol85Parser.MultDivsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 */
	fun enterMultDiv(ctx: Cobol85Parser.MultDivContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 */
	fun exitMultDiv(ctx: Cobol85Parser.MultDivContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 */
	fun enterPowers(ctx: Cobol85Parser.PowersContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 */
	fun exitPowers(ctx: Cobol85Parser.PowersContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 */
	fun enterPower(ctx: Cobol85Parser.PowerContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 */
	fun exitPower(ctx: Cobol85Parser.PowerContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 */
	fun enterBasis(ctx: Cobol85Parser.BasisContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 */
	fun exitBasis(ctx: Cobol85Parser.BasisContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 */
	fun enterCondition(ctx: Cobol85Parser.ConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 */
	fun exitCondition(ctx: Cobol85Parser.ConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	fun enterAndOrCondition(ctx: Cobol85Parser.AndOrConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	fun exitAndOrCondition(ctx: Cobol85Parser.AndOrConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 */
	fun enterCombinableCondition(ctx: Cobol85Parser.CombinableConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 */
	fun exitCombinableCondition(ctx: Cobol85Parser.CombinableConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	fun enterSimpleCondition(ctx: Cobol85Parser.SimpleConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	fun exitSimpleCondition(ctx: Cobol85Parser.SimpleConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 */
	fun enterClassCondition(ctx: Cobol85Parser.ClassConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 */
	fun exitClassCondition(ctx: Cobol85Parser.ClassConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 */
	fun enterConditionNameReference(ctx: Cobol85Parser.ConditionNameReferenceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 */
	fun exitConditionNameReference(ctx: Cobol85Parser.ConditionNameReferenceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 */
	fun enterConditionNameSubscriptReference(ctx: Cobol85Parser.ConditionNameSubscriptReferenceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 */
	fun exitConditionNameSubscriptReference(ctx: Cobol85Parser.ConditionNameSubscriptReferenceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 */
	fun enterRelationCondition(ctx: Cobol85Parser.RelationConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 */
	fun exitRelationCondition(ctx: Cobol85Parser.RelationConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 */
	fun enterRelationSignCondition(ctx: Cobol85Parser.RelationSignConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 */
	fun exitRelationSignCondition(ctx: Cobol85Parser.RelationSignConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	fun enterRelationArithmeticComparison(ctx: Cobol85Parser.RelationArithmeticComparisonContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	fun exitRelationArithmeticComparison(ctx: Cobol85Parser.RelationArithmeticComparisonContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	fun enterRelationCombinedComparison(ctx: Cobol85Parser.RelationCombinedComparisonContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	fun exitRelationCombinedComparison(ctx: Cobol85Parser.RelationCombinedComparisonContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	fun enterRelationCombinedCondition(ctx: Cobol85Parser.RelationCombinedConditionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	fun exitRelationCombinedCondition(ctx: Cobol85Parser.RelationCombinedConditionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	fun enterRelationalOperator(ctx: Cobol85Parser.RelationalOperatorContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	fun exitRelationalOperator(ctx: Cobol85Parser.RelationalOperatorContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 */
	fun enterAbbreviation(ctx: Cobol85Parser.AbbreviationContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 */
	fun exitAbbreviation(ctx: Cobol85Parser.AbbreviationContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifier(ctx: Cobol85Parser.IdentifierContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifier(ctx: Cobol85Parser.IdentifierContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 */
	fun enterTableCall(ctx: Cobol85Parser.TableCallContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 */
	fun exitTableCall(ctx: Cobol85Parser.TableCallContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionCall(ctx: Cobol85Parser.FunctionCallContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionCall(ctx: Cobol85Parser.FunctionCallContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 */
	fun enterReferenceModifier(ctx: Cobol85Parser.ReferenceModifierContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 */
	fun exitReferenceModifier(ctx: Cobol85Parser.ReferenceModifierContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 */
	fun enterCharacterPosition(ctx: Cobol85Parser.CharacterPositionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 */
	fun exitCharacterPosition(ctx: Cobol85Parser.CharacterPositionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 */
	fun enterLength(ctx: Cobol85Parser.LengthContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 */
	fun exitLength(ctx: Cobol85Parser.LengthContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subscript}.
	 * @param ctx the parse tree
	 */
	fun enterSubscript(ctx: Cobol85Parser.SubscriptContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subscript}.
	 * @param ctx the parse tree
	 */
	fun exitSubscript(ctx: Cobol85Parser.SubscriptContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 */
	fun enterArgument(ctx: Cobol85Parser.ArgumentContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 */
	fun exitArgument(ctx: Cobol85Parser.ArgumentContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedDataName(ctx: Cobol85Parser.QualifiedDataNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedDataName(ctx: Cobol85Parser.QualifiedDataNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedDataNameFormat1(ctx: Cobol85Parser.QualifiedDataNameFormat1Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedDataNameFormat1(ctx: Cobol85Parser.QualifiedDataNameFormat1Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedDataNameFormat2(ctx: Cobol85Parser.QualifiedDataNameFormat2Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedDataNameFormat2(ctx: Cobol85Parser.QualifiedDataNameFormat2Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedDataNameFormat3(ctx: Cobol85Parser.QualifiedDataNameFormat3Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedDataNameFormat3(ctx: Cobol85Parser.QualifiedDataNameFormat3Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedDataNameFormat4(ctx: Cobol85Parser.QualifiedDataNameFormat4Context)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedDataNameFormat4(ctx: Cobol85Parser.QualifiedDataNameFormat4Context)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedInData(ctx: Cobol85Parser.QualifiedInDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedInData(ctx: Cobol85Parser.QualifiedInDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 */
	fun enterInData(ctx: Cobol85Parser.InDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 */
	fun exitInData(ctx: Cobol85Parser.InDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 */
	fun enterInFile(ctx: Cobol85Parser.InFileContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 */
	fun exitInFile(ctx: Cobol85Parser.InFileContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 */
	fun enterInMnemonic(ctx: Cobol85Parser.InMnemonicContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 */
	fun exitInMnemonic(ctx: Cobol85Parser.InMnemonicContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 */
	fun enterInSection(ctx: Cobol85Parser.InSectionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 */
	fun exitInSection(ctx: Cobol85Parser.InSectionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 */
	fun enterInLibrary(ctx: Cobol85Parser.InLibraryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 */
	fun exitInLibrary(ctx: Cobol85Parser.InLibraryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 */
	fun enterInTable(ctx: Cobol85Parser.InTableContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 */
	fun exitInTable(ctx: Cobol85Parser.InTableContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 */
	fun enterAlphabetName(ctx: Cobol85Parser.AlphabetNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 */
	fun exitAlphabetName(ctx: Cobol85Parser.AlphabetNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentName(ctx: Cobol85Parser.AssignmentNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentName(ctx: Cobol85Parser.AssignmentNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 */
	fun enterBasisName(ctx: Cobol85Parser.BasisNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 */
	fun exitBasisName(ctx: Cobol85Parser.BasisNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 */
	fun enterCdName(ctx: Cobol85Parser.CdNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 */
	fun exitCdName(ctx: Cobol85Parser.CdNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 */
	fun enterClassName(ctx: Cobol85Parser.ClassNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 */
	fun exitClassName(ctx: Cobol85Parser.ClassNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 */
	fun enterComputerName(ctx: Cobol85Parser.ComputerNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 */
	fun exitComputerName(ctx: Cobol85Parser.ComputerNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 */
	fun enterConditionName(ctx: Cobol85Parser.ConditionNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 */
	fun exitConditionName(ctx: Cobol85Parser.ConditionNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 */
	fun enterDataName(ctx: Cobol85Parser.DataNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 */
	fun exitDataName(ctx: Cobol85Parser.DataNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 */
	fun enterDataDescName(ctx: Cobol85Parser.DataDescNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 */
	fun exitDataDescName(ctx: Cobol85Parser.DataDescNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 */
	fun enterEnvironmentName(ctx: Cobol85Parser.EnvironmentNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 */
	fun exitEnvironmentName(ctx: Cobol85Parser.EnvironmentNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 */
	fun enterFileName(ctx: Cobol85Parser.FileNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 */
	fun exitFileName(ctx: Cobol85Parser.FileNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionName(ctx: Cobol85Parser.FunctionNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionName(ctx: Cobol85Parser.FunctionNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 */
	fun enterIndexName(ctx: Cobol85Parser.IndexNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 */
	fun exitIndexName(ctx: Cobol85Parser.IndexNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 */
	fun enterLanguageName(ctx: Cobol85Parser.LanguageNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 */
	fun exitLanguageName(ctx: Cobol85Parser.LanguageNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 */
	fun enterLibraryName(ctx: Cobol85Parser.LibraryNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 */
	fun exitLibraryName(ctx: Cobol85Parser.LibraryNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 */
	fun enterLocalName(ctx: Cobol85Parser.LocalNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 */
	fun exitLocalName(ctx: Cobol85Parser.LocalNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 */
	fun enterMnemonicName(ctx: Cobol85Parser.MnemonicNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 */
	fun exitMnemonicName(ctx: Cobol85Parser.MnemonicNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 */
	fun enterParagraphName(ctx: Cobol85Parser.ParagraphNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 */
	fun exitParagraphName(ctx: Cobol85Parser.ParagraphNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 */
	fun enterProcedureName(ctx: Cobol85Parser.ProcedureNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 */
	fun exitProcedureName(ctx: Cobol85Parser.ProcedureNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 */
	fun enterProgramName(ctx: Cobol85Parser.ProgramNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 */
	fun exitProgramName(ctx: Cobol85Parser.ProgramNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 */
	fun enterRecordName(ctx: Cobol85Parser.RecordNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 */
	fun exitRecordName(ctx: Cobol85Parser.RecordNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 */
	fun enterReportName(ctx: Cobol85Parser.ReportNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 */
	fun exitReportName(ctx: Cobol85Parser.ReportNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 */
	fun enterRoutineName(ctx: Cobol85Parser.RoutineNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 */
	fun exitRoutineName(ctx: Cobol85Parser.RoutineNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 */
	fun enterScreenName(ctx: Cobol85Parser.ScreenNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 */
	fun exitScreenName(ctx: Cobol85Parser.ScreenNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 */
	fun enterSectionName(ctx: Cobol85Parser.SectionNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 */
	fun exitSectionName(ctx: Cobol85Parser.SectionNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 */
	fun enterSystemName(ctx: Cobol85Parser.SystemNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 */
	fun exitSystemName(ctx: Cobol85Parser.SystemNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 */
	fun enterSymbolicCharacter(ctx: Cobol85Parser.SymbolicCharacterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 */
	fun exitSymbolicCharacter(ctx: Cobol85Parser.SymbolicCharacterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 */
	fun enterTextName(ctx: Cobol85Parser.TextNameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 */
	fun exitTextName(ctx: Cobol85Parser.TextNameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 */
	fun enterCobolWord(ctx: Cobol85Parser.CobolWordContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 */
	fun exitCobolWord(ctx: Cobol85Parser.CobolWordContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: Cobol85Parser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: Cobol85Parser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterBooleanLiteral(ctx: Cobol85Parser.BooleanLiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitBooleanLiteral(ctx: Cobol85Parser.BooleanLiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterNumericLiteral(ctx: Cobol85Parser.NumericLiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitNumericLiteral(ctx: Cobol85Parser.NumericLiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterIntegerLiteral(ctx: Cobol85Parser.IntegerLiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitIntegerLiteral(ctx: Cobol85Parser.IntegerLiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterCicsDfhRespLiteral(ctx: Cobol85Parser.CicsDfhRespLiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitCicsDfhRespLiteral(ctx: Cobol85Parser.CicsDfhRespLiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterCicsDfhValueLiteral(ctx: Cobol85Parser.CicsDfhValueLiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitCicsDfhValueLiteral(ctx: Cobol85Parser.CicsDfhValueLiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	fun enterFigurativeConstant(ctx: Cobol85Parser.FigurativeConstantContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	fun exitFigurativeConstant(ctx: Cobol85Parser.FigurativeConstantContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 */
	fun enterSpecialRegister(ctx: Cobol85Parser.SpecialRegisterContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 */
	fun exitSpecialRegister(ctx: Cobol85Parser.SpecialRegisterContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 */
	fun enterCommentEntry(ctx: Cobol85Parser.CommentEntryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 */
	fun exitCommentEntry(ctx: Cobol85Parser.CommentEntryContext)
}