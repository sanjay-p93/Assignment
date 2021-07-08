
public  class Cookie extends Dessert implements Owner,Customer{
	Cookie(float p,int t,int s){
		this.setPrice(p);
		this.setTax(t);
		this.setStock(s);
	}
	public void getDetails(){
		System.out.println("2. Cookie \n\t  Price   : "+this.getPrice()+" $ \n\t  Stock  : "+this.getStock()+"\n\t  Tax\t: "+this.getTax()+"%");
	}
	public float getCost(int n){
		float cost=0,taxAmount=0;
		cost=this.getPrice()*n;
		taxAmount = (cost*this.getTax())/100;
		cost+=taxAmount;
		cost*=70;
		return cost;
	}
	public void addItem(int n){
		this.setStock(this.getStock()+n);
		System.out.println("\nStock upadated successfully\n Current stock\n");
		getDetails();
	}
	public void buyItem(int n){
		this.setStock(this.getStock()-n);
		System.out.println("\n Order successfull\nDetails:\n");
		System.out.print("Item      : Cookie\nQty  \t: "+n+"\nTotal Cost : ");
		System.out.print(getCost(n));
		System.out.print("₹");
	}

}