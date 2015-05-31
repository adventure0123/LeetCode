package com.LeetCode;

import java.util.Arrays;

public class Sort_Colors {
	public void sortColors(int[] nums) {
		int length = nums.length;
		if (length == 0 || length == 1) {
			return;
		}
		int start = 0;
		int end = length - 1;
		int index = 0;
		int temp;
		while (start < end) {
			while (start < length && nums[start] == 0) {
				start++;
			}
			while (end >= 0 && nums[end] == 2) {
				end--;
			}
			if (index < start) {
				index = start;
			}
			while (index <= end && nums[index] == 1) {
				index++;
			}
			if (index > end) {
				return;
			}
			if (nums[index] == 0) {
				temp = nums[index];
				nums[index] = nums[start];
				nums[start] = temp;
			} else {
				temp = nums[index];
				nums[index] = nums[end];
				nums[end] = temp;
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_Colors test = new Sort_Colors();
		int[] A = { 1, 2 };
		test.sortColors(A);
		System.out.println(Arrays.toString(A));
	}

}
