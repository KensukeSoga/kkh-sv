package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.FindCrCreateDataCondition;
import jp.co.isid.ham.production.model.FindCrCreateDataResult;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * CR§ìï@õÀsÌf[^æ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/06)<BR>
 * </P>
 * @author
 */
public class FindCrCreateDataCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindCrCreateDataCondition _condition;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void execute() throws UserException {

        FindCrCreateDataResult result = new FindCrCreateDataResult();
        CostManager manager = CostManager.getInstance();
        result = manager.findCrCreateData(_condition);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition FindCrCreateDataCondition õð
     */
    public void setFindCrCreateDataCondition(FindCrCreateDataCondition condition) {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return FindCrCreateDataResult Ê
     */
    public FindCrCreateDataResult  getFindCrCreateDataResult() {
        return (FindCrCreateDataResult) super.getResult().get(RESULT_KEY);
    }

}
