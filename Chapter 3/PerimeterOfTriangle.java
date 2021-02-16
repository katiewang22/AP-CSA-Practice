import java.util.Scanner;

public class PerimeterOfTriangle {
	public static void main (String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to input the three coordinate values
		System.out.print("Input the x-coordinate for edge 1 of a triangle: ");
		double x1 = sc.nextDouble();
		System.out.print("Input the y-coordinate for edge 1 of a triangle: ");
		double y1 = sc.nextDouble();
		System.out.print("Input the x-coordinate for edge 2: ");
		double x2 = sc.nextDouble();
		System.out.print("Input the y-coordinate for edge 2: ");
		double y2 = sc.nextDouble();
		System.out.print("Input the x-coordinate for edge 3: ");
		double x3 = sc.nextDouble();
		System.out.print("Input the y-coordinate for edge 3: ");
		double y3 = sc.nextDouble();
		
		// Test if input is valid
		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
						(x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
						(x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);
		
		// Display if invalid input
		if (valid == false) {
			System.out.println("Input is invalid");
		} else {
			// Compute the sides of the triangle
			double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
			double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
			double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

			// Display the perimeter of the triangle
			System.out.println("The perimeter of the triangle is " + (side1 + side2 + side3));
		}
	}
}