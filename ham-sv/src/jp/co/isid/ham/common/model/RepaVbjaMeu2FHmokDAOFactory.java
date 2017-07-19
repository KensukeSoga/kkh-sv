package jp.co.isid.ham.common.model;

import jp.co.isid.nj.integ.DaoFactory;

/**
 * <P>
 * 費目マスタDAOFactory
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
public class RepaVbjaMeu2FHmokDAOFactory extends DaoFactory {

    /**
     * インスタンス生成禁止
     */
    private RepaVbjaMeu2FHmokDAOFactory() {
    }

    /**
     * DAOインスタンスを生成する
     *
     * @return DAOインスタンス
     */
    public static RepaVbjaMeu2FHmokDAO createRepaVbjaMeu2FHmokDAO() {
        return (RepaVbjaMeu2FHmokDAO) DaoFactory.createDao(RepaVbjaMeu2FHmokDAO.class);
    }

}
