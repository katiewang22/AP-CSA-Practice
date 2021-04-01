public class WeeklyHours {
	
	public static int[][] sumRows(int[][] array) {
		int[][] total = new int[array.length][2];

		for (int row = 0; row < array.length; row++) {
			total[row][0] = row;
			total[row][1] = 0;
			for (int col = 0; col < array[row].length; col++) {
				total[row][1] += array[row][col];
			}	
		}
		
		return total;
	}
	
	public static void sort(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			int maxCol0 = array[i][0];
			int maxCol1 = array[i][1];
			int maxIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (maxCol1 < array[j][1]) {
					maxCol1 = array[j][1];
					maxCol0 = array[j][0];
					maxIndex = j;
				}
			}

			if (i != maxIndex) {
				array[maxIndex][1] = array[i][1];
				array[maxIndex][0] = array[i][0];
				array[i][1] =  maxCol1;
				array[i][0] =  maxCol0;
			}
		}
	}
	
	public static void main (String[] args) {
		int[][] weeklyHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9},
				};

		int[][] totalHours = sumRows(weeklyHours);
		
		sort(totalHours);
		
		System.out.println("Employee     Total Hours");
		for (int row = 0; row < totalHours.length; row++) {
				System.out.printf("%4d%16d\n", totalHours[row][0], totalHours[row][1]);
		}	
	}
}
