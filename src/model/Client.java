package model;

import java.sql.Date;

public class Client extends Person {

	private String username;
	private String password;
	private String status;
	
	public Client(String firstname, String middlename, String lastname, Date birthdate) {
		super(firstname, middlename, lastname, birthdate);

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
