package com.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
	BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"\\bin\\file.txt"));
		
	bufferedWriter.write("This is first line!");
	bufferedWriter.write(System.lineSeparator());
	bufferedWriter.write("This is second line!");
	bufferedWriter.close();
	
	///
	
	BufferedReader bufferedReader=new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\bin\\file.txt"));
	String line=bufferedReader.readLine();
	while (line !=null) {
		System.out.println(line);
		line=bufferedReader.readLine();
	}
	bufferedReader.close();
	}
	
}
