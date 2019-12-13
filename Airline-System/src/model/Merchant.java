package model;
import java.util.LinkedList;

public class Merchant{
	
	private int id;
	private String firstname;
	private String lastname;
	private String status;
	private String airline;
	
	public Merchant(int id, String firstname, String lastname, String status, String airline) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.status = status;
		this.airline = airline;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
}
