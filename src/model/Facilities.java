package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facilities")
public class Facilities {
	
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

	public Facilities() { // Default Constructor.
	}

	public Facilities(int idFacility, String name, String city, String state, String webaddress) { // Non-Default Constructor.
		this.idFacility = idFacility;
		this.name = name;
		this.city = city;
		this.state = state;
		this.webaddress = webaddress;
	}

	public int getIdFacility() {
		return idFacility;
	}

	public void setIdFacility(int idFacility) {
		this.idFacility = idFacility;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWebaddress() {
		return webaddress;
	}

	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	@Override
	public String toString() {
		return "Facilities [idFacility=" + idFacility + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", webaddress=" + webaddress + "]";
	}
}
