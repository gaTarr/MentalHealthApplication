package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medications")
public class Medications {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int idMed;
	
	@Column
	private String brandName;
	
	@Column
	private String genericName;
	
	@Column
	private String type;
	
	@Column
	private String webaddress;

	public Medications() { // Default Constructor.
	}

	public Medications(int idMed, String brandName, String genericName, String type, String webaddress) { // Non-Default Constructor.
		this.idMed = idMed;
		this.brandName = brandName;
		this.genericName = genericName;
		this.type = type;
		this.webaddress = webaddress;
	}

	public int getIdMed() {
		return idMed;
	}

	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebaddress() {
		return webaddress;
	}

	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	@Override
	public String toString() {
		return "Medications [idMed=" + idMed + ", brandName=" + brandName + ", genericName=" + genericName + ", type="
				+ type + ", webaddress=" + webaddress + "]";
	}
}
