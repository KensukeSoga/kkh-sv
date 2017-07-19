package jp.co.isid.ham.production.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * _ñîño^æÊí{^ºf[^æ¾ÌðNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/14 VHAM`[)<BR>
 * </P>
 * @author VHAM`[
 */
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class ContractDeleteCondition implements Serializable {
    /**
    *
    */
   private static final long serialVersionUID = 1L;

    /** _ñíÞ*/
   private String strCtrtKbn;
    /** _ñR[h*/
   private String strCtrtNo;

    /**
     * _ñíÞðæ¾·é
     *
     * @return _ñíÞ
     */
    public String getStrCtrtKbn() {
        return strCtrtKbn;
    }

    /**
     * _ñíÞðÝè·é
     *
     * @param strCtrtKbn _ñíÞ
     */
    public void setStrCtrtKbn(String strCtrtKbn) {
        this.strCtrtKbn = strCtrtKbn;
    }

    /**
     * _ñR[hðæ¾·é
     *
     * @return _ñR[h
     */
    public String getStrCtrtNo() {
        return strCtrtNo;
    }

    /**
     * _ñR[hðÝè·é
     *
     * @param strCtrtNo _ñR[h
     */
    public void setStrCtrtNo(String strCtrtNo) {
        this.strCtrtNo = strCtrtNo;
    }
}
