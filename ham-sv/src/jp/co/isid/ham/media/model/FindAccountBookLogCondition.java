package jp.co.isid.ham.media.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * cÆìÆä ÏXOõð
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/11/29 VHAM`[)<BR>
 * </P>
 * @author VHAM`[
 */
@XmlRootElement(namespace = "http://model.media.ham.isid.co.jp/")
@XmlType(namespace = "http://model.media.ham.isid.co.jp/")
public class FindAccountBookLogCondition implements Serializable{

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ä No */
    private String _daichono = null;

    /**
     * ä Noðæ¾·é
     *
     * @return ä No
     */
    public String getDaichono() {
        return _daichono;
    }

    /**
     * ä NoðÝè·é
     *
     * @param daichono ä No
     */
    public void setDaichono(String daichono) {
        this._daichono = daichono;
    }

}
