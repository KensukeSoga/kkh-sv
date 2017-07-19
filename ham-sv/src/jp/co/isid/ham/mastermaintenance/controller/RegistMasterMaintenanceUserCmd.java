package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceUserDispVO;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * 担当者表示情報登録コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/12/12 森)<BR>
 * ・HDX対応(2016/03/02 大城)<BR>
 * </P>
 * @author 森
 */
public class RegistMasterMaintenanceUserCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** 登録データ */
    private RegistMasterMaintenanceUserDispVO _vo;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        RegistMasterMaintenanceDispResult result = new RegistMasterMaintenanceDispResult();
        manager.registMasterMaintenanceUser(_vo.getUserVO());
        manager.registMasterMaintenanceCarAuthority(_vo.getCarAuthorityVO());
        manager.registMasterMaintenanceMediaAuthority(_vo.getMediaAuthorityVO());
        manager.registMasterMaintenanceFunctionControl(_vo.getFunctionControlVO());
        manager.registMasterMaintenanceSecurity(_vo.getSecurityVO());
        manager.registMasterMaintenanceAlertDispControl(_vo.getAlertDispControlVO());
        /* 2016/02/29 HDX対応 HLC K.Oki ADD Start */
        manager.registMasterMaintenanceCarUserSozaiUserID(_vo.getSzTntUserVO());
        /* 2016/02/29 HDX対応 HLC K.Oki ADD End */
        getResult().set(RESULT_KEY, result);
    }

    /**
     * 登録データを設定します
     *
     * @param vo 登録データ
     */
    public void setRegistVO(RegistMasterMaintenanceUserDispVO vo) {
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
