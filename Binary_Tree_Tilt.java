/**
 * Created by adventure on 2017/4/27.
 */
public class Binary_Tree_Tilt {
    int result=0;
    public int findTilt(TreeNode root) {
        getTilt(root);
        return result;
    }

    private int getTilt(TreeNode root){
        int sum=0;
        if(root==null){
            return sum;
        }
        int left=getTilt(root.left);
        int right=getTilt(root.right);
        result+=Math.abs(left-right);
        return left+right+root.val;
    }
}
