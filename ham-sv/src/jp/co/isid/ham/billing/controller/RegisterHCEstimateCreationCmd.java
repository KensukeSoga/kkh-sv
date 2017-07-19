package jp.co.isid.ham.billing.controller;

import jp.co.isid.ham.billing.model.HCEstimateCreationManager;
import jp.co.isid.ham.billing.model.RegisterHCEstimateCreationResult;
import jp.co.isid.ham.billing.model.RegisterHCEstimateCreationVO;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HC©Ïì¬o^R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/3/1 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class RegisterHCEstimateCreationCmd extends Command {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    private RegisterHCEstimateCreationVO _vo;

    /**
     * HC©Ïì¬o^Às
     */
    @Override
    public void execute() throws UserException {
        HCEstimateCreationManager manager = HCEstimateCreationManager.getInstance();
        RegisterHCEstimateCreationResult result = manager.registerHCEstimateCreation(_vo);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * o^f[^ðÝèµÜ·
     *
     * @param vo o^f[^
     */
    public void setRegisterHCEstimateCreationVO(RegisterHCEstimateCreationVO vo) {
        _vo = vo;
    }

    /**
     * o^Êðæ¾µÜ·
     *
     * @return o^Ê
     */
    public RegisterHCEstimateCreationResult getRegisterHCEstimateCreationResult() {
        return (RegisterHCEstimateCreationResult) super.getResult().get(RESULT_KEY);
    }

}
