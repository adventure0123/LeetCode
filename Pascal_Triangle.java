package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> pre = new ArrayList<>();
		if (numRows == 0) {
			return result;
		}
		for (int i = 1; i <= numRows; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					temp.add(1);
				} else {
					temp.add(pre.get(j - 1) + pre.get(j - 2));
				}
			}
			pre = temp;
			result.add(temp);
		}
		return result;

	}

	public static void main(String[] args) {
		Pascal_Triangle test = new Pascal_Triangle();
		List<List<Integer>> result = test.generate(5);
		for (List<Integer> temp : result) {
			System.out.println(temp);
		}

	}
}
