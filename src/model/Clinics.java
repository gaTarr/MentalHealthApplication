package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Craig Longnecker
 * Class Clinics
 *
 */
@Entity
@Table(name="clinics")
public class Clinics { // Class Clinics.
	// Variables from clinics table.
	/**
	 * Variables from Clinics Table
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int idClinic;
	
	@Column
	private String clinicName;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String webaddress;

	/**
	 * Default Constructor
	 */
	public Clinics() { // Default Constructor.
	}

	/**
	 * Non-Default Constructor
	 * @param clinicName
	 * @param city
	 * @param state
	 * @param webaddress
	 */
	public Clinics(String clinicName, String city, String state, String webaddress) { // Non=Default Constructor.
		this.clinicName = clinicName;
		this.city = city;
		this.state = state;
		this.webaddress = webaddress;
	}

	/**
	 * GetIdClinic
	 * @return
	 */
	public int getIdClinic() { // Getter and setter for getIdClinic and setIdClinic.
		return idClinic;
	}

	/**
	 * SetIdClinic
	 * @param idClinic
	 */
	public void setIdClinic(int idClinic) {
		this.idClinic = idClinic;
	}

	/**
	 * GetClinicName
	 * @return
	 */
	public String getClinicName() { // Getter and setter for getClinicName and setClinicName.
		return clinicName;
	}

	/**
	 * SetClinicName
	 * @param clinicName
	 */
	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	/**
	 * GetCity
	 * @return
	 */
	public String getCity() { // Getter and setter for getCity and setCity
		return city;
	}

	/**
	 * SetCity
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * GetState
	 * @return
	 */
	public String getState() { // Getter and setter for getState and setState.
		return state;
	}

	/**
	 * SetState
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * GetWebaddress
	 * @return
	 */
	public String getWebaddress() { // Getter and setter for getWebaddress and setWebaddress.
		return webaddress;
	}

	/**
	 * SetWebaddress
	 * @param webaddress
	 */
	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * ToString Method
	 */
	@Override
	public String toString() { // toString method.
		return "Clinics [idClinic=" + idClinic + ", clinicName=" + clinicName + ", city=" + city + ", state=" + state
				+ ", webaddress=" + webaddress + "]";
	}
} // Close class Clinics.
