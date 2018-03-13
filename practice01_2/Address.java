/*
 * 2014105102 «‘»øπŒ
 * Practice 01_2
 */

public class Address {
	
	
	private String line[];
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	Address (String[] line, String city, String state, String postalCode, String country) {
		this.line = line;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	

	public String[] getLine() {
		return line;
	}
	
	public void setLine(String[] line) {
		this.line = line;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}