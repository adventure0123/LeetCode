package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result=new ArrayList<>();
		if(k==0||k>n||n==0){
			return result;
		}
		addCombine(result, new ArrayList<Integer>(), 1, n, k);
		return result;
        
    }
	
	private void addCombine(List<List<Integer>> result,List<Integer> temp,
			int index,int n,int k){
		if(k==1){
			for(int i=index;i<=n;i++){
				List<Integer> list=new ArrayList<>(temp);
				list.add(i);
				result.add(list);
			}
			return;
		}
		if(k>1){
			for(int i=index;i<=n-k+1;i++){
				List<Integer> list=new ArrayList<>(temp);
				list.add(i);
				addCombine(result, list, i+1, n, k-1);
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations testCombinations=new Combinations();
		List<List<Integer>> resultList=testCombinations.combine(4, 2);
		for(List<Integer> temp:resultList){
			System.out.println(temp.toString());
		}
	}

}
