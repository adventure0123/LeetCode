package com.LeetCode;

import java.util.Arrays;

public class Super_Ugly_Number {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int length=primes.length;
		if(n==1||length==0){
			return 1;
		}
		int[] index=new int[length];
		int[] result=new int[n];
		result[0]=1;
		int temp;
		for(int i=1;i<n;i++){
			temp=Integer.MAX_VALUE;
			for(int j=0;j<length;j++){
				temp=Math.min(temp, primes[j]*result[index[j]]);
			}
			
			for(int j=0;j<length;j++){
				if(primes[j]*result[index[j]]==temp){
					index[j]=index[j]+1;
					//break;
				}
			}
			result[i]=temp;
		}
		//System.out.println(Arrays.toString(result));
		return result[n-1];
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Ugly_Number testNumber=new Super_Ugly_Number();
		int [] primes={2, 7, 13, 19};
		System.out.println(testNumber.nthSuperUglyNumber(12, primes));
	}

}
