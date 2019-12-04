package de.ham.se.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Company {

	private List<Employee> employees;

	public void loadData() throws URISyntaxException {
		
		employees = new ArrayList<>();
		
		URL url = Company.class.getResource("/employees.csv");
		File inputFile = new File(url.toURI());
		
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				String[] employeeInput = line.split(",");
				int employeeNumber = Integer.parseInt(employeeInput[0]);
				String name = employeeInput[1];
				employees.add(new Employee(employeeNumber, name));
			}
					
		} catch (IOException e) {
			System.out.println("Could not read from file");
			e.printStackTrace();
		}
	}

	public void printEmployeeDetails() {
		System.out.println("Pers-Nr.\tName");
		System.out.println("-----------------------");
		for(Employee e : employees) {
			System.out.println(e.getEmployeeNumber() + "\t\t" + e.getName());
		}
	}

}
