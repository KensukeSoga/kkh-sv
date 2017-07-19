package jp.co.isid.ham.operationLog.controller;

import jp.co.isid.ham.model.base.HAMException;
import jp.co.isid.ham.operationLog.model.FindOperationLogCondition;
import jp.co.isid.ham.operationLog.model.FindOperationLogResult;
import jp.co.isid.ham.operationLog.model.OperationLogManager;
import jp.co.isid.nj.controller.command.Command;
import jp.co.isid.nj.exp.UserException;

/**
 * <P>
 * 稼働ログ検索コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2013/05/15 T.Kobayashi)<BR>
 * </P>
 * @author T.Kobayashi
 */
public class FindOperationLogCmd extends Command {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    FindOperationLogCondition _cond;

    /**
     * 検索条件を使用し、検索処理を実行します
     * @throws HAMException 検索に失敗した場合
     */
    @Override
	public void execute() throws UserException {
    	OperationLogManager manager = OperationLogManager.getInstance();
    	FindOperationLogResult result = manager.findOperationLog(_cond);
        getResult().set(RESULT_KEY, result);
	}

    /**
     * 検索条件を設定します
     *
     * @param cond 検索条件
     */
	public void setFindOperationLogCondition(FindOperationLogCondition cond) {
        _cond = cond;
	}

    /**
     * 検索結果を返します
     *
     * @return 検索結果
     */
	public FindOperationLogResult getOperationLogResult() {
        return (FindOperationLogResult)super.getResult().get(RESULT_KEY);
	}
}
