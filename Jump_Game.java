

/**
 * Created by yuanjianwei on 2015/5/21.
 */
public class Jump_Game {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return true;
        }
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (index >= length - 1) {
                return true;
            } else {
                if (i + nums[i] > index) {
                    index = i + nums[i];
                } else {
                    if (index == i) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Jump_Game test = new Jump_Game();
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(test.canJump(nums));
    }
}
