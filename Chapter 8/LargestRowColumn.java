
public class LargestRowColumn {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
			}
		}
		
		int rowIndex = 0; 
		int columnIndex = 0;
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				rowIndex = i;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				columnIndex = i;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("The largest row index: " + rowIndex);
		System.out.println("The largest column index: " + columnIndex);
	}
}
