/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package ts.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="TransHistory")
public class TransHistory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6973429316324711538L;

	public TransHistory() {
	}
	
	@Column(name="SN", nullable=false)	
	@Id	
	@GeneratedValue(generator="MODEL_TRANSHISTORY_SN_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODEL_TRANSHISTORY_SN_GENERATOR", strategy="native")	
	private int SN;
	
	@ManyToOne(targetEntity=TransPackage.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PackegID", referencedColumnName="ID", nullable=false) })	
	private TransPackage packeg;
	
	@Column(name="ActTime", nullable=false)	
	private java.sql.Timestamp actTime;
	
	@Column(name="PosCode", nullable=true, length=10)	
	private Integer posCode;
	
	@Column(name="UIDFrom", nullable=false, length=10)	
	private int UIDFrom;
	
	@Column(name="UIDTo", nullable=false, length=10)	
	private int UIDTo;
	
	private void setSN(int value) {
		this.SN = value;
	}
	
	public int getSN() {
		return SN;
	}
	
	public int getORMID() {
		return getSN();
	}
	
	public void setActTime(java.sql.Timestamp value) {
		this.actTime = value;
	}
	
	public java.sql.Timestamp getActTime() {
		return actTime;
	}
	
	public void setPosCode(Integer value) {
		this.posCode = value;
	}
	
	public Integer getPosCode() {
		return posCode;
	}
	
	public void setUIDFrom(int value) {
		this.UIDFrom = value;
	}
	
	public int getUIDFrom() {
		return UIDFrom;
	}
	
	public void setUIDTo(int value) {
		this.UIDTo = value;
	}
	
	public int getUIDTo() {
		return UIDTo;
	}
	
	public void setPackeg(TransPackage value) {
		this.packeg = value;
	}
	
	public TransPackage getPackeg() {
		return packeg;
	}
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getSN());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("TransHistory[ ");
			sb.append("SN=").append(getSN()).append(" ");
			if (getPackeg() != null)
				sb.append("Packeg.Persist_ID=").append(getPackeg().toString(true)).append(" ");
			else
				sb.append("Packeg=null ");
			sb.append("ActTime=").append(getActTime()).append(" ");
			sb.append("PosCode=").append(getPosCode()).append(" ");
			sb.append("UIDFrom=").append(getUIDFrom()).append(" ");
			sb.append("UIDTo=").append(getUIDTo()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
