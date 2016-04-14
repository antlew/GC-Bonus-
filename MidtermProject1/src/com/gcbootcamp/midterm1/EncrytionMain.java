package com.gcbootcamp.midterm1;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class EncrytionMain {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		char decodedShift = '0';
		String again;

		Calendar calendar = Calendar.getInstance();
		long seed = calendar.getTimeInMillis();
		Random random = new Random(seed);
		int randomNumber = random.nextInt(10) + 1;

		System.out.println("Welcome!");

		char[] decodedArray;

		do {
			System.out.println("\nPlease enter a message you would like to encrypt? \n");
			String message = reader.next();
			decodedArray = Encryption.encryptMessage(randomNumber, message);
			System.out.println("Would you like to decrypt this message? y/n");
			again = validateString(reader);
			if (again.equalsIgnoreCase("n")) {
				System.out.println("thank you");
				break;
			}
			decodedShift = Decryption.decryptMessage(decodedShift, randomNumber, decodedArray);
			break;
		} while (again.equalsIgnoreCase("y"));
	}

	private static String validateString(Scanner reader) {
		while (!reader.hasNext("[ynYN]")) {
			System.out.println("Please enter y for yes or n for no.");
			reader.next();
		}
		return reader.next();
	}

}