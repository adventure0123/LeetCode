

public class Search_a_2D_Matrix_II {
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length;
		if (row == 0) {
			return false;
		}
		int column = matrix[0].length;
		int start, end, mid;
		for (int i = 0; i < row; i++) {
			start = 0;
			end = column - 1;
			if (target < matrix[i][start]) {
				return false;
			}
			if (target > matrix[i][end]) {
				continue;
			}
			while (start <= end) {
				mid = (start + end) >> 1;
				if (matrix[i][mid] == target) {
					return true;
				} else if (matrix[i][mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search_a_2D_Matrix_II test = new Search_a_2D_Matrix_II();
		int[][] A = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 },
				{ 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.err.println(test.searchMatrix(A, 18));
	}

}
