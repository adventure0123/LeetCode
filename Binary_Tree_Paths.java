package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
	boolean isfirst=true;
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result=new ArrayList<>();
		if(root==null){
			return result;
		}
		build(result, root, new StringBuffer());
		return result;
        
    }
	
	public void  build(List<String> result,TreeNode root,StringBuffer s){
		StringBuffer bf=new StringBuffer(s);
		if(!isfirst){
			bf.append("->");
		}
		isfirst=false;
		bf.append(root.val);
		if(root.left!=null){
			build(result, root.left, bf);
		}
		if(root.right!=null){
			build(result, root.right, bf);
		}
		if(root.left==null&&root.right==null){
			result.add(bf.toString());
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree_Paths test=new Binary_Tree_Paths();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		System.out.println(test.binaryTreePaths(root));
	}

}
