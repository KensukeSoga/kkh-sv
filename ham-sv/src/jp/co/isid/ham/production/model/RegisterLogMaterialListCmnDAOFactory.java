package jp.co.isid.ham.production.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.nj.integ.DaoFactory;

/**
*
* <P>xxx<P>
* <B>修正履歴</B><BR>
* ・新規作成(2016/03/10 HDX対応 HLC K.Soga)<BR>
* </P>
* @author
*/
@XmlRootElement(namespace = "http://model.production.ham.isid.co.jp/")
@XmlType(namespace = "http://model.production.ham.isid.co.jp/")
public class RegisterLogMaterialListCmnDAOFactory extends DaoFactory {

	/**
	 * インスタンス禁止のため、privateにて実装
	 */
	private RegisterLogMaterialListCmnDAOFactory() {

	}

	/**
	 * RegisterLogMaterialListCmnDAOを取得します
	 * @return
	 */
	public static RegisterLogMaterialListCmnDAO createLogMaterialListCmnDAO() {
		return (RegisterLogMaterialListCmnDAO) DaoFactory.createDao(RegisterLogMaterialListCmnDAO.class);
	}
}
