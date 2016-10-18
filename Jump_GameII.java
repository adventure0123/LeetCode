

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/21.
 */
public class Jump_GameII {
    public int jump(int[] nums) {
        int length = nums.length;
        int last_jump = 0;
        int current_jump = 0;
        int step = 0;
        for (int i = 0; i < length-1; i++) {
            current_jump = Math.max(current_jump, i + nums[i]);
            if (i == last_jump) {
                step++;
                last_jump = current_jump;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Jump_GameII test = new Jump_GameII();
        int[] nums = {1,2};
        System.out.println(test.jump(nums));
    }

}
