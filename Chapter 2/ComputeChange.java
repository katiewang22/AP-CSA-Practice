import java.util.Scanner; 

public class ComputeChange {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: ask the user to enter the amount of money
		System.out.print("Enter an amount as integer, for example, 1156 for 11.56: ");
		int amount = sc.nextInt();
		int remainingAmount = amount;

		// processing: find the # of dollars, quarters, dimes, nickels, and pennies
		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		// output: Display the results
		System.out.println("Your amount " + amount / 100.0 + " consists of ");
		System.out.println(numberOfDollars + " dollars");
		System.out.println(numberOfQuarters + " quarters");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");
	}
}