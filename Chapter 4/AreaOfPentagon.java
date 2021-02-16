import java.util.Scanner;

public class AreaOfPentagon {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter length
		System.out.print("Enter the length from the center to a vertex: ");
		double length = sc.nextDouble();
		
		// Calculate the area
		double side = 2 * length * Math.sin(Math.PI/5);
		double area = (5 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/5));
		
		// Display results
		System.out.printf("The area of the pentagon is: %4.2f", area);
	}
}
