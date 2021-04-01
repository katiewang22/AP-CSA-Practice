import java.util.Scanner;

public class Add2Matrices {
	public static double[][] addMatrix(double[][] a, double [][] b) {
		double[][] sum = new double[3][3];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix1 (3-by-3): ");
		
		double[][] array1 = new double[3][3];
		for (int r = 0; r < array1.length; r++) {
			for (int c = 0; c < array1[r].length; c++) {
				array1[r][c] = sc.nextDouble();
			}
		}
		
		System.out.println("Enter matrix2 (3-by-3): ");
		
		double[][] array2 = new double[3][3];
		for (int r = 0; r < array2.length; r++) {
			for (int c = 0; c < array2[r].length; c++) {
				array2[r][c] = sc.nextDouble();
			}
		}
		
		double[][] array3 = addMatrix(array1, array2);
		System.out.println("The matrices added together equal: ");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	System.out.print(array3[i][j] + " ");
            }
            System.out.println();  
        }
	}
}
