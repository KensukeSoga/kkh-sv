package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.RegisterCrCreateDataResult;
import jp.co.isid.ham.production.model.RegisterCrCreateDataVO;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * CR§ìï@o^ÀsÌR}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/06)<BR>
 * </P>
 * @author
 */
public class RegisterCrCreateDataCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private RegisterCrCreateDataVO _vo;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void execute() throws UserException {

        RegisterCrCreateDataResult result = new RegisterCrCreateDataResult();
        CostManager manager = CostManager.getInstance();
        result = manager.registerCrCreateData(_vo);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition RegisterCrCreateDataVO
     */
    public void setRegisterCrCreateDataVO(RegisterCrCreateDataVO vo) {
        _vo = vo;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return RegisterCrCreateDataResult Ê
     */
    public RegisterCrCreateDataResult  getRegisterCrCreateDataResult() {
        return (RegisterCrCreateDataResult) super.getResult().get(RESULT_KEY);
    }

}
