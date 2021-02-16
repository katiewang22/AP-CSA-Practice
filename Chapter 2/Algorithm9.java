
import java.util.Scanner; 

public class Algorithm9 {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter v0, v1, and t
		System.out.print("Enter v0, v1, and t: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		
		// processing: Plug values into formula
		double avgAccel = (v1 - v0)/t;

		// output: Display the results
		System.out.println("The average acceleration is " + avgAccel);
		
	}
}