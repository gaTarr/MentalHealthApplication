package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUser")
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private int idUser;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
		
	public User() {
		
	}
	
	public User(String user, String pass) {
		this.username = user;
		this.password = pass;
	}
	
	public int getId () {
		return idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + idUser + ", username=" + username + ", password=" + password + "]";
	}
		
}
