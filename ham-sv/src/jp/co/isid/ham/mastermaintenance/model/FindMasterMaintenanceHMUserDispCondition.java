package jp.co.isid.ham.mastermaintenance.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.common.model.Mbj12CodeCondition;
import jp.co.isid.ham.common.model.Mbj48HmUserCondition;

/**
 * <P>
 * HMSÒ\¦îñCondition
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/08/31 HLC S.Fujimoto)<BR>
 * </P>
 * @author S.Fujimoto
 */
@XmlRootElement(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
@XmlType(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
public class FindMasterMaintenanceHMUserDispCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** HMSÒ}X^õð */
    private Mbj48HmUserCondition _conditionHMUser;
    /** R[h}X^õð */
    private Mbj12CodeCondition _conditionCode;

    /**
     * HMSÒ}X^õððÝè·é
     * @param cond Mbj48HmUserCondition HMSÒ}X^õð
     */
    public void setConditionHMUser(Mbj48HmUserCondition cond) {
        _conditionHMUser = cond;
    }

    /**
     * HMSÒ}X^õððæ¾·é
     * @return Mbj48HmUserCondition HMSÒ}X^õð
     */
    public Mbj48HmUserCondition getConditionHMUser() {
        return _conditionHMUser;
    }

    /**
     * R[h}X^õððæ¾·é
     * @param cond Mbj12CodeCondition R[h}X^õð
     */
    public void setConditionCode(Mbj12CodeCondition cond) {
        _conditionCode = cond;
    }

    /**
     * R[h}X^õððÝè·é
     * @return Mbj12CodeCondition R[h}X^õð
     */
    public Mbj12CodeCondition getConditionCode() {
        return _conditionCode;
    }

}
