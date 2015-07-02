package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/7/2.
 */
public class Kth_Smallest_Element_in_a_BST {
    int order=0;
    int result=0;
    boolean find=false;
    public int kthSmallest(TreeNode root, int k) {
        visted(root,k);
        return  result;
    }

    private int visted(TreeNode root,int k){
        if(root.left!=null){
            visted(root.left,k);
        }
        order++;
        if(k==order){
            result= root.val;
            find=true;
        }
        if(find){
            return 0;
        }
        if(root.right!=null){
            visted(root.right,k);
        }
        return 0;
    }
}
