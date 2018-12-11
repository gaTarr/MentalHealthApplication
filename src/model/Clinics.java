package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clinics")
public class Clinics {
	
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

	public Clinics() { // Default Constructor.
	}

	public Clinics(int idClinic, String clinicName, String city, String state, String webaddress) { // Non=Default Constructor.
		super();
		this.idClinic = idClinic;
		this.clinicName = clinicName;
		this.city = city;
		this.state = state;
		this.webaddress = webaddress;
	}

	public int getIdClinic() {
		return idClinic;
	}

	public void setIdClinic(int idClinic) {
		this.idClinic = idClinic;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
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
		return "Clinics [idClinic=" + idClinic + ", clinicName=" + clinicName + ", city=" + city + ", state=" + state
				+ ", webaddress=" + webaddress + "]";
	}

}
