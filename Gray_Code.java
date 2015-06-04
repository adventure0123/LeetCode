package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Gray_Code {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<>();
		if (n == 0) {
			result.add(0);
			return result;
		}
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				for (int j = 0; j <= temp; j++) {
					result.add(j);
				}
			} else {
				for (int j = temp - 1; j >= 0; j--) {
					result.add(result.get(j) + temp);
				}
			}
			temp = temp << 1;
		}
		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gray_Code testCode = new Gray_Code();
		System.out.println(testCode.grayCode(3).toString());
	}

}
