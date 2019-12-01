package de.ham.se.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {

	public static void main(String[] args) {
		usingArrayList();
		usingHashMap();
	}

	private static void usingArrayList() {
		List<String> cities = new ArrayList<>();
		cities.add("Berlin");
		cities.add("New York");
		cities.add("London");
		
		System.out.println(cities.size() + " cities listed: " + cities);
		System.out.println("Pos 1: " + cities.get(1));
		
		System.out.println("Is Berlin in the list? -> " + cities.contains("Berlin"));
		cities.remove("Berlin");
		System.out.println("Is Berlin in the list? -> " + cities.contains("Berlin"));
		cities.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(cities);
		cities.clear();
		System.out.println("Empty? -> " + cities.isEmpty() + "\n");
	}

	private static void usingHashMap() {
		String text = "Lorem ipsum dolor sit et amet consetetur sit et ipsum sadipscing et ipsum consetetur elitr et sadipscing";
		String[] words = text.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			Integer currentValue = wordCount.get(word);
			if (currentValue == null) {
				currentValue = 0;
			}
			wordCount.put(word, currentValue + 1);
		}
		System.out.println("How often do I see the word 'et'? -> " + wordCount.get("et"));
		System.out.println(wordCount);
		
		// TODO: How to order the words by count?
		// 4: [et]
		// 3: [ipsum]
		// 2: [sit, consetetur, sadipscing]
		// 1: [dolor, elitr, Lorem, amet]
	}

}
