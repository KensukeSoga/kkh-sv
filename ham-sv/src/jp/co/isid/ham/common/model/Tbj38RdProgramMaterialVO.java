package jp.co.isid.ham.common.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.integ.tbl.Tbj38RdProgramMaterial;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * ラジオ番組素材VO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2015/10/31 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class Tbj38RdProgramMaterialVO extends AbstractModel {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * デフォルトコンストラクタ
     */
    public Tbj38RdProgramMaterialVO() {
    }

    /**
     * 新規インスタンスを生成する
     *
     * @return 新規インスタンス
     */
    public Object newInstance() {
        return new Tbj38RdProgramMaterialVO();
    }

    /**
     * ラジオ番組SEQNOを取得する
     *
     * @return ラジオ番組SEQNO
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getRDSEQNO() {
        return (BigDecimal) get(Tbj38RdProgramMaterial.RDSEQNO);
    }

    /**
     * ラジオ番組SEQNOを設定する
     *
     * @param val ラジオ番組SEQNO
     */
    public void setRDSEQNO(BigDecimal val) {
        set(Tbj38RdProgramMaterial.RDSEQNO, val);
    }

    /**
     * 年月を取得する
     *
     * @return 年月
     */
    public String getYEARMONTH() {
        return (String) get(Tbj38RdProgramMaterial.YEARMONTH);
    }

    /**
     * 年月を設定する
     *
     * @param val 年月
     */
    public void setYEARMONTH(String val) {
        set(Tbj38RdProgramMaterial.YEARMONTH, val);
    }

    /**
     * 枠SEQNOを取得する
     *
     * @return 枠SEQNO
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getWAKUSEQ() {
        return (BigDecimal) get(Tbj38RdProgramMaterial.WAKUSEQ);
    }

    /**
     * 枠SEQNOを設定する
     *
     * @param val 枠SEQNO
     */
    public void setWAKUSEQ(BigDecimal val) {
        set(Tbj38RdProgramMaterial.WAKUSEQ, val);
    }

    /**
     * 該当月の1日を取得する
     *
     * @return 該当月の1日
     */
    public String getDAY01() {
        return (String) get(Tbj38RdProgramMaterial.DAY01);
    }

    /**
     * 該当月の1日を設定する
     *
     * @param val 該当月の1日
     */
    public void setDAY01(String val) {
        set(Tbj38RdProgramMaterial.DAY01, val);
    }

    /**
     * 該当月の2日を取得する
     *
     * @return 該当月の2日
     */
    public String getDAY02() {
        return (String) get(Tbj38RdProgramMaterial.DAY02);
    }

    /**
     * 該当月の2日を設定する
     *
     * @param val 該当月の2日
     */
    public void setDAY02(String val) {
        set(Tbj38RdProgramMaterial.DAY02, val);
    }

    /**
     * 該当月の3日を取得する
     *
     * @return 該当月の3日
     */
    public String getDAY03() {
        return (String) get(Tbj38RdProgramMaterial.DAY03);
    }

    /**
     * 該当月の3日を設定する
     *
     * @param val 該当月の3日
     */
    public void setDAY03(String val) {
        set(Tbj38RdProgramMaterial.DAY03, val);
    }

    /**
     * 該当月の4日を取得する
     *
     * @return 該当月の4日
     */
    public String getDAY04() {
        return (String) get(Tbj38RdProgramMaterial.DAY04);
    }

    /**
     * 該当月の4日を設定する
     *
     * @param val 該当月の4日
     */
    public void setDAY04(String val) {
        set(Tbj38RdProgramMaterial.DAY04, val);
    }

    /**
     * 該当月の5日を取得する
     *
     * @return 該当月の5日
     */
    public String getDAY05() {
        return (String) get(Tbj38RdProgramMaterial.DAY05);
    }

    /**
     * 該当月の5日を設定する
     *
     * @param val 該当月の5日
     */
    public void setDAY05(String val) {
        set(Tbj38RdProgramMaterial.DAY05, val);
    }

    /**
     * 該当月の6日を取得する
     *
     * @return 該当月の6日
     */
    public String getDAY06() {
        return (String) get(Tbj38RdProgramMaterial.DAY06);
    }

    /**
     * 該当月の6日を設定する
     *
     * @param val 該当月の6日
     */
    public void setDAY06(String val) {
        set(Tbj38RdProgramMaterial.DAY06, val);
    }

    /**
     * 該当月の7日を取得する
     *
     * @return 該当月の7日
     */
    public String getDAY07() {
        return (String) get(Tbj38RdProgramMaterial.DAY07);
    }

    /**
     * 該当月の7日を設定する
     *
     * @param val 該当月の7日
     */
    public void setDAY07(String val) {
        set(Tbj38RdProgramMaterial.DAY07, val);
    }

    /**
     * 該当月の8日を取得する
     *
     * @return 該当月の8日
     */
    public String getDAY08() {
        return (String) get(Tbj38RdProgramMaterial.DAY08);
    }

    /**
     * 該当月の8日を設定する
     *
     * @param val 該当月の8日
     */
    public void setDAY08(String val) {
        set(Tbj38RdProgramMaterial.DAY08, val);
    }

    /**
     * 該当月の9日を取得する
     *
     * @return 該当月の9日
     */
    public String getDAY09() {
        return (String) get(Tbj38RdProgramMaterial.DAY09);
    }

    /**
     * 該当月の9日を設定する
     *
     * @param val 該当月の9日
     */
    public void setDAY09(String val) {
        set(Tbj38RdProgramMaterial.DAY09, val);
    }

    /**
     * 該当月の10日を取得する
     *
     * @return 該当月の10日
     */
    public String getDAY10() {
        return (String) get(Tbj38RdProgramMaterial.DAY10);
    }

    /**
     * 該当月の10日を設定する
     *
     * @param val 該当月の10日
     */
    public void setDAY10(String val) {
        set(Tbj38RdProgramMaterial.DAY10, val);
    }

    /**
     * 該当月の11日を取得する
     *
     * @return 該当月の11日
     */
    public String getDAY11() {
        return (String) get(Tbj38RdProgramMaterial.DAY11);
    }

    /**
     * 該当月の11日を設定する
     *
     * @param val 該当月の11日
     */
    public void setDAY11(String val) {
        set(Tbj38RdProgramMaterial.DAY11, val);
    }

    /**
     * 該当月の12日を取得する
     *
     * @return 該当月の12日
     */
    public String getDAY12() {
        return (String) get(Tbj38RdProgramMaterial.DAY12);
    }

    /**
     * 該当月の12日を設定する
     *
     * @param val 該当月の12日
     */
    public void setDAY12(String val) {
        set(Tbj38RdProgramMaterial.DAY12, val);
    }

    /**
     * 該当月の13日を取得する
     *
     * @return 該当月の13日
     */
    public String getDAY13() {
        return (String) get(Tbj38RdProgramMaterial.DAY13);
    }

    /**
     * 該当月の13日を設定する
     *
     * @param val 該当月の13日
     */
    public void setDAY13(String val) {
        set(Tbj38RdProgramMaterial.DAY13, val);
    }

    /**
     * 該当月の14日を取得する
     *
     * @return 該当月の14日
     */
    public String getDAY14() {
        return (String) get(Tbj38RdProgramMaterial.DAY14);
    }

    /**
     * 該当月の14日を設定する
     *
     * @param val 該当月の14日
     */
    public void setDAY14(String val) {
        set(Tbj38RdProgramMaterial.DAY14, val);
    }

    /**
     * 該当月の15日を取得する
     *
     * @return 該当月の15日
     */
    public String getDAY15() {
        return (String) get(Tbj38RdProgramMaterial.DAY15);
    }

    /**
     * 該当月の15日を設定する
     *
     * @param val 該当月の15日
     */
    public void setDAY15(String val) {
        set(Tbj38RdProgramMaterial.DAY15, val);
    }

    /**
     * 該当月の16日を取得する
     *
     * @return 該当月の16日
     */
    public String getDAY16() {
        return (String) get(Tbj38RdProgramMaterial.DAY16);
    }

    /**
     * 該当月の16日を設定する
     *
     * @param val 該当月の16日
     */
    public void setDAY16(String val) {
        set(Tbj38RdProgramMaterial.DAY16, val);
    }

    /**
     * 該当月の17日を取得する
     *
     * @return 該当月の17日
     */
    public String getDAY17() {
        return (String) get(Tbj38RdProgramMaterial.DAY17);
    }

    /**
     * 該当月の17日を設定する
     *
     * @param val 該当月の17日
     */
    public void setDAY17(String val) {
        set(Tbj38RdProgramMaterial.DAY17, val);
    }

    /**
     * 該当月の18日を取得する
     *
     * @return 該当月の18日
     */
    public String getDAY18() {
        return (String) get(Tbj38RdProgramMaterial.DAY18);
    }

    /**
     * 該当月の18日を設定する
     *
     * @param val 該当月の18日
     */
    public void setDAY18(String val) {
        set(Tbj38RdProgramMaterial.DAY18, val);
    }

    /**
     * 該当月の19日を取得する
     *
     * @return 該当月の19日
     */
    public String getDAY19() {
        return (String) get(Tbj38RdProgramMaterial.DAY19);
    }

    /**
     * 該当月の19日を設定する
     *
     * @param val 該当月の19日
     */
    public void setDAY19(String val) {
        set(Tbj38RdProgramMaterial.DAY19, val);
    }

    /**
     * 該当月の20日を取得する
     *
     * @return 該当月の20日
     */
    public String getDAY20() {
        return (String) get(Tbj38RdProgramMaterial.DAY20);
    }

    /**
     * 該当月の20日を設定する
     *
     * @param val 該当月の20日
     */
    public void setDAY20(String val) {
        set(Tbj38RdProgramMaterial.DAY20, val);
    }

    /**
     * 該当月の21日を取得する
     *
     * @return 該当月の21日
     */
    public String getDAY21() {
        return (String) get(Tbj38RdProgramMaterial.DAY21);
    }

    /**
     * 該当月の21日を設定する
     *
     * @param val 該当月の21日
     */
    public void setDAY21(String val) {
        set(Tbj38RdProgramMaterial.DAY21, val);
    }

    /**
     * 該当月の22日を取得する
     *
     * @return 該当月の22日
     */
    public String getDAY22() {
        return (String) get(Tbj38RdProgramMaterial.DAY22);
    }

    /**
     * 該当月の22日を設定する
     *
     * @param val 該当月の22日
     */
    public void setDAY22(String val) {
        set(Tbj38RdProgramMaterial.DAY22, val);
    }

    /**
     * 該当月の23日を取得する
     *
     * @return 該当月の23日
     */
    public String getDAY23() {
        return (String) get(Tbj38RdProgramMaterial.DAY23);
    }

    /**
     * 該当月の23日を設定する
     *
     * @param val 該当月の23日
     */
    public void setDAY23(String val) {
        set(Tbj38RdProgramMaterial.DAY23, val);
    }

    /**
     * 該当月の24日を取得する
     *
     * @return 該当月の24日
     */
    public String getDAY24() {
        return (String) get(Tbj38RdProgramMaterial.DAY24);
    }

    /**
     * 該当月の24日を設定する
     *
     * @param val 該当月の24日
     */
    public void setDAY24(String val) {
        set(Tbj38RdProgramMaterial.DAY24, val);
    }

    /**
     * 該当月の25日を取得する
     *
     * @return 該当月の25日
     */
    public String getDAY25() {
        return (String) get(Tbj38RdProgramMaterial.DAY25);
    }

    /**
     * 該当月の25日を設定する
     *
     * @param val 該当月の25日
     */
    public void setDAY25(String val) {
        set(Tbj38RdProgramMaterial.DAY25, val);
    }

    /**
     * 該当月の26日を取得する
     *
     * @return 該当月の26日
     */
    public String getDAY26() {
        return (String) get(Tbj38RdProgramMaterial.DAY26);
    }

    /**
     * 該当月の26日を設定する
     *
     * @param val 該当月の26日
     */
    public void setDAY26(String val) {
        set(Tbj38RdProgramMaterial.DAY26, val);
    }

    /**
     * 該当月の27日を取得する
     *
     * @return 該当月の27日
     */
    public String getDAY27() {
        return (String) get(Tbj38RdProgramMaterial.DAY27);
    }

    /**
     * 該当月の27日を設定する
     *
     * @param val 該当月の27日
     */
    public void setDAY27(String val) {
        set(Tbj38RdProgramMaterial.DAY27, val);
    }

    /**
     * 該当月の28日を取得する
     *
     * @return 該当月の28日
     */
    public String getDAY28() {
        return (String) get(Tbj38RdProgramMaterial.DAY28);
    }

    /**
     * 該当月の28日を設定する
     *
     * @param val 該当月の28日
     */
    public void setDAY28(String val) {
        set(Tbj38RdProgramMaterial.DAY28, val);
    }

    /**
     * 該当月の29日を取得する
     *
     * @return 該当月の29日
     */
    public String getDAY29() {
        return (String) get(Tbj38RdProgramMaterial.DAY29);
    }

    /**
     * 該当月の29日を設定する
     *
     * @param val 該当月の29日
     */
    public void setDAY29(String val) {
        set(Tbj38RdProgramMaterial.DAY29, val);
    }

    /**
     * 該当月の30日を取得する
     *
     * @return 該当月の30日
     */
    public String getDAY30() {
        return (String) get(Tbj38RdProgramMaterial.DAY30);
    }

    /**
     * 該当月の30日を設定する
     *
     * @param val 該当月の30日
     */
    public void setDAY30(String val) {
        set(Tbj38RdProgramMaterial.DAY30, val);
    }

    /**
     * 該当月の31日を取得する
     *
     * @return 該当月の31日
     */
    public String getDAY31() {
        return (String) get(Tbj38RdProgramMaterial.DAY31);
    }

    /**
     * 該当月の31日を設定する
     *
     * @param val 該当月の31日
     */
    public void setDAY31(String val) {
        set(Tbj38RdProgramMaterial.DAY31, val);
    }

    /**
     * データ作成日時を取得する
     *
     * @return データ作成日時
     */
    @XmlElement(required = true, nillable = true)
    public Date getCRTDATE() {
        return (Date) get(Tbj38RdProgramMaterial.CRTDATE);
    }

    /**
     * データ作成日時を設定する
     *
     * @param val データ作成日時
     */
    public void setCRTDATE(Date val) {
        set(Tbj38RdProgramMaterial.CRTDATE, val);
    }

    /**
     * データ作成者を取得する
     *
     * @return データ作成者
     */
    public String getCRTNM() {
        return (String) get(Tbj38RdProgramMaterial.CRTNM);
    }

    /**
     * データ作成者を設定する
     *
     * @param val データ作成者
     */
    public void setCRTNM(String val) {
        set(Tbj38RdProgramMaterial.CRTNM, val);
    }

    /**
     * 作成プログラムを取得する
     *
     * @return 作成プログラム
     */
    public String getCRTAPL() {
        return (String) get(Tbj38RdProgramMaterial.CRTAPL);
    }

    /**
     * 作成プログラムを設定する
     *
     * @param val 作成プログラム
     */
    public void setCRTAPL(String val) {
        set(Tbj38RdProgramMaterial.CRTAPL, val);
    }

    /**
     * 作成担当者IDを取得する
     *
     * @return 作成担当者ID
     */
    public String getCRTID() {
        return (String) get(Tbj38RdProgramMaterial.CRTID);
    }

    /**
     * 作成担当者IDを設定する
     *
     * @param val 作成担当者ID
     */
    public void setCRTID(String val) {
        set(Tbj38RdProgramMaterial.CRTID, val);
    }

    /**
     * データ更新日時を取得する
     *
     * @return データ更新日時
     */
    @XmlElement(required = true, nillable = true)
    public Date getUPDDATE() {
        return (Date) get(Tbj38RdProgramMaterial.UPDDATE);
    }

    /**
     * データ更新日時を設定する
     *
     * @param val データ更新日時
     */
    public void setUPDDATE(Date val) {
        set(Tbj38RdProgramMaterial.UPDDATE, val);
    }

    /**
     * データ更新者を取得する
     *
     * @return データ更新者
     */
    public String getUPDNM() {
        return (String) get(Tbj38RdProgramMaterial.UPDNM);
    }

    /**
     * データ更新者を設定する
     *
     * @param val データ更新者
     */
    public void setUPDNM(String val) {
        set(Tbj38RdProgramMaterial.UPDNM, val);
    }

    /**
     * 更新プログラムを取得する
     *
     * @return 更新プログラム
     */
    public String getUPDAPL() {
        return (String) get(Tbj38RdProgramMaterial.UPDAPL);
    }

    /**
     * 更新プログラムを設定する
     *
     * @param val 更新プログラム
     */
    public void setUPDAPL(String val) {
        set(Tbj38RdProgramMaterial.UPDAPL, val);
    }

    /**
     * 更新担当者IDを取得する
     *
     * @return 更新担当者ID
     */
    public String getUPDID() {
        return (String) get(Tbj38RdProgramMaterial.UPDID);
    }

    /**
     * 更新担当者IDを設定する
     *
     * @param val 更新担当者ID
     */
    public void setUPDID(String val) {
        set(Tbj38RdProgramMaterial.UPDID, val);
    }

}
