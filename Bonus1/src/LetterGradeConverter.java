import java.util.Scanner;

public class LetterGradeConverter {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
						
		int grade = 0;
		String resume;
		
		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println( );
		
		do{
		System.out.println("Enter a numerical grade: ");
		grade = reader.nextInt();
		
		if (grade <= 100 && grade >= 88){
			System.out.println("Letter Grade: A");
		}
		else if (grade <= 87 && grade >= 80){
			System.out.println("Letter Grade: B");
		}
		else if (grade <= 79 && grade >= 67){
			System.out.println("Letter Grade: C");
		}
		else if (grade <= 66 && grade >= 60){
			System.out.println("Letter Grade: D");
		}
		else {
			System.out.println("Letter Grade: F");
		}	
		System.out.println( );
		
		System.out.println("Resume? Y/N ");
		resume = reader.next();	
		} while (resume.equalsIgnoreCase("Y"));
		
	}
	
}



