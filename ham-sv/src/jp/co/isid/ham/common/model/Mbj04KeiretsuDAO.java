package jp.co.isid.ham.common.model;

import java.util.List;

import jp.co.isid.nj.integ.ConcurrentUpdateException;
import jp.co.isid.nj.integ.UpdateFailureException;
import jp.co.isid.ham.integ.tbl.Mbj04Keiretsu;
import jp.co.isid.ham.integ.util.HAMPoolConnect;
import jp.co.isid.ham.model.HAMOracleModel;
import jp.co.isid.ham.model.base.HAMException;
import jp.co.isid.nj.exp.UserException;
import jp.co.isid.nj.integ.sql.AbstractSimpleRdbDao;
import jp.co.isid.nj.model.AbstractModel;

/**
 * <P>
 * 系列マスタDAO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/11/29 新HAMチーム)<BR>
 * </P>
 * @author 新HAMチーム
 */
public class Mbj04KeiretsuDAO extends AbstractSimpleRdbDao {

    /** 検索条件 */
    private Mbj04KeiretsuCondition _condition = null;

    /**
     * デフォルトコンストラクタ
     */
    public Mbj04KeiretsuDAO() {
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
                Mbj04Keiretsu.KEIRETSUCD
        };
    }

    /**
     * 更新日付フィールドを取得する
     *
     * @return String 更新日付フィールド
     */
    public String getTimeStampKeyName() {
        return Mbj04Keiretsu.UPDDATE;
    }

    /**
     * システム日付で更新を行うカラム名の配列を取得する
     *
     * @return システム日付で更新を行うカラム名の配列
     */
    @Override
    public String[] getSystemDateColumnNames() {
        return new String[] {
                Mbj04Keiretsu.UPDDATE
        };
    }

    /**
     * テーブル名を取得する
     *
     * @return String テーブル名
     */
    public String getTableName() {
        return Mbj04Keiretsu.TBNAME;
    }

    /**
     * テーブル列名を取得する
     *
     * @return String[] テーブル列名
     */
    public String[] getTableColumnNames() {
        return new String[] {
                Mbj04Keiretsu.KEIRETSUCD
                ,Mbj04Keiretsu.KEIRETSUNM
                ,Mbj04Keiretsu.KEIRETSUSNM
                ,Mbj04Keiretsu.SORTNO
                ,Mbj04Keiretsu.UPDDATE
                ,Mbj04Keiretsu.UPDNM
                ,Mbj04Keiretsu.UPDAPL
                ,Mbj04Keiretsu.UPDID
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
    public String getSelectSQL()
    {
        String sql = "";

        if (super.getModel() instanceof Mbj04KeiretsuVO)
        {
            // Mbj04KeiretsuVO取得用SQL取得
            sql = getSelectSQLMbj04KeiretsuVO();
        }

        return sql;

    };

    /**
     * SELECT SQL（Mbj04KeiretsuVO）
     */
    private String getSelectSQLMbj04KeiretsuVO()
    {
        StringBuffer selectSql = new StringBuffer();
        String whereSqlStr = "";
        StringBuffer orderSql = new StringBuffer();

        //*******************************************
        //load()、find()で使用されるSELECT + FROM句のSQL
        //*******************************************
        selectSql.append(" SELECT ");
        for (int i = 0; i < getTableColumnNames().length; i++) {
            selectSql.append((i != 0 ? " ," : " "));
            selectSql.append(getTableColumnNames()[i] + " ");
        }
        selectSql.append(" FROM ");
        selectSql.append(" " + getTableName() + " ");

        if (_condition != null)
        {
            Mbj04KeiretsuVO vo = new Mbj04KeiretsuVO();
            vo.setKEIRETSUCD(_condition.getKeiretsucd());
            vo.setKEIRETSUNM(_condition.getKeiretsunm());
            vo.setKEIRETSUSNM(_condition.getKeiretsusnm());
            vo.setSORTNO(_condition.getSortno());
            vo.setUPDDATE(_condition.getUpddate());
            vo.setUPDAPL(_condition.getUpdapl());
            vo.setUPDNM(_condition.getUpdnm());
            vo.setUPDID(_condition.getUpdid());
            whereSqlStr = generateWhereByCond(vo);

        }

        orderSql.append(" ORDER BY ");
        orderSql.append(" " + Mbj04Keiretsu.SORTNO + ","+ Mbj04Keiretsu.KEIRETSUCD + " ");

        return selectSql.toString() + whereSqlStr + orderSql.toString();
    };

    /**
     * InsertVO
     * @param vo データ
     * @throws HAMException
     */
    public void insertVO(Mbj04KeiretsuVO vo) throws HAMException
    {
        // パラメータチェック
        if (vo == null)
        {
            throw new HAMException("登録エラー", "BJ-E0002");
        }
        super.setModel(vo);

        try
        {
            if (!super.insert())
            {
                throw new HAMException("登録エラー", "BJ-E0002");
            }
        }
        catch(UserException e)
        {
            throw new HAMException(e.getMessage(), "BJ-E0002");
        }

    }

    /**
     * UpdateVO
     * @param vo データ
     * @throws HAMException
     */
    public void updateVO(Mbj04KeiretsuVO vo) throws HAMException
    {
        // パラメータチェック
        if (vo == null)
        {
            throw new HAMException("更新エラー", "BJ-E0003");
        }
        super.setModel(vo);

        try
        {
            if (!super.update())
            {
                throw new HAMException("更新エラー", "BJ-E0003");
            }
        }
        catch(UserException e)
        {
            throw new HAMException(e.getMessage(), "BJ-E0003");
        }

    }

    /**
     * DeleteVO
     * @param vo データ
     * @throws HAMException
     */
    public void deleteVO(Mbj04KeiretsuVO vo) throws HAMException
    {
        // パラメータチェック
        if (vo == null)
        {
            throw new HAMException("削除エラー", "BJ-E0004");
        }
        super.setModel(vo);

        try
        {
            if (!super.remove())
            {
                throw new HAMException("削除エラー", "BJ-E0004");
            }
        }
        catch(ConcurrentUpdateException e)
        {   // 処理件数「0」の場合
            return;   // 正常とする（削除レコードなし）
        }
        catch(UpdateFailureException e)
        {   // 処理件数「2以上」の場合
            return;   // 正常とする
        }
        catch(UserException e)
        {
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
    public List<Mbj04KeiretsuVO> selectVO(Mbj04KeiretsuCondition condition) throws HAMException
    {
        // パラメータチェック
        if (condition == null)
        {
            throw new HAMException("検索エラー", "BJ-E0001");
        }

        super.setModel(new Mbj04KeiretsuVO());
        _condition = condition;

        try
        {
            return super.find();
        }
        catch (UserException e)
        {
            throw new HAMException(e.getMessage(), "BJ-E0001");
        }
    }

    /**
     * PK検索
     * @param vo
     * @return
     * @throws HAMException
     */
    public Mbj04KeiretsuVO loadVO(Mbj04KeiretsuVO vo) throws HAMException {
        //パラメータチェック
        if (vo == null) {
            throw new HAMException("検索エラー", "BJ-E0001");
        }
        super.setModel(vo);
        try {
            return (Mbj04KeiretsuVO)super.load();
        } catch (UserException e) {
            throw new HAMException(e.getMessage(), "BJ-E0001");
        }
    }

}
