package jp.co.isid.ham.production.model;

import jp.co.isid.nj.integ.DaoFactory;

/**
 * <P>
 * TVCMfÞê_ñîñõDAOt@NgNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2016/03/10 HLC K.Oki)<BR>
 * </P>
 *
 * @author K.Oki
 */
public class FindTVCMMaterialListContractInfoDAOFactory extends DaoFactory {

    /**
     * CX^X»ðÖ~µÜ·
     */
    private FindTVCMMaterialListContractInfoDAOFactory() {
    }

    /**
     * TVCMfÞê_ñîñõCX^Xð¶¬µÜ·
     * @return TTVCMfÞê_ñîñõDAOCX^X
     */
    public static FindTVCMMaterialListContractInfoDAO createFindTVCMMaterialListContractInfoDAOFactory() {
        return (FindTVCMMaterialListContractInfoDAO) DaoFactory.createDao(FindTVCMMaterialListContractInfoDAO.class);
    }

}
