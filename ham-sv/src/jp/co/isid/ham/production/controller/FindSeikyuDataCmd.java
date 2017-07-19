package jp.co.isid.ham.production.controller;

import jp.co.isid.ham.production.model.CostManager;
import jp.co.isid.ham.production.model.FindSeikyuDataCondition;
import jp.co.isid.ham.production.model.FindSeikyuDataResult;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;
/**
 * <P>
 * ������ꗗ�������s���̃f�[�^�擾�R�}���h
 * </P>
 * <P>
 * <B>�C������</B><BR>
 * �E�V�K�쐬(2012/12/06)<BR>
 * </P>
 * @author
 */
public class FindSeikyuDataCmd extends Command {


    /** �������ʃL�[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** �������� */
    private FindSeikyuDataCondition _condition;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute() throws UserException {

	    FindSeikyuDataResult result = new FindSeikyuDataResult();
		CostManager manager = CostManager.getInstance();
		result = manager.findSeikyuData(_condition);

        getResult().set(RESULT_KEY, result);
	}

    /**
     * ����������ݒ肵�܂�
     *
     * @param condition FindSeikyuDataCondition ��������
     */
	public void setFindSeikyuDataCondition(FindSeikyuDataCondition condition) {
        _condition = condition;
	}

    /**
     * ���ʂ�Ԃ��܂�
     *
     * @return FindSeikyuDataResult ����
     */
	public FindSeikyuDataResult  getFindSeikyuDataResult() {
        return (FindSeikyuDataResult) super.getResult().get(RESULT_KEY);
	}

}
