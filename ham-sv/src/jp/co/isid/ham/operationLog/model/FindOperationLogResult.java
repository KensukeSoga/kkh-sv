package jp.co.isid.ham.operationLog.model;

import java.util.List;

import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * Ò­OÊ
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2013/05/15 T.Kobayashi)<BR>
 * </P>
 * @author T.Kobayashi
 */
public class FindOperationLogResult extends AbstractServiceResult {

    /** Ò­OVOXg */
    List<FindOperationLogVO> _findOperationLogList;

    /**
     * Ò­OVOXgðæ¾·é
     *
     * @return Ò­OVOXg
     */
    public List<FindOperationLogVO> getFindOperationLog() {
        return _findOperationLogList;
    }

    /**
     * Ò­OVOXgðÝè·é
     *
     * @param fc Ò­OVOXg
     */
    public void setFindOperationLog(List<FindOperationLogVO> voList) {
    	_findOperationLogList = voList;
    }
}
