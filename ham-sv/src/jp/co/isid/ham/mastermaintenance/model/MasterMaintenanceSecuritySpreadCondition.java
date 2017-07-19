package jp.co.isid.ham.mastermaintenance.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * セキュリティスプレッドCondition
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2013/02/19 森)<BR>
 * </P>
 * @author 森
 */
@XmlRootElement(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
@XmlType(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
public class MasterMaintenanceSecuritySpreadCondition implements Serializable
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 担当者ID */
    private String _HAMID = null;

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

}
