import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {

		Random randomDice = new Random();
		Scanner reader = new Scanner(System.in);
		String play;
		String again = null;

		int dice1;
		int dice2;
		int total;
		int tries = 0;

		

		System.out.println("Welcome to the Grand Circus Casino! Would you like to roll the dice?(y/n): ");
		play = reader.next();

		do {
			if (play.equalsIgnoreCase("n")) {
				System.out.println("Thank you for stopping by.");
				break;
			}

			System.out.println("Good! Lets see how many tries it takes for you to hit snake eyes. Enter a number to make a roll!");
			int userInput = validateInt(reader);
			tries++;
			
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			total = dice1 + dice2;

			System.out.println("Your first dice is a " + dice1 + ".");
			System.out.println("Your second dice is a " + dice2 + ".");
			System.out.println("On roll " + tries + " you got a " + total + ".\n");

			if (total == 2) {
				System.out.println(
						"SNAKE EYES! You Win. It took you " + tries + " to get snake eyes.\n Thanks for playing!");
				break;
			}

			else if (total > 2) {
				System.out.println("Nice try would you like to play again? (y/n)");
				again = reader.next();
			}

			if (again.equalsIgnoreCase("n")) {
				System.out.println("Thank you for stopping by!");
				break;
			}

		} while (play.equalsIgnoreCase("y"));

		reader.close();
	}

	private static int validateInt(Scanner reader) {
		while (!reader.hasNextInt()) {
			System.out.println("Incorrect! Please enter a number.");
			reader.next();
		}
		return reader.nextInt();
	}

}
