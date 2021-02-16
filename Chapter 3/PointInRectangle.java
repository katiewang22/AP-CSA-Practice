import java.util.Scanner;

public class PointInRectangle {
	public static void main (String[] args) { 
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
			
		// Prompt user to enter coordinates
		System.out.print("Enter the x-coordinate of the point: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the y-coordinate of the point: ");
		double y1 = sc.nextDouble();
		
		// Calculate horizontal and verticle distances
		double horizontalDis = Math.abs(x1-0);
		double verticalDis = Math.abs(y1-0);
		
		// Test cases and display result
		if (horizontalDis <= (10/2) && verticalDis <= (5.0/2)) {
			System.out.println("Point (" + x1 + ", " + y1 + ") is in the rectangle");
		} else {
			System.out.println("Point (" + x1 + ", " + y1 + ") is not in the rectangle");
		}
	}
}