package com.LeetCode;

import java.util.Arrays;

public class Palindrome_Partitioning_II {
	public int minCut(String s) {
		int length = s.length();
		if (length == 0) {
			return 0;
		}
		boolean[][] A = new boolean[length + 1][length + 1];
		// A[x][y] means x to y is Palindrome
		int[] cut = new int[length + 1];
		A[0][0] = true;
		for (int j = 1; j < length + 1; j++) {
			for (int i = j; i >= 1; i--) {
				if (i == j) {
					A[i][j] = true;
				} else if (s.charAt(i - 1) == s.charAt(j - 1)
						&& (A[i + 1][j - 1] || j - i <= 2)) {
					A[i][j] = true;
				}
			}

		}

		cut[0] = -1;
		int temp = Integer.MAX_VALUE;
		for (int j = 1; j < length + 1; j++) {
			temp = Integer.MAX_VALUE;
			for (int i = 1; i <= j; i++) {
				if (A[i][j]) {
					if (cut[i - 1] + 1 < temp) {
						temp = cut[i - 1] + 1;
					}
				}
			}
			cut[j] = temp;
		}
		return cut[length];
	}

	public static void main(String[] args) {
		Palindrome_Partitioning_II test = new Palindrome_Partitioning_II();
		String s = "aabaa";
		System.out.println(test.minCut(s));
	}
}
