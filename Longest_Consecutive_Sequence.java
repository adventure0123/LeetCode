package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], true);
        }
        int max = 1;
        int temp = 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < length; i++) {
            left = nums[i] - 1;
            right = nums[i] + 1;
            while (map.get(left) != null && map.get(left)) {
                map.put(left, false);
                left--;
                temp++;
            }
            while (map.get(right) != null && map.get(right)) {
                map.put(right, false);
                right++;
                temp++;

            }
            if (temp > max) {
                max = temp;
            }
            temp = 1;
        }
        return max;
    }
}
