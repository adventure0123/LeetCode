package com.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		List<TreeNode> stack1=new LinkedList<>();
		List<TreeNode> stack2=new LinkedList<>();
		if(p==null||q==null){
			return null;
		}
		TreeNode node=root;
		while(node.val!=p.val){
			stack1.add(node);
			if(node.val<p.val){
				node=node.right;
			}else{
				node=node.left;
			}
		}
		stack1.add(node);
		node=root;
		while(node.val!=q.val){
			stack2.add(node);
			if(node.val<q.val){
				node=node.right;
			}else{
				node=node.left;
			}
		}
		stack2.add(node);
		TreeNode resultNode=stack1.get(0);
		int i=1;
		int length1=stack1.size();
		int length2=stack2.size();
		while(i<length1&&i<length2&&stack1.get(i)==stack2.get(i)){
			resultNode=stack1.get(i);
			i++;
		}
		return resultNode;
        
    }
}
