package jp.co.isid.ham.common.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * 取引先担当（取）検索条件
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class RepaVbjaMeu14ThsTntTrCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 取引先企業コード */
    private String _thskgycd = null;

    /** ＳＥＱＮＯ */
    private String _seqno = null;

    /** 取担当ＳＥＱＮＯ */
    private String _trtntseqno = null;

    /** 有効終了年月日 */
    private String _endymd = null;

    /** 有効開始年月日 */
    private String _startymd = null;

    /** 申請者コード */
    private String _snstnt = null;

    /** 組織コード */
    private String _sikcd = null;

    /** 広告主区分 */
    private String _clntkbn = null;

    /** 得意先区分 */
    private String _tkkbn = null;

    /** 請求先区分 */
    private String _skyuskbn = null;

    /** 入金先区分 */
    private String _nkinskbn = null;

    /** 見込得意先区分 */
    private String _mkmtkskbn = null;

    /** 営業費得意先区分 */
    private String _eghishrskbn = null;

    /** 申請ＮＯ */
    private String _sinseino = null;

    /** 営業所コード */
    private String _egsyocd = null;

    /** 広告主企業コード */
    private String _clntkgycd = null;

    /** 広告主ＳＥＱＮＯ */
    private String _clntseqno = null;

    /** 旧取引先コード */
    private String _kyutrcd = null;

    /** 取担当予備 */
    private String _trtntyobi = null;

    /**
     * デフォルトコンストラクタ
     */
    public RepaVbjaMeu14ThsTntTrCondition() {
    }

    /**
     * 取引先企業コードを取得する
     *
     * @return 取引先企業コード
     */
    public String getThskgycd() {
        return _thskgycd;
    }

    /**
     * 取引先企業コードを設定する
     *
     * @param thskgycd 取引先企業コード
     */
    public void setThskgycd(String thskgycd) {
        this._thskgycd = thskgycd;
    }

    /**
     * ＳＥＱＮＯを取得する
     *
     * @return ＳＥＱＮＯ
     */
    public String getSeqno() {
        return _seqno;
    }

    /**
     * ＳＥＱＮＯを設定する
     *
     * @param seqno ＳＥＱＮＯ
     */
    public void setSeqno(String seqno) {
        this._seqno = seqno;
    }

    /**
     * 取担当ＳＥＱＮＯを取得する
     *
     * @return 取担当ＳＥＱＮＯ
     */
    public String getTrtntseqno() {
        return _trtntseqno;
    }

    /**
     * 取担当ＳＥＱＮＯを設定する
     *
     * @param trtntseqno 取担当ＳＥＱＮＯ
     */
    public void setTrtntseqno(String trtntseqno) {
        this._trtntseqno = trtntseqno;
    }

    /**
     * 有効終了年月日を取得する
     *
     * @return 有効終了年月日
     */
    public String getEndymd() {
        return _endymd;
    }

    /**
     * 有効終了年月日を設定する
     *
     * @param endymd 有効終了年月日
     */
    public void setEndymd(String endymd) {
        this._endymd = endymd;
    }

    /**
     * 有効開始年月日を取得する
     *
     * @return 有効開始年月日
     */
    public String getStartymd() {
        return _startymd;
    }

    /**
     * 有効開始年月日を設定する
     *
     * @param startymd 有効開始年月日
     */
    public void setStartymd(String startymd) {
        this._startymd = startymd;
    }

    /**
     * 申請者コードを取得する
     *
     * @return 申請者コード
     */
    public String getSnstnt() {
        return _snstnt;
    }

    /**
     * 申請者コードを設定する
     *
     * @param snstnt 申請者コード
     */
    public void setSnstnt(String snstnt) {
        this._snstnt = snstnt;
    }

    /**
     * 組織コードを取得する
     *
     * @return 組織コード
     */
    public String getSikcd() {
        return _sikcd;
    }

    /**
     * 組織コードを設定する
     *
     * @param sikcd 組織コード
     */
    public void setSikcd(String sikcd) {
        this._sikcd = sikcd;
    }

    /**
     * 広告主区分を取得する
     *
     * @return 広告主区分
     */
    public String getClntkbn() {
        return _clntkbn;
    }

    /**
     * 広告主区分を設定する
     *
     * @param clntkbn 広告主区分
     */
    public void setClntkbn(String clntkbn) {
        this._clntkbn = clntkbn;
    }

    /**
     * 得意先区分を取得する
     *
     * @return 得意先区分
     */
    public String getTkkbn() {
        return _tkkbn;
    }

    /**
     * 得意先区分を設定する
     *
     * @param tkkbn 得意先区分
     */
    public void setTkkbn(String tkkbn) {
        this._tkkbn = tkkbn;
    }

    /**
     * 請求先区分を取得する
     *
     * @return 請求先区分
     */
    public String getSkyuskbn() {
        return _skyuskbn;
    }

    /**
     * 請求先区分を設定する
     *
     * @param skyuskbn 請求先区分
     */
    public void setSkyuskbn(String skyuskbn) {
        this._skyuskbn = skyuskbn;
    }

    /**
     * 入金先区分を取得する
     *
     * @return 入金先区分
     */
    public String getNkinskbn() {
        return _nkinskbn;
    }

    /**
     * 入金先区分を設定する
     *
     * @param nkinskbn 入金先区分
     */
    public void setNkinskbn(String nkinskbn) {
        this._nkinskbn = nkinskbn;
    }

    /**
     * 見込得意先区分を取得する
     *
     * @return 見込得意先区分
     */
    public String getMkmtkskbn() {
        return _mkmtkskbn;
    }

    /**
     * 見込得意先区分を設定する
     *
     * @param mkmtkskbn 見込得意先区分
     */
    public void setMkmtkskbn(String mkmtkskbn) {
        this._mkmtkskbn = mkmtkskbn;
    }

    /**
     * 営業費得意先区分を取得する
     *
     * @return 営業費得意先区分
     */
    public String getEghishrskbn() {
        return _eghishrskbn;
    }

    /**
     * 営業費得意先区分を設定する
     *
     * @param eghishrskbn 営業費得意先区分
     */
    public void setEghishrskbn(String eghishrskbn) {
        this._eghishrskbn = eghishrskbn;
    }

    /**
     * 申請ＮＯを取得する
     *
     * @return 申請ＮＯ
     */
    public String getSinseino() {
        return _sinseino;
    }

    /**
     * 申請ＮＯを設定する
     *
     * @param sinseino 申請ＮＯ
     */
    public void setSinseino(String sinseino) {
        this._sinseino = sinseino;
    }

    /**
     * 営業所コードを取得する
     *
     * @return 営業所コード
     */
    public String getEgsyocd() {
        return _egsyocd;
    }

    /**
     * 営業所コードを設定する
     *
     * @param egsyocd 営業所コード
     */
    public void setEgsyocd(String egsyocd) {
        this._egsyocd = egsyocd;
    }

    /**
     * 広告主企業コードを取得する
     *
     * @return 広告主企業コード
     */
    public String getClntkgycd() {
        return _clntkgycd;
    }

    /**
     * 広告主企業コードを設定する
     *
     * @param clntkgycd 広告主企業コード
     */
    public void setClntkgycd(String clntkgycd) {
        this._clntkgycd = clntkgycd;
    }

    /**
     * 広告主ＳＥＱＮＯを取得する
     *
     * @return 広告主ＳＥＱＮＯ
     */
    public String getClntseqno() {
        return _clntseqno;
    }

    /**
     * 広告主ＳＥＱＮＯを設定する
     *
     * @param clntseqno 広告主ＳＥＱＮＯ
     */
    public void setClntseqno(String clntseqno) {
        this._clntseqno = clntseqno;
    }

    /**
     * 旧取引先コードを取得する
     *
     * @return 旧取引先コード
     */
    public String getKyutrcd() {
        return _kyutrcd;
    }

    /**
     * 旧取引先コードを設定する
     *
     * @param kyutrcd 旧取引先コード
     */
    public void setKyutrcd(String kyutrcd) {
        this._kyutrcd = kyutrcd;
    }

    /**
     * 取担当予備を取得する
     *
     * @return 取担当予備
     */
    public String getTrtntyobi() {
        return _trtntyobi;
    }

    /**
     * 取担当予備を設定する
     *
     * @param trtntyobi 取担当予備
     */
    public void setTrtntyobi(String trtntyobi) {
        this._trtntyobi = trtntyobi;
    }

}
