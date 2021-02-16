import java.util.Scanner;

public class CharOfASCII {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
				
		// Prompt user to enter code
		System.out.print("Enter an ASCII code: ");
		int code = sc.nextInt();
		
		// Get the letter
		char output = (char) code;
		
		// Display the result
		System.out.println("The character for ASCII code " + code+ " is " + output);
	}
}
