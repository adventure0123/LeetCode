package com.LeetCode;
/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        int length=s.length();
        if(length==0){
            return 0;
        }
        int start=length-1;
        while(start>=0&&s.charAt(start)==32){
            start--;
        }
        int result=0;
        while(start>=0&&s.charAt(start)!=32){
            result++;
            start--;
        }
        return result;
    }
}
