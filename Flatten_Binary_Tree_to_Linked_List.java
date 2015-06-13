package com.LeetCode;

public class Flatten_Binary_Tree_to_Linked_List {
	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		generateFlatten(root);
	}

	private TreeNode generateFlatten(TreeNode root) {
		if (root.left != null) {
			TreeNode end = generateFlatten(root.left);
			TreeNode right = root.right;
			if (root.left != null) {
				root.right = root.left;
				end.right = right;
				root.left = null;
			}
			if (right != null) {
				return generateFlatten(right);
			}
			return end;
		} else if (root.right != null) {
			return generateFlatten(root.right);
		}
		return root;
	}

	public static void main(String[] args) {
		Flatten_Binary_Tree_to_Linked_List test = new Flatten_Binary_Tree_to_Linked_List();
		TreeNode root = new TreeNode(1);
		TreeNode node = new TreeNode(2);
		root.left = node;
		node.right = new TreeNode(3);
		test.flatten(root);
		while (root != null) {
			System.out.println(root.val);
			root = root.right;
		}
	}
}
