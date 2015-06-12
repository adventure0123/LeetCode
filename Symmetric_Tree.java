package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/12.
 */
public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetric(root.left, root.right);
    }

    private boolean symmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return symmetric(p.left, q.right) && symmetric(p.right, q.left);
    }
}
