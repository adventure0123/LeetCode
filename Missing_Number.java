

public class Missing_Number {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		int temp = 0;
		int addition = -1;
		for (int i = 0; i < length; i++) {
			if (nums[i] == i || nums[i] == addition) {
				continue;
			} else {
				if (nums[i] >= length) {
					nums[i] = addition;
					continue;
				}
				temp = nums[nums[i]];
				nums[nums[i]] = nums[i];
				nums[i] = temp;
				i--;
			}
		}
		for (int i = 0; i < length; i++) {
			if (nums[i] == addition) {
				return i;
			}
		}
		return length;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Missing_Number test = new Missing_Number();
		int[] A = { 0, 1, 3, 2 };
		System.out.println(test.missingNumber(A));
	}

}
