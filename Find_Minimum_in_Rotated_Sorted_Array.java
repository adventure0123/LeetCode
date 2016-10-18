

public class Find_Minimum_in_Rotated_Sorted_Array {
	public int findMin(int[] nums) {
		int length = nums.length;
		int start = 0;
		int end = length - 1;
		int mid = (start + end) / 2;
		while (start < end) {
			if (end - start == 1) {
				return nums[start] > nums[end] ? nums[end] : nums[start];
			}
			mid = (start + end) / 2;
			if (nums[start] > nums[end]) {
				if (nums[mid] < nums[end]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				return nums[start];
			}
		}
		return nums[start];

	}

	public static void main(String[] args) {
		Find_Minimum_in_Rotated_Sorted_Array test = new Find_Minimum_in_Rotated_Sorted_Array();
		int[] A = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(test.findMin(A));
	}
}
