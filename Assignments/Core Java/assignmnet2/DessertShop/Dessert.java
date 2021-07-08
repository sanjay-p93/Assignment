
public  abstract class Dessert{

	private float price=0f;
	private int tax=0,stock=0;

	public void setPrice(float p){
		this.price=p;
	}
	public void setTax(int t){
		this.tax=t;
	}
	public void setStock(int s){
		this.stock=s;
	}
	public float getPrice(){
		return this.price;
	}
	public int getTax(){
		return this.tax;
	}
	public int getStock(){
		return this.stock;
	}

	public abstract float getCost(int n);
	public abstract void addItem(int n);
	public abstract void buyItem(int n);
}