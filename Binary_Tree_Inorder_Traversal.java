

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		addNode(result, root);
		return result;

	}

	private void addNode(List<Integer> result, TreeNode root) {
		if (root.left != null) {
			addNode(result, root.left);
		}
		result.add(root.val);
		if (root.right != null) {
			addNode(result, root.right);
		}
	}

	public static void main(String[] args) {

	}
}
