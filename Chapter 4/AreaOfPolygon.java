import java.util.Scanner;

public class AreaOfPolygon {
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
				
		// Prompt user to enter values
		System.out.print("Enter the number of sides: ");
		int sides = sc.nextInt();
		System.out.print("Enter the side length: ");
		double length = sc.nextDouble();
		
		// Calculate the area
		double area = (sides * Math.pow(length, 2))/(4 * Math.tan(Math.PI/sides));
		
		// Display the result
		System.out.println("The area of the polygon is: " + area);
	}
}
