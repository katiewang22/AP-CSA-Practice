import java.util.Scanner;

public class GreatCircleDistance {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter points
		System.out.println("Enter the following in degrees");
		System.out.print("Latitude of point 1: ");
		double x1 = Math.toRadians(sc.nextDouble());
		System.out.print("Longitude of point 1: ");
		double y1 = Math.toRadians(sc.nextDouble());
		System.out.print("Latitude of point 2: ");
		double x2 = Math.toRadians(sc.nextDouble());
		System.out.print("Longitude of point 2: ");
		double y2 = Math.toRadians(sc.nextDouble());
		
		// Calculate the distance
		double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + 
						  Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		
		// Display results
		System.out.println("The distance between the two points is: " + distance);
	}
}