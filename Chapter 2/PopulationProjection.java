
import java.util.Scanner; 

public class PopulationProjection {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter water, initial temperature, and final temperature
		System.out.print("Enter the number of years: ");
		int years = sc.nextInt();
		
		// processing: Plug values into formula
		int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);

		// output: Display the results
		System.out.println("The population in " + years + " year is " + population);
		
	}
}