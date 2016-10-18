

public class Binary_Tree_Maximum_Path_Sum {
	private int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		pathSum(root);
		return max;

	}

	private int pathSum(TreeNode rootNode) {
		if (rootNode == null) {
			return 0;
		}
		int left = pathSum(rootNode.left);
		int right = pathSum(rootNode.right);
		int val = Math.max(Math.max(left + rootNode.val, rootNode.val),
				Math.max(right + rootNode.val, right + left + rootNode.val));
		if (val > max) {
			max = val;
		}
		return Math.max(rootNode.val,
				Math.max(rootNode.val + left, rootNode.val + right));

	}

}
