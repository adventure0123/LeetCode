package com.LeetCode;

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/22.
 */
public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int index = 0;
        for (int i = length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        boolean find = false;
        for (int i = length - 1; i >= index + 1; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                find = true;
                break;
            }
        }
        int start = find ? index + 1 : 0;
        int end = length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Next_Permutation test = new Next_Permutation();
        int[] nums = {1, 5, 1};
        test.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
