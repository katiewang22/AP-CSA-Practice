import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for input
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

		// Create array of input numbers
		int[] numList = {int1, int2, int3, int4, int5, int6, int7, int8, int9, int10};
		
		// Display results
		for (int i = numList.length - 1; i >= 0; i--) {
			System.out.print(numList[i] + " ");
		}
	}
}
