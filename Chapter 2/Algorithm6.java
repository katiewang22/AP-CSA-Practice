import java.util.Scanner; 

public class Algorithm6 {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter # between 0 and 1000
		System.out.print("Enter a number between 0 and 1000: ");
		int num = sc.nextInt();
		
		// processing: Separating digits and finding sum
		int firstDigit = num % 10; //2
		int removeDigit = num / 10;
		int secondDigit = removeDigit % 10; //3
		int thirdDigit = num / 100;

		int sum = firstDigit + secondDigit + thirdDigit;
		
		// output: Display the results
		System.out.println("The sum of the digits is " + sum); 
	}
}