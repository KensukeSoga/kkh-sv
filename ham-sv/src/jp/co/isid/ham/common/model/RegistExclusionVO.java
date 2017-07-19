package jp.co.isid.ham.common.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * 排他ロック情報VO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/12/03 森)<BR>
 * </P>
 * @author 森
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class RegistExclusionVO extends AbstractModel
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** データ数 */
    private String _DATACOUNT = null;

    /** 最新更新時刻 */
    private Date _UPDATEDATE = null;

    /** 最新更新者ID */
    private String _UPDATEUSERID = null;

    /**
     * デフォルトコンストラクタ
     */
    public RegistExclusionVO()
    {
    }

    /**
     * 新規インスタンスを生成する
     *
     * @return 新規インスタンス
     */
    public Object newInstance()
    {
        return new RegistExclusionVO();
    }

    /**
     * データ数を取得する
     *
     * @return データ数
     */
    public String getDATACOUNT()
    {
        return _DATACOUNT;
    }

    /**
     * データ数を設定する
     *
     * @param val データ数
     */
    public void setDATACOUNT(String val)
    {
        _DATACOUNT = val;
    }

    /**
     * 最新更新時刻を取得する
     *
     * @return 最新更新時刻
     */
    @XmlElement(required = true, nillable = true)
    public Date getUPDATEDATE()
    {
        return _UPDATEDATE;
    }

    /**
     * 最新更新時刻を設定する
     *
     * @param val 最新更新時刻
     */
    public void setUPDATEDATE(Date val)
    {
        _UPDATEDATE = val;
    }

    /**
     * 最新更新者IDを取得する
     *
     * @return 最新更新者ID
     */
    public String getUPDATEUSERID()
    {
        return _UPDATEUSERID;
    }

    /**
     * 最新更新者IDを設定する
     *
     * @param val 最新更新者ID
     */
    public void setUPDATEUSERID(String val)
    {
        _UPDATEUSERID = val;
    }

}
