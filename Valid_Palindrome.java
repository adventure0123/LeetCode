package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        int length=s.length();
        if(length==0){
            return true;
        }
        int i=0;
        int j=length-1;
        s=s.toLowerCase();
        System.out.println(s);
        while(i<j){
            if(!isValid(s.charAt(i))){
                i++;
            }else if(!isValid(s.charAt(j))){
                j--;
            }else{
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    private boolean isValid(char c){
        if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Valid_Palindrome test=new Valid_Palindrome();
        String s="1a2";
        System.out.println(test.isPalindrome(s));

    }
}
