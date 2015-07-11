package com.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> resultList = new LinkedList<>();
		int length = nums.length;
		if (length == 0) {
			return resultList;
		}
		Arrays.sort(nums);
		int sum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < length - 3; i++) {
			if (i >= 1 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < length - 2; j++) {
				if (j != i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				start = j + 1;
				end = length - 1;
				sum = nums[i] + nums[j] + nums[start] + nums[end];
				while (start < end) {
					if (sum > target) {
						end--;
						while (end > j + 1 && nums[end] == nums[end + 1]) {
							end--;
						}
					} else if (sum < target) {
						start++;
						while (start < length - 1
								&& nums[start] == nums[start - 1]) {
							start++;
						}
					} else {
						List<Integer> list = new LinkedList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[start]);
						list.add(nums[end]);
						resultList.add(list);
						start++;
						while (start < length - 1
								&& nums[start] == nums[start - 1]) {
							start++;
						}
						end--;
						while (end > j + 1 && nums[end] == nums[end + 1]) {
							end--;
						}
					}
					sum = nums[i] + nums[j] + nums[start] + nums[end];
				}
			}
		}

		return resultList;

	}

	public static void main(String[] args) {
		FourSum test = new FourSum();
		int[] A = { 1, 0, -1, 0, -2, 2 };
		List<List<Integer>> resultList = test.fourSum(A, 0);
		for (List<Integer> temp : resultList) {
			System.out.println(temp.toString());
		}
	}
}
