package com.gcbootcamp.lab15;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int choice;

		ArrayList<String> list = new ArrayList<String>();
		list = CountriesTextFile.addFile();
		String country = "";

		do {
			countryMenu();
			choice = reader.nextInt();
			switch (choice) {
			case (1):
				for (String s : list)
					System.out.println(s);
				System.out.println("");
				break;

			case (2):
				System.out.println("Enter country: ");
				country = reader.next();
				list.add(country);
				System.out.println(country + " added to the list.");
				break;

			case (3):
				System.out.println("Enter country: ");
				country = reader.next();
				list.remove(country);
				System.out.println(country + " removed from list.");
				break;

			case (4):
				CountriesTextFile.addToFile(list);
				System.out.println("Goodbye.");
				break;
			}
		} while (choice != 4);

	}

	private static void countryMenu() {
		System.out.println("\nEnter - 1 to see the list of countries");
		System.out.println("Enter - 2 to add a country");
		System.out.println("Enter - 3 to remove a country");
		System.out.println("Enter - 4 to exit the system");

	}

}
