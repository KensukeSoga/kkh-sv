package jp.co.isid.ham.common.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * ËæVO
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/08/02 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class FindContactRequestVO extends AbstractModel {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * ftHgRXgN^
     */
    public FindContactRequestVO() {
    }

    /**
     * VKCX^Xð¶¬·é
     *
     * @return VKCX^X
     */
    public Object newInstance()
    {
        return new FindContactRequestVO();
    }

    /**
     * ËæR[hæ¾
     *
     * @return ËæR[h
     */
    public String getIRAISAKICODE() {
        return (String) get("IRAISAKICODE");
    }

    /**
     * ËæR[hÝè
     *
     * @param val ËæR[h
     */
    public void setIRAISAKICODE(String val) {
        set("IRAISAKICODE", val);
    }

    /**
     * Ëæ¼æ¾
     *
     * @return Ëæ¼
     */
    public String getIRAISAKINAME() {
        return (String) get("IRAISAKINAME");
    }

    /**
     * Ëæ¼Ýè
     *
     * @param val Ëæ¼
     */
    public void setIRAISAKINAME(String val) {
        set("IRAISAKINAME", val);
    }

    public String getDSIKKBNCD() {
        return (String) get("DSIKKBNCD");
    }

    public void setDSIKKBNCD(String val) {
        set("IRAISAKINAME", val);
    }

    public String getIRSKSHOWNO() {
        return (String) get("IRSKSHOWNO");
    }

    public void setIRSKSHOWNO(String val) {
        set("IRSKSHOWNO", val);
    }
}
