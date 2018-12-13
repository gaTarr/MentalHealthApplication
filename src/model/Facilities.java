package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Craig Longnecker
 * Class Facilities
 *
 */
@Entity
@Table(name="facilities")
public class Facilities { // Class Facilities.
	// Variables from medications table.
	/**
	 * Variables from Medications Table
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int idFacility;
	
	@Column
	private String name;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String webaddress;

	/**
	 * Default Constructor.
	 */
	public Facilities() { // Default Constructor.
	}

	/**
	 * Non-Default Constructor
	 * @param name
	 * @param city
	 * @param state
	 * @param webaddress
	 */
	public Facilities(String name, String city, String state, String webaddress) { // Non-Default Constructor.
		this.name = name;
		this.city = city;
		this.state = state;
		this.webaddress = webaddress;
	}

	/**
	 * GetIdFacility
	 * @return
	 */
	public int getIdFacility() { // Getter and setter for getIdFacility and setIdFacility.
		return idFacility;
	}

	/**
	 * SetIdFacility
	 * @param idFacility
	 */
	public void setIdFacility(int idFacility) {
		this.idFacility = idFacility;
	}

	/**
	 * GetName
	 * @return
	 */
	public String getName() { // Getter and setter for getName and setName.
		return name;
	}

	/**
	 * SetName
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * GetCity
	 * @return
	 */
	public String getCity() { // Getter and setter for getCity and setCity.
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
		return "Facilities [idFacility=" + idFacility + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", webaddress=" + webaddress + "]";
	}
} // Close class Facilities.
