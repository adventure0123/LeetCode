package com.LeetCode;

import java.util.Arrays;

public class Distinct_Subsequences {
	public int numDistinct(String s, String t) {
		int length1 = s.length();
		int length2 = t.length();
		if (length2 == 0) {
			return length1;
		}
		if (length1 == 0) {
			return 0;
		}
		int[][] A = new int[length2 + 1][length1 + 1];
		for (int i = 0; i < length2 + 1; i++) {
			A[i][0] = 0;
		}
		for (int i = 0; i < length1 + 1; i++) {
			A[0][i] = 1;
		}
		for (int i = 1; i < length2 + 1; i++) {
			for (int j = i; j < length1 + 1; j++) {
				if (s.charAt(j - 1) == t.charAt(i - 1)) {
					A[i][j] = A[i - 1][j - 1] + A[i][j - 1];
				} else {
					A[i][j] = A[i][j - 1];
				}
			}
		}
		return A[length2][length1];

	}

	public static void main(String[] args) {
		Distinct_Subsequences test = new Distinct_Subsequences();
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(test.numDistinct(s, t));
	}
}
