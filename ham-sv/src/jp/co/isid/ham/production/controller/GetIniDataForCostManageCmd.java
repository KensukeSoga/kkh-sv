package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.GetIniDataForCostManageCondition;
import jp.co.isid.ham.production.model.GetIniDataForCostManageResult;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;
/**
 * <P>
 * CR§ìï@N®f[^æ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/03)<BR>
 * </P>
 * @author
 */
public class GetIniDataForCostManageCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private GetIniDataForCostManageCondition _condition;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute() throws UserException {

		GetIniDataForCostManageResult result = new GetIniDataForCostManageResult();
		CostManager manager = CostManager.getInstance();
		result = manager.getIniDataForCostManage(_condition);

        getResult().set(RESULT_KEY, result);
	}

    /**
     * õððÝèµÜ·
     *
     * @param condition GetIniDataForCostManageCondition õð
     */
	public void setGetIniDataForCostManageCondition(GetIniDataForCostManageCondition condition) {
        _condition = condition;
	}

    /**
     * ÊðÔµÜ·
     *
     * @return GetIniDataForCostManageResult Ê
     */
	public GetIniDataForCostManageResult  getGetIniDataForCostManageResult() {
        return (GetIniDataForCostManageResult) super.getResult().get(RESULT_KEY);
	}

}
