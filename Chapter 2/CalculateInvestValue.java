
import java.util.Scanner; 

public class CalculateInvestValue {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter investment amount, interest rate, and years
		System.out.print("Enter investment maount: ");
		double invest = sc.nextDouble();

		System.out.println("Enter annual interest rate in %: ");
		double monthlyRate = sc.nextDouble();
		monthlyRate /= 1200;
		
		System.out.print("Enter number of years: ");
		int numYears = sc.nextInt();

		// processing: Plug values into formula
		double investValue = invest * Math.pow((1 + monthlyRate), numYears*12);

		// output: Display the results
		System.out.println("Accumulated value is " + investValue);
	}
}