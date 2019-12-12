package controller;
import java.util.LinkedList;

import database.Database;
import model.Airplane;
import model.Client;
import model.Employee;
import model.Location;

public class MainController {

	private Database database;
	private static MainController mainController = null;
	
	private MainController() {
		
		database = Database.getDatabase();
	}
	
	public static MainController getMainController() {
		
		if(mainController == null)
			mainController = new MainController();
		
		return mainController;
	}
	
	public boolean employeeAuthentication(String username, String password) {
		
		return database.employeeAuthentication(username, password);
	}
	
	public void bookFlight() {
		
	}
	
	public Employee getEmployee() {
		return database.getEmployee();
	}
	
	public LinkedList<Client> getClientList(){
		return database.getClientList();
	}
	public LinkedList<Employee> getEmployeeList(){
		return database.getEmployeeList();
	}
	public LinkedList<Airplane> getAirplaneList(){
		return database.getAirplaneList();
	}
	public LinkedList<Location> getLocationList(){
		return database.getLocationList();
	}
	public LinkedList<String> getAirlineList(){
		return database.getAirlineList();
	}
	
}
