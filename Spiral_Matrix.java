package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null) {
            return result;
        }
        int row = matrix.length;
        if (row == 0) {
            return result;
        }
        int column = matrix[0].length;
        int start_x = 0;
        int start_y = 0;
        int end_x = row - 1;
        int end_y = column - 1;
        int i;
        while (true) {
            for (i = start_y; i <= end_y; i++) {
                result.add(matrix[start_x][i]);
            }
            if (++start_x > end_x) {
                break;
            }
            for (i = start_x; i <= end_x; i++) {
                result.add(matrix[i][end_y]);
            }
            if (--end_y < start_y) {
                break;
            }
            for (i = end_y; i >= start_y; i--) {
                result.add(matrix[end_x][i]);
            }
            if (--end_x < start_x) {
                break;
            }
            for (i = end_x; i >= start_x; i--) {
                result.add(matrix[i][start_y]);
            }
            if (++start_y > end_y) {
                break;
            }


        }
        return result;
    }

    public static void main(String[] args) {
        Spiral_Matrix test = new Spiral_Matrix();
        int[][] matrix = {{1}, {2}
        };
        System.out.println(test.spiralOrder(matrix).toString());
    }
}
