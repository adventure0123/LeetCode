

import java.util.ArrayList;
import java.util.List;


public class Unique_Binary_Search_Trees_II {
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if (n == 0) {
			result.add(null);
			return result;
		}
		if (n == 1) {
			result.add(new TreeNode(1));
			return result;
		}
		return gengerate(1, n);

	}

	private List<TreeNode> gengerate(int start, int end) {
		List<TreeNode> result = new ArrayList<>();
		if (start > end) {
			return result;
		}
		if (end == start) {
			TreeNode node = new TreeNode(start);
			result.add(node);
			return result;
		}

		for (int i = start; i <= end; i++) {
			List<TreeNode> leftList = gengerate(start, i - 1);
			List<TreeNode> rightList = gengerate(i + 1, end);
			if (leftList.size() == 0) {
				int size = rightList.size();
				for (int j = 0; j < size; j++) {
					TreeNode node = new TreeNode(i);
					node.right = rightList.get(j);
					result.add(node);
				}
			}
			if (rightList.size() == 0) {
				int size = leftList.size();
				for (int j = 0; j < size; j++) {
					TreeNode node = new TreeNode(i);
					node.left = leftList.get(j);
					result.add(node);
				}
			}
			int leftsize = leftList.size();
			int rightsize = rightList.size();
			for (int k = 0; k < leftsize; k++) {
				for (int j = 0; j < rightsize; j++) {
					TreeNode node = new TreeNode(i);
					node.left = leftList.get(k);
					node.right = rightList.get(j);
					result.add(node);
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Unique_Binary_Search_Trees_II test = new Unique_Binary_Search_Trees_II();
		List<TreeNode> resultList = test.generateTrees(3);
		for (TreeNode temp : resultList) {
			System.out.println(temp.val);
		}
	}
}
