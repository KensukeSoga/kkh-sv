package jp.co.isid.ham.media.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;

public class FindAccountBookSortNoCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** }ÌÇNo */
    private BigDecimal _mediaplanno;


    /**
     * @return }ÌÇNo
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getMEDIAPLANNO() {
        return _mediaplanno;
    }
    /**
     * @param }ÌÇNo
     */
    public void setMEDIAPLANNO(BigDecimal mediaplanno) {
        this._mediaplanno = mediaplanno;
    }
}
