package jp.co.isid.ham.production.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.model.AbstractServiceResult;

/**
 * <P>
 * CR制作費　検索実行時のデータ取得の結果クラス
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/30 新HAMチーム)<BR>
 * </P>
 *
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class FindBudgetResult extends AbstractServiceResult {

    /* ============================================================================= */
    /** ListだけではWebサービスに公開されないのでダミープロパティを追加 */
    private String _dummy;

    /**
     * ListだけではWebサービスに公開されないのでダミープロパティを取得します
     *
     * @return String ダミープロパティ
     */
    public String getDummy() {
        return _dummy;
    }

    /**
     * ListだけではWebサービスに公開されないのでダミープロパティを設定します
     *
     * @param dummy ダミープロパティ
     */
    public void setDummy(String dummy) {
        this._dummy = dummy;
    }

    /* ============================================================================= */

    /** FindBudgetVOリスト */
    private List<FindBudgetVO> _findBudgetVoList = null;

    /**
     * FindBudgetVOリストを取得する
     *
     * @return FindBudgetVOリスト
     */
    public List<FindBudgetVO> getFindBudgetVoList() {
        return _findBudgetVoList;
    }

    /**
     * FindBudgetVOリストを設定する
     *
     * @param findBudgetVoList FindBudgetVOリスト
     */
    public void setFindBudgetVoList(List<FindBudgetVO> findBudgetVoList) {
        this._findBudgetVoList = findBudgetVoList;
    }

}
