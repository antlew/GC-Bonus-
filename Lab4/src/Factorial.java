import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String resume;

		System.out.println("Welcome to the Factorial Calculator!\n");

		do {
			long n;
			System.out.print("Enter an integer that's greater than 0 but less than 10: \n");
			n = scanner.nextInt();

			while (n > 10 || n <= 0) {
				System.out.println("Please enter a number between 1 and 10. Try again.");
				n = scanner.nextInt();
			}

			long result = facts(n);
			System.out.println("\nThe factorial of " + n + " is " + result);

			System.out.println("\nResume?(y/n)");
			resume = scanner.next();

		} while (resume.equalsIgnoreCase("y"));
		
		scanner.close();
	}

	public static long facts(long n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}