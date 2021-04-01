import java.util.Scanner;

public class AnalyzeScores {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter scores (negative # signifies end): ");

		// Create array of input numbers
		int[] scores = new int[100];
		
		int userScores; // Hold user input
		int numberOfScores = 0; // Number of scores
		int average = 0; // Average score
		
		for (int i = 0; i < 100; i++) {
			userScores = sc.nextInt();	
			
			scores[i] = userScores; // Fill scores array
			average += userScores; // Average stores total scores
			numberOfScores++; // Increment number of scores
				
			if (userScores < 0) {
				break; // End if negative
			}
		}
		
		average /= numberOfScores;	

		int aboveOrEqual = 0; // Scores above or equal to average
		int below = 0; // Scores below average
		
		// Calculate number of scores above/equal or below average
		for (int i = 0; i < numberOfScores; i++) {
			if (scores[i] >= average) {
				aboveOrEqual++;
			} else {
				below++;
			}
		}

		// Display results
		System.out.println("Average of scores: " + average);
		System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
		System.out.println("Number of scores below average: " + below);
	}
}
