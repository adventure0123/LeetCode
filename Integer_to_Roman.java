package com.LeetCode;


/**
 * Created by yuanjianwei on 2015/5/19.
 */
public class Integer_to_Roman {
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[num % 1000 / 100] + X[num % 1000 % 100 / 10] + I[num % 1000 % 100 % 10];
    }

    public static void main(String[] args) {
        Integer_to_Roman test = new Integer_to_Roman();
        System.out.println(test.intToRoman(999));
    }
}
