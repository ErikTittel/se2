package de.ham.se.refactoring;

import java.util.Arrays;
import java.util.List;

public class ExtractMethod {

	public static void main(String[] args) {
		Order order = new Order("Hans", new Element(3.5), new Element(5.8), new Element(12.4));
		
		order.printOwning();
	}

}

class Order {
	
	private String name;
	private List<Element> elements;
	
	public Order(String name, Element... elements) {
		this.name = name;
		this.elements = Arrays.asList(elements);
	}

	// FIXME this method does a lot. Extract three methods: printBanner(), calculateOutstanding(), printDetails()
	public void printOwning() {
		double outstanding = 0.0;
		
		// print banner
		System.out.println("*****************************");
		System.out.println("******* Customer Owes *******");
		System.out.println("*****************************");
		
		// calculate outstanding
		for (Element e : elements) {
			outstanding += e.getAmount();
		}
		
		// print details
		System.out.println("Name: " + name);
		System.out.printf("Amount: %.2f €", outstanding);
	}
	
}

class Element {
	private double amount;
	
	public Element(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}