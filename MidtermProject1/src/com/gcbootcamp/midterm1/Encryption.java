package com.gcbootcamp.midterm1;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Encryption {

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
			decodedArray = encryptMessage(randomNumber, message);
			System.out.println("Would you like to decrypt this message? y/n");
			again = reader.next();
			if (again.equalsIgnoreCase("n")) {
				System.out.println("thank you");
				break;
			}
			decodedShift = decryptMessage(decodedShift, randomNumber, decodedArray);
		} while (again.equalsIgnoreCase("y"));
	}

	public static char[] encryptMessage(int randomNumber, String message) {

		char[] charArray = message.toCharArray();
		char[] decodedArray = new char[charArray.length];
		char shiftedLetter = '0';

		for (int i = 0; i < charArray.length; i++) {
			int letterToBeShifted = (int) charArray[i];
			if ((letterToBeShifted >= 65) && (letterToBeShifted <= 90)) {
				shiftedLetter = (char) ((((charArray[i] - 65) + randomNumber) % 26) + 65);
				System.out.print(shiftedLetter);
				decodedArray[i] = shiftedLetter;

			} else if ((charArray[i] >= 97) && (charArray[i] < 122)) {
				shiftedLetter = (char) ((((charArray[i] - 97) + randomNumber) % 26) + 97);
				System.out.print(shiftedLetter);
				decodedArray[i] = shiftedLetter;
			} else {
				System.out.print((char) letterToBeShifted);
				decodedArray[i] = shiftedLetter;
			}
		}
		System.out.println("\n");
		return decodedArray;
	}

	private static char decryptMessage(char decodedShift, int randomNumber, char[] decodedArray) {
		int shiftBack;
		for (int i = 0; i < decodedArray.length; i++) {
			shiftBack = (int) decodedArray[i];
			if ((shiftBack >= 65) && (shiftBack <= 90)) {
				decodedShift = (char) ((((decodedArray[i] - 65) - randomNumber) % 26) + 65);
				System.out.print(decodedShift);
			} else if ((shiftBack >= 97) && (shiftBack <= 122)) {
				decodedShift = (char) ((((decodedArray[i] - 97) - randomNumber) % 26) + 97);
				System.out.print(decodedShift);
			} else {
				System.out.print((char) decodedShift);

			}
		}
		return decodedShift;
	}

}
