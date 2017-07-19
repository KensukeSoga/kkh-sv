package jp.co.isid.ham.billing.model;

import jp.co.isid.nj.integ.DaoFactory;

/**
 * <P>
 * HC©Ïì¬o^DAOFactory
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/3/3 T.Fujiyoshi)<BR>
 * </P>
 * @author T.Fujiyoshi
 */
public class RegisterHCEstimateCreationDAOFactory extends DaoFactory {

    /**
     * CX^X¶¬Ö~
     */
    private RegisterHCEstimateCreationDAOFactory() {
    }

    /**
     * ©ÏÄCR§ìïì¬(§ìïæ)DAOÌCX^Xð¶¬µÜ·
     *
     * @return ©ÏÄCR§ìïì¬(§ìïæ)DAO
     */
    public static Tbj07EstimateCreateCostDAO createTbj07EstimateCreateCostDao() {
        return new Tbj07EstimateCreateCostDAO();
    }

    /**
     * ©ÏÄCR§ìïì¬(CR§ìïÇ)DAOÌCX^Xð¶¬µÜ·
     *
     * @return ©ÏÄCR§ìïì¬(CR§ìïÇ)DAO
     */
    public static Tbj07EstimateCreateCrDAO createTbj07EstimateCreateCrDao() {
        return new Tbj07EstimateCreateCrDAO();
    }

}
