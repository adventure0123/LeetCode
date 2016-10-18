

public class Balanced_Binary_Tree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int left = balance(root.left);
		int right = balance(root.right);
		if (left == -1 || right == -1) {
			return false;
		}
		if (Math.abs(left - right) > 1) {
			return false;
		} else {
			return true;
		}

	}

	private int balance(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = balance(root.left);
		int right = balance(root.right);
		if (left == -1 || right == -1) {
			return -1;
		}
		if (Math.abs(left - right) > 1) {
			return -1;
		}
		return left > right ? left + 1 : right + 1;
	}
}
