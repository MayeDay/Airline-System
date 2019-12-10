package model;
import java.util.LinkedList;

public class Merchant{

	private String airline;
	private LinkedList<Airplane> planeList;
	
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public LinkedList<Airplane> getPlaneList() {
		return planeList;
	}
	public void setPlaneList(LinkedList<Airplane> planeList) {
		this.planeList = planeList;
	}
	
	
	
	

}
