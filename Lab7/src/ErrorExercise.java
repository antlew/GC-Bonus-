import java.util.Scanner;

public class ErrorExercise {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int number = 0;
		Boolean validateNumber;
		Boolean validateOption;
		String again;

		System.out.println("Welcome to our Java class!");

		do {
			System.out.println("Which student would you like to learn more about?");

			do {
				System.out.println("Enter a number between 1 and 20: ");
				number = reader.nextInt();
				validateNumber = validateNumberIsBetween1and20(number);
			} while (!validateNumber);
			
			System.out.println("Student " + number + " is Mike Anderson.");
			System.out.println("What would you like to know about Mike?");
			
			do {
				System.out.println("Enter hometown or favorite food: ");
				String option = reader.next();
				validateOption = validateOptionBetweenHomeandFood(option);
			} while (!validateOption);
			
			System.out.println("Mike is from Los Angeles, California.");
			
			System.out.println("Would you like to know more about the class? (enter y for yes or n for no):");
			again = reader.next();
			
		} while (again.equalsIgnoreCase("y"));

		System.out.println("Thank you for stopping by!");
		
		reader.close();

	}

	private static Boolean validateNumberIsBetween1and20(int number) {
		if (number >= 1 && number <= 20) {
			return true;
		}
		System.out.println("That student does not exist. Please try again. (enter a number (1-20): ");
		return false;
	}

	private static Boolean validateOptionBetweenHomeandFood(String option) {
		if (option.equalsIgnoreCase("hometown") || option.equalsIgnoreCase("favorite food")) {
			return true;
		}
		System.out.println("That data does not exist. Please try again.(enter hometown or favorite food): ");
		return false;
	}

}
