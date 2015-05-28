package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/5/28.
 */
public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 1, right = x, result = 1, mid;
        while (left < right) {
            mid = (left + right) >> 1;
            if (mid > x / mid) {
                right = mid;
            } else {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }
}
