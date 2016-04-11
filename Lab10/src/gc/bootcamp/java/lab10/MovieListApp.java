package gc.bootcamp.java.lab10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MovieListApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		String[] category = { "animated","drama", "horror", "scifi", "comedy", "musical"};
		String sort = null;
		int[] catNumber = { 1, 2, 3, 4, 5, 6, 7 };
		String again; 

		for (int i = 1; i < 100; i++) {
			movieList.add(i - 1, Movie.getMovie(i));
		}

		Collections.sort(movieList, (m1, m2) -> m1.getName().compareTo(m2.getName()));

		System.out.println("Welcome to my movie library!");
		System.out.println("There are 100 movies in this list.");

		
		do {
			movieMenu(catNumber, category);
			int selection = reader.nextInt();
			switch (selection) {
			case 1:
				sort = "animated";
				break;
			case 2:
				sort = "drama";
				break;
			case 3:
				sort = "horror";
				break;
			case 4:
				sort = "scifi";
				break;
			case 5:
				sort = "comedy";
				break;
			case 6:
				sort = "musical";
				break;

			default:
				break;

			}
			for (Movie movie : movieList) {
				if (movie.getGenre().equalsIgnoreCase(sort)) {
					System.out.println(movie.getName());
				}
			}
			System.out.println("\nWould you like to select another genre?");
			again = reader.next();
		} while (again.equalsIgnoreCase("y"));
		System.out.println("Thank you for stopping by!");
		reader.close();

	}

	private static void movieMenu(int[] menuNumber, String[] menuCategory) {

		System.out.println("\nWhat category are you interested in? ");
		for (int i = 0; i < menuCategory.length; i++) {
			System.out.println("\t\t" + menuNumber[i] + " is " + menuCategory[i]);
		}

	}

}
