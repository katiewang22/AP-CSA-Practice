
import java.util.Scanner; 

public class ComputeBMI {

public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter weight and height
		System.out.print("Enter weight in pounds: ");
		double weight = sc.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = sc.nextDouble();
		
		// processing: Convert to kg and meters, plug values into formula
		double weightKG = weight * 0.45359237;
		double heightM = height * 0.0254;
		double bmi = weightKG / (heightM * heightM);

		// output: Display the results
		System.out.println("BMI is " + bmi);
	}
}