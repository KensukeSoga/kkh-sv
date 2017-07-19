package jp.co.isid.ham.common.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * 取引先担当（払）検索条件
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class RepaVbjaMeu15ThsTntHrCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 取引先企業コード */
    private String _thskgycd = null;

    /** ＳＥＱＮＯ */
    private String _seqno = null;

    /** 払担当ＳＥＱＮＯ */
    private String _hrtntseqno = null;

    /** 有効終了年月日 */
    private String _endymd = null;

    /** 有効開始年月日 */
    private String _startymd = null;

    /** 申請者コード */
    private String _snstnt = null;

    /** 組織コード */
    private String _sikcd = null;

    /** 支払先区分 */
    private String _shrkbn = null;

    /** 振込先区分 */
    private String _frkskbn = null;

    /** 営業費支払先区分 */
    private String _eghishrskbn = null;

    /** 設定支払先区分 */
    private String _styshrskbn = null;

    /** 申請ＮＯ */
    private String _sinseino = null;

    /** 営業所コード */
    private String _egsyocd = null;

    /** 支払条件ＰＴＮＮＯ */
    private String _shjyoknptnno = null;

    /** 旧取引先コード */
    private String _kyutrcd = null;

    /** 払担当予備 */
    private String _hrtntyobi = null;

    /**
     * デフォルトコンストラクタ
     */
    public RepaVbjaMeu15ThsTntHrCondition() {
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
     * 払担当ＳＥＱＮＯを取得する
     *
     * @return 払担当ＳＥＱＮＯ
     */
    public String getHrtntseqno() {
        return _hrtntseqno;
    }

    /**
     * 払担当ＳＥＱＮＯを設定する
     *
     * @param hrtntseqno 払担当ＳＥＱＮＯ
     */
    public void setHrtntseqno(String hrtntseqno) {
        this._hrtntseqno = hrtntseqno;
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
     * 支払先区分を取得する
     *
     * @return 支払先区分
     */
    public String getShrkbn() {
        return _shrkbn;
    }

    /**
     * 支払先区分を設定する
     *
     * @param shrkbn 支払先区分
     */
    public void setShrkbn(String shrkbn) {
        this._shrkbn = shrkbn;
    }

    /**
     * 振込先区分を取得する
     *
     * @return 振込先区分
     */
    public String getFrkskbn() {
        return _frkskbn;
    }

    /**
     * 振込先区分を設定する
     *
     * @param frkskbn 振込先区分
     */
    public void setFrkskbn(String frkskbn) {
        this._frkskbn = frkskbn;
    }

    /**
     * 営業費支払先区分を取得する
     *
     * @return 営業費支払先区分
     */
    public String getEghishrskbn() {
        return _eghishrskbn;
    }

    /**
     * 営業費支払先区分を設定する
     *
     * @param eghishrskbn 営業費支払先区分
     */
    public void setEghishrskbn(String eghishrskbn) {
        this._eghishrskbn = eghishrskbn;
    }

    /**
     * 設定支払先区分を取得する
     *
     * @return 設定支払先区分
     */
    public String getStyshrskbn() {
        return _styshrskbn;
    }

    /**
     * 設定支払先区分を設定する
     *
     * @param styshrskbn 設定支払先区分
     */
    public void setStyshrskbn(String styshrskbn) {
        this._styshrskbn = styshrskbn;
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
     * 支払条件ＰＴＮＮＯを取得する
     *
     * @return 支払条件ＰＴＮＮＯ
     */
    public String getShjyoknptnno() {
        return _shjyoknptnno;
    }

    /**
     * 支払条件ＰＴＮＮＯを設定する
     *
     * @param shjyoknptnno 支払条件ＰＴＮＮＯ
     */
    public void setShjyoknptnno(String shjyoknptnno) {
        this._shjyoknptnno = shjyoknptnno;
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
     * 払担当予備を取得する
     *
     * @return 払担当予備
     */
    public String getHrtntyobi() {
        return _hrtntyobi;
    }

    /**
     * 払担当予備を設定する
     *
     * @param hrtntyobi 払担当予備
     */
    public void setHrtntyobi(String hrtntyobi) {
        this._hrtntyobi = hrtntyobi;
    }

}
