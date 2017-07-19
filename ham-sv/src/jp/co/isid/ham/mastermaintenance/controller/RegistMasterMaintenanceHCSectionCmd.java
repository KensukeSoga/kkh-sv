package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceHCSectionDispVO;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HCå\¦îño^R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/13 X)<BR>
 * </P>
 * @author X
 */
public class RegistMasterMaintenanceHCSectionCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** o^f[^ */
    private RegistMasterMaintenanceHCSectionDispVO _vo;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        RegistMasterMaintenanceDispResult result = new RegistMasterMaintenanceDispResult();
        manager.registMasterMaintenanceHCSection(_vo.getHCSectionVO());
        manager.registMasterMaintenanceMediaProduct(_vo.getMediaProductVO());
        getResult().set(RESULT_KEY, result);
    }

    /**
     * o^f[^ðÝèµÜ·
     *
     * @param vo o^f[^
     */
    public void setRegistVO(RegistMasterMaintenanceHCSectionDispVO vo) {
        _vo = vo;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return Ê
     */
    public RegistMasterMaintenanceDispResult getRegistResult() {
        return (RegistMasterMaintenanceDispResult) super.getResult().get(RESULT_KEY);
    }

}
