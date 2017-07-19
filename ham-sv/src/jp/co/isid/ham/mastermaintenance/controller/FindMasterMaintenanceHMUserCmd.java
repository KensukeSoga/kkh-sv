package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceHMUserDispCondition;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceHMUserDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HMSÒ\¦îñæ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/08/31 HLC S.Fujimoto)<BR>
 * </P>
 * @author S.Fujimoto
 */
public class FindMasterMaintenanceHMUserCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindMasterMaintenanceHMUserDispCondition _condition;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {

        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        FindMasterMaintenanceHMUserDispResult result = new FindMasterMaintenanceHMUserDispResult();
        result.setHMUserVO( manager.getMasterMaintenanceHMUser(_condition.getConditionHMUser()));
        result.setCodeVO(manager.getMasterMaintenanceCode(_condition.getConditionCode()));
        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition õð
     */
    public void setFindCondition(FindMasterMaintenanceHMUserDispCondition condition) {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return Ê
     */
    public FindMasterMaintenanceHMUserDispResult getFindResult() {
        return (FindMasterMaintenanceHMUserDispResult) super.getResult().get(RESULT_KEY);
    }

}
