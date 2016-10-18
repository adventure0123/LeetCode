

/**
 * Created by yuanjianwei on 2015/6/30.
 */
public class House_Robber {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] A = new int[length + 1];
        A[0] = 0;
        A[1] = nums[0];
        for (int i = 2; i <= length; i++) {
            if (A[i - 1] > nums[i - 1] + A[i - 2]) {
                A[i] = A[i - 1];
            } else {
                A[i] = nums[i - 1] + A[i - 2];
            }
        }
        return A[length];
    }
}
