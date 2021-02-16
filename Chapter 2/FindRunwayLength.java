
import java.util.Scanner; 

public class FindRunwayLength {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter speed and acceleration
		System.out.print("Enter speed and acceleraion: ");
		double speed = sc.nextDouble();
		double accel = sc.nextDouble();
		
		// processing: Plug values into formula
		double length = (speed*speed)/(2*accel);

		// output: Display the results
		System.out.println("The minimum runway length for this airplane is " + length);
	}
}