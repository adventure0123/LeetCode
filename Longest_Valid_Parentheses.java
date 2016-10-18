

import java.util.Stack;

public class Longest_Valid_Parentheses {
	public int longestValidParentheses(String s) {
		int length = s.length();
		if (length == 0) {
			return 0;
		}
		Stack<Integer> stack = new Stack<>();
		boolean[] A = new boolean[length];
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.add(i);
			} else {
				if (stack.isEmpty()) {
					stack.add(i);
				} else {
					int temp = stack.peek();
					if (s.charAt(temp) == '(') {
						A[i] = true;
						A[temp] = true;
						stack.pop();
					}
				}
			}
		}
		int temp = 0;
		int max = 0;
		for (int i = 0; i < length; i++) {
			if (A[i]) {
				temp++;
				if (temp > max) {
					max = temp;
				}
			} else {
				temp = 0;
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Valid_Parentheses test = new Longest_Valid_Parentheses();
		System.out.println(test.longestValidParentheses("(()"));
	}

}
