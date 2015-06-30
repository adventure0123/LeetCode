package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/30.
 */
public class Reverse_Bits {
    public int reverseBits(int n) {
        int[] A = new int[32];
        for (int i = 31; i >= 0; i--) {
            A[i] = (n >> i) & 0x1;
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + A[i];
        }
        return result;
    }
}
