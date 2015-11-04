package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bulls_and_Cows {
	public String getHint(String secret, String guess) {
		int correct=0;
		int wrong=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int length=secret.length();
		for(int i=0;i<length;i++){
			if(!map.containsKey(secret.charAt(i))){
				map.put(secret.charAt(i), 1);
			}else{
				map.put(secret.charAt(i), map.get(secret.charAt(i))+1);
			}
		}
		for(int i=0;i<length;i++){
			if(secret.charAt(i)==guess.charAt(i)){
				correct++;
				map.put(secret.charAt(i), map.get(secret.charAt(i))-1);
			}
		}
		for(int i=0;i<length;i++){	
		 if(secret.charAt(i)!=guess.charAt(i)&&map.containsKey(guess.charAt(i))){
				if(map.get(guess.charAt(i))>0){
					wrong++;
					map.put(guess.charAt(i), map.get(guess.charAt(i))-1);
				}
			}
		}
		return correct+"A"+wrong+"B";
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulls_and_Cows test=new Bulls_and_Cows();
		String string="1122";
		String pString="1222";
		System.out.println(test.getHint(string, pString));
	}

}
