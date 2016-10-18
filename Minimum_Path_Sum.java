

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] A = new int[row][column];
        A[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            A[i][0] = A[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < column; i++) {
            A[0][i] = A[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                A[i][j] = A[i - 1][j] < A[i][j - 1] ? A[i - 1][j] + grid[i][j] : A[i][j - 1] + grid[i][j];
            }
        }
        return A[row - 1][column - 1];
    }
}
