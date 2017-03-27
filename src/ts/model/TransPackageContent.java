package ts.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="TransPackageContent")
@XmlRootElement(name="TransPackageContent")
public class TransPackageContent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2696910600791838998L;

	public TransPackageContent() {
	}
	
	@Column(name="SN", nullable=false)	
	@Id	
	@GeneratedValue(generator="MODEL_TRANSHISTORY_SN_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODEL_TRANSHISTORY_SN_GENERATOR", strategy="native")	
	private int SN;
	
	@Column(name="ExpressSheetID", nullable=false)	
	private String ExpressSheetID;
	
	@Column(name="TransPackageID", nullable=false)	
	private String TransPackageID;

	public int getSN() {
		return SN;
	}
	
	public void setTransPackageID(String value) {
		this.TransPackageID = value;
	}
	
	public String getTransPackageID() {
		return TransPackageID;
	}
	
	public void setExpressSheetID(String value) {
		this.ExpressSheetID = value;
	}
	
	public String getExpressSheetID() {
		return ExpressSheetID;
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
			sb.append("PackageContents[ ");
			sb.append("SN=").append(getSN()).append(" ");
			sb.append("ExpressSheetID=").append(getExpressSheetID()).append(" ");
			sb.append("TransPackageID=").append(getTransPackageID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
