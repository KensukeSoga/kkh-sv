package jp.co.isid.ham.billing.controller;

import jp.co.isid.ham.billing.model.FindHCEstimateListCondition;
import jp.co.isid.ham.billing.model.FindHCEstimateListResult;
import jp.co.isid.ham.billing.model.HCEstimateListManager;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HC©ÏêõR}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/2/4 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class FindHCEstimateListCmd extends Command {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    FindHCEstimateListCondition _cond;

    /**
     * HC©Ïêõ
     */
    @Override
    public void execute() throws UserException {
        HCEstimateListManager manager = HCEstimateListManager.getInstance();
        FindHCEstimateListResult result = manager.findHCEstimateList(_cond);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param cond õð
     */
    public void setFindHCEstimateListCondition(FindHCEstimateListCondition cond) {
        _cond = cond;
    }

    /**
     * õÊðÔµÜ·
     *
     * @return õÊ
     */
    public FindHCEstimateListResult getFindHCEstimateListResult() {
        return (FindHCEstimateListResult)super.getResult().get(RESULT_KEY);
    }
}
