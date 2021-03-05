import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		char[] letters = input.toCharArray();
		
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ('A') || letters[i] == ('a')) {
				vowels++;
			} else if (letters[i] == ('E') || letters[i] == ('e')){
				vowels++;
			} else if (letters[i] == ('I') || letters[i] == ('i')){
				vowels++;
			} else if (letters[i] == ('O') || letters[i] == ('o')){
				vowels++;
			} else if (letters[i] == ('U') || letters[i] == ('u')){
				vowels++;
			} else if (letters[i] != (' ')){
				consonants++;
			}
		}
		
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
	}
}