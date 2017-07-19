package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.RegistMbj06HcBumonVO;
import jp.co.isid.ham.mastermaintenance.model.CheckRegistMasterMaintenanceResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * HC部門チェックコマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/12/13 森)<BR>
 * </P>
 * @author 森
 */
public class CheckRegistMasterMaintenanceHCSectionCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** チェックデータ */
    private RegistMbj06HcBumonVO _vo;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        CheckRegistMasterMaintenanceResult result = new CheckRegistMasterMaintenanceResult();
        manager.checkRegistMasterMaintenanceHCSection(_vo);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * チェックデータを設定します
     *
     * @param vo チェックデータ
     */
    public void setCheckRegistVO(RegistMbj06HcBumonVO vo) {
        _vo = vo;
    }

    /**
     * 結果を返します
     *
     * @return 結果
     */
    public CheckRegistMasterMaintenanceResult getCheckRegistResult() {
        return (CheckRegistMasterMaintenanceResult) super.getResult().get(RESULT_KEY);
    }

}
