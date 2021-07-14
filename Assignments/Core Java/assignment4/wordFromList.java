package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class wordFromList {

	public static void main(String[] args) {


		List<String> words = new ArrayList<>(
				Arrays.asList("hello","hi","this","one","is","not","just","a","sentance","mister")
				);
		
		
		Consumer<List<String>> wordCreator= w -> {
			
			 StringBuilder str = new StringBuilder();
			 
			 for(String e:w) {
				 str.append(e.charAt(0));
			 }

			 System.out.println(str);
		};
		
		wordCreator.accept(words);

	}

}
