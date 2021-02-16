
import java.util.Scanner; 

public class WindChillTemp {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter temperature and wind speed
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temp = sc.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double wind = sc.nextDouble();

		// processing: Plug values into formula
		double windChill = 35.74 + 0.6215 * temp - 35.75 *  Math.pow(wind, 0.16)
		+ 0.4275 * temp * Math.pow(wind, 0.16);

		// output: Display the results
		System.out.println("The wind chill index is " + windChill);
	}
}