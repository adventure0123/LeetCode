/**
 * Created by adventure on 2017/3/29.
 */
public class Diameter_of_Binary_Tree {

    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        lengthOfTree(root);
        return diameter;
    }

    private int lengthOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=0;
        int right=0;
        if(root.left!=null){
            left=lengthOfTree(root.left);
        }
        if(root.right!=null){
            right=lengthOfTree(root.right);
        }
        if(left+right+1>diameter){
            diameter=left+right+1;
        }
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Diameter_of_Binary_Tree test=new Diameter_of_Binary_Tree();
        TreeNode root=new TreeNode(1);
        TreeNode lefft=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.right=right;
        root.left=lefft;
        System.out.println(test.diameterOfBinaryTree(root));
    }
}


