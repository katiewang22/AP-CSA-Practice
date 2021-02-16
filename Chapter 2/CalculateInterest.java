
import java.util.Scanner; 

public class CalculateInterest {

public static void main(String args[]) {

		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter balance and interest rate
		System.out.print("Enter balance and interest rate: ");
		double balance = sc.nextDouble();
		double annualRate = sc.nextDouble();
		
		// processing: Plug values into formula
		double interest = balance * (annualRate / 1200);

		// output: Display the results
		System.out.println("The interest is " + interest);
	}
}