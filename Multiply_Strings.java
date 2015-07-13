package com.LeetCode;

import java.util.Arrays;

public class Multiply_Strings {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int length1 = num1.length();
		int length2 = num2.length();
		int length = length1 + length2;
		char[] result = new char[length];
		for (int i = 0; i < length; i++) {
			result[i] = '0';
		}
		int carry_bit = 0;
		int temp = 0;
		for (int i = length1 - 1; i >= 0; i--) {
			for (int j = length2 - 1; j >= 0; j--) {
				temp = carry_bit + (num1.charAt(i) - '0')
						* (num2.charAt(j) - '0')
						+ (result[length - i - j - 2] - '0');
				carry_bit = temp / 10;
				result[length - i - j - 2] = (char) ((temp % 10) + '0');
			}
			if (carry_bit != 0) {
				result[length - i - 1] = (char) (carry_bit + '0');
				carry_bit = 0;
			}
		}
		if (carry_bit != 0) {
			result[length - 1] = (char) (carry_bit + '0');
		}
		StringBuffer bf = new StringBuffer();
		if (result[length - 1] != '0') {
			bf.append(result[length - 1]);
		}
		for (int i = length - 2; i >= 0; i--) {
			bf.append(result[i]);
		}
		return bf.toString();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply_Strings test = new Multiply_Strings();
		String num1 = "123";
		String num2 = "456";
		System.out.println(test.multiply(num1, num2));
	}

}
