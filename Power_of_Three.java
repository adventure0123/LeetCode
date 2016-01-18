package com.LeetCode;

public class Power_of_Three {
	 public boolean isPowerOfThree(int n) {
		 double result=Math.log(n)/Math.log(3.0);
		 return  Math.abs(result-Math.rint(result))<=0.00000000000001;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
