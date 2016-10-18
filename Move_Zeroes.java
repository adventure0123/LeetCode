

import java.util.Arrays;

public class Move_Zeroes {
	 public void moveZeroes(int[] nums) {
	     int length=nums.length;
	     if(length<=1){
	    	 return;
	     }
	     int index=0;
	     while(index<length&&nums[index]!=0){
	    	 index++;
	     }
	     if(index==length){
	    	 return;
	     }
	     for(int i=index+1;i<length;i++){
	    	 if(nums[i]!=0){
	    	 nums[index]=nums[i];
	    	 index++;
	    	 }
	     }
	     for(;index<length;index++){
	    	 nums[index]=0;
	     }
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move_Zeroes test=new Move_Zeroes();
		int[] A={2,1};
		test.moveZeroes(A);
		System.out.println(Arrays.toString(A));
	}

}
