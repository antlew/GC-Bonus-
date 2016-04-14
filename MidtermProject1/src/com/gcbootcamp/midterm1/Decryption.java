package com.gcbootcamp.midterm1;

public class Decryption {

	public static char decryptMessage(char decodedShift, int randomNumber, char[] decodedArray) {
		
		int shiftBack;
		
		for (int i = 0; i < decodedArray.length; i++) {
			shiftBack = (int) decodedArray[i];
			if ((shiftBack >= 65) && (shiftBack <= 90)) {
				shiftBack = (decodedArray[i] - 65) - randomNumber;
				if (shiftBack < 0) {
					shiftBack += 91;
				} else {
					shiftBack %= 26;
					shiftBack += 65;
				}
				decodedShift = (char) shiftBack;
				System.out.print(decodedShift);
			} else if ((shiftBack >= 97) && (shiftBack <= 122)) {
				shiftBack = (decodedArray[i] - 97) - randomNumber;
				if (shiftBack < 0) {
					shiftBack += 123;
				} else {
					shiftBack %= 26;
					shiftBack += 97;
				}
				decodedShift = (char) shiftBack;
				System.out.print(decodedShift);
			} else {
				System.out.print((char) decodedShift);

			}
		}
		return decodedShift;
	}

}
