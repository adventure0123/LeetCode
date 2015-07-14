package com.LeetCode;

import java.net.Inet4Address;
import java.util.Arrays;

public class Spiral_Matrix_II {
	public int[][] generateMatrix(int n) {
		int[][] A = new int[n][n];
		int x_start = 0;
		int x_end = n - 1;
		int y_start = 0;
		int y_end = n - 1;
		int i = 0;
		int temp = 1;
		while (true) {
			for (i = y_start; i <= y_end; i++) {
				A[x_start][i] = temp;
				temp++;
			}
			x_start++;
			if (x_start > x_end) {
				break;
			}
			for (i = x_start; i <= x_end; i++) {
				A[i][y_end] = temp;
				temp++;
			}
			y_end--;
			if (y_end < y_start) {
				break;
			}
			for (i = y_end; i >= y_start; i--) {
				A[x_end][i] = temp;
				temp++;
			}
			x_end--;
			if (x_end < x_start) {
				break;
			}
			for (i = x_end; i >= x_start; i--) {
				A[i][y_start] = temp;
				temp++;
			}
			y_start++;
			if (y_start > y_end) {
				break;
			}
		}
		return A;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiral_Matrix_II test = new Spiral_Matrix_II();
		test.generateMatrix(4);
	}

}
