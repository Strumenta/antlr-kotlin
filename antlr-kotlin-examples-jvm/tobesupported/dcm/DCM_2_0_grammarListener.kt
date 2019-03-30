// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DCM_2_0_grammarParser}.
 */
interface DCM_2_0_grammarListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#konservierung}.
	 * @param ctx the parse tree
	 */
	fun enterKonservierung(ctx: DCM_2_0_grammarParser.KonservierungContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#konservierung}.
	 * @param ctx the parse tree
	 */
	fun exitKonservierung(ctx: DCM_2_0_grammarParser.KonservierungContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kons_kopf}.
	 * @param ctx the parse tree
	 */
	fun enterKons_kopf(ctx: DCM_2_0_grammarParser.Kons_kopfContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kons_kopf}.
	 * @param ctx the parse tree
	 */
	fun exitKons_kopf(ctx: DCM_2_0_grammarParser.Kons_kopfContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#modulkopf_info}.
	 * @param ctx the parse tree
	 */
	fun enterModulkopf_info(ctx: DCM_2_0_grammarParser.Modulkopf_infoContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#modulkopf_info}.
	 * @param ctx the parse tree
	 */
	fun exitModulkopf_info(ctx: DCM_2_0_grammarParser.Modulkopf_infoContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_zeile}.
	 * @param ctx the parse tree
	 */
	fun enterMod_zeile(ctx: DCM_2_0_grammarParser.Mod_zeileContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_zeile}.
	 * @param ctx the parse tree
	 */
	fun exitMod_zeile(ctx: DCM_2_0_grammarParser.Mod_zeileContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_anf_zeile}.
	 * @param ctx the parse tree
	 */
	fun enterMod_anf_zeile(ctx: DCM_2_0_grammarParser.Mod_anf_zeileContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_anf_zeile}.
	 * @param ctx the parse tree
	 */
	fun exitMod_anf_zeile(ctx: DCM_2_0_grammarParser.Mod_anf_zeileContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_fort_zeile}.
	 * @param ctx the parse tree
	 */
	fun enterMod_fort_zeile(ctx: DCM_2_0_grammarParser.Mod_fort_zeileContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_fort_zeile}.
	 * @param ctx the parse tree
	 */
	fun exitMod_fort_zeile(ctx: DCM_2_0_grammarParser.Mod_fort_zeileContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_name}.
	 * @param ctx the parse tree
	 */
	fun enterMod_ele_name(ctx: DCM_2_0_grammarParser.Mod_ele_nameContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_name}.
	 * @param ctx the parse tree
	 */
	fun exitMod_ele_name(ctx: DCM_2_0_grammarParser.Mod_ele_nameContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_wert}.
	 * @param ctx the parse tree
	 */
	fun enterMod_ele_wert(ctx: DCM_2_0_grammarParser.Mod_ele_wertContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_wert}.
	 * @param ctx the parse tree
	 */
	fun exitMod_ele_wert(ctx: DCM_2_0_grammarParser.Mod_ele_wertContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionsdef}.
	 * @param ctx the parse tree
	 */
	fun enterFunktionsdef(ctx: DCM_2_0_grammarParser.FunktionsdefContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionsdef}.
	 * @param ctx the parse tree
	 */
	fun exitFunktionsdef(ctx: DCM_2_0_grammarParser.FunktionsdefContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionszeile}.
	 * @param ctx the parse tree
	 */
	fun enterFunktionszeile(ctx: DCM_2_0_grammarParser.FunktionszeileContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszeile}.
	 * @param ctx the parse tree
	 */
	fun exitFunktionszeile(ctx: DCM_2_0_grammarParser.FunktionszeileContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#fkt_version}.
	 * @param ctx the parse tree
	 */
	fun enterFkt_version(ctx: DCM_2_0_grammarParser.Fkt_versionContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_version}.
	 * @param ctx the parse tree
	 */
	fun exitFkt_version(ctx: DCM_2_0_grammarParser.Fkt_versionContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#fkt_langname}.
	 * @param ctx the parse tree
	 */
	fun enterFkt_langname(ctx: DCM_2_0_grammarParser.Fkt_langnameContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_langname}.
	 * @param ctx the parse tree
	 */
	fun exitFkt_langname(ctx: DCM_2_0_grammarParser.Fkt_langnameContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#variantendef}.
	 * @param ctx the parse tree
	 */
	fun enterVariantendef(ctx: DCM_2_0_grammarParser.VariantendefContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#variantendef}.
	 * @param ctx the parse tree
	 */
	fun exitVariantendef(ctx: DCM_2_0_grammarParser.VariantendefContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#variantenkrit}.
	 * @param ctx the parse tree
	 */
	fun enterVariantenkrit(ctx: DCM_2_0_grammarParser.VariantenkritContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#variantenkrit}.
	 * @param ctx the parse tree
	 */
	fun exitVariantenkrit(ctx: DCM_2_0_grammarParser.VariantenkritContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#krit_name}.
	 * @param ctx the parse tree
	 */
	fun enterKrit_name(ctx: DCM_2_0_grammarParser.Krit_nameContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#krit_name}.
	 * @param ctx the parse tree
	 */
	fun exitKrit_name(ctx: DCM_2_0_grammarParser.Krit_nameContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#krit_wert}.
	 * @param ctx the parse tree
	 */
	fun enterKrit_wert(ctx: DCM_2_0_grammarParser.Krit_wertContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#krit_wert}.
	 * @param ctx the parse tree
	 */
	fun exitKrit_wert(ctx: DCM_2_0_grammarParser.Krit_wertContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kons_rumpf}.
	 * @param ctx the parse tree
	 */
	fun enterKons_rumpf(ctx: DCM_2_0_grammarParser.Kons_rumpfContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kons_rumpf}.
	 * @param ctx the parse tree
	 */
	fun exitKons_rumpf(ctx: DCM_2_0_grammarParser.Kons_rumpfContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kenngroesse}.
	 * @param ctx the parse tree
	 */
	fun enterKenngroesse(ctx: DCM_2_0_grammarParser.KenngroesseContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kenngroesse}.
	 * @param ctx the parse tree
	 */
	fun exitKenngroesse(ctx: DCM_2_0_grammarParser.KenngroesseContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennwert}.
	 * @param ctx the parse tree
	 */
	fun enterKennwert(ctx: DCM_2_0_grammarParser.KennwertContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennwert}.
	 * @param ctx the parse tree
	 */
	fun exitKennwert(ctx: DCM_2_0_grammarParser.KennwertContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennwerteblock}.
	 * @param ctx the parse tree
	 */
	fun enterKennwerteblock(ctx: DCM_2_0_grammarParser.KennwerteblockContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennwerteblock}.
	 * @param ctx the parse tree
	 */
	fun exitKennwerteblock(ctx: DCM_2_0_grammarParser.KennwerteblockContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennlinie}.
	 * @param ctx the parse tree
	 */
	fun enterKennlinie(ctx: DCM_2_0_grammarParser.KennlinieContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennlinie}.
	 * @param ctx the parse tree
	 */
	fun exitKennlinie(ctx: DCM_2_0_grammarParser.KennlinieContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennfeld}.
	 * @param ctx the parse tree
	 */
	fun enterKennfeld(ctx: DCM_2_0_grammarParser.KennfeldContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennfeld}.
	 * @param ctx the parse tree
	 */
	fun exitKennfeld(ctx: DCM_2_0_grammarParser.KennfeldContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#gruppenstuetzstellen}.
	 * @param ctx the parse tree
	 */
	fun enterGruppenstuetzstellen(ctx: DCM_2_0_grammarParser.GruppenstuetzstellenContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#gruppenstuetzstellen}.
	 * @param ctx the parse tree
	 */
	fun exitGruppenstuetzstellen(ctx: DCM_2_0_grammarParser.GruppenstuetzstellenContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kenntext}.
	 * @param ctx the parse tree
	 */
	fun enterKenntext(ctx: DCM_2_0_grammarParser.KenntextContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kenntext}.
	 * @param ctx the parse tree
	 */
	fun exitKenntext(ctx: DCM_2_0_grammarParser.KenntextContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kgr_info}.
	 * @param ctx the parse tree
	 */
	fun enterKgr_info(ctx: DCM_2_0_grammarParser.Kgr_infoContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kgr_info}.
	 * @param ctx the parse tree
	 */
	fun exitKgr_info(ctx: DCM_2_0_grammarParser.Kgr_infoContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_x}.
	 * @param ctx the parse tree
	 */
	fun enterEinheit_x(ctx: DCM_2_0_grammarParser.Einheit_xContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_x}.
	 * @param ctx the parse tree
	 */
	fun exitEinheit_x(ctx: DCM_2_0_grammarParser.Einheit_xContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_y}.
	 * @param ctx the parse tree
	 */
	fun enterEinheit_y(ctx: DCM_2_0_grammarParser.Einheit_yContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_y}.
	 * @param ctx the parse tree
	 */
	fun exitEinheit_y(ctx: DCM_2_0_grammarParser.Einheit_yContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_w}.
	 * @param ctx the parse tree
	 */
	fun enterEinheit_w(ctx: DCM_2_0_grammarParser.Einheit_wContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_w}.
	 * @param ctx the parse tree
	 */
	fun exitEinheit_w(ctx: DCM_2_0_grammarParser.Einheit_wContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#langname}.
	 * @param ctx the parse tree
	 */
	fun enterLangname(ctx: DCM_2_0_grammarParser.LangnameContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#langname}.
	 * @param ctx the parse tree
	 */
	fun exitLangname(ctx: DCM_2_0_grammarParser.LangnameContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#displayname}.
	 * @param ctx the parse tree
	 */
	fun enterDisplayname(ctx: DCM_2_0_grammarParser.DisplaynameContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#displayname}.
	 * @param ctx the parse tree
	 */
	fun exitDisplayname(ctx: DCM_2_0_grammarParser.DisplaynameContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#var_abhangigkeiten}.
	 * @param ctx the parse tree
	 */
	fun enterVar_abhangigkeiten(ctx: DCM_2_0_grammarParser.Var_abhangigkeitenContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#var_abhangigkeiten}.
	 * @param ctx the parse tree
	 */
	fun exitVar_abhangigkeiten(ctx: DCM_2_0_grammarParser.Var_abhangigkeitenContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#var_abh}.
	 * @param ctx the parse tree
	 */
	fun enterVar_abh(ctx: DCM_2_0_grammarParser.Var_abhContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#var_abh}.
	 * @param ctx the parse tree
	 */
	fun exitVar_abh(ctx: DCM_2_0_grammarParser.Var_abhContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionszugehorigkeit}.
	 * @param ctx the parse tree
	 */
	fun enterFunktionszugehorigkeit(ctx: DCM_2_0_grammarParser.FunktionszugehorigkeitContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszugehorigkeit}.
	 * @param ctx the parse tree
	 */
	fun exitFunktionszugehorigkeit(ctx: DCM_2_0_grammarParser.FunktionszugehorigkeitContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_x}.
	 * @param ctx the parse tree
	 */
	fun enterAnzahl_x(ctx: DCM_2_0_grammarParser.Anzahl_xContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_x}.
	 * @param ctx the parse tree
	 */
	fun exitAnzahl_x(ctx: DCM_2_0_grammarParser.Anzahl_xContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_y}.
	 * @param ctx the parse tree
	 */
	fun enterAnzahl_y(ctx: DCM_2_0_grammarParser.Anzahl_yContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_y}.
	 * @param ctx the parse tree
	 */
	fun exitAnzahl_y(ctx: DCM_2_0_grammarParser.Anzahl_yContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#werteliste}.
	 * @param ctx the parse tree
	 */
	fun enterWerteliste(ctx: DCM_2_0_grammarParser.WertelisteContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste}.
	 * @param ctx the parse tree
	 */
	fun exitWerteliste(ctx: DCM_2_0_grammarParser.WertelisteContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#werteliste_kwb}.
	 * @param ctx the parse tree
	 */
	fun enterWerteliste_kwb(ctx: DCM_2_0_grammarParser.Werteliste_kwbContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste_kwb}.
	 * @param ctx the parse tree
	 */
	fun exitWerteliste_kwb(ctx: DCM_2_0_grammarParser.Werteliste_kwbContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#sst_liste_x}.
	 * @param ctx the parse tree
	 */
	fun enterSst_liste_x(ctx: DCM_2_0_grammarParser.Sst_liste_xContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#sst_liste_x}.
	 * @param ctx the parse tree
	 */
	fun exitSst_liste_x(ctx: DCM_2_0_grammarParser.Sst_liste_xContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste}.
	 * @param ctx the parse tree
	 */
	fun enterKf_zeile_liste(ctx: DCM_2_0_grammarParser.Kf_zeile_listeContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste}.
	 * @param ctx the parse tree
	 */
	fun exitKf_zeile_liste(ctx: DCM_2_0_grammarParser.Kf_zeile_listeContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_r}.
	 * @param ctx the parse tree
	 */
	fun enterKf_zeile_liste_r(ctx: DCM_2_0_grammarParser.Kf_zeile_liste_rContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_r}.
	 * @param ctx the parse tree
	 */
	fun exitKf_zeile_liste_r(ctx: DCM_2_0_grammarParser.Kf_zeile_liste_rContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_tx}.
	 * @param ctx the parse tree
	 */
	fun enterKf_zeile_liste_tx(ctx: DCM_2_0_grammarParser.Kf_zeile_liste_txContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_tx}.
	 * @param ctx the parse tree
	 */
	fun exitKf_zeile_liste_tx(ctx: DCM_2_0_grammarParser.Kf_zeile_liste_txContext)
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#realzahl}.
	 * @param ctx the parse tree
	 */
	fun enterRealzahl(ctx: DCM_2_0_grammarParser.RealzahlContext)
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#realzahl}.
	 * @param ctx the parse tree
	 */
	fun exitRealzahl(ctx: DCM_2_0_grammarParser.RealzahlContext)
}