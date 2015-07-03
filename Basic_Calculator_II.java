package com.LeetCode;

import java.util.Stack;

public class Basic_Calculator_II {
	public int calculate(String s) {
		s=s.trim();
		Stack<Integer> stack = new Stack<>();
		int length = s.length();
		int temp = 0;
		char option=' ';
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				temp = temp * 10 + s.charAt(i) - '0';
			} 
			if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')||i==length-1) {
				switch (option) {
				case '+':
					stack.add(temp);
					break;
				case '-':
					stack.add(temp * -1);
					break;
				case '*':
					stack.add(stack.pop()*temp);
					break;
				case '/':
					stack.add(stack.pop()/temp);
					break;
				default:
					stack.add(temp);
					break;
				}
				option=s.charAt(i);
				temp=0;
			}
		}
		int result = 0;
		for (int i = 0; i < stack.size(); i++) {
			result += stack.get(i);
		}
		return result;

	}

	public static void main(String[] args) {
		Basic_Calculator_II test = new Basic_Calculator_II();
		String A = "1";
		System.out.println(test.calculate(A));
	}
}
