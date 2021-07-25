package com.registration;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@CityZipcode(city = "city", zipCode = "zipcode", message = "* Zipcode does not match with City!")
public class Customer {

	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{8,20}", message = "* Invalid username")
	private String username;

	@NotNull
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_$#.@])[A-Za-z\\d_$#.@]{8,20}$", message = "* Invalid password")
	private String password;

	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "* Invalid email")
	private String email;
	@Contact
	private String contact;
	private String city;
	@Pattern(regexp = "^[0-9]{6}", message = "* Invalid zipcode")
	private String zipcode;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
