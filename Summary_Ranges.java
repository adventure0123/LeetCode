package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();
		int length = nums.length;
		if (length == 0) {
			return result;
		}
		int start = nums[0];
		for (int i = 1; i < length; i++) {
			if (nums[i] == nums[i - 1] + 1) {
			} else {
				String str = new String();
				str = nums[i - 1] == start ? Integer.toString(start) : start
						+ "->" + nums[i - 1];
				result.add(str);
				start = nums[i];
			}
		}
		String str = new String();
		str = nums[length - 1] == start ? Integer.toString(start) : start
				+ "->" + nums[length - 1];
		result.add(str);
		return result;

	}

	public static void main(String[] args) {
		Summary_Ranges testRanges = new Summary_Ranges();
		int[] A = { 0, 1, 2, 4, 5, 6 };
		System.out.println(testRanges.summaryRanges(A));
	}

}
