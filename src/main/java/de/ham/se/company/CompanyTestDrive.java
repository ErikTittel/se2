package de.ham.se.company;

import java.net.URISyntaxException;

public class CompanyTestDrive {

	public static void main(String[] args) throws URISyntaxException {
		Company company = new Company();
		company.loadData();
		company.printEmployeeDetails();
	}
	
}
