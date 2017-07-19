package jp.co.isid.ham.util.constants;

import java.math.BigDecimal;

/**
 * <P>
 * HAMVXeèNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2011/12/01 JSE H.Abe)<BR>
 * E¿Æ±ÏXÎ(2015/08/31 HLC S.Fujimoto)<BR>
 * EJASRACÎ(2015/10/31 HLC S.Fujimoto)<BR>
 * EHDXÎ(2016/02/17 HLC K.Soga)<BR>
 * EHDXsïÎ(2016/06/08 HLC K.Soga)<BR>
 * </P>
 *
 * @author JSE H.Abe
 */
public class HAMConstants {

    /** CX^X¶¬Ö~ */
    private HAMConstants() {
    }

    /** ³ølitFCYj */
    public static final BigDecimal INVALID_PHASE = BigDecimal.valueOf(-1);

    /** ðæª(o^) */
    public static final String HISTORYKBN_REGSTER = "01";
    /** ðæª(XV) */
    public static final String HISTORYKBN_UPDATE = "02";
    /** ðæª(í) */
    public static final String HISTORYKBN_DELETE = "03";
    /** ðæª(~) */
    public static final String HISTORYKBN_STOP = "04";
    /** ðæª(mF) */
    public static final String HISTORYKBN_CONFIRM = "05";
    /** ðæª(mFæÁ) */
    public static final String HISTORYKBN_CONFCANCEL = "06";
    /** ðæª(f[^Ú®) */
    public static final String HISTORYKBN_DATAMOVE = "07";
    /** ðæª(f[^Rs[) */
    public static final String HISTORYKBN_DATACOPY = "08";
    /** ðæª(SSSAg) */
    public static final String HISTORYKBN_SSS = "09";
    /** 2015/11/05 JASRACÎ HLC S.Fujimoto ADD Start */
    /** ðæª({fÞo^) */
    public static final String HISTORYKBN_REGISTER_TEMP_TO_ACTUAL = "10";
    /** ðæª(¼fÞo^) */
    public static final String HISTORYKBN_REGISTER_TEMP = "11";
    /** 2015/11/05 JASRACÎ HLC S.Fujimoto ADD End */

    /** 2015/11/12 JASRACÎ HLC K.Soga ADD Start */
    /**
     * ì¬æª
     */
    /** ì¬æª(VXeì¬) */
    public static final String RECKBN_SYSTEM = "0";
    /** ì¬æª(èì¬) */
    public static final String RECKBN_NONSYSTEM = "1";

    /**
     * ì¬Ô
     */
    /** ì¬Ô */
    public static final String RECKNO = "0000";
    /** 2015/11/12 JASRACÎ HLC K.Soga ADD End */

    /** 2015/08/31 ¿Æ±ÏXÎ S.Fujimoto ADD Start */
    /**
     * R[hæª
     */
    /** Ôí */
    public static final String CODETYPE_CAR = "03";
    /** éÆR[h */
    public static final String CODETYPE_COMPANY = "06";
    /** R[væª */
    public static final String CODETYPE_COOPKBN = "07";
    /** ¶æ¼ */
    public static final String CODETYPE_DESTINATIONNAME = "08";
    /** ÁïÅ */
    public static final String CODETYPE_CONSUMPTIONTAX = "09";
    /** po¤i\¦ */
    public static final String CODETYPE_ITEMDISPNUM = "10";
    /** ïÐîñ */
    public static final String CODETYPE_COMPANYINFO = "11";
    /** [UíÊ */
    public static final String CODETYPE_USERTYPE = "13";
    /** ú */
    public static final String CODETYPE_PERIOD = "14";
    /** düÁïÅvZæª */
    public static final String CODETYPE_CALKBN = "15";
    /** _ñíÞ */
    public static final String CODETYPE_CTRTKBN = "16";
    /** tFCY */
    public static final String CODETYPE_PHASE = "17";
    /** íÊ(}X^) */
    public static final String CODETYPE_DATATYPE = "18";
    /**  [ÀsfBNg */
    public static final String CODETYPE_REPORT = "19";
    /** }ÌR[h */
    public static final String CODETYPE_MEDIACD = "20";
    /** A[g[íÊ */
    public static final String CODETYPE_MAILTYPE = "21";
    /** A[g\¦íÊ */
    public static final String CODETYPE_DISPTYPE = "22";
    /** ¶ætO */
    public static final String CODETYPE_SENDTYPE = "23";
    /** A[g\¦ægDR[h */
    public static final String CODETYPE_SIKOGNZUNTCD = "24";
    /** dÊÔíR[h */
    public static final String CODETYPE_DCARCD = "25";
    /** R[hæª */
    public static final String CODETYPE_RECODETYPE = "26";
    /** DKBAgt@Cwb_ */
    public static final String CODETYPE_HEADER = "27";
    /** ©§[§æª */
    public static final String CODETYPE_NPDIV = "28";
    /** _ñæª */
    public static final String CODETYPE_CONTRACTDIV = "29";
    /** P¿PÊ */
    public static final String CODETYPE_UNIT = "30";
    /** yCR§ìïz§ì´¿\D¿æúl */
    public static final String CODETYPE_SEIKYUDEF = "31";
    /** y`FbNXgzR3f[^æ¾ÎÛ¾Óæ */
    public static final String CODETYPE_CHECKLISTTARGET = "32";
    /** yXVðzðìÆæª¼Ì */
    public static final String CODETYPE_HISTORYNM = "33";
    /** yCR§ìïzSSSAgXe[^X¼Ì */
    public static final String COEDTYPE_RSTATUSNM = "34";
    /** yCR§ìïzÏXÌAgXe[^XXVñÔ(§ì´¿\) */
    public static final String CODETYPE_RSUPDCOLG = "35";
    /** yCR§ìïzÏXÌAgXe[^XXVñÔ (§ìï\) */
    public static final String CODETYPE_RSUPDCOLS = "36";
    /** cÆìÆä úl */
    public static final String CODETYPE_ACDEFAULT = "37";
    /** cÆR[h */
    public static final String CODETYPE_EGSYOCD = "38";
    /** CSVt@Cì¬îñ */
    public static final String CODETYPE_CSVINFO = "39";
    /** ¿f[^ì¬îñ */
    public static final String CODETYPE_BILLDATA_INFO = "40";
    /** HMå */
    public static final String CODETYPE_HMDIV = "41";
    /** ¿f[^oÍÚ */
    public static final String CODETYPE_BILLDATA_COLUMN = "42";

    /** 2016/02/17 HDXÎ HLC K.Soga ADD Start */
    /** NEW\¦ */
    public static final String CODETYPE_NEWDISP = "49";
    /** 2016/02/17 HDXÎ HLC K.Soga ADD End */

    /** 2016/06/08 HDXsïÎ HLC K.Soga ADD Start */
    /** dÊÔíSÒ */
    public static final String CODETYPE_SYATAN = "50";
    /** 2016/06/08 HDXsïÎ HLC K.Soga ADD End */

    /** 2015/11/12 JASRACÎ HLC K.Soga ADD Start */
    /**
     * tFCY(CODETYE = 17)
     */
    /** tFCYîl */
    public static final String CODETYPE_PHASE_0 = "0";
    /** 2015/11/12 JASRACÎ HLC K.Soga ADD End */

    /** 2016/06/08 HDXsïÎ HLC K.Soga ADD Start */
    /** dÊÔíSÒ */
    public static final String CODENAME_SYATAN = "D";
    /** 2016/06/08 HDXsïÎ HLC K.Soga ADD End */

    /**
     * 
     */
    /** 1 */
    public static final int MONTH_JAN = 1;
    /** 2 */
    public static final int MONTH_FEB = 2;
    /** 3 */
    public static final int MONTH_MAR = 3;
    /** 4 */
    public static final int MONTH_APR = 4;
    /** 5 */
    public static final int MONTH_MAY = 5;
    /** 6 */
    public static final int MONTH_JUN = 6;
    /** 7 */
    public static final int MONTH_JUL = 7;
    /** 8 */
    public static final int MONTH_AUG = 8;
    /** 9 */
    public static final int MONTH_SEP = 9;
    /** 10 */
    public static final int MONTH_OCT = 10;
    /** 11 */
    public static final int MONTH_NOV = 11;
    /** 12 */
    public static final int MONTH_DEC = 12;

    /**
     * ú
     */
    /** ãú */
    public static final String TERM_FIRST = "0";
    /** ºú */
    public static final String TERM_SECOND = "1";

    /** 2015/12/14 JASRACÎ HLC S.Fujimoto ADD Start */
    /**
     * ú(¶ñ)
     */
    /** ãú */
    public static final String TERM_STR_FIRST = "ã";
    /** ºú */
    public static final String TERM_STR_SECOND = "º";
    /** 2015/12/14 JASRACÎ HLC S.Fujimoto ADD End */

    /**
     *  [íÊ
     */
    /** ©Ï */
    public static final BigDecimal REPORT_ESTIMATE = BigDecimal.valueOf(1);
    /** ¿¾× */
    public static final BigDecimal REPORT_BILLDTL = BigDecimal.valueOf(2);
    /** ¿ */
    public static final BigDecimal REPORT_BILL = BigDecimal.valueOf(3);
    /** ¿f[^(Excel) */
    public static final BigDecimal REPORT_BILLEXL = BigDecimal.valueOf(4);

    /** 2015/12/21 JASRACÎ HLC S.Fujimoto ADD Start */
    /** JASRAC\¿ */
    public static final BigDecimal REPORT_JASRAC_APPLICATION = BigDecimal.valueOf(11);
    /** JASRAC¿¾× */
    public static final BigDecimal REPORT_JASRAC_BILL = BigDecimal.valueOf(12);
    /** 2015/12/21 JASRACÎ HLC S.Fujimoto ADD End */

    /**
     * ©ÏíÊ
     */
    /** »ì´¿\x[X */
    public static final String ESTIMATE_CLASS_PRODUCTION= "0";
    /** CR§ìï */
    public static final String ESTIMATE_CLASS_CRPRODUCTION = "1";
    /** cÆìÆä x[X */
    public static final String ESTIMATE_CLASS_MEDIA = "2";

    /**
     *  [oÍtO
     */
    /** oÍÎÛO */
    public static final BigDecimal REPORT_OUTPUT_EXCLUDE = BigDecimal.valueOf(0);
    /** oÍÎÛ */
    public static final BigDecimal REPORT_OUTPUT = BigDecimal.valueOf(1);

    /**
     * §ìïíÊ»ftO
     */
    /** »ì´¿\ */
    public static final String SEISAKUHI_CLASSDIV_PRODUCTION = "0";
    /** §ìï\ */
    public static final String SEISAKUHI_CLASSDIV_CRPRODUCTION = "1";

    /**
     * düÁïÅvZæª
     */
    /** OÅ */
    public static final String CALKBN_EXTERNAL = "E";
    /** àÅ */
    public static final String CALKBN_INTERNAL = "I";
    /** ñÛÅ */
    public static final String CALKBN_NOT_TAABLE = "N";

    /**
     * ÛÅæª
     */
    /** _ñ */
    public static final String TAXKBN_CONTRACT = "05";

    /**
     * }ÌR[h(Åè)
     */
    /** L§ìï */
    public static final String MEDIACD_PRODUCTION = "M30";
    /** _ñÖA */
    public static final String MEDIACD_CONTRACT = "M32";

    /**
     * J_[}X^f[^æª
     */
    /** dÊ */
    public static final String CALENDAR_DATAKBN_DENTSU = "01";

    /**
     * ¿æO[v
     */
    /** ¿æO[v¢Ýè */
    public static final String BILLGROUP_UNKNOWN = "XXX";
    /** 2015/08/31 ¿Æ±ÏXÎ S.Fujimoto ADD End */

    /** 2015/11/11 JASRACÎ HLC K.Soga ADD Start */
    /**
     * fÞn
     */
    /** ^C */
    public static final String NOKBN_TIME = "T+";
    /** X|bg */
    public static final String NOKBN_SPOT = "S+";
    /** WI */
    public static final String NOKBN_RADIO = "R+";

    /**
     * _ñíÞ
     */
    /** ^g */
    public static final String CTRTKBN_TALENT = "1";
    /** f */
    public static final String CTRTKBN_MODEL = "2";
    /** i[^[ */
    public static final String CTRTKBN_NARRATOR = "3";
    /** yÈ */
    public static final String CTRTKBN_MUSIC = "4";

    /**
     * JASRACÎÛtO
     */
    /** ÎÛ */
    public static final String MUSIC_FOR_JASRAC = "Y";
    /** ÎÛO */
    public static final String MUSIC_FOR_NOT_JASRAC = "N";

    /**
     * {fÞE¼fÞtO
     */
    /** {fÞ */
    public static final String MATERIAL_KBN_ACTUAL = "0";
    /** ¼fÞ */
    public static final String MATERIAL_KBN_TEMP = "1";

    /**
     * {fÞE¼fÞ10CMR[h·
     */
    /** {fÞ */
    public static final int MATERIAL_LENGTH = 11;
    /** ¼fÞ */
    public static final int TEMPMATERIAL_LENGTH = 6;

    /**
     * ¼fÞn
     */
    /** ^C */
    public static final String TEMP_NOKBN_TIME = "T5";
    /** X|bg */
    public static final String TEMP_NOKBN_SPOT = "S5";
    /** WI */
    public static final String TEMP_NOKBN_RADIO = "R5";

    /**
     * ¼fÞn(¼10CMR[hp)
     */
    /** ^C */
    public static final String TEMPCMCODE_NOKBN_TIME = "T";
    /** X|bg */
    public static final String TEMPCMCODE_NOKBN_SPOT = "S";
    /** WI */
    public static final String TEMPCMCODE_NOKBN_RADIO = "R";

    /** 2016/1/18 JASRACsïÎ HLC K.Soga ADD Start */
    /**
     * {fÞn(10CMR[hp)
     */
    /** ^C */
    public static final String CMCODE_NOKBN_TIME = "TA";
    /** X|bg */
    public static final String CMCODE_NOKBN_SPOT = "SA";
    /** WI */
    public static final String CMCODE_NOKBN_RADIO = "RR";
    /** 2016/1/18 JASRACsïÎ HLC K.Soga ADD End */

    /**
     * fÞo^ítO
     */
    /** Êí */
    public static final String MATERIAL_REGISTER_DELFLG_USUAL = " ";
    /** í */
    public static final String MATERIAL_REGISTER_DELFLG_DELETE = "D";
    /** ³ø */
    public static final String MATERIAL_REGISTER_DELFLG_IGNORE = "I";

    /**
     * _ño^ítO
     */
    /** Êí */
    public static final String CONTRACT_REGISTER_DELFLG_USUAL = " ";
    /** í */
    public static final String CONTRACT_REGISTER_DELFLG_DELETE = "D";
    /** ³ø */
    public static final String CONTRACT_REGISTER_DELFLG_IGNORE = "I";

    /**
     * Ôí\¦
     */
    /** ñ\¦ */
    public static final String CAR_DISP_INVISIBLE = "0";
    /** \¦ */
    public static final String CAR_DISP_VISIBLE = "1";

    /**
     * WIÔgñ¿àæª
     */
    /** 20bP¿ */
    public static final String SALES_PRICE_DIV_SECOND20 = "01";
    /** z¿à */
    public static final String SALES_PRICE_DIV_MONTLY = "02";
    /** 2015/11/11 JASRACÎ HLC K.Soga ADD End */

    /** 2016/01/12 JASRACsïÎ HLC K.Soga ADD Start */
    /** 20b */
    public static final String SECOND20 = "20";
    /** 2016/01/12 JASRACsïÎ HLC K.Soga ADD End */

    /** 2016/02/05 ¿Æ±ÏXÎ HLC K.Soga ADD Start */
    /** O[vR[h0(¦}ÌÌêÌÝ) */
    public static final BigDecimal GROUPCODE0 = BigDecimal.valueOf(0);

    /** §ì */
    public static final String PRODUCTION = "0";
    /** }Ì */
    public static final String MEDIA = "1";

    /** 0 */
    public static final String ZERO = "0";
    /** 1 */
    public static final String ONE = "1";
    /** 2016/02/05 ¿Æ±ÏXÎ HLC K.Soga ADD End */

    /** 2016/02/19 HDXÎ HLC K.Soga ADD Start */
    /** fÞê */
    public static final String MATERIAL_LIST = "0";
    /** fÞo^ */
    public static final String MATERIAL_REGIST = "1";

    /**
     * HDX¤Le[uQÆÅè¶ñ
     */
    /** VXeID */
    public static final String SYSTEMID_HDX = "PU";
    /** LåíÊ */
    public static final String CLIENTSBT_HDX = "HDX";
    /** j[^uR[h */
    public static final String MENUTABCODE_HDX = "common";
    /** fÞðÇXe[^X(½fÏÝ) */
    public static final String MATERIALHISTORY_ALREADY = "2";

    /** ítO */
    public static final String DELFLG = "D";

    /** ì¬ÔNULLp */
    public static final String RECNO_IS_NULL = "0";
    /** ì¬ÔNOT NULLp */
    public static final String RECNO_IS_NOT_NULL = "1";

    /**
     * fÞêítO
     */
    /** í */
    public static final String MATERIAL_LIST_DELFLG_DELETE = "E";
    /** 2016/02/19 HDXÎ HLC K.Soga ADD End */
}
