import java.util.Scanner;

public class BattingStats {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int input;
		double total = 0;
		double hits = 0;
		String nextBatter = null;

		System.out.println("Welcome to the Batting Average Calculator!");

		do {
			System.out.println("Enter the number of times at bat: ");
			input = reader.nextInt();
			int[] atBats = new int[input];
			System.out.println("Enter the number of bases for each at bat: ");
			System.out.println("\n0=out, 1=single, 2=double, 3=triple, 4=home run ");

			for (int i = 0; i < atBats.length; i++) {

				System.out.println("Result for at-bat " + (i + 1) + ": ");
				atBats[i] = reader.nextInt();
				total += atBats[i];

				if (atBats[i] > 0)
					hits++;
			}
			System.out.println("The batting average is: " + (hits / atBats.length));
			System.out.println("The slugging average is: " + (total / atBats.length));
			System.out.println("Another batter? Enter(y/n): ");
			nextBatter = reader.next();
		} while (nextBatter.equalsIgnoreCase("y"));

		reader.close();
	}

}
