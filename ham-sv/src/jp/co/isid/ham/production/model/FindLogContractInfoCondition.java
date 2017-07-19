package jp.co.isid.ham.production.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * _ñîño^@õÀsÌf[^æ¾ðNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/02/15 VHAM`[)<BR>
 * </P>
 *
 * @author VHAM`[
 */
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class FindLogContractInfoCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** SÒID */
    private String _hamid = null;

    /** ðL[ */
    private BigDecimal _historykey = null;

    /**
     * SÒIDðæ¾·é
     *
     * @return SÒID
     */
    public String getHamid() {
        return _hamid;
    }

    /**
     * SÒIDðÝè·é
     *
     * @param hamid SÒID
     */
    public void setHamid(String hamid) {
        this._hamid = hamid;
    }

    /**
     * ðL[ðæ¾·é
     *
     * @return ðL[
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getHistorykey() {
        return _historykey;
    }

    /**
     * ðL[ðÝè·é
     *
     * @param historykey ðL[
     */
    public void setHistorykey(BigDecimal historykey) {
        this._historykey = historykey;
    }
}
