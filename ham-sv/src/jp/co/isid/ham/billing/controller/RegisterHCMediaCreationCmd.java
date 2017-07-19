package jp.co.isid.ham.billing.controller;

import jp.co.isid.ham.billing.model.HCMediaCreationManager;
import jp.co.isid.ham.billing.model.RegisterHCMediaCreationResult;
import jp.co.isid.ham.billing.model.RegisterHCMediaCreationVO;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HC}Ìïì¬o^R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/3/1 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class RegisterHCMediaCreationCmd extends Command {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    private RegisterHCMediaCreationVO _vo;

    /**
     * HC}Ìïì¬o^Às
     */
    @Override
    public void execute() throws UserException {
        HCMediaCreationManager manager = HCMediaCreationManager.getInstance();
        RegisterHCMediaCreationResult result = manager.registerHCMediaCreation(_vo);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * o^f[^ðÝèµÜ·
     *
     * @param vo o^f[^
     */
    public void setRegisterHCMediaCreationVO(RegisterHCMediaCreationVO vo) {
        _vo = vo;
    }

    /**
     * o^Êðæ¾µÜ·
     *
     * @return o^Ê
     */
    public RegisterHCMediaCreationResult getRegisterHCMediaCreationResult() {
        return (RegisterHCMediaCreationResult) super.getResult().get(RESULT_KEY);
    }
}
