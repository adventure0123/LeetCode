package com.LeetCode;

public class Find_Peak_Element {
	public int findPeakElement(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		if (nums.length == 1) {
			return 0;
		}
		if (nums[0] > nums[1]) {
			return 0;
		}
		if (nums[nums.length - 1] > nums[nums.length - 2]) {
			return nums.length - 1;
		}
		int mid;
		while (start < end) {
			mid = (start + end) / 2;
			if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				return mid;
			} else if (nums[mid] > nums[mid - 1] && nums[mid + 1] > nums[mid]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		return start;

	}

	public static void main(String[] args) {
		Find_Peak_Element test = new Find_Peak_Element();
		int[] A = { 9, 2, 3, 8 };
		System.out.println(test.findPeakElement(A));
	}
}
