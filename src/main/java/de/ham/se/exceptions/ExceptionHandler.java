package de.ham.se.exceptions;

import java.io.IOException;

public class ExceptionHandler {

	public static void main(String[] args) {
		try {
			readInformationFromFile();
			doSomeCalculation();
		} catch (IOException e) {
			System.out.println("Exception occured: ");
			e.printStackTrace();
		} finally {
			System.out.println("The finally block will always be executed no matter what happens within the try block.");
		}
		System.out.println("Now we reached the end of the program!");
	}

	private static void readInformationFromFile() throws IOException {
		System.out.println("reading something from a file...");
		// let's assume the file can't be accessed
		throw new IOException();
	}

	private static void doSomeCalculation() {
		System.out.println("doing some calculation...");
		// during calculation something went wrong
		throw new RuntimeException();
	}

}
