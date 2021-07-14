package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class WordsToUpper {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>(
				Arrays.asList("hello","hi","this","one","is","not","just","a","sentance","mister")
				);
		UnaryOperator<String> uO = x->x.toUpperCase();
		
		words.replaceAll(uO);

		System.out.println(words);


	}

}
