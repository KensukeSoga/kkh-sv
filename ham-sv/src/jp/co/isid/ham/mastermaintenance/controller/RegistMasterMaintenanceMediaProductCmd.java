package jp.co.isid.ham.mastermaintenance.controller;

import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceMediaProductDispVO;
import jp.co.isid.ham.mastermaintenance.model.RegistMasterMaintenanceDispResult;
import jp.co.isid.ham.mastermaintenance.model.MasterMaintenanceManager;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * �}�́E���i�R�t�\�����o�^�R�}���h
 * </P>
 * <P>
 * <B>�C������</B><BR>
 * �E�V�K�쐬(2012/12/13 �X)<BR>
 * </P>
 * @author �X
 */
public class RegistMasterMaintenanceMediaProductCmd extends Command
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** �������ʃL�[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** �o�^�f�[�^ */
    private RegistMasterMaintenanceMediaProductDispVO _vo;

    /**
     * execute
     */
    @Override
    public void execute() throws UserException {
        MasterMaintenanceManager manager = MasterMaintenanceManager.getInstance();
        RegistMasterMaintenanceDispResult result = new RegistMasterMaintenanceDispResult();
        manager.registMasterMaintenanceMediaProduct(_vo.getMediaProductVO());
        getResult().set(RESULT_KEY, result);
    }

    /**
     * �o�^�f�[�^��ݒ肵�܂�
     *
     * @param vo �o�^�f�[�^
     */
    public void setRegistVO(RegistMasterMaintenanceMediaProductDispVO vo) {
        _vo = vo;
    }

    /**
     * ���ʂ�Ԃ��܂�
     *
     * @return ����
     */
    public RegistMasterMaintenanceDispResult getRegistResult() {
        return (RegistMasterMaintenanceDispResult) super.getResult().get(RESULT_KEY);
    }

}
