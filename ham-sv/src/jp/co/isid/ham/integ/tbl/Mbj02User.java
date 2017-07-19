package jp.co.isid.ham.integ.tbl;

/**
 * <P>
 * 担当者マスタ
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
public class Mbj02User {

    /**
     * インスタンス生成禁止
     */
    private Mbj02User() {
    }

    /** 担当者マスタ (MBJ02USER) */
    public static final String TBNAME = "MBJ02USER";

    /** Prefix (MBJ02_) */
    public static final String PREFIX = "MBJ02_";

    /** 担当者ID (HAMID) */
    public static final String HAMID = PREFIX + "HAMID";

    /** 担当者姓 (USERNAME1) */
    public static final String USERNAME1 = PREFIX + "USERNAME1";

    /** 担当者名 (USERNAME2) */
    public static final String USERNAME2 = PREFIX + "USERNAME2";

    /** ユーザ種別 (USERTYPE) */
    public static final String USERTYPE = PREFIX + "USERTYPE";

    /** データ更新日時 (UPDDATE) */
    public static final String UPDDATE = PREFIX + "UPDDATE";

    /** データ更新者 (UPDNM) */
    public static final String UPDNM = PREFIX + "UPDNM";

    /** 更新プログラム (UPDAPL) */
    public static final String UPDAPL = PREFIX + "UPDAPL";

    /** 更新担当者ID (UPDID) */
    public static final String UPDID = PREFIX + "UPDID";

}
