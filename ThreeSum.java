


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < length - 2; i++) {
            int start = i + 1;
            int end = length - 1;
            if (i == 0 || nums[i] > nums[i - 1]) {
                while (start < end) {
                    if (nums[i] + nums[start] + nums[end] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        result.add(temp);
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (nums[i] + nums[start] + nums[end] > 0) {
                        end--;
                        if (nums[end] < 0) {
                            break;
                        }
                    } else {
                        start++;
                        if (nums[i] > 0) {
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum test = new ThreeSum();
        int[] nums = {-3, -4, -2, 0, 2, 2, -2, 1, -1, 2, 3, -1, -5, -4, -5, 1};
        List<List<Integer>> result = test.threeSum(nums);
        for (List<Integer> temp : result) {
            System.out.println(temp.toString());
        }
    }

}
