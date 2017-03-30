/**
 * Created by adventure on 2017/3/30.
 */
public class Convert_BST_to_Greater_Tree {

    public TreeNode convertBST(TreeNode root) {
        adjustTree(root,0);
        return root;
    }

    private void adjustTree(TreeNode root,int lastSum){
        if(root==null){
            return ;
        }
        int sum=lastSum;
        if(root.right!=null){
            sum+=sum(root.right);
        }
        adjustTree(root.right,lastSum);
        root.val+=sum;
        sum=root.val;
        adjustTree(root.left,sum);
    }

    private int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
}
