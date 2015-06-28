package com.LeetCode;

public class Excel_Sheet_Column_Title {
	public String convertToTitle(int n) {
		int val = n;
		StringBuffer bf = new StringBuffer();
		int temp;
		while (val!=0) {
			temp=(val-1)%26;
			val=(val-1)/26;	
			bf.append((char)(temp + 'A'));
		}
		bf.reverse();
		return bf.toString();

	}
	public static void main(String[] args) {
		Excel_Sheet_Column_Title test=new Excel_Sheet_Column_Title();
		System.out.println(test.convertToTitle(28));
	}
}
