package model;

public class Employee extends Person{


	private String email;
	private String username;
	private String password;
	private String status;
	
	
	public Employee(String firstname, String middlename, String lastname, int age, String email, String username, String password, String status) {
		super(firstname, middlename, lastname, age);
		
		this.email = email;
		this.password = password;
		this.username = username;
		this.status = status;

	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
