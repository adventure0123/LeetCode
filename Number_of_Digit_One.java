package com.LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/7/8.
 */
public class Number_of_Digit_One {
    public int countDigitOne(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10)
            ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
        return ones;
    }

    public static void main(String[] args) {
        Number_of_Digit_One test=new Number_of_Digit_One();
        System.out.println(test.countDigitOne(11));
    }

}
