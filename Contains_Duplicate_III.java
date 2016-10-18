

import java.util.TreeSet;

public class Contains_Duplicate_III {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		int length = nums.length;
		if (length == 0 || k <= 0) {
			return false;
		}
		TreeSet<Integer> treeSet = new TreeSet<>();
		Integer up, down;
		for (int i = 0; i < length; i++) {
			up = treeSet.floor(nums[i] + t);
			down = treeSet.ceiling(nums[i] - t);
			if ((up != null && up >= nums[i])
					|| (down != null || down <= nums[i])) {
				return true;
			}
			treeSet.add(nums[i]);
			if (i >= k) {
				treeSet.remove(nums[i - k]);
			}
		}
		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
