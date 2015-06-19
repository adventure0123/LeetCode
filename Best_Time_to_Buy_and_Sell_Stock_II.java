package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        for(int i=length-1;i>=1;i--){
            prices[i]=prices[i]-prices[i-1];
        }
        int result=0;
        for(int i=1;i<length;i++){
            result=prices[i]>0?result+prices[i]:result;
        }
        return result;
    }
}
