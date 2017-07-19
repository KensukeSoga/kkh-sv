package jp.co.isid.ham.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * カレンダーマスタ検索条件
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class Mbj21CalendarCondition implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** データ区分 */
    private String _datakbn = null;

    /** カレンダ年月 */
    private String _calendarym = null;

    /** 該当月の1日 */
    private String _gaitoum1 = null;

    /** 該当月の2日 */
    private String _gaitoum2 = null;

    /** 該当月の3日 */
    private String _gaitoum3 = null;

    /** 該当月の4日 */
    private String _gaitoum4 = null;

    /** 該当月の5日 */
    private String _gaitoum5 = null;

    /** 該当月の6日 */
    private String _gaitoum6 = null;

    /** 該当月の7日 */
    private String _gaitoum7 = null;

    /** 該当月の8日 */
    private String _gaitoum8 = null;

    /** 該当月の9日 */
    private String _gaitoum9 = null;

    /** 該当月の10日 */
    private String _gaitoum10 = null;

    /** 該当月の11日 */
    private String _gaitoum11 = null;

    /** 該当月の12日 */
    private String _gaitoum12 = null;

    /** 該当月の13日 */
    private String _gaitoum13 = null;

    /** 該当月の14日 */
    private String _gaitoum14 = null;

    /** 該当月の15日 */
    private String _gaitoum15 = null;

    /** 該当月の16日 */
    private String _gaitoum16 = null;

    /** 該当月の17日 */
    private String _gaitoum17 = null;

    /** 該当月の18日 */
    private String _gaitoum18 = null;

    /** 該当月の19日 */
    private String _gaitoum19 = null;

    /** 該当月の20日 */
    private String _gaitoum20 = null;

    /** 該当月の21日 */
    private String _gaitoum21 = null;

    /** 該当月の22日 */
    private String _gaitoum22 = null;

    /** 該当月の23日 */
    private String _gaitoum23 = null;

    /** 該当月の24日 */
    private String _gaitoum24 = null;

    /** 該当月の25日 */
    private String _gaitoum25 = null;

    /** 該当月の26日 */
    private String _gaitoum26 = null;

    /** 該当月の27日 */
    private String _gaitoum27 = null;

    /** 該当月の28日 */
    private String _gaitoum28 = null;

    /** 該当月の29日 */
    private String _gaitoum29 = null;

    /** 該当月の30日 */
    private String _gaitoum30 = null;

    /** 該当月の31日 */
    private String _gaitoum31 = null;

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
    public Mbj21CalendarCondition() {
    }

    /**
     * データ区分を取得する
     *
     * @return データ区分
     */
    public String getDatakbn() {
        return _datakbn;
    }

    /**
     * データ区分を設定する
     *
     * @param datakbn データ区分
     */
    public void setDatakbn(String datakbn) {
        this._datakbn = datakbn;
    }

    /**
     * カレンダ年月を取得する
     *
     * @return カレンダ年月
     */
    public String getCalendarym() {
        return _calendarym;
    }

    /**
     * カレンダ年月を設定する
     *
     * @param calendarym カレンダ年月
     */
    public void setCalendarym(String calendarym) {
        this._calendarym = calendarym;
    }

    /**
     * 該当月の1日を取得する
     *
     * @return 該当月の1日
     */
    public String getGaitoum1() {
        return _gaitoum1;
    }

    /**
     * 該当月の1日を設定する
     *
     * @param gaitoum1 該当月の1日
     */
    public void setGaitoum1(String gaitoum1) {
        this._gaitoum1 = gaitoum1;
    }

    /**
     * 該当月の2日を取得する
     *
     * @return 該当月の2日
     */
    public String getGaitoum2() {
        return _gaitoum2;
    }

    /**
     * 該当月の2日を設定する
     *
     * @param gaitoum2 該当月の2日
     */
    public void setGaitoum2(String gaitoum2) {
        this._gaitoum2 = gaitoum2;
    }

    /**
     * 該当月の3日を取得する
     *
     * @return 該当月の3日
     */
    public String getGaitoum3() {
        return _gaitoum3;
    }

    /**
     * 該当月の3日を設定する
     *
     * @param gaitoum3 該当月の3日
     */
    public void setGaitoum3(String gaitoum3) {
        this._gaitoum3 = gaitoum3;
    }

    /**
     * 該当月の4日を取得する
     *
     * @return 該当月の4日
     */
    public String getGaitoum4() {
        return _gaitoum4;
    }

    /**
     * 該当月の4日を設定する
     *
     * @param gaitoum4 該当月の4日
     */
    public void setGaitoum4(String gaitoum4) {
        this._gaitoum4 = gaitoum4;
    }

    /**
     * 該当月の5日を取得する
     *
     * @return 該当月の5日
     */
    public String getGaitoum5() {
        return _gaitoum5;
    }

    /**
     * 該当月の5日を設定する
     *
     * @param gaitoum5 該当月の5日
     */
    public void setGaitoum5(String gaitoum5) {
        this._gaitoum5 = gaitoum5;
    }

    /**
     * 該当月の6日を取得する
     *
     * @return 該当月の6日
     */
    public String getGaitoum6() {
        return _gaitoum6;
    }

    /**
     * 該当月の6日を設定する
     *
     * @param gaitoum6 該当月の6日
     */
    public void setGaitoum6(String gaitoum6) {
        this._gaitoum6 = gaitoum6;
    }

    /**
     * 該当月の7日を取得する
     *
     * @return 該当月の7日
     */
    public String getGaitoum7() {
        return _gaitoum7;
    }

    /**
     * 該当月の7日を設定する
     *
     * @param gaitoum7 該当月の7日
     */
    public void setGaitoum7(String gaitoum7) {
        this._gaitoum7 = gaitoum7;
    }

    /**
     * 該当月の8日を取得する
     *
     * @return 該当月の8日
     */
    public String getGaitoum8() {
        return _gaitoum8;
    }

    /**
     * 該当月の8日を設定する
     *
     * @param gaitoum8 該当月の8日
     */
    public void setGaitoum8(String gaitoum8) {
        this._gaitoum8 = gaitoum8;
    }

    /**
     * 該当月の9日を取得する
     *
     * @return 該当月の9日
     */
    public String getGaitoum9() {
        return _gaitoum9;
    }

    /**
     * 該当月の9日を設定する
     *
     * @param gaitoum9 該当月の9日
     */
    public void setGaitoum9(String gaitoum9) {
        this._gaitoum9 = gaitoum9;
    }

    /**
     * 該当月の10日を取得する
     *
     * @return 該当月の10日
     */
    public String getGaitoum10() {
        return _gaitoum10;
    }

    /**
     * 該当月の10日を設定する
     *
     * @param gaitoum10 該当月の10日
     */
    public void setGaitoum10(String gaitoum10) {
        this._gaitoum10 = gaitoum10;
    }

    /**
     * 該当月の11日を取得する
     *
     * @return 該当月の11日
     */
    public String getGaitoum11() {
        return _gaitoum11;
    }

    /**
     * 該当月の11日を設定する
     *
     * @param gaitoum11 該当月の11日
     */
    public void setGaitoum11(String gaitoum11) {
        this._gaitoum11 = gaitoum11;
    }

    /**
     * 該当月の12日を取得する
     *
     * @return 該当月の12日
     */
    public String getGaitoum12() {
        return _gaitoum12;
    }

    /**
     * 該当月の12日を設定する
     *
     * @param gaitoum12 該当月の12日
     */
    public void setGaitoum12(String gaitoum12) {
        this._gaitoum12 = gaitoum12;
    }

    /**
     * 該当月の13日を取得する
     *
     * @return 該当月の13日
     */
    public String getGaitoum13() {
        return _gaitoum13;
    }

    /**
     * 該当月の13日を設定する
     *
     * @param gaitoum13 該当月の13日
     */
    public void setGaitoum13(String gaitoum13) {
        this._gaitoum13 = gaitoum13;
    }

    /**
     * 該当月の14日を取得する
     *
     * @return 該当月の14日
     */
    public String getGaitoum14() {
        return _gaitoum14;
    }

    /**
     * 該当月の14日を設定する
     *
     * @param gaitoum14 該当月の14日
     */
    public void setGaitoum14(String gaitoum14) {
        this._gaitoum14 = gaitoum14;
    }

    /**
     * 該当月の15日を取得する
     *
     * @return 該当月の15日
     */
    public String getGaitoum15() {
        return _gaitoum15;
    }

    /**
     * 該当月の15日を設定する
     *
     * @param gaitoum15 該当月の15日
     */
    public void setGaitoum15(String gaitoum15) {
        this._gaitoum15 = gaitoum15;
    }

    /**
     * 該当月の16日を取得する
     *
     * @return 該当月の16日
     */
    public String getGaitoum16() {
        return _gaitoum16;
    }

    /**
     * 該当月の16日を設定する
     *
     * @param gaitoum16 該当月の16日
     */
    public void setGaitoum16(String gaitoum16) {
        this._gaitoum16 = gaitoum16;
    }

    /**
     * 該当月の17日を取得する
     *
     * @return 該当月の17日
     */
    public String getGaitoum17() {
        return _gaitoum17;
    }

    /**
     * 該当月の17日を設定する
     *
     * @param gaitoum17 該当月の17日
     */
    public void setGaitoum17(String gaitoum17) {
        this._gaitoum17 = gaitoum17;
    }

    /**
     * 該当月の18日を取得する
     *
     * @return 該当月の18日
     */
    public String getGaitoum18() {
        return _gaitoum18;
    }

    /**
     * 該当月の18日を設定する
     *
     * @param gaitoum18 該当月の18日
     */
    public void setGaitoum18(String gaitoum18) {
        this._gaitoum18 = gaitoum18;
    }

    /**
     * 該当月の19日を取得する
     *
     * @return 該当月の19日
     */
    public String getGaitoum19() {
        return _gaitoum19;
    }

    /**
     * 該当月の19日を設定する
     *
     * @param gaitoum19 該当月の19日
     */
    public void setGaitoum19(String gaitoum19) {
        this._gaitoum19 = gaitoum19;
    }

    /**
     * 該当月の20日を取得する
     *
     * @return 該当月の20日
     */
    public String getGaitoum20() {
        return _gaitoum20;
    }

    /**
     * 該当月の20日を設定する
     *
     * @param gaitoum20 該当月の20日
     */
    public void setGaitoum20(String gaitoum20) {
        this._gaitoum20 = gaitoum20;
    }

    /**
     * 該当月の21日を取得する
     *
     * @return 該当月の21日
     */
    public String getGaitoum21() {
        return _gaitoum21;
    }

    /**
     * 該当月の21日を設定する
     *
     * @param gaitoum21 該当月の21日
     */
    public void setGaitoum21(String gaitoum21) {
        this._gaitoum21 = gaitoum21;
    }

    /**
     * 該当月の22日を取得する
     *
     * @return 該当月の22日
     */
    public String getGaitoum22() {
        return _gaitoum22;
    }

    /**
     * 該当月の22日を設定する
     *
     * @param gaitoum22 該当月の22日
     */
    public void setGaitoum22(String gaitoum22) {
        this._gaitoum22 = gaitoum22;
    }

    /**
     * 該当月の23日を取得する
     *
     * @return 該当月の23日
     */
    public String getGaitoum23() {
        return _gaitoum23;
    }

    /**
     * 該当月の23日を設定する
     *
     * @param gaitoum23 該当月の23日
     */
    public void setGaitoum23(String gaitoum23) {
        this._gaitoum23 = gaitoum23;
    }

    /**
     * 該当月の24日を取得する
     *
     * @return 該当月の24日
     */
    public String getGaitoum24() {
        return _gaitoum24;
    }

    /**
     * 該当月の24日を設定する
     *
     * @param gaitoum24 該当月の24日
     */
    public void setGaitoum24(String gaitoum24) {
        this._gaitoum24 = gaitoum24;
    }

    /**
     * 該当月の25日を取得する
     *
     * @return 該当月の25日
     */
    public String getGaitoum25() {
        return _gaitoum25;
    }

    /**
     * 該当月の25日を設定する
     *
     * @param gaitoum25 該当月の25日
     */
    public void setGaitoum25(String gaitoum25) {
        this._gaitoum25 = gaitoum25;
    }

    /**
     * 該当月の26日を取得する
     *
     * @return 該当月の26日
     */
    public String getGaitoum26() {
        return _gaitoum26;
    }

    /**
     * 該当月の26日を設定する
     *
     * @param gaitoum26 該当月の26日
     */
    public void setGaitoum26(String gaitoum26) {
        this._gaitoum26 = gaitoum26;
    }

    /**
     * 該当月の27日を取得する
     *
     * @return 該当月の27日
     */
    public String getGaitoum27() {
        return _gaitoum27;
    }

    /**
     * 該当月の27日を設定する
     *
     * @param gaitoum27 該当月の27日
     */
    public void setGaitoum27(String gaitoum27) {
        this._gaitoum27 = gaitoum27;
    }

    /**
     * 該当月の28日を取得する
     *
     * @return 該当月の28日
     */
    public String getGaitoum28() {
        return _gaitoum28;
    }

    /**
     * 該当月の28日を設定する
     *
     * @param gaitoum28 該当月の28日
     */
    public void setGaitoum28(String gaitoum28) {
        this._gaitoum28 = gaitoum28;
    }

    /**
     * 該当月の29日を取得する
     *
     * @return 該当月の29日
     */
    public String getGaitoum29() {
        return _gaitoum29;
    }

    /**
     * 該当月の29日を設定する
     *
     * @param gaitoum29 該当月の29日
     */
    public void setGaitoum29(String gaitoum29) {
        this._gaitoum29 = gaitoum29;
    }

    /**
     * 該当月の30日を取得する
     *
     * @return 該当月の30日
     */
    public String getGaitoum30() {
        return _gaitoum30;
    }

    /**
     * 該当月の30日を設定する
     *
     * @param gaitoum30 該当月の30日
     */
    public void setGaitoum30(String gaitoum30) {
        this._gaitoum30 = gaitoum30;
    }

    /**
     * 該当月の31日を取得する
     *
     * @return 該当月の31日
     */
    public String getGaitoum31() {
        return _gaitoum31;
    }

    /**
     * 該当月の31日を設定する
     *
     * @param gaitoum31 該当月の31日
     */
    public void setGaitoum31(String gaitoum31) {
        this._gaitoum31 = gaitoum31;
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
