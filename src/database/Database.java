package database;
import java.util.*;
import java.sql.*;
import model.*;
public class Database {

	private LinkedList<Client>clientList;
	private LinkedList<Employee>employeeList;
	private LinkedList<Airplane> planeList;
	private LinkedList<Merchant> merchantList;
	private static Database database = null;
	private Employee employee = null;
	private Client client = null;

	private Connection connection = null;
	private CallableStatement cs = null;
	private ResultSet rs = null;
	private String url;
	private String username;
	private String password;
	
	
	private Database() {
		
		clientList = new LinkedList<Client>();
		employeeList = new LinkedList<Employee>();
		planeList = new LinkedList<Airplane>();
		merchantList = new LinkedList<Merchant>();
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
			
			reInitilaizeList();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void reInitilaizeList() {
		
		employeeList.clear();
		clientList.clear();
		planeList.clear();
		merchantList.clear();
		
		try {
			cs = connection.prepareCall("{call employeeList()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				employeeList.add(new Employee(rs.getString(1), "", rs.getString(2), rs.getDate(6), rs.getString(7), rs.getString(3), "", rs.getString(4), rs.getString(5), rs.getString(9), rs.getString(8)));
			}
			
			cs = connection.prepareCall("{call getClients()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				clientList.add(new Client(rs.getString(2), rs.getString(3), rs.getString(1), rs.getDate(5), rs.getString(7), rs.getString(8),
						"", "", "", "", rs.getString(9), rs.getInt(10), rs.getString(4), rs.getString(11), rs.getTime(12), rs.getTime(13),
						rs.getDate(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getInt(21)));
				
			}
			
			cs = connection.prepareCall("{call getPlaneList()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				planeList.add(new Airplane(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)
						, rs.getTime(8), rs.getTime(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
			}
			
			cs = connection.prepareCall("{call getMerchants()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				merchantList.add(new Merchant(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}

				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean employeeAuthentication(String username, String password) {
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
