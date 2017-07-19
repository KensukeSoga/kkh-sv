package jp.co.isid.ham.media.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import jp.co.isid.ham.common.model.Tbj02EigyoDaichoVO;

public class FindCooperationDataCondition implements Serializable{

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 出力対象の営業作業台帳 */
    private List<Tbj02EigyoDaichoVO> _daichoVO;

    /** 期間開始 */
    private BigDecimal _kikanFrom;

    /** 期間終了 */
    private BigDecimal _kikanTo;

    /** 営業日 */
    private String _eigyobi;


    /**
     * 出力対象の営業作業台帳を取得する
     * @return 出力対象の営業作業台帳
     */
    public List<Tbj02EigyoDaichoVO> getTbj02EigyoDaicho() {
        return _daichoVO;
    }

    /**
     * 出力対象の営業作業台帳を設定する
     * @param daichoVO
     */
    public void setTbj02EigyoDaicho(List<Tbj02EigyoDaichoVO> daichoVO) {
        this._daichoVO = daichoVO;
    }

    /**
     * 期間開始取得
     * @return
     */
    @XmlElement(required = true)
    public BigDecimal getKikanFrom() {
        return _kikanFrom;
    }

    /**
     * 期間開始設定
     * @param kikanFrom
     */
    public void setKikanFrom(BigDecimal kikanFrom) {
        this._kikanFrom = kikanFrom;
    }

    /**
     * 期間終了取得
     * @return
     */
    @XmlElement(required = true)
    public BigDecimal getKikanTo() {
        return _kikanTo;
    }

    /**
     * 期間終了設定
     * @param kikanTo
     */
    public void setKikanTo(BigDecimal kikanTo) {
        this._kikanTo = kikanTo;
    }

    /**
     * 営業日取得
     * @return 営業日
     */
    public String getEigyobi() {
        return _eigyobi;
    }

    /**
     * 営業日設定
     * @param eigyobi 営業日
     */
    public void setEigyobi(String eigyobi) {
        _eigyobi = eigyobi;
    }
}
