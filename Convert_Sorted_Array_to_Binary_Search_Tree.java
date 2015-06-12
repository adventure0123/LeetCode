package com.LeetCode;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
	public TreeNode sortedArrayToBST(int[] nums) {
		int length = nums.length;
		if (length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(nums[(length - 1) >> 1]);
		generateTree(root, 0, length - 1, nums);
		return root;
	}

	private void generateTree(TreeNode root, int start, int end, int[] nums) {
		if (start > end) {
			return;
		}
		int mid = (end + start) >> 1;
		int left = (mid + start - 1) >> 1;
		int right = (end + mid + 1) >> 1;
		if (left >= start && left < mid) {
			root.left = new TreeNode(nums[left]);
		}
		if (right <= end && right > mid) {
			root.right = new TreeNode(nums[right]);
		}
		if (root.left != null) {
			generateTree(root.left, start, mid - 1, nums);
		}
		if (root.right != null) {
			generateTree(root.right, mid + 1, end, nums);
		}
	}

	public static void main(String[] args) {
		Convert_Sorted_Array_to_Binary_Search_Tree test = new Convert_Sorted_Array_to_Binary_Search_Tree();
		int[] A = { 1, 3 };
		test.sortedArrayToBST(A);
	}
}
