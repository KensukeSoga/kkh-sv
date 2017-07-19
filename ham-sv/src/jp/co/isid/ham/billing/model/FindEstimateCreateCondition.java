package jp.co.isid.ham.billing.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * ©ÏÄCR§ìïõð
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/2/14 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
@XmlRootElement(namespace = "http://model.billing.ham.isid.co.jp/")
@XmlType(namespace = "http://model.billing.ham.isid.co.jp/")
public class FindEstimateCreateCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ©Ï¾×ÇNO */
    List<BigDecimal> _estDetailSeqNo;

    /**
     * ©Ï¾×ÇNOðæ¾·é
     *
     * @return ©Ï¾×ÇNO
     */
    public List<BigDecimal> getEstDetailSeqNo() {
        return _estDetailSeqNo;
    }

    /**
     * ©Ï¾×ÇNOðÝè·é
     *
     * @param estDetailSeqNo ©Ï¾×ÇNO
     */
    public void setEstDetailSeqNo(List<BigDecimal> estDetailSeqNo) {
        _estDetailSeqNo = estDetailSeqNo;
    }

}
