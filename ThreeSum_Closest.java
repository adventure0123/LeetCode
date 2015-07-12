package com.LeetCode;

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class ThreeSum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int diff = Integer.MAX_VALUE;
        int length = nums.length;
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        for (int i = 0; i < length - 2; i++) {
            int start = i + 1;
            int end = length - 1;
            // System.out.println(i+"  "+start+"  "+end);
            while (start < end) {
                int temp = nums[i] + nums[start] + nums[end];
                //System.out.println(i+"  "+start+"  "+end);
                if (temp == target) {
                    return target;
                } else {
                    if (Math.abs(temp - target) < diff) {
                        diff = Math.abs(temp - target);
                        result = temp;
                    }
                }
                if (temp > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum_Closest test = new ThreeSum_Closest();
        int[] nums = {-1, 2, 1, -4};
        System.out.println(test.threeSumClosest(nums, 1));
    }
}
