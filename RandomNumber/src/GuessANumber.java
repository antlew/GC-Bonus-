import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();

		String tryAgain;

		int guess;
		int tries = 0;

		do {
			int randomNumber = rand.nextInt(100) + 1;

			System.out.println("Welcome to the Guess a Number Game!");
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("\nI'm thinking of a number between 1 and 100.\nTy to guess it,n00b.");
			System.out.println(randomNumber);
			
			do {
				System.out.println("Enter your lousy guess:");
				guess = reader.nextInt();
				tries++;
				if (guess == randomNumber) {
					
					if (tries == 1) {
						System.out.println("You got it in " + tries + " try.");
						System.out.println("You must be seriously amazing slash telepathic!");
					}
					else {
						System.out.println("You got it in " + tries + " tries.");
						System.out.println("Pretty good, I guess. I bet you can do better, though.");
					}
				} 
				
				else if (guess > randomNumber + 10) {
					System.out.println("You're crazy high, bro. Try again.");
				} 
				
				else if (guess < randomNumber - 10) {
					System.out.println("You're crazy low, bro. Try again.");
				} 
				else if (guess > randomNumber && guess < randomNumber + 10) {
					System.out.println("Your guess is too high!");
				} 
				
				else if (guess < randomNumber && guess > randomNumber - 10) {
					System.out.println("Your guess is too low!");
				}
			} while (guess != randomNumber);
			
			System.out.println("Try Again? (y/n)");
			tryAgain = reader.next();

		} while (tryAgain.equalsIgnoreCase("y"));
		
		reader.close();
	}

}
