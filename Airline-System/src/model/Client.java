package model;

import java.sql.Date;
import java.sql.Time;

public class Client extends Person {

	private String username;
	private String password;
	
	private int id;
	private String airline;
	private int plane_id;
	private String gender;
	private String airplanename;
	private Time departureTime;
	private Time arrivalTime;
	private Date departureDate;
	private String gate;
	private String terminal;
	private String location;
	private String locationCity;
	private String destination;
	private String destinationCity;
	
	public Client(String firstname, String middlename, String lastname, Date birthdate, String address, String email, String contactnumber
			,String username, String password, String status, String airline, int plane_id, String gender, String airplanename, Time departureTime, Time arrivalTime
			, Date departureDate, String gate, String terminal, String location, String locationCity, String destination, String destinationCity, int id) {
		super(firstname, middlename, lastname, birthdate, address, email, contactnumber);
		
		this.airline = airline;
		this.plane_id = plane_id;
		this.gender = gender;
		this.airplanename = airplanename;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
		this.gate = gate;
		this.terminal = terminal;
		this.location = location;
		this.locationCity = locationCity;
		this.destination = destination;
		this.destinationCity = destinationCity;
		this.id = id;

	}
	
	public Client(String firstname, String middlename, String lastname, Date birthdate, String address, String email, String contactnumber
			,String username, String password, String status, String airline, int plane_id, String gender, String airplanename, Time departureTime, Time arrivalTime
			, Date departureDate, String gate, String terminal, String location, String locationCity, String destination, String destinationCity) {
		super(firstname, middlename, lastname, birthdate, address, email, contactnumber);
		
		this.airline = airline;
		this.plane_id = plane_id;
		this.gender = gender;
		this.airplanename = airplanename;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
		this.gate = gate;
		this.terminal = terminal;
		this.location = location;
		this.locationCity = locationCity;
		this.destination = destination;
		this.destinationCity = destinationCity;

	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAirplanename() {
		return airplanename;
	}
	
	public void setAirplanename(String airplanename) {
		this.airplanename = airplanename;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getPlane_id() {
		return plane_id;
	}

	public void setPlane_id(int plane_id) {
		this.plane_id = plane_id;
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
}
