package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Word_Pattern {
	public boolean wordPattern(String pattern, String str) {
		String[] temp=str.split(" ");
		int length=temp.length;
		if(pattern.length()!=length){
			return false;
		}
		Map<String, Character> map=new HashMap<String, Character>();
		Set<Character> set=new HashSet<>();
		StringBuffer bf=new StringBuffer();		
		for(int i=0;i<length;i++){
			if(!map.containsKey(temp[i])){
				if(set.contains(pattern.charAt(i))){
					return false;
				}
				map.put(temp[i], pattern.charAt(i));
				set.add(pattern.charAt(i));
				bf.append(pattern.charAt(i));
			}else{
				bf.append(map.get(temp[i]));
			}
		}
		//System.out.println(bf.toString());
		return pattern.equals(bf.toString());
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word_Pattern test=new Word_Pattern();
		String pattern="abba";
		String str="dog cat cat fish";
		System.out.println(test.wordPattern(pattern, str));
	}

}
