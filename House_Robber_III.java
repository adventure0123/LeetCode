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
		return noNode(root.left)+noNode(root.right)+root.val;
	}
	
	public int noNode(TreeNode root){
		if(root==null){
			return 0;
		}
		return rob(root.left)+rob(root.right);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
