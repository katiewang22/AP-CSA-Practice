
import java.util.Scanner; 

public class CalculateEnergy {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter water, initial temperature, and final temperature
		System.out.print("Enter the amount of water in kilograms: ");
		double water = sc.nextDouble();

		System.out.print("Enter the initial temperature in Celsius: ");
		double initalTemp = sc.nextDouble();
		
		System.out.print("Enter the final temperature in Celsius: ");
		double finalTemp = sc.nextDouble();
		
		// processing: Plug values into formula
		double energy = water * (finalTemp - initalTemp) * 4184;

		// output: Display the results
		System.out.println("The energy needed is " + energy);
		
	}
}