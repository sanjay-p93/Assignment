package assignment3;

public class Person  implements Comparable<Person> {
private  String name;
private  int weight;
private  int height;
 
	 public Person(String n, int h,int w){
		 this.name=n;
		 this.height=h;
		 this.weight=w;
	 }


		@Override
	public String toString() {
		return "{name=" + name + ", weight=" + weight + ", height=" + height + "}";
	}


	@Override
	public int compareTo(Person o) {
		if(this.weight>o.weight)
			return 1;
		else if(this.weight<o.weight)
			return -1;
		else{
			if(this.height>o.height)
				return 1;
			else if(this.height<o.height)
				return -1;
			else 
				return 0;
		}
	}


}