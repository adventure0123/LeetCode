/**
 * Created by adventure on 16/10/8.
 */
public class Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode left=root.left;
        if(left!=null&&left.left==null&&left.right==null){
            return left.val+sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

    }
}
