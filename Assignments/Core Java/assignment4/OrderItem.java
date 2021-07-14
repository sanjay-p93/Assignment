package lambda;

public class OrderItem {
 private int id;
 private float price;
 private String status;
 
public OrderItem(int id,float price, String status) {
	super();
	this.id = id;
	this.price = price;
	this.status = status;
}

@Override
public String toString() {
	return "OrderItem [id = " + id + ", price = " + price + ", status = " + status + "]";
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
 
 
 
}
