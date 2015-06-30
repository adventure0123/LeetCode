package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/30.
 */
public class Bitwise_AND_of_Numbers_Range {
    public int rangeBitwiseAnd(int m, int n) {
        int result=0;
        while(m!=n){
            m=m>>1;
            n=n>>1;
            result++;
        }
        return m<<result;
    }
}
