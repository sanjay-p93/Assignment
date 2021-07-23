package springCoreQ1;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
public class Customer {
	private int customerId;
	private String customerName;
	private int customerContact;

	// @Autowired
	private Address customerAddress;

	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public void getDetails() {
		System.out.println();
		System.out.println("ID : " + this.customerId + ", Name : " + this.customerName + ", Contact : "
				+ this.customerContact + this.customerAddress);

		System.out.println();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

//	//setterMethrod
//	public void setCustomerAddress(Address customerAddress) {
//		this.customerAddress = customerAddress;
//	}

}
