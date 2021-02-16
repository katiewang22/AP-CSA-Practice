import java.util.Scanner; 

public class Algorithm5 {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter subtotal and gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = sc.nextDouble();
		double gratuityRate = sc.nextDouble();
		
		// processing: Finding gratuity and total values
		double gratuity = (gratuityRate * .01) * subtotal;
		double total = subtotal + gratuity;
		
		// output: Display the results
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total); 
	}
}