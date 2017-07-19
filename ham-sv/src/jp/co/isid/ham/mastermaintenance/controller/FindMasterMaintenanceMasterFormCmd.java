package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.ham.common.model.FunctionControlInfoManager;
import jp.co.isid.ham.common.model.FunctionControlInfoResult;
import jp.co.isid.ham.common.model.SecurityInfoManager;
import jp.co.isid.ham.common.model.SecurityInfoResult;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceMasterFormDispCondition;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceMasterFormDispResult;
import jp.co.isid.ham.mastermaintenance.model.FindMasterMaintenanceMasterFormVO;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * MasterForm\¦ξρζΎR}h
 * </P>
 * <P>
 * <B>C³π</B><BR>
 * EVKμ¬(2012/12/04 X)<BR>
 * </P>
 * @author X
 */
public class FindMasterMaintenanceMasterFormCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** υΚL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** υπ */
    private FindMasterMaintenanceMasterFormDispCondition _condition;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException
    {
        FunctionControlInfoManager managerFunctionControlInfo = FunctionControlInfoManager.getInstance();

        SecurityInfoManager managerSecurityInfo = SecurityInfoManager.getInstance();

        FindMasterMaintenanceMasterFormDispResult result = new FindMasterMaintenanceMasterFormDispResult();

        FindMasterMaintenanceMasterFormVO masterFormVO = new FindMasterMaintenanceMasterFormVO();

        FunctionControlInfoResult functionControlInfoResult = managerFunctionControlInfo.getFunctionControlInfo(_condition.getConditionFunctionControlInfo());

        SecurityInfoResult securityInfoResult = managerSecurityInfo.getSecurityInfo(_condition.getConditionSecurityInfo());

        masterFormVO.setFindFunctionControlInfoList(functionControlInfoResult.getFunctionControlInfo());

        masterFormVO.setFindSecurityInfoList(securityInfoResult.getSecurityInfo());

        result.setMasterFormVO(masterFormVO);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * υππέθ΅ά·
     *
     * @param condition υπ
     */
    public void setFindCondition(FindMasterMaintenanceMasterFormDispCondition condition)
    {
        _condition = condition;
    }

    /**
     * ΚπΤ΅ά·
     *
     * @return Κ
     */
    public FindMasterMaintenanceMasterFormDispResult getFindResult()
    {
        return (FindMasterMaintenanceMasterFormDispResult) super.getResult().get(RESULT_KEY);
    }

}
