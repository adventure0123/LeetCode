package com.LeetCode;

public class Find_the_Duplicate_Number {
	 public int findDuplicate(int[] nums) {
		 int slow=0;
		 int fast=0;
		 while(true){
			 slow=nums[slow];
			 fast=nums[nums[fast]];
			 if(slow==fast){
				 break;
			 }
		 }
		 int index=0;
		 while(true){
			 index=nums[index];
			 slow=nums[slow];
			 if(index==slow){
				 break;
			 }
		 }
		return index;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_the_Duplicate_Number test=new Find_the_Duplicate_Number();
		int[] A={1,3,3,2,4};
		System.out.println(test.findDuplicate(A));
	}

}
