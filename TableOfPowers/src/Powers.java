import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Squares and Cubes table\n");
		System.out.println("Lets learn your Squares and Cubes!\n");

		Scanner reader = new Scanner(System.in);

		String resume;
		int square = 0;
		int cube = 0;

		do {
			
			System.out.print("Enter an integer: \n");
			int integer = reader.nextInt();

			String header = "Number  " + "Squared " + "Cubed   " + "\n" + "======  " + "======= " + "=====   ";
			System.out.println(header);

			String row = "";
			for (int i = 1; i <= integer; i++) {

				square = i * i;
				cube = i * i * i;

				row = i + "\t" + square + "\t" + cube;
				System.out.println(row);
			}
			
			System.out.println("\nDo you want to enter another integer?");

			resume = reader.next();

		} while (resume.equalsIgnoreCase("y"));
		
		reader.close();
	}
}
