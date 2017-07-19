package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.MoveCrCreateDataResult;
import jp.co.isid.ham.production.model.MoveCrCreateDataVO;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;
/**
 * <P>
 * CR§ìï\f[^Ú®^Rs[@o^ÀsÌR}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/06)<BR>
 * </P>
 * @author
 */
public class MoveCrCreateDataCmd extends Command {


    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private MoveCrCreateDataVO _vo;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute() throws UserException {

	    MoveCrCreateDataResult result = new MoveCrCreateDataResult();
		CostManager manager = CostManager.getInstance();
		result = manager.MoveCrCreateData(_vo);

        getResult().set(RESULT_KEY, result);
	}

    /**
     * õððÝèµÜ·
     *
     * @param condition MoveCrCreateDataCondition õð
     */
	public void setMoveCrCreateDataCondition(MoveCrCreateDataVO condition) {
        _vo = condition;
	}

    /**
     * ÊðÔµÜ·
     *
     * @return MoveCrCreateDataResult Ê
     */
	public MoveCrCreateDataResult  getMoveCrCreateDataResult() {
        return (MoveCrCreateDataResult) super.getResult().get(RESULT_KEY);
	}

}
