package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceAccUserVO;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceAccUserDispLikeCondition;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceAccUserDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * ÂlîñView\¦îñæ¾R}hiÜÞõj
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/02/08 X)<BR>
 * </P>
 * @author X
 */
public class FindMasterMaintenanceAccUserLikeCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindMasterMaintenanceAccUserDispLikeCondition _condition;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException
    {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();

        FindMasterMaintenanceAccUserDispResult result = new FindMasterMaintenanceAccUserDispResult();

        FindMasterMaintenanceAccUserVO accUserVO = manager.getMasterMaintenanceAccUserLike(_condition.getLikeConditionAccUser());

        result.setAccUserVO(accUserVO);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition õð
     */
    public void setFindCondition(FindMasterMaintenanceAccUserDispLikeCondition condition)
    {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return Ê
     */
    public FindMasterMaintenanceAccUserDispResult getFindResult()
    {
        return (FindMasterMaintenanceAccUserDispResult) super.getResult().get(RESULT_KEY);
    }

}
