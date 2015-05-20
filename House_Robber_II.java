package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/5/20.
 */
//dynamic programming
public class House_Robber_II {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] A = new int[length];
        A[0] = nums[0];
        A[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length - 1; i++) {
            A[i] = Math.max(A[i - 2] + nums[i], A[i - 1]);
        }
        int max = A[length - 2];
        A[1] = nums[1];
        A[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < length; i++) {
            A[i] = Math.max(A[i - 2] + nums[i], A[i - 1]);
        }

        return Math.max(max, A[length - 1]);
    }

    public static void main(String[] args) {
        House_Robber_II test = new House_Robber_II();
        int[] nums = {1, 3, 1, 3, 100};
        //9,2,3,4,5
        System.out.println(test.rob(nums));
    }
}
