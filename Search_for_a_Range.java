

import java.util.Arrays;

public class Search_for_a_Range {
	public int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };
		int length = nums.length;
		if (length == 0) {
			return result;
		}
		int start = 0;
		int end = length - 1;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) >> 1;
			if (nums[mid] == target) {
				break;
			}
			if (nums[mid] < target) {
				start = mid + 1;
			}
			if (nums[mid] > target) {
				end = mid - 1;
			}
		}
		if (nums[mid] == target) {
			start = mid - 1;
			while (start >= 0 && nums[start] == target) {
				start--;
			}
			end = mid + 1;
			while (end < length && nums[end] == target) {
				end++;
			}
			result[0] = start + 1;
			result[1] = end - 1;
		}
		return result;

	}

	public static void main(String[] args) {
		Search_for_a_Range test = new Search_for_a_Range();
		int[] A = { 2, 2 };
		System.out.println(Arrays.toString(test.searchRange(A, 2)));
	}
}
