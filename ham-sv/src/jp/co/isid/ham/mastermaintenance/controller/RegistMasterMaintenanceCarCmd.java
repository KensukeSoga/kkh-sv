package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceCarDispVO;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * 車種表示情報登録コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/12/12 森)<BR>
 * </P>
 * @author 森
 */
public class RegistMasterMaintenanceCarCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** 登録データ */
    private RegistMasterMaintenanceCarDispVO _vo;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        RegistMasterMaintenanceDispResult result = new RegistMasterMaintenanceDispResult();
        manager.registMasterMaintenanceCar(_vo.getCarVO());
        manager.registMasterMaintenanceCarUser(_vo.getCarUserVO());
        manager.registMasterMaintenanceCarAuthority(_vo.getCarAuthorityVO());
        manager.registMasterMaintenanceCarCategoryContent(_vo.getCarCategoryContentVO());
        manager.registMasterMaintenanceCarOutControl(_vo.getCarOutControlVO());
        manager.registMasterMaintenanceCostPlan(_vo.getCostPlanVO());
        manager.registMasterMaintenanceMediaProduct(_vo.getMediaProductVO());
        manager.registMasterMaintenanceAlertDispControl(_vo.getAlertDispControlVO());
        manager.deleteMasterMaintenanceInputUserDCARCD(_vo.getInputUserVO());
        getResult().set(RESULT_KEY, result);
    }

    /**
     * 登録データを設定します
     *
     * @param vo 登録データ
     */
    public void setRegistVO(RegistMasterMaintenanceCarDispVO vo) {
        _vo = vo;
    }

    /**
     * 結果を返します
     *
     * @return 結果
     */
    public RegistMasterMaintenanceDispResult getRegistResult() {
        return (RegistMasterMaintenanceDispResult) super.getResult().get(RESULT_KEY);
    }

}
