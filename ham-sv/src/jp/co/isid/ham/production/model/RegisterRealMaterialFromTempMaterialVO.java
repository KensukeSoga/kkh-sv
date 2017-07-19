package jp.co.isid.ham.production.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.common.model.Tbj36TempSozaiKanriDataVO;
import jp.co.isid.ham.common.model.Tbj40TempSozaiContentVO;

/**
 * <P>
 * fÞo^
 * ¼fÞÌ{fÞo^ÀsVO
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/11/10 HLC S.Fujimoto)<BR>
 * </P>
 * @author S.Fujimoto
 */
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class RegisterRealMaterialFromTempMaterialVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ¼fÞo^XVpVO */
    private List<Tbj36TempSozaiKanriDataVO> _tbj36UpdVo = null;
    /** Recì¬pVO */
    private List<Tbj40TempSozaiContentVO> _tbj40Vo = null;

    /**
     * ¼fÞo^XVpVOðæ¾·é
     * @return List<Tbj36TempSozaiKanriDataVO> ¼fÞo^XVpVO
     */
    public List<Tbj36TempSozaiKanriDataVO> getTbj36UpdVo() {
        return _tbj36UpdVo;
    }

    /**
     * ¼fÞo^XVpVOðÝè·é
     * @param vo List<Tbj36TempSozaiKanriDataVO> ¼fÞo^XVpVO
     */
    public void setTbj36UpdVo(List<Tbj36TempSozaiKanriDataVO> vo) {
        _tbj36UpdVo = vo;
    }

    /**
     * Recì¬pVOðæ¾·é
     * @return List<Tbj17ContentVO> Recì¬pVO
     */
    public List<Tbj40TempSozaiContentVO> getTbj40Vo() {
        return _tbj40Vo;
    }

    /**
     * Recì¬pVOðÝè·é
     * @param vo List<Tbj17ContentVO> Recì¬pVO
     */
    public void setTbj40Vo(List<Tbj40TempSozaiContentVO> vo) {
        _tbj40Vo = vo;
    }

}