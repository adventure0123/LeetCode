package com.LeetCode;

import java.util.Arrays;

public class Maximal_Square {
	public int maximalSquare(char[][] matrix) {
		int row = matrix.length;
		if (row == 0) {
			return 0;
		}
		int column = matrix[0].length;
		int max = 0;
		int[][] A = new int[row][column];
		for (int i = 0; i < column; i++) {
			A[0][i] = matrix[0][i] - '0';
			max = Math.max(max, A[0][i]);
		}
		for (int i = 0; i < row; i++) {
			A[i][0] = matrix[i][0] - '0';
			max = Math.max(max, A[i][0]);
		}
		int temp = 0;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				if (matrix[i][j] == '1') {
					temp = Math.min(Math.min(A[i - 1][j], A[i][j - 1]),
							A[i - 1][j - 1]) + 1;
					A[i][j] = temp;
					max = Math.max(max, temp * temp);
				}
			}
		}
		return max;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximal_Square test = new Maximal_Square();
		char[][] matirx = { { '1', '1', '1', '1' }, { '1', '1', '1', '1' },
				{ '1', '1', '1', '1' } };
		System.out.println(test.maximalSquare(matirx));
	}

}
