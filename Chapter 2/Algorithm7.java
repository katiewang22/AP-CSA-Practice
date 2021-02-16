import java.util.Scanner; 

public class Algorithm7 {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter number of minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = sc.nextInt();
		
		// processing: Converting minutes into years and days
		int totalDays = minutes / 1440;
		int years = totalDays / 365;
		int days = totalDays % 365;
		
		// output: Display the results
		System.out.println(minutes + " minutes is approximately " + years + " years and " + 
		days + " days");
	}
}