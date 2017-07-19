package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.FindChangeNoticeCondition;
import jp.co.isid.ham.production.model.FindChangeNoticeResult;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * CR§ìï@ÏXÊmf[^æ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/06/24)<BR>
 * </P>
 * @author
 */
public class FindChangeNoticeDataCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindChangeNoticeCondition _condition;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void execute() throws UserException {

        FindChangeNoticeResult result = new FindChangeNoticeResult();
        CostManager manager = CostManager.getInstance();
        result = manager.findFindChangeNoticeData(_condition);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition FindChangeNoticeCondition õð
     */
    public void setFindChangeNoticeCondition(FindChangeNoticeCondition condition) {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return FindChangeNoticeResult Ê
     */
    public FindChangeNoticeResult  getFindChangeNoticeResult() {
        return (FindChangeNoticeResult) super.getResult().get(RESULT_KEY);
    }

}
