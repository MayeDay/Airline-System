package database;
import java.util.*;
import java.sql.*;
import model.*;
public class Database {

	private LinkedList<Client>clientList;
	private LinkedList<Employee>employeeList;
	private static Database database = null;
	private Employee employee = null;

	private Connection connection = null;
	private CallableStatement cs = null;
	private ResultSet rs = null;
	private String url;
	private String username;
	private String password;
	
	
	private Database() {
		
		clientList = new LinkedList<Client>();
		employeeList = new LinkedList<Employee>();
		initDatabase();
	}
	
	public static Database getDatabase() {
		
		if(database == null)
			database = new Database();
		
		return database;
	}
	
	private void initDatabase() {
		
		url = "jdbc:mysql://localhost/airport-registration-and-monitering-system";
		username = "root";
		password = "J@m3sM@y36094";		
		
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			
			cs = connection.prepareCall("{call authenticateAllUsers()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				if(rs.getString(8).equalsIgnoreCase("Admin") || rs.getString(8).equalsIgnoreCase("Employee")) {
					employeeList.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
				
				}else if(rs.getString(8).equalsIgnoreCase("Client")){
					clientList.add(new Client(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
					
				}
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void reCalibrateUserLists() {
		
		employeeList.clear();
		clientList.clear();
		
		initDatabase();
	}
	
	public boolean AdminAuthentication(String username, String password) {
		boolean verification = false;
		
		for(Employee em: employeeList)
			if(em.getUsername().equals(username) && em.getPassword().equals(password)) {
				verification = true;
				employee = em;
			}
		
		return verification;	
	}
	
	public Employee getEmployee() {	
		return this.employee;
	}
}
