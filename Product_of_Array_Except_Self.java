package com.LeetCode;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
		int length=nums.length;
		if(length==0){
			return new int[0];
		}
		if(length==1){
			return nums;
		}
		int[] left=new int[length];
		int [] right=new int[length];
		for(int i=0;i<length;i++){
			if(i==0){
				left[i]=nums[i];
			}else{
				left[i]=left[i-1]*nums[i];
			}
		}
		
		for(int i=length-1;i>=0;i--){
			if(i==length-1){
				right[i]=nums[i];
			}else{
				right[i]=right[i+1]*nums[i];
			}
		}
		int[] result=new int[length];
		for(int i=0;i<length;i++){
			if(i==0){
				result[i]=right[i+1];
			}else if(i==length-1){
				result[i]=left[i-1];
			}else{
				result[i]=left[i-1]*right[i+1];
			}
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		return result;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product_of_Array_Except_Self test=new Product_of_Array_Except_Self();
		int[] A={1,2,2,3};
		System.out.println(Arrays.toString(test.productExceptSelf(A)));
	}	

}
