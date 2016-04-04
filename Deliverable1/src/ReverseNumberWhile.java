import java.util.Scanner;//Scanner

public class ReverseNumberWhile {

	public static void main(String[] args) {

		int number = 0;
		int reversenumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		//Tag and description
		System.out.println("Reverse Number Deliverable");
		System.out.println("By: Anthony Lewis for Grand Circus Detroit's Java Bootcamp");
		System.out.println("");
		System.out.println("About This Program: This program will reverse the number you input. The number you input must be at least 4 digits long.");
		System.out.println("");
		
		//prompt for user
		System.out.println("Input your 4 digit number here: ");
		
		Scanner in = new Scanner(System.in);
		
		number = in.nextInt();
		
		//rules for less than 4 digits
		//if less than 1000 get Error
		if(number < 1000){
			System.out.println("Your number is not 4 digits.");
			number = scanner.nextInt();
					}
		//rules for correct input	
		//if more than 1000 run code
		if (number >= 1000) while(number != 0){
			
			reversenumber = reversenumber *10;
			reversenumber = reversenumber + number %10;
			number = number /10;
		}
				System.out.println("Reverse number is: " +reversenumber);
		}			
		
	}


