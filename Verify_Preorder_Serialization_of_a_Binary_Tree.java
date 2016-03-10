package com.LeetCode;

import java.util.Stack;

public class Verify_Preorder_Serialization_of_a_Binary_Tree {
	public boolean isValidSerialization(String preorder) {
		if(preorder.length()==0){
			return false;
		}
		String[] strs=preorder.split(",");
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<strs.length;i++){
			String str=strs[i];
			while(str.equals("#")&&stack.size()>1&&stack.peek().equals("#")){
				stack.pop();
				stack.pop();
			}
			if(stack.size()==1&&stack.peek().equals("#")){
				return false;
			}
			//System.out.println(str);
			stack.push(str);
		}
		if(stack.size()==1&&stack.peek().equals("#")){
			return true;
		}
		return false;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verify_Preorder_Serialization_of_a_Binary_Tree tesTree=new Verify_Preorder_Serialization_of_a_Binary_Tree();
		String string="#";
		System.out.println(tesTree.isValidSerialization(string));
	}

}
