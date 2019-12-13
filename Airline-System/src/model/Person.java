package model;

import java.sql.Date;

public class Person {
	
	private String firstname;
	private String middlename;
	private String lastname;
	private Date birthdate;
	private String address;
	private String email;
	private String contactnumber;

	
	public Person(String firstname, String middlename, String lastname, Date birthdate, String address, String email, String contactnumber) {
		
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.contactnumber = contactnumber;
	}
	
	
	
	
	public String getContactnumber() {
		return contactnumber;
	}




	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}




	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	

}
