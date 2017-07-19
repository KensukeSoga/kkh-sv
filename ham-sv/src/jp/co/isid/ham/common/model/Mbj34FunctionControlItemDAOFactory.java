package jp.co.isid.ham.common.model;

import jp.co.isid.nj.integ.DaoFactory;

/**
 * <P>
 * 機能制御項目マスタDAOFactory
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
public class Mbj34FunctionControlItemDAOFactory extends DaoFactory {

    /**
     * インスタンス生成禁止
     */
    private Mbj34FunctionControlItemDAOFactory() {
    }

    /**
     * DAOインスタンスを生成する
     *
     * @return DAOインスタンス
     */
    public static Mbj34FunctionControlItemDAO createMbj34FunctionControlItemDAO() {
        return (Mbj34FunctionControlItemDAO) DaoFactory.createDao(Mbj34FunctionControlItemDAO.class);
    }

}
