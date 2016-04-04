import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String dragonName;
		String name;
		String resume;
		int street = 0;
		int heads;
		int weapon;
		int eyes;

		System.out.println("Welcome! What is your name? (enter your name):");
		name = reader.next();

		do {
			System.out.println("Would you like to play a game? (enter 'yes' or 'no'):");
			resume = reader.next();

			if (resume.equalsIgnoreCase("no")) {
				break;
			}

			System.out.println(
					"Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you do? (enter \"1\" for face the beast or \"2\" for run away:");
			street = reader.nextInt();

			if (street == 1) {
				System.out.println("You are brave to try and face the beast");

			} else if (street == 2) {
				System.out.println("Are you sure you want to run away?");
				resume = reader.next();

				if (resume.equalsIgnoreCase("yes")) {
					break;
				}

			}
			System.out.println();

			System.out
					.println("You approach the dragon. You see that he has _ heads. (enter \"1\" or \"2\" or \"3\"):");
			heads = reader.nextInt();

			switch (heads) {
			case 1:
				System.out.println(
						"Lucky you! Those are the easiest dragons to kill! Choose your weapon.(enter \"1\" for slingshot or \"2\" for a sword):");
				break;

			case 2:
				System.out.println(
						"Uh Oh! Those are pretty difficult... Good luck! Choose your weapon.(enter \"1\" for slingshot or \"2\" for a sword): ");
				break;

			case 3:
				System.out.println(
						"No one ever defeats a 3 headed dragon! I hope you're quick. Choose your weapon.(enter \"1\" for slingshot or \"2\" for a sword):");
				break;
			}

			weapon = reader.nextInt();

			if (weapon == 1) {
				System.out.println("You chose a slingshot. Armed with your slingshot, you approach the dragon. "
						+ "You can feel its fiery breath as you et closer. What color are its eyes?(enter \"1\" for red or \"2\" for blue");
			} else if (weapon == 2) {
				System.out.println("You chose a sword. Armed with your sword, you approach the draon. "
						+ "You can feel its fiery breath as you et closer. What color are its eyes?(enter \"1\" for red or \"2\" for blue");
			}
			eyes = reader.nextInt();

			if (eyes == 1) {
				System.out.println(
						"Lucky you! Red-eyed dragons make great pets. What would you like to name your next pet? ");
			} else if (eyes == 2) {
				System.out.println(
						"You lucked out! Blue-eyed dragons make great hunting buddy. What would you like to name your new hunting buddy?");

			}
			dragonName = reader.next();
			System.out.println(name + " and " + dragonName + " live happily ever after.");
			System.out.println();

		} while (resume.equalsIgnoreCase("yes"));

	}

}
