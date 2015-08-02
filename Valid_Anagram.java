package com.LeetCode;

import java.util.Arrays;

public class Valid_Anagram {
	public boolean isAnagram(String s, String t) {
		int length1=s.length();
		int length2=t.length();
		if(length1!=length2){
			return false;
		}
		char[] s1=s.toCharArray();
		Arrays.sort(s1);
		char[] t1=t.toCharArray();
		Arrays.sort(t1);
		for(int i=0;i<length1;i++){
			if(s1[i]!=t1[i]){
				return false;
			}
		}
		return true;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
