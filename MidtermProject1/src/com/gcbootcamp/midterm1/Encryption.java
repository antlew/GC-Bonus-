package com.gcbootcamp.midterm1;

public class Encryption {

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

			} else if ((charArray[i] >= 97) && (charArray[i] <= 122)) {
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

}
