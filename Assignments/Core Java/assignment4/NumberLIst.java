package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLIst {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(
				Arrays.asList(1,2,3,4,9,6,8,7)
				);
		
		Thread newT =new Thread(()->nums.forEach(System.out::println));
		newT.run();

	}

}
