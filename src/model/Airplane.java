package model;

import java.sql.Time;

public class Airplane {

	private String name;
	private int seatCapacity;
	private double price;
	private String airline;
	private String terminal;
	private String gate;
	private String status;
	private Time departTime;
	private Time arrivalTime;
	private String location;
	private String locationCity;
	private String destination;
	private String destinationCity;
	
	public Airplane(String name, int seatCapacity, double price, String airline, String terminal, String gate, String status, Time departTime, Time arrivalTime,
			String location, String locationCity, String destination, String destinationCity) {
		
		this.name = name;
		this.seatCapacity = seatCapacity;
		this.price = price;
		this.airline = airline;
		this.terminal = terminal;
		this.gate = gate;
		this.status = status;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.location = location;
		this.locationCity = locationCity;
		this.destination = destination;
		this.destinationCity = destinationCity;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Time getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
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
	
	
}
