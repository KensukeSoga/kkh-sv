package jp.co.isid.ham.media.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <P>
 * cÆìÆä  [õNX
 * </P>
 * <P>
 * <B>C³ð</B><BR>
 * EVKì¬(2012/12/20 HLC H.Watabe)<BR>
 * </P>
 * @author HLC H.Watabe
 */
@XmlRootElement(namespace = "http://model.media.ham.isid.co.jp/")
@XmlType(namespace = "http://model.media.ham.isid.co.jp/")
public class FindAccountBookOutputCondition implements Serializable{

    /** serialVersionUID */
   private static final long serialVersionUID = 1L;

   /** SÒID */
   private String _hamid = null;

   /**
    * SÒIDðæ¾·é
    *
    * @return SÒID
    */
   public String getHamid() {
       return _hamid;
   }

   /**
    * SÒIDðÝè·é
    *
    * @param hamid SÒID
    */
   public void setHamid(String hamid) {
       this._hamid = hamid;
   }
}
