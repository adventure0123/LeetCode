package com.LeetCode;

public class Maximum_Product_Subarray {
	public int maxProduct(int[] nums) {
		int length = nums.length;
		int result = Integer.MIN_VALUE;
		int max = 1;
		int min = 1;
		int a, b;
		for (int i = 0; i < length; i++) {
			a = max * nums[i];
			b = min * nums[i];
			max = Math.max(a, Math.max(nums[i], b));
			min = Math.min(a, Math.min(nums[i], b));
			result = Math.max(result, max);
		}
		return result;

	}

	public static void main(String[] args) {
		Maximum_Product_Subarray test = new Maximum_Product_Subarray();
		int[] A = { 2, -5, -2, -4, 3 };
		System.out.println(test.maxProduct(A));
	}
}
