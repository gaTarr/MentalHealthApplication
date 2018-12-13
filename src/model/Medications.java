package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Craig Longnecker
 * Class Medications
 *
 */
@Entity
@Table(name="medications")
public class Medications { // Class Medications.
	// Variables from medications table.
	/**
	 * Variables From Medications Table
	 */
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

	/**
	 * Default Constructor
	 */
	public Medications() { // Default Constructor.
	}

	/**
	 * Constructor
	 * @param brandName
	 * @param genericName
	 * @param type
	 * @param webaddress
	 */
	public Medications(String brandName, String genericName, String type, String webaddress) { // Non-Default Constructor.
		this.brandName = brandName;
		this.genericName = genericName;
		this.type = type;
		this.webaddress = webaddress;
	}

	/**
	 * GetIdMed
	 * @return
	 */
	public int getIdMed() { // Getter and setter for getIdMed and setIdMed.
		return idMed;
	}

	/**
	 * SetIdMed
	 * @param idMed
	 */
	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}

	/**
	 * GetBrandName
	 * @return
	 */
	public String getBrandName() { // Getter and setter for getBrandName and setBrandName.
		return brandName;
	}

	/**
	 * SetBrandName
	 * @param brandName
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * GetGenericName
	 * @return
	 */
	public String getGenericName() { // Getter and setter for getGenericName and setGenericName.
		return genericName;
	}

	/**
	 * SetGenericName
	 * @param genericName
	 */
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	/**
	 * GetType
	 * @return
	 */
	public String getType() { // Getter and setter for getType and setType.
		return type;
	}

	/**
	 * SetType
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * GetWebaddress
	 * @return
	 */
	public String getWebaddress() { // Getter and setter for getWebaddress and setWebaddress.
		return webaddress;
	}

	/**
	 * SetWebAddress
	 * @param webaddress
	 */
	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * ToString Method.
	 */
	@Override
	public String toString() { // ToString method.
		return "Medications [idMed=" + idMed + ", brandName=" + brandName + ", genericName=" + genericName + ", type="
				+ type + ", webaddress=" + webaddress + "]";
	}
} // Close class Medications.
