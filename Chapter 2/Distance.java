
import java.util.Scanner; 

public class Distance {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter coordinates
		System.out.print("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.print("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		// processing: Plug values into formula
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

		// output: Display the results
		System.out.println("The distance between the two points is " + distance);
	}
}