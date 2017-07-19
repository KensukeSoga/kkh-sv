package jp.co.isid.ham.common.model;

import jp.co.isid.nj.integ.DaoFactory;

/**
 * <P>
 * ËæDAOÌt@NgNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/08/02 T.Fujiyoshi)<BR>
 * </P>
 *
 * @author T.Fujiyoshi
 */
public class FindContactRequestDAOFactory extends DaoFactory {

    private FindContactRequestDAOFactory() {
    }

    /**
     * ËæDAOCX^Xð¶¬µÜ·
     *
     * @return ËæDAO
     */
    public static FindContactRequestDAO createFindContactRequestDAO() {
        return (FindContactRequestDAO) DaoFactory.createDao(FindContactRequestDAO.class);
    }

}
