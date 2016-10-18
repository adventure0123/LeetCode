

/**
 * Created by yuanjianwei on 2015/6/12.
 */
public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Integer.MIN_VALUE - 1L, Integer.MAX_VALUE + 1L);
    }

    private boolean isBST(TreeNode root, long min, long max) {
        System.out.println(min);
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);

    }

    public static void main(String[] args) {
        Validate_Binary_Search_Tree test = new Validate_Binary_Search_Tree();
        TreeNode root = new TreeNode(Integer.MAX_VALUE);
        System.out.println(test.isValidBST(root));
    }
}
