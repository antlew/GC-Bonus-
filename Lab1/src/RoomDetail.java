import java.util.Scanner;

public class RoomDetail {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double length;
		double width;
		String resume;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println( );
		
		do {
			System.out.println("Enter Length: ");
			length = reader.nextDouble();
			
			System.out.println("Enter Width: ");
			width = reader.nextDouble();
			
			double area = (length * width);
			System.out.println("Area: " + area);
			
			double perimeter = (length * 2 + width * 2);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("Resume? Y/N ");
			resume = reader.next();
			
		} while (resume.equalsIgnoreCase("Y"));
		
	}

}
