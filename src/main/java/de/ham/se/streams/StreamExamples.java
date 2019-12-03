package de.ham.se.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);
		
		System.out.println();
		
		List<String> numbers = Arrays.asList("3", "8", "5", "17");
		int sum = numbers
				.stream()
				.mapToInt(Integer::parseInt)
				.filter(n -> n < 10)
				.sum();
		System.out.println(sum);
	}

}
