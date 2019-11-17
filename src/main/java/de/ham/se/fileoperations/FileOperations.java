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
		    // exception handling
		}

		// read the content from file
		try(FileReader fileReader = new FileReader(absolutePath)) {
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
	}

}
