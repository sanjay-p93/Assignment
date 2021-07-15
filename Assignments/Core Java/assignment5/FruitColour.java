package stream;

import java.util.ArrayList;
import java.util.List;

public class FruitColour {

	public static void main(String[] args) {

		
		List<Fruit> fruits = new ArrayList<>() {{
				add(new Fruit("Apple",520, 1,  "Red"));
				add(new Fruit("Orange",470, 40,  "Orange"));
				add(new Fruit("Lemon",24, 40,  "Yellow"));
				add(new Fruit("Guava",125, 40,  "Green"));
				add(new Fruit("Watermelon",50, 40,  "Green"));
				add(new Fruit("Cherry",80, 40,  "Red"));
				add(new Fruit("Pineapple",250, 40,  "Yellow"));
				add(new Fruit("Strawberry",101, 40,  "Red"));
		}};
		

        fruits.stream()
            	.sorted((o1, o2) -> o1.getColor().compareTo(o2.getColor()))
                .forEach(f->System.out.println(f.getName()+" : "+f.getColor()));

	}
}
