package model;

public class Location {
	
	private String country;
	private String city;
	private String acro;
	
	public Location(String country, String city, String acro) {
		
		this.country = country;
		this.city = city;
		this.acro = acro;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAcro() {
		return acro;
	}

	public void setAcro(String acro) {
		this.acro = acro;
	}
	
	

}
