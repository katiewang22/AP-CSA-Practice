import java.util.Scanner; 

public class Algorithm4 {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter number of pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = sc.nextDouble();
		
		// processing: Convert pounds to kilograms
		double kilograms = pounds * 0.454;
		
		// output: Display the results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms"); 
	}
}
