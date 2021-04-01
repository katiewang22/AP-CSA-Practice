import java.util.Scanner;

public class LargestElement {
	
	public static int[] locateLargest(double[][] a) {
		int[] largest = new int[2];
		largest[0] = 0;
		largest[1] = 0;
		double max = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					largest[0] = i;
					largest[1] = j;
					max = a[i][j];
				}
			}
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int row = sc.nextInt();
		int column = sc.nextInt();

		double[][] array = new double[row][column];

		System.out.println("Enter the array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextDouble();
			}
		}

		int[] location = locateLargest(array);

		System.out.println("The location of the largest element is at (" +
							location[0] + ", " + location[1] + ")");
	}
}
