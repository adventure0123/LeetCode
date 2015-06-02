package com.LeetCode;

import java.util.Arrays;

public class Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m + n - 1;
		m--;
		n--;
		for (; i >= 0; i--) {
			if (m == -1) {
				break;
			}
			if (n == -1) {
				return;
			}
			if (nums2[n] > nums1[m]) {
				nums1[i] = nums2[n];
				n--;
			} else {
				nums1[i] = nums1[m];
				m--;
			}
		}
		// System.out.println(n);
		for (; i >= 0; i--) {
			nums1[i] = nums2[n];
			n--;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge_Sorted_Array test = new Merge_Sorted_Array();
		int[] num1 = { 0, 1, 0, 0 };
		int[] num2 = { 1, 2 };
		test.merge(num1, 2, num2, 2);
		System.out.println(Arrays.toString(num1));
	}

}
