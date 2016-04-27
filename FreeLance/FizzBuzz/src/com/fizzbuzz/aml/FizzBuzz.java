package com.fizzbuzz.aml;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i < 25; i++) {
			if (i % 5 == 0 & i % 3 == 0) {
				System.out.println("FizzBuzz " + i);
			}
			else if  (i % 3 == 0) {
				System.out.println("Fizz " + i);
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz " + i);
			}
			 else{
			 System.out.println(i);
			 }

		}

	}

}
