package jp.co.isid.ham.mastermaintenance.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * 個人情報View含む検索Condition
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2013/02/07 森)<BR>
 * </P>
 * @author 森
 */
@XmlRootElement(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
@XmlType(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
public class MasterMaintenanceAccUserLikeCondition implements Serializable
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 担当者ID */
    private String _HAMID = null;

    /** 担当者名 */
    private String _CN = null;

    /** 所属組織名 */
    private String _SOSHIKI = null;

    /**
     * 担当者IDを取得する
     *
     * @return 担当者ID
     */
    public String getHAMID()
    {
        return _HAMID;
    }

    /**
     * 担当者IDを設定する
     *
     * @param val 担当者ID
     */
    public void setHAMID(String val)
    {
        _HAMID = val;
    }

    /**
     * 担当者名を取得する
     *
     * @return 担当者名
     */
    public String getCN()
    {
        return _CN;
    }

    /**
     * 担当者名を設定する
     *
     * @param val 担当者名
     */
    public void setCN(String val)
    {
        _CN = val;
    }

    /**
     * 所属組織名を取得する
     *
     * @return 所属組織名
     */
    public String getSOSHIKI()
    {
        return _SOSHIKI;
    }

    /**
     * 所属組織名を設定する
     *
     * @param val 所属組織名
     */
    public void setSOSHIKI(String val)
    {
        _SOSHIKI = val;
    }

}
