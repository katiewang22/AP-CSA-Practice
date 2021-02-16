import java.util.Scanner;

public class AreaOfHexagon {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user input for side length
		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		
		// Calculate area 
		double area = (6 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/6));
		
		// Display the result
		System.out.printf("The area of the hexagon is: %4.2f", area);
	}
}