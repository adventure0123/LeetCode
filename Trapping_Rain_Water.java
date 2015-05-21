package com.LeetCode;

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/21.
 */
public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int length = height.length;
        if (length == 0) {
            return 0;
        }
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = height[0];
        for (int i = 1; i < length; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        right[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) {
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        int result = 0;
        int temp = 0;
        for (int i = 1; i <= length - 2; i++) {
            temp = left[i - 1] > right[i + 1] ? right[i + 1] : left[i - 1];
            if (temp - height[i] > 0) {
                result += temp - height[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water test = new Trapping_Rain_Water();
        int[] height = {2, 0, 2};
        System.out.println(test.trap(height));
    }
}
