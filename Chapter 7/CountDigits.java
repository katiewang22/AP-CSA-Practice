
public class CountDigits {
	public static void main(String[] args) {
		
		// Create array of ten integers
		int[] counts = new int[10];

		// Store the counts of 100 random numbers
		for (int i = 1; i <= 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("Count for each random number (0-9):");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]);
		}
	}
}