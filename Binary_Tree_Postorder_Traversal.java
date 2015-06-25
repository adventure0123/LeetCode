package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yuanjianwei on 2015/6/25.
 */
public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(0,node.val);
            if(node.left!=null){
                stack.add(node.left);
            }
            if(node.right!=null){
                stack.add(node.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Binary_Tree_Postorder_Traversal test=new Binary_Tree_Postorder_Traversal();
        TreeNode root=new TreeNode(2);
        TreeNode left=new TreeNode(3);
        root.left=left;
        root.right=new TreeNode(1);
        System.out.println(test.postorderTraversal(root).toString());
    }
}
