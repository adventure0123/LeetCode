package com.LeetCode;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {
	 public int maxProfit(int[] prices) {
		 int  length=prices.length;

		 if(length<=1){
			 return 0;
		 }
		 if(length==2){
			 return Math.max(0, prices[1]-prices[0]);
		 }
		int[] buy=new int[length];
		int [] sell=new int[length];
		buy[0]=-prices[0];
		buy[1]=Math.max(-prices[0], -prices[1]);
		sell[0]=0;
		sell[1]=Math.max(0,prices[1]-prices[0]);		
		 for(int i=2;i<length;i++){
			buy[i]=Math.max(buy[i-1], sell[i-2]-prices[i]);
		    sell[i]=Math.max(0, Math.max(sell[i-1], buy[i-1]+prices[i]));
		 }
	
		return sell[length-1];
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best_Time_to_Buy_and_Sell_Stock_with_Cooldown test=new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown();
		int[] A={1,2,4};
		System.out.println(test.maxProfit(A));
	}

}
