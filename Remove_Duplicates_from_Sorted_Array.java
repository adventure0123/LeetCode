package com.LeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yuanjianwei on 2015/5/20.
 */
public class Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 1;
        int index = 1;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
