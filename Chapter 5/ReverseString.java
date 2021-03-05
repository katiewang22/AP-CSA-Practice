import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		char[] letters = input.toCharArray();
		
		for (int i = letters.length - 1; i>=0; i--) {
			System.out.print(letters[i]);
		}
	}
}
