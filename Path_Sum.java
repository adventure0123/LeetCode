package com.LeetCode;

public class Path_Sum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null){
			return false;
		}
		sum=sum-root.val;
		if(root.left==null&&root.right==null&&sum==0){
			return true;
		}
		return hasPathSum(root.left, sum)||hasPathSum(root.right, sum);

	}

}
