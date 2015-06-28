package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
	public int majorityElement(int[] nums) {
		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int gap = length / 2;
		for (Integer key : map.keySet()) {
			if (map.get(key) > gap) {
				return key;
			}
		}
		return 0;

	}
}
