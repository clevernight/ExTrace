package ts.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="ExpressSheet")
@XmlRootElement(name="ExpressSheet")
public class ExpressSheet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4941503468986892397L;

	public ExpressSheet() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
//	@GeneratedValue(generator="MODEL_EXPREESSHEET_ID_GENERATOR")	
//	@org.hibernate.annotations.GenericGenerator(name="MODEL_EXPREESSHEET_ID_GENERATOR", strategy="assigned")	
	private String ID;
	
	@Column(name="Type", nullable=true, length=4)	
	private int type;
	
	@ManyToOne(targetEntity=CustomerInfo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Sender", referencedColumnName="ID", nullable=true) })	
	private CustomerInfo sender;
	
	@ManyToOne(targetEntity=CustomerInfo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Recever", referencedColumnName="ID", nullable=true) })	
	private CustomerInfo recever;
	
	@Column(name="Weight", nullable=true)	
	private Float weight;
	
	@Column(name="TranFee", nullable=true)	
	private Float tranFee;
	
	@Column(name="PackageFee", nullable=true)	
	private Float packageFee;
	
	@Column(name="InsuFee", nullable=true)	
	private Float insuFee;
	
	@Column(name="Accepter", nullable=true, length=16)	
	private String accepter;
	
	@Column(name="Deliver", nullable=true, length=16)	
	private String deliver;
	
	@Column(name="AcceptTime", nullable=true)	
	private Date acceptTime;
	
	@Column(name="DeliverTime", nullable=true)	
	private Date deliverTime;
	
	@Column(name="Acc1", nullable=true, length=64)	
	private String acc1;
	
	@Column(name="Acc2", nullable=true, length=64)	
	private String acc2;
	
	@Column(name="Status", nullable=true, length=4)	
	private Integer status;
	
//	@ManyToMany(targetEntity=TransPackage.class)	
//	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
//	@JoinTable(name="TransPackageContent", joinColumns={ @JoinColumn(name="ExpreesSheetID") }, inverseJoinColumns={ @JoinColumn(name="TransPackageID") })	
//	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
//	private java.util.Set<TransPackage> transPackage = new java.util.HashSet<TransPackage>();
	
	public void setID(String value) {
		this.ID = value;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getORMID() {
		return getID();
	}
	
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return type;
	}
	
	public void setWeight(Float value) {
		this.weight = value;
	}
	
	public Float getWeight() {
		return weight;
	}
	
	public void setTranFee(Float value) {
		this.tranFee = value;
	}
	
	public Float getTranFee() {
		return tranFee;
	}
	
	public void setPackageFee(Float value) {
		this.packageFee = value;
	}
	
	public Float getPackageFee() {
		return packageFee;
	}
	
	public void setInsuFee(Float value) {
		this.insuFee = value;
	}
	
	public Float getInsuFee() {
		return insuFee;
	}
	
	public void setAccepter(String value) {
		this.accepter = value;
	}
	
	public String getAccepter() {
		return accepter;
	}
	
	public void setDeliver(String value) {
		this.deliver = value;
	}
	
	public String getDeliver() {
		return deliver;
	}
	
	public void setAccepteTime(Date value) {
		this.acceptTime = value;
	}
	
	public Date getAccepteTime() {
		return acceptTime;
	}
	
	public void setDeliveTime(Date value) {
		this.deliverTime = value;
	}
	
	public Date getDeliveTime() {
		return deliverTime;
	}
	
	public void setAcc1(String value) {
		this.acc1 = value;
	}
	
	public String getAcc1() {
		return acc1;
	}
	
	public void setAcc2(String value) {
		this.acc2 = value;
	}
	
	public String getAcc2() {
		return acc2;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return status;
	}
	
//	public void setTransPackage(java.util.Set<TransPackage> value) {
//		this.transPackage = value;
//	}
//	
//	public java.util.Set<TransPackage> getTransPackage() {
//		return transPackage;
//	}
	
	
	public void setSender(CustomerInfo value) {
		this.sender = value;
	}
	
	public CustomerInfo getSender() {
		return sender;
	}
	
	public void setRecever(CustomerInfo value) {
		this.recever = value;
	}
	
	public CustomerInfo getRecever() {
		return recever;
	}
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("ExpreesSheet[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Type=").append(getType()).append(" ");
			if (getSender() != null)
				sb.append("Sender.Persist_ID=").append(getSender().toString(true)).append(" ");
			else
				sb.append("Sender=null ");
			if (getRecever() != null)
				sb.append("Recever.Persist_ID=").append(getRecever().toString(true)).append(" ");
			else
				sb.append("Recever=null ");
			sb.append("Weight=").append(getWeight()).append(" ");
			sb.append("TranFee=").append(getTranFee()).append(" ");
			sb.append("PackageFee=").append(getPackageFee()).append(" ");
			sb.append("InsuFee=").append(getInsuFee()).append(" ");
			sb.append("Accepter=").append(getAccepter()).append(" ");
			sb.append("Deliver=").append(getDeliver()).append(" ");
			sb.append("AccepteTime=").append(getAccepteTime()).append(" ");
			sb.append("DeliveTime=").append(getDeliveTime()).append(" ");
			sb.append("Acc1=").append(getAcc1()).append(" ");
			sb.append("Acc2=").append(getAcc2()).append(" ");
			sb.append("Status=").append(getStatus()).append(" ");
//			sb.append("TransPackage.size=").append(getTransPackage().size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
	@Transient	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	public static final class STATUS{
		public static final int STATUS_CREATED = 0;
		public static final int STATUS_RECEIVED = 1;
		public static final int STATUS_PARTATION = 2;
		public static final int STATUS_TRANSPORT = 3;
		public static final int STATUS_DISPATCHED = 4;
		public static final int STATUS_DELIVERIED = 5;
	}
}
