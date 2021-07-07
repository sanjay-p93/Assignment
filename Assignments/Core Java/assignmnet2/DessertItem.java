import java.io.*;
import java.util.Scanner;
import java.lang.Math;

abstract class Dessert{

	protected int tax=0,stock=0;
	protected float price=0f;
	Dessert(float p,int t,int s){
		price=p;
		tax=t;
		stock=s;
	}
	public abstract float getCost(int n);
	public abstract void addItem(int n);
	public abstract void buyItem(int n);
}

class Candy extends Dessert{
	Candy(float p,int t,int s){
		super(p,t,s);
	}
	public void getDetails(){
		System.out.println("1.Candy \n\t Price   : "+price+" $ \n\t Stock  : "+stock+"\n\t Tax\t: "+tax+"%");
	}
	public float getCost(int n){
		float cost=0,taxAmount=0;
		cost=price*n;
		taxAmount = (cost*tax)/100;
		cost+=taxAmount;
		cost*=60;
		return cost;
	}
	public void addItem(int n){
		stock+=n;
		System.out.println("\nItem to stock upadated successfully\n Current stock :\n");
		getDetails();
	}
	public void buyItem(int n){
		stock-=n;
		System.out.println("\n Order successfull\nDetails:\n");
		System.out.print("Item    : Candy\nQty  \t: "+n+"\nTotal Cost : ");
		System.out.print(getCost(n));
		System.out.print("₹");
	}

}
class Cookie extends Dessert{
	Cookie(float p,int t,int s){
		super(p,t,s);
	}
	public void getDetails(){
		System.out.println("2.Cookie \n\t Price  : "+price+" € \n\t Stock  : "+stock+"\n\t Tax\t: "+tax+"%");
	}
	public float getCost(int n){
		float cost=0,taxAmount=0;
		cost=price*n;
		taxAmount = (cost*tax)/100;
		cost+=taxAmount;
		cost*=70;
		return cost;
	}
	public void addItem(int n){
		stock+=n;
		System.out.println("\nItem to stock upadated successfully\n Current stock\n");
		getDetails();
	}
	public void buyItem(int n){
		stock-=n;
		System.out.println("\n Order successfull\nDetails:\n");
		System.out.print("Item      : Cookie\nQty  \t: "+n+"\nTotal Cost : ");
		System.out.print(getCost(n));
		System.out.print("₹");
	}

}
class IceCream extends Dessert{
	IceCream(float p,int t,int s){
		super(p,t,s);
	}
	public void getDetails(){
		System.out.println("3.IceCream \n\t Price  : "+price+" ₹ \n\t Stock  : "+stock+"\n\t Tax\t: "+tax+"%");
	}
	public float getCost(int n){
		float cost=0,taxAmount=0;
		cost=price*n;
		taxAmount = (cost*tax)/100;
		cost+=taxAmount;
		return cost;
	}
	public void addItem(int n){
		stock+=n;
		System.out.println("\nItem to stock upadated successfully\n Current stock\n");
		getDetails();
	}
	public void buyItem(int n){
		stock-=n;
		System.out.println("\n Order successfull\nDetails:\n");
		System.out.print("Item       : IceCream\nQty          : "+n+"\nTotal Cost : ");
		System.out.print(getCost(n));
		System.out.print("₹");
	}

}

public class DessertItem {
	static Candy candy= new Candy(1,10,10);
	static Cookie  cookie= new Cookie(1,20,3);
	static IceCream iceCream= new IceCream(50,10,3);

	public static void listItem(){
		candy.getDetails();
		cookie.getDetails();
		iceCream.getDetails();
	}


	public static void main(String[] args){
		int i=0;
		do{
			int itemNo=0,qty=0;
			System.out.println("\n\nPlease select your role \n1. Owner \n2. Customer\n0. Exit\n");
			Scanner sin= new Scanner(System.in);
			i = sin.nextInt();
			if(i==1){
				listItem();
				System.out.println("\nPlease select item to add");
				itemNo = sin.nextInt();
				System.out.print("\nPlease enter quantity : ");
				qty = sin.nextInt();
				switch(itemNo) {
				  case 1:
				  	candy.addItem(qty);
				    break;
				  case 2:
				  	cookie.addItem(qty);
				    break;
				  case 3:
				  	iceCream.addItem(qty);
				    break;
				  default:
				    System.out.println("\nInvalid choice.\n");
				}

			}
			else if(i==2){
				listItem();
				System.out.println("\nPlease select an item to order");
				itemNo = sin.nextInt();
				System.out.print("\nPlease enter quantity : ");
				qty = sin.nextInt();
				switch(itemNo) {
				  case 1:
				  	candy.buyItem(qty);
				    break;
				  case 2:
				  	cookie.buyItem(qty);
				    break;
				  case 3:
				  	iceCream.buyItem(qty);
				    break;
				  default:
				    System.out.println("\nInvalid choice.\n");
				}
			}
			else if(i!=0){
				System.out.println("\nInvalid choice.\n");
			}
		}while(i!=0);
	}
}