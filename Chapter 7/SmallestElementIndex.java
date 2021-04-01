import java.util.Scanner;

public class SmallestElementIndex {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter ten integer values
		System.out.print("Enter int #1: ");
		int int1 = sc.nextInt();
		System.out.print("Enter int #2: ");
		int int2 = sc.nextInt();
		System.out.print("Enter int #3: ");
		int int3 = sc.nextInt();
		System.out.print("Enter int #4: ");
		int int4 = sc.nextInt();
		System.out.print("Enter int #5: ");
		int int5 = sc.nextInt();
		System.out.print("Enter int #6: ");
		int int6 = sc.nextInt();
		System.out.print("Enter int #7: ");
		int int7 = sc.nextInt();
		System.out.print("Enter int #8: ");
		int int8 = sc.nextInt();
		System.out.print("Enter int #9: ");
		int int9 = sc.nextInt();
		System.out.print("Enter int #10: ");
		int int10 = sc.nextInt();

		// Create integer array with user input
		int[] numbers = {int1, int2, int3, int4, int5, int6, int7, int8, int9, int10};
				
		// Display the smallest element's index 
		System.out.println("The smallest element's index is: " + indexOfSmallestElement(numbers));
	}

	// Computes the smallest element's index in an array
	public static int indexOfSmallestElement(int[] array) {
		int min = array[0];
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;	
	}
}