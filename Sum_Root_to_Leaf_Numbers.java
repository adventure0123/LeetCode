package com.LeetCode;


/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Sum_Root_to_Leaf_Numbers {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            addNumbers(root.left, root.val);
        }
        if (root.right != null) {
            addNumbers(root.right, root.val);
        }
        if (root.left == null && root.right == null) {
            sum = sum + root.val;
        }
        return sum;
    }

    public void addNumbers(TreeNode root, int val) {
        val = val * 10 + root.val;
        if (root.left != null) {
            addNumbers(root.left, val);
        }
        if (root.right != null) {
            addNumbers(root.right, val);
        }
        if (root.left == null && root.right == null) {
            sum = sum + val;
        }
    }

    public static void main(String[] args) {
        Sum_Root_to_Leaf_Numbers test = new Sum_Root_to_Leaf_Numbers();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        //root.right=new TreeNode(3);
        System.out.println(test.sumNumbers(root));
    }
}
