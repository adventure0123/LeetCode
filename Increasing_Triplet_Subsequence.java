package com.LeetCode;

public class Increasing_Triplet_Subsequence {
	 public boolean increasingTriplet(int[] nums) {
		 int length=nums.length;
		 if(length<3){
			 return false;
		 }
		 int first=nums[0];
		 int second=Integer.MAX_VALUE;
		 int min=first;
		 for(int i=1;i<length;i++){
			 if(nums[i]>second){
				 return true;
			 }else if(nums[i]<second){
				 if(nums[i]>min&&min<first){
					 first=min;
					 second=nums[i];
					 //System.out.println(min);
				 }
				 if(nums[i]>first){
					 second=nums[i];
					 //System.out.println(second);
					
				 }else if(nums[i]<first){
					 min=nums[i];
					 //System.out.println(min);
				 }
			 }
			 //System.out.println(min);
			 
		 }
		return false;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increasing_Triplet_Subsequence test=new Increasing_Triplet_Subsequence();
		int[] nums={5,4,3};
		System.out.println(test.increasingTriplet(nums));
	}

}
