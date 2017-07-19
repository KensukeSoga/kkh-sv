package jp.co.isid.ham.media.controller;

import java.math.BigDecimal;

import jp.co.isid.ham.media.model.RegisterRdProgramInfoManager;
import jp.co.isid.ham.media.model.RegisterRdProgramInfoResult;
import jp.co.isid.ham.media.model.RegisterRdProgramInfoVO;
import jp.co.isid.ham.model.base.HAMException;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * WIÔgo^æÊo^R}h
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/10/31 HLC S.Fujimoto)<BR>
 * </P>
 *
 * @author S.Fujimoto
 */
public class RegisterRdProgramInfoCmd extends Command {

    private static final long serialVersionUID = 1L;

    /** XVÊL[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** WIÔgo^æÊo^îñVO */
    private RegisterRdProgramInfoVO _vo = null;

    /**
     * WIÔgo^æÊo^îñðo^·é
     * @throws HAMException
     */
    @Override
    public void execute() throws HAMException {
        BigDecimal rdSeqNo = RegisterRdProgramInfoManager.getInstance().registerRdProgramInfo(_vo);
        RegisterRdProgramInfoResult result = new RegisterRdProgramInfoResult();
        getResult().set(RESULT_KEY, result);
        result.setRdSeqNo(rdSeqNo);
    }

    /**
     * WIÔgo^æÊo^VOðÝè·é
     * @param vo RegisterRdProgramInfoVO WIÔgo^æÊo^VO
     */
    public void setRegisterRdProgramInfoVO(RegisterRdProgramInfoVO vo) {
        _vo = vo;
    }

    /**
     * WIÔgo^æÊo^Êðæ¾·é
     * @return RegisterRdProgramInfoResult o^Ê
     */
    public RegisterRdProgramInfoResult getRegisterRdProgramInfoResult() {
        return (RegisterRdProgramInfoResult) super.getResult().get(RESULT_KEY);
    }

}
