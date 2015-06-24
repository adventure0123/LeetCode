package com.LeetCode;


import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/6/24.
 */
public class Candy {
    public int candy(int[] ratings) {
        int length = ratings.length;
        if (length == 0) {
            return 0;
        }
        int[] right = new int[length];
        right[0] = 1;
        for (int i = 1; i < length; i++) {
            right[i] = ratings[i] > ratings[i - 1] ? right[i - 1] + 1 : 1;
        }
        int result = right[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && right[i]<=right[i+1]) {
                right[i] = right[i + 1]+1;
            }
            result += right[i];
        }
        System.out.println(Arrays.toString(right));
        return result;
    }

    public static void main(String[] args) {
        Candy test=new Candy();
        int[] A={1,2};
        System.out.println(test.candy(A));
    }
}
