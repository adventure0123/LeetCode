package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;

public class Path_Sum_II {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result=new ArrayList<>();
		if(root==null){
			return result;
		}
		path(result, new ArrayList<Integer>(), sum,root);
		return result;
        
    }
	public void path(List<List<Integer>> result,List<Integer> temp,int sum,TreeNode root){
		if(root==null){
			return;
		}
		sum=sum-root.val;
		List<Integer> list=new ArrayList<>(temp);
		list.add(root.val);
		if(root.left==null&&root.right==null&&sum==0){
			result.add(list);
		}
		path(result, list, sum, root.left);
		temp.add(root.val);
		path(result, temp, sum, root.right);
	}

}
