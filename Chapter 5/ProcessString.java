import java.util.Scanner;

public class ProcessString {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		char[] letters = input.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			if (i % 2 == 0) {
				System.out.print(letters[i]);
			}
		}
	}
}