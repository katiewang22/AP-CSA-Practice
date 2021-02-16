
import java.util.Scanner; 

public class CostOfDriving {

	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter distance, mpg, price per gallon
		System.out.print("Enter the driving distance: ");
		double drivingDis = sc.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = sc.nextDouble();

		System.out.print("Enter price per gallon: ");
		double pricePerGallon = sc.nextDouble();
		
		// processing: Plug values into formula
		double cost = (drivingDis / milesPerGallon) * pricePerGallon;

		// output: Display the results
		System.out.println("The cost of driving is " + cost);
	}
}