package com.LeetCode;

public class Patching_Array {
	public int minPatches(int[] nums, int n) {
		int patcheNum=0;
		long sum=0;
		int index=0;
		for(long i=1;i<=n;){
			if(index<nums.length&&nums[index]<=i){
				sum=sum+nums[index];
				i=sum+1;
				index++;
			}else{
				//System.out.println(i);
				patcheNum++;
				sum=sum+i;
				i=sum+1;
			}
			//System.out.println(sum);
			
		}
		return patcheNum;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patching_Array test=new Patching_Array();
		int[] nums={};
		int n=7;
		System.out.println(test.minPatches(nums, n));
	}

}
