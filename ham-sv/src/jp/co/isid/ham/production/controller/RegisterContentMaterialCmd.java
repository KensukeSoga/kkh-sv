package jp.co.isid.ham.production.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;
import jp.co.isid.ham.production.model.RegisterMaterialVO;
import jp.co.isid.ham.production.model.MaterialRegisterManager;
import jp.co.isid.ham.production.model.MaterialRegisterResult;

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
public class RegisterContentMaterialCmd extends Command {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    private RegisterMaterialVO _vo = null;

    @Override
    public void execute() throws UserException {
        MaterialRegisterResult result = new MaterialRegisterResult();
        result = MaterialRegisterManager.getInstance().executeContentMaterialInfo(_vo);

        super.getResult().set(RESULT_KEY, result);
    }

    /**
     * fÞo^pVOðÝèµÜ·
     * @param vo
     */
    public void setRegisterContentMaterialVO(RegisterMaterialVO vo) {
        _vo = vo;
    }

    /**
     * fÞo^ÊNXðæ¾µÜ·
     * @return
     */
    public MaterialRegisterResult getMaterialRegisterResult() {
        return (MaterialRegisterResult) super.getResult().get(RESULT_KEY);
    }

}
