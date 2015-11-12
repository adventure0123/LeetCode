package com.LeetCode;

import java.util.Arrays;

public class NumArray {
	int[ ] B;
	public NumArray(int[] nums) {
		int length=nums.length;
		B=new int[length+1];
		for(int k=1;k<=length;k++){
			B[k]=B[k-1]+nums[k-1];
		}
	   
    }

    public int sumRange(int i, int j) {
    
    	return B[j+1]-B[i];
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-2, 0, 3, -5, 2, -1};
		NumArray test=new NumArray(A);
		System.out.println(test.sumRange(2, 5));
	}

}
