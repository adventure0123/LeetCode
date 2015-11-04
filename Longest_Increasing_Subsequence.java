package com.LeetCode;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
	public int lengthOfLIS(int[] nums) {
		int length=nums.length;
		int[] A=new int[length];
		if(length==0){
			return 0;
		}
		Arrays.fill(A, 1);
		//System.out.println(Arrays.toString(A));
		int max=1;
		int temp=1;
		for(int i=1;i<length;i++){
			temp=1;
			for(int j=0;j<i;j++){
				if(A[j]>=temp&&nums[i]>nums[j]){
					temp=A[j]+1;
				}
			}
			A[i]=temp;
			if(A[i]>max){
				max=A[i];
			}
		}
		System.out.println(Arrays.toString(A));
		return max;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Increasing_Subsequence test=new Longest_Increasing_Subsequence();
		int[] nums={1,3,6,7,9,4,10,5,6};
		System.out.println(test.lengthOfLIS(nums));
	}

}
