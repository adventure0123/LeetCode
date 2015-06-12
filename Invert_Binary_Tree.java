package com.LeetCode;



/**
 * Created by yuanjianwei on 2015/6/12.
 */
public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        invertNode(root);
        return root;
    }
    public void invertNode(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertNode(root.left);
        invertNode(root.right);
    }
    public static void main(String[] args) {

    }
}
