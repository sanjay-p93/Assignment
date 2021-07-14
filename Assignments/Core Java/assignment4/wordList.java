package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class wordList {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>(
				Arrays.asList("hello","hi","this","one","is","not","just","a","sentance","mister")
				);
		
		words.removeIf(w -> w.length() % 2 == 1);

		System.out.println(words);

	}
}
