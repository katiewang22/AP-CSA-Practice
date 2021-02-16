import java.util.Scanner; 

public class Algorithm3 {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter radius and length
		System.out.print("Enter a value for feet: ");
		double feet = sc.nextDouble();
		
		// processing: Convert feet to meters
		double meters = feet * 0.305;
		
		// output: Display the results
		System.out.println(feet + " feet is " + meters + " meters"); 
	}
}