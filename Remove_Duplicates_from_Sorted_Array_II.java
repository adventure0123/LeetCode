


/**
 * Created by yuanjianwei on 2015/6/1.
 */
public class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int same = 1;
        int start = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (same < 2) {
                    start++;
                    same++;
                    nums[start] = nums[i];
                }
            } else {
                same = 1;
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;
    }
}
