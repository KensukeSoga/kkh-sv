package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.ConfirmCrCreateDataResult;
import jp.co.isid.ham.production.model.ConfirmCrCreateDataVO;
import jp.co.isid.ham.production.model.CostManager;
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
public class ConfirmCrCreateDataCmd extends Command {

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private ConfirmCrCreateDataVO _vo;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void execute() throws UserException {

        ConfirmCrCreateDataResult result = new ConfirmCrCreateDataResult();
        CostManager manager = CostManager.getInstance();
        result = manager.ConfirmCrCreateData(_vo);

        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition ConfirmCrCreateDataVO
     */
    public void setConfirmCrCreateDataVO(ConfirmCrCreateDataVO vo) {
        _vo = vo;
    }

    /**
     * ÊðÔµÜ·
     *
     * @return ConfirmCrCreateDataResult Ê
     */
    public ConfirmCrCreateDataResult  getConfirmCrCreateDataResult() {
        return (ConfirmCrCreateDataResult) super.getResult().get(RESULT_KEY);
    }

}
