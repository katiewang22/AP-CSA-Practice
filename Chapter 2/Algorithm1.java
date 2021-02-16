import java.util.Scanner; 

public class Algorithm1 {
	
	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in); 
		
		// input: Prompt the user to enter the degrees in Celsius
		System.out.print("Enter a degree in Celsius: "); 
		double celsius = sc.nextDouble();
		
		// processing: Convert the Celsius to Fahrenheit 
		double fahrenheit = (9.0 / 5) * celsius + 32; 
		
		// output: Display the result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}