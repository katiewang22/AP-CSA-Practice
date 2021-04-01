
public class ShuffleRows {
	public static void shuffle(int[][] array) {
		int[] temp = new int[2];

		for (int i = 0; i < array.length; i++) {
			int j = (int)(Math.random() * array.length);

			temp[0] = array[i][0];
			temp[1] = array[i][1];
			array[i][0] = array[j][0];
			array[i][1] = array[j][1];
			array[j][0] = temp[0];
			array[j][1] = temp[1];
		}
	}
	
	public static void main(String[] args) {
		int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		shuffle(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
