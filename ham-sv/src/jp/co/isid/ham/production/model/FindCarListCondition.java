package jp.co.isid.ham.production.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * 権限付き車種マスタ取得条件クラス
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2013/03/27 T.Hadate)<BR>
 * </P>
 *
 * @author Takahiro Hadate
 */
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class FindCarListCondition implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1626802308467753490L;

    /** 担当者ID */
    private String _hamid = null;

    /** 種別 */
    private String _secType = null;

    /**
     * 担当者IDを取得する.
     * @return 担当者ID
     */
    @XmlElement(required = true)
    public String get_hamid() {
        return _hamid;
    }

    /**
     * 担当者IDを設定する.
     * @param hamid 担当者ID
     */
    public void set_hamid(String hamid) {
        this._hamid = hamid;
    }

    /**
     * 種別を取得する.
     * @return 種別
     */
    @XmlElement(required = true)
    public String get_secType() {
        return _secType;
    }

    /**
     * 種別を設定する.
     * @param secType 種別
     */
    public void set_secType(String secType) {
        this._secType = secType;
    }


}
