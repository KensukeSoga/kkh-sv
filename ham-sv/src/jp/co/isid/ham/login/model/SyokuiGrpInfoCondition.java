package jp.co.isid.ham.login.model;

import java.io.Serializable;

public class SyokuiGrpInfoCondition implements Serializable{

	private static final long serialVersionUID = 4082004138863641700L;

	/** ESQID */
	private String _esqId = null;

	/** 営業日 */
	private String _eigyobi = null;

	/**
	 * ESQIDを取得する
	 * @return ESQID
	 */
	public String getEsqId() {
	    return _esqId;
	}

	/**
	 * ESQIDを設定する
	 * @param esqId ESQID
	 */
	public void setEsqId(String esqId) {
	    this._esqId = esqId;
	}

	/**
	 * 営業日を取得する
	 * @return 営業日
	 */
	public String getEigyobi() {
	    return _eigyobi;
	}

	/**
	 * 営業日を設定する
	 * @param eigyobi 営業日
	 */
	public void setEigyobi(String eigyobi) {
	    this._eigyobi = eigyobi;
	}
}
