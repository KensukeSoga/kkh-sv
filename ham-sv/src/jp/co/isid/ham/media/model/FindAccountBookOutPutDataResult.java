package jp.co.isid.ham.media.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jp.co.isid.ham.model.AbstractServiceResult;

/**
*
* <P>
* 営業作業台帳帳票出力画面情報を保持する.
* </P>
* <P>
* <B>修正履歴</B><BR>
* ・新規作成(2013/3/26 HLC M.Tsuchiya)<BR>
* </P>
* @author HLC M.Tsuchiya
*/
@XmlRootElement(namespace = "http://model.media.ham.isid.co.jp/")
@XmlType(namespace = "http://model.media.ham.isid.co.jp/")
public class FindAccountBookOutPutDataResult extends AbstractServiceResult{

    /** 営業作業台帳帳票の情報取得 */
    private List<FindAuthorityAccountBookReportVO> _aborep;

    /**
     * 営業作業台帳帳票VOを取得します
     * @return _aborep
     */
    public List<FindAuthorityAccountBookReportVO> getAuthorityAccountBookReport() {
        return _aborep;
    }

    /**
     * 営業作業台帳帳票VOを設定します
     * @param _adorep セットする
     */
    public void setAuthorityAccountBookReport(List<FindAuthorityAccountBookReportVO> aborep) {
        _aborep = aborep;
    }


    /** ListだけではWebサービスに公開されないのでダミープロパティを追加 */
    private String _dummy;

    /**
     * ListだけではWebサービスに公開されないのでダミープロパティを追加を取得します
     * @return String ダミープロパティ
     */
    public String getDummy() {
        return _dummy;
    }

    /**
     * ListだけではWebサービスに公開されないのでダミープロパティを追加を設定します
     * @param dummy ダミープロパティ
     */
    public void setDummy(String dummy) {
        this._dummy = dummy;
    }
}
