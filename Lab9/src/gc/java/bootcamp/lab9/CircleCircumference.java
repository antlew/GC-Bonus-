package gc.java.bootcamp.lab9;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String again;
		

		System.out.println("Welcome to the Circle Tester");

		do {
			System.out.println("Enter radius:");
			double radius = reader.nextInt();
			
			Circle circle = new Circle(radius);
			
			double area = circle.getArea();
			double circumference = circle.getCircumference();
			
			System.out.println("Area: " + area);
			System.out.println("Circumference: " + circumference);
			
			System.out.println("Would you like to continue? (y/n): ");
			again = reader.next();
			
		} while (again.equalsIgnoreCase("y"));
		
		int plus = Circle.getObjectCount();
		System.out.println("Thank you for stopping by. You created " + plus + " Circle object(s).");
		
		reader.close();

	}

}
