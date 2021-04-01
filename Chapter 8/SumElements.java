import java.util.Scanner;

public class SumElements {

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		
		for(int i = 0 ; i < 3; i++) {
		     total += m[i][columnIndex];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		
		double[][] array = new double[3][4];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				array[r][c] = sc.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements at column 0 is " + sumColumn(array, 0));
		System.out.println("Sum of the elements at column 1 is " + sumColumn(array, 1));
		System.out.println("Sum of the elements at column 2 is " + sumColumn(array, 2));
		System.out.println("Sum of the elements at column 3 is " + sumColumn(array, 3));
	}
}