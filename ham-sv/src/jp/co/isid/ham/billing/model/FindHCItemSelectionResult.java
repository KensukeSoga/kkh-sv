package jp.co.isid.ham.billing.model;

import java.util.List;

import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * HC¤iIðõÊ
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/2/26 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class FindHCItemSelectionResult extends AbstractServiceResult {

    /** HC¤iIð */
    List<FindHCItemSelectionVO> _hcItemSelection;


    /**
     * HC¤iIððæ¾·é
     *
     * @return HC¤iIð
     */
    public List<FindHCItemSelectionVO> getHCItemSelection() {
        return _hcItemSelection;
    }

    /**
     * HC¤iIððÝè·é
     *
     * @param hcItemSelection HC¤iIð
     */
    public void setHCItemSelection(List<FindHCItemSelectionVO> hcItemSelection) {
        _hcItemSelection = hcItemSelection;
    }

}
