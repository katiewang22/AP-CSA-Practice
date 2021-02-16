import java.util.Scanner;

public class PointInCircle {
	public static void main (String[] args) { 
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
			
		// Prompt user to enter coordinates
		System.out.print("Enter the x-coordinate of the point: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the y-coordinate of the point: ");
		double y1 = sc.nextDouble();
		
		// Calculate distance to center of circle (0,0)
		double distance = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		// Test case and display result
		if (distance <= 10) {
			System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle");
		} else {
			System.out.println("Point (" + x1 + ", " + y1 + ") is not in the circle");
		}
	}
}