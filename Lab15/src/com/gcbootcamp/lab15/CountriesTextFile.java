package com.gcbootcamp.lab15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class CountriesTextFile {
	
	private CountriesTextFile(){
		
	}
	
	public static ArrayList<String> list = new ArrayList<String>();
	
	public static ArrayList<String> addFile() {
		
		try {
			
		FileReader reader = new FileReader("path");
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line;
		
		while((line = bufferedreader.readLine())!= null){
			list.add(line);
		}
		bufferedreader.close();
		
	} catch (IOException e){
		e.printStackTrace();
	}
		return list;
	}
	
	public static void addToFile(ArrayList<String> list){
		try {
			PrintStream out = new PrintStream(new FileOutputStream("path"));

			for (String s : list) {
				out.print(s + "\n");
			}

			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}