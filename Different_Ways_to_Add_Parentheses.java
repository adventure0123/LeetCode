package com.LeetCode;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Different_Ways_to_Add_Parentheses {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> numbers=new LinkedList<>();
		List<Character> ops=new LinkedList<>();
		int length=input.length();
		StringBuffer n=new StringBuffer();
		for(int i=0;i<length;i++){
			if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
				n.append(input.charAt(i));
			}else{
				numbers.add(Integer.parseInt(n.toString()));
				ops.add(input.charAt(i));
				n=new StringBuffer();
			}
		}
		numbers.add(Integer.parseInt(n.toString()));
		List<Integer> result=dfs(numbers, ops);
	    Collections.sort(result);
		return result;
        
    }
	
	private List<Integer> dfs(List<Integer> numbers,List<Character> ops){
		List<Integer> res=new LinkedList<>();
		if(numbers.size()==1){
			res.add(numbers.get(0));
			return res;
		}
		int size=ops.size();
		for(int i=0;i<size;i++){
			char c=ops.get(i);
			List<Integer> left=dfs(numbers.subList(0, i+1), ops.subList(0, i));
			List<Integer> right=dfs(numbers.subList(i+1,numbers.size()), 
					ops.subList(i+1, ops.size()));
			for(int l:left){
				for(int r:right){
					res.add(op(l, r, c));
				}
			}
		}
		return res;
	}
	
	private int op(int a,int b,Character op){
		switch (op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		default:
			break;
		}
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Different_Ways_to_Add_Parentheses test=new Different_Ways_to_Add_Parentheses();
		String s="2*3-4*5";
		System.out.println(test.diffWaysToCompute(s).toString());
	}

}
