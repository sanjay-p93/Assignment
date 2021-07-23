package springCoreQ1;

//import org.springframework.stereotype.Component;

//@Component
public class Address {
	public Address() {
		super();
	}

	private String street;
	private String city;
	private String state;
	private String country;
	private int zip;

	public Address(String street, String city, String state, String country, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return ", Address [ Street: " + street + " City: " + city + " State: " + state + " Country: " + country
				+ " Zip: " + zip + " ]";
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public int getZip() {
		return zip;
	}

}
