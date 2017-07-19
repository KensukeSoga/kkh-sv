package jp.co.isid.ham.billing.model;

import java.util.List;

import jp.co.isid.ham.common.model.Tbj11CrCreateDataVO;
import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * CR§ìïÇ(§ìïÝèp)Ê
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/1/31 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class FindCrCreateDataForCmsResult extends AbstractServiceResult {

    /** CR§ìïÇ */
    private List<Tbj11CrCreateDataVO> _crCreateDataList;

    /**
     * CR§ìïÇðæ¾·é
     *
     * @return CR§ìïÇ
     */
    public List<Tbj11CrCreateDataVO> getCrCreateData() {
        return _crCreateDataList;
    }

    /**
     * CR§ìïÇðÝè·é
     *
     * @param crCreateDataList CR§ìïÇ
     */
    public void setCrCreateData(List<Tbj11CrCreateDataVO> crCreateDataList) {
        _crCreateDataList = crCreateDataList;
    }
}
