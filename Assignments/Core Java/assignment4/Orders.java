package lambda;

import java.util.*;

@FunctionalInterface
interface OrderCheck{
	boolean check(OrderItem o);
}

public class Orders {

	public static void main(String[] args) {
		
		List<OrderItem> orderList = new ArrayList<>();
		orderList.add(new OrderItem(1, 300f, "COMPLETED"));
		orderList.add(new OrderItem(2, 4000f, "ACCEPTED"));
		orderList.add(new OrderItem(3, 20000f, "PENDING"));
		orderList.add(new OrderItem(4, 10000f, "COMPLETED"));
		orderList.add(new OrderItem(5, 40000f, "COMPLETED"));
		orderList.add(new OrderItem(6, 5000f, "PENDING"));
		orderList.add(new OrderItem(7, 1000f, "ACCEPTED"));
		orderList.add(new OrderItem(8, 12560f, "ACCEPTED"));
		orderList.add(new OrderItem(9, 34400f, "COMPLETED"));
		orderList.add(new OrderItem(10, 2300f, "PENDING"));
		
		OrderCheck newCheck = (o)->{
				if(o.getPrice()>10000 && (o.getStatus().equals("COMPLETED") ||  o.getStatus().equals("ACCEPTED") ) ) {
					return true;
				}
				return false;
		};
			
		for(OrderItem e:orderList) {
			if(newCheck.check(e)) 
				System.out.println(e);
		}
		
	}

}
