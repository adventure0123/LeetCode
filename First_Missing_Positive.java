package com.LeetCode;

import java.util.Arrays;

//array remove the num to right position
public class First_Missing_Positive {
	public int firstMissingPositive(int[] nums) {
		int length = nums.length;
		int i = 0;
		while (i < length) {
			if (nums[i] == i + 1 || nums[i] < 1 || nums[i] > length
					|| nums[i] == nums[nums[i] - 1]) {
				i++;
			} else {
				int temp = nums[i];
				nums[i] = nums[nums[i] - 1];
				nums[temp - 1] = temp;
			}
		}
		System.out.println(Arrays.toString(nums));
		for (i = 0; i < length; i++) {
			if (nums[i] != i + 1) {
				break;
			}
		}
		return i + 1;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_Missing_Positive test = new First_Missing_Positive();
		int[] nums = { 3, 4, -1, 1 };
		System.err.println(test.firstMissingPositive(nums));
	}

}
