package com.LeetCode;


public class Range_Sum_Query {
	  int [] nums;
	  int[] sum;
	 public Range_Sum_Query(int[] nums) {
	        int length=nums.length;
	        sum=new int[length+1];
	        this.nums=new int[length];
	        for (int i = 0; i <length; i++) {
				update(i, nums[i]);
			}
	 }

	    void update(int i, int val) {
	        int diff=-nums[i]+val;
	        nums[i]=val;
	        int length=nums.length;
	        i++;
	        //System.out.println(Arrays.toString(sum));
	        while(i<=length){
	        	sum[i]+=diff;
	        	i+=i&(-i);
	        }
	        //System.out.println(Arrays.toString(sum));
	    }

	    public int sumRange(int i, int j) {
	    	int sumi=0;
	    	int sumj=0;
	    	j++;
	    	while(i>0){
	    		sumi+=sum[i];
	    		i-=i&(-i);
	    		sumj+=sum[j];
	    		j-=j&(-j);
	    	}
	    	while(j>0){
	    		sumj+=sum[j];
	    		j-=j&(-j);
	    	}
			return sumj-sumi;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={1, 3, 5};
		Range_Sum_Query test=new Range_Sum_Query(nums);
		System.out.println(test.sumRange(0, 2));
		test.update(1, 2);
		System.out.println(test.sumRange(0, 2));
	}

}
