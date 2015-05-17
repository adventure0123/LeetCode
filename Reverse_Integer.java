package com.LeetCode;

// pay attention to overflows
public class Reverse_Integer {

	public int reverse(int x) {
		long num = x;
		num = Math.abs(num);
		long result = 0;
		while (num != 0) {
			int value = (int) (num % 10);
			num = num / 10;
			result = result * 10 + value;
		}
		result = x < 0 ? result * -1 : result;
		if (result > Integer.MAX_VALUE) {
			return 0;
		} else if (result < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) result;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Integer testInteger = new Reverse_Integer();
		System.out.println(testInteger.reverse(-Integer.MAX_VALUE));
	}

}
