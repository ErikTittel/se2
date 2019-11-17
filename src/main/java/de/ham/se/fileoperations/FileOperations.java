package de.ham.se.fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	/**
	 * from https://stackabuse.com/reading-and-writing-files-in-java/
	 */
	public static void main(String[] args) {
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		String absolutePath = directory + File.separator + fileName;

		// write the content in file 
		try(FileWriter fileWriter = new FileWriter(absolutePath)) {
		    String fileContent = "This is a sample text.";
		    fileWriter.write(fileContent);
		} catch (IOException e) {
		    System.out.println("Could not write file: " + e.getMessage());
		}

		// read the content from file
		try(FileReader fileReader = new FileReader(absolutePath)) {
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not read from file: " + e.getMessage());
		}
	}

}
