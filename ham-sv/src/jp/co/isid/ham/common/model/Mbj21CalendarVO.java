package jp.co.isid.ham.common.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.ham.integ.tbl.Mbj21Calendar;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * カレンダーマスタVO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
@XmlRootElement(namespace = "http://model.common.ham.isid.co.jp/")
@XmlType(namespace = "http://model.common.ham.isid.co.jp/")
public class Mbj21CalendarVO extends AbstractModel {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * デフォルトコンストラクタ
     */
    public Mbj21CalendarVO() {
    }

    /**
     * 新規インスタンスを生成する
     *
     * @return 新規インスタンス
     */
    public Object newInstance() {
        return new Mbj21CalendarVO();
    }

    /**
     * データ区分を取得する
     *
     * @return データ区分
     */
    public String getDATAKBN() {
        return (String) get(Mbj21Calendar.DATAKBN);
    }

    /**
     * データ区分を設定する
     *
     * @param val データ区分
     */
    public void setDATAKBN(String val) {
        set(Mbj21Calendar.DATAKBN, val);
    }

    /**
     * カレンダ年月を取得する
     *
     * @return カレンダ年月
     */
    public String getCALENDARYM() {
        return (String) get(Mbj21Calendar.CALENDARYM);
    }

    /**
     * カレンダ年月を設定する
     *
     * @param val カレンダ年月
     */
    public void setCALENDARYM(String val) {
        set(Mbj21Calendar.CALENDARYM, val);
    }

    /**
     * 該当月の1日を取得する
     *
     * @return 該当月の1日
     */
    public String getGAITOUM1() {
        return (String) get(Mbj21Calendar.GAITOUM1);
    }

    /**
     * 該当月の1日を設定する
     *
     * @param val 該当月の1日
     */
    public void setGAITOUM1(String val) {
        set(Mbj21Calendar.GAITOUM1, val);
    }

    /**
     * 該当月の2日を取得する
     *
     * @return 該当月の2日
     */
    public String getGAITOUM2() {
        return (String) get(Mbj21Calendar.GAITOUM2);
    }

    /**
     * 該当月の2日を設定する
     *
     * @param val 該当月の2日
     */
    public void setGAITOUM2(String val) {
        set(Mbj21Calendar.GAITOUM2, val);
    }

    /**
     * 該当月の3日を取得する
     *
     * @return 該当月の3日
     */
    public String getGAITOUM3() {
        return (String) get(Mbj21Calendar.GAITOUM3);
    }

    /**
     * 該当月の3日を設定する
     *
     * @param val 該当月の3日
     */
    public void setGAITOUM3(String val) {
        set(Mbj21Calendar.GAITOUM3, val);
    }

    /**
     * 該当月の4日を取得する
     *
     * @return 該当月の4日
     */
    public String getGAITOUM4() {
        return (String) get(Mbj21Calendar.GAITOUM4);
    }

    /**
     * 該当月の4日を設定する
     *
     * @param val 該当月の4日
     */
    public void setGAITOUM4(String val) {
        set(Mbj21Calendar.GAITOUM4, val);
    }

    /**
     * 該当月の5日を取得する
     *
     * @return 該当月の5日
     */
    public String getGAITOUM5() {
        return (String) get(Mbj21Calendar.GAITOUM5);
    }

    /**
     * 該当月の5日を設定する
     *
     * @param val 該当月の5日
     */
    public void setGAITOUM5(String val) {
        set(Mbj21Calendar.GAITOUM5, val);
    }

    /**
     * 該当月の6日を取得する
     *
     * @return 該当月の6日
     */
    public String getGAITOUM6() {
        return (String) get(Mbj21Calendar.GAITOUM6);
    }

    /**
     * 該当月の6日を設定する
     *
     * @param val 該当月の6日
     */
    public void setGAITOUM6(String val) {
        set(Mbj21Calendar.GAITOUM6, val);
    }

    /**
     * 該当月の7日を取得する
     *
     * @return 該当月の7日
     */
    public String getGAITOUM7() {
        return (String) get(Mbj21Calendar.GAITOUM7);
    }

    /**
     * 該当月の7日を設定する
     *
     * @param val 該当月の7日
     */
    public void setGAITOUM7(String val) {
        set(Mbj21Calendar.GAITOUM7, val);
    }

    /**
     * 該当月の8日を取得する
     *
     * @return 該当月の8日
     */
    public String getGAITOUM8() {
        return (String) get(Mbj21Calendar.GAITOUM8);
    }

    /**
     * 該当月の8日を設定する
     *
     * @param val 該当月の8日
     */
    public void setGAITOUM8(String val) {
        set(Mbj21Calendar.GAITOUM8, val);
    }

    /**
     * 該当月の9日を取得する
     *
     * @return 該当月の9日
     */
    public String getGAITOUM9() {
        return (String) get(Mbj21Calendar.GAITOUM9);
    }

    /**
     * 該当月の9日を設定する
     *
     * @param val 該当月の9日
     */
    public void setGAITOUM9(String val) {
        set(Mbj21Calendar.GAITOUM9, val);
    }

    /**
     * 該当月の10日を取得する
     *
     * @return 該当月の10日
     */
    public String getGAITOUM10() {
        return (String) get(Mbj21Calendar.GAITOUM10);
    }

    /**
     * 該当月の10日を設定する
     *
     * @param val 該当月の10日
     */
    public void setGAITOUM10(String val) {
        set(Mbj21Calendar.GAITOUM10, val);
    }

    /**
     * 該当月の11日を取得する
     *
     * @return 該当月の11日
     */
    public String getGAITOUM11() {
        return (String) get(Mbj21Calendar.GAITOUM11);
    }

    /**
     * 該当月の11日を設定する
     *
     * @param val 該当月の11日
     */
    public void setGAITOUM11(String val) {
        set(Mbj21Calendar.GAITOUM11, val);
    }

    /**
     * 該当月の12日を取得する
     *
     * @return 該当月の12日
     */
    public String getGAITOUM12() {
        return (String) get(Mbj21Calendar.GAITOUM12);
    }

    /**
     * 該当月の12日を設定する
     *
     * @param val 該当月の12日
     */
    public void setGAITOUM12(String val) {
        set(Mbj21Calendar.GAITOUM12, val);
    }

    /**
     * 該当月の13日を取得する
     *
     * @return 該当月の13日
     */
    public String getGAITOUM13() {
        return (String) get(Mbj21Calendar.GAITOUM13);
    }

    /**
     * 該当月の13日を設定する
     *
     * @param val 該当月の13日
     */
    public void setGAITOUM13(String val) {
        set(Mbj21Calendar.GAITOUM13, val);
    }

    /**
     * 該当月の14日を取得する
     *
     * @return 該当月の14日
     */
    public String getGAITOUM14() {
        return (String) get(Mbj21Calendar.GAITOUM14);
    }

    /**
     * 該当月の14日を設定する
     *
     * @param val 該当月の14日
     */
    public void setGAITOUM14(String val) {
        set(Mbj21Calendar.GAITOUM14, val);
    }

    /**
     * 該当月の15日を取得する
     *
     * @return 該当月の15日
     */
    public String getGAITOUM15() {
        return (String) get(Mbj21Calendar.GAITOUM15);
    }

    /**
     * 該当月の15日を設定する
     *
     * @param val 該当月の15日
     */
    public void setGAITOUM15(String val) {
        set(Mbj21Calendar.GAITOUM15, val);
    }

    /**
     * 該当月の16日を取得する
     *
     * @return 該当月の16日
     */
    public String getGAITOUM16() {
        return (String) get(Mbj21Calendar.GAITOUM16);
    }

    /**
     * 該当月の16日を設定する
     *
     * @param val 該当月の16日
     */
    public void setGAITOUM16(String val) {
        set(Mbj21Calendar.GAITOUM16, val);
    }

    /**
     * 該当月の17日を取得する
     *
     * @return 該当月の17日
     */
    public String getGAITOUM17() {
        return (String) get(Mbj21Calendar.GAITOUM17);
    }

    /**
     * 該当月の17日を設定する
     *
     * @param val 該当月の17日
     */
    public void setGAITOUM17(String val) {
        set(Mbj21Calendar.GAITOUM17, val);
    }

    /**
     * 該当月の18日を取得する
     *
     * @return 該当月の18日
     */
    public String getGAITOUM18() {
        return (String) get(Mbj21Calendar.GAITOUM18);
    }

    /**
     * 該当月の18日を設定する
     *
     * @param val 該当月の18日
     */
    public void setGAITOUM18(String val) {
        set(Mbj21Calendar.GAITOUM18, val);
    }

    /**
     * 該当月の19日を取得する
     *
     * @return 該当月の19日
     */
    public String getGAITOUM19() {
        return (String) get(Mbj21Calendar.GAITOUM19);
    }

    /**
     * 該当月の19日を設定する
     *
     * @param val 該当月の19日
     */
    public void setGAITOUM19(String val) {
        set(Mbj21Calendar.GAITOUM19, val);
    }

    /**
     * 該当月の20日を取得する
     *
     * @return 該当月の20日
     */
    public String getGAITOUM20() {
        return (String) get(Mbj21Calendar.GAITOUM20);
    }

    /**
     * 該当月の20日を設定する
     *
     * @param val 該当月の20日
     */
    public void setGAITOUM20(String val) {
        set(Mbj21Calendar.GAITOUM20, val);
    }

    /**
     * 該当月の21日を取得する
     *
     * @return 該当月の21日
     */
    public String getGAITOUM21() {
        return (String) get(Mbj21Calendar.GAITOUM21);
    }

    /**
     * 該当月の21日を設定する
     *
     * @param val 該当月の21日
     */
    public void setGAITOUM21(String val) {
        set(Mbj21Calendar.GAITOUM21, val);
    }

    /**
     * 該当月の22日を取得する
     *
     * @return 該当月の22日
     */
    public String getGAITOUM22() {
        return (String) get(Mbj21Calendar.GAITOUM22);
    }

    /**
     * 該当月の22日を設定する
     *
     * @param val 該当月の22日
     */
    public void setGAITOUM22(String val) {
        set(Mbj21Calendar.GAITOUM22, val);
    }

    /**
     * 該当月の23日を取得する
     *
     * @return 該当月の23日
     */
    public String getGAITOUM23() {
        return (String) get(Mbj21Calendar.GAITOUM23);
    }

    /**
     * 該当月の23日を設定する
     *
     * @param val 該当月の23日
     */
    public void setGAITOUM23(String val) {
        set(Mbj21Calendar.GAITOUM23, val);
    }

    /**
     * 該当月の24日を取得する
     *
     * @return 該当月の24日
     */
    public String getGAITOUM24() {
        return (String) get(Mbj21Calendar.GAITOUM24);
    }

    /**
     * 該当月の24日を設定する
     *
     * @param val 該当月の24日
     */
    public void setGAITOUM24(String val) {
        set(Mbj21Calendar.GAITOUM24, val);
    }

    /**
     * 該当月の25日を取得する
     *
     * @return 該当月の25日
     */
    public String getGAITOUM25() {
        return (String) get(Mbj21Calendar.GAITOUM25);
    }

    /**
     * 該当月の25日を設定する
     *
     * @param val 該当月の25日
     */
    public void setGAITOUM25(String val) {
        set(Mbj21Calendar.GAITOUM25, val);
    }

    /**
     * 該当月の26日を取得する
     *
     * @return 該当月の26日
     */
    public String getGAITOUM26() {
        return (String) get(Mbj21Calendar.GAITOUM26);
    }

    /**
     * 該当月の26日を設定する
     *
     * @param val 該当月の26日
     */
    public void setGAITOUM26(String val) {
        set(Mbj21Calendar.GAITOUM26, val);
    }

    /**
     * 該当月の27日を取得する
     *
     * @return 該当月の27日
     */
    public String getGAITOUM27() {
        return (String) get(Mbj21Calendar.GAITOUM27);
    }

    /**
     * 該当月の27日を設定する
     *
     * @param val 該当月の27日
     */
    public void setGAITOUM27(String val) {
        set(Mbj21Calendar.GAITOUM27, val);
    }

    /**
     * 該当月の28日を取得する
     *
     * @return 該当月の28日
     */
    public String getGAITOUM28() {
        return (String) get(Mbj21Calendar.GAITOUM28);
    }

    /**
     * 該当月の28日を設定する
     *
     * @param val 該当月の28日
     */
    public void setGAITOUM28(String val) {
        set(Mbj21Calendar.GAITOUM28, val);
    }

    /**
     * 該当月の29日を取得する
     *
     * @return 該当月の29日
     */
    public String getGAITOUM29() {
        return (String) get(Mbj21Calendar.GAITOUM29);
    }

    /**
     * 該当月の29日を設定する
     *
     * @param val 該当月の29日
     */
    public void setGAITOUM29(String val) {
        set(Mbj21Calendar.GAITOUM29, val);
    }

    /**
     * 該当月の30日を取得する
     *
     * @return 該当月の30日
     */
    public String getGAITOUM30() {
        return (String) get(Mbj21Calendar.GAITOUM30);
    }

    /**
     * 該当月の30日を設定する
     *
     * @param val 該当月の30日
     */
    public void setGAITOUM30(String val) {
        set(Mbj21Calendar.GAITOUM30, val);
    }

    /**
     * 該当月の31日を取得する
     *
     * @return 該当月の31日
     */
    public String getGAITOUM31() {
        return (String) get(Mbj21Calendar.GAITOUM31);
    }

    /**
     * 該当月の31日を設定する
     *
     * @param val 該当月の31日
     */
    public void setGAITOUM31(String val) {
        set(Mbj21Calendar.GAITOUM31, val);
    }

    /**
     * データ更新日時を取得する
     *
     * @return データ更新日時
     */
    @XmlElement(required = true, nillable = true)
    public Date getUPDDATE() {
        return (Date) get(Mbj21Calendar.UPDDATE);
    }

    /**
     * データ更新日時を設定する
     *
     * @param val データ更新日時
     */
    public void setUPDDATE(Date val) {
        set(Mbj21Calendar.UPDDATE, val);
    }

    /**
     * データ更新者を取得する
     *
     * @return データ更新者
     */
    public String getUPDNM() {
        return (String) get(Mbj21Calendar.UPDNM);
    }

    /**
     * データ更新者を設定する
     *
     * @param val データ更新者
     */
    public void setUPDNM(String val) {
        set(Mbj21Calendar.UPDNM, val);
    }

    /**
     * 更新プログラムを取得する
     *
     * @return 更新プログラム
     */
    public String getUPDAPL() {
        return (String) get(Mbj21Calendar.UPDAPL);
    }

    /**
     * 更新プログラムを設定する
     *
     * @param val 更新プログラム
     */
    public void setUPDAPL(String val) {
        set(Mbj21Calendar.UPDAPL, val);
    }

    /**
     * 更新担当者IDを取得する
     *
     * @return 更新担当者ID
     */
    public String getUPDID() {
        return (String) get(Mbj21Calendar.UPDID);
    }

    /**
     * 更新担当者IDを設定する
     *
     * @param val 更新担当者ID
     */
    public void setUPDID(String val) {
        set(Mbj21Calendar.UPDID, val);
    }

}
