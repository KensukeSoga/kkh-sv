package jp.co.isid.ham.billing.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * HC©Ïì¬o^Ê
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/3/1 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class RegisterHCEstimateCreationResult extends AbstractServiceResult {

    /** ©ÏÄNO */
    private BigDecimal _estSeqNo;


    /**
     * ©ÏÄNOðæ¾·é
     *
     * @return ©ÏÄNO
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getEstSeqNo() {
        return _estSeqNo;
    }

    /**
     * ©ÏÄNOðÝè·é
     *
     * @param estSeqNo ©ÏÄNO
     */
    public void setEstSeqNo(BigDecimal estSeqNo) {
        _estSeqNo = estSeqNo;
    }

}
