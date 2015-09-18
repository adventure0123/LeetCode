package com.LeetCode;

public class H_Index_II {
	public int hIndex(int[] citations) {
		int start=0;
		int end=citations.length-1;
		int length=citations.length;
		if(length==0||citations[end]<=0){
			return 0;
		}
		int mid;
		while(start<end){
			mid=(start+end)/2;
			if(citations[mid]>length-mid){
				end=mid;
			}else if(citations[mid]<length-mid){
				start=mid+1;
			}else{
				
				return length-mid;
			}
			
		}
		return length-start;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_Index_II test=new H_Index_II();
		int[] A={0};
		System.out.println(test.hIndex(A));
	}

}
