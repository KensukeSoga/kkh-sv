package jp.co.isid.ham.mastermaintenance.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * HC担当者表示登録データVO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/12/13 森)<BR>
 * </P>
 * @author 森
 */
@XmlRootElement(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
@XmlType(namespace = "http://model.mastermaintenance.ham.isid.co.jp/")
public class RegistMasterMaintenanceHCUserDispVO extends AbstractModel
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** HC担当者登録データVO */
    private RegistMbj07HcUserVO _hCUserVO = null;

    /**
     * デフォルトコンストラクタ
     */
    public RegistMasterMaintenanceHCUserDispVO()
    {
    }

    /**
     * 新規インスタンスを生成する
     *
     * @return 新規インスタンス
     */
    public Object newInstance()
    {
        return new RegistMasterMaintenanceHCUserDispVO();
    }

    /**
     * HC担当者登録データVOを設定します
     * @param vo セットする _hCUserVO
     */
    public void setHCUserVO(RegistMbj07HcUserVO vo)
    {
        _hCUserVO = vo;
    }

    /**
     * HC担当者登録データVOを取得します
     * @return _hCUserVO
     */
    public RegistMbj07HcUserVO getHCUserVO()
    {
        return _hCUserVO;
    }

}
