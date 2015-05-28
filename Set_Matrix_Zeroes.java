package com.LeetCode;

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/28.
 */
public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == 0) {
            return;
        }
        boolean hang = false;
        boolean lie = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        lie = true;
                    }
                    if (j == 0) {
                        hang = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;

                }
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (hang) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
        if (lie) {
            for (int i = 0; i < column; i++) {
                matrix[0][i] = 0;
            }
        }
       
    }

    public static void main(String[] args) {
        Set_Matrix_Zeroes test = new Set_Matrix_Zeroes();
        int[][] A = {{1, 0, 3}};
        test.setZeroes(A);
    }
}
