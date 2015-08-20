package com.LeetCode;

public class Ugly_Number {
	public boolean isUgly(int num) {
		if(num==0){
			return false;
		}
		if(num==1){
			return true;
		}
		while(num%2==0){
			num=num/2;
		}
		while(num%3==0){
			num=num/3;
		}
		while(num%5==0){
			num=num/5;
		}
		return num==1?true:false;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugly_Number test=new Ugly_Number();
		System.out.println(test.isUgly(-2147483648));
	}

}
