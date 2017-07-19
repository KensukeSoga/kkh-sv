package jp.co.isid.ham.common.model;

import java.util.List;

import jp.co.isid.ham.integ.tbl.Tbj40TempSozaiContent;
import jp.co.isid.ham.integ.util.HAMPoolConnect;
import jp.co.isid.ham.model.HAMOracleModel;
import jp.co.isid.ham.model.base.HAMException;
import jp.co.isid.nj.exp.UserException;
import jp.co.isid.nj.integ.sql.AbstractSimpleRdbDao;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * 契約仮素材紐付けDAO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2015/10/31 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
public class Tbj40TempSozaiContentDAO extends AbstractSimpleRdbDao {

    /** 検索条件 */
    private Tbj40TempSozaiContentCondition _condition = null;

    /** SqlMode */
    private enum SqlMode { DEFAULT, FIND, INS, UPD, DELVO };
    private SqlMode _sqlMode = SqlMode.DEFAULT;

    /**
     * デフォルトコンストラクタ
     */
    public Tbj40TempSozaiContentDAO() {
        super.setPoolConnectClass(HAMPoolConnect.class);
        super.setDBModelInterface(HAMOracleModel.getInstance());
        super.setBigDecimalMode(true);
    }

    /**
     * プライマリキーを取得する
     *
     * @return String[] プライマリキー
     */
    public String[] getPrimryKeyNames() {
        return new String[] {
                Tbj40TempSozaiContent.TEMPCMCD
                ,Tbj40TempSozaiContent.CTRTKBN
                ,Tbj40TempSozaiContent.CTRTNO
        };
    }

    /**
     * 更新日付フィールドを取得する
     *
     * @return String 更新日付フィールド
     */
    public String getTimeStampKeyName() {
        return Tbj40TempSozaiContent.UPDDATE;
    }

    /**
     * システム日付で更新を行うカラム名の配列を取得する
     *
     * @return システム日付で更新を行うカラム名の配列
     */
    @Override
    public String[] getSystemDateColumnNames() {
        if (_sqlMode.equals(SqlMode.INS)) {
            return new String[] {
                    Tbj40TempSozaiContent.CRTDATE
                    ,Tbj40TempSozaiContent.UPDDATE
            };
        } else if (_sqlMode.equals(SqlMode.UPD)) {
            return new String[] {
                    Tbj40TempSozaiContent.UPDDATE
            };
        } else {
            return new String[] { };
        }
    }

    /**
     * テーブル名を取得する
     *
     * @return String テーブル名
     */
    public String getTableName() {
        return Tbj40TempSozaiContent.TBNAME;
    }

    /**
     * テーブル列名を取得する
     *
     * @return String[] テーブル列名
     */
    public String[] getTableColumnNames() {
        return new String[] {
                Tbj40TempSozaiContent.TEMPCMCD
                ,Tbj40TempSozaiContent.CTRTKBN
                ,Tbj40TempSozaiContent.CTRTNO
                ,Tbj40TempSozaiContent.CRTDATE
                ,Tbj40TempSozaiContent.CRTNM
                ,Tbj40TempSozaiContent.CRTAPL
                ,Tbj40TempSozaiContent.CRTID
                ,Tbj40TempSozaiContent.UPDDATE
                ,Tbj40TempSozaiContent.UPDNM
                ,Tbj40TempSozaiContent.UPDAPL
                ,Tbj40TempSozaiContent.UPDID
        };
    }

    /**
     * AbstractModelの値の設定有無からSQLのWHERE句を生成する
     * @param vo
     * @return
     */
    private String generateWhereByCond(AbstractModel vo)
    {
        StringBuffer sql = new StringBuffer();

        for (int i = 0; i < getTableColumnNames().length; i++) {
            Object value = vo.get(getTableColumnNames()[i]);
            if (value != null) {
                if (sql.length() == 0) {
                    sql.append(" WHERE ");
                } else {
                    sql.append(" AND ");
                }
                sql.append(getTableColumnNames()[i] + " = " + getDBModelInterface().ConvertToDBString(value));
            }
        }

        return sql.toString();
    }

    /**
     * SELECT SQL
     */
    @Override
    public String getSelectSQL() {

        String sql = "";

        if (_sqlMode.equals(SqlMode.FIND)) {
            //Tbj40TempSozaiContentVO取得用SQL取得
            sql = getSelectSQLTbj40TempSozaiContentVO();
        }

        return sql;
    };

    /**
     * SELECT SQL(Tbj40TempSozaiContentVO)
     */
    private String getSelectSQLTbj40TempSozaiContentVO() {

        StringBuffer selectSql = new StringBuffer();
        String whereSqlStr = "";
        StringBuffer orderSql = new StringBuffer();

        selectSql.append(" SELECT");
        for (int i = 0; i < getTableColumnNames().length; i++) {
            selectSql.append((i != 0 ? " ," : " "));
            selectSql.append(getTableColumnNames()[i] + " ");
        }

        selectSql.append(" FROM");
        selectSql.append(" " + getTableName() + " ");

        if (_condition != null) {
            Tbj40TempSozaiContentVO vo = new Tbj40TempSozaiContentVO();
            vo.setTEMPCMCD(_condition.getTempcmcd());
            vo.setCTRTKBN(_condition.getCtrtkbn());
            vo.setCTRTNO(_condition.getCtrtno());
            vo.setCRTDATE(_condition.getCrtdate());
            vo.setCRTNM(_condition.getCrtnm());
            vo.setCRTAPL(_condition.getCrtapl());
            vo.setCRTID(_condition.getCrtid());
            vo.setUPDDATE(_condition.getUpddate());
            vo.setUPDNM(_condition.getUpdnm());
            vo.setUPDAPL(_condition.getUpdapl());
            vo.setUPDID(_condition.getUpdid());
            whereSqlStr = generateWhereByCond(vo);
        }

        orderSql.append(" ORDER BY");
        orderSql.append(" " + Tbj40TempSozaiContent.TEMPCMCD);

        return selectSql.toString() + whereSqlStr + orderSql.toString();
    };

    /**
     * EXEC SQL
     */
    @Override
    public String getExecString() {
        String sql = "";

        if (_sqlMode.equals(SqlMode.DELVO)) {
            sql = getExecStringForDEL();
        }

        return sql.toString();
    }

    /**
     * VOの内容で削除するSQLを作成
     * @return
     */
    private String getExecStringForDEL() {
        StringBuffer sql = new StringBuffer();

        sql.append(" DELETE");
        sql.append(" FROM");
        sql.append(" " + getTableName());

        //WHERE句
        sql.append(generateWhereByCond(getModel()));

        return sql.toString();
    }

    /**
     * VOの内容で削除する
     * @param vo
     * @param cond
     * @throws HAMException
     */
    public void deleteByVo(Tbj40TempSozaiContentVO vo) throws HAMException {

        //パラメータチェック
        if (vo == null) {
            throw new HAMException("更新エラー", "BJ-E0003");
        }

        super.setModel(vo);
        try {
            _sqlMode = SqlMode.DELVO;
            super.exec();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0003");
        }
    }

    /**
     * insertVO
     * @param vo 登録VO
     * @throws HAMException
     */
    public void insertVO(Tbj40TempSozaiContentVO vo) throws HAMException {

        //パラメータチェック
        if (vo == null) {
            throw new HAMException("登録エラー", "BJ-E0002");
        }

        super.setModel(vo);
        _sqlMode = SqlMode.INS;

        try {
            super.insert();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0002");
        }
    }

    /**
     * updateVO
     * @param vo 更新VO
     * @throws HAMException
     */
    public void updateVO(Tbj40TempSozaiContentVO vo) throws HAMException {

        //パラメータチェック
        if (vo == null) {
            throw new HAMException("更新エラー", "BJ-E0003");
        }

        super.setModel(vo);
        _sqlMode = SqlMode.UPD;

        try {
            super.update();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0003");
        }
    }

    /**
     * deleteVO
     * @param vo 削除VO
     * @throws HAMException
     */
    public void deleteVO(Tbj40TempSozaiContentVO vo) throws HAMException {

        //パラメータチェック
        if (vo == null) {
            throw new HAMException("削除エラー", "BJ-E0004");
        }

        super.setModel(vo);

        try {
            super.remove();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0004");
        }
    }

    /**
     * SelectVO
     * @param contion 検索条件
     * @return 取得データ
     * @throws HAMException
     */
    @SuppressWarnings("unchecked")
    public List<Tbj40TempSozaiContentVO> selectVO(Tbj40TempSozaiContentCondition condition) throws HAMException {

        // パラメータチェック
        if (condition == null) {
            throw new HAMException("検索エラー", "BJ-E0001");
        }

        super.setModel(new Tbj40TempSozaiContentVO());
        _condition = condition;
        _sqlMode = SqlMode.FIND;

        try {
            return super.find();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0001");
        }
    }

}
