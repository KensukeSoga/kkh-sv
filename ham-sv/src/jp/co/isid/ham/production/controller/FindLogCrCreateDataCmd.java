package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.FindLogCrCreateDataCondition;
import jp.co.isid.ham.production.model.FindLogCrCreateDataResult;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * CR§ìï@XVðÀsÌf[^æ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/06)<BR>
 * </P>
 * @author
 */
public class FindLogCrCreateDataCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindLogCrCreateDataCondition _condition;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void execute() throws UserException {

        FindLogCrCreateDataResult result = new FindLogCrCreateDataResult();
        CostManager manager = CostManager.getInstance();
        result = manager.findLogCrCreateData(_condition);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition FindLogCrCreateDataCondition õð
     */
    public void setFindLogCrCreateDataCondition(FindLogCrCreateDataCondition condition) {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return FindLogCrCreateDataResult Ê
     */
    public FindLogCrCreateDataResult  getFindLogCrCreateDataResult() {
        return (FindLogCrCreateDataResult) super.getResult().get(RESULT_KEY);
    }

}
