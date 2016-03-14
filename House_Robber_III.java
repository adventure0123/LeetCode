package com.LeetCode;

public class House_Robber_III {
	public int rob(TreeNode root) {
		if(root==null){
			return 0;
		}
		return Math.max(includeNode(root), noNode(root));
        
    }
	
	public int includeNode(TreeNode root){
		if(root==null){
			return 0;
		}
		return 0;
	}
	
	public int noNode(TreeNode root){
		if(root==null){
			return 0;
		}
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
