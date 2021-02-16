import java.util.Scanner;

public class CornerPointCoords {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
				
		// Prompt user to enter radius
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = sc.nextDouble();
		
		// Calculate the five points
		double x1 = radius * Math.cos(Math.toRadians(18));
		double y1 = radius * Math.sin(Math.toRadians(18));
		double x2 = radius * Math.cos(Math.toRadians(90));
		double y2 = radius * Math.sin(Math.toRadians(90));
		double x3 = radius * Math.cos(Math.toRadians(162));
		double y3 = radius * Math.sin(Math.toRadians(162));
		double x4 = radius * Math.cos(Math.toRadians(234));
		double y4 = radius * Math.sin(Math.toRadians(234));
		double x5 = radius * Math.cos(Math.toRadians(306));
		double y5 = radius * Math.sin(Math.toRadians(306));
		
		// Display the result
		System.out.println("The coords of the 5 points on the pentagon are");
		System.out.printf("( %4.2f, %4.2f) \n", x1, y1);
		System.out.printf("( %4.2f, %4.2f) \n", x2, y2);
		System.out.printf("( %4.2f, %4.2f) \n", x3, y3);
		System.out.printf("( %4.2f, %4.2f) \n", x4, y4);
		System.out.printf("( %4.2f, %4.2f) \n", x5, y5);
	}
}
