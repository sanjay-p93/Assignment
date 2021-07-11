package chatApp;

import java.util.Objects;

import assignment3.Date;

public class User {
	private String Username;
	private String pass;
	public 	User(String name, String pass) {
		super();
		this.Username = name;
		this.pass = pass;
	}
	@Override
	public int hashCode() {
		return (int)(System.currentTimeMillis()/1000);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Username, other.Username) && Objects.equals(pass, other.pass);
	}
	@Override
	public String toString() {
		return "" + Username;
	}

}
