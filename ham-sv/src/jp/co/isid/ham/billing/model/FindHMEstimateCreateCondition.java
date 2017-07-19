package jp.co.isid.ham.billing.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * HM©ÏÄCR§ìïõð
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/08/31 HLC S.Fujimoto)<BR>
 * </P>
 * @author S.Fujimoto
 */
@XmlRootElement(namespace = "http://model.billing.ham.isid.co.jp/")
@XmlType(namespace = "http://model.billing.ham.isid.co.jp/")
public class FindHMEstimateCreateCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ©Ï¾×ÇNOXg */
    List<BigDecimal> _estSeqNoList;

    /**
     * ©Ï¾×ÇNOðæ¾·é
     * @return List<BigDecimal> ©Ï¾×ÇNOXg
     */
    public List<BigDecimal> getEstSeqNoList() {
        return _estSeqNoList;
    }

    /**
     * ©Ï¾×ÇNOXgðÝè·é
     * @param estDetailSeqNo List<BigDecimal> ©Ï¾×ÇNOXg
     */
    public void setEstSeqNoList(List<BigDecimal> val) {
        _estSeqNoList = val;
    }

}
