package ts.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="CustomerInfo")
@XmlRootElement(name="CustomerInfo")
public class CustomerInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3267943602377867497L;

	public CustomerInfo() {
	}

	@XmlElement
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="MODEL_CUSTOMERINFO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODEL_CUSTOMERINFO_ID_GENERATOR", strategy="native")
	private int ID;

    @XmlElement
	@Column(name="Name", nullable=true, length=16)
	private String name;

    @XmlElement
	@Column(name="TelCode", nullable=true, length=24)
	private String telCode;

    @XmlElement
	@Column(name="Department", nullable=true, length=64)
	private String department;

    @XmlElement
	@Column(name="RegionCode", nullable=true, length=6)
	private String regionCode;

    @XmlElement
	@Column(name="Address", nullable=true, length=64)
	private String address;

    @XmlElement
	@Column(name="PostCode", nullable=false, length=10)
	private int postCode;
	
//	@OneToMany(mappedBy="sender", targetEntity=ExpreesSheet.class)	
//	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
//	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
//	private java.util.Set<ExpreesSheet> expreesSender = new java.util.HashSet<ExpreesSheet>();
//	
//	@OneToMany(mappedBy="recever", targetEntity=ExpreesSheet.class)	
//	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
//	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
//	private java.util.Set<ExpreesSheet> expreesReceiver = new java.util.HashSet<ExpreesSheet>();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTelCode(String value) {
		this.telCode = value;
	}
	
	public String getTelCode() {
		return telCode;
	}
	
	public void setDepartment(String value) {
		this.department = value;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setRegionCode(String value) {
		this.regionCode = value;
	}
	
	public String getRegionCode() {
		return regionCode;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPostCode(int value) {
		this.postCode = value;
	}
	
	public int getPostCode() {
		return postCode;
	}
	
//	public void setExpreesSender(java.util.Set<ExpreesSheet> value) {
//		this.expreesSender = value;
//	}
//	
//	public java.util.Set<ExpreesSheet> getExpreesSender() {
//		return expreesSender;
//	}
//	
//	
//	public void setExpreesReceiver(java.util.Set<ExpreesSheet> value) {
//		this.expreesReceiver = value;
//	}
//	
//	public java.util.Set<ExpreesSheet> getExpreesReceiver() {
//		return expreesReceiver;
//	}
	
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("CustomerInfo[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Name=").append(getName()).append(" ");
			sb.append("TelCode=").append(getTelCode()).append(" ");
			sb.append("Department=").append(getDepartment()).append(" ");
			sb.append("RegionCode=").append(getRegionCode()).append(" ");
			sb.append("Address=").append(getAddress()).append(" ");
			sb.append("PostCode=").append(getPostCode()).append(" ");
//			sb.append("ExpreesSender.size=").append(getExpreesSender().size()).append(" ");
//			sb.append("ExpreesReceiver.size=").append(getExpreesReceiver().size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}

	@Transient	
	private String regionString;
	public void setRegionString(String value) {
		this.regionString = value;
	}
	
	public String getRegionString() {
		return regionString;
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
}
