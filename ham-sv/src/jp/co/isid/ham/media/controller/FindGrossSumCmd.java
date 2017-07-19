package jp.co.isid.ham.media.controller;

import jp.co.isid.ham.common.model.Tbj02EigyoDaichoCondition;
import jp.co.isid.ham.media.model.FindGrossSumManager;
import jp.co.isid.ham.media.model.FindGrossSumResult;
import jp.co.isid.ham.model.base.HAMException;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * ExcelæÝG[æÊõR}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/02/05 HLC H.Watabe)<BR>
 * </P>
 * @author HLC H.Watabe
 */
public class FindGrossSumCmd extends Command {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** õÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** õð */
    private Tbj02EigyoDaichoCondition _condition;

    /**
     * õðÅõðÀ{
     */
    @Override
    public void execute() throws HAMException {
        FindGrossSumManager manager = FindGrossSumManager.getInstance();
        FindGrossSumResult result = manager.findGrossSum(_condition);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * õððÝèµÜ·
     *
     * @param condition õð
     */
    public void setTbj02EigyoDaichoCondition(Tbj02EigyoDaichoCondition condition) {
        _condition = condition;
    }

    /**
     * õÊðÔµÜ·
     *
     * @return FindGrossSumResult ðõÊ
     */
    public FindGrossSumResult getFindGrossSumResult() {
        return (FindGrossSumResult) super.getResult().get(RESULT_KEY);
    }


}
