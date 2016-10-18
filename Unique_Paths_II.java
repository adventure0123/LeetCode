

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        if (row == 0) {
            return 0;
        }
        int column = obstacleGrid[0].length;
        int[][] A = new int[row][column];
        if (obstacleGrid[0][0] == 1) {
            return 0;
        } else {
            A[0][0] = 1;
        }
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] != 1) {
                A[i][0] = A[i - 1][0];
            } else {
                A[i][0] = 0;
            }
        }
        for (int i = 1; i < column; i++) {
            if (obstacleGrid[0][i] != 1) {
                A[0][i] = A[0][i - 1];
            } else {
                A[0][i] = 0;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 1) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = A[i - 1][j] + A[i][j - 1];
                }
            }
        }
        return A[row - 1][column - 1];
    }
}
