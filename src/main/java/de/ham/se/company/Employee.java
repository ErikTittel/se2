package de.ham.se.company;

public class Employee {

	private int employeeNumber;
	private String name;
	
	public Employee(int employeeNumber, String name) {
		this.employeeNumber = employeeNumber;
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getName() {
		return name;
	}
	
}
