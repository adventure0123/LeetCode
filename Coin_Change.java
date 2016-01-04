package com.LeetCode;



public class Coin_Change {
	public int coinChange(int[] coins, int amount) {
		int length=coins.length;
		if(length==0){
			return -1;
		}
		int[] A=new int[amount+1];
		int temp=0;
		int time=0;
		for(int i=1;i<=amount;i++){
			A[i]=-1;
			time=Integer.MAX_VALUE;
			for(int j=0;j<length;j++){
				temp=i-coins[j];
				if(temp==0){
					A[i]=1;
					break;
				}
				if(temp>0&&A[temp]!=-1){
					time=Math.min(time, A[temp]+1);
					A[i]=time;
				}
			}			
		}	
		//System.out.println(Arrays.toString(A));
		return A[amount];
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin_Change testChange=new Coin_Change();
		int[] coins={2};
		System.out.println(testChange.coinChange(coins, 9));
	}

}
