import java.util.Scanner;

public class Multiply2Matrices {
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double[3][3];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int h = 0; h < matrix.length; h++) {
					matrix[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return matrix;
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
		
		double[][] array3 = multiplyMatrix(array1, array2);
		System.out.println("The matrices multiplied together equal: ");
		for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
            	System.out.print(Math.round(array3[i][j] * 100.0) / 100.0 + " ");
            }
            System.out.println();
        }
	}
}
