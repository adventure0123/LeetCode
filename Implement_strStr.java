package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/5/20.
 */
public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int length1 = haystack.length();
        int length2 = needle.length();
        for (int i = 0; i <= length1 - length2; i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i + length2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Implement_strStr test = new Implement_strStr();
        System.out.println(test.strStr(null, "bc"));
    }
}
