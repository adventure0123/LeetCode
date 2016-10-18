

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// hashmap O(n)
public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(nums[i], list);
			} else {
				List<Integer> value = map.get(nums[i]);
				value.add(i);
			}

		}
		for (int i = 0; i < nums.length; i++) {
			int key = target - nums[i];
			if (map.containsKey(key)) {
				List<Integer> value = map.get(key);
				if (nums[i] == key && value.size() == 1) {
					continue;
				}
				int index1;
				int index2;
				if (value.size() == 2) {
					index1 = value.get(0);
					index2 = value.get(1);
				} else {
					index1 = value.get(0);
					index2 = i;
				}
				result[0] = index1 < index2 ? index1 + 1 : index2 + 1;
				result[1] = index1 < index2 ? index2 + 1 : index1 + 1;
				return result;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Sum test = new Two_Sum();
		int[] nums = { 3, 2, 4 };
		System.err.println(Arrays.toString(test.twoSum(nums, 6)));
	}

}
