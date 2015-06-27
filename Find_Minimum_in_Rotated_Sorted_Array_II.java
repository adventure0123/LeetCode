package com.LeetCode;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
	public int findMin(int[] nums) {
		int start=0;
		int end=nums.length-1;
		int mid;
		while(start<end){
			if(end-start==1){
				return nums[end]<nums[start]?nums[end]:nums[start];
			}
			mid=(start+end)/2;
			if(nums[start]<nums[end]){
				return nums[start];
			}
			while(mid<end&&nums[end]==nums[mid]){
				end--;
			}
			while(start<mid&&nums[start]==nums[mid]){
				start++;
			}
			//System.out.println(start+"  "+end);
			mid=(start+end)/2;
			if(nums[mid]<nums[end]){
				end=mid;
			}else {
				start=mid;
			}
		}
		return nums[start];
        
    }
	
	public static void main(String[] args) {
		Find_Minimum_in_Rotated_Sorted_Array_II test=new Find_Minimum_in_Rotated_Sorted_Array_II();
		int[] A={2,3,1,1,1};
		System.out.println(test.findMin(A));
	}
}
