public class PracticeProblem {

	public static void main(String[] args) {
		q1();
		q2();
		q3();
	}

	public static void q1() {
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
	System.out.println("Sum of all elements: " + sum2D(nums));
	}
	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
		}
	}
		return sum;
	}


	public static void q2() {
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int row = 1; 
		System.out.println("Sum of row " + row + ": " + sumRow(nums, row));
	}
	public static int sumRow(int[][] arr, int row) {
			int sum = 0;
			if (row >= 0 && row < arr.length) {
				for (int j = 0; j < arr[row].length; j++) {
					sum += arr[row][j];
				}
			}
		return sum;
	}

	public static void q3() {
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int column = 2;
		System.out.println("Sum of column " + column + ": " + sumColumn(nums, column));
	}
		public static int sumColumn(int [][] arr, int column) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (column >= 0 && column < arr[i].length) {
					sum += arr[i][column];
				}
			}
			return sum;
		}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
