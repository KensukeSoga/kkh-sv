package jp.co.isid.ham.billing.model;

import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * HM©ÏA¿¾×A¿ì¬(}Ì)õÊ
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2015/08/31 HLC S.Fujimoto)<BR>
 * </P>
 * @author S.Fujimoto
 */
public class FindHMEstimateBillMediaReportResult extends AbstractServiceResult {

    /** ©ÏA¿¾×oÍîñ */
    private FindHMEstimateMediaReportResult _hmEstimateMedia = null;
    /** ¿oÍîñ */
    private FindHMBillMediaReportResult _hmBillMedia = null;

    /**
     * ©ÏA¿¾×oÍîñðæ¾·é
     * @return FindHMEstimateMediaReportResult ©ÏÄ/©Ï¾×
     */
    public FindHMEstimateMediaReportResult getHMEstimateMedia() {
        return _hmEstimateMedia;
    }

    /**
     * ©ÏA¿¾×oÍîñðÝè·é
     * @param vo FindHMEstimateMediaReportResult ©ÏÄ/©Ï¾×
     */
    public void setHMEstimateMedia(FindHMEstimateMediaReportResult result) {
        _hmEstimateMedia = result;
    }

    /**
     * ¿oÍîñðæ¾·é
     * @return FindHMBillMediaReportResult ¿oÍîñ
     */
    public FindHMBillMediaReportResult getHMBillMedia() {
        return _hmBillMedia;
    }

    /**
     * ¿oÍîñðÝè·é
     * @param vo FindHMBillMediaReportResult ¿oÍîñ
     */
    public void setHMBillMedia(FindHMBillMediaReportResult result) {
        _hmBillMedia = result;
    }

}
