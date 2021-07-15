package stream;

import java.util.ArrayList;
import java.util.List;

public class RedFruits {

	public static void main(String[] args) {

		
		List<Fruit> fruits = new ArrayList<>() {{
				add(new Fruit("Apple",520, 110,  "Red"));
				add(new Fruit("Orange",470, 66,  "Orange"));
				add(new Fruit("Lemon",24, 37,  "Yellow"));
				add(new Fruit("Guava",125, 55,  "Green"));
				add(new Fruit("Watermelon",50, 40,  "Green"));
				add(new Fruit("Cherry",80, 70,  "Red"));
				add(new Fruit("Pineapple",250, 55,  "Yellow"));
				add(new Fruit("Strawberry",101, 150,  "Red"));
		}};
		

        fruits.stream()
        		.filter(f -> f.getColor().equals("Red"))
            	.sorted((o1, o2) -> o1.getPrice()-o2.getPrice())
                .forEach(System.out::println);

	}

}
