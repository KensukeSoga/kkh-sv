package jp.co.isid.ham.common.model;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.integ.tbl.RepaVbjaMeu15ThsTntHr;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * 取引先担当（払）VO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class RepaVbjaMeu15ThsTntHrVO extends AbstractModel {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * デフォルトコンストラクタ
     */
    public RepaVbjaMeu15ThsTntHrVO() {
    }

    /**
     * 新規インスタンスを生成する
     *
     * @return 新規インスタンス
     */
    public Object newInstance() {
        return new RepaVbjaMeu15ThsTntHrVO();
    }

    /**
     * 取引先企業コードを取得する
     *
     * @return 取引先企業コード
     */
    public String getTHSKGYCD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.THSKGYCD);
    }

    /**
     * 取引先企業コードを設定する
     *
     * @param val 取引先企業コード
     */
    public void setTHSKGYCD(String val) {
        set(RepaVbjaMeu15ThsTntHr.THSKGYCD, val);
    }

    /**
     * ＳＥＱＮＯを取得する
     *
     * @return ＳＥＱＮＯ
     */
    public String getSEQNO() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SEQNO);
    }

    /**
     * ＳＥＱＮＯを設定する
     *
     * @param val ＳＥＱＮＯ
     */
    public void setSEQNO(String val) {
        set(RepaVbjaMeu15ThsTntHr.SEQNO, val);
    }

    /**
     * 払担当ＳＥＱＮＯを取得する
     *
     * @return 払担当ＳＥＱＮＯ
     */
    public String getHRTNTSEQNO() {
        return (String) get(RepaVbjaMeu15ThsTntHr.HRTNTSEQNO);
    }

    /**
     * 払担当ＳＥＱＮＯを設定する
     *
     * @param val 払担当ＳＥＱＮＯ
     */
    public void setHRTNTSEQNO(String val) {
        set(RepaVbjaMeu15ThsTntHr.HRTNTSEQNO, val);
    }

    /**
     * 有効終了年月日を取得する
     *
     * @return 有効終了年月日
     */
    public String getENDYMD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.ENDYMD);
    }

    /**
     * 有効終了年月日を設定する
     *
     * @param val 有効終了年月日
     */
    public void setENDYMD(String val) {
        set(RepaVbjaMeu15ThsTntHr.ENDYMD, val);
    }

    /**
     * 有効開始年月日を取得する
     *
     * @return 有効開始年月日
     */
    public String getSTARTYMD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.STARTYMD);
    }

    /**
     * 有効開始年月日を設定する
     *
     * @param val 有効開始年月日
     */
    public void setSTARTYMD(String val) {
        set(RepaVbjaMeu15ThsTntHr.STARTYMD, val);
    }

    /**
     * 申請者コードを取得する
     *
     * @return 申請者コード
     */
    public String getSNSTNT() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SNSTNT);
    }

    /**
     * 申請者コードを設定する
     *
     * @param val 申請者コード
     */
    public void setSNSTNT(String val) {
        set(RepaVbjaMeu15ThsTntHr.SNSTNT, val);
    }

    /**
     * 組織コードを取得する
     *
     * @return 組織コード
     */
    public String getSIKCD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SIKCD);
    }

    /**
     * 組織コードを設定する
     *
     * @param val 組織コード
     */
    public void setSIKCD(String val) {
        set(RepaVbjaMeu15ThsTntHr.SIKCD, val);
    }

    /**
     * 支払先区分を取得する
     *
     * @return 支払先区分
     */
    public String getSHRKBN() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SHRKBN);
    }

    /**
     * 支払先区分を設定する
     *
     * @param val 支払先区分
     */
    public void setSHRKBN(String val) {
        set(RepaVbjaMeu15ThsTntHr.SHRKBN, val);
    }

    /**
     * 振込先区分を取得する
     *
     * @return 振込先区分
     */
    public String getFRKSKBN() {
        return (String) get(RepaVbjaMeu15ThsTntHr.FRKSKBN);
    }

    /**
     * 振込先区分を設定する
     *
     * @param val 振込先区分
     */
    public void setFRKSKBN(String val) {
        set(RepaVbjaMeu15ThsTntHr.FRKSKBN, val);
    }

    /**
     * 営業費支払先区分を取得する
     *
     * @return 営業費支払先区分
     */
    public String getEGHISHRSKBN() {
        return (String) get(RepaVbjaMeu15ThsTntHr.EGHISHRSKBN);
    }

    /**
     * 営業費支払先区分を設定する
     *
     * @param val 営業費支払先区分
     */
    public void setEGHISHRSKBN(String val) {
        set(RepaVbjaMeu15ThsTntHr.EGHISHRSKBN, val);
    }

    /**
     * 設定支払先区分を取得する
     *
     * @return 設定支払先区分
     */
    public String getSTYSHRSKBN() {
        return (String) get(RepaVbjaMeu15ThsTntHr.STYSHRSKBN);
    }

    /**
     * 設定支払先区分を設定する
     *
     * @param val 設定支払先区分
     */
    public void setSTYSHRSKBN(String val) {
        set(RepaVbjaMeu15ThsTntHr.STYSHRSKBN, val);
    }

    /**
     * 申請ＮＯを取得する
     *
     * @return 申請ＮＯ
     */
    public String getSINSEINO() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SINSEINO);
    }

    /**
     * 申請ＮＯを設定する
     *
     * @param val 申請ＮＯ
     */
    public void setSINSEINO(String val) {
        set(RepaVbjaMeu15ThsTntHr.SINSEINO, val);
    }

    /**
     * 営業所コードを取得する
     *
     * @return 営業所コード
     */
    public String getEGSYOCD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.EGSYOCD);
    }

    /**
     * 営業所コードを設定する
     *
     * @param val 営業所コード
     */
    public void setEGSYOCD(String val) {
        set(RepaVbjaMeu15ThsTntHr.EGSYOCD, val);
    }

    /**
     * 支払条件ＰＴＮＮＯを取得する
     *
     * @return 支払条件ＰＴＮＮＯ
     */
    public String getSHJYOKNPTNNO() {
        return (String) get(RepaVbjaMeu15ThsTntHr.SHJYOKNPTNNO);
    }

    /**
     * 支払条件ＰＴＮＮＯを設定する
     *
     * @param val 支払条件ＰＴＮＮＯ
     */
    public void setSHJYOKNPTNNO(String val) {
        set(RepaVbjaMeu15ThsTntHr.SHJYOKNPTNNO, val);
    }

    /**
     * 旧取引先コードを取得する
     *
     * @return 旧取引先コード
     */
    public String getKYUTRCD() {
        return (String) get(RepaVbjaMeu15ThsTntHr.KYUTRCD);
    }

    /**
     * 旧取引先コードを設定する
     *
     * @param val 旧取引先コード
     */
    public void setKYUTRCD(String val) {
        set(RepaVbjaMeu15ThsTntHr.KYUTRCD, val);
    }

    /**
     * 払担当予備を取得する
     *
     * @return 払担当予備
     */
    public String getHRTNTYOBI() {
        return (String) get(RepaVbjaMeu15ThsTntHr.HRTNTYOBI);
    }

    /**
     * 払担当予備を設定する
     *
     * @param val 払担当予備
     */
    public void setHRTNTYOBI(String val) {
        set(RepaVbjaMeu15ThsTntHr.HRTNTYOBI, val);
    }

}
