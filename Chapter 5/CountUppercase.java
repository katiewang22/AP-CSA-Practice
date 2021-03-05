import java.util.Scanner;

public class CountUppercase {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		char[] letters = input.toCharArray();
		
		int upperCase = 0;
		
		for (int i = 0; i < letters.length; i++) {
			if (Character.isUpperCase(letters[i])) {
				upperCase++;
			}
		}
		
		System.out.println("The number of uppercase letters is " + upperCase);
	}
}