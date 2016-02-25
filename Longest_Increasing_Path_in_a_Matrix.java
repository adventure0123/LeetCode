package com.LeetCode;

public class Longest_Increasing_Path_in_a_Matrix {
	public int longestIncreasingPath(int[][] matrix) {
		if (matrix == null) {
			return 0;
		}
		int row = matrix.length;
		if (row == 0) {
			return 0;
		}
		int colunm = matrix[0].length;
		int maxLength = 1;
		boolean[][] symbol = new boolean[row][colunm];
		int[][] pathLength=new int[row][colunm];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colunm; j++) {
				int length = 1;
				length = findPath(i, j, matrix, length, symbol,pathLength)+1;
				if (length > maxLength) {
					//System.out.println(i +"  "+j);
					maxLength = length;
				}
			}
		}
		return maxLength;
	}

	public int findPath(int i, int j, int[][] matrix, int length,
			boolean[][] symbol,int[][] pathLength) {
		int maxLength = 0;
		symbol[i][j] = true;
		if (i - 1 >= 0 && !symbol[i - 1][j] && matrix[i][j] < matrix[i - 1][j]) {
			int temp=pathLength[i-1][j];
			if(temp==0){
				temp = findPath(i - 1, j, matrix, length + 1, symbol,pathLength)+1;
				pathLength[i-1][j]=temp;
			}
			maxLength = maxLength < temp ? temp : maxLength;
		}
		if (i + 1 < matrix.length && !symbol[i + 1][j]
				&& matrix[i][j] < matrix[i + 1][j]) {
			int temp=pathLength[i+1][j];
			if(temp==0){
				temp = findPath(i + 1, j, matrix, length + 1, symbol,pathLength)+1;
				pathLength[i+1][j]=temp;
			}
			maxLength = maxLength < temp ? temp : maxLength;
		}

		if (j - 1 >= 0 && !symbol[i][j - 1] && matrix[i][j] < matrix[i][j - 1]) {
			int temp=pathLength[i][j-1];
			if(temp==0){
				temp = findPath(i , j-1, matrix, length + 1, symbol,pathLength)+1;
				pathLength[i][j-1]=temp;
			}
			maxLength = maxLength < temp ? temp : maxLength;
		}
		if (j + 1 < matrix[0].length && !symbol[i][j + 1]
				&& matrix[i][j] < matrix[i][j + 1]) {
			int temp=pathLength[i][j+1];
			if(temp==0){
				temp = findPath(i , j+1, matrix, length + 1, symbol,pathLength)+1;
				pathLength[i][j+1]=temp;
			}
			maxLength = maxLength < temp ? temp : maxLength;
		}
		symbol[i][j] = false;
		return maxLength;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Increasing_Path_in_a_Matrix test = new Longest_Increasing_Path_in_a_Matrix();
		int[][] matrix = { {9,9,4},
				  {6,6,8},
				  {2,1,1}};
		System.out.println(test.longestIncreasingPath(matrix));

	}

}
