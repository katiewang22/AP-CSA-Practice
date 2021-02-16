
import java.util.Scanner; 

public class AreaOfHexagon {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter length of side
		System.out.print("Enter the length of the side: ");
		double length = sc.nextDouble();

		// processing: Plug value into formula
		double area = ((3 * Math.sqrt(3)) / 2) * length * length;

		// output: Display the results
		System.out.println("The area of the hexagon is " + area);
	}
}