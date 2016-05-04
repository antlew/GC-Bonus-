package com.cbd.freelance;

import java.util.Random;
import java.util.Scanner;

public class NBAProject {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String again;
		int team;
		int versus;
		
		String[] teams = { "Clippers", "Warriors", "Spurs", "Thunder", "Blazers", "Rockets","Mavericks", "Grizzlies"};

		System.out.println("Welcome to my NBA Western Conference playoff matchup.");
				
		do {
			System.out.println("Please enter what team you would like to play with.\n");
			
			teamMenu(teams);
			team = reader.nextInt();
			
			System.out.println("\nYou chose the " + teams[team - 1] + " so please choose an opponent.");
			teamMenu(teams);
			versus = reader.nextInt();
			
			do {
				if (team == versus) {
					System.out.println("\nYour teams can not play each other! Please choose another opponent");
					versus = reader.nextInt();
				}
			} while (team == versus);
			System.out.println("\nYour matchup is between " + teams[team - 1] + " vs " + teams[versus - 1] + ". Enter any character to play the first half.");
					
			reader.next();
			
			int chancesToWinUser1 = teamSelection(team);
			int chancesToWinOpponent1 = teamSelection(team);
			
			System.out.println("\nAt the end of the first half the score is:");
			
			System.out.println(teams[team - 1] + " " + chancesToWinUser1);
			System.out.println(teams[versus - 1] + " " + chancesToWinOpponent1);
			System.out.println("\nEnter any character to play the second half.");
			
			 reader.next();
			
			int chancesToWinUser2 = teamSelection(team);
			int chancesToWinOpponent2 = teamSelection(team);
			
			System.out.println("\nAt the end of the Second Half the score is:");
			System.out.println(teams[team - 1] + " " + (chancesToWinUser2 + chancesToWinUser1));
			System.out.println(teams[versus - 1] + " " + (chancesToWinOpponent2 + chancesToWinOpponent1));
			
			if ((chancesToWinUser2 + chancesToWinUser1) > (chancesToWinOpponent2 + chancesToWinOpponent1)) {
				System.out.println("\nVICTORY! Your " + teams[team - 1] + " beat the " + teams[versus - 1]);
				
			} else if ((chancesToWinUser2 + chancesToWinUser1) < (chancesToWinOpponent2 + chancesToWinOpponent1)) {
				System.out.println("\nToo bad better luck next time. Your " + teams[team - 1] + " lost to the " + teams[versus - 1]);
						
			} else {
				System.out.println("Looks like we are going into overtime! Enter a character to play overtime");
				 reader.next();

				int chancesToWinUser3 = teamSelection(team);
				int chancesToWinOpponent3 = teamSelection(team);

				System.out.println("At the end of OT the score is:");
				System.out.println(teams[team - 1] + " " + (chancesToWinUser2 + chancesToWinUser1 + chancesToWinUser3));
				System.out.println(teams[versus - 1] + " " + (chancesToWinOpponent2 + chancesToWinOpponent1 + chancesToWinOpponent3));
						
			}
			System.out.println("Would you like to play again? yes or no");
			again = reader.next();
			
		} while (again.equalsIgnoreCase("yes"));
		reader.close();

	}



	public static int teamSelection(int team) {
		
		Random rand = new Random();
		
		int clippers = 43;
		int warriors = 50;
		int spurs = 47;
		int thunder = 45;
		int blazers = 40;
		int rockets = 40;
		int mavericks = 40;
		int grizzlies = 37;
		int chancesToWin = 0;
		int probability = rand.nextInt(15) + 1;
		
		switch (team) {
		case 1: {
			chancesToWin = clippers + probability;
			break;

		}
		case 2: {
			chancesToWin = warriors + probability;
			break;
		}
		case 3: {
			chancesToWin = spurs + probability;
			break;
		}
		case 4: {
			chancesToWin = thunder + probability;
			break;
		}
		case 5: {
			chancesToWin = blazers + probability;
			break;
		}
		case 6: {
			chancesToWin = rockets + probability;
			break;
		}
		case 7: {
			chancesToWin = mavericks + probability;
			break;
		}
		case 8: {
			chancesToWin = grizzlies + probability;
			break;
		}
		default:
			System.out.println("Please choose a team listed.");
		}
		
		return chancesToWin;
	}

	public static void teamMenu(String[] teams) {
		
		System.out.println("Pick a team.\n");
		
		for (int i = 0; i < teams.length; i++) {
			System.out.println((i+1) + " = " + teams[i]);
		}

	}

}
