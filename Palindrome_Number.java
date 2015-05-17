package com.LeetCode;

public class Palindrome_Number {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int result = 0;
		int temp = x;
		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return result == temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_Number testNumber = new Palindrome_Number();
		System.err.println(testNumber.isPalindrome(45654));
	}

}
