package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/30.
 */
public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        int result=0;
        for(int i=31;i>=0;i--){
            result=((n>>i)&0x1)==1?result+1:result;
        }
        return result;
    }
}
