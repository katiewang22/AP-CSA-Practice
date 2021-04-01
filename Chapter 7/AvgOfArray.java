import java.util.Scanner;

public class AvgOfArray {
	public static void main(String[] args) {
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
		double[] values = {double1, double2, double3, double4, double5, double6, double7, double8,
						   double9, double10};
				
		// Display the average 
		System.out.println("The average value: " + average(values));
	}

	// Compute average of int array
	public static int average(int[] array) {
		int average = 0; 
		for (int i: array) {
			average += i;
		}
		return average / array.length;
	}   

	// Compute average of double array
	public static double average(double[] array) {
		double average = 0; 
		for (double i: array) {
			average += i;
		}
		return average / array.length;
	}
}
