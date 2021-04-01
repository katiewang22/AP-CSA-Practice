import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter ten double values
		System.out.print("Enter double #1: ");
		double double1 = sc.nextDouble();
		System.out.print("Enter double #2: ");
		double double2 = sc.nextDouble();
		System.out.print("Enter double #3: ");
		double double3 = sc.nextDouble();
		System.out.print("Enter double #4: ");
		double double4 = sc.nextDouble();
		System.out.print("Enter double #5: ");
		double double5 = sc.nextDouble();
		System.out.print("Enter double #6: ");
		double double6 = sc.nextDouble();
		System.out.print("Enter double #7: ");
		double double7 = sc.nextDouble();
		System.out.print("Enter double #8: ");
		double double8 = sc.nextDouble();
		System.out.print("Enter double #9: ");
		double double9 = sc.nextDouble();
		System.out.print("Enter double #10: ");
		double double10 = sc.nextDouble();

		// Create double array with user input
		double[] numbers = {double1, double2, double3, double4, double5, double6, double7, double8,
						   double9, double10};
				
		// Display the minimum value
		System.out.println("The minimum number is: " + min(numbers));
	}

	// Computes the smallest element of the array
	public static double min(double[] array) {
		double min = array[0];
		for (double i: array) {
			if (i < min) {
				min = i;
			}	
		}
		return min;		
	}
}