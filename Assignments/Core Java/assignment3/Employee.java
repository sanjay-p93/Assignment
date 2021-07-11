package assignment3;


public class Employee {
	private String name;
	private int EID;

	public Employee(String name, int eID) {
		super();
		this.name = name;
		EID = eID;
	}

	@Override
	public boolean equals(Object obj) {
			return true;
	}


	@Override
	public int hashCode() {
		return 123;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", EID=" + EID + "]";
	}
}
