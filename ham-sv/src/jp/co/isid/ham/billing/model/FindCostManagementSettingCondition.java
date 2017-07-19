package jp.co.isid.ham.billing.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * 制作費設定検索条件
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2013/1/22 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
@XmlRootElement(namespace = "http://model.billing.ham.isid.co.jp/")
@XmlType(namespace = "http://model.billing.ham.isid.co.jp/")
public class FindCostManagementSettingCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** フェイズ */
    private int _phase = 0;

    /** 年月 */
    private String _yearMonth = null;

    /** 帳票コード */
    private String _reportCd = null;

    /** HAM ID */
    private String _hamId = null;

    /** 画面ID */
    private String _formId;

    /** 種別 */
    private String _funcType;

    /** 局コード */
    private String _kksikognzuntcd = null;

    /** ユーザ種別 */
    private String _usertype = null;

    /** セキュリティコード */
    private String _securitycd = null;


    /**
     * フェイズを取得する
     *
     * @return フェイズ
     */
    public int getPhase() {
        return _phase;
    }

    /**
     * フェイズを設定する
     *
     * @param phase フェイズ
     */
    public void setPhase(int phase) {
        _phase = phase;
    }

    /**
     * 年月を取得する
     *
     * @return 年月
     */
    public String getYearMonth() {
        return _yearMonth;
    }

    /**
     * 年月を設定する
     *
     * @param yearMonth 年月
     */
    public void setYearMonth(String yearMonth) {
        _yearMonth = yearMonth;
    }

    /**
     * 帳票コードを取得する
     *
     * @return 帳票コード
     */
    public String getReportCd() {
        return _reportCd;
    }

    /**
     * 帳票コードを設定する
     *
     * @param reportCd 帳票コード
     */
    public void setReportCd(String reportCd) {
        _reportCd = reportCd;
    }

    /**
     * HAM IDを取得する
     *
     * @return HAM ID
     */
    public String getHamId() {
        return _hamId;
    }

    /**
     * HAM IDを設定する
     *
     * @param hamId HAM ID
     */
    public void setHamId(String hamId) {
        _hamId = hamId;
    }

    /**
     * 画面IDを取得する
     *
     * @return 画面ID
     */
    public String getFormId() {
        return _formId;
    }

    /**
     * 画面IDを設定する
     *
     * @param formID 画面ID
     */
    public void setFormId(String formId) {
        _formId = formId;
    }

    /**
     * 種別を取得する
     *
     * @return 種別
     */
    public String getFuncType() {
        return _funcType;
    }

    /**
     * 種別を設定する
     *
     * @param funcid 種別
     */
    public void setFuncType(String functype) {
        _funcType = functype;
    }

    /**
     * 局コードを取得する
     *
     * @return 局コード
     */
    public String getKksikognzuntcd()
    {
        return _kksikognzuntcd;
    }

    /**
     * 局コードを設定する
     *
     * @param kksikognzuntcd 局コード
     */
    public void setKksikognzuntcd(String kksikognzuntcd)
    {
        this._kksikognzuntcd = kksikognzuntcd;
    }

    /**
     * ユーザ種別を取得する
     *
     * @return ユーザ種別
     */
    public String getUsertype() {
        return _usertype;
    }

    /**
     * ユーザ種別を設定する
     *
     * @param usertype ユーザ種別
     */
    public void setUsertype(String usertype) {
        this._usertype = usertype;
    }

    /**
     * セキュリティコードを取得する
     *
     * @return セキュリティコード
     */
    public String getSecuritycd()
    {
        return _securitycd;
    }

    /**
     * セキュリティコードを設定する
     *
     * @param securitycd セキュリティコード
     */
    public void setSecuritycd(String securitycd)
    {
        this._securitycd = securitycd;
    }
}
