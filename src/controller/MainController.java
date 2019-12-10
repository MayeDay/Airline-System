package controller;
import database.Database;
import model.Employee;

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
	
	public boolean AdminAuthentication(String username, String password) {
		
		return database.AdminAuthentication(username, password);
	}
	
	public Employee getEmployee() {
		return database.getEmployee();
	}
}
