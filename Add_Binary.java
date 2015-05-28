package com.LeetCode;


import java.awt.image.Kernel;

/**
 * Created by yuanjianwei on 2015/5/28.
 */
public class Add_Binary {
    public String addBinary(String a, String b) {
        StringBuffer x = new StringBuffer(a);
        StringBuffer y = new StringBuffer(b);
        StringBuffer result = new StringBuffer();
        int length1 = a.length();
        int length2 = b.length();
        if (length1 == 0) {
            return b;
        }
        if (length2 == 0) {
            return a;
        }
        int carry_bit = 0;
        int temp = 0;
        int i, j;
        for (i = length1 - 1, j = length2 - 1; i >= 0 && j >= 0; i--, j--) {
            temp = a.charAt(i) - '0' + carry_bit + b.charAt(j) - '0';
            carry_bit = temp / 2;
            result.insert(0, temp % 2);
        }
        while (i >= 0) {
            temp = a.charAt(i) - '0' + carry_bit;
            carry_bit = temp / 2;
            result.insert(0, temp % 2);
            i--;
        }
        while (j >= 0) {
            temp = carry_bit + b.charAt(j) - '0';
            carry_bit = temp / 2;
            result.insert(0, temp % 2);
            j--;
        }
        if (carry_bit != 0) {
            result.insert(0, carry_bit);
        }
        return result.toString();
    }
}
