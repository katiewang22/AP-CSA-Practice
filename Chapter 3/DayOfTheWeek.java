import java.util.Scanner;

public class DayOfTheWeek {
	public static void main (String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter year, month, and day
		System.out.print("Enter the year (e.g., 2012): ");
		int year = sc.nextInt();
		System.out.print("Enter the month (1-12): ");
		int month = sc.nextInt();
		System.out.print("Enter the day of the month (1-31): ");
		int day = sc.nextInt();
		
		// Convert Jan and Feb to month 13 and 14 
		if (month == 1 || month == 2) {
			month = (month == 1) ? 13 : 14;
			year--;
		}
		
		// Calculate day of the week
		int dayOfWeek = (day + (26 * (month + 1)) / 10 + (year % 100) 
				        + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7; 
		
		// Get the name of the day 
		String result = "";
		switch(dayOfWeek) {
			case 0: 
				result = "Saturday";
				break;
			case 1: 
				result = "Sunday";
				break;
			case 2: 
				result = "Monday";
				break;
			case 3:
				result = "Tuesday";
				break;
			case 4:
				result = "Wednesday";
				break;
			case 5:
				result = "Thursday";
				break;
			case 6:
				result = "Friday";
				break;
		}
		
		// Display the results
		System.out.print("The day of the week is " + result);
	}
}