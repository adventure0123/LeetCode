package com.LeetCode;

import java.util.Arrays;

public class H_Index {
	public int hIndex(int[] citations) {
		int length=citations.length;
		if(length<=0){
			return 0;
		}
		Arrays.sort(citations);
		if(citations[length-1]==0){
			return 0;
		}
		int times=0;
		for(int i=length-1;i>=0;i--){
			times++;
			if(citations[i]<times){
				return times-1;
			}
		}
		return times;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_Index test=new H_Index();
		int[] A={3, 0, 6, 1, 5};
		System.out.println(test.hIndex(A));
	}

}
