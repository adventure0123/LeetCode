package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		int length = nums.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (length == 0) {
			return result;
		}
		List<Integer> temp = new ArrayList<>();
		result.add(temp);
		Arrays.sort(nums);
		addSubset(result, temp, 0, nums);
		return result;

	}

	private void addSubset(List<List<Integer>> result, List<Integer> temp,
			int index, int[] nums) {
		int length = nums.length;
		if (index >= length) {
			return;
		}
		for (int i = index; i < length; i++) {
			if (i == index || (i - 1 >= 0 && nums[i] != nums[i - 1])) {
				List<Integer> list = new ArrayList<Integer>(temp);
				list.add(nums[i]);
				result.add(list);
				addSubset(result, list, i + 1, nums);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets_II testIi = new Subsets_II();
		int[] A = { 2, 2, 2 };
		List<List<Integer>> resList = testIi.subsetsWithDup(A);
		for (List<Integer> temp : resList) {
			System.out.println(temp.toString());
		}
	}

}
