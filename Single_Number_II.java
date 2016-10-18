

import java.util.Arrays;

public class Single_Number_II {
	public int singleNumber(int[] nums) {
		int length = nums.length;
		int[] A = new int[32];
		int temp;
		for (int i = 0; i < length; i++) {
			temp = nums[i];
			for (int j = 31; j >= 0; j--) {
				A[j] += (temp >> j) & 1;
			}
		}
		int result = 0;
		for (int i = 31; i >= 0; i--) {
			result = (result << 1) + A[i] % 3;
		}
		return result;

	}

	public static void main(String[] args) {
		Single_Number_II test = new Single_Number_II();
		int[] A = { 2, 1, 1, 1 };
		System.out.println(test.singleNumber(A));
	}
}
