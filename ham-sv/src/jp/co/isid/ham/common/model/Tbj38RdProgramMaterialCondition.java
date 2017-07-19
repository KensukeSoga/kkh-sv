package jp.co.isid.ham.common.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * ラジオ番組素材検索条件
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2015/10/31 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class Tbj38RdProgramMaterialCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ラジオ番組SEQNO */
    private BigDecimal _rdseqno = null;

    /** 年月 */
    private String _yearmonth = null;

    /** 枠SEQNO */
    private BigDecimal _wakuseq = null;

    /** 該当月の1日 */
    private String _day01 = null;

    /** 該当月の2日 */
    private String _day02 = null;

    /** 該当月の3日 */
    private String _day03 = null;

    /** 該当月の4日 */
    private String _day04 = null;

    /** 該当月の5日 */
    private String _day05 = null;

    /** 該当月の6日 */
    private String _day06 = null;

    /** 該当月の7日 */
    private String _day07 = null;

    /** 該当月の8日 */
    private String _day08 = null;

    /** 該当月の9日 */
    private String _day09 = null;

    /** 該当月の10日 */
    private String _day10 = null;

    /** 該当月の11日 */
    private String _day11 = null;

    /** 該当月の12日 */
    private String _day12 = null;

    /** 該当月の13日 */
    private String _day13 = null;

    /** 該当月の14日 */
    private String _day14 = null;

    /** 該当月の15日 */
    private String _day15 = null;

    /** 該当月の16日 */
    private String _day16 = null;

    /** 該当月の17日 */
    private String _day17 = null;

    /** 該当月の18日 */
    private String _day18 = null;

    /** 該当月の19日 */
    private String _day19 = null;

    /** 該当月の20日 */
    private String _day20 = null;

    /** 該当月の21日 */
    private String _day21 = null;

    /** 該当月の22日 */
    private String _day22 = null;

    /** 該当月の23日 */
    private String _day23 = null;

    /** 該当月の24日 */
    private String _day24 = null;

    /** 該当月の25日 */
    private String _day25 = null;

    /** 該当月の26日 */
    private String _day26 = null;

    /** 該当月の27日 */
    private String _day27 = null;

    /** 該当月の28日 */
    private String _day28 = null;

    /** 該当月の29日 */
    private String _day29 = null;

    /** 該当月の30日 */
    private String _day30 = null;

    /** 該当月の31日 */
    private String _day31 = null;

    /** データ作成日時 */
    private Date _crtdate = null;

    /** データ作成者 */
    private String _crtnm = null;

    /** 作成プログラム */
    private String _crtapl = null;

    /** 作成担当者ID */
    private String _crtid = null;

    /** データ更新日時 */
    private Date _upddate = null;

    /** データ更新者 */
    private String _updnm = null;

    /** 更新プログラム */
    private String _updapl = null;

    /** 更新担当者ID */
    private String _updid = null;

    /**
     * デフォルトコンストラクタ
     */
    public Tbj38RdProgramMaterialCondition() {
    }

    /**
     * ラジオ番組SEQNOを取得する
     *
     * @return ラジオ番組SEQNO
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getRdseqno() {
        return _rdseqno;
    }

    /**
     * ラジオ番組SEQNOを設定する
     *
     * @param rdseqno ラジオ番組SEQNO
     */
    public void setRdseqno(BigDecimal rdseqno) {
        this._rdseqno = rdseqno;
    }

    /**
     * 年月を取得する
     *
     * @return 年月
     */
    public String getYearmonth() {
        return _yearmonth;
    }

    /**
     * 年月を設定する
     *
     * @param yearmonth 年月
     */
    public void setYearmonth(String yearmonth) {
        this._yearmonth = yearmonth;
    }

    /**
     * 枠SEQNOを取得する
     *
     * @return 枠SEQNO
     */
    @XmlElement(required = true, nillable = true)
    public BigDecimal getWakuseq() {
        return _wakuseq;
    }

    /**
     * 枠SEQNOを設定する
     *
     * @param wakuseq 枠SEQNO
     */
    public void setWakuseq(BigDecimal wakuseq) {
        this._wakuseq = wakuseq;
    }

    /**
     * 該当月の1日を取得する
     *
     * @return 該当月の1日
     */
    public String getDay01() {
        return _day01;
    }

    /**
     * 該当月の1日を設定する
     *
     * @param day01 該当月の1日
     */
    public void setDay01(String day01) {
        this._day01 = day01;
    }

    /**
     * 該当月の2日を取得する
     *
     * @return 該当月の2日
     */
    public String getDay02() {
        return _day02;
    }

    /**
     * 該当月の2日を設定する
     *
     * @param day02 該当月の2日
     */
    public void setDay02(String day02) {
        this._day02 = day02;
    }

    /**
     * 該当月の3日を取得する
     *
     * @return 該当月の3日
     */
    public String getDay03() {
        return _day03;
    }

    /**
     * 該当月の3日を設定する
     *
     * @param day03 該当月の3日
     */
    public void setDay03(String day03) {
        this._day03 = day03;
    }

    /**
     * 該当月の4日を取得する
     *
     * @return 該当月の4日
     */
    public String getDay04() {
        return _day04;
    }

    /**
     * 該当月の4日を設定する
     *
     * @param day04 該当月の4日
     */
    public void setDay04(String day04) {
        this._day04 = day04;
    }

    /**
     * 該当月の5日を取得する
     *
     * @return 該当月の5日
     */
    public String getDay05() {
        return _day05;
    }

    /**
     * 該当月の5日を設定する
     *
     * @param day05 該当月の5日
     */
    public void setDay05(String day05) {
        this._day05 = day05;
    }

    /**
     * 該当月の6日を取得する
     *
     * @return 該当月の6日
     */
    public String getDay06() {
        return _day06;
    }

    /**
     * 該当月の6日を設定する
     *
     * @param day06 該当月の6日
     */
    public void setDay06(String day06) {
        this._day06 = day06;
    }

    /**
     * 該当月の7日を取得する
     *
     * @return 該当月の7日
     */
    public String getDay07() {
        return _day07;
    }

    /**
     * 該当月の7日を設定する
     *
     * @param day07 該当月の7日
     */
    public void setDay07(String day07) {
        this._day07 = day07;
    }

    /**
     * 該当月の8日を取得する
     *
     * @return 該当月の8日
     */
    public String getDay08() {
        return _day08;
    }

    /**
     * 該当月の8日を設定する
     *
     * @param day08 該当月の8日
     */
    public void setDay08(String day08) {
        this._day08 = day08;
    }

    /**
     * 該当月の9日を取得する
     *
     * @return 該当月の9日
     */
    public String getDay09() {
        return _day09;
    }

    /**
     * 該当月の9日を設定する
     *
     * @param day09 該当月の9日
     */
    public void setDay09(String day09) {
        this._day09 = day09;
    }

    /**
     * 該当月の10日を取得する
     *
     * @return 該当月の10日
     */
    public String getDay10() {
        return _day10;
    }

    /**
     * 該当月の10日を設定する
     *
     * @param day10 該当月の10日
     */
    public void setDay10(String day10) {
        this._day10 = day10;
    }

    /**
     * 該当月の11日を取得する
     *
     * @return 該当月の11日
     */
    public String getDay11() {
        return _day11;
    }

    /**
     * 該当月の11日を設定する
     *
     * @param day11 該当月の11日
     */
    public void setDay11(String day11) {
        this._day11 = day11;
    }

    /**
     * 該当月の12日を取得する
     *
     * @return 該当月の12日
     */
    public String getDay12() {
        return _day12;
    }

    /**
     * 該当月の12日を設定する
     *
     * @param day12 該当月の12日
     */
    public void setDay12(String day12) {
        this._day12 = day12;
    }

    /**
     * 該当月の13日を取得する
     *
     * @return 該当月の13日
     */
    public String getDay13() {
        return _day13;
    }

    /**
     * 該当月の13日を設定する
     *
     * @param day13 該当月の13日
     */
    public void setDay13(String day13) {
        this._day13 = day13;
    }

    /**
     * 該当月の14日を取得する
     *
     * @return 該当月の14日
     */
    public String getDay14() {
        return _day14;
    }

    /**
     * 該当月の14日を設定する
     *
     * @param day14 該当月の14日
     */
    public void setDay14(String day14) {
        this._day14 = day14;
    }

    /**
     * 該当月の15日を取得する
     *
     * @return 該当月の15日
     */
    public String getDay15() {
        return _day15;
    }

    /**
     * 該当月の15日を設定する
     *
     * @param day15 該当月の15日
     */
    public void setDay15(String day15) {
        this._day15 = day15;
    }

    /**
     * 該当月の16日を取得する
     *
     * @return 該当月の16日
     */
    public String getDay16() {
        return _day16;
    }

    /**
     * 該当月の16日を設定する
     *
     * @param day16 該当月の16日
     */
    public void setDay16(String day16) {
        this._day16 = day16;
    }

    /**
     * 該当月の17日を取得する
     *
     * @return 該当月の17日
     */
    public String getDay17() {
        return _day17;
    }

    /**
     * 該当月の17日を設定する
     *
     * @param day17 該当月の17日
     */
    public void setDay17(String day17) {
        this._day17 = day17;
    }

    /**
     * 該当月の18日を取得する
     *
     * @return 該当月の18日
     */
    public String getDay18() {
        return _day18;
    }

    /**
     * 該当月の18日を設定する
     *
     * @param day18 該当月の18日
     */
    public void setDay18(String day18) {
        this._day18 = day18;
    }

    /**
     * 該当月の19日を取得する
     *
     * @return 該当月の19日
     */
    public String getDay19() {
        return _day19;
    }

    /**
     * 該当月の19日を設定する
     *
     * @param day19 該当月の19日
     */
    public void setDay19(String day19) {
        this._day19 = day19;
    }

    /**
     * 該当月の20日を取得する
     *
     * @return 該当月の20日
     */
    public String getDay20() {
        return _day20;
    }

    /**
     * 該当月の20日を設定する
     *
     * @param day20 該当月の20日
     */
    public void setDay20(String day20) {
        this._day20 = day20;
    }

    /**
     * 該当月の21日を取得する
     *
     * @return 該当月の21日
     */
    public String getDay21() {
        return _day21;
    }

    /**
     * 該当月の21日を設定する
     *
     * @param day21 該当月の21日
     */
    public void setDay21(String day21) {
        this._day21 = day21;
    }

    /**
     * 該当月の22日を取得する
     *
     * @return 該当月の22日
     */
    public String getDay22() {
        return _day22;
    }

    /**
     * 該当月の22日を設定する
     *
     * @param day22 該当月の22日
     */
    public void setDay22(String day22) {
        this._day22 = day22;
    }

    /**
     * 該当月の23日を取得する
     *
     * @return 該当月の23日
     */
    public String getDay23() {
        return _day23;
    }

    /**
     * 該当月の23日を設定する
     *
     * @param day23 該当月の23日
     */
    public void setDay23(String day23) {
        this._day23 = day23;
    }

    /**
     * 該当月の24日を取得する
     *
     * @return 該当月の24日
     */
    public String getDay24() {
        return _day24;
    }

    /**
     * 該当月の24日を設定する
     *
     * @param day24 該当月の24日
     */
    public void setDay24(String day24) {
        this._day24 = day24;
    }

    /**
     * 該当月の25日を取得する
     *
     * @return 該当月の25日
     */
    public String getDay25() {
        return _day25;
    }

    /**
     * 該当月の25日を設定する
     *
     * @param day25 該当月の25日
     */
    public void setDay25(String day25) {
        this._day25 = day25;
    }

    /**
     * 該当月の26日を取得する
     *
     * @return 該当月の26日
     */
    public String getDay26() {
        return _day26;
    }

    /**
     * 該当月の26日を設定する
     *
     * @param day26 該当月の26日
     */
    public void setDay26(String day26) {
        this._day26 = day26;
    }

    /**
     * 該当月の27日を取得する
     *
     * @return 該当月の27日
     */
    public String getDay27() {
        return _day27;
    }

    /**
     * 該当月の27日を設定する
     *
     * @param day27 該当月の27日
     */
    public void setDay27(String day27) {
        this._day27 = day27;
    }

    /**
     * 該当月の28日を取得する
     *
     * @return 該当月の28日
     */
    public String getDay28() {
        return _day28;
    }

    /**
     * 該当月の28日を設定する
     *
     * @param day28 該当月の28日
     */
    public void setDay28(String day28) {
        this._day28 = day28;
    }

    /**
     * 該当月の29日を取得する
     *
     * @return 該当月の29日
     */
    public String getDay29() {
        return _day29;
    }

    /**
     * 該当月の29日を設定する
     *
     * @param day29 該当月の29日
     */
    public void setDay29(String day29) {
        this._day29 = day29;
    }

    /**
     * 該当月の30日を取得する
     *
     * @return 該当月の30日
     */
    public String getDay30() {
        return _day30;
    }

    /**
     * 該当月の30日を設定する
     *
     * @param day30 該当月の30日
     */
    public void setDay30(String day30) {
        this._day30 = day30;
    }

    /**
     * 該当月の31日を取得する
     *
     * @return 該当月の31日
     */
    public String getDay31() {
        return _day31;
    }

    /**
     * 該当月の31日を設定する
     *
     * @param day31 該当月の31日
     */
    public void setDay31(String day31) {
        this._day31 = day31;
    }

    /**
     * データ作成日時を取得する
     *
     * @return データ作成日時
     */
    @XmlElement(required = true, nillable = true)
    public Date getCrtdate() {
        return _crtdate;
    }

    /**
     * データ作成日時を設定する
     *
     * @param crtdate データ作成日時
     */
    public void setCrtdate(Date crtdate) {
        this._crtdate = crtdate;
    }

    /**
     * データ作成者を取得する
     *
     * @return データ作成者
     */
    public String getCrtnm() {
        return _crtnm;
    }

    /**
     * データ作成者を設定する
     *
     * @param crtnm データ作成者
     */
    public void setCrtnm(String crtnm) {
        this._crtnm = crtnm;
    }

    /**
     * 作成プログラムを取得する
     *
     * @return 作成プログラム
     */
    public String getCrtapl() {
        return _crtapl;
    }

    /**
     * 作成プログラムを設定する
     *
     * @param crtapl 作成プログラム
     */
    public void setCrtapl(String crtapl) {
        this._crtapl = crtapl;
    }

    /**
     * 作成担当者IDを取得する
     *
     * @return 作成担当者ID
     */
    public String getCrtid() {
        return _crtid;
    }

    /**
     * 作成担当者IDを設定する
     *
     * @param crtid 作成担当者ID
     */
    public void setCrtid(String crtid) {
        this._crtid = crtid;
    }

    /**
     * データ更新日時を取得する
     *
     * @return データ更新日時
     */
    @XmlElement(required = true, nillable = true)
    public Date getUpddate() {
        return _upddate;
    }

    /**
     * データ更新日時を設定する
     *
     * @param upddate データ更新日時
     */
    public void setUpddate(Date upddate) {
        this._upddate = upddate;
    }

    /**
     * データ更新者を取得する
     *
     * @return データ更新者
     */
    public String getUpdnm() {
        return _updnm;
    }

    /**
     * データ更新者を設定する
     *
     * @param updnm データ更新者
     */
    public void setUpdnm(String updnm) {
        this._updnm = updnm;
    }

    /**
     * 更新プログラムを取得する
     *
     * @return 更新プログラム
     */
    public String getUpdapl() {
        return _updapl;
    }

    /**
     * 更新プログラムを設定する
     *
     * @param updapl 更新プログラム
     */
    public void setUpdapl(String updapl) {
        this._updapl = updapl;
    }

    /**
     * 更新担当者IDを取得する
     *
     * @return 更新担当者ID
     */
    public String getUpdid() {
        return _updid;
    }

    /**
     * 更新担当者IDを設定する
     *
     * @param updid 更新担当者ID
     */
    public void setUpdid(String updid) {
        this._updid = updid;
    }

}
