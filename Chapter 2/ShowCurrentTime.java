import java.util.Scanner; 

public class ShowCurrentTime {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter their time zone offset to GMT
		System.out.print("Enter the time zone offset to GMT: ");
		int timeOffset = sc.nextInt();
		
		// processing: Converting to GMT
		long totalMilliseconds = System.currentTimeMillis();

	    long totalSeconds = totalMilliseconds / 1000;

	    long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;

	    long totalHours = totalMinutes / 60;

	    long currentHour = ((totalHours + timeOffset) % 24);
		
		// output: Display the results
		System.out.println("The current time is " + currentHour + ":" + 
		currentMinute + ":" + currentSecond);
		
	}
}