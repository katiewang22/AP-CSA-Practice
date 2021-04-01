import java.util.Scanner;

public class AssignGrades {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to input scores
		System.out.print("Enter score #1: ");
		int score1 = sc.nextInt();
		System.out.print("Enter score #2: ");
		int score2 = sc.nextInt();
		System.out.print("Enter score #3: ");
		int score3 = sc.nextInt();
		System.out.print("Enter score #4: ");
		int score4 = sc.nextInt();
		
		// Declare array with scores
		int[] scoreList = {score1, score2, score3, score4};
		
		// Stores value of highest score
		int best = scoreList[0];
		
		// Computes the highest score
		for (int i = 1; i < scoreList.length; i++) {
			if (scoreList[i] > best) {
				best = scoreList[i];
			}
		}
	        
		String grade;
		
		// Computes the grade based on the highest score
		for (int j = 0; j < scoreList.length; j++) {
			if (scoreList[j] >= best - 10) {
				grade = "A";
			} else if (scoreList[j] >= best - 20) {
				grade = "B";
			} else if (scoreList[j] >= best - 30) {
				grade = "C";
			} else if (scoreList[j] >= best - 40) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			// Displays result for each student
			System.out.println("Student " + j + " score is " + scoreList[j] + 
							   " and grade is " + grade);
		}
	}
}