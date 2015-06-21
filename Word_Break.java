package com.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Word_Break {
	public boolean wordBreak(String s, Set<String> wordDict) {
		int length = s.length();
		boolean[] A = new boolean[length + 1];
		A[0] = true;
		for (int i = 0; i < length; i++) {
			if (A[i]) {
				for (String str : wordDict) {
					int size = str.length();
					if (i + size <= length
							&& s.subSequence(i, i + size).equals(str)) {
						A[i + size] = true;
					}
				}
			}
		}
		return A[length];
	}

	public static void main(String[] args) {
		Word_Break test = new Word_Break();
		String s = "leetcode";
		Set<String> set = new HashSet<>();
		set.add("leet");
		set.add("codee");
		System.out.println(test.wordBreak(s, set));
	}
}
