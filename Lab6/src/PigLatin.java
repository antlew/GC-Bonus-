import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String vowels = ("aeiou");
		String[] word;
		String another = null;

		System.out.println("Welcome to the Pig Latin Translator!");

		do {
			System.out.println("Enter a line to be translated: ");
			String sentence = reader.nextLine();
			word = sentence.split(" ");
			for (int i = 0; i < word.length; i++) {
				word[i] = word[i].toLowerCase();
			}
			char firstChar = '0';
			boolean firstVowel = false;
			for (int j = 0; j < word.length; j++) {
				firstChar = word[j].charAt(0);
				int vowelIndex = vowels.indexOf(firstChar);
				firstVowel = (vowelIndex >= 0);
			}
			for (int i = 0; i < word.length; i++) {
				System.out.print("\n\"" + word[i] + "\" in Pig Latin is ");
				if (firstVowel) {
					System.out.println("\"" + word[i] + "-way\"");
				} else {
					String restOfWord = word[i].substring(1);
					System.out.println("\"" + restOfWord + "-" + firstChar + "ay\"");
				}
			}
			System.out.println("Translate another line? (y/n)");
			another = reader.nextLine();
		} while (another.equalsIgnoreCase("y"));
		
		reader.close();
	}

}
