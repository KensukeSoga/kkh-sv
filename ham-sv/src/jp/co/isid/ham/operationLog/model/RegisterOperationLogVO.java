package jp.co.isid.ham.operationLog.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.common.model.Tbj28WorkLogVO;

/**
 * <P>
 * Ò­O@o^ÀsÌo^f[^ÛNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/06/06 VHAM`[)<BR>
 * </P>
 *
 * @author VHAM`[
 */
@XmlRootElement(namespace = "http://model.operationLog.ham.isid.co.jp/")
@XmlType(namespace = "http://model.operationLog.ham.isid.co.jp/")
public class RegisterOperationLogVO implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /** Ò­OVO */
    private Tbj28WorkLogVO _workLogVo = null;

    /**
     * Ò­OVOðæ¾·é
     *
     * @return Ò­OVO
     */
    public Tbj28WorkLogVO getWorkLogVo() {
        return _workLogVo;
    }

    /**
     * Ò­OVOðÝè·é
     * @param workLogVo Ò­OVO
     */
    public void setWorkLogVo(Tbj28WorkLogVO workLogVo) {
        this._workLogVo = workLogVo;
    }



}
