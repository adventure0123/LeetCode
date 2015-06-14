package com.LeetCode;

public class Populating_Next_Right_Pointers_in_Each_Node {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		bulid(root, null);
	}

	private void bulid(TreeLinkNode root, TreeLinkNode brother) {
		if (root.left != null) {
			root.left.next = root.right;
			if (brother == null) {
				root.right.next = null;
			} else {
				root.right.next = brother.left;
			}
			bulid(root.left, root.right);
			if (brother != null) {
				bulid(root.right, brother.left);
			} else {
				bulid(root.right, null);
			}
		}

	}
}
