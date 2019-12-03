package de.ham.se.refactoring;

public class RenameMethod {

	public static void main(String[] args) {
		Person john = new Person("John", "5678");
		System.out.println(john);
	}

}


class Person {
	
	private static final String OFFICE_CODE = "+49 89 1234";
	
	private String name;
	private String phoneNumber;

	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	// FIXME this method is better called "getOfficePhoneNumber"
	public String getPhoneNumber() {
		return OFFICE_CODE + phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + ", phoneNumber=" + getPhoneNumber() + "]";
	}

	
}