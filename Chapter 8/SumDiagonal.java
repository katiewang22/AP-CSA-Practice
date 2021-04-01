import java.util.Scanner;

public class SumDiagonal {

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				if (r == c) {
					sum += m[r][c];
				}
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		
		double[][] array = new double[4][4];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				array[r][c] = sc.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));
	}
}