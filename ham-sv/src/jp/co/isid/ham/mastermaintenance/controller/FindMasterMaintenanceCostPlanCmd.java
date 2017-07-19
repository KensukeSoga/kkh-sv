package jp.co.isid.ham.mastermaintenance.controller;

import java.util.ArrayList;
import java.util.List;

import jp.co.isid.ham.common.model.Mbj12CodeVO;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceCostPlanDispCondition;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceCostPlanDispResult;
import jp.co.isid.ham.mastermaintenance.model.FindMbj12CodeVO;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * ïpéæNo\¦îñæ¾R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/12 X)<BR>
 * E¿Æ±ÏXÎ(2015/08/31 HLC S,Fujimoto)<BR>
 * </P>
 * @author X
 */
public class FindMasterMaintenanceCostPlanCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private FindMasterMaintenanceCostPlanDispCondition _condition;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException
    {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        FindMasterMaintenanceCostPlanDispResult result = new FindMasterMaintenanceCostPlanDispResult();

        //ïpéæNo}X^
        result.setCostPlanVO(manager.getMasterMaintenanceCostPlan(_condition.getConditionCostPlan()));
        //Ôí}X^
        result.setCarVO(manager.getMasterMaintenanceCar(_condition.getConditionCar()));
        //}Ì}X^
        result.setMediaVO(manager.getMasterMaintenanceMedia(_condition.getConditionMedia()));

        /* 2015/08/31 ¿Æ±ÏXÎ HLC S.Fujimoto ADD Start */
        //}Ì}X^(§ì)
        result.setMediaProduction(manager.getMasterMaintenanceMediaProduction(_condition.getConditionMediaProduction()));
        //HMSÒ}X^
        result.setHmUserVO(manager.getMasterMaintenanceHMUser(_condition.getConditionHmUser()));
        /* 2015/08/31 ¿Æ±ÏXÎ HLC S.Fujimoto ADD End */

        //R[h}X^
        FindMbj12CodeVO codeVo = new FindMbj12CodeVO();
        List<Mbj12CodeVO> workList = new ArrayList<Mbj12CodeVO>();
        for (int i = 0 ; (_condition.getConditionListCode() != null) && (i < _condition.getConditionListCode().size()) ; i++)
        {
            FindMbj12CodeVO workCodeVO = manager.getMasterMaintenanceCode(_condition.getConditionListCode().get(i));

            workList.addAll(workCodeVO.getFindList());
        }
        codeVo.setFindList(workList);
        result.setCodeVO(codeVo);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition õð
     */
    public void setFindCondition(FindMasterMaintenanceCostPlanDispCondition condition)
    {
        _condition = condition;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return Ê
     */
    public FindMasterMaintenanceCostPlanDispResult getFindResult()
    {
        return (FindMasterMaintenanceCostPlanDispResult) super.getResult().get(RESULT_KEY);
    }
}
